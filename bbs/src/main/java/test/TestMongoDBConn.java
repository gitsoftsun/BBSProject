package test;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.data.mongodb.core.MongoOperations;

import dao.BaseDao;


public class TestMongoDBConn {
	static Logger logger = Logger.getLogger(TestMongoDBConn.class);
	@Test
	public void test() {
		BaseDao baseDao = new BaseDao();
		MongoOperations mongoOperations = baseDao.connMongoDB();
		for(String str:mongoOperations.getCollectionNames())
			logger.info(str);
	}

}
