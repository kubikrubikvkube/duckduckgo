package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {

    /**
     * Topic summary (can contain HTML, e.g. italics)
     */
    @JsonProperty("Abstract")
    private String abstractValue;

    /**
     * Name of Abstract source
     */
    @JsonProperty("AbstractSource")
    private String abstractSource;

    /**
     * Topic summary (with no HTML)
     */
    @JsonProperty("AbstractText")
    private String abstractText;

    /**
     * Deep link to expanded topic page in AbstractSource
     */
    @JsonProperty("AbstractURL")
    private String abstractUrl;

    /**
     * Instant answer
     */
    @JsonProperty("Answer")
    private Integer answer;

    /**
     * Type of Answer, e.g. calc, color, digest, info, ip, iploc, phone, pw, rand, regexp, unicode, upc, or zip
     */
    @JsonProperty("AnswerType")
    private String answerType;

    /**
     * Dictionary definition (may differ from Abstract)
     */
    @JsonProperty("Definition")
    private String definition;

    /**
     * Name of Definition source
     */
    @JsonProperty("DefinitionSource")
    private String definitionSource;

    /**
     * Deep link to expanded definition page in DefinitionSource
     */
    @JsonProperty("DefinitionURL")
    private String definitionUrl;

    @JsonProperty("Entity")
    private String entity;

    /**
     * Name of topic that goes with Abstract
     */
    @JsonProperty("Heading")
    private String heading;

    /**
     * Link to image that goes with Abstract
     */
    @JsonProperty("Image")
    private String image;

    @JsonProperty("ImageHeight")
    private Integer imageHeight;

    @JsonProperty("ImageIsLogo")
    private Integer imageIsLogo;

    @JsonProperty("ImageWidth")
    private Integer imageWidth;

    @JsonProperty("Infobox")
    private Infobox infobox;

    /**
     * !bang redirect URL
     */
    @JsonProperty("Redirect")
    private String redirect;

    /**
     * Array of internal links to related topics associated with Abstract
     */
    @JsonProperty("RelatedTopics")
    private List<RelatedTopic> relatedTopics;

    /**
     * Array of external links associated with Abstract
     */
    @JsonProperty("Results")
    private List<Result> results;

    /**
     * Response category, i.e. A (article), D (disambiguation), C (category), N (name), E (exclusive), or nothing.
     */
    @JsonProperty("Type")
    private String type;

    @JsonProperty("meta")
    private JsonNode meta;

}
