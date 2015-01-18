package de.techdev.trackr.domain;

import de.techdev.trackr.IntegrationTest;
import de.techdev.trackr.domain.scheduling.ScheduledJobsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {ScheduledJobsConfiguration.class, ApiBeansConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ScheduledJobsConfigurationIntegrationTest extends IntegrationTest {

    @Test
    public void bootsUp() throws Exception {

    }
}
