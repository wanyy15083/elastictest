package com.frotly.job.simple;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.frotly.job.mapper.TestUserMapper;
import com.frotly.job.model.TestUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by songyigui on 2018/4/18.
 */
public class TestUserJob implements SimpleJob {
    private static final Logger logger = LoggerFactory.getLogger(TestUserJob.class);

    @Autowired
    private TestUserMapper testUserMapper;

    @Override
    public void execute(ShardingContext shardingContext) {
        logger.info("testUserJob execute: shardingContext: {}", shardingContext);
        TestUser user = new TestUser(null, "frotly", shardingContext.getShardingParameter(), 18, "123456", 1);
        testUserMapper.insert(user);
    }
}
