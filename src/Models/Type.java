package Models;

public class Type extends Role{
    String name;

    public Type(Role role, String name1) {
        super(role.name);
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
