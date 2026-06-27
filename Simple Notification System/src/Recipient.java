public class Recipient {
    private final String email;
    private final String phone;
    private final String deviceToken;
    public Recipient(String email, String phone, String deviceToken) {
        this.email = email;
        this.phone = phone;
        this.deviceToken = deviceToken;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDeviceToken() {
        return deviceToken;
    }
}
