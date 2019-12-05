package com.master.iii.tp.apitranslations.entities;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
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
