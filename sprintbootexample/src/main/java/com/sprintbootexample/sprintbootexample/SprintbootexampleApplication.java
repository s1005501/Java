package com.sprintbootexample.sprintbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Builder;

// 在spring boot裡@註解都是有意義的且有功能，比如@SpringBootApplication就是告知spring boot它是專案啟動的主程式
@SpringBootApplication
public class SprintbootexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintbootexampleApplication.class, args);
	}
}

// // 專案啟動主程式固定寫法
// @SpringBootApplication
// public class 專案名稱Application{
// public static void main(String[] args) {
// SpringApplication.run(專案名稱Application.class, args);
// }
// }


