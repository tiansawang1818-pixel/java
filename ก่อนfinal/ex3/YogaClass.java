public class YogaClass implements Schedule {
    String day;
    String time;
    String instructor;
    public YogaClass(String day, String time, String instructor){
        this.day = day;
        this.time = time;
        this.instructor = instructor;
    }
    public String gettime(){
        return this.time;
    }

    public String getday(){
        return this.day;
    }

    public String getinstructor(){
        return this.instructor;
    }

    @Override
    public String toString() {
        return "Yoga (" + day + " " + time + " by " + instructor + ")";
}
}
