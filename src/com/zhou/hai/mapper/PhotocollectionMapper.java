package com.zhou.hai.mapper;

import com.zhou.hai.domain.Photocollection;
import com.zhou.hai.domain.PhotocollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotocollectionMapper {
    int countByExample(PhotocollectionExample example);

    int deleteByExample(PhotocollectionExample example);

    int deleteByPrimaryKey(Long photocollectionId);

    int insert(Photocollection record);

    int insertSelective(Photocollection record);

    List<Photocollection> selectByExample(PhotocollectionExample example);

    Photocollection selectByPrimaryKey(Long photocollectionId);

    int updateByExampleSelective(@Param("record") Photocollection record, @Param("example") PhotocollectionExample example);

    int updateByExample(@Param("record") Photocollection record, @Param("example") PhotocollectionExample example);

    int updateByPrimaryKeySelective(Photocollection record);

    int updateByPrimaryKey(Photocollection record);
}