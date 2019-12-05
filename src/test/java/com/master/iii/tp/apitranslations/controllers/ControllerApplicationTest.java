package com.master.iii.tp.apitranslations.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.master.iii.tp.apitranslations.entities.Application;
import com.master.iii.tp.apitranslations.services.application.services.ServiceApp;
import com.master.iii.tp.apitranslations.services.entry.services.ServiceEntry;
import com.master.iii.tp.apitranslations.services.translations.services.ServiceTranslation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ControllerApplication.class)
public class ControllerApplicationTest {

    @Autowired
    MockMvc mockMvc;


    private Application application = Application.builder()
            .id(1)
            .description("mon app")
            .name("myapp").build();



    @MockBean
    ServiceApp serviceApp;

    @MockBean
    ServiceEntry serviceEntry;

    @MockBean
    ServiceTranslation serviceTranslation;

    @Test
    public void should_return_return_JsonApp_with_statut_201_when_post_app() throws Exception {

        given(serviceApp.createApplication(application)).willReturn(application);
        mockMvc
                .perform(post("/applications")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(jsonToString(application))
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").exists());

    }

    public static String jsonToString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
