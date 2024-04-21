package com.springbootexample.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.Builder;

// 在spring boot裡@註解都是有意義的且有功能，比如@SpringBootApplication就是告知spring boot它是專案啟動的主程式

// 讓spring boot可以讀到主程式所在資料夾以外的code的方法，即自訂義掃描路徑，有兩種方式
// 第一種，是在@SpringBootApplication後面再加上參數，其值給scanBasePackages = "com.Group Id的名稱"
// @SpringBootApplication(scanBasePackages = "com.springbootexample")

// 第二種是透過@ComponentScan，一樣在後面再加上參數，其值給"com.Group Id的名稱"
// @ComponentScan("com.springbootexample")

@SpringBootApplication
public class SpringbootexampleApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SprintbootexampleApplication.class, args);
		var ioc = SpringApplication.run(SpringbootexampleApplication.class, args);

		// getBeanDefinitionNames獲取ioc容器內所有物件的name
		// dispatcherServlet、beanNameViewResolver、characterEncodingFilter
		String[] names = ioc.getBeanDefinitionNames();

		for (String name : names) {
			System.out.println(name);
		}
	}
}

// // 專案啟動主程式固定寫法
// @SpringBootApplication
// public class 專案名稱Application{
// public static void main(String[] args) {
// SpringApplication.run(專案名稱Application.class, args);
// }
// }
