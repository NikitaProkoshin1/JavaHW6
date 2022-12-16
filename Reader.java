package JavaHW6;

public class Reader {
    String name;
    Integer libraryCardNum;
    String faculty;
    String dateOfBirth;
    String phoneNumber;


    public Reader(String name, Integer libraryCardNum, String faculty,
                  String dateOfBirth, String phoneNumber) {
        this.name = name;
        this.libraryCardNum = libraryCardNum;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", libraryCardNum=" + libraryCardNum +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(){

    }

    public void takeBook(int books) {
        System.out.println(this.name + " взял " + books + " книг");
    }

    public void returnBook() {

    }

    public void returnBook(int books){
        System.out.println(this.name + " вернул " + books + " книг");
    }

    public static void main(String[] args) {
        Reader reader1 = new Reader("В.В. Петров", 007,
                "Гриффиндор", "01.06.1995", "123456789");
        Reader reader2 = new Reader ("А.В. Иванов", 224,
                "Слизерин", "14.07.2000", "987654321");
        System.out.println(reader1);
        System.out.println(reader2);

        reader1.takeBook(10);
        reader1.returnBook(5);

        reader2.takeBook(4);
        reader2.returnBook(3);
    }

}
