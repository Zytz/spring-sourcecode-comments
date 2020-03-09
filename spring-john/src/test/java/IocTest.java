import com.john.pojo.JohnBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:wenwei
 * @date:2020/03/01
 * @description:
 */
public class IocTest {
	@Test
	public void test(){
		//applicationContext是容器的高级接口，Beanfactory(顶级容器，规范了容器的基础行为)
		//Spring应用上下文，官方称之为Ioc容器，（错误的认识：容器就是map），准确来说是,mao是IOC的一个成员
		//叫做单例池，singletonObjects，容器是一组组件和过程的集合，包括了Beanfactory、单例池、beanpostprocessor等之间的写作
		//


		/***
		 * Ioc容器是有生命周期的 每个生命周期的时间端都需要调用一些方法；
		 *
		 * 1: bean 构造器执行、初始化执行 ,bean后置处理器的before方法、after： org.springframework.context.support.AbstractApplicationContext#refresh#finishBeanFactoryInitialization()
		 * 2: beanfacotry (bean工厂)后置处理器初始化 方法执行,org.springframework.context.support.AbstractApplicationContext #refresh#invokeBeanFactoryPostProcessors()
		 * 3: bean后置处理器初始化 org.springframework.context.support.AbstractApplicationContextAbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
		 */

//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		Object johnBean = classPathXmlApplicationContext.getBean("johnBean");
//		System.out.println(johnBean);

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.john.pojo");
		JohnBean bean = annotationConfigApplicationContext.getBean(JohnBean.class);
		System.out.println(bean);
	}
}
