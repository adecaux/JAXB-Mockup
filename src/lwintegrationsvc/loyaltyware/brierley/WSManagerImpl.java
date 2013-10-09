package lwintegrationsvc.loyaltyware.brierley;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lwintegrationsvc.loyaltyware.brierley.exceptions.OperationFailureException;

public class WSManagerImpl implements WSManager{

	private Properties prop = null;
	
	public WSManagerImpl(){
		prop = new Properties();
		try {
			prop.load(getClass().getClassLoader().getResourceAsStream("responses.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String addMember(String payload) throws OperationFailureException{
		String responsePayload = null;
		System.out.println("###### REQUEST ########");
		System.out.println(payload);
		if (payload.contains("arvato@arvato.com") || (payload.contains("arvato1@arvato.com")) || (payload.contains("arvato2@arvato.com"))){
			String responseCode = prop.getProperty("add_member_response_already_exists_code");
			String responseDesctiption = prop.getProperty("add_member_response_already_exists_description");
			responsePayload = responseCode + " - " + responseDesctiption;
			throw new OperationFailureException(responseCode, responsePayload);
		} else if (payload.contains("arvato3@arvato.com") || (payload.contains("arvato4@arvato.com")) || (payload.contains("arvato5@arvato.com"))) {;
			throw new OperationFailureException("9999", "Other Error");
		} else {
			String email = extractEmailFromAddMemberRequest(payload);
			String cardType = extractCardType(payload);
			responsePayload = prop.getProperty("add_member_response_OK");
			responsePayload = replaceEmailAndCardType(responsePayload, email, cardType);
		}
		System.out.println("###### RESPONSE ########");
		System.out.println(responsePayload);
		return responsePayload;
	}

	@Override
	public String getMemberExt(String payload) throws OperationFailureException{
		String responsePayload = null;
		System.out.println("###### REQUEST ########");
		System.out.println(payload);
		if (payload.contains("arvato@arvato.com") || (payload.contains("arvato3@arvato.com")) || (payload.contains("arvato6@arvato.com"))){
			String responseCode = prop.getProperty("get_member_ext_response_no_member_found_code");
			String responseDesctiption = prop.getProperty("get_member_ext_response_no_member_found_description");
			responsePayload = responseCode + " - " + responseDesctiption;
			throw new OperationFailureException(responseCode, responsePayload);
		} else if ((payload.contains("arvato1@arvato.com")) || (payload.contains("arvato4@arvato.com")) || (payload.contains("arvato7@arvato.com"))){;
			throw new OperationFailureException("9999", "Other Error");	
		} else {
			String email = extractEmailFromGetMemberRequest(payload);
			String cardType = extractCardType(payload);
			responsePayload = prop.getProperty("get_member_ext_response_OK");
			responsePayload = replaceEmailAndCardType(responsePayload, email, cardType);
		}
		System.out.println("###### RESPONSE ########");
		System.out.println(responsePayload);
		return responsePayload;
	}

	private String extractCardType(String payload) {
		String cardType = null;
		if (payload.contains("LEVISDETAILS")) {
			cardType = "1";
		} else {
			cardType = "2";
		}
		return cardType;
	}

	private String extractEmailFromAddMemberRequest(String payload) {
		Pattern subFix = Pattern.compile("PrimaryEmailAddress=\"");
		Matcher match = subFix.matcher(payload);
		match.find();
		int index = match.start();
		String substring = payload.substring(index);
		substring = substring.replace("PrimaryEmailAddress=\"", "");
		String[] parts = substring.split("\"");
		return parts[0];
	}
	
	private String extractEmailFromGetMemberRequest(String payload) {
		Pattern subFix = Pattern.compile("<Value>");
		Matcher match = subFix.matcher(payload);
		match.find();
		match.find();
		int index = match.start();
		String substring = payload.substring(index);
		substring = substring.replace("<Value>", "");
		String[] parts = substring.split("<");
		return parts[0];
	}

	private String replaceEmailAndCardType(String responsePayload, String email, String cardType) {
		responsePayload = responsePayload.replaceAll("EMAIL_TO_CHANGE", email);
		responsePayload = responsePayload.replaceAll("CARDTYPE_TO_CHANGE", cardType);
		if (email.equals("arvato8@arvato.com")){
			responsePayload = responsePayload.replaceAll("STATUS_TO_CHANGE", "InActive");
		} else {
			responsePayload = responsePayload.replaceAll("STATUS_TO_CHANGE", "Active");
		}
		return responsePayload;
	}

	/**
	 * 
	 * @param value
	 */
	public void anotherMethod(int value){
		Integer anInt = new Integer(value);

		String query = "select u.name, u.ci from ";
		query += "users u";
	}
}
