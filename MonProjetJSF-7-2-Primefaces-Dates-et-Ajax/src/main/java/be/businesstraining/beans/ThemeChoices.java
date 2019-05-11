package be.businesstraining.beans;

import javax.faces.bean.*;

@ApplicationScoped
@ManagedBean
public class ThemeChoices {
  // Choices taken from http://www.primefaces.org/themes.html
  // Theme JARS downloaded from http://repository.primefaces.org/org/primefaces/themes/
  // Last updated 11/2012, version 1.08.
  private String[] themes =
    { "aristo", "afterdark", "afternoon", "afterwork",
      "black-tie", "blitzer", "bluesky", "casablanca",
      "cruze", "cupertino", "dark-hive", "dot-luv",
      "eggplant", "excite-bike", "flick", "glass-x",
      "home", "hot-sneaks", "humanity", "le-frog",
      "midnight", "mint-choc", "overcast", "pepper-grinder",
      "redmond", "rocket", "sam", "smoothness",
      "south-street", "start", "sunny", "swanky-purse",
      "trontastic", "twitter bootstrap", "ui-darkness", "ui-lightness",
      "vader" };

  public String[] getThemes() {
    return(themes);
  }
}
