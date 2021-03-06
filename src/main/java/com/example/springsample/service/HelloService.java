package com.example.springsample.service;

import com.example.springsample.domain.model.Employee;
import com.example.springsample.repository.HelloRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HelloService {
    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public Employee findOne(int id){
        // 1件検索実行
        Map<String, Object> map = helloRepository.findOne(id);
        
        // Mapから値を取得
        int employeeId = (Integer)map.get("employee_id");
        String employeeName = (String)map.get("employee_name");
        int age = (Integer)map.get("age");

        // Employeeクラスに値をセット
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(employeeName);
        employee.setAge(age);

        return employee;
    }
}
