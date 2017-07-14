package com.luchoct.phone.api.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.List;

@Value
@NonFinal
public class Phone {

    @JsonProperty("id")
    private Integer id;


    @JsonProperty("title")
	private String title;

	@JsonProperty("description")
	private String description;

    @JsonProperty("pictureId")
    private String pictureId;

    @JsonProperty("fee")
    private String fee;

    @JsonProperty("phoneFeatures")
    private String phoneFeatures;
}
