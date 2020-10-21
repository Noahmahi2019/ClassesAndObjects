import java.util.ArrayList;

public class Department <T extends Instrument> {
    private String name;
    private int numberOfInstruments = 0;
    private ArrayList<T> instrumentsType;

    public Department(String name) {
        this.name = name;
    }

     public void addInstrument(T Instrument) {
          if (instrumentsType.contains(Instrument)) {
           System.out.println(Instrument.getName() + " is already on this department.");
      } else {
           instrumentsType.add(Instrument);
        }
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }


}