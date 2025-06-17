public class Test {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document wordDoc = factory.createDocument();
        wordDoc.getDocType();

        factory = new PdfDocumentFactory();
        Document pdfDoc = factory.createDocument();
        pdfDoc.getDocType();

        factory = new ExcelDocumentFactory();
        Document excelDoc = factory.createDocument();
        excelDoc.getDocType();
    }
}
