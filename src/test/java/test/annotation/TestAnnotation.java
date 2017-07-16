package test.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.annotation.service.AnnotationService;

/**
 * Created by hanchunyang on 2017/7/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class TestAnnotation {

    @Autowired
    private AnnotationService service;
    @Test
    public void testAnnotation(){
        service.testAnnotation();
    }
}
