package com.subu2code.expenses_tracker.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.subu2code.expenses_tracker.config")
@PropertySource("classpath:application.properties")
public class SpringHibernateConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		System.out.println("Inside the SessionFactory Bean");
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setHibernateProperties(hibernateProperties());
		sessionFactory.setPackagesToScan("com.subu2code.expenses_tracker.entity");
		return sessionFactory;
	}
	
	@Bean
	public DataSource dataSource()
	{
		System.out.println("Inside The Datasource Bean");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
		return dataSource;
	}
	
	@Bean
	public Properties hibernateProperties()
	{
		System.out.println("Inside the Hibernate properties Bean");
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.setProperty("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		properties.setProperty("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
		return properties;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
	{
		System.out.println("Inside the Transaction Manager Bean");
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
	}
	
	/*This function is used to test our PROPERTIE FILE */
	@Bean
	public void testPropertieFile()
	{
		System.out.println("Inside the Propertie File Test Function \n");
		System.out.println(environment.getRequiredProperty("jdbc.driverClassName"));
		System.out.println(environment.getRequiredProperty("jdbc.url"));
		System.out.println(environment.getRequiredProperty("jdbc.username"));
		System.out.println(environment.getRequiredProperty("jdbc.password"));
		System.out.println(environment.getRequiredProperty("hibernate.dialect"));
		System.out.println(environment.getRequiredProperty("hibernate.show_sql"));
		System.out.println(environment.getRequiredProperty("hibernate.format_sql"));
		System.out.println();
	}
	
	/*This function is used to test our JDBC Connection*/
	@Bean
	public static void testConnection()
	{
		Connection connection = null;
		System.out.println("\nTest Connection Started to \n URL : jdbc:mysql://localhost:3306/expense_tracker_schema?useSSL=false \n Status:Connecting....");
		try{
		   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/expense_tracker_schema?useSSL=false", "expensetracker", "expensetracker");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		if(connection!=null)
		{
			try{
			connection.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			System.out.println(" Status:Connected\n");
		}
	}
}
