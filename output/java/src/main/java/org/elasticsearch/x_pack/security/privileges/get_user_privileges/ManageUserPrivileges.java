
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ManageUserPrivileges  {
  
  private String[] _applications;
  public String[] getApplications() { return this._applications; }
  public ManageUserPrivileges setApplications(String[] val) { this._applications = val; return this; }

}
