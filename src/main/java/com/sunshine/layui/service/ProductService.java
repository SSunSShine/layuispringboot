package com.sunshine.layui.service;

import com.sunshine.layui.entity.Product;
import com.sunshine.layui.vo.BarVO;
import com.sunshine.layui.vo.DataVO;
import com.sunshine.layui.vo.PieVO;
import com.sunshine.layui.vo.ProductVO;

import javax.xml.crypto.Data;
import java.util.List;

public interface ProductService {
    public DataVO<ProductVO> findData(Integer page, Integer limit);
    public BarVO getBarVO();
    public List<PieVO> getPieVO();
}
