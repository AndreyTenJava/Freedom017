package MiniProject;

import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private MainMenu mainMenuPage;
    private AddStudent addStudentPage;
    private ListStudents listStudentsPage;

    public static ArrayList<Students> students = new ArrayList<>();


    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENTS APPLICATION");
        setSize(500,500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        addStudentPage = new AddStudent(this);
        addStudentPage.setVisible(false);
        add(addStudentPage);

        listStudentsPage = new ListStudents(this);
        listStudentsPage.setVisible(false);
        add(listStudentsPage);


    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public AddStudent getAddStudent() {
        return addStudentPage;
    }

    public ListStudents getListStudents(){
        return listStudentsPage;
    }

    public ArrayList<Students> getStudents(){
        return students;
    }

    public static PackageData message;


    public PackageData getMessage() {
        return message;
    }

    public void setMessage(PackageData message) {
        this.message = message;
    }
}
