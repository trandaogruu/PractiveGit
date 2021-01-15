package kiss;


public class EmailIntegrationHandler implements IntegrationHandler {


    @Override
    public IntegrationHandler getHandlerFor() {

        System.out.println("EmailIntegrationHandler");
        return new EmailIntegrationHandler();
    }

    @Override
    public void show() {
        System.out.println("EmailIntegrationHandler");
    }
}
