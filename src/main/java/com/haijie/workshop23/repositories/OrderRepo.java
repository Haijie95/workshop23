package com.haijie.workshop23.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.haijie.workshop23.models.Order;
import static com.haijie.workshop23.Constants.*;

@Repository
public class OrderRepo {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Order getTotalPrice(int id){
        return jdbcTemplate.queryForObject(selectSQL,BeanPropertyRowMapper.newInstance(Order.class),id);
    }

}
