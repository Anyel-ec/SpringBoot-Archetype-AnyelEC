package top.anyel.ec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import top.anyel.ec.models.UserInfo;

import java.util.List;
/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 10/01/2025
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    // Finds an active user by their username
    UserInfo findByUsernameAndIsActiveTrue(String username);

    // Retrieves all active users
    List<UserInfo> findByIsActiveTrue();

    // Finds an active user by their email
    UserInfo findByEmailAndIsActiveTrue(String email);

    @Query("SELECT u FROM UserInfo u WHERE u.isActive = true AND u.username <> :excludedUsername")
    List<UserInfo> findByIsActiveTrueAndUsernameNot(@Param("excludedUsername") String excludedUsername);

    // Finds an active user by their phone number
    UserInfo findByPhoneAndIsActiveTrue(String phone);
}

