package guru.springframework.sfgdi.examplebeans;

public class FakeJMSBroker {

    private String username;
    private String password;
    private String url;

    public String getUsername() {
        return username;
    }

    public FakeJMSBroker setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FakeJMSBroker setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public FakeJMSBroker setUrl(String url) {
        this.url = url;
        return this;
    }
}
