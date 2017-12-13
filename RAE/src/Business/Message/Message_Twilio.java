/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Message;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author Romell
 */
public class Message_Twilio {
    
    


  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACd3e662ed22eb0ed897a9338c5dea4f7e";
  public static final String AUTH_TOKEN = "e612aad60be6134cb520f4c9b94dd477";

  public static void send_Message (String contact,String patientName) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+15558675309"),
        new PhoneNumber(contact), "Emergency for your relative"+patientName+" please contact hospital immediately").create();

    
}

    
    }

    

