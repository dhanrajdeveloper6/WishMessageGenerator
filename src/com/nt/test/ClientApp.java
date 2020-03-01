package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.WishGenerator;

public class ClientApp {
	public static void main(String[] args) {
		System.out.println("ClinetApp:main(-)");
		FileSystemResource res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		WishGenerator bean = factory.getBean("wsg",WishGenerator.class);
		
		String result = bean.generateWishMsg();
		System.out.println(result);
		
		
	}

}
