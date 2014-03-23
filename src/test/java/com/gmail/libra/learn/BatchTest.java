package com.gmail.libra.learn;

import java.util.Properties;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.JobExecution;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BatchTest {
	@Test
	public void test() {
		JobOperator operator = BatchRuntime.getJobOperator();
		long id = operator.start("batchlet", new Properties());
		JobExecution execution = operator.getJobExecution(id);

		try {
			while (execution.getExitStatus() == null)
				Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Done.");
	}
}
