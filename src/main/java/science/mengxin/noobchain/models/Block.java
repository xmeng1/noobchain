package science.mengxin.noobchain.models;

import java.util.Date;
import science.mengxin.utilities.StringUtil;

/**
 * User:    mengxin
 * Date:    11/01/2018
 * Project: noobchain
 * Package: science.mengxin.noobchain.models
 * Description: Block.
 *
 * @author mengxin
 * @version 1.0
 */
public class Block {

    public String hash;
    public String previousHash;
    private String data; //our data will be a simple message.
    private long timeStamp; //as number of milliseconds since 1/1/1970.

    //Block Constructor.
    public Block(String data,String previousHash ) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash(); //Making sure we do this after we set the other values.
    }

    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        data
        );
        return calculatedhash;
    }
}
