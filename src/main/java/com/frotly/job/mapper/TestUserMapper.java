package com.frotly.job.mapper;

import com.frotly.job.model.TestUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    List<TestUser> selectAll();

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);

    void selectIntoFile();

    List<TestUser> selectByAddress(@Param("address") String address, @Param("limit") int limit);
}