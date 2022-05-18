/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poetask2;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author danielsantos
 */
public class POETask2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        String [] Options = {"Add Task", "Show Report(Coming Soon)","Cancel"};
        
     int Val = JOptionPane.showOptionDialog(
               null, //ignore
               "Please select an Option", //Message Text
               "Task Option", //Title
               JOptionPane.YES_NO_CANCEL_OPTION, //Allows the 3 button option
               JOptionPane.PLAIN_MESSAGE, //OptionPane
               null, //ignore
               Options, //Array
               0); 
                
       System.out.println(Val);
       
    while(Val !=1){
    
        
        if(Val == 0){
        
           TaskNum();
          break;
        
        }
        
        if(Val == 2){
           //this closes the app 
            break;
        }
        
    
       
       if(Val == 1){
       
           int Val;
       
        }
      }
             
    }
    
    public static boolean TaskNum(){
    
    String Number = JOptionPane.showInputDialog("Please Add Number of Tasks:");
   
    int a = Integer.parseInt(Number);
   
    
    for(int i = 0;i<a;i++){
        
    TaskMaker();
        
    
    }
    
    return true;
    }
    
    public static boolean TaskMaker(){
    
      String TName =   JOptionPane.showInputDialog("Enter Task Name: ");
        
        String TNum = JOptionPane.showInputDialog("Add Task Number: ");
        
        String Desc = JOptionPane.showInputDialog("Task Description: ");
        
        Pattern P = Pattern.compile("((?=.*[a-z]).{0,50})");
        
        Matcher M = P.matcher(Desc);
        
        if(M.matches()){
         
            JOptionPane.showMessageDialog(null, "Task successfully captured");
        
        } else
        {
        
         JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
        
        }
        
        
        
       String DevDet = JOptionPane.showInputDialog("Developer Details (First Name & Last Name)");
        
        String Dur = JOptionPane.showInputDialog("Task Duration (Hours)");

        
        String Tn = TName.substring(0,2);
        String Last3 = DevDet.substring(DevDet.length()-3);
        
        
        JOptionPane.showMessageDialog(null, "Task ID -" +(Tn + ":" + TNum + ":" + Last3).toUpperCase());
       
                
        
        
        
       String [] Status = {"To Do","Doing","Done"};
        int Stat = JOptionPane.showOptionDialog(
                null,
                "Please select Task Status", 
                "Status", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                null,
                Status,
                0);
        
        
     JOptionPane.showMessageDialog(
             null,
             "Task Status: " + Stat + "\n" +
             "Develope Details: " + DevDet + "\n" +
             "Task Numer: " + TNum + "\n" +
             "Task Description: " +  Desc + "\n" +
             "Task ID -  " + ((Tn + ":" + TNum + ":" + Last3).toUpperCase()) + "\n" +
             "Dutation : " + Dur + "Hours"
             
             
             ); 
        
    return true;
    }
    
}
     
