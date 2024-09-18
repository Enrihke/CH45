
import java.util.ArrayList;
import java.util.List;

public class Student{
    public String name;
    public String id;

    List<Course> enrolledCourses = new ArrayList<>();
    public Student( )
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public void enroll(Course course){
        enrolledCourses.add( course );
    }

    public void unEnroll(Course course){
        enrolledCourses.remove( course );
    }

    public int totalEnrolledCourses(){
    	return  enrolledCourse();
        //TODO implement
    }

    private int enrolledCourse() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
            + '}';
    }
}
