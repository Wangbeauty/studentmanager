package com.wangbeauty.studentmanager;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages = {"com.wangbeauty.studentmanager"})
//@ActiveProfiles("unittest")
@SpringBootTest
public abstract class BaseSpringBootTest {

}
