

	import java.util.*;

	public class QQ {
	    private List userList;
	    
	    public List getUserList() {
	        if(userList == null) {
	            userList = new ArrayList();
	            userList.add(
	                new UserBean("caterpillar", "123456"));
	            userList.add(
	                new UserBean("momor", "654321"));
	            userList.add(
	                new UserBean("becky", "7890"));
	        }
	        
	        return userList;
	    }
	}