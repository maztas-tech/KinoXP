package files.kinoxp.controller;

import files.kinoxp.model.Employee;
import files.kinoxp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee.getEmployeeName() + " saved successfully";
    }

    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/removeemployee")
    public String removeEmployee(@RequestBody Employee employee) {
        employeeService.deleteById(employee.getEmployeeID());
        return "Employee removed successfully";
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee.getEmployeeID(), employee);
    }
}
