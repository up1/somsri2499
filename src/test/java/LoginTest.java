import demo.User;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginTest {

    @Test public void
    success_with_username_somsri_and_password_somsri2499() {
        User user = new User();
        boolean isLogin = user.login("somsri", "somsri2499");
        assertTrue("Login succeed", isLogin);
    }

    @Test public void
    fail_with_wrong_password_username_somsri_and_password_somsri2498() {
        User user = new User();
        boolean isLogin = user.login("somsri", "somsri2498");
        assertFalse("Login fail", isLogin);
    }

    @Test public void
    fail_with_wrong_username_username_somkiat_and_password_somsri2498() {
        User user = new User();
        boolean isLogin = user.login("somkiat", "somsri2498");
        assertFalse("Login fail", isLogin);
    }

    @Test public void
    fail_with_wrong_username_username_somkiat_and_password_somsri24981() {
        User user = new User();
        boolean isLogin = user.login("somkiat", "somsri2498");
        assertFalse("Login fail", isLogin);
    }

    @Test public void
    fail_with_wrong_username_username_somkiat_and_password_somsri24982() {
        User user = new User();
        boolean isLogin = user.login("somkiat", "somsri2498");
        assertFalse("Login fail", isLogin);
    }

}
