package com.frotly.job.dataflow;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.frotly.job.mapper.TestUserMapper;
import com.frotly.job.model.TestUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by songyigui on 2018/4/18.
 */
public class UpdateUserJob implements DataflowJob<TestUser> {
    private static final Logger logger = LoggerFactory.getLogger(UpdateUserJob.class);

    @Autowired
    private TestUserMapper testUserMapper;

    @Override
    public List<TestUser> fetchData(ShardingContext shardingContext) {
        logger.info("updateUserJob fetchData: shardingContext: {}", shardingContext);
        return testUserMapper.selectByAddress(shardingContext.getShardingParameter(), 2);
    }

    @Override
    public void processData(ShardingContext shardingContext, List<TestUser> data) {
        logger.info("updateUserJob processData: shardingContext: {}, data : {}", shardingContext, data);
        for (TestUser user : data) {
            TestUser tmp = new TestUser();
            tmp.setId(user.getId());
            tmp.setStatus(1);
            testUserMapper.updateByPrimaryKeySelective(tmp);
        }

    }
}
