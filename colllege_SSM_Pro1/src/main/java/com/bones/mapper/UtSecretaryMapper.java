package com.bones.mapper;

import com.bones.pojo.UtSecretary;
import com.bones.pojo.UtSecretaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UtSecretaryMapper {
    long countByExample(UtSecretaryExample example);

    int deleteByExample(UtSecretaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(UtSecretary record);

    int insertSelective(UtSecretary record);

    List<UtSecretary> selectByExample(UtSecretaryExample example);

    UtSecretary selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UtSecretary record, @Param("example") UtSecretaryExample example);

    int updateByExample(@Param("record") UtSecretary record, @Param("example") UtSecretaryExample example);

    int updateByPrimaryKeySelective(UtSecretary record);

    int updateByPrimaryKey(UtSecretary record);
}