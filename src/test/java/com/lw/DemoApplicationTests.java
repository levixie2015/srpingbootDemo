package com.lw;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    DataSourceProperties dataSourceProperties;
    @Autowired
    ApplicationContext applicationContext;
    @Resource(name = "myqlDataSource")
    private DataSource mysqlDataSource;

    @Test
    public void contextLoads() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(mysqlDataSource);
        List<?> resultList = jdbcTemplate.queryForList("select * from t_fa_account_situation");
        System.out.println("====" + JSON.toJSONString(resultList.get(0)));
    }
}
