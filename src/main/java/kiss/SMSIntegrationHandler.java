package kiss;

public class SMSIntegrationHandler implements IntegrationHandler {

    private  SMSIntegrationHandler smsHandler;

    @Override
    public IntegrationHandler getHandlerFor() {
        System.out.println("SMSIntegrationHandler");
        return smsHandler;
    }

    @Override
    public void show() {
        System.out.println("SMSIntegrationHandler");
    }
}
