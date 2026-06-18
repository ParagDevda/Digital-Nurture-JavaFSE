package Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Documents;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}
