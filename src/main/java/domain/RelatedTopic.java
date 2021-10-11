package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedTopic {

    /**
     * First URL in Result
     */
    @JsonProperty("FirstURL")
    private String firstUrl;

    /**
     * Icon associated with related topic(s)
     */
    @JsonProperty("Icon")
    private Icon icon;

    /**
     * HTML link(s) to related topic(s)
     */
    @JsonProperty("Result")
    private String result;

    /**
     * Text from first URL
     */
    @JsonProperty("Text")
    private String text;
}
