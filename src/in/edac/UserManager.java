package in.edac;

public class UserManager {
	private static UserManager instance;
	private UserManager() {
		super();
	}
	public static UserManager creatObject() {
	UserManager instance=	new UserManager();
	return instance;
	}
	public static UserManager getInstance() {
		if(instance==null) {
		UserManager instance=	new UserManager();
		}
		return instance;
		
		}
	
}
