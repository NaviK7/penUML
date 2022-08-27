package com.company.penUML;

import com.company.penUML.IAssemblyLine.IAssemblyLineImpl.Pen;
import com.company.penUML.IProduct.IProductImpl.InstalationProducts;

public class Main {

    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.assemblyProduct(new InstalationProducts());
    }
}
