package com.camunda.consulting.external_task_worker_scheduled_by_process;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ListFeeder implements JavaDelegate {

	private Map<String, Object> mapTask;

	public ListFeeder() {

//		Map<String, Object> mapTask = new HashMap<String, Object>();
//		ExternalTask externalTask1 = new ExternalTask();
//		ExternalTask externalTask2 = new ExternalTask();
//		externalTask1.setName("teste1");
//		externalTask1.setTag("teste 1");
//
//		externalTask2.setName("teste2");
//		externalTask2.setTag("teste 2");
//		mapTask.put("1", externalTask1);
//		mapTask.put("2", externalTask2);
//
//		this.mapTask = mapTask;
//
//		DelegateExecution execution = null;
//
//		Set<String> chaves = mapTask.keySet();
//		for (String chave : chaves) {
//			if (chave != null)
//				execution.setVariables((Map<String, ? extends Object>) mapTask.get(chave));
//		}
//
//		try {
//			this.execute(execution);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> mapTask = new HashMap<String, Object>();
		ExternalTask externalTask1 = new ExternalTask();
		ExternalTask externalTask2 = new ExternalTask();
		externalTask1.setName("teste1");
		externalTask1.setTag("teste 1");
		externalTask2.setName("teste2");
		externalTask2.setTag("teste 2");
		mapTask.put("1", externalTask1);
		mapTask.put("2", externalTask2);
		execution.setVariables(mapTask);
		ExternalWorkerDelegate externalWorker = new ExternalWorkerDelegate();
		externalWorker.execute(execution);

	}

}
