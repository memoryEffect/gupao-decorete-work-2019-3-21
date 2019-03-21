package decorate.v1;

/**
 * Created by Administrator on 2019/3/21.
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    protected String getMsg() {
        return super.getMsg()+"+一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
