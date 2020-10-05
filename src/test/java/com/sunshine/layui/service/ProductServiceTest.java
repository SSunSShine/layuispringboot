package com.sunshine.layui.service;

import com.sunshine.layui.vo.BarVO;
import com.sunshine.layui.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void findData(){
        BarVO barVO = productService.getBarVO();
        System.out.println(barVO);
    }
}