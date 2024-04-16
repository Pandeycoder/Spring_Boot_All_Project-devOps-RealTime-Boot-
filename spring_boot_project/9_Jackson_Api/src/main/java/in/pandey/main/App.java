package in.pandey.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.pandey.binding.User;

public class App {
	
	public static void main(String[] args)throws Exception {
		
		App app=new App();
		app.convertToJeson();
	    app.convertJasonToObj();
	}
	
	
	public void convertJasonToObj() throws Exception
	{
		ObjectMapper mapper=new ObjectMapper();
		
		User user=mapper.readValue(new File("user.json"),User.class);
		
		System.out.println("successfully convert json data into Object");
	   System.out.println(user);
	   
	   System.out.println(user.getId());
	   System.out.println(user.getName());
	}
	
	public void convertToJeson()throws Exception
	{
		User u=new User(101,"Pandey","male",987);
		
		ObjectMapper maper=new ObjectMapper();
        
		maper.writeValue(new File("user.json"),u);
		
		System.out.println("json file convert sucessfully....!");
	}
	
}
