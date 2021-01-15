package kiss;

public class SMSIntegrationHandler implements IntegrationHandler {


    @Override
    public IntegrationHandler getHandlerFor() {
        System.out.println("SMSIntegrationHandler");
        return new SMSIntegrationHandler();
    }

    @Override
    public void show() {
        System.out.println("SMSIntegrationHandler");
    }
}
