package lab10.ex2.ex4;

public interface PhoneBook {
    void addPerson(Student p);

    Student searchByName(String name);

    Student searchByLastName(String lastname);

    Student searchByNumber(String phone);

    void deleteByNumber(String phone);
}
