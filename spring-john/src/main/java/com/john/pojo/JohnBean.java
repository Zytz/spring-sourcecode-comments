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

public class JohnBean implements InitializingBean {
	@Autowired
	private ShuyunBean shuyunBean;


	public void setShuyunBean(ShuyunBean shuyunBean) {
		this.shuyunBean = shuyunBean;
	}

	public JohnBean() {
		System.out.println("JohnBean constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("johnBean afterPropertiesSet");
	}
}
