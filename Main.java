public class Main{
    public static void main(String[] args){
        Course javaCourse=new OnlineCourse("Java",2,0,"Zoom");
        Course testingCourse=new OfflineCourse("Software testing", 3, 0, "room 201");
        System.out.println(javaCourse.registerStudent());
        System.out.println(javaCourse.registerStudent());
        System.out.println(javaCourse.registerStudent());

        javaCourse.displayCourseInfo();
        testingCourse.displayCourseInfo();
       


    }
}
