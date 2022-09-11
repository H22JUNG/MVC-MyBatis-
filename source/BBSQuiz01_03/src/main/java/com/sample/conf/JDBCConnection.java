package com.sample.conf;

import java.io.IOException;
import java.io.Reader;
 
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class JDBCConnection {
	public static SqlSessionFactory sqlSession;

    static {
        String resource = "com/sample/conf/configuration.xml";
        Reader reader;
        
        try {
            reader = Resources.getResourceAsReader( resource );
            sqlSession = new SqlSessionFactoryBuilder().build( reader );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static SqlSessionFactory getSqlSession() {
        return sqlSession;
    }
}
