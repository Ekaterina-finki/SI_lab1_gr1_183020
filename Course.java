class Course{

List<Student> students;

public Course()
    {
        this.students = new ArrayList<>();
    }

public void addStudent (Student s)
    {
	 students.add(s);
    }
public void removeStudent (Student s)
    {
        students.remove(s);
    }
public float averagePoints()
    {
        float average = 0;
        for ( Student s : students )
            average += s.LabPoints();
        return average / students.size();
    }

}