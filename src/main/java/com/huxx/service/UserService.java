package com.huxx.service;

import com.huxx.dao.UserDao;
import com.huxx.vo.*;
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

    public void addscholar(ScholarshipVo scholarshipVo){
        userDao.addscholar(scholarshipVo);
    }
    public void addtraining(TrainingVo trainingVo){
        userDao.addtraining(trainingVo);
    }
    public void addcareer(CareerVo careerVo){
        userDao.addcareer(careerVo);
    }
    public void addlicence(LicenceVo licenceVo){
        userDao.addlicence(licenceVo);
    }
    public void addafterservice(AfterServiceVo afterServiceVo){
        userDao.addafterservice(afterServiceVo);
    }

    public List<UserVo> getUserInfo(){
        return userDao.getUserInfo();
    }

    public void add(UsersVo usersVo) {
        userDao.add(usersVo);
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
