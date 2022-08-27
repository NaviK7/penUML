package com.company.penUML.ILineStep.ILineStepImpl;

import com.company.penUML.ILineStep.ILineStep;
import com.company.penUML.IProductPart.IProductPart;
import com.company.penUML.IProductPart.IProductPartImpl.ProductBody;

public class CreatureFirstPart implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        System.out.println("Корпус ручки прибыл");
        return new ProductBody("Корпус");
    }
}