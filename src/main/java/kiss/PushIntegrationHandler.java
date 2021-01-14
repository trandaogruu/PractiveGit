package kiss;

public class PushIntegrationHandler implements IntegrationHandler {

    private  PushIntegrationHandler pushHandler;


    @Override
    public IntegrationHandler getHandlerFor() {

        System.out.println("PushIntegrationHandler 1233122");
        return pushHandler;
    }

    public void show(){
        System.out.println("PushIntegrationHandler");
    }
}
