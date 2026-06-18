package Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Factories;

import Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Documents.Document;
import Deepskilling.week1.Design_Patterns_and_Principles.Exercise2.Documents.WordDocument;

public class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
