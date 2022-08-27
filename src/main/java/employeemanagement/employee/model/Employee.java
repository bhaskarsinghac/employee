package employeemanagement.employee.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.nio.file.LinkOption;
import java.util.HashMap;

@Getter
@Setter
@ToString

@Document(collection = "employees")
public class Employee {

    @Id
    private int code;
    private String employee_name;
    private String employee_id;
    private String email;
    private Long phone_number;
    private String current_address;
    private String permanent_address;
    private String city;
    private String state;
    private String country;
}

