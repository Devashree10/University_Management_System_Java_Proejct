
package university.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project() {
        setSize(1366, 768);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/University_6.png"));
        Image i2 = i1.getImage().getScaledInstance(1366,760, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();    
        
        JMenu newInformation = new JMenu("New Information");        
        newInformation.setForeground(new Color(0, 0, 102));
        newInformation.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");        
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.setForeground(Color.BLUE);
        facultyInfo.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");        
        studentInfo.setBackground(Color.WHITE);
        studentInfo.setForeground(Color.BLUE);
        studentInfo.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        
        JMenu details = new JMenu("View Details");        
        details.setForeground(new Color(0, 0, 102));
        details.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");        
        facultydetails.setBackground(Color.WHITE);
        facultydetails.setForeground(Color.BLUE);
        facultydetails.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");        
        studentdetails.setBackground(Color.WHITE);
        studentdetails.setForeground(Color.BLUE);
        studentdetails.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        JMenu leavedetails = new JMenu("Leave Details");        
        leavedetails.setForeground(new Color(0, 0, 102));
        leavedetails.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        mb.add(leavedetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");        
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.setForeground(Color.BLUE);
        facultyleavedetails.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        facultyleavedetails.addActionListener(this);
        leavedetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");        
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.setForeground(Color.BLUE);
        studentleavedetails.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        studentleavedetails.addActionListener(this);
        leavedetails.add(studentleavedetails);
        
        JMenu exam = new JMenu("Examination");        
        exam.setForeground(new Color(0, 0, 102));
        exam.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        mb.add(exam);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");        
        entermarks.setBackground(Color.WHITE);
        entermarks.setForeground(Color.BLUE);
        entermarks.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        JMenuItem result = new JMenuItem("Result");        
        result.setBackground(Color.WHITE);
        result.setForeground(Color.BLUE);
        result.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        result.addActionListener(this);
        exam.add(result);
        
        JMenu updatedetails = new JMenu("Update Details");        
        updatedetails.setForeground(new Color(0, 0, 102));
        updatedetails.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        mb.add(updatedetails);
        
        JMenuItem facultyupdatedetails = new JMenuItem("Update Faculty Details");        
        facultyupdatedetails.setBackground(Color.WHITE);
        facultyupdatedetails.setForeground(Color.BLUE);
        facultyupdatedetails.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        facultyupdatedetails.addActionListener(this);
        updatedetails.add(facultyupdatedetails);
        
        JMenuItem studentupdatedetails = new JMenuItem("Update Student Details");        
        studentupdatedetails.setBackground(Color.WHITE);
        studentupdatedetails.setForeground(Color.BLUE);
        studentupdatedetails.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        studentupdatedetails.addActionListener(this);
        updatedetails.add(studentupdatedetails);
        
        JMenu feedeatils = new JMenu("Fee Details");        
        feedeatils.setForeground(new Color(0, 0, 102));
        feedeatils.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        mb.add(feedeatils);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");        
        feestructure.setBackground(Color.WHITE);
        feestructure.setForeground(Color.BLUE);
        feestructure.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        feestructure.addActionListener(this);
        feedeatils.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");        
        feeform.setBackground(Color.WHITE);
        feeform.setForeground(Color.BLUE);
        feeform.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        feeform.addActionListener(this);
        feedeatils.add(feeform);
        
        JMenu utility = new JMenu("Utility");        
        utility.setForeground(new Color(0, 0, 102));
        utility.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");        
        notepad.setBackground(Color.WHITE);
        notepad.setForeground(Color.BLUE);
        notepad.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");        
        calc.setBackground(Color.WHITE);
        calc.setForeground(Color.BLUE);
        calc.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        calc.addActionListener(this);
        utility.add(calc);
        
        JMenu about = new JMenu("About");        
        about.setForeground(new Color(0, 0, 102));
        about.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        about.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent ae){
                new About();
            }
        });
        mb.add(about);
        
        JMenu exit = new JMenu("Exit");        
        exit.setForeground(new Color(0, 0, 102));
        exit.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
        exit.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent ae)
            {
                System.exit(0);
            }
        }); 
        mb.add(exit);

        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    
    
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e) {
                
            }           
        }else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e) {
                
            }            
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        }else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Result")) {
            new ExaminationDetails();
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
