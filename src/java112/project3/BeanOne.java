package java112.project3;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author    eknapp
 */
public class BeanOne extends java.lang.Object {

    private  String  mySpecialData;


    /**
     *  Constructor for the BeanOne object
     */
    public BeanOne() {
        mySpecialData  = "default value";
    }


    /**
     *  Gets the mySpecialData attribute of the BeanOne object
     *
     *@return    The mySpecialData value
     */
    public String getMySpecialData() {
        return mySpecialData;
    }


    /**
     *  Sets the mySpecialData attribute of the BeanOne object
     *
     *@param  mySpecialData  The new mySpecialData value
     */
    public void setMySpecialData(String mySpecialData) {
        this.mySpecialData = mySpecialData;
    }

}
