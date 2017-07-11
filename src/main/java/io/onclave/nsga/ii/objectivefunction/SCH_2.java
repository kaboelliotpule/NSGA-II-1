/*
 * This code file and the codebase/software containing it is 
 * explicitely licensed to Mr. Debabrata Acharya (@onclave)
 * unauthorized use and access of the codebase, parts of the 
 * codebase, software or parts of this software is not allowed.
 */
package io.onclave.nsga.ii.objectivefunction;

import io.onclave.nsga.ii.Interface.IObjectiveFunction;
import io.onclave.nsga.ii.api.Service;
import io.onclave.nsga.ii.datastructure.Chromosome;
import io.onclave.nsga.ii.datastructure.ParetoObject;

/**
 *
 * @author sajib
 */
public class SCH_2 implements IObjectiveFunction {

    @Override
    public double objectiveFunction(Chromosome chromosome) {
        return objectiveFunction(new ParetoObject(chromosome));
    }

    @Override
    public double objectiveFunction(ParetoObject paretoObject) {
        return Math.pow((Service.decodeGeneticCode(paretoObject.getChromosome().getGeneticCode()) - 2), 2);
    }
    
}