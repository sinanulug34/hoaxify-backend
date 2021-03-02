package com.hoaxify.webservices.shared;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//arguman alan bir constructor
@AllArgsConstructor
public class GenericResponse {
    private String message;
}
