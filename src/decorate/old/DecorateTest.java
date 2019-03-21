package decorate.old;

/**
 * Created by Administrator on 2019/3/21.
 */
public class DecorateTest {
    public static void main(String[] args) {
        ISigninForThirdService signinForThirdService= new SigninForThirdService(new SigninService());
            signinForThirdService.loginForQQ("");
        //为某个类实现动态增加或者覆盖原有方法的情况，采用装饰器模式
        }

}
