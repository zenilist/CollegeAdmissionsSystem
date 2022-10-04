public class LoginApplication implements logger {
    private Application application;
    public LoginApplication(Application application){
        this.application = application;
    }
    @Override
    public void execute() {
        application.login();
    }
}
