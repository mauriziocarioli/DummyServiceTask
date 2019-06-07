package com.insurance.handler;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
//import org.springframework.stereotype.Component;

//@Component("DummyServiceTask")
public class DummyServiceTaskWorkItemHandler implements WorkItemHandler {

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {

        System.out.println("Work item being executed " + workItem);
        //String firstParameter = (String)workItem.getParameter("FirstParameter");
        //logger.info("first parameter: ",firstParameter);
        //TODO
        manager.completeWorkItem(workItem.getId(), null);
        
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

    }

}