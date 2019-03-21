package decorate.old;

import java.net.URLEncoder;

/**
 * Created by Administrator on 2019/3/21.
 */
public class SigninForThirdService implements ISigninForThirdService {
    private ISigninService signinService;

    public SigninForThirdService(ISigninService signinService) {
        this.signinService = signinService;
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return signinService.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signinService.login(username,password);
    }
}
