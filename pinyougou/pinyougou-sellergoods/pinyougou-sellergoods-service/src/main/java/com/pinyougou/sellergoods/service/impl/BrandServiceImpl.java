package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 暴露服务
 * 也就是在注册中心注册服务名称
 */
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<TbBrand> queryAll() {
        return brandMapper.queryAll();
    }
}
