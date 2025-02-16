
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "lcpm", targetNamespace = "http://ws/", className = "proxy.Lcpm")
    @ResponseWrapper(localName = "lcpmResponse", targetNamespace = "http://ws/", className = "proxy.LcpmResponse")
    @Action(input = "http://ws/BanqueService/lcpmRequest", output = "http://ws/BanqueService/lcpmResponse")
    public List<Compte> lcpm();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://ws/", className = "proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://ws/", className = "proxy.ConvertResponse")
    @Action(input = "http://ws/BanqueService/ConvertRequest", output = "http://ws/BanqueService/ConvertResponse")
    public double convert(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cmp", targetNamespace = "http://ws/", className = "proxy.Cmp")
    @ResponseWrapper(localName = "cmpResponse", targetNamespace = "http://ws/", className = "proxy.CmpResponse")
    @Action(input = "http://ws/BanqueService/cmpRequest", output = "http://ws/BanqueService/cmpResponse")
    public Compte cmp(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
