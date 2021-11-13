package com.example.idGenerator.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

public class Person {
    private final String name;
    @ApiModelProperty(hidden = true)
    private  UUID id;
    @ApiModelProperty(hidden = true)
    private String date;

    public Person(UUID id, @JsonProperty("name") String name, String date){
        this.name= name;
        this.id=id;
        this.date= date;

    }
    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public String getDate() {
        return date;
    }
}
