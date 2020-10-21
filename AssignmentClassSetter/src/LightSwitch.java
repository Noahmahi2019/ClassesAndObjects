public class LightSwitch {

  private String uniqueId;
   private  boolean isOn;

    public LightSwitch(String uniqueId, boolean isOn) {

        this.uniqueId = uniqueId;
        this.isOn = isOn;

    }
    public String getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    public boolean getIsOn() {
      return  isOn;
        }
    public void setOn(boolean on) {
         isOn = on;
    }
}

