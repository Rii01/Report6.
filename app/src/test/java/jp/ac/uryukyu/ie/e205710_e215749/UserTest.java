/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e205710_e215749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class UserTest {
    @Test 
    public void User(){

        int t = 3;
        Scanner write = new Scanner (System.in);
        assertNotEquals(write.nextInt(3), (t));
        write.close();
    }


}