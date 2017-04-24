package com.hsyd.controller;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eding-00 on 2017/4/21.
 */
@Controller
public class Test {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @RequestMapping("/index")
    @ResponseBody
    public Object test(HttpServletResponse response)throws Exception{
        response.setContentType("text/html;charset=utf-8");
        Connection conn = sqlSessionFactory.openSession().getConnection();
      PreparedStatement  ps = conn.prepareStatement("show TABLES");
        ResultSet rs = ps.executeQuery();
        List<String> list = new ArrayList<>();
        while(rs.next()){
            list.add(rs.getString(1));
        }
        rs.close();
        ps.close();
        conn.close();

       return list;
    }

}
