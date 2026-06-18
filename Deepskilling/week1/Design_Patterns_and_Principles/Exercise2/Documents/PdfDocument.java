package Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Documents;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}
