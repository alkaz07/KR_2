static Set<Character> privetikTriggers = Set.of('а', 'я', 'и');
void main() {
    IO.println("Как тебя зовут?");
//    String name = IO.readln().trim();
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    char ending = name.charAt(name.length() - 1);

    IO.println(
            privetikTriggers.contains(ending) ?
                    "Приветик!" : "Здарова!"
    );
}
