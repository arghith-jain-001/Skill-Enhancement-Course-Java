public class leetcode_goal_parser_interpretation {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        leetcode_goal_parser_interpretation solution = new leetcode_goal_parser_interpretation();
        System.out.println(solution.interpret("G()(al)")); // Goal
    }
}
