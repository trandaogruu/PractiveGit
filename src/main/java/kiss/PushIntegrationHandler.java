package kiss;

public class PushIntegrationHandler implements IntegrationHandler {



    @Override
    public IntegrationHandler getHandlerFor() {

        System.out.println("PushIntegrationHandler 1233122");
        return new PushIntegrationHandler();
    }

    public void show(){
        System.out.println("PushIntegrationHandler");
    }
}
