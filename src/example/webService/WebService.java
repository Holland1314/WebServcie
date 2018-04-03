package example.webService;

import javax.jws.WebMethod;

/**
 * Created by shileichao on 2018/4/3.
 */
@javax.jws.WebService
public interface WebService {
    @WebMethod
    String sayHello(String name);
}
