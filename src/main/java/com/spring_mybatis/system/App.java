package com.spring_mybatis.system;

import java.util.Scanner;

import org.springframework.batch.core.configuration.support.ClasspathXmlApplicationContextsFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_mybatis.system.dao.BaseDao;
import com.spring_mybatis.system.model.Film;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
       ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
       context.start();
        BaseDao baseDao=(BaseDao) context.getBean("BaseDao");
        Film film=new Film();
        System.out.println("请输入电影名称（title）：");
        film.setTitle(scanner.nextLine());
        System.out.println("请输入电影描述（description）：");
        film.setDescription(scanner.nextLine());
        System.out.println("请输入语言ID（language_id）：");
        film.setLanguage_id(scanner.nextLine());
        baseDao.addFilm(film);
        context.stop();
    }
}
