/**
 * 
 */
package com.tvd12.ezyfox.core.structure;

import lombok.Getter;

/**
 * @author tavandung12
 *
 */
public class UserLoginHandlerClass extends ServerHandlerClass {

 // structure of listener class
    @Getter
    private RequestListenerClass requestListenerClass;
    
    // structure of response handler class
    @Getter
    private ResponseHandlerClass responseHandlerClass;
    
    /**
     * @param clazz
     * @param paramTypes
     */
    public UserLoginHandlerClass(Class<?> clazz, Class<?>... paramTypes) {
        super(clazz, paramTypes);
        requestListenerClass = new RequestListenerClass(clazz);
        responseHandlerClass = new ResponseHandlerClass(clazz);
    }

}
