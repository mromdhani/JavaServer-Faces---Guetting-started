package be.businesstraining.beans;

import javax.faces.bean.*;

@ApplicationScoped
@ManagedBean
public class EffectsBean {
  private String[] availableEffects =
    { "blind", "bounce", "clip", "drop", "explode",
      "fade", "fold", "highlight", "puff", "pulsate",
      "scale", "shake", "size", "slide", "slideDown" };

  public String[] getAvailableEffects() {
    return(availableEffects);
  }
}
