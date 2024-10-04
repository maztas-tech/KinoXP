package files.kinoxp.controller;

import files.kinoxp.model.Role;
import files.kinoxp.model.RoleName;
import files.kinoxp.repository.RoleRepository;
import files.kinoxp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/roleHello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getRoles() {
        return new ResponseEntity<>(roleService.getAllRoles(), HttpStatus.OK);
    }

    @PostMapping("/role")
    public ResponseEntity<String> createRole(@RequestBody Role role) {
        System.out.println("This is the role: " + role);
        System.out.println("Name: " + role.getRoleName());
        roleRepository.save(role);

        return new ResponseEntity<>("Has been created!", HttpStatus.OK);
    }
}
