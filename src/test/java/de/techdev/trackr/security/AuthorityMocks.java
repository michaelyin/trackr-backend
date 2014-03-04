package de.techdev.trackr.security;

import de.techdev.trackr.domain.Authority;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

import static java.util.Arrays.asList;

/**
 * @author Moritz Schulze
 */
public class AuthorityMocks {

    /**
     * @return An authentication object for an employee with the id 100.
     */
    public static Authentication basicAuthentication() {
        return employeeAuthentication(100L);
    }

    /**
     * An authentication of an employee with the id id.
     *
     * @param id The desired id of the employee.
     * @return An authentication object for an employee.
     */
    public static Authentication employeeAuthentication(Long id) {
        return new Authentication() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return asList(new Authority("ROLE_EMPLOYEE"));
            }

            @Override
            public Object getCredentials() {
                return null;
            }

            @Override
            public Object getDetails() {
                return null;
            }

            @Override
            public Object getPrincipal() {
                return new TrackrUser("user@techdev.de", true, getAuthorities(), id);
            }

            @Override
            public boolean isAuthenticated() {
                return true;
            }

            @Override
            public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

            }

            @Override
            public String getName() {
                return "user@techdev.de";
            }
        };
    }

    /**
     * Get an admin authentication object.
     * Use with SecurityContextHolder.getContext().setAuthentication(adminAuthentication());
     *
     * @return An admin authentication object, i.e. principal = "admin@techdev.de" and auhtorities = {"ROLE_ADMIN"}
     */
    public static Authentication adminAuthentication() {
        return new Authentication() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return asList(new Authority("ROLE_ADMIN"));
            }

            @Override
            public Object getCredentials() {
                return null;
            }

            @Override
            public Object getDetails() {
                return null;
            }

            @Override
            public Object getPrincipal() {
                return new TrackrUser(getName(), true, getAuthorities(), 0L);
            }

            @Override
            public boolean isAuthenticated() {
                return true;
            }

            @Override
            public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

            }

            @Override
            public String getName() {
                return "admin@techdev.de";
            }
        };
    }

    public static Authentication supervisorAuthentication() {
        return new Authentication() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return asList(new Authority("ROLE_SUPERVISOR"));
            }

            @Override
            public Object getCredentials() {
                return null;
            }

            @Override
            public Object getDetails() {
                return null;
            }

            @Override
            public Object getPrincipal() {
                return new TrackrUser(getName(), true, getAuthorities(), 1L);
            }

            @Override
            public boolean isAuthenticated() {
                return true;
            }

            @Override
            public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

            }

            @Override
            public String getName() {
                return "supervisor@techdev.de";
            }
        };
    }
}