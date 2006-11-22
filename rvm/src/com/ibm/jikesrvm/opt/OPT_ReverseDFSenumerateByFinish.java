/*
 * This file is part of Jikes RVM (http://jikesrvm.sourceforge.net).
 * The Jikes RVM project is distributed under the Common Public License (CPL).
 * A copy of the license is included in the distribution, and is also
 * available at http://www.opensource.org/licenses/cpl1.0.php
 *
 * (C) Copyright IBM Corp. 2001
 */
//$Id$
package com.ibm.jikesrvm.opt;

/**
 *  This class generates an enumeration of nodes of a graph, in order
 * of increasing finishing time in a reverse Depth First Search,
 * i.e. a search traversing nodes from target to source.
 *
 * @author Julian Dolby
 *
 */
class OPT_ReverseDFSenumerateByFinish extends OPT_DFSenumerateByFinish {

  /**
   *  Construct a reverse DFS across a graph.
   * 
   * @param net The graph over which to search.
   */
  OPT_ReverseDFSenumerateByFinish (OPT_Graph net) {
    super(net);
  }

  /**
   *  Construct a reverse DFS across a subset of a graph, starting
   * at the given set of nodes.
   *
   * @param net The graph over which to search
   * @param nodes The nodes at which to start the search
   */
  OPT_ReverseDFSenumerateByFinish (OPT_Graph net, OPT_GraphNodeEnumeration nodes) {
    super(net, nodes);
  }

  /**
   *  Traverse edges from target to source.
   *
   * @param n A node in the DFS
   * @return The nodes that have edges leading to n
   */
  protected OPT_GraphNodeEnumeration getConnected (OPT_GraphNode n) {
    return  n.inNodes();
  }
}


