package com.company.penUML.ILineStep.ILineStepImpl;

import com.company.penUML.ILineStep.ILineStep;
import com.company.penUML.IProductPart.IProductPart;
import com.company.penUML.IProductPart.IProductPartImpl.ProductBody;
import com.company.penUML.IProductPart.IProductPartImpl.ProductKernel;

public class CreatureSecondPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Стержень прибыл");
        return new ProductKernel("Стержень","синий");
    }

}
