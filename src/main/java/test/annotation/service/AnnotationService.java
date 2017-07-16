package test.annotation.service;

import org.springframework.stereotype.Service;

/**
 * Created by hanchunyang on 2017/7/16.
 */
@Service
public class AnnotationService {

    @test.annotation.annotation.TestAnnotation
    public void testAnnotation() {
        System.out.println("true");
    }
}
