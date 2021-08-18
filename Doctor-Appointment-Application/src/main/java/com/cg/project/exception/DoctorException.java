package com.cg.project.exception;

public class DoctorException extends Exception {
	public DoctorException() {

	}

	public DoctorException(String errMessage) {
		super(errMessage);
	}

	public DoctorException(String errMessage, Throwable t) {
		super(errMessage,t);
	}
}
