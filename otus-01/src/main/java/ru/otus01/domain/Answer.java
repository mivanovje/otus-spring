package ru.otus01.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class Answer {
    private final Long id;
    private final String answerText;
}
