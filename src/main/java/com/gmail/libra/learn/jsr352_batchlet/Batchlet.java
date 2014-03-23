package com.gmail.libra.learn.jsr352_batchlet;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named
public class Batchlet implements javax.batch.api.Batchlet {
	@Override
	public String process() throws Exception {
		System.out.println("Process is called.");
		return "COMPLETED";
	}

	@Override
	public void stop() throws Exception {
	}
}
