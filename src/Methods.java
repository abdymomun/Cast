import java.util.List;
import java.util.Scanner;
    public class Methods implements Findable {

        @Override
        public List<Movie> getAllMovies(List<Movie> movies) {
            for (Movie m : movies) {
                System.out.println(m.toString());
            }
            return movies;
        }

        @Override
        public void findMovieByName(List<Movie> movies) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Write name movie");
            String a = scanner.nextLine();
            for (Movie m : movies) {
                if (m.getName().equals(a)) {
                    System.out.println(m);
                }

            }
        }

        @Override
        public void findMovieByActorName(List<Movie> movies) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write name Actors");
            String a = scanner.nextLine();
            for (Movie m : movies) {
                for (Cast c : m.getCast()) {
                    if (c.getActorFullName().equals(a)) {
                        System.out.println(c+m.getName());
                    }

                }
            }
        }

        @Override
        public void findMovieByYear(List<Movie> movies) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write year movie");
            int a = scanner.nextInt();
            for (Movie c : movies) {
                if (c.getYear() == (a)) {
                    System.out.println(c);
                }

            }
        }

        @Override
        public void findMovieByDirector(List<Movie> movies) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write name director");
            String a = scanner.nextLine();
            for (Movie m : movies) {
                if (m.getDirector().getName().equals(a)) {
                    System.out.println("Director " + m.getDirector()+" в фильме " + m.getName());
                }
            }
        }


        @Override
        public void findMovieByDescription(List<Movie> movies) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write Movie by desciption");
            String a = scanner.nextLine();
            for (Movie m : movies) {
                if (m.getDescription().equals(a)) {
                    System.out.println(m);
                }
            }
        }

        @Override
        public void findMovieByRole(List<Movie> movies) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write Movie by role");
            String a = scanner.nextLine();
            for (Movie m : movies) {
                for (Cast s : m.getCast()) {
                    if (s.getRole().equals(a)) {
                        System.out.println(m.getCast() +" в фильме " +m.getName());
                    }
                }
            }
        }
    }

