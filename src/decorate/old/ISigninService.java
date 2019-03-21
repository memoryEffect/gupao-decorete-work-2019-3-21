package decorate.old;

/**
 * Created by Administrator on 2019/3/21.
 */
public interface ISigninService {
    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    ResultMsg regist(String username,String password);

    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username,String password);

}
