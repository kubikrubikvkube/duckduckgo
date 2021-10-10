package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoboxContent {

    @JsonProperty("data_type")
    private String dataType;

    @JsonProperty("label")
    private String label;

    @JsonProperty("value")
    private JsonNode value;

    @JsonProperty("wiki_order")
    private Integer wikiOrder;
}
