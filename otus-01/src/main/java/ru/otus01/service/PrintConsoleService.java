package ru.otus01.service;

import com.opencsv.exceptions.CsvValidationException;
import ru.otus01.domain.Question;

import java.io.IOException;
import java.util.List;

public interface PrintConsoleService {
    public List<Question> getAll() throws CsvValidationException, IOException;
}
