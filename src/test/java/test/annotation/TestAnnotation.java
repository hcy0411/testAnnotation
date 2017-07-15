package test.annotation;

import org.junit.Test;

/**
 * Created by hanchunyang on 2017/7/11.
 */
public class TestAnnotation {
    @Test
    @test.annotation.annotation.TestAnnotation()
    public void testAnnotation(){
        System.out.println("true");
    }
}
