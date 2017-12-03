package edu.luc.etl.cs313.android.simplestopwatch.model.counter;

/**
 * Created by developer on 4/4/2016.
 */

    /** A bounded counter abstraction. */
// begin-interface-BoundedCounterModel
    public interface BoundedCounterModel {
        void increment();
        void decrement();
        int getClickValue();
        void reset();
        boolean isFull();
        boolean isEmpty();
        void resetRuntime();
        void decRuntime();
        int getRuntime();
    }

