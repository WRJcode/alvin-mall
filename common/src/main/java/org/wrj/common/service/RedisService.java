package org.wrj.common.service;

import java.util.List;

public interface RedisService {
    /**
     * 保存属性
     */
    void set(String key,Object value,long time);

    /**
     * 保存属性
     */
    void set(String key,Object value);

    /**
     * 获取属性
     */
    Object get(String key);

    /**
     * 删除属性
     */
    Boolean del(String key);

    /**
     * 批量删除属性
     */
    Long del(List<String> keys);

    /**
     * 设置过期时间
     */
    Boolean expire(String key,long time);

    /**
     * 获取过期时间
     */
    Boolean getExpire(String key);
}
