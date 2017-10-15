package activiti_rest_app_project;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndOnboardingStepTask implements JavaDelegate {

	private static final Logger LOG = LoggerFactory.getLogger(EndOnboardingStepTask.class);
	
	@Override
	public void execute(DelegateExecution execution) {
		LOG.info("Executing the EndOnboardingStepTask");
		LOG.info("Done Executing the EndOnboardingStepTask");
	}

}
