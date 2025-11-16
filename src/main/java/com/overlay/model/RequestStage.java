package com.overlay.model;

import java.io.Serializable;
import java.time.LocalDate;

public record RequestStage(
    Long id,
    LocalDate realizationDate,
    String description,
    RequestState state,
    Request request,
    User user
) implements Serializable {}
