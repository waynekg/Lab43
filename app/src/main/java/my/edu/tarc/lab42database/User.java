package my.edu.tarc.lab42database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "user")
public class User {
    @PrimaryKey
    @NonNull
    private String phone;

    private String firstName;

    private String lastname;

    public User() {
    }

    public User(@NonNull String phone, String firstName, String lastname) {
        this.phone = phone;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @NonNull
    public String getPhone() {
        return phone;
    }

    public void setPhone(@NonNull String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
