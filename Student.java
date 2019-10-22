class Student implements Comparable<Student>{
    private final String name;
    private final int grade;
    Student(String name, int grade){
        this.name=name;
        this.grade=grade;
    }
    public String getName(){return this.name;}
    public int getGrade(){return this.grade;}
    @Override
    public int compareTo(Student that){
        if(this.grade>that.grade) return 1;
        if(this.grade<that.grade) return -1;
        return 0;
    }
}