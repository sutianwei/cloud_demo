package com.awei.cloud.serviceimpl;


import com.awei.cloud.dao.UserMapper;
import com.awei.cloud.pojo.User;
import com.awei.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private   UserMapper userMapper;

    @Autowired
    private TransactionTemplate transactionTemplate;


//    public void tst() {
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//                try {
//                    //dothings
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    transactionStatus.setRollbackOnly();
//                }
//            }
//        });
//    }


    @Override
    public User loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }

    @Override
    public User queryUserById(String id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public int addUser(User user) {


        int aFlag = userMapper.insertUser(user);
        return aFlag;
    }

    @Override
    public int dropUser(String id) {
        int dFlag = userMapper.deleteUser(id);
        return dFlag;
    }

    @Override
    public int modifyUser(User user) {
        int mFlag = userMapper.updateUser(user);
        return mFlag;
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    @Scheduled(cron = " 0 43 22 * * ? ")
    public void schdule() {
        System.out.println(" test schdule " + System.currentTimeMillis());
    }
}
