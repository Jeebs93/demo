package com.example.demo;

import java.util.List;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;

@Data
public class Burger {
    private String name;
    private List<String> ingredients;
}
