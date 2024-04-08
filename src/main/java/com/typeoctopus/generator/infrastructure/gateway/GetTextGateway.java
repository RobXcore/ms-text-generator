package com.typeoctopus.generator.infrastructure.gateway;

import com.typeoctopus.generator.domain.model.TextModel;
import com.typeoctopus.generator.domain.ports.output.IGetTextGateway;
import com.typeoctopus.generator.infrastructure.gateway.apimodel.ApiTextModel;
import com.typeoctopus.generator.infrastructure.gateway.mapper.TextMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static com.typeoctopus.generator.utils.ResponseParser.extractText;

@Component
public class GetTextGateway implements IGetTextGateway {

    private final RestTemplate restTemplate;
    public String url = "http://metaphorpsum.com/paragraphs/1/9";

    public GetTextGateway(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String run() {
        String apiTextModel = null;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return extractText(response.toString());
    }
}
