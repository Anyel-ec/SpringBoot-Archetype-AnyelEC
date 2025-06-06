package top.anyel.ec.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 10/01/2025
 */
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;
    private String email;
    private String phone;
    private String name;
    private String lastname;
    private String company;

    @Column(columnDefinition = "boolean default false")
    private boolean firstLogin;

    @JsonIgnore
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(columnDefinition = "boolean default true")
    private Boolean isActive;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<UserRole> roles = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInfo userInfo)) return false;
        return id == userInfo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
