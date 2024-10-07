package files.kinoxp.service;

import files.kinoxp.model.Role;
import files.kinoxp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {


    @Autowired
    RoleRepository roleRepository;


    public void save(Role role) {
        roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        List<Role> newlist = roleRepository.findAll();
        return newlist;
    }

}
