// 📝 โจทย์: ระบบนับคะแนนโหวตประธานนักเรียน (Vote Counting System)
// รายละเอียด:
// คุณได้รับรายชื่อของผู้ที่ได้รับคะแนนโหวตจากการเลือกตั้งประธานนักเรียน โดยข้อมูลอยู่ในรูปแบบ List<String> หน้าที่ของคุณคือการเขียนโค้ดโดยใช้ Map<String, Integer> เพื่อนับว่าผู้สมัครแต่ละคนได้คะแนนโหวตคนละกี่คะแนน และหาว่า "ใครคือผู้ชนะ" (คนที่ได้คะแนนโหวตเยอะที่สุด)

// ข้อกำหนด:

// ใช้ HashMap ในการนับคะแนน (Key คือชื่อผู้สมัคร, Value คือจำนวนโหวต)

// วนลูปรายชื่อเพื่อเก็บข้อมูลลงใน Map

// หาชื่อผู้ที่ได้คะแนนสูงสุดและ Return ค่ากลับไปเป็น String (สมมติว่าไม่มีกรณีที่คะแนนสูงสุดเท่ากัน)

// ตัวอย่าง Input & Output:

// Input: ["Alice", "Bob", "Alice", "Charlie", "Bob", "Alice"]

// Output: "Alice" (เพราะ Alice ได้ 3 โหวต, Bob ได้ 2 โหวต, Charlie ได้ 1 โหวต)

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex1 {
    public static String findWinner(List<String> votes) {
        Map<String,Integer> data=new HashMap<>();
        for(String i:votes){
            if(!data.containsKey(i)){
                data.put(i, 1);
            }else{
                int x=data.get(i);
                data.put(i, x+1);
            }
        }

        String winner = "";
        int maxVotes = 0;
        for(Map.Entry<String,Integer> x:data.entrySet()){
            System.out.println(x.getKey()+"   "+x.getValue());
            if (x.getValue() > maxVotes) {
                maxVotes = x.getValue(); // อัปเดตคะแนนสูงสุด
                winner = x.getKey();     // อัปเดตชื่อผู้ชนะ
            }
        }

    return winner;    
    }

    public static void main(String[] args) {
        List<String> votes = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob", "Alice");
        
        System.out.println("vote: " + votes);
        System.out.println("winner: " + findWinner(votes)); // ควรแสดงผลลัพธ์เป็น Alice
    }
}