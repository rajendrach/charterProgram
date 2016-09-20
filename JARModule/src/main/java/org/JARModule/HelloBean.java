package org.JARModule;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@LocalBean
public class HelloBean {

    /**
     * Default constructor. 
     */
    public HelloBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String sayHello() {
    	
    	
    			try {
    				HelloStatefulBean helloBean = (HelloStatefulBean) new InitialContext().lookup("java:module/HelloStatefulBean");
    				 helloBean.setCounter(helloBean.getCounter()+1);
    				return "Hello From StatelessBean"+helloBean.getCounter();
    			} catch (NamingException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        return "Hello From StatelessBean";
    }

}
