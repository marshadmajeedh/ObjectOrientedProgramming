public class Recipient {
    private String email;
    private String phone;
    private String deviceToken;
    public Recipient(String email, String phone, String deviceToken) {
        setEmail(email);
        setPhone(phone);
        setDeviceToken(deviceToken);
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
    public String getDeviceToken() {
        return deviceToken;
    }
}
