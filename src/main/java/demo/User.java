package demo;

public class User {
    public boolean login(String username, String password) {
        if("somsri".equals(username) &&
                "somsri2499".equals(password)) {
            return true;
        }
        return false;
    }
}
