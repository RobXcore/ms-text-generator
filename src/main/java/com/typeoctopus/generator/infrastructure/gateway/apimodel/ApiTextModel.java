package com.typeoctopus.generator.infrastructure.gateway.apimodel;

public class ApiTextModel {

    String text;

    public ApiTextModel() {
    }

    public ApiTextModel(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
