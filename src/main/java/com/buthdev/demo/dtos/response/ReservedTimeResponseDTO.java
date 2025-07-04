package com.buthdev.demo.dtos.response;

import com.buthdev.demo.model.enums.ReservedTimeStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReservedTimeResponseDTO {

	private String date;
	private String service;
	private ReservedTimeStatus status;
	private UserResponseDTO user;
	private BarberResponseDTO barber;
}