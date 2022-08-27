package com.company.penUML.IProduct;

import com.company.penUML.IProductPart.IProductPart;

public interface IProduct {
    void installFirstPart(IProductPart iProductPart);

    void installSecondPart(IProductPart iProductPart);

    void installThirdPart(IProductPart iProductPart);
}
