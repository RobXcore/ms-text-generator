package com.typeoctopus.generator.infrastructure.gateway.mapper;

import com.typeoctopus.generator.domain.model.TextModel;
import com.typeoctopus.generator.infrastructure.gateway.apimodel.ApiTextModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TextMapper {

    TextMapper INSTANCE = Mappers.getMapper(TextMapper.class);

    String apiTextModelToTextModel(ApiTextModel apiTextModel);

}
