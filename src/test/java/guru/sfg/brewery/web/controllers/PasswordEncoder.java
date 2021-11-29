package guru.sfg.brewery.web.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class PasswordEncoder {

    @Test
    void Bcrypt() {
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();

        System.out.println(passwordEncoder.encode("1234"));
    }


    @Test
    void sha256() {
        StandardPasswordEncoder passwordEncoder=new StandardPasswordEncoder();
        System.out.println(passwordEncoder.encode("password"));
    }
}
