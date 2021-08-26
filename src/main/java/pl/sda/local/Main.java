package pl.sda.local;

public class Main {

    public static void main(String[] args) {
        final int someVariable = 3; // zmienna do zaprezentowania dostępu zmiennych z klas lokalnych
        class Name { // stworzenie definicji klasy lokalnej, bez modyfikatora dostępu
            private final String firstName;
            private final String lastName;

            public Name(final String firstName, final String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getReadableName() {
                System.out.println("Hey I can use outer variable " + someVariable);
                return firstName + " " + lastName;
            }
        }
        System.out.println(new Name("Edek", "Kowalski").getReadableName());
    }
}
