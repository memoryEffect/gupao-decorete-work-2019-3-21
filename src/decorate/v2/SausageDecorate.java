package decorate.v2;

/**
 * Created by Administrator on 2019/3/21.
 */
public class SausageDecorate extends BattercakeDecorete {

    public SausageDecorate(Battercake battercake) {
        super(battercake);
    }
    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"+一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
