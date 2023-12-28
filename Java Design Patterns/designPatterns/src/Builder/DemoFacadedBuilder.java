package Builder;

/* Builder pattern */
// Facade builder = builder pattern + facade


class PersonEmployee {
    // address
    public String streetAddress, postcode, city;

    // employment
    public String companyName, position;
    public int annualIncome;

    @Override
    public String toString() {
        return "PersonEmployee{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}

// builder facade
class PersonBuilderEmployee {
    protected PersonEmployee person = new PersonEmployee();

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public PersonEmployee build() {
        return person;
    }
}


class PersonAddressBuilder extends PersonBuilderEmployee {
    public PersonAddressBuilder(PersonEmployee person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder withPostCode(String postCode) {
        person.postcode = postCode;
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.city = city;
        return this;
    }
}

class PersonJobBuilder extends PersonBuilderEmployee {
    public PersonJobBuilder(PersonEmployee person) {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName) {
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.annualIncome = annualIncome;
        return this;
    }
}

public class DemoFacadedBuilder {
    public static void main(String[] args) {
        PersonBuilderEmployee pb = new PersonBuilderEmployee();
        PersonEmployee person = pb
                .lives()
                .at("123 London Road")
                .in("London")
                .withPostCode("SW12BC")
                .works()
                .asA("Developer")
                .earning(12345)
                .build();

        System.out.println(person);
    }
}
