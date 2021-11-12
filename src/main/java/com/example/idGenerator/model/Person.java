package com.example.idGenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

public class Person {
    private final String name;
    @ApiModelProperty(hidden = true)
    private  UUID id;

    public Person(UUID id, @JsonProperty("name") String name){
        this.name= name;
        this.id=id;

    }
    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
