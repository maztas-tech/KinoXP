package files.kinoxp.controller;

import files.kinoxp.model.Role;
import files.kinoxp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;


    @PostMapping("/saveRole")
    public String addRole(@RequestBody Role role) {
        roleService.save(role);
        return "success";
    }

    @GetMapping("/allRoles")
    public List<Role> allRoles() {
        List<Role> gottenRoles = roleService.getAllRoles();

        return gottenRoles;
    }
}
