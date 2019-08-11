package com.zhaozs.dao;

import com.zhaozs.entity.ClassName;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/4/3
 * @ 描述
 */
public interface CLassNameDao {

    // 批量添加
    void insertBatchClass(List<ClassName> classNamems);

    // 批量删除
    void deleteBatchClassName(List<ClassName> classNamems);

    // 批量修改
    void updateBatchClassName(List<ClassName> classNames);

    // 查详情
    ClassName selectByIdClassName(BigDecimal id);

    // 查所有
    List<ClassName> selectAllClassName(@Param("className") String className,
                                       @Param("isDelete") Integer isDelete);
}
