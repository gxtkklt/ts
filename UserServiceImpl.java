package com.ts.biz;


import com.ts.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ts.biz.UserService;

import java.util.List;
import java.util.Map;

@Service("userservices")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public List<Map<String, Object>> queryList() {

        List<Map<String,Object>> list = userDao.queryList();

        return list;
    }

	//增加了一行注释
}
