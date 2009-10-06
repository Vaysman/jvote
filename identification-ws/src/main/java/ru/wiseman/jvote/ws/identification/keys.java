/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.wiseman.jvote.ws.identification;

import java.security.spec.X509EncodedKeySpec;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author vaysman
 */
@WebService()
public class keys {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCECPublicKey")
    public String getCECPublicKey() {
        return "key";
    }
}
