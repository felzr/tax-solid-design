/*
 * COPYRIGHT NTT 2024 - ALL RIGHTS RESERVED.
 * 
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of NTT.
 */
package design.solid.imp;

import design.solid.calculators.TaxCalculator;

/**
 * @author NTT - framos
 *
 */
public class SingleResponsibilityTaxIrrf implements TaxCalculator {

    /*
     * (non-Javadoc)
     * 
     * @see design.solid.single.TaxCalculator#calculateTax(java.lang.Double)
     */
    public Double calculateTax(Double amount) {
        return amount * getIrrfAliquot(amount);
    }

    /**
     * @param amount
     * @return
     */
    private Double getIrrfAliquot(Double amount) {
        return 0.075;
    }

}
