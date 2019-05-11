import javax.inject.Inject;

public class TextEditor {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck()
    {
        this.spellChecker.checkSpelling();
    }
}
