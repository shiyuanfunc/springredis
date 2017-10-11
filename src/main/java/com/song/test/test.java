package com.song.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by lenovo on 2017/10/11.
 */
public class test {

    @Test
    public void test() {

        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println(jedis);
    }
}
