package com.example.TicketSupport.objectMappers;


import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.SerializationFeature;

import com.fasterxml.jackson.databind.cfg.CoercionAction;

import com.fasterxml.jackson.databind.cfg.CoercionInputShape;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

@Configuration

public class JacksonStrictConfig {

    private static final String DATETIME_FORMAT = "dd-MMM-yyyy hh:mm a";

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(DATETIME_FORMAT);

    @Bean

    public ObjectMapper objectMapper(){

        ObjectMapper mapper = new ObjectMapper();

        // Disallow coercion from String to Integer and Float

        mapper.coercionConfigFor(Integer.class)

                .setCoercion(CoercionInputShape.String, CoercionAction.Fail);

        mapper.coercionConfigFor(Float.class)

                .setCoercion(CoercionInputShape.String, CoercionAction.Fail);

        // Register JavaTimeModule with custom formatter

        JavaTimeModule javaTimeModule = new JavaTimeModule();

        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(FORMATTER));

        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(FORMATTER));

        mapper.registerModule(javaTimeModule);

        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        return mapper;

    }

}

