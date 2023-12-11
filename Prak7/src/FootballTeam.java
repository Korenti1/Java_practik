import java.util.Arrays;


public class FootballTeam {
    private String name;
    private String city;
    private int leaguePosition;
    private int wins;

    public FootballTeam(String name, String city, int leaguePosition, int wins) {
        this.name = name;
        this.city = city;
        this.leaguePosition = leaguePosition;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getLeaguePosition() {
        return leaguePosition;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String toString() {
        return "Команда: " + name + "\nГород: " + city + "\nПозиция в лиге: " + leaguePosition + "\nПобеды: " + wins;
    }

    public static void main(String[] args) {
        // Создание массива команд
        FootballTeam[] teams = new FootballTeam[3];
        teams[0] = new FootballTeam("Команда A", "Город A", 2, 10);
        teams[1] = new FootballTeam("Команда B", "Город B", 1, 15);
        teams[2] = new FootballTeam("Команда C", "Город C", 3, 5);

        // Определение команды с самым большим количеством побед
        FootballTeam teamWithMostWins = teams[0];
        for (int i = 1; i < teams.length; i++) {
            if (teams[i].getWins() > teamWithMostWins.getWins()) {
                teamWithMostWins = teams[i];
            }
        }
        System.out.println("Команды с наибольшими победами: " + teamWithMostWins.getName());

        // Определение команд с количеством побед больше среднего
        int totalWins = 0;
        for (FootballTeam team : teams) {
            totalWins += team.getWins();
        }
        double averageWins = (double) totalWins / teams.length;
        System.out.println("Команды с количеством побед больше среднего:");
        for (FootballTeam team : teams) {
            if (team.getWins() > averageWins) {
                System.out.println(team.getName());
            }
        }

        // Упорядочивание массива по убыванию мест в лиге
        Arrays.sort(teams, (team1, team2) -> Integer.compare(team2.getLeaguePosition(), team1.getLeaguePosition()));
        System.out.println("Команды отсортированные по позиции в Лиге: ");
        for (FootballTeam team : teams) {
            System.out.println(team.getName() + " - Позиция в Лиге: " + team.getLeaguePosition());
        }

        // Поиск по названию команды, изменение одного из полей и вывод полной информации о команде после редактирования
        String searchTeamName = "Команда B";
        FootballTeam foundTeam = null;
        for (FootballTeam team : teams) {
            if (team.getName().equals(searchTeamName)) {
                foundTeam = team;
                break;
            }
        }
        if (foundTeam != null) {
            System.out.println("Найденна команда: " + foundTeam.getName());
            foundTeam.setWins(20);  // Изменение количества побед
            System.out.println("Обновлена информация о команде:\n" + foundTeam);
        } else {
            System.out.println("Команда не найдена.");
        }
    }
}