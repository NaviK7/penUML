package com.company.penUML.IProduct.IProductImpl;

import com.company.penUML.IProduct.IProduct;
import com.company.penUML.IProductPart.IProductPart;
import com.company.penUML.IProductPart.IProductPartImpl.ProductBody;
import com.company.penUML.IProductPart.IProductPartImpl.ProductKernel;
import com.company.penUML.IProductPart.IProductPartImpl.ProductSpring;
import com.company.penUML.model.Body;
import com.company.penUML.model.Kernel;
import com.company.penUML.model.Pen;
import com.company.penUML.model.Spring;

public class InstalationProducts extends Pen implements IProduct {
    private ProductBody body;
    private ProductKernel kernel;
    private ProductSpring spring;

    public InstalationProducts(Kernel kernel, Spring spring, Body body) {
        super(kernel, spring, body);
    }

    public InstalationProducts() {
        super();
    }

    @Override
    public void installFirstPart(IProductPart iProductPart) {
        System.out.println("Корпус установлен");
    }

    @Override
    public void installSecondPart(IProductPart iProductPart) {
        System.out.println("Стержень установлен");
    }

    @Override
    public void installThirdPart(IProductPart iProductPart) {
        System.out.println("Пружина установлена");
    }
}
