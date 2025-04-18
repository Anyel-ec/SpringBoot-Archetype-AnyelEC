package top.anyel.ec.service.interfaces;


import top.anyel.ec.dto.JsonResponseDto;
import top.anyel.ec.dto.LoginRequestDto;
import top.anyel.ec.models.UserInfo;

import java.util.List;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 25/12/2024
 */
public interface AuthService {
    JsonResponseDto authenticate(LoginRequestDto login);

    JsonResponseDto getUserDetails(String token);

    JsonResponseDto revokeToken(String token);

    List<UserInfo> getAllActiveUsers();

    JsonResponseDto disableFirstLogin(String token);

}
