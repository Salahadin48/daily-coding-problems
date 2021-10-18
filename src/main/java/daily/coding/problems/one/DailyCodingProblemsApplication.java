package daily.coding.problems.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyCodingProblemsApplication implements CommandLineRunner {

    @Autowired
    FirstRecurringCharacter firstRecurringCharacter;

    public static void main(String[] args) {
        SpringApplication.run(DailyCodingProblemsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String output = firstRecurringCharacter.getFirstRecurringCharacter("accbbac");
        System.out.println("Output: "+output);
    }
}
