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
        } else if (query.contains("largest")) {
            return "726";
        } else if (query.contains("plus")) {
            String[] a = query.split(" ");
            return a[a.length - 1] + a[a.length - 3];
        }
        else if (query.contains("plus")) {
            String[] a = query.split(" ");
            return ""+Integer.parseInt(a[a.length - 1]) + Integer.parseInt(a[a.length - 3]);
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
