package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import files.kinoxp.model.enums.RoleName;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleID;
    private RoleName roleName;
    @OneToMany(mappedBy = "role")
    @JsonBackReference
    private Set<Employee> employees = new HashSet<>();
}
