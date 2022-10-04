public class SignUpApplication implements logger {
    private Application application;

    public SignUpApplication(Application application){
        this.application = application;
    }

    @Override
    public void execute() {
        application.signUp();
    }
}
