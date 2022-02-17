package utilities;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import accelerators.Base;





public class EmailSend {
	public static Property configProps1=new Property("config.properties");
	
	public static void SendEmail()
	{
		
		
		String[] to={"kasi.nagasrinivas@breville.com.au","venkatesh.selvaraj@breville.com","mahesh.nellore@breville.com","ashish.kumar@breville.com"};
		String[] cc={configProps1.getProperty("cc")};
		
		
		
		
		
		sendMail(configProps1.getProperty("From"),
				configProps1.getProperty("password"),
				"smtp.gmail.com",
				"465",
				"true",
				"true",
				true,
				"javax.net.ssl.SSLSocketFactory",
				"true",
				to,
				cc,
				"",
				" ",
				Base.reportfol,Base.reportfol); 
		System.out.println("Sent successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	public  static boolean sendMail(String userName,
			String passWord,
			String host,
			String port,
			String starttls,
			String auth,
			boolean debug,
			String socketFactoryClass,
			String fallback,
			String[] to,
			String[] cc,
			
			String subject,
			String text,
			String attachmentPath,
			String attachmentName) {



//		String strReportsFolder="Firefox";

		Properties props = new Properties();

		props.put("mail.smtp.user", userName);

		props.put("mail.smtp.host", host);

		if(!"".equals(port))

			props.put("mail.smtp.port", port);

		if(!"".equals(starttls))

			props.put("mail.smtp.starttls.enable",starttls);

		props.put("mail.smtp.auth", auth);



		if(debug){

			props.put("mail.smtp.debug", "true");

		}else{

			props.put("mail.smtp.debug", "false");         

		}

		if(!"".equals(port))

			props.put("mail.smtp.socketFactory.port", port);

		if(!"".equals(socketFactoryClass))

			props.put("mail.smtp.socketFactory.class",socketFactoryClass);

		if(!"".equals(fallback))

			props.put("mail.smtp.socketFactory.fallback", fallback);



		try

		{

			Session session = Session.getDefaultInstance(props, null);

			session.setDebug(debug);

			MimeMessage msg = new MimeMessage(session);

			msg.setSubject(subject);

			BodyPart messageBodyPart1  = new MimeBodyPart();  
			
			messageBodyPart1.setContent("<span>Hi Team,</span><br/><br/><span>Please find the Breville UAT Automation Report</span> <br/><br/><span>To know the report is related to which country please view Document Title Name</span><br/><br/><br/><span>Note:Please download the file to view the report.</span>",
		             "text/html"); 
			Multipart multipart = new MimeMultipart();
			// 
			    MimeBodyPart messageBodyPart = new MimeBodyPart();

			DataSource source = 
					new FileDataSource(attachmentPath);
			messageBodyPart.setDataHandler(
					new DataHandler(source));
			messageBodyPart.setFileName(attachmentName); 
			multipart.addBodyPart(messageBodyPart);
			multipart.addBodyPart(messageBodyPart1);
			msg.setContent(multipart);
			msg.setFrom(new InternetAddress(userName));

			for(int i=0;i<to.length;i++){

				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));

			}

			for(int i=0;i<cc.length;i++){

				msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));

			}

			

			msg.saveChanges();

			Transport transport = session.getTransport("smtp");

			transport.connect(host, userName, passWord);

			transport.sendMessage(msg, msg.getAllRecipients());

			transport.close();

			return true;

		}

		catch (Exception mex)

		{

			mex.printStackTrace();

			return false;

		}

	}
	
	
	

}
