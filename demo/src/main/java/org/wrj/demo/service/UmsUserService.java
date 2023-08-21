package org.wrj.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.wrj.entity.UmsUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Alvin
 * @since 2023-08-08 04:05:28
 */
public interface UmsUserService extends IService<UmsUser> {
     Page<UmsUser> selectPage();
}
