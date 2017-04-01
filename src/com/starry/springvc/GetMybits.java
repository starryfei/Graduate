/*package com.starry.springvc;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.starry.entity.User;
s
public class GetMybits {
 public static void main(String[] args) {
		String resource = "conf.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			 SqlSession session = sqlSessionFactory.openSession();
			 String statement = "com.starry.entity.User.getId";//映射sql的标识字符串
		     //执行查询返回一个唯一user对象的sql
		     User user = session.selectOne(statement, 1);
		     System.out.println(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

*/