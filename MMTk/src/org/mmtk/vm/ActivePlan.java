package org.mmtk.vm;

import org.mmtk.plan.Plan;
import org.mmtk.plan.CollectorContext;
import org.mmtk.plan.MutatorContext;
import org.mmtk.plan.PlanConstraints;
import org.vmmagic.pragma.InterruptiblePragma;
import org.vmmagic.pragma.Uninterruptible;

/**
 * Stub to give access to plan local, constraint and global instances
 * 
 * $Id: ActivePlan.java,v 1.4 2006/06/21 07:38:13 steveb-oss Exp $
 * 
 * @author Daniel Frampton
 * @author Robin Garner
 */
public abstract class ActivePlan implements Uninterruptible {

  /** @return The active Plan instance. */
  public abstract Plan global();

  /** @return The active PlanConstraints instance. */
  public abstract PlanConstraints constraints();

  /** @return The active <code>CollectorContext</code> instance. */
  public abstract CollectorContext collector();

  /** @return The active <code>MutatorContext</code> instance. */
  public abstract MutatorContext mutator();

  /**
   * Return the <code>MutatorContext</code> instance given it's unique identifier.
   * 
   * @param id The identifier of the <code>MutatorContext</code>  to return
   * @return The specified <code>MutatorContext</code>
   */
  public abstract MutatorContext mutator(int id);

  /** @return The number of registered <code>MutatorContext</code> instances. */
  public abstract int mutatorCount();

  /** Reset the mutator iterator */
  public abstract void resetMutatorIterator();

  /**
   * Return the next <code>MutatorContext</code> in a
   * synchronized iteration of all mutators.
   * 
   * @return The next <code>MutatorContext</code> in a
   *  synchronized iteration of all mutators, or
   *  <code>null</code> when all mutators have been done.
   */
  public abstract MutatorContext getNextMutator();

  /**
   * Register a new <code>CollectorContext</code> instance.
   * 
   * @param collector The <code>CollectorContext</code> to register.
   * @return The <code>CollectorContext</code>'s unique identifier
   */
  public abstract int registerCollector(CollectorContext collector) throws InterruptiblePragma;

  /**
   * Register a new <code>MutatorContext</code> instance.
   * 
   * @param mutator The <code>MutatorContext</code> to register.
   * @return The <code>MutatorContext</code>'s unique identifier
   */
  public abstract int registerMutator(MutatorContext mutator) throws InterruptiblePragma;
}