package com.huxx.dao;

import com.huxx.vo.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    SqlSession sqlSession;

    public void addscholar(ScholarshipVo scholarshipVo){
        sqlSession.insert("scholar.addscholar", scholarshipVo);
    }

    public void addtraining(TrainingVo trainingVo){
        sqlSession.insert("training.addtraining", trainingVo);
    }

    public void addcareer(CareerVo careerVo){
        sqlSession.insert("career.addcareer", careerVo);
    }

    public void addlicence(LicenceVo licenceVo){
        sqlSession.insert("licence.addlicence", licenceVo);
    }

    public void addafterservice(AfterServiceVo afterServiceVo){
        sqlSession.insert("afterservice.addas", afterServiceVo);
    }

    public List<UserVo> getUserInfo(){
        return sqlSession.selectList("user.getAll");
    }

    public void add(UsersVo usersVo) {
        sqlSession.insert("users.add", usersVo);
    }

    public UserVo get(UserVo userVo) {
        return sqlSession.selectOne("user.get", userVo);
    }

    public List<CateVo> cate(){
        return sqlSession.selectList("cate.get");
    }

    public int enrolledUpdate(Map<String, Object> map) {
        return sqlSession.update("cate.enrollup", map);
    }

    public int standbyUpdate(Map<String, Object> map) {
        return sqlSession.update("cate.standup", map);
    }

    public int addCate(String title){
        return sqlSession.insert("cate.add", title);
    }
}
