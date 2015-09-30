package com.akolov;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {InjectingExternalizedValuesTestConfiguration.class})
public class InjectingExternalizedValuesTest {


    @Value("${parameter1}")
    private String parameter1;

    @Test
    public void testPropertyFileValues() {
        Assert.assertEquals("value1", parameter1);
    }

    @Value("#{environment.PATH}")
    private String path;

    @Test
    public void testEnvValues() {
        Assert.assertNotNull(path);
        Assert.assertTrue(path.length() > 1);
    }



}
