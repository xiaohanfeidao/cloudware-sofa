package com.sheng.cook4j.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.sheng.cook4j.data.SofaData;
import com.sheng.cook4j.facade.SofaTestFacade;
import com.sheng.cook4j.facade.SofaTestFacade2;
import com.sheng.cook4j.facade.SofaTestFacade3;

@SofaService(interfaceType = SofaTestFacade2.class,
	bindings = {
			// @SofaServiceBinding(bindingType = "bolt"),
			@SofaServiceBinding(bindingType = "rest")})

//@SofaService(interfaceType = SofaTestFacade.class,
//	bindings = {@SofaServiceBinding(bindingType = "rest")})
@Component
public class SofaTestService implements SofaTestFacade2 {
	
	private static final Logger log = LoggerFactory.getLogger(SofaTestService.class);
	
	@SofaReference(interfaceType = SofaTestFacade3.class,
			binding = @SofaReferenceBinding(bindingType = "rest"))
	private SofaTestFacade3 sofaTestRestFacade;
	
	@Override
	public SofaData doSofa(Long id, String name, String desc) {

		return sofaTestRestFacade.doSofa(id, name, desc);
	}

	@Override
	public int doSofa(SofaData data) {
		log.info("params is {}", data);
		return 200;
	}

}
