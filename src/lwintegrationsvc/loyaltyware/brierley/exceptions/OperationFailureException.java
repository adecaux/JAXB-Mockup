package lwintegrationsvc.loyaltyware.brierley.exceptions;

public class OperationFailureException extends Exception {

	private static final long serialVersionUID = 1L;
	private String responsePayload;

	public OperationFailureException() {
		super();
	}

	public OperationFailureException(String message, String responsePayload) {
		super(message);
		this.responsePayload = responsePayload;
	}

	public OperationFailureException(String message, Throwable cause) {
		super(message, cause);
	}

	public OperationFailureException(Throwable cause) {
		super(cause);
	}

	public String getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(String responsePayload) {
		this.responsePayload = responsePayload;
	}
}
