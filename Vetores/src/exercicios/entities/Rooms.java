package exercicios.entities;

public class Rooms {
    private int room;
    private String owner;
    private String email;

    // Getters

    public int getRoom() { return room; }

    public String getOwner() { return owner; }

    public String getEmail() { return email; }

    // Setters

    public void setRoom(int room) { this.room = room; }

    public void setOwner(String owner) { this.owner = owner; }

    public void setEmail(String email) { this.email = email; }

    // Constructors
    public Rooms(String owner, String email, int room) {
        setRoom(room);
        setOwner(owner);
        setEmail(email);
    }

    public String toString() {
        return "\n" + getRoom() + ": " + getOwner() + ", " + getEmail();
    }
}
