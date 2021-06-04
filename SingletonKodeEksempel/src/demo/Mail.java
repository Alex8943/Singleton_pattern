package demo;

public class Mail extends Main {
    /*
            Hvis flere tråde læser og skriver i den samme variabel så kan der opstå Concurrency problemer. Det vil sige at man ikke kan stole på resultatet.
            For at undgå det problem er det en fordel at opbygge koden på en sådan måde, at trådene deler så få attributter som muligt, og sikre at en variabel ikke er i brug i en anden tråd. Til det sidstnævnte formål (at sikre at variablen ikke er i brug i andre tråde) l har Java et keyword der hedder isAlive().

     */


        public static int amount = 1;

        public static void main(String[] args) {


            Main thread = new Main();
            thread.start();
// Venter på tråden til den er færdig
            while(thread.isAlive()) { //s længe den er true, venter den
                System.out.println("Waiting.....");
            }

// Update amount og skriv dens værdi
            System.out.println("Main: " + amount);
            amount++;
            System.out.println("Main: " + amount);
        }

    }

