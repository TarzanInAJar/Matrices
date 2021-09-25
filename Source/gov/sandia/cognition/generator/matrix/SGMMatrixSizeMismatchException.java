/*
 * File:                SGMMatrixSizeMismatchException.java
 * Authors:             zobenz
 * Company:             Sandia National Laboratories
 * Project:             Analogy LDRD
 * 
 * Copyright Nov 21, 2007, Sandia Corporation.  Under the terms of Contract 
 * DE-AC04-94AL85000, there is a non-exclusive license for use of this work by 
 * or on behalf of the U.S. Government. Export of this program may require a 
 * license from the United States Government. See CopyrightHistory.txt for
 * complete details.
 * 
 * Reviewers:
 * Review Date:
 * Changes Needed:
 * Review Comments:
 * 
 * Revision History:
 * 
 * $Log: SGMMatrixSizeMismatchException.java,v $
 * Revision 1.3  2010/12/22 21:48:58  zobenz
 * Fixed naming of SGMMatrix
 *
 * Revision 1.2  2010/12/21 16:10:57  zobenz
 * Normalized documentation to match tool name.
 *
 * Revision 1.1  2010/12/21 15:50:06  zobenz
 * Migrated matrix generation code into standalone project
 *
 * Revision 1.1  2010/12/20 23:21:04  zobenz
 * Went from sgm package namespace to generator.matrix
 *
 * Revision 1.1  2010/12/20 18:58:34  zobenz
 * Renamed packages in preparation for migrating SGM code out to separate SGMT project.
 *
 * Revision 1.1  2010/12/20 17:52:23  zobenz
 * Refactoring to conform to Sandia Generated Matrix name for tool.
 *
 * Revision 1.1  2007/11/21 22:28:30  zobenz
 * Implemented SGMMatrix, which is composed of layers; starting work on stochastic generation of SGMs to fit a specified score distribution
 *
 */
package gov.sandia.cognition.generator.matrix;

/**
 * @TODO - add description
 *
 * @author zobenz
 * @since 2.0
 */
public class SGMMatrixSizeMismatchException
    extends RuntimeException
{

    /**
     * Creates a new instance of <code>SGMMatrixSizeMismatchException</code>
     * without detail message.
     */
    public SGMMatrixSizeMismatchException()
    {
        super();
    }

    /**
     * Constructs an instance of <code>SGMMatrixSizeMismatchException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public SGMMatrixSizeMismatchException(
        String msg)
    {
        super(msg);
    }

    /**
     * Constructs and instance of <code>SGMMatrixSizeMismatchException</code>
     * with the two mismatching dimensions. 
     *
     * @param first The first dimensionality
     * @param second The second dimensionality
     */
    public SGMMatrixSizeMismatchException(
        SGMMatrixSize first,
        SGMMatrixSize second)
    {
        super("SGM matrix sizes must be the same: " +
            "(" + first.getNumRows() +
            "x" + first.getNumColumns() + ") !=" +
            "(" + second.getNumRows() +
            "x" + second.getNumColumns() + ")");
    }
}
