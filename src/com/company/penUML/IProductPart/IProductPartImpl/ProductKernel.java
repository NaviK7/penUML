package com.company.penUML.IProductPart.IProductPartImpl;

import com.company.penUML.IProductPart.IProductPart;
import com.company.penUML.model.Kernel;

public class ProductKernel extends Kernel implements IProductPart {
    public ProductKernel(String name, String color) {
        super(name, color);
    }
}
