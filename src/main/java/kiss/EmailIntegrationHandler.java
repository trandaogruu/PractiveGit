package kiss;


public class EmailIntegrationHandler implements IntegrationHandler {
    private  EmailIntegrationHandler emailHandler;

    @Override
    public IntegrationHandler getHandlerFor() {

        System.out.println("EmailIntegrationHandler");
        return emailHandler;
    }

    @Override
    public void show() {
        System.out.println("EmailIntegrationHandler");
    }
}
