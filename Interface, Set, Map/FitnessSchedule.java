import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FitnessSchedule {
    Map<Member, Set<Schedule>> memberSchedule;
    public FitnessSchedule(){
        this.memberSchedule=new HashMap<>();
    }
    public void addClass(Schedule schedule){
    }

    public void enrollMember(Member member, Schedule schedule){
        if(this.memberSchedule.containsKey(member)){
            this.memberSchedule.get(member).add(schedule);
        }else{
            this.memberSchedule.put(member,new HashSet<>());
            this.memberSchedule.get(member).add(schedule);
        }
        
    }

    public void viewMemberSchedule(Member member){
        // System.out.println((memberSchedule.get(member)));
        for (Schedule schedule : memberSchedule.get(member)){
            System.out.println("- " + schedule.getClass().getSimpleName() + 
                               " on " + schedule.getday() + 
                               " at " + schedule.gettime());
        }
    }

     public void viewClassParticipants(Schedule schedule){
        System.out.println("\nParticipants in " + schedule.getClass().getSimpleName() + ":");
        for (Map.Entry<Member,Set<Schedule>> i:memberSchedule.entrySet()){
            if(i.getValue().contains(schedule)){
                System.out.println(i.getKey().getname());
            }
        }
        }
    public static void main(String[] args) {
        System.out.println("Creating Classes:");
        YogaClass yoga = new YogaClass("Monday", "9:00 AM", "Alice");
        ZumbaClass zumba = new ZumbaClass("Tuesday", "6:00 PM", "Bob");
        BoxingClass boxing = new BoxingClass("Wednesday", "7:00 PM", "Cindy");

        System.out.println("Yoga Class: " + yoga.getday() + " at " + yoga.gettime() + " with Instructor: " + yoga.getinstructor());
        System.out.println("Zumba Class: " + zumba.getday() + " at " + zumba.gettime() + " with Instructor: " + zumba.getinstructor());
        System.out.println("Boxing Class: " + boxing.getday() + " at " + boxing.gettime() + " with Instructor: " + boxing.getinstructor());

        System.out.println("\nCreating Members:");
        Member john = new Member("John", "123");
        Member jane = new Member("Jane", "456");
        System.out.println("Member: Name=" + john.getname() + ", ID=" + john.getMemberId());
        System.out.println("Member: Name=" + jane.getname() + ", ID=" + jane.getMemberId());

        FitnessSchedule fitness = new FitnessSchedule();
        
        fitness.addClass(yoga);
        fitness.addClass(zumba);
        fitness.addClass(boxing);

        System.out.println("\nEnrolling Members:");
        fitness.enrollMember(john, yoga);
        System.out.println("John enrolled in Yoga Class");
        
        fitness.enrollMember(jane, zumba);
        System.out.println("Jane enrolled in Zumba Class");
        
        fitness.enrollMember(john, boxing);
        System.out.println("John enrolled in Boxing Class");

        // ทดสอบแสดงตารางเรียนของ John
        fitness.viewMemberSchedule(john);
        
        // ทดสอบแสดงผู้เข้าร่วมคลาส
        fitness.viewClassParticipants(yoga);
        fitness.viewClassParticipants(zumba);
        fitness.viewClassParticipants(boxing);

    }
}
