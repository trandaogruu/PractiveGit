package kiss;

public class IntegrationHandlerFactory  {


    private final IntegrationHandler integrationHandler;


    public IntegrationHandlerFactory(IntegrationHandler integrationHandler) {
        this.integrationHandler = integrationHandler;
    }


    public IntegrationHandler getHandlerFor() {

//        System.out.println("PushIntegrationHandler");
        return integrationHandler;
    }

    public static void main(String[] args) {
        PushIntegrationHandler pushIntegrationHandler= new PushIntegrationHandler();
        EmailIntegrationHandler  emailIntegrationHandler = new EmailIntegrationHandler();
        System.out.println("0");
        IntegrationHandlerFactory push = new IntegrationHandlerFactory(pushIntegrationHandler);
        System.out.println("1");
        push.integrationHandler.getHandlerFor();
        System.out.println("2");
        System.out.println(push.getHandlerFor());

        push.integrationHandler.show();
        IntegrationHandlerFactory email = new IntegrationHandlerFactory(emailIntegrationHandler);
        email.integrationHandler.getHandlerFor();

        System.out.println(email.getHandlerFor());

        email.integrationHandler.show();
        System.out.println("version2");



    }
}