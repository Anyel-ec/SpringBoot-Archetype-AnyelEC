package top.anyel.ec.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 13/01/2025
 */

@Data
@AllArgsConstructor
public class RecoveryCodeResponseDto {
    private String recoveryCode;
    private LocalDateTime expirationDate;
}