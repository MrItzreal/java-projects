package myProjects.src.login_system;

import java.util.HashMap;

public class IDandPasswords {
  HashMap<String, String> logininfo = new HashMap<String, String>();

  // Constructor:
  IDandPasswords() {
    logininfo.put("Izzy", "pizza");
    logininfo.put("Pokemon", "PASSWORD");
    logininfo.put("JavaCode", "abc123");
  }

  /*
   * Getter method
   * This method is protected to avoid everyone from using it.
   */
  protected HashMap getLoginInfo() {
    return logininfo;
  }
}
