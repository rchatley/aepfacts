package com.develogical;

import org.junit.Test;

import java.util.Map;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class AepFactsDatabaseTest {

  @Test
  public void containsJim() {
      Map<Key,String> result = new AepFactsDatabase().lookup("jim");
      assertNotNull(result);
      assertThat(result.get(Key.TEXT), containsString("Oxford University"));
      assertThat(result.get(Key.IMAGE), containsString("photo.jpg"));
  }

}



