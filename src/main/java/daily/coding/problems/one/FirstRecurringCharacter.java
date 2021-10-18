package daily.coding.problems.one;

import org.springframework.stereotype.Component;

@Component
public class FirstRecurringCharacter {
    public String getFirstRecurringCharacter(String input){
        char c = input.charAt(0);
        for(int i=1; i<input.length(); i++){
            if(c == input.charAt(i)){
                return String.valueOf(c);
            }
            c = input.charAt(i);
        }
        return null;
    }
}
