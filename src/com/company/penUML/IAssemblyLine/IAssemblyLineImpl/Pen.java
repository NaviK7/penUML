package com.company.penUML.IAssemblyLine.IAssemblyLineImpl;

import com.company.penUML.IAssemblyLine.IAssemblyLine;
import com.company.penUML.ILineStep.ILineStepImpl.CreatureFirstPart;
import com.company.penUML.ILineStep.ILineStepImpl.CreatureSecondPart;
import com.company.penUML.ILineStep.ILineStepImpl.CreatureThirdPart;
import com.company.penUML.IProduct.IProduct;
import com.company.penUML.IProduct.IProductImpl.InstalationProducts;
import com.company.penUML.IProductPart.IProductPartImpl.ProductBody;
import com.company.penUML.IProductPart.IProductPartImpl.ProductKernel;
import com.company.penUML.IProductPart.IProductPartImpl.ProductSpring;

public class Pen implements IAssemblyLine {


    @Override
    public IProduct assemblyProduct(IProduct iProduct) {

        ProductBody body = (ProductBody) new CreatureFirstPart().buildProductPart();
        iProduct.installFirstPart(body);
        ProductKernel kernel = (ProductKernel) new CreatureSecondPart().buildProductPart();
        iProduct.installSecondPart(kernel);
        ProductSpring spring = (ProductSpring) new CreatureThirdPart().buildProductPart();
        iProduct.installThirdPart(spring);
        InstalationProducts pen = new InstalationProducts(kernel, spring, body);
        System.out.println("Ручка готова: " + pen);
        return iProduct;
    }
}
