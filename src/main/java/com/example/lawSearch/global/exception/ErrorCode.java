package com.example.lawSearch.global.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    // login
    EMAIL_EXIST(HttpStatus.BAD_REQUEST, "Login01", "이메일이 이미 존재합니다."),
    USER_NOT_FOUND(HttpStatus.BAD_REQUEST, "Login02", "해당 사용자가 존재하지 않습니다."),

    // question
    QUESTION_NOT_FOUND(HttpStatus.BAD_REQUEST, "Question01", "문의가 존재하지 않습니다."),
    QUESTION_USER_MIX_MATCH(HttpStatus.BAD_REQUEST, "Question02", "작성자와 사용자가 일치하지 않습니다."),

    // suggestion
    SUGGESTION_NOT_FOUND(HttpStatus.BAD_REQUEST, "Question01", "해당 정책 건의가 존재하지 않습니다."),
    SUGGESTION_USER_MIX_MATCH(HttpStatus.BAD_REQUEST, "Question02", "작성자와 사용자가 일치하지 않습니다."),

    //category
    CATEGORY_NOT_FOUND(HttpStatus.BAD_REQUEST, "Category01", "해당 카테고리가 없습니다.");


    private final HttpStatus status;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
