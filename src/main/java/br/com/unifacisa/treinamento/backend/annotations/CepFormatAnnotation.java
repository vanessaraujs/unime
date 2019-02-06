package br.com.unifacisa.treinamento.backend.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.com.unifacisa.treinamento.backend.validators.CepValidators;

@Constraint(validatedBy = CepValidators.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CepFormatAnnotation {
	
	String message() default "CEP inválido";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] playload() default {};
}
