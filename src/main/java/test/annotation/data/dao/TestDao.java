package test.annotation.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import test.annotation.data.mapper.TestMapper;

/**
 * Created by hanchunyang on 2017/7/16.
 */
@Repository
public class TestDao {

    @Autowired
    private TestMapper testMapper;

    public void testInsert(String test) {
        testMapper.testInsert(test);
    }
}
