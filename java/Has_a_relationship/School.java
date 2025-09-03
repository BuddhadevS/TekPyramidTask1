package Has_a_relationship;
class IdCard {
    String idNumber;

    IdCard(String idNumber) {
        this.idNumber = idNumber;
    }

    void showId() {
        System.out.println("ID Card: " + idNumber);
    }
}

class Student {
    String name;
    IdCard card; // Composition

    Student(String name, String idNumber) {
        this.name = name;
        this.card = new IdCard(idNumber); // Strong binding
    }

    void showStudent() {
        System.out.println("Student: " + name);
        card.showId();
    }
}
