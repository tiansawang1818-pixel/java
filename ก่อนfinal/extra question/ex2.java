import java.util.*;
public class ex2 {
    public static Map<String, Double> calculateAverage(List<String> records) {
        // 1. สร้าง Map เพื่อเก็บชื่อ และ "รายการคะแนนทั้งหมด" ของคนๆ นั้น
        Map<String, List<Integer>> studentScores = new HashMap<>();

        // 2. วนลูป records เพื่อแยกชื่อและคะแนน แล้วใส่ลงใน studentScores
        // คำใบ้: ใช้ record.split(":") เพื่อแยก และ Integer.parseInt() เพื่อแปลง String เป็นตัวเลข
        for (String record : records) {
            // เขียนโค้ดของคุณที่นี่...
            String[] x=record.split(":");
            String y=x[0];
            int score =Integer.parseInt(x[1]);
            
            if(!studentScores.containsKey(y)){
                studentScores.put(y,new ArrayList<>());
            }

            studentScores.get(y).add(score);
        }

        // 3. สร้าง Map ใหม่เพื่อเก็บชื่อและ "คะแนนเฉลี่ย"
        Map<String, Double> studentAverages = new HashMap<>();
        

        // 4. วนลูป studentScores เพื่อหาค่าเฉลี่ยของแต่ละคน แล้ว put ลงใน studentAverages
        // เขียนโค้ดของคุณที่นี่...
        for(Map.Entry<String,List<Integer>> x:studentScores.entrySet()){
            double total=0;
            double avg=0;
            for(int i:x.getValue()){
                total+=i;
            }
            avg=total/(x.getValue().size());
            if(!studentAverages.containsKey(x.getKey())){
                studentAverages.put(x.getKey(), avg);
            }
        }
        return studentAverages;
            }

    public static void main(String[] args) {
        List<String> records = Arrays.asList("Alice:80", "Bob:70", "Alice:90", "Charlie:60", "Bob:80");
        
        System.out.println("resort: " + calculateAverage(records)); 
        // ผลลัพธ์ควรได้แบบนี้: {Bob=75.0, Alice=85.0, Charlie=60.0} (ลำดับชื่ออาจสลับกันได้)
    }
}
    

