package com.cg.project.exception;

public class PatientException extends Exception{

	public PatientException() {

	}

	public PatientException(String errMessage) {
		super(errMessage);
	}

	public PatientException(String errMessage, Throwable t) {
		super(errMessage,t);
	}
}