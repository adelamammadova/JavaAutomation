public class Course {
    private String courseName;
    private int capacity;
    private int enrolledStudents;

    public Course(String courseName, int capacity, int enrolledStudents){
        this.courseName=courseName;
        this.capacity=capacity;
        this.enrolledStudents=enrolledStudents;

    }
   public boolean registerStudent(){
        if(enrolledStudents<capacity){
            enrolledStudents++;
            return true;
        }else {
            return false;
        }
    }
   public void displayCourseInfo(){
       System.out.println("Course: "+courseName);
       System.out.println("Capacity: "+capacity);
       System.out.println("Enrolled Students: "+enrolledStudents);

    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}

class OnlineCourse extends Course{
    private String platform;

    public OnlineCourse(String courseName, int capacity, int enrolledStudents, String platform){
        super(courseName, capacity, enrolledStudents);
        this.platform=platform;
    }
    @Override
    public void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Platform: "+platform);

    }



}
class OfflineCourse extends Course{
   private String roomNumber;
   public OfflineCourse(String courseName, int capacity, int enrolledStudents, String roomNumber ){
       super(courseName, capacity, enrolledStudents);
       this.roomNumber=roomNumber;

   }
   @Override
    public void displayCourseInfo(){
       super.displayCourseInfo();
       System.out.println("Room number: "+roomNumber);
   }
}


//Tapşırıq 2 — University Course Registration(15 xal)
//Universitetdə tələbələrin müxtəlif kurslara qeydiyyatdan keçməsi üçün sistem yarat.
//
//1. Course class-ı yarat
//Field-lər:
//
//courseName
//        capacity
//enrolledStudents
//
//Bütün field-lər private olsun.
//
//Constructor yarat.
//
//Methodlar:
//
//boolean registerStudent()
//void displayCourseInfo()
//registerStudent() çağırıldıqda:
//
//Əgər capacity dolmayıbsa → enrolledStudents 1 artsın və true qaytarsın.
//Capacity dolubsa → false qaytarsın.
//2. OnlineCourse class-ı yarat
//Course-dan inherit etsin.
//
//Əlavə field:
//
//platform
//Məsələn:
//
//        "Zoom"
//        "Microsoft Teams"
//displayCourseInfo() methodunu override et.
//
//        3. OfflineCourse class-ı yarat
//Course-dan inherit etsin.
//
//Əlavə field:
//
//roomNumber
//Məsələn:
//
//        "Room 204"
//displayCourseInfo() methodunu override et.
//
//        4. main() daxilində
//Bir neçə kurs yarat:
//
//Course javaCourse =
//        new OnlineCourse("Java", 2, 0, "Zoom");
//
//Course testingCourse =
//        new OfflineCourse("Software Testing", 3, 0, "Room 204");
//Sonra Java kursuna 3 tələbə qeydiyyatdan keçirməyə çalış.
//
//Məsələn:
//
//        System.out.println(javaCourse.registerStudent());
//        System.out.println(javaCourse.registerStudent());
//        System.out.println(javaCourse.registerStudent());
//Nəticədə:
//
//        true
//        true
//        false
//olmalıdır.
//
//Daha sonra:
//
//        javaCourse.displayCourseInfo();
//testingCourse.displayCourseInfo();
//çağır.