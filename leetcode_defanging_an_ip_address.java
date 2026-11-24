public class leetcode_defanging_an_ip_address {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        leetcode_defanging_an_ip_address solution = new leetcode_defanging_an_ip_address();
        System.out.println(solution.defangIPaddr("1.1.1.1")); // 1[.]1[.]1[.]1
    }
}
