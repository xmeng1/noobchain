package science.mengxin.noobchain.demo;

import science.mengxin.noobchain.models.Block;

/**
 * User:    mengxin
 * Date:    11/01/2018
 * Project: noobchain
 * Package: science.mengxin.noobchain.demo
 * Description: NoobChain.
 *
 * @author mengxin
 * @version 1.0
 */
public class NoobChain {

    public static void main(String[] args) {

        Block genesisBlock = new Block("Hi im the first block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);

    }
}
