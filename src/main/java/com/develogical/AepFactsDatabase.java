package com.develogical;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class AepFactsDatabase {

    private final Map<String, Map<Key, String>> data;

    public AepFactsDatabase() {
        data = new HashMap<String, Map<Key, String>>();

        data.put("jim",    miniBiog("Jim is a DPhil candidate at Oxford University, he likes programming in Go and in Lua.", "https://lh3.googleusercontent.com/-k5kuysabs78/AAAAAAAAAAI/AAAAAAAAWdc/jPsR9cFKm88/s200-c-k/photo.jpg"));
        data.put("robert", miniBiog("Robert teaches the AEP course, he likes classical music and bicycles.", "http://chatley.com/portrait-smaller.jpg"));
        data.put("eamonn", miniBiog("Eamonn is a DPhil candidate at Oxford University. I work on scientific data visualization and bioinformatics", "http://www.cs.ox.ac.uk/files/4256//maguire.eamonn.gif"));
        data.put("nigel",  miniBiog("Nigel is a student on the AEP course", "http://photos.geni.com/p6/3608/5193/53444836a0c8951c/Copy_of_131_3192_medium.jpg"));
        data.put("colin",  miniBiog("Colin doesn't do much these days and likes post rock music and cider.", "http://profile.ak.fbcdn.net/hprofile-ak-snc4/203393_585632745_7365858_q.jpg"));

        // student 1 add biog here (description and photo)
        data.put("joe",  miniBiog("Joe likes to make changes as suggested in the course notes, and to drink sometimes", "https://lh5.googleusercontent.com/-m7ydNlzEick/AAAAAAAAAAI/AAAAAAAAAAA/GwrVwvQZOBM/s250-c-k/photo.jpg"));
        // student 2 add biog here
        // student 3 add biog here
        // student 4 add biog here
        // student 5 add biog here
        // student 6 add biog here
        // student 7 add biog here
        // student 8 add biog here
        // student 9 add biog here
        // student 10 add biog here
        // student 11 add biog here
        // student 12 add biog here
        // student 13 add biog here
        // student 14 add biog here
        // student 15 add biog here
        // student 16 add biog here
    }

    public Map<Key,String> lookup(String name) {
        return data.get(name.toLowerCase());
    }

    private Map<Key,String> miniBiog(String text, String imageUrl) {
        Map<Key, String> biog = new EnumMap<Key, String>(Key.class);
        biog.put(Key.TEXT, text);
        biog.put(Key.IMAGE, imageUrl);
        return biog;
    }
}
