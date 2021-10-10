package domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.net.URI;
import java.util.List;

@Data
public class ApiResponse {

    @JsonProperty("Abstract")
    private final String abstractValue;

    @JsonProperty("AbstractSource")
    private final String abstractSource;

    @JsonProperty("AbstractText")
    private final String abstractText;

    @JsonProperty("AbstractURL")
    private final URI abstractUrl;

    @JsonProperty("Answer")
    private final String answer;

    @JsonProperty("AnswerType")
    private final String answerType;

    @JsonProperty("Definition")
    private final String definition;

    @JsonProperty("DefinitionSource")
    private final String definitionSource;

    @JsonProperty("DefinitionURL")
    private final String definitionUrl;

    @JsonProperty("Entity")
    private final String entity;

    @JsonProperty("Heading")
    private final String heading;

    @JsonProperty("Image")
    private final String image;

    @JsonProperty("ImageHeight")
    private final Double imageHeight;

    @JsonProperty("ImageIsLogo")
    private final Integer imageIsLogo;

    @JsonProperty("ImageWidth")
    private final Double imageWidth;

    @JsonProperty("Infobox")
    private final Infobox infobox;

    @JsonProperty("Redirect")
    private final String redirect;

    @JsonProperty("RelatedTopics")
    private final List<RelatedTopic> relatedTopics;

    @JsonProperty("Results")
    private final List<Result> results;

    @JsonProperty("Type")
    private final String type;

    @JsonProperty("meta")
    private final Meta meta;
}
