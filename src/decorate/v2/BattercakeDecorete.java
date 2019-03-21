package decorate.v2;

/**
 * Created by Administrator on 2019/3/21.
 */
public abstract class BattercakeDecorete extends Battercake {

    private Battercake battercake;

    public BattercakeDecorete(Battercake battercake){
        this.battercake = battercake;
    }

    protected abstract  void doSomething();
    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
