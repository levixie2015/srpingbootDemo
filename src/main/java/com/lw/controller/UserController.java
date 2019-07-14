package com.lw.controller;

import com.alibaba.fastjson.JSON;
import com.lw.mapper.AccountSituationMapper;
import com.lw.entity.FundAccountSituationEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@Slf4j
public class UserController {
    @Autowired
    private AccountSituationMapper dao;


    @RequestMapping(value = "/getList")
    public List<FundAccountSituationEntity> getList() {
        List<FundAccountSituationEntity> list = dao.getList(null);
        log.info("getList.get(0)={}", JSON.toJSONString(list.get(0)));
        return list;
    }
}
