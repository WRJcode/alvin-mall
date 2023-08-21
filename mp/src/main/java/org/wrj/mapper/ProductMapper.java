package org.wrj.mapper;

import org.wrj.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Alvin
 * @since 2023-08-08 03:09:05
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
