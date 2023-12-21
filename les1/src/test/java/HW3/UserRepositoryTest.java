package HW3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void addUser() {
        UserRepository repo = new UserRepository();

        User user = new User("Alex", "dfsf", true);
        List<User> data = new ArrayList<>();
        data.add(user);
        assertEquals(1, data.size());
    }

    @Test
    void findByName() {
    }

    @Test
    void outAuth() {
        UserRepository repo = new UserRepository();
        List<User> data = new ArrayList<>();

        User user1 = new User("Alex", "dfsf", true);
        User user2 = new User("Alex", "dfsf", false);
        User user3 = new User("Alex", "dfsf", false);

        data.add(user1);
        data.add(user2);
        data.add(user3);

        assertEquals(1, repo.outAuth(data).size());
    }
}