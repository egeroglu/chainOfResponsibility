package dev.eroglu;

public interface Chain {
    public void setNextChain(Chain nextChain);

    public void  tryToDefine(DefinationStyle definationStyle);
}
