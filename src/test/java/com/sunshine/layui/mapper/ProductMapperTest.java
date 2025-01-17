package com.sunshine.layui.mapper;

import com.sunshine.layui.vo.ProductBarVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductMapperTest {

    @Autowired
    private ProductMapper mapper;

    @Test
    void test(){
        mapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void test2(){
        List<ProductBarVO> list = mapper.findAllProductBarVO();
        System.out.println(list);
    }
}