package com.typeoctopus.generator.infrastructure.controller;

import com.typeoctopus.generator.domain.model.TextModel;
import com.typeoctopus.generator.domain.ports.input.IGetTextUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GetTextController {
    private final IGetTextUseCase getTextByIdUseCase;

    public GetTextController(IGetTextUseCase getTextByIdUseCase) {
        this.getTextByIdUseCase = getTextByIdUseCase;
    }

    @GetMapping("textParagraph")
    public ResponseEntity<String> getApiText () {
        return new ResponseEntity<>(getTextByIdUseCase.run(), HttpStatus.OK);
    }


}
