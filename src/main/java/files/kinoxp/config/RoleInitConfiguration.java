package files.kinoxp.config;

import files.kinoxp.model.Role;
import files.kinoxp.model.enums.RoleNameEnum;
import files.kinoxp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleInitConfiguration implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {


        if (roleRepository.count() == 0){
            for (RoleNameEnum roleNameEnum : RoleNameEnum.values()){
                roleRepository.save(new Role(roleNameEnum));
            }
            System.out.println("Roles added successfully");
        }
        else {
            System.out.println("Roles already exist");
        }
        /*
        Role role = new Role();
        role.setRoleName(RoleNameEnum.EMPLOYEE);
        roleInterface.save(role);

        Role role2 = new Role();
        role2.setRoleName(RoleNameEnum.MANAGER);
        roleInterface.save(role2);

         */
    }
}
