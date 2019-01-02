package com.gysoft.activity.activitydemo;

import org.activiti.engine.ProcessEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivitydemoApplicationTests {
	@Autowired
	ProcessEngine processEngine ; //创建ProcessEngine对象，会自动创建25张流程框架的表

	@Test
	public void contextLoads() {
	}

	@Test
	public void test1() {
		System.out.println(processEngine);
	}
}

