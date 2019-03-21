package decorate.v1;

/**
 * Created by Administrator on 2019/3/21.
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg()+"+一根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
