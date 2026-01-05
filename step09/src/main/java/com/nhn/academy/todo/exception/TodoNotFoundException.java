package com.nhn.academy.todo.exception;

// 오늘(2026.1.2.금) 배운 내용이라 기억나는 거 다 끌어서 가져옴

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException(String message) {
        super(message);
    }

    public TodoNotFoundException(int id) {
        super(id + ": 존재하지 않는 데이터입니다.");
    }
}
