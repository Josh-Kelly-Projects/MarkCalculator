/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelly;

/**
 *
 * @author kelly
 */
public class Student
{

    private String name;
    private String lName;
    private String stNum;
    private int onlineQuiz;
    private int assignment;
    private int sumAssMark;
    private double finMark;
    private String gradeComment;

    public Student(String name, String lName, String stNum, int onlineQuiz, int assignment, int sumAssMark)
    {
        this.name = CapNames(name);
        this.lName = CapNames(lName);
        this.stNum = stNum;
        this.onlineQuiz = onlineQuiz;
        this.assignment = assignment;
        this.sumAssMark = sumAssMark;

        finMark = 0.1 * onlineQuiz + 0.4 * assignment + 0.5 * sumAssMark;

        if (finMark >= 75)//check distinction
        {
            gradeComment = "Pass with Distinction";
        } else if (sumAssMark < 40)//check subminimum fail
        {
            gradeComment = "Fail on Subminimum";
        } else if (finMark >= 50)//check pass
        {
            gradeComment = "Pass";
        } else if (finMark < 40)//check fail
        {
            gradeComment = "fail";
        } else if (finMark >= 40)//check sup
        {
            gradeComment = "supplement";
        }
    }

    public String getName()
    {
        return name;
    }

    public String getlName()
    {
        return lName;
    }

    public String getStNum()
    {
        return stNum;
    }

    public int getOnlineQuiz()
    {
        return onlineQuiz;
    }

    public int getAssignment()
    {
        return assignment;
    }

    public int getSumAssMark()
    {
        return sumAssMark;
    }

    public double getFinMark()
    {
        return finMark;
    }

    public String getGradeComment()
    {
        return gradeComment;
    }
    
    //method to make the first letter of names a capital
    public static String CapNames(String name)
    {
        name = name.trim();
        String splitName[] = name.split(" ");
        name = "";
        
        for (int i = 0; i < splitName.length; i++)
        {
            splitName[i] = Character.toUpperCase(splitName[i].charAt(0)) + splitName[i].substring(1);
            name += splitName[i] + " ";
        }
               
        return name;
    }
}
