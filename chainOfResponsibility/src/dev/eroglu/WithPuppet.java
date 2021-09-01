package dev.eroglu;

public class WithPuppet implements Chain{
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void tryToDefine(DefinationStyle definationStyle) {
        if(definationStyle.getDesiredStyle() == "puppet"){
            System.out.println(definationStyle.getSecretWord() +" describing with " +definationStyle.getDesiredStyle());
        }else{
            nextChain.tryToDefine(definationStyle);
        }
    }
}
