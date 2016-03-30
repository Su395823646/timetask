package com.su.timetask.mapper;

import com.su.timetask.dao.domain.TotalRoute;

public interface TotalRouteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TotalRoute record);

    int insertSelective(TotalRoute record);

    TotalRoute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TotalRoute record);

    int updateByPrimaryKey(TotalRoute record);
}