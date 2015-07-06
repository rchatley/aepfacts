package com.develogical;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class AepFactsDatabase {

    private final Map<String, Map<Key, String>> data;

    public AepFactsDatabase() {
        data = new HashMap<String, Map<Key, String>>();

        data.put("jim",      miniBiog("Jim is a DPhil candidate at Oxford University, he likes programming in Go and in Lua.", "https://lh3.googleusercontent.com/-k5kuysabs78/AAAAAAAAAAI/AAAAAAAAWdc/jPsR9cFKm88/s200-c-k/photo.jpg"));
        data.put("robert",   miniBiog("Robert teaches the AEP course, he likes classical music and bicycles.", "http://chatley.com/portrait-smaller.jpg"));
        data.put("eamonn",   miniBiog("Eamonn is a DPhil candidate at Oxford University. I work on scientific data visualization and git bioinformatics", "http://www.cs.ox.ac.uk/files/4256//maguire.eamonn.gif"));
        data.put("nigel",    miniBiog("Nigel is a student on the AEP course", "http://photos.geni.com/p6/3608/5193/53444836a0c8951c/Copy_of_131_3192_medium.jpg"));
        data.put("colin",    miniBiog("Colin doesn't do much these days and likes post rock music and cider.", "http://profile.ak.fbcdn.net/hprofile-ak-snc4/203393_585632745_7365858_q.jpg"));
        data.put("joe",      miniBiog("Joe likes to make changes as suggested in the course notes, and to drink sometimes", "https://lh5.googleusercontent.com/-m7ydNlzEick/AAAAAAAAAAI/AAAAAAAAAAA/GwrVwvQZOBM/s250-c-k/photo.jpg"));
        data.put("Jorge",    miniBiog("Jorge is a software craftsman wanna be, he likes football although his team is rubbish", "https://si0.twimg.com/profile_images/369284120/IMG_0744.jpg"));
        data.put("mike",     miniBiog("Mike likes Git and functional programming.", "https://secure.gravatar.com/avatar/4ea9afaf51f26a5f7171f950f6272f4d?s=140&d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png"));
        data.put("matthew",  miniBiog("Matthew is a creature that resembles a hobbit, but his feet are not hairy.", "http://profile.ak.fbcdn.net/hprofile-ak-snc4/50092_1078535965_2537572_n.jpg"));
        data.put("ben",      miniBiog("Ben would rather be mooging", "http://forums.planetz.com/download/file.php?avatar=327_1231336408.gif"));
        data.put("stuart",   miniBiog("Stuart is looking forward to finishing his Msc and getting his holidays back.", "http://tiny.cc/d9gggw"));
        data.put("suman",    miniBiog("Suman is a student on the AEP course.", "http://www.weirdsnaps.com/wp-content/uploads/2012/05/funny-panda.jpg"));
        data.put("bas",      miniBiog("All you base are belong to me", "http://www.justducks.co.uk/Images/General%20Ducks/32cm%20Giant%20Duck.jpeg"));
        data.put("jozef",    miniBiog("Jozef lives in Switzerland and likes kickboxing.", "http://t3.gstatic.com/images?q=tbn:ANd9GcSOfKOK-CpK1uyjgFDMTFRKY7TA-ZS50Kbr5IwrasjdoAycIJI7FQ"));
        data.put("lars",     miniBiog("Lars is a student on the AEP course. He does like his coffee ...", "http://www.engineeringletters.com/images/Lars_Nolle.jpg"));
        data.put("santosh",  miniBiog("Santosh is lazy.", "no profile"));
        data.put("adam",     miniBiog("Adam is doing his first module, be nice to the fresher.", "http://m3.licdn.com/mpr/pub/image-A4OC8sCdQiegV-qscB5w7GNIaIhsie6QGPJ7s-8daGDS16aSA4O7a7Ldas_Ii5yQUpoy/adam-switzer.jpg"));
        data.put("gordy",    miniBiog("Gordy likes holidays. Holidays are great.", "http://m4.licdn.com/mpr/mpr/shrink_100_100/p/1/000/105/24e/0a2d194.jpg"));
        data.put("mandeep",  miniBiog("Mandeep is a DPhil candidate at Oxford University, he's looking forward to finishing soon and backpacking around Australia.", "https://lh5.googleusercontent.com/-x02hhRKA8CQ/AAAAAAAAAAI/AAAAAAAAAAA/FYpTIjcJyZU/s96-c/photo.jpg"));
        data.put("Richard",    miniBiog("Loves coffee.", "http://images1.fanpop.com/images/image_uploads/Funny-Cat-Pictures-animal-humor-935491_500_375.jpg"));

        data.put("ross",     miniBiog("I live in London, I've just celebrated my seventh wedding anniversary and I have a son who is two years old.", "https://1.gravatar.com/avatar/ffcb06accc2ec7657eb5cffc0c9e13e2?d=https%3A%2F%2Fidenticons.github.com%2F816955557a9d60a74bd3a1d934f6a372.png"));
        // student 1 add biog after this comment

        data.put("vinod",  miniBiog("Vinod is trying out Git!", "https://secure.gravatar.com/avatar/5d2759d44f8f5b396fdf21f13ab58d65?s=420&d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png"));
        data.put("laurence",  miniBiog("Laurence likes GitHub!", "https://secure.gravatar.com/avatar/5d2759d44f8f5b396fdf21f13ab58d65?s=420&d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-423.png"));

        // student 1 add biog above this comment
        data.put("Mario", miniBiog("Hey, I am Mario from Austria!", "https://media.licdn.com/mpr/mpr/shrink_200_200/p/1/005/09e/093/362146d.jpg"));
        // student 2 add biog after this comment
        data.put("Carlos",    miniBiog("Likes Ethereum.", "http://twitter.com/carlosnasillo"));


        data.put("Hypnotoad",  miniBiog("Hypnotoad is trying out Git too!", "http://i.kinja-img.com/gawker-media/image/upload/s--rrH1qsN3--/17sl2nb9l66a4gif.gif"));
        // student 3 add biog after this comment
        // student 3 add biog above this comment

        // student 4 add biog after this comment
        // student 4 add biog above this comment

        // student 5 add biog after this comment
        // student 5 add biog above this comment

        // student 6 add biog after this comment
        // student 6 add biog above this comment

        // student 7 add biog after this comment
        // student 7 add biog above this comment

        // student 8 add biog after this comment
        // student 8 add biog above this comment

        // student 9 add biog after this comment
        // student 9 add biog above this comment

        // student 10 add biog after this comment
        // student 10 add biog above this comment

        // student 11 add biog after this comment
        // student 11 add biog above this comment

        // student 12 add biog after this comment
        // student 12 add biog above this comment

        // student 13 add biog after this comment
        // student 13 add biog above this comment

        // student 14 add biog after this comment
        // student 14 add biog above this comment

        // student 15 add biog after this comment
        // student 15 add biog above this comment

        // student 16 add biog after this comment
        // student 16 add biog above this comment

        // student 17 add biog after this comment
        // student 17 add biog above this comment

        // student 18 add biog after this comment
        // student 18 add biog above this comment
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
