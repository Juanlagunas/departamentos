package com.liverpool.divisas;

import lombok.Data;
import java.util.List;

@Data
public class Department {
    public Department(List departamentos){
        this.departamentos=departamentos;
    }
    List departamentos;
}
