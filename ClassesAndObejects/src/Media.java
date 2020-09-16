public class Media {
    private String program;
    private String title;
    private String categories;

    public Media(String program, String title, String categories) {

        this.program = program;
        this.title = title;
        this.categories = categories;
    }
    public String getProgram() {
      return program;
   }

   public void setProgram(String program) {
       this.program = program;
   }
   public String getTitle() {
       return title;
     }
   public void setTitle(String title) {
      this.title = title;
}

    public String getCategories() {
        return categories;
   }

    public void setCategories(String categories) {
       this.categories = categories;
    }
}
