import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                ArrayList<Cast> casts=new ArrayList<>();
                SortableMethods sortableMethods = new SortableMethods();
                Scanner scanner = new Scanner(System.in);
                System.out.println("menu" +
                        "\n1 Get all movies" +
                        "\n2 Find movie by name" +
                        "\n3 Find movie by actor name" +
                        "\n4 Find movie by year" +
                        "\n5 Find movie by director" +
                        "\n6 Find movie by description" +
                        "\n7 Find movie by role" +
                        "\n8 Sort by movie name" +
                        "\n9 Sort by year" +
                        "\n10 Sort by director");
                Cast cast = new Cast("James Cameron", "Сэм Уортингтон");
                Cast cast1 =new Cast("Roberto Orci", "Shia LaBeouf");
                Cast cast2 =new Cast("Мэтт Деймон", "Цзин Тянь");
                List<Cast> casts1=new ArrayList<>();
                casts1.add(new Cast("James Cameron", "Сэм Уортингтон"));
                List<Cast>casts2= new ArrayList<>();
                casts2.add(new Cast("Roberto Orci", "Shia LaBeouf"));
                List<Cast>casts3=new ArrayList<>();
                casts3.add(new Cast("Мэтт Деймон", "Цзин Тянь"));
                Methods methods = new Methods();
                Director director =  new  Director("Джеймс","Кэмерон");
                Director director1 = new Director("jon", "kai");
                Director director2 = new Director("roman","iko");


                Movie movie = new Movie("Avatar", 2022, "Фантастический фильм", director, casts1);

                Movie movie1 = new Movie("Transformers",2007,"Фантастический фильм",director1,  casts2);

                Movie movie2 = new Movie("Great wall",2016,"Фантастический фильм", director2,  casts3);

                List<Movie>movies=new ArrayList<>();
                movies.add(movie);
                movies.add(movie1);
                movies.add(movie2);




                while (true) {
                    int a = scanner.nextInt();
                    switch (a) {
                        case 1:
                            methods.getAllMovies(movies);
                            break;
                        case 2:
                            methods.findMovieByName(movies);
                            break;
                        case 3:
                            methods.findMovieByActorName(movies);
                            break;
                        case 4 :
                            methods.findMovieByYear(movies);
                            break;
                        case 5 :
                            methods.findMovieByDirector(movies);
                            break;
                        case 6:
                            methods.findMovieByDescription( movies);
                            break;
                        case 7:
                            methods.findMovieByRole(movies);
                            break;
                        case 8:
                            sortableMethods.sortByMovieName(movies);
                            break;
                        case 9:
                            sortableMethods.sortByYear(movies);
                            break;
                        case 10:
                            sortableMethods.sortByDirector(movies);
                        default:
                            System.out.println("такого Фильма нет ");
                    }
                }
            }
        
}