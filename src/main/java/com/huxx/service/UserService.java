package com.huxx.service;

import com.huxx.dao.UserDao;
import com.huxx.vo.CateVo;
import com.huxx.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<UserVo> getUserInfo(){
        return userDao.getUserInfo();
    }

    public void add(UserVo userVo) {
        userDao.add(userVo);
    }

    public UserVo get(UserVo userVo) {
        return userDao.get(userVo);
    }

    public List<CateVo> cate() {
        return userDao.cate();
    }

    public int update(String enrolledOrder, String standbyOrder) {
        int result = 0;
        String[] enrolledOrderArray = enrolledOrder.split(",");
        String[] standbyOrderArray = standbyOrder.split(",");

        for (int i = 0; i < standbyOrderArray.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("title", standbyOrderArray[i]);
            map.put("cateorder", i);

            result += userDao.standbyUpdate(map);
        }

        for (int i = 0; i < enrolledOrderArray.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("title", enrolledOrderArray[i]);
            map.put("cateorder", i);

            result += userDao.enrolledUpdate(map);
        }

        return result;
    }

    public int addCate(String title) {
        return userDao.addCate(title);
    }
}
