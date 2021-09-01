package dev.eroglu;

public class Main {

    public static void main(String[] args) {
        Chain defineStyle1 = new WithouthTabuWords();
        Chain defineStyle2 = new WithPuppet();
        Chain defineStyle3 = new ByDrawing();
        Chain defineStyle4 = new In15Words();

        defineStyle1.setNextChain(defineStyle2);
        defineStyle2.setNextChain(defineStyle3);
        defineStyle3.setNextChain(defineStyle4);

        DefinationStyle word0 = new DefinationStyle("ball", "tabu");
        DefinationStyle word1 = new DefinationStyle("computer", "drawing");
        DefinationStyle word2 = new DefinationStyle("Trump", "puppet");
        DefinationStyle word3 = new DefinationStyle("dog", "15");
        DefinationStyle word4 = new DefinationStyle("table", "tell");

        defineStyle1.tryToDefine(word0);
        defineStyle1.tryToDefine(word1);
        defineStyle1.tryToDefine(word2);
        defineStyle1.tryToDefine(word3);
        defineStyle1.tryToDefine(word4);

    }
}
