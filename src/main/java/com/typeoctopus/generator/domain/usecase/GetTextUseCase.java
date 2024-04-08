package com.typeoctopus.generator.domain.usecase;

import com.typeoctopus.generator.domain.model.TextModel;
import com.typeoctopus.generator.domain.ports.input.IGetTextUseCase;
import com.typeoctopus.generator.domain.ports.output.IGetTextGateway;

public class GetTextUseCase implements IGetTextUseCase {

    private final IGetTextGateway getTextByIdGateway;

    public GetTextUseCase(IGetTextGateway getTextByIdGateway) {
        this.getTextByIdGateway = getTextByIdGateway;
    }

    @Override
    public String run() {

        return getTextByIdGateway.run();
    }
}
