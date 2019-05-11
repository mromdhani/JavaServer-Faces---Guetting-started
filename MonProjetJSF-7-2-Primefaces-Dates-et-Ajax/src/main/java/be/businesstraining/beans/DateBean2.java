package be.businesstraining.beans;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DateBean2 {
	
  private Date sampleDate;

  public Date getSampleDate() {
    return (sampleDate);
  }

  public void setSampleDate(Date sampleDate) {
    this.sampleDate = sampleDate;
  }
  
  public String getSampleDay() {
    if (sampleDate == null) {
      return("No date selected.");
    } else {
      String message =
        String.format("You chose '%s'.",
                      DateUtils.formatDay(sampleDate));
      return(message);         
    }
  }
  
  public String getSampleTime() {
    if (sampleDate == null) {
      return("No date/time selected.");
    } else {
      String message =
        String.format("You chose '%s'.",
                      DateUtils.formatTime(sampleDate));
      return(message);         
    }
  }
}
