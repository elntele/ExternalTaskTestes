package com.camunda.consulting.external_task_worker_scheduled_by_process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Robot {

	private String TestTag;

	public Robot(String testTag) {
		super();
		TestTag = testTag;

	}


	public void runRObot(String tag) throws IOException {

		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
				"cd \"C:\\Users\\jnascimento\\Desktop\\automacao\\DigitAllWorkers\" && robot --include " + tag
						+ " testeSuite1.txt");
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);

		}

	}
}
