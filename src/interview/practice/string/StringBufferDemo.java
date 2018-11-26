package interview.practice.string;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        sb.append("Rashmi ");
        sb.append("Kannaujia");
        System.out.println(sb);
        System.out.println(sb.length());

        // String Concatenation, every time it creates new instance.
        String str = "QQ";
        // String str = new String();
        String xyz = str.concat("XYZ");
        String arp = str.concat("ARP");
        System.out.println(str.length());
        System.out.println(str);
        System.out.println(xyz);
        System.out.println(arp);

    }
}
