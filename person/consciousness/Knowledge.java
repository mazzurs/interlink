package person.consciousness;

public class Knowledge {
    private int languageLevel;
    private int programmingLevel;

    public Knowledge(int languageLevel, int programmingLevel) {
        this.languageLevel = languageLevel;
        this.programmingLevel = programmingLevel;
    }

    public int getLanguageLevel(){
        return languageLevel;
    }

    public int getProgrammingLevel(){
        return programmingLevel;
    }
}
