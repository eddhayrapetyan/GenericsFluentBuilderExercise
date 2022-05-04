package generics.example.person;

public class Human {
    private String firstName;
    private String lastName;
    private String address;
    private long id;

    protected Human(HumanBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.id = builder.id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public long getId() {
        return id;
    }

    public static class HumanBuilder{
        private String firstName;
        private String lastName;
        private String address;
        private long id;

        public HumanBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public HumanBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public HumanBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public Human build() {
            Human human = new Human(this);

            return human;

        }
    }
}