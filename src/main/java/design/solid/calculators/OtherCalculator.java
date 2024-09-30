/*
 * COPYRIGHT NTT 2024 - ALL RIGHTS RESERVED.
 * 
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of NTT.
 */
package design.solid.calculators;

/**
 * @author NTT - framos
 *
 */
public interface OtherCalculator {

    Double calculate(Double amount);

    Double applyDiscount(Double amount, Double discountRate);
}
