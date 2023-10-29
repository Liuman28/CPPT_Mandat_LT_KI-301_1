/**
 * Lab2 package
 */
package ki301.mandat.lab2;


import java.io.*;

/**
 * Phone Application class implements main method for Phone
 * class possibilities demonstration
 * @author mandat
 * @version 1.0
 * @see Phone
 */

public class PhoneApps {

    public static void main(String[] args) throws FileNotFoundException {
        Phone xphone = new Phone(90);
        xphone.showCharge();
        //Call
        xphone.callTO("380991704667");
        xphone.showCharge();
        //make Picture
        xphone.makePicture();
        xphone.showCharge();
        //turn off camera
        xphone.turnOn_Off();
        //Make picture with turned off camera
        xphone.makePicture();
        //Change Volume
        xphone.clickUpButton();
        xphone.clickDownButton(4);
        //Invalid call
        xphone.callTO("1111111");
        xphone.showCharge();
        //End
        xphone.fileClose();

    }
}

