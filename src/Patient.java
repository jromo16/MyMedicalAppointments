public class Patient {
    // Atributos
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weith;
    private double height;
    private String blood;

    // Constructor
    Patient(String name, String email){
        this.name = name;
        this.email = email;
        System.out.println(weith + " kg.");
    }

    // Métodos Getters and Setters
    public void setWeith(double weith) {
        this.weith = weith;
    }

    public String getWeith() {
        return weith + " kg.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        if (phoneNumber.length() != 9){
            System.out.println("El número telefónico debe ser de 9 dígitos");
        } else if (phoneNumber.length() == 9) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " Mtrs.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
