package tn.esprit.spring.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

// You need to import the User class if it's in a different package. 
// If it's in the tn.esprit.spring.services package, you won't need to import it.

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserServiceImplTest {

    @Autowired
    IUserService us;

    @Test
    @Order(1)
    public void testRetrieveAllUsers() {
        List<User> listUsers = us.retrieveAllUsers();
        Assertions.assertEquals(0, listUsers.size());
    }
}
