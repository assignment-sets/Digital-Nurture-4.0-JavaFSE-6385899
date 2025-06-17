// Document interface
interface Document {
    void getDocType();
}

// Concrete document classes
class WordDocument implements Document {
    @Override
    public void getDocType() {
        System.out.println("Word Document");
    }
}

class PdfDocument implements Document {
    @Override
    public void getDocType() {
        System.out.println("PDF Document");
    }
}

class ExcelDocument implements Document {
    @Override
    public void getDocType() {
        System.out.println("Excel Document");
    }
}

// Abstract factory
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// Concrete factories
class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
