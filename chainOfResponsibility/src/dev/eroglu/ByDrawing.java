package dev.eroglu;

public class ByDrawing implements Chain{
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void tryToDefine(DefinationStyle definationStyle) {
        if(definationStyle.getDesiredStyle() == "drawing"){
            System.out.println(definationStyle.getSecretWord() +" describing by " +definationStyle.getDesiredStyle());
        }else{
            nextChain.tryToDefine(definationStyle);
        }
    }
}
