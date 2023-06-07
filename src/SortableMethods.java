import java.util.Comparator;
import java.util.List;

public class SortableMethods implements Sortable{

        public  static Comparator<Movie>sortBYName = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        public static Comparator<Movie>sortByDirector = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getDirector().getName().compareTo(o2.getDirector().getName()) ;
            }
        };
        public static Comparator<Movie>sortByYear = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear() - o2.getYear();
            }
        };

        @Override
        public void sortByMovieName(List<Movie> movies) {
            movies.sort(sortBYName);
            for (Movie m:movies) {
                System.out.println(m);
            }

        }

        @Override
        public void sortByYear(List<Movie> movies) {
            movies.sort(sortByYear);
            System.out.println(movies);
        }

        @Override
        public void sortByDirector(List<Movie> movies) {
            movies.sort(sortByDirector);
            System.out.println(movies);
        }
    }
    

