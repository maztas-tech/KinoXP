package files.kinoxp.controller;

import files.kinoxp.model.Employee;
import files.kinoxp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        if (employeeService.save(employee) != null){
            return new ResponseEntity<>(employee, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
        if (employeeService.updateEmployee(employee.getEmployeeID(), employee) != null){
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
