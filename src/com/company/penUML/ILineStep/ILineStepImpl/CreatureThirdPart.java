package com.company.penUML.ILineStep.ILineStepImpl;

import com.company.penUML.ILineStep.ILineStep;
import com.company.penUML.IProductPart.IProductPart;
import com.company.penUML.IProductPart.IProductPartImpl.ProductSpring;

public class CreatureThirdPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Пружина прибыла");
        return new ProductSpring("Пружина");
    }
}
