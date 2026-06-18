package Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Factories;

import Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Documents.Document;
import Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Documents.PdfDocument;

public class PdfFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}