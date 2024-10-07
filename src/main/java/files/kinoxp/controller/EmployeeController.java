package files.kinoxp.controller;

import files.kinoxp.model.Employee;
import files.kinoxp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee.getEmployeeName() + " saved successfully";
    }

    @DeleteMapping("/removeemployee")
    public String removeEmployee(@RequestBody Employee employee) {
        employeeService.deleteById(employee.getEmployeeID());
        return "Employee removed successfully";
    }


}
