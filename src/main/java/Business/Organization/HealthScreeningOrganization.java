/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.AssistantDoctorRole;
import java.util.ArrayList;

/**
 *
 * @author Vimala
 */
public class HealthScreeningOrganization extends Organization {

    public HealthScreeningOrganization() {
        super(Organization.Type.HealthScreening.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AssistantDoctorRole());
        return roles;
    }

}
