package br.com.service1.exceptions;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionMessage {
	private String message;
	private HttpStatus statusCode;
	private List<String> errors;

}
