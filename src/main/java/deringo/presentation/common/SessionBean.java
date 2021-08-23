package deringo.presentation.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SessionBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String theme;
	
    @PostConstruct
    public void init() {
    	theme = "arya";
    }

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
    
}
