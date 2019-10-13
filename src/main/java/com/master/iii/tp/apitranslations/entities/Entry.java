package com.master.iii.tp.apitranslations.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String key;

    @NotBlank
    private  String value;

    @ManyToOne
    @JoinColumn(name = "translationId")
    private  Translations translation;


}
