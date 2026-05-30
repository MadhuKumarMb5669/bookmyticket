package com.bookmyticket.service;
import com.bookmyticket.entity.*; import com.bookmyticket.repository.*; import lombok.RequiredArgsConstructor; import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import org.springframework.stereotype.Service; import java.util.Optional;
@Service @RequiredArgsConstructor
public class AuthService { private final UserRepository userRepository; private final AdminRepository adminRepository; private final BCryptPasswordEncoder encoder;
 public Optional<User> loginUser(String mobile,String password){ return userRepository.findByMobile(mobile).filter(u->encoder.matches(password,u.getPassword())); }
 public Optional<Admin> loginAdmin(String username,String password){ return adminRepository.findByUsername(username).filter(a->encoder.matches(password,a.getPassword())); }
}
