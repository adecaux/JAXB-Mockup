/**
 * LWIntegrationServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package lwintegrationsvc.loyaltyware.brierley;

import lwintegrationsvc.loyaltyware.brierley.exceptions.OperationFailureException;

import org.datacontract.schemas._2004._07.brierley_loyaltyware_lwintegrationsvc.LWAPIResponse;

/**
 * LWIntegrationServiceSkeleton java skeleton for the axisService
 */
public class LWIntegrationServiceSkeleton {

	private static final String GET_MEMBERS_EXT = "GetMembersExt";
	private static final String ADD_MEMBER = "AddMember";
	private static final int ANY_TIME = 45555;
	private static final String FAILURE_DESCRIPTION = "Failed";
	private static final String SUCCESS_DESCRIPTION = "Success";
	private static final int SUCCESS_CODE = 0;
	private static final String NOT_YET_IMPLEMENTED_CODE = "9999";
	private static final String NOT_YET_IMPLEMENTED_DESCRIPTION = "Not yet implemented";
	private WSManager webServiceManager = null;
	
	
	public LWIntegrationServiceSkeleton(){
		webServiceManager = new WSManagerImpl();
	}
	/**
	 * 
	 * @param execute
	 * @return executeResponse
	 */
	public ExecuteResponse execute(Execute execute) {

		String payload = execute.getPayload();
		String responsePayload = null;
		ExecuteResponse response = new ExecuteResponse();
		LWAPIResponse lWAPIResponse = new LWAPIResponse();
		try {
			switch (execute.getOperationName()) {
			case ADD_MEMBER:
				responsePayload = webServiceManager.addMember(payload);
				break;
			case GET_MEMBERS_EXT:
				responsePayload = webServiceManager.getMemberExt(payload);
				break;
			default:
				throw new OperationFailureException(NOT_YET_IMPLEMENTED_CODE, NOT_YET_IMPLEMENTED_DESCRIPTION);
			}
			lWAPIResponse.setResponseCode(SUCCESS_CODE);
			lWAPIResponse.setResponseDescription(SUCCESS_DESCRIPTION);
			
		} catch(OperationFailureException ex) {
			responsePayload = ex.getResponsePayload();
			lWAPIResponse.setResponseCode(Integer.parseInt(ex.getMessage()));
			lWAPIResponse.setResponseDescription(FAILURE_DESCRIPTION);
		}

		lWAPIResponse.setResponseDetail(responsePayload);
		lWAPIResponse.setElapsedTime(ANY_TIME);
		response.setExecuteResult(lWAPIResponse);
		return response;
	}
}