package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/brand")
//@Controller
//组合注解@Controller @ResponseBody 会对该类的所有方法生效
@RestController
public class BrandController {

    //从注册查询brandService对应的地址的代理对象
    @Reference
    private BrandService brandService;

    /**
     * 获取品牌列表
     * @return 品牌列表
     */
//    @ResponseBody
//    @RequestMapping(value="/findAll", method = RequestMethod.GET)
    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }
}
