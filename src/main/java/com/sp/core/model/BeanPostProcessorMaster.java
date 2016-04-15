package com.sp.core.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorMaster implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("BEFORE BEAN INITIALIZATION");
		System.out.println(bean);
		if("master".equals(beanName)){
			Master master=(Master)bean;
			master.setName(master.getName().toUpperCase());
		}
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("AFTER BEAN INITIALIZATION");
		System.out.println(bean);
		return bean;
	}

}
