package org.wrj.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.wrj.entity.UmsUser;
import org.wrj.mapper.UmsUserMapper;
import org.wrj.demo.service.UmsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Alvin
 * @since 2023-08-08 04:05:28
 */
@Service
public class UmsUserServiceImpl extends ServiceImpl<UmsUserMapper, UmsUser> implements UmsUserService {

    @Autowired
    UmsUserMapper umsUserMapper;

    @Override
    public Page<UmsUser> selectPage() {
        Page<UmsUser> rowPage = new Page<>(3,10);

        LambdaQueryWrapper<UmsUser> queryWrapper = new LambdaQueryWrapper<>();
        rowPage = umsUserMapper.selectPage(rowPage,queryWrapper);

        return rowPage;
    }
}
