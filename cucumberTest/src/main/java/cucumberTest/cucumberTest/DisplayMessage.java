package cucumberTest.cucumberTest;

public class DisplayMessage {
	
	private String msg;					

    public DisplayMessage(String msg1,String msg2) {					
        this.msg= msg1;	
        this.msg=msg2;
        
        System.out.println("Message inside Display message method");
    }		
    		
public String CurrentMsg(){		
    		
    System.out.println(msg);					
    		
    return msg;					
}    		
    		
public String printGoodMorningMessage(){		
    		
    msg="Good Morning Everyone"+ " "+msg;							
    		
    System.out.println(msg);					
    		
    return msg;					
}    

public String printGoodEveningMessage(){		
	
    msg="Good Evening Everyone\n"+ msg;							
    		
    System.out.println(msg);					
    		
    return msg;					
}    
    		

}
