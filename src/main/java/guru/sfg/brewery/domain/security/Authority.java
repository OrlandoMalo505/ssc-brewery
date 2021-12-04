package guru.sfg.brewery.domain.security;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String permission;
    @ManyToMany(mappedBy = "authorities")
    private Set<Role> roles;
}
