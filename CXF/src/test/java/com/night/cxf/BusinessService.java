
package com.night.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BusinessService", targetNamespace = "http://service.cxf.night.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BusinessService {


    /**
     * 
     * @param param
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "echo", targetNamespace = "http://service.cxf.night.com/", className = "com.night.cxf.service.Echo")
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://service.cxf.night.com/", className = "com.night.cxf.service.EchoResponse")
    public String echo(
            @WebParam(name = "param", targetNamespace = "")
                    String param);

}
