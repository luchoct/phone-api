package com.luchoct.phone.api.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.List;

@ApiModel(value="Phone", description="phone details")
@Value
@NonFinal
public class Phone {

    @ApiModelProperty(position = 1, required = true, value = "id")
    @JsonProperty("id")
    private Integer id;

    @ApiModelProperty(position = 2, required = true, value = "title")
    @JsonProperty("title")
	private String title;

    @ApiModelProperty(position = 3, required = true, value = "description")
	@JsonProperty("description")
	private String description;

    @ApiModelProperty(position = 4, required = true, value = "pictureId")
    @JsonProperty("pictureId")
    private String pictureId;

    @ApiModelProperty(position = 5, required = true, value = "sim free fee in euros")
    @JsonProperty("fee")
    private String fee;

    @ApiModelProperty(position = 6, required = true, value = "denormalized JSON array with a list of phone features")
    @JsonProperty("phoneFeatures")
    private String phoneFeatures;
}
