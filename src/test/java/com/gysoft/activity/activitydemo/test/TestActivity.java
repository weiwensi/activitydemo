package com.gysoft.activity.activitydemo.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestActivity {
@Autowired
    RepositoryService repositoryService;
    //流程部署
    @Autowired
  ProcessEngine processEngine;
    // 生成23张表
    @Test
    public void test(){
        System.out.println(processEngine);
    }

    @Test
    public void test1(){

        Deployment deploy =
                repositoryService.createDeployment().addClasspathResource("MyProcess.bpmn").deploy();
    }
}
