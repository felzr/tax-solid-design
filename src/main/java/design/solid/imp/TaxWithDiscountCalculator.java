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

import design.solid.calculators.OtherCalculator;

/**
 * @author NTT - framos
 *
 */
public class TaxWithDiscountCalculator implements OtherCalculator {

    public Double calculate(Double amount) {
        Double taxRate = 0.05; // Alíquota de 12%
        return amount * taxRate;
    }

    public Double applyDiscount(Double amount, Double discountRate) {
        return amount - (amount * discountRate);
    }

}
