package ru.otus01.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.List;
@Data
@RequiredArgsConstructor
@Builder
public class Question {
    private final Long id;
    private final String questionText;
    private final List<String> answers;
}
