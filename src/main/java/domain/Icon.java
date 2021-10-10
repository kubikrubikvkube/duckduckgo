package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Icon {

    /**
     * Height of icon (px)
     */
    @JsonProperty("Height")
    private Integer height;

    /**
     * URL of icon
     */
    @JsonProperty("URL")
    private String url;

    /**
     * Width of icon (px)
     */
    @JsonProperty("Width")
    private Integer width;
}
