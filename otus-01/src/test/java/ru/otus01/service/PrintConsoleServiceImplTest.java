package ru.otus01.service;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.otus01.repository.QuestionRepository;

import java.io.IOException;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PrintConsoleServiceImplTest {
    @InjectMocks
    PrintConsoleServiceImpl printConsoleService;
    @Mock
    private QuestionRepository repo;

    @Test
    void getAll() throws CsvValidationException, IOException {
        printConsoleService.getAll();
        verify(repo).getAll();
    }
}