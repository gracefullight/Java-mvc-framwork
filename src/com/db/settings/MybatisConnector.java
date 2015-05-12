package com.db.settings;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisConnector {
	
		private static SqlSessionFactory sqlSessionFactory;
		static	{	
			try{
				String resource = "com/db/settings/MybatisSettings.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				
				if(sqlSessionFactory ==null){
					sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}		
		}
		
		public static SqlSessionFactory getSqlSessionFactory(){
			return sqlSessionFactory;
		}

	}

