package de.techdev.trackr.domain;

import de.techdev.trackr.domain.employee.login.DeactivateEmployeesService;
import de.techdev.trackr.domain.employee.vacation.HolidayCalculator;
import de.techdev.trackr.domain.employee.vacation.VacationRequestService;
import de.techdev.trackr.domain.employee.vacation.support.VacationRequestServiceImpl;
import de.techdev.trackr.domain.employee.worktimeTracking.WorkTimeTrackingReminderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * All Beans needed for the API that have nothing to do with web.
 *
 * @author Moritz Schulze
 */
@Configuration
public class ApiBeansConfiguration {

    @Bean
    public WorkTimeTrackingReminderService workTimeTrackingReminderService() {
        return new WorkTimeTrackingReminderService();
    }

    @Bean
    public DeactivateEmployeesService deactivateEmployeesService() {
        return new DeactivateEmployeesService();
    }

    @Bean
    public VacationRequestService vacationRequestService() {
        return new VacationRequestServiceImpl();
    }

    @Bean
    public HolidayCalculator holidayCalculator() {
        return new HolidayCalculator();
    }
}