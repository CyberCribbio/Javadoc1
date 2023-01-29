/**
 * L'autore della classe è Cristian
 * La classe specifica nome e cognome
 */
public class WordGames {
    public WordGames() {
    }

    /**
     *
     * @param word
     * @return
     */
    public String addHelloToWord(String word) {
        return "Hello " + word;
    }

    /**
     *
     * @param name
     * @param surname
     * @return
     */
    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
}

