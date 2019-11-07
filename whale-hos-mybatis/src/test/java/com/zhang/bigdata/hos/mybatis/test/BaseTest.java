package com.zhang.bigdata.hos.mybatis.test;


import com.zhang.bigdata.hos.mybatis.HosDataSourceConfig;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@PropertySource("classpath:application.properties")
@Import(HosDataSourceConfig.class)
@ComponentScan("com.zhang.bigdata.hos.*")
@MapperScan("com.zhang.bigdata.hos.*")
public class BaseTest {


}
