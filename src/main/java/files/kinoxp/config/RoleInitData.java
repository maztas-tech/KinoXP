package files.kinoxp.config;

import files.kinoxp.model.Role;
import files.kinoxp.model.RoleName;
import files.kinoxp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleInitData implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        Role role = new Role();

        role.setRoleName(RoleName.MANAGER);
        roleRepository.save(role);

        Role role1 = new Role();
        role1.setRoleName(RoleName.EMPLOYEE);
        roleRepository.save(role1);

    }
}
