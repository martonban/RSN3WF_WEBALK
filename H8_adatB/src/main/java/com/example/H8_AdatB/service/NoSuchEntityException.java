package com.example.H8_AdatB.service;

public class NoSuchEntityException extends Throwable {

    private Long id;

    public NoSuchEntityException(Long id) {
            super(String.format("No such entity%d", id));
            this.id = id;
        }

        public Long getId() {
            return id;
        }

}

