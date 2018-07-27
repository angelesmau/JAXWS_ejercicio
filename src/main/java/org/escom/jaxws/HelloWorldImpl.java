
package org.escom.jaxws;

import javax.jws.WebService;
import java.time.LocalDateTime;

@WebService(endpointInterface = "org.escom.jaxws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text + " son las: " + LocalDateTime.now();
    }
}

