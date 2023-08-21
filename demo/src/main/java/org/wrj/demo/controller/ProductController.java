package org.wrj.demo.controller;


import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wrj.common.api.CommonPage;
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

    //分页列表
    @GetMapping("/list")
    public CommonPage<Product> getList(@RequestParam(value="pageSize",defaultValue = "1")Integer pageSize,
                              @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        List<Product> products = productService.list();
        //CommonPage<Product> productCommonPage = new CommonPage<>();
        return  CommonPage.restPage(products);
    }
}
