package de.techdev.trackr.domain.employee.worktimetracking;

import de.techdev.trackr.IntegrationTest;
import de.techdev.trackr.domain.ApiBeansConfiguration;
import de.techdev.trackr.domain.common.FederalState;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {ApiBeansConfiguration.class})
public class WorkTimeTrackingReminderServiceIntegrationTest extends IntegrationTest {

    @Autowired
    private WorkTimeTrackingReminderService workTimeTrackingReminderService;

    @Test
    public void remindEmployeesToTrackWorkTimes() throws Exception {
        workTimeTrackingReminderService.remindEmployeesToTrackWorkTimes(FederalState.BERLIN);
    }
}
