package top.anyel.ec.service.interfaces;

import top.anyel.ec.dto.JsonResponseDto;
import top.anyel.ec.dto.ProfileDto;
import top.anyel.ec.dto.ProfilePasswordDto;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 10/01/2025
 */
public interface ProfileService {
    JsonResponseDto getProfile(String user);
    JsonResponseDto updateProfile(String token, ProfileDto updateUserRequestDto);
    JsonResponseDto updatePassword(String token, ProfilePasswordDto updatePasswordRequestDto); // Cambiado a ProfilePasswordDto
}
