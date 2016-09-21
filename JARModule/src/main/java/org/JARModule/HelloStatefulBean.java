package org.JARModule;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;

/**
 * Session Bean implementation class HelloStatefulBean
 */
@Stateful
@StatefulTimeout(10000000)
@LocalBean
public class HelloStatefulBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8905973571026450268L;
	
	/**
     * Default constructor. 
     */
	private int counter =0;
    public void setCounter(int counter) {
		this.counter = counter;
	}

	public HelloStatefulBean() {
        // TODO Auto-generated constructor stub
    }
    
    public int getCounter(){
    	return counter;
    }

}
