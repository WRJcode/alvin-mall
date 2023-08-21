package org.wrj.demo.service.impl;

import org.wrj.entity.Product;
import org.wrj.mapper.ProductMapper;
import org.wrj.demo.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Alvin
 * @since 2023-08-08 03:09:05
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
