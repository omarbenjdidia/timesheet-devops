import org.junit jupiter.api-Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.lest;
import org.junit.jupiter.api.Test MethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserServicelmplTest {

@Autowired
IUserService us;

@Test
@Order(1)
public void testRetrieveAllUsers() {
List<User> listUsers = us.retrieveAllUsers();
Assertions.assertEquals(0, listUsers.size());

}

 }
