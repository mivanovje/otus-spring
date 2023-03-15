package ru.otus01.repository;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import ru.otus01.domain.Question;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
public class QuestionRepositoryImpl implements QuestionRepository{
    private final Resource file;
    private final List<Question> questions = new ArrayList<>();
    @Override
    public List<Question> getAll() throws IOException, CsvValidationException {
        var csvReader = new CSVReader(new InputStreamReader(file.getInputStream()));
        csvReader.readNext(); // Пропускаем строку с заголовками
        String[] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            questions.add(Question.builder().id(Long.parseLong(nextLine[0])).questionText(nextLine[1]).answers(List.of(nextLine[2],nextLine[3],nextLine[4],nextLine[5])).build());
        }
        return questions;
    }
}
