package com.lw.mapper;

import com.lw.entity.FundAccountSituationEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface AccountSituationMapper {
    List<FundAccountSituationEntity> getList(FundAccountSituationEntity query);
}
