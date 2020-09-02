package cn.husky.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;

@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 获取String类型value
     * @param key
     * @return
     */
    public String getStringValue(String key){
        return key==null?null:stringRedisTemplate.opsForValue().get(key);
    }

    /**
     * 获取value
     * @param key
     * @return
     */
    public Object getValue(String key){
        return key==null?null:redisTemplate.opsForValue().get(key);
    }

    /**
     * 放置String类型value
     * @param key
     * @param value
     */
    public void setStringValue(String key, String value){
        stringRedisTemplate.opsForValue().set(key, value);
    }

    /**
     * 放置Object类型value
     * @param key
     * @param value
     */
    public void setValue(String key, Object value){
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 判断是否有key
     * @param key
     * @return
     */
    public boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }

    /**
     * 删除数据
     * @param keys
     */
    public void delete(String... keys){
        if(keys != null && keys.length > 0){
            if(keys.length==1){
                redisTemplate.delete(keys[0]);
            }else{
                redisTemplate.delete(CollectionUtils.arrayToList(keys));
            }
        }
    }

}
