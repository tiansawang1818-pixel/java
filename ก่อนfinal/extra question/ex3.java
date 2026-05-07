import java.util.*;

public class ex3 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // 1. สร้าง Map เพื่อเก็บ "คำที่เรียงลำดับตัวอักษรแล้ว" เป็น Key และ "กลุ่มคำดั้งเดิม" เป็น Value
        Map<String, List<String>> map = new HashMap<>();

        // 2. วนลูปอ่านคำทีละคำจาก strs
        for (String s : strs) {
            // --- คำใบ้สเต็ปการทำ ---
            // A. แปลงข้อความ s ให้เป็น Array ของตัวอักษร ( s.toCharArray() )
            char[] x=s.toCharArray(); 
            // B. นำ Array ของตัวอักษรไปเรียงลำดับ ( Arrays.sort(...) )
            Arrays.sort(x);
            // C. แปลง Array ที่เรียงเสร็จแล้ว กลับมาเป็น String เพื่อใช้เป็น Key ( new String(...) )
            String key=new String(x);
            // D. เช็คว่า Map มี Key นี้หรือยัง ถ้ายังไม่มีให้สร้าง ArrayList เปล่าใส่เข้าไป
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            // E. นำคำดั้งเดิม (s) ใส่เข้าไปใน List ของ Key นั้น
            map.get(key).add(s);
            // เขียนโค้ดของคุณที่นี่...
            
            
        }

        // 3. ดึงเฉพาะส่วน Value ของ Map (ซึ่งเป็น List ของกลุ่มคำ) ออกมาตอบ
        // คำใบ้: ใช้ new ArrayList<>(map.values())
        return new ArrayList<>(map.values()); // ลบบรรทัดนี้และ Return ค่าที่ถูกต้อง
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("resort: " + groupAnagrams(words));
    }
}
