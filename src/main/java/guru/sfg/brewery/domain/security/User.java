package guru.sfg.brewery.domain.security;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    private String password;


    @Singular
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_authority",
    joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
    inverseJoinColumns = {@JoinColumn(name = "AUTHOR_ID",referencedColumnName = "ID")})
    private Set<Authority> authorities;


    @Builder.Default
    private Boolean accountNonExpired=true;
    @Builder.Default
    private Boolean enabled=true;
    @Builder.Default
    private Boolean accountNonLocked=true;
    @Builder.Default
    private Boolean credentialsNonExpired=true;


}
