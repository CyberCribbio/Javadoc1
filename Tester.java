/**
 * autore Cristian
 *
  */
public class Tester {
        public Tester() {
        }

     /**
      *
      * @param args
      */
        public static void main(String[] args) {
            WordGames wordGames = new WordGames();
            System.out.println("addHelloToWord result: " + wordGames.addHelloToWord("Mario"));
            System.out.println("getFullName result: " + wordGames.getFullName("Mario", "Rossi"));
        }
    }