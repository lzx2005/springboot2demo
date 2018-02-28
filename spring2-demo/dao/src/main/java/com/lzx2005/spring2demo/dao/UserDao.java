package com.lzx2005.spring2demo.dao;

import com.lzx2005.spring2demo.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Lizhengxian on 2018/2/28.
 */
@Service
public class UserDao {

    private final ConcurrentMap map = new ConcurrentHashMap();

    private AtomicInteger atomicInteger = new AtomicInteger(1);

    public boolean create(User user) {
        int id = atomicInteger.incrementAndGet();
        user.setId(id);
        return map.put(id, user) == null;
    }


    public Collection getAll(){
        return map.values();
    }
}
