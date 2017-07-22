package test.annotation.data.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by hanchunyang on 2017/7/16.
 */
public interface TestMapper {

    void testInsert (@Param("test") String test);
}
