package cn.hackcoder.domain;

/**
 * Created by hackcoder on 15-11-27.
 */
public class User extends BaseDomain {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
