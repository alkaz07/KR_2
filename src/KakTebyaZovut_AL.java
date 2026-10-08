static Set<Character> privetikTriggers = Set.of('а', 'я', 'и');
void main() {
    IO.println("Как тебя зовут?");
    String name = IO.readln().trim();
    char ending = name.charAt(name.length() - 1);

    IO.println(
            privetikTriggers.contains(ending) ?
                    "Приветик!" : "Здарова!"
    );
}
