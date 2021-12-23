package org.albumshop.security;



import org.albumshop.domain.User;
import org.albumshop.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class UserController {
    
	
	@Autowired
    UserRepository urepo;
	   
	@Autowired
	UserService uservice;
	
	@RequestMapping("/user/main")
	public void hello() {
		
	
		
	}
	
	@RequestMapping(value="/user/login",method = RequestMethod.GET)
	public void login() {
		
		
		
	}
	
	@RequestMapping(value="/user/login",method = RequestMethod.POST)
	public void loginPost() {
		
		
		
	}
	
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public void logout() {
		
		
		
	}
	
	@GetMapping("/user/join")
	public String join() {
		
		return "/user/joinForm";
		
	}
	
	
	@PostMapping("/user/joinProc")
	public String register(User user) {
		System.out.println("==회원가입하기==");
		uservice.joinUser(user);
		
		return "/user/login";
		
	}
	
	
	
	@RequestMapping(value = "/user/IdCheck", method = RequestMethod.POST)
	@ResponseBody
	 public String IdCheck (String id) throws Exception { 
		   // System.out.println(id);
		    User user = urepo.findById(id).orElse(null);
			//System.out.println(user);
			if(user != null) {
				
				return "fail";	
				 
			} else {
				
				return "success";	
				
			}	
	
	 } 
	
	
	
	@RequestMapping(value = "/user/nickCheck", method = RequestMethod.POST)
	@ResponseBody
	 public String nickCheck (String nickName) throws Exception { 
		   // System.out.println(nickName);
		User user = urepo.findByNickName(nickName).orElse(null);
			//System.out.println(user);
			if(user != null) {
				
				return "fail";	
				 
			} else {
				
				return "success";	
				
			}	
	
	 } 
	
	
	
	@RequestMapping(value = "/user/emailCheck", method = RequestMethod.POST)
	@ResponseBody
	 public String emailCheck (String email) throws Exception { 

		User user = urepo.findByEmail(email).orElse(null);
			if(user != null) {
				
				return "fail";	
				 
			} else {
				
				return "success";	
				
			}	
	
}
	}