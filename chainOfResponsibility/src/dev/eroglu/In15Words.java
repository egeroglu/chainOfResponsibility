package dev.eroglu;

public class In15Words implements Chain{
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void tryToDefine(DefinationStyle definationStyle) {
        if(definationStyle.getDesiredStyle() == "15"){
            System.out.println(definationStyle.getSecretWord() +" describing in " +definationStyle.getDesiredStyle()+" words");
        }else{
            System.out.println("You should chose: tabu, 15words, drawing or puppet");
        }
    }
}
