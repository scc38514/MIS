import org.junit.Test;

import cn.edu.cumt.ec.dao.MassagesDaoJDBCImpl;
import cn.edu.cumt.ec.service.MassagesService;

import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Administrator' at '16-5-23 下午5:40' with Gradle 2.11
 *
 * @author Administrator, @date 16-5-23 下午5:40
 */
public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
    	MassagesDaoJDBCImpl massagesDaoJDBCImpl = new MassagesDaoJDBCImpl();
    	MassagesService massagesService=new MassagesService();
    	massagesService.setMassagesDao(massagesDaoJDBCImpl);
    	massagesService.update("qqq");
    	
    }
 
}