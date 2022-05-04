package generics.example.person;

public class Programmer extends Human {
    private String language;
    private String level;
    private String company;

    public String getCompany() {
        return company;
    }

    public String getLanguage() {
        return language;
    }

    public String getLevel() {
        return level;
    }

    protected Programmer(ProgrammerBuilder builder) {
        super(builder);
        this.language = builder.language;
        this.level = builder.level;
        this.company = builder.company;
    }

    public static class ProgrammerBuilder extends HumanBuilder {
        private String language;
        private String level;

        private String company;

        public ProgrammerBuilder(String firstName, String lastName, String language) {
            super(firstName, lastName);
            this.language = language;
        }

        public ProgrammerBuilder withLevel(String level) {
            this.level = level;
            return this;
        }

        public ProgrammerBuilder withCompany(String company) {
            this.company = company;
            return this;
        }

        public Programmer build() {
            Programmer programmer = new Programmer(this);
            return programmer;
        }
    }

    public String printInfo(){
        return "Hey, I'm " + getFirstName() + " " + getLastName() + " from " + getAddress() + ", I work as "
                              + getLevel() + " " + getLanguage() + " developer at " + getCompany() + ".";
    }
}