/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodTestOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BloodTesterRole.BloodTestWorkAreaJPanel;

/**
 *
 * @author Sahithi
 */
 // BloodTesterRole inherits from Role
public class BloodTesterRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BloodTestWorkAreaJPanel(userProcessContainer, account, (BloodTestOrganization) organization, business, enterprise);
    }

    public String toString() {
        return "Blood Tester";
    }

}
