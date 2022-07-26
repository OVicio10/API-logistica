package com.logistica.logic.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaInput {
	@Valid
	@NotNull
	private ClienteIdInput cliente;
	@Valid
	@NotNull
	private DestinarioInput destinatario;
	@NotNull
	private BigDecimal taxa;

}