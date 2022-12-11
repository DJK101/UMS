package data;

import static org.junit.jupiter.api.Assertions.*;

class PasswordAuthenticationTest {

    @org.junit.jupiter.api.Test
    void password() {
        //Test for a valid password
        assertTrue(PasswordAuthentication.password("1", "pwd"));
        assertTrue(PasswordAuthentication.password("2", "pwd"));
        assertTrue(PasswordAuthentication.password("3", "pwd"));
        //Test for an invalid password
        assertFalse(PasswordAuthentication.password("1", "wrong"));
        assertFalse(PasswordAuthentication.password("2", "incorrect"));
        assertFalse(PasswordAuthentication.password("3", "false"));
    }
}
