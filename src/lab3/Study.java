package lab3;

class Study {
    private String course;

    public void setCourse(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main (String[] args) {
        Study study = new Study();
        study.setCourse("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
}
