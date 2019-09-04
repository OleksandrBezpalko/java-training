public class BuilderApp {
    public static void main(String[] args) {
        User user = new Builder()
                .setId(0)
                .setFirstName("John")
                .setLastName("Doe")
                .build();
        System.out.println(user.toString());
    }
}

class User {
    private int id;
    private String firstName;
    private String lastName;

    private User() {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

    public class Builder {
        private User user;

        private Builder() {}

        public Builder setId(int id) {
            user.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            user.lastName = lastName;
            return this;
        }

        public User build() {
            return user;
        }
    }
