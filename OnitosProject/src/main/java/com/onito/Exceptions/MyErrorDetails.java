package com.onito.Exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class MyErrorDetails {

	
	private String message;
	
	private LocalDateTime lct;
	
	private String desc;
	
}
