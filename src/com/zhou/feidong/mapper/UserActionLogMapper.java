package com.zhou.feidong.mapper;

import com.zhou.feidong.domian.UserActionLog;
import com.zhou.feidong.domian.UserActionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserActionLogMapper {
    int countByExample(UserActionLogExample example);

    int deleteByExample(UserActionLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserActionLog record);

    int insertSelective(UserActionLog record);

    List<UserActionLog> selectByExample(UserActionLogExample example);

    UserActionLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserActionLog record, @Param("example") UserActionLogExample example);

    int updateByExample(@Param("record") UserActionLog record, @Param("example") UserActionLogExample example);

    int updateByPrimaryKeySelective(UserActionLog record);

    int updateByPrimaryKey(UserActionLog record);
}