package com.mag.SpringSignUp.appuser;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public class AppUserRepository {
    Optional<AppUser> findByEmail(String email) {
        return null;
    }
}
