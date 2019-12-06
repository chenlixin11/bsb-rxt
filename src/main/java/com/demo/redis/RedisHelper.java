package com.demo.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class RedisHelper {

    private Jedis jedis;

    public static void main(String[] args) {
        RedisHelper redisHelper = new RedisHelper();
        redisHelper.testString();
        redisHelper.testHash();
        redisHelper.testList();
        //redisHelper.testSet();
        //redisHelper.testZSet();
    }

    public RedisHelper() {
        jedis = new Jedis("localhost");
        //jedis.auth("123456");
    }

    public void testString(){
        String result = jedis.set("java", "bb");
      jedis.set("yi", "bb");
        String value = jedis.get("java");
        System.out.println(result);
        System.out.println(value);
    }

    public void testHash(){
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("field1","value1");
        hashMap.put("field2","value2");
        hashMap.put("field3","value3");

        String result = jedis.hmset("myhash",hashMap);
        System.out.println(result);

        String value = jedis.hget("myhash", "field1");
        System.out.println(value);

        Map<String, String> myHash = jedis.hgetAll("myhash");
        Set<Map.Entry<String, String>> entries = myHash.entrySet();
        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey()+"==>" + entry.getValue());
        }

    }

    public void testList(){
        Long lpush = jedis.lpush("mylist", "java", "c", "c++", "php", "python", "scala");
        System.out.println(lpush);

        List<String> myList = jedis.lrange("mylist",0,10);
        for (String str : myList) {
            System.out.println(str);
        }
    }

    public void testSet(){
        Long sadd = jedis.sadd("myset", "zookeeper", "hadoop", "hive", "hbase", "spark");
        System.out.println(sadd);

        Set<String> mySet = jedis.smembers("myset");
        for (String str : mySet) {
            System.out.println(str);
        }

    }

    public void testZSet(){
        jedis.zadd("myzset",0,"zookeeper");
        jedis.zadd("myzset",5,"hadoop");
        jedis.zadd("myzset",4,"hive");
        jedis.zadd("myzset",2,"hbase");
        jedis.zadd("myzset",6,"spark");

        Set<String> myZSet = jedis.zrange("myzset", 0, 10);
        //Set<String> myZSet = jedis.zrangeWithScores("myzset", 0, 10);
        for (String str : myZSet) {
            System.out.println(str);
        }

    }

}
