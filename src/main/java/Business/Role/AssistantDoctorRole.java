/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.HealthScreeningOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AssistantDoctorRole.AssistantDoctorWorkAreaJPanel;

/**
 *
 * @author Sahithi
 */
// Symtoms inherits from role
public class AssistantDoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AssistantDoctorWorkAreaJPanel(userProcessContainer, account, (HealthScreeningOrganization) organization, enterprise, business);
    }

    public String toString() {
        return "Assistant Doctor";
    }

}
