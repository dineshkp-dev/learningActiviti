package activiti_rest_app_project;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartOnboardingStepTask implements JavaDelegate {
	
	private static final Logger LOG = LoggerFactory.getLogger(StartOnboardingStepTask.class);

	@Override
	public void execute(DelegateExecution execution) {
		LOG.info("Executing the StartOnboardingStepTask");
		LOG.info("Done Executing the StartOnboardingStepTask");
	}

}
