package com.typeoctopus.generator.infrastructure.gateway.mapper;

import com.typeoctopus.generator.domain.model.TextModel;
import com.typeoctopus.generator.infrastructure.gateway.apimodel.ApiTextModel;
import org.mapstruct.Mapper;

@Mapper
public class ApiTextModelToTextModel {
    public TextModel apiTextModelToTextModel (ApiTextModel apiTextModel) {
        TextModel textModel = new TextModel();
        textModel.setText(apiTextModel.getText());
        return textModel;
    }
}
