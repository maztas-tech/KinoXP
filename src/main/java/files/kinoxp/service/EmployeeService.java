package files.kinoxp.service;

import files.kinoxp.model.Employee;
import files.kinoxp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    public ResponseEntity<Employee> updateEmployee(int id, Employee employee) {
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.save(employee);
            return ResponseEntity.ok().body(employee);
        } else {
            System.out.println("Employee doesn't exist");
            return ResponseEntity.notFound().build();
        }
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }



}
