package com.master.iii.tp.apitranslations.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Translations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String language;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "translation")
    private Collection<Entry> entries;

    @ManyToOne(cascade = CascadeType.ALL)
    private Application application;

}
