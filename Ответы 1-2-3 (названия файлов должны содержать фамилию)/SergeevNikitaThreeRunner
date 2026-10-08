public class SergeevNikitaThreeRunner {
    //    Спросить пользователя "как тебя зовут?"
//    прочитать его имя
//    Если имя заканчивается на а, я или и, вывести "Приветик!", иначе вывести "Здарова!"

    static void main() {
        String name = IO.readln("как тебя зовут?");

        if (name == null) {
            throw new NullPointerException("Name не должен быть пустым");
        }

        String lastLetter = String.valueOf(name.charAt(name.length() - 1));

        if (lastLetter.equals("а") || lastLetter.equals("я") || lastLetter.equals("и")) {
            System.out.println("Приветик!");
        } else {
            System.out.println("Здарова!");
        }
    }
}
