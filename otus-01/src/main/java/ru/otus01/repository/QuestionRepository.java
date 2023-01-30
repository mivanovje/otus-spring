package ru.otus01.repository;

import com.opencsv.exceptions.CsvValidationException;
import ru.otus01.domain.Question;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface QuestionRepository {
    List<Question> getAll() throws IOException, CsvValidationException;
}
