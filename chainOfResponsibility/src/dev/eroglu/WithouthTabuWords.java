package dev.eroglu;

public class WithouthTabuWords implements Chain{
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void tryToDefine(DefinationStyle definationStyle) {
        if(definationStyle.getDesiredStyle() == "tabu"){
            System.out.println(definationStyle.getSecretWord() +" describing without " +definationStyle.getDesiredStyle() + " words");
        }else{
            nextChain.tryToDefine(definationStyle);
        }
    }
}
