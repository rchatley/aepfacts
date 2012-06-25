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
        data.put("eamonn", miniBiog("Eamonn is a DPhil candidate at Oxford University. I work on scientific data visualization and git bioinformatics", "http://www.cs.ox.ac.uk/files/4256//maguire.eamonn.gif"));
        data.put("nigel",  miniBiog("Nigel is a student on the AEP course", "http://photos.geni.com/p6/3608/5193/53444836a0c8951c/Copy_of_131_3192_medium.jpg"));
        data.put("colin",  miniBiog("Colin doesn't do much these days and likes post rock music and cider.", "http://profile.ak.fbcdn.net/hprofile-ak-snc4/203393_585632745_7365858_q.jpg"));


        // student 1 add biog here (description and photo)
        data.put("joe",  miniBiog("Joe likes to make changes as suggested in the course notes, and to drink sometimes", "https://lh5.googleusercontent.com/-m7ydNlzEick/AAAAAAAAAAI/AAAAAAAAAAA/GwrVwvQZOBM/s250-c-k/photo.jpg"));
        // student 2 add biog here
        data.put("Jorge",  miniBiog("Jorge is a software craftsman wanna be, he likes football although his team is rubbish", "http://www.twitter.com/jvalde"));
        // student 3 add biog here
        // student 4 add biog here
        data.put("mike",   miniBiog("Mike likes Git and functional programming.", "https://secure.gravatar.com/avatar/4ea9afaf51f26a5f7171f950f6272f4d?s=140&d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png"));
        data.put("matthew",  miniBiog("Matthew is a creature that resembles a hobbit, but his feet are not hairy.", "http://profile.ak.fbcdn.net/hprofile-ak-snc4/50092_1078535965_2537572_n.jpg"));
        // student 6 add biog here
        data.put("ben",  miniBiog("Ben would rather be mooging", "http://forums.planetz.com/download/file.php?avatar=327_1231336408.gif"));
        // student 7 add biog here
        // student 8 add biog here
        data.put("stuart",  miniBiog("Stuart is looking forward to finishing his Msc and getting his holidays back.", "http://tiny.cc/d9gggw"));
        // student 9 add biog here
        data.put("bas", miniBiog("All you base are belong to me", "http://www.justducks.co.uk/Images/General%20Ducks/32cm%20Giant%20Duck.jpeg"));
        // student 11 add biog here
        data.put("jozef", miniBiog("Jozef lives in Switzerland and likes kickboxing.", "http://t3.gstatic.com/images?q=tbn:ANd9GcSOfKOK-CpK1uyjgFDMTFRKY7TA-ZS50Kbr5IwrasjdoAycIJI7FQ"));
        // student 12 add biog here
        data.put("lars", miniBiog("Lars is a student on the AEP course. He does like his coffee ...", "http://www.engineeringletters.com/images/Lars_Nolle.jpg"));
        // student 13 add biog here
        data.put("santosh",  miniBiog("Santosh is lazy.", "no profile"));
        // student 15 add biog here
        data.put("adam",  miniBiog("Adam is doing his first module, be nice to the fresher.", "http://m3.licdn.com/mpr/pub/image-A4OC8sCdQiegV-qscB5w7GNIaIhsie6QGPJ7s-8daGDS16aSA4O7a7Ldas_Ii5yQUpoy/adam-switzer.jpg"));
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
