package demo;

public class DatabaseSynchronized

    /*
        Tråd programmering kan give et problem. Når flere tråde køre i et Java program så ønsker vi ikke at trådene laver flere database objekter. Vi vil kun:have et database objekt. Løsningen på det problem er følgende:. .
        Java har et Keyword der hedder synchronized. Det kan bruges til at sikre at der kun bliver dannet et database objekt selvom der anvendes flere tråde.
        Eksempel:
     */
{
    private static DatabaseSynchronized singleObject;
    private int record;
    private String name;

    private DatabaseSynchronized(String n) {
        name = n;
        record = 0;
    }
    public static synchronized DatabaseSynchronized getInstance(String n) {
        if (singleObject == null) {
            singleObject = new DatabaseSynchronized(n);
        }
        return singleObject;
    }
    public void editRecord(String operation){
        System.out.println("Performing a" + operation + " operation on record" + record + "in database" + name);
    }

    public String getName() {
        return name;
    }
}

