public class Member {
    String name;
    String memberID;
    public Member(String name,String memberID){
        this.name=name;
        this.memberID=memberID;
    }

    public String getname(){
        return this.name;
    }

    public String getMemberId(){
        return this.memberID;
    }
}