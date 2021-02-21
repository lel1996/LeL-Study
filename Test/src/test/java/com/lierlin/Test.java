package com.lierlin;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Test.class})
@ActiveProfiles("dev")
public class Test {
    @Autowired
    private TestBean testBean;

    @org.junit.Test
    public void test() {
        String content = testBean.getContent();
        Assert.assertEquals("dev", content);
    }
}
