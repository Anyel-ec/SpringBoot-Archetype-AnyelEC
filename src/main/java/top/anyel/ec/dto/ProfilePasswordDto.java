package top.anyel.ec.dto;

import lombok.Data;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 10/01/2025
 */
@Data
public class ProfilePasswordDto {
    private String currentPassword;
    private String newPassword;
}
