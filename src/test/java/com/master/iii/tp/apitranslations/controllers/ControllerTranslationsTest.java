package com.master.iii.tp.apitranslations.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.master.iii.tp.apitranslations.entities.Application;
import com.master.iii.tp.apitranslations.entities.Entry;
import com.master.iii.tp.apitranslations.entities.Translations;
import com.master.iii.tp.apitranslations.services.application.services.ServiceApp;
import com.master.iii.tp.apitranslations.services.entry.services.ServiceEntry;
import com.master.iii.tp.apitranslations.services.translations.services.ServiceTranslation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ControllerTranslations.class)
public class ControllerTranslationsTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ServiceApp serviceApp;

    @MockBean
    private ServiceTranslation serviceTranslation;

    @MockBean
    private ServiceEntry serviceEntry;

    Application application = Application.builder()
            .name("mon app")
            .description("desc")
            .id(1).build();

    Entry entry = Entry.builder()
            .id(1)
            .value("valeur")
            .key("ma cle").build();

 Entry entry1 = Entry.builder()
            .id(1)
            .value("valeur")
            .key("ma cle").build();


    Translations translations = Translations.builder()
            .application(application)
            .language("fr-FR")
            .entries(Arrays.asList(entry,entry1))
            .id(1).build();



    @Test
    public void should_return_translation_with_201_when_post_translation() throws Exception{
        given(serviceTranslation.createTranslation(translations)).willReturn(translations);


        mockMvc
                .perform(post("applications/1/translations")
                        .content(parseJsonToString(translations))
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());




    }

    @Test
    public void should_not_found_translation_with_404_when_post_translation() {

    }
    public static String parseJsonToString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
}}
