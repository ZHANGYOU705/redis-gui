package cn.zhangyou705.redis.gui.framework.factory;

import cn.zhangyou705.redis.gui.framework.common.ConSts;
import cn.zhangyou705.redis.gui.framework.exception.ServerException;
import cn.zhangyou705.redis.gui.service.RedisOperations;
import cn.zhangyou705.redis.gui.service.impl.RedisOperationsForHashImpl;
import cn.zhangyou705.redis.gui.service.impl.RedisOperationsForListImpl;
import cn.zhangyou705.redis.gui.service.impl.RedisOperationsForSetImpl;
import cn.zhangyou705.redis.gui.service.impl.RedisOperationsForStringImpl;
import cn.zhangyou705.redis.gui.service.impl.RedisOperationsForZSetImpl;
import cn.zhangyou705.redis.gui.service.impl.*;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
public class RedisOperationsFactory {

    public static RedisOperations build(String type) {
        if (ConSts.STRIGN.equals(type)) {

            return new RedisOperationsForStringImpl();
        } else if (ConSts.LIST.equals(type)) {

            return new RedisOperationsForListImpl();
        } else if (ConSts.HASH.equals(type)) {

            return new RedisOperationsForHashImpl();
        } else if (ConSts.SET.equals(type)) {

            return new RedisOperationsForSetImpl();
        } else if (ConSts.ZSET.equals(type)) {

            return new RedisOperationsForZSetImpl();
        } else {
            throw new ServerException("非法的操作");
        }
    }
}
