  public class LightSwitch {

      private String uniqueId;
      private boolean IsOn;

      public LightSwitch(String uniqueId, boolean IsOn) {

          this.uniqueId = uniqueId;
          this.IsOn = IsOn;
      }
      public void setOn(boolean IsOn) {
          if (IsOn =false) {
              this.IsOn = IsOn;
         } else {
              this.IsOn = false;
          }
      }
          public boolean getIsOn () {
              return IsOn;
          }

        public String getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

  }


