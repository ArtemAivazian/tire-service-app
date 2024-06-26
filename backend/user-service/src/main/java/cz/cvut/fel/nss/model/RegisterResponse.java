package cz.cvut.fel.nss.model;

import cz.cvut.fel.nss.data.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;

}
