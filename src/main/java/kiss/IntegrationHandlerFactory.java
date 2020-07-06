package kiss;

public class IntegrationHandlerFactory {

    private static final String EMAIL = "abc";
    private static final String SMS = "dce";
    private static final String PUSH = "glk";
    private final EmailIntegrationHandler emailHandler;
    private final SMSIntegrationHandler smsHandler;
    private final PushIntegrationHandler pushHandler;

    public IntegrationHandlerFactory(EmailIntegrationHandler emailHandler,
                                     SMSIntegrationHandler smsHandler,
                                     PushIntegrationHandler pushHandler) {
        this.emailHandler = emailHandler;
        this.smsHandler = smsHandler;
        this.pushHandler = pushHandler;
    }

    public IntegrationHandler getHandlerFor(String integration) {
        if (EMAIL.equals(integration)) {
            return emailHandler;
        } else if (SMS.equals(integration)) {
            return smsHandler;
        } else if (PUSH.equals(integration)) {
            return pushHandler;
        } else {
            throw new IllegalArgumentException("No handler found for integration: " + integration);
        }

    }
}