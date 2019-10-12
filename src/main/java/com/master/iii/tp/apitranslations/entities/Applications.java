package com.master.iii.tp.apitranslations.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Validated

public class Applications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

}
