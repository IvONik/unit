package HW3;





import java.util.ArrayList;
import java.util.List;
//Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов.
// Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами.
// Протестируйте данную функцию.
public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public List<User> outAuth(List<User> data){
        List<User> result = new ArrayList<>();
        for ( User user : data){
            if( user.isAdmin == true){
                result.add(user);
            }
        }
        return result;
    }

}