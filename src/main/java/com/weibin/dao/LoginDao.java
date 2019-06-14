package com.weibin.dao;

import java.sql.*;

import com.weibin.bean.Login;

public class LoginDao {
	public int login(Login login)
	{
		String URL = "jdbc:mysql://localhost:3306/ssm_crud";
		String USERNAME = "root";
		String PWD = "123456";
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null ; 
		try {
			// a.导入驱动，加载具体的驱动类
			Class.forName("com.mysql.jdbc.Driver");// 加载具体的驱动类
			// b.与数据库建立连接
			connection = DriverManager.getConnection(URL, USERNAME, PWD);
			// c.发送sql，执行(【查】)
			stmt = connection.createStatement();
			String sql = "select count(*) from login where uname='"+login.getName()+"' and upwd ='"+login.getPwd()+"' " ;
			rs = stmt.executeQuery(sql); // 返回值表示 增删改 几条数据
			// d.处理结果
			int count = -1;
			if(rs.next()) {
				count = rs.getInt(1) ;
			}
			return count ;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return -1 ;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1 ;
		} catch(Exception e) {
			e.printStackTrace();
			return -1 ;
		}
		finally {
			try {
				if(rs!=null) rs.close(); 
				 if(stmt!=null) stmt.close();// 对象.方法
				 if(connection!=null)connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
