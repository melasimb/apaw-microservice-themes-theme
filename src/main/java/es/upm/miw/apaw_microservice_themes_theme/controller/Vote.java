package es.upm.miw.apaw_microservice_themes_theme.controller;

import java.time.LocalDateTime;

public class Vote {

    private Integer value;

    private LocalDateTime date;

    public Vote(Integer value) {
        this.value = value;
        this.date = LocalDateTime.now();
    }

    public Integer getValue() {
        return value;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
