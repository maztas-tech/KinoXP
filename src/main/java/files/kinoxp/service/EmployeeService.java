package files.kinoxp.service;

import files.kinoxp.model.Employee;
import files.kinoxp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    public ResponseEntity<Employee> findById(Integer id) {
        if (employeeRepository.findById(id).isPresent()) {
            return new ResponseEntity<>(employeeRepository.findById(id).get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<HttpStatus> deleteById(int id) {
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND);
        }
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
