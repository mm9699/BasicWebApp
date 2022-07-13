package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        }else if (query.contains("35f380f0")) {
            return "26";}
        else if (query.contains("fa0bb230")) {
            return "848";
        }
        else if (query.contains("feb51420")) {
            return "26";
        }
        else if (query.contains("feb51420")) {
            return "26";
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
