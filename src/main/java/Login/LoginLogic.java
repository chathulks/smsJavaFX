package Login;

public class LoginLogic {
    public static boolean loginValidation(String username, String pwd){
        if(username.equals("admin") && pwd.equals("admin123")){
            return true;
        }
        return false;
    }
}
