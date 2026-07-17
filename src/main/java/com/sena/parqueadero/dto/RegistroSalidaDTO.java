package com.sena.parqueadero.dto;

import lombok.Data;

@Data
public class RegistroSalidaDTO {

	private Long idRegisro;
	private String placa;
	private Double valorCobrado;
	private long horasEstadia;

}
