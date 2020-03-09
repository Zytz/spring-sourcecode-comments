package com.john.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author:wenwei
 * @date:2020/03/01
 * @description:
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("MyBeanPostProcessor constructor");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("johnBean".equalsIgnoreCase(beanName)){
			System.out.println("postProcessBeforeInitialization");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if("johnBean".equalsIgnoreCase(beanName)){
			System.out.println("postProcessBeforeInitialization");
		}
		return bean;
	}
}
