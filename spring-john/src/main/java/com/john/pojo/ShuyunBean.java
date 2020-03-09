package com.john.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:wenwei
 * @date:2020/03/01
 * @description:
 */
@Service
public class ShuyunBean implements InitializingBean {
	@Autowired
	private JohnBean johnBean;

	public void setJohnBean(JohnBean johnBean) {
		this.johnBean = johnBean;
	}

	public ShuyunBean() {
		System.out.println("ShuyunBean constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ShuyunBean afterPropertiesSet");
	}
}
