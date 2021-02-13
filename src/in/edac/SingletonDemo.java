package in.edac;

public class SingletonDemo {
	public static void main(String[] args) {
		System.out.println("Hello Word");
		UserManager ref=UserManager.creatObject();
		UserDao user=UserDao.getInstance();
	}

}
