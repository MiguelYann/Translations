package com.master.iii.tp.apitranslations.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;
/*
* En supposant ici qu'une application peut avoir plusieurs traductions
* */
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "application")
    private Collection<Translations> translationsList;

}
