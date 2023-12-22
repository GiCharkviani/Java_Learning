package SOLID.InterfaceSegregationPrinciple;

/* Interface segregation principle */
// How to split interfaces into smaller interfaces
// you should not put into your interface more than your client is going to use
// YAGNI = you ain't going to need it


// wrong way
public class Demo {
}


class Document {

}

interface Machine {
    void print(Document d);
    void fax(Document d) throws Exception;
    void scan(Document d);
}

class MultifunctionPrinter implements Machine {

    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}

class OldFashionedPrinter implements Machine {

    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) throws Exception {
        throw new Exception();
    }

    @Override
    public void scan(Document d) {

    }
}

// correct way
interface Printer {
    void print(Document d);
}

interface Scanner {
    void scan(Document d);
}

interface Fax {
    void fax(Document d);
}

class JustAPrinter implements Printer {

    @Override
    public void print(Document d) {

    }
}

class Photocopier implements Printer, Scanner {

    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}

interface MultiFunctionDevice extends Printer, Scanner, Fax {}

class NewPrinter implements MultiFunctionDevice {


    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) {

    }

    @Override
    public void fax(Document d) {

    }
}