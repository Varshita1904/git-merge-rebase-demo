public class AuthService {
    public boolean login(String user, String password) {
        if(user == null || password == null) {
            return false;
        }
        return true;
    }
}
