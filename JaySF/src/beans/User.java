package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;

	// Getters and setters
	public String getName() {
		return name;
	}
	
	/**
	 * Defining user's name.
	 * @param name - user's name as String.
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
