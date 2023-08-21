package org.wrj.demo.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.wrj.common.config.BaseRedisConfig;

@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {
}
