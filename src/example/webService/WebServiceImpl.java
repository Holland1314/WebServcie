package example.webService;

/**
 * Created by shileichao on 2018/4/3.
 */
@javax.jws.WebService
public class WebServiceImpl implements WebService {
    @Override
    public String sayHello(String name) {
        System.out.println("WebService我来了");
        String w = "WebService我来了"+name;
        return w;
    }
}
