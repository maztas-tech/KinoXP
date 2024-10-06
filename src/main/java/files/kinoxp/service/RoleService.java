package files.kinoxp.service;

import files.kinoxp.model.Role;
import files.kinoxp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {


    @Autowired
    RoleRepository roleRepository;


    public void save(Role role) {
        roleRepository.save(role);
    }

}
