package ru.otus01.service;
import com.opencsv.exceptions.CsvValidationException;
import lombok.RequiredArgsConstructor;
import ru.otus01.domain.Question;
import ru.otus01.repository.QuestionRepository;

import java.io.IOException;
import java.util.List;
@RequiredArgsConstructor
public class PrintConsoleServiceImpl implements PrintConsoleService{
    private final QuestionRepository repo;

    @Override
    public List<Question> getAll() throws CsvValidationException, IOException {
        return repo.getAll();
    }
}
