package com.zhou.springcrud.mapper;

import com.zhou.springcrud.domian.Projectdetail;
import com.zhou.springcrud.domian.ProjectdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectdetailMapper {
    int countByExample(ProjectdetailExample example);

    int deleteByExample(ProjectdetailExample example);

    int deleteByPrimaryKey(Integer projectdetailId);

    int insert(Projectdetail record);

    int insertSelective(Projectdetail record);

    List<Projectdetail> selectByExampleWithBLOBs(ProjectdetailExample example);

    List<Projectdetail> selectByExample(ProjectdetailExample example);

    Projectdetail selectByPrimaryKey(Integer projectdetailId);

    int updateByExampleSelective(@Param("record") Projectdetail record, @Param("example") ProjectdetailExample example);

    int updateByExampleWithBLOBs(@Param("record") Projectdetail record, @Param("example") ProjectdetailExample example);

    int updateByExample(@Param("record") Projectdetail record, @Param("example") ProjectdetailExample example);

    int updateByPrimaryKeySelective(Projectdetail record);

    int updateByPrimaryKeyWithBLOBs(Projectdetail record);

    int updateByPrimaryKey(Projectdetail record);
}