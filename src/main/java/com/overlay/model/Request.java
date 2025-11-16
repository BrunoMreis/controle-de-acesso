package com.overlay.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public record Request(
	Long id,
	String subject,
	String description,
	LocalDate criationDate,
	RequestState state,
	List<RequestStage> stages,
	User user
) implements Serializable {}

