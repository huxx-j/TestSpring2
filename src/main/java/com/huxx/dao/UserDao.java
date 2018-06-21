package com.huxx.dao;

import com.huxx.vo.CateVo;
import com.huxx.vo.UserVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    SqlSession sqlSession;

    public void add(UserVo userVo) {
        sqlSession.insert("user.add", userVo);
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
