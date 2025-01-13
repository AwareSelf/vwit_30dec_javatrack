package org.example;

import redis.clients.jedis.Jedis;

import java.util.*;
//https://www.tothenew.com/blog/redis-in-java-a-step-by-step-guide-to-get-started/#:~:text=To%20get%20started%20with%20Redis,the%20Redis%20Java%20client%20library.
/**
 * https://www.geeksforgeeks.org/complete-guide-to-redis-java/
 * *
 */
public class App 
{
    public static void main(String[] args )
    {

        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("message", "Hello, Redis!");
        String message = jedis.get("message");
        System.out.println(message);

        jedis.lpush("numbers", "1", "2", "3");
        List<String> numbers = jedis.lrange("numbers", 0, -1);
        System.out.println(numbers);

        // Set field-value pairs in a hash
        jedis.hset("user:1", "name", "Alice");
        jedis.hset("user:1", "age", "25");

        // Get field values from a hash
        String userName = jedis.hget("user:1", "name");
        String userAge = jedis.hget("user:1", "age");
        System.out.println("User: " + userName + ", Age: " + userAge);


        // Add items to a set
        jedis.sadd("tags", "java", "redis", "programming");

        // Get all items in a set
        Set<String> tags = jedis.smembers("tags");
        System.out.println("Tags: " + tags);

        jedis.close();
    }
}
