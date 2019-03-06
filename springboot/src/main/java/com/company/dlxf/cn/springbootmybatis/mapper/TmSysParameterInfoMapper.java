package com.company.dlxf.cn.springbootmybatis.mapper;

import com.company.dlxf.cn.springbootmybatis.model.TmSysParameterInfo;

public interface TmSysParameterInfoMapper {
    int deleteByPrimaryKey(String parameterId);

    int insert(TmSysParameterInfo record);

    int insertSelective(TmSysParameterInfo record);

    TmSysParameterInfo selectByPrimaryKey(String parameterId);

    int updateByPrimaryKeySelective(TmSysParameterInfo record);

    int updateByPrimaryKey(TmSysParameterInfo record);
}