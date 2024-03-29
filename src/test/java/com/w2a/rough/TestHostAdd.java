package com.w2a.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.w2a.utilities.MonitoringMail;
import com.w2a.utilities.TestConfig;

public class TestHostAdd {

	public static void main(String[] args) throws UnknownHostException, AddressException, MessagingException {
		
		MonitoringMail mail = new MonitoringMail();
//		System.out.println(InetAddress.getLocalHost().getHostAddress());
		String messageBody = "http://"+ InetAddress.getLocalHost().getHostAddress() +":8080/job/DataDrivenFramework/Extent_20Report/";
		System.out.println(messageBody);
		
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
	}

}
