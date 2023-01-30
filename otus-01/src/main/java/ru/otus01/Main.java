package ru.otus01;

import com.opencsv.exceptions.CsvValidationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus01.domain.Question;
import ru.otus01.service.PrintConsoleService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CsvValidationException, IOException {
        var context = new ClassPathXmlApplicationContext("/spring-context.xml");
        var printService = context.getBean(PrintConsoleService.class);
        var res = printService.getAll();
        for (Question q : res) {
            System.out.println(q);
        }
    }
}