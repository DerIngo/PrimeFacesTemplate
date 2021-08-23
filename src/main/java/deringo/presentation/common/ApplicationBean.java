package deringo.presentation.common;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Tried to configure the JSF Project Stage with an application scoped bean.
 * Unfortunately it did not work.
 *  
 * 	web.xml :
 *    <context-param>
        <param-name>javax.faces.PROJECT_STAGE</param-name>
        <param-value>#{applicationBean.projectStage}</param-value>
      </context-param>

 *
 */
@Named
@Singleton
public class ApplicationBean implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Available options:
	 * <li>Production</li>
     * <li>Development</li>
     * <li>UnitTest</li>
     * <li>SystemTest</li>
     * <li>Extension</li>
     * <br>
	 */
	private String projectStage;

	public ApplicationBean() {
		// Note that it is required that an application scoped class have a public no-args constructor
		System.out.println("1");
	}
	
	
    @PostConstruct
    public void init() {
    	projectStage = "Development";
    	System.out.println("2");
    }

	public String getProjectStage() {
		System.out.println("3");
		return projectStage;
	}

	public void setProjectStage(String projectStage) {
		this.projectStage = projectStage;
		System.out.println("4");
	}
    
}
