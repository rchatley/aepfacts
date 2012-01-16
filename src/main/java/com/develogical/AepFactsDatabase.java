package com.develogical;

import java.util.HashMap;
import java.util.Map;

public class AepFactsDatabase {

    private final Map<String, MiniBiog> data;

    public AepFactsDatabase() {
        data = new HashMap<String, MiniBiog>();
        data.put("jim", new MiniBiog("Jim is a DPhil candidate at Oxford University, he likes programming in Go and in Lua.", "https://lh3.googleusercontent.com/-k5kuysabs78/AAAAAAAAAAI/AAAAAAAAWdc/jPsR9cFKm88/s200-c-k/photo.jpg"));
        data.put("robert", new MiniBiog("Robert teaches the AEP course, he likes classical music and bicycles.", "http://chatley.com/portrait-smaller.jpg"));
        data.put("colin", new MiniBiog("Colin doesn't do much these days and likes post rock music and cider.", "http://profile.ak.fbcdn.net/hprofile-ak-snc4/203393_585632745_7365858_q.jpg"));
    }

    public MiniBiog lookup(String name) {
        return data.get(name.toLowerCase());
    }

    public static class MiniBiog {
        
        private final String text;
        private final String imageUrl;

        public MiniBiog(String text, String imageUrl) {
            this.text = text;
            this.imageUrl = imageUrl;
        }

        public String imageUrl() {
            return imageUrl;
        }

        public String text() {
            return text;
        }
    }
}
