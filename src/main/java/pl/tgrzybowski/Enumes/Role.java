package pl.tgrzybowski.Enumes;

public enum Role {
    ADMIN(1),USER(2),GUEST(3);

    Integer role;

    Role(Integer role) {
        this.role = role;
    }

    public Integer getRole() {
        return role;
    }
}
