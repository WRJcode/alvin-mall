package org.wrj.demo.controller;


import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wrj.common.api.CommonPage;
import org.wrj.common.api.CommonResult;
import org.wrj.common.service.RedisService;
import org.wrj.demo.service.ProductService;
import org.wrj.entity.Product;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Alvin
 * @since 2023-08-08 03:09:05
 */
@RestController
@RequestMapping("/test/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private RedisService redisService;

    //分页列表
    @GetMapping("/list")
    public CommonResult<CommonPage<Product>> getList(@RequestParam(value="pageSize",defaultValue = "1")Integer pageSize,
                                @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        List<Product> products = productService.list();
        //CommonPage<Product> productCommonPage = new CommonPage<>();

        return  CommonResult.success(CommonPage.restPage(products)) ;
    }

    //将一个浏览过的产品对象保存到redis
    @GetMapping("/history/{id}")
    public CommonResult<Product> productHistory(@PathVariable("id")int id){
            Product product = productService.getById(id);
            String key = "pms:productId:" + id;
            redisService.set(key,product);
            return CommonResult.success(product);
    }
}
