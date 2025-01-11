/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BloodTesterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vimala
 */
public class BloodTestOrganization extends Organization {

    public BloodTestOrganization() {
        super(Organization.Type.BloodTest.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodTesterRole());
        return roles;
    }

}
