/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.youngworldproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alpha
 */
public class YoungWorldProject {

    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
               System.out.println("GIVE THE INPUT FOR ROW AND COLUMS FOR APHABETIC LETTERS");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
       
        char arr[][] = new char[n][m];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (char) (rand.nextInt(26) + 'a');
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("GIVE THE ANY WORD FROM THIS MATRIX AND ROGRAM WILL FIND YOU THE WORD HORZIONTALLY OR VERTICALLY OR DIOGONALLY4");
        sc.nextLine();
        String key = sc.nextLine();


        if(checkKeyHorizontal(arr, key))
        {
            System.out.println("Found in horizontal");
        }
        else if(!(checkKeyHorizontal(arr, key)))
        {
            System.out.println("Didnot found in horizontal");
        }
        if(checkKeyVertical(arr, key))
        {
            System.out.println("Found in vertical");
        }
        else if(!(checkKeyVertical(arr, key)))
        {
            System.out.println("Didnot found in vertical");
        }
        if(checkKeyDiagonally(arr, key))
        {
            System.out.println("Found in diagonal");
        }
        else if(!(checkKeyDiagonally(arr, key)))
        {
            System.out.println("Didnot found in diagonal");
        }



    }

    public static boolean checkKeyVertical(char[][] array, String key)
    {
        String text="";
        boolean bool = false;
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j< array.length;j++)
            {
               text = text + array[j][i];
            }
            if(text.contains(key))
            {
                bool = true;
                break;
            }
            else
            {
                bool = false;
            }
            text="";

        }
        if(bool == true)
        {
            return true;
        }
        else{
            return false;
        }
    }

public static boolean checkKeyDiagonally(char[][] array, String key)
{
       boolean bool = false;
       int size= array.length;
       String text="";
       int loop = 0;
       int poop=0;
       int size1 = array.length;


       for(int i=0;i<size && size>= 0;i++)
       {
           for(int j=0;j<size1;j++)
           {
               text = text + array[j][loop];
               loop++;
           }
           if(text.contains(key))
           {
               bool = true;
               break;
           }
           else
           {
               text ="";
               size1--;
               loop=0;
               ++poop;
               loop += poop;
           }
       }

       if(bool == false)
       {
            loop = 1;
            poop = 1;
            text = "";
           size1 = array.length-1;

          for(int i=0;i<size-1;i++)
          {
              for(int j=0;j<size1;j++)
              {
                  text = text + array[loop][j];
                  loop++;
              }
              if(text.contains(key))
              {
                  bool = true;
                  break;
              }
              else
              {
                  size1--;
                  text ="";
                  loop =0;
                  ++poop;
                  loop += poop;
              }
          }


       }

       return bool;
       }



public static boolean checkKeyHorizontal(char[][] array , String key)
{
    String text1 = "";
    boolean bool = false;
    for (int i = 0; i < array.length; i++)
    {
        for (int j = 0; j < array.length; j++) {
            text1 += array[i][j];

        }
        if (text1.contains(key)) {
            bool = true;
            break;
        }
        else {
            bool = false;
        }
        text1 ="";
    }

    if(bool == true)
    {
        return true;
    }
    else
    {
        return false;
    }
}
    }

