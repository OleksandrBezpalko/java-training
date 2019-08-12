public class Builder {
    public static void main(String[] args) {
        User user = User.newBuilder()
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

    public static Builder newBuilder() {
        return new User().new Builder();
    }

    public class Builder {
        private Builder() {}
        public Builder setId(int id) {
            User.this.id = id;
            return this;
        }
        public Builder setFirstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }
        public User build() {
            return User.this;
        }
    }
}
