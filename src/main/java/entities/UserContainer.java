package entities;

public class UserContainer {
    private User user;
    private int id;
    private int serialNumber;

    public UserContainer(User user, int id, int serialNumber) {
        this.user = user;
        this.id = id;
        this.serialNumber = serialNumber;
    }

    public UserContainer() {
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
