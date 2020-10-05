package com.sunshine.layui.controller;

import com.sunshine.layui.mapper.ProductMapper;
import com.sunshine.layui.service.ProductService;
import com.sunshine.layui.vo.BarVO;
import com.sunshine.layui.vo.DataVO;
import com.sunshine.layui.vo.PieVO;
import com.sunshine.layui.vo.ProductBarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("/list")
    public DataVO list(Integer page, Integer limit){
        return  productService.findData(page, limit);
    }

    @RequestMapping("/barVO")
    public BarVO getBarVO(){
        return productService.getBarVO();
    }

    @RequestMapping("/pieVO")
    public List<PieVO> getPieVO(){
        return productService.getPieVO();
    }

//    @RequestMapping("/pieVO")
//    public List<ProductBarVO> getPieVO(){
//        return productMapper.findAllProductBarVO();
//    }
}
