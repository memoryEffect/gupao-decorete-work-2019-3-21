package decorate.v2;

/**
 * Created by Administrator on 2019/3/21.
 */
public class EggDecorate extends  BattercakeDecorete {
    public EggDecorate(Battercake battercake){
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() +"+一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
