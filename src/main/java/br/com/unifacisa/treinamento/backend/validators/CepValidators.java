package br.com.unifacisa.treinamento.backend.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotEmpty;

public class CepValidators implements ConstraintValidator<NotEmpty, String>{

	@Override
	public boolean isValid(String cep, ConstraintValidatorContext context) {
		return ValidaCep(cep);
	}
	
	public static boolean ValidaCep(String cep)
    {
        return true;
    }
}


