/*
 * COPYRIGHT NTT 2024 - ALL RIGHTS RESERVED.
 * 
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of NTT.
 */
package design.solid.main;

import design.solid.engine.DiscountTaxEngine;
import design.solid.engine.TaxEngine;
import design.solid.imp.SingleResponsibilityTaxIrrf;
import design.solid.imp.SingleResponsibilityTaxIss;
import design.solid.imp.TaxWithDiscountCalculator;
/**
 * @author NTT - framos
 *
 */
public class TAxMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Double amount = 1000.0;
        // Calcular Imposto de Renda
        TaxEngine incomeTaxEngine = new TaxEngine(new SingleResponsibilityTaxIrrf());
        double incomeTax = incomeTaxEngine.calculateTax(amount);
        System.out.println("Imposto de renda: " + incomeTax);

        // Calcular Imposto sobre Serviços
        TaxEngine serviceTaxEngine = new TaxEngine(new SingleResponsibilityTaxIss());
        double serviceTax = serviceTaxEngine.calculateTax(amount);
        System.out.println("Imposto sobre serviço: " + serviceTax);
        
        
        //usnado o quarto principio 
        DiscountTaxEngine discountTaxEngine = new DiscountTaxEngine(new TaxWithDiscountCalculator());
        double discountRate = 0.10; // 10% de desconto
        System.out.println("Income Tax with Discount: " + discountTaxEngine.calculateTaxWithDiscount(amount, discountRate)); // Cálculo com desconto e imposto
    
    

    }

}
