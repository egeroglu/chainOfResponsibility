package dev.eroglu;

public class DefinationStyle {

    private String secretWord;

    private String desiredStyle;

    public DefinationStyle(String secretWord, String desiredStyle) {
        this.secretWord = secretWord;
        this.desiredStyle = desiredStyle;
    }
    public String getSecretWord(){
        return secretWord;
    }
    public String getDesiredStyle(){
        return desiredStyle;
    }
}
