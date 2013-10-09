package lwintegrationsvc.loyaltyware.brierley;

import lwintegrationsvc.loyaltyware.brierley.exceptions.OperationFailureException;


public interface WSManager {

	public String addMember(String payload) throws OperationFailureException;

	public String getMemberExt(String payload) throws OperationFailureException;
}
