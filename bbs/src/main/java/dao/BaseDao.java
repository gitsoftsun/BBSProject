package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

public class BaseDao {
	/**
	 * the method for return an mongooperations object to operate mongodb 
	 * @return mongoOperations
	 */
	public MongoOperations connMongoDB() {
		ApplicationContext applicationContext = new GenericXmlApplicationContext(
				"springmongoconfig.xml");
		MongoOperations mongoOperations = (MongoOperations) applicationContext
				.getBean("mongoTemplate");
		return mongoOperations;
	}
}
