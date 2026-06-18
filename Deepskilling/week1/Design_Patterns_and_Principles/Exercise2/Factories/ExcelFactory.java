package Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Factories;

import Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Documents.Document;
import Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Documents.ExcelDocument;

public class ExcelFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
