//package com.master.iii.tp.apitranslations.controllers;
//
//import com.master.iii.tp.apitranslations.entities.Entry;
//import com.master.iii.tp.apitranslations.services.application.services.ServiceApp;
//import com.master.iii.tp.apitranslations.services.entry.services.ServiceEntry;
//import com.master.iii.tp.apitranslations.services.translations.services.ServiceTranslation;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.util.Optional;
//
//import static org.junit.Assert.*;
//import static org.mockito.BDDMockito.given;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebMvcTest(ControllerEntry.class)
//public class ControllerEntryTest {
//
//    @Autowired
//   private MockMvc mockMvc;
//
//    @MockBean
//    ServiceApp serviceApp;
//
//    @MockBean
//    ServiceEntry serviceEntry;
//
//
//    @MockBean
//    ServiceTranslation translation;
//
//    Entry entry = Entry.builder()
//            .id(1)
//            .key("makey").build();
//
//    Optional<Entry> entrie = Optional.ofNullable(entry);
//
//    @Test
//    public void getEntry() {
//        given(serviceEntry.getEntry(1)).willReturn(entrie);
//
//        mockMvc
//                .perform(get(""))
//    }
//
//    @Test
//    public void deleteEntry() {
//    }
//}
