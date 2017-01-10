package org.stjs.javascript;

import org.stjs.javascript.typed.Float32Array;

public class AudioParam extends AudioNode {
    /**
     * Represents the initial volume of the attribute as defined by the specific
     * AudioNode creating the AudioParam.
     */
    public float defaultValue;
    /**
     * Represents the maximum possible value for the parameter's nominal
     * (effective) range.
     */
    public float maxValue;
    /**
     * Represents the minimum possible value for the parameter's nominal
     * (effective) range.
     */
    public float minValue;
    /**
     * Represents the parameter's current volume as a floating point value;
     * initially set to the value of AudioParam.defaultValue. Though it can be
     * set, any modifications happening while there are automation events
     * scheduled — that is events scheduled using the methods of the AudioParam
     * — are ignored, without raising any exception.
     */
    public float value;

    /**
     * Schedules an instant change to the value of the AudioParam at a precise
     * time, as measured against AudioContext.currentTime. The new value is
     * given in the value parameter. value A floating point number representing
     * the value the AudioParam will change to at the given time. startTime A
     * double representing the time (in seconds) after the AudioContext was
     * first created that the change in value will happen. A TypeError is thrown
     * if this value is negative.
     */
    public AudioParam setValueAtTime(float value, double startTime) {
        return null;
    }

    /**
     * Schedules a gradual linear change in the value of the AudioParam. The
     * change starts at the time specified for the previous event, follows a
     * linear ramp to the new value given in the value parameter, and reaches
     * the new value at the time given in the endTime parameter. Parameters
     * 
     * value A floating point number representing the value the AudioParam will
     * ramp to by the given time. endTime A double representing the exact time
     * (in seconds) after the ramping starts that the changing of the value will
     * stop. Returns
     * 
     * A reference to this AudioParam object. In some browsers older
     * implementations of this interface return void.
     */
    public AudioParam linearRampToValueAtTime(float value, double endTime) {
        return null;
    }

    /**
     * Schedules a gradual exponential change in the value of the AudioParam.
     * The change starts at the time specified for the previous event, follows
     * an exponential ramp to the new value given in the value parameter, and
     * reaches the new value at the time given in the endTime parameter.
     */
    public AudioParam exponentialRampToValueAtTime(float value, double endTime) {
        return null;
    }

    /**
     * Schedules the start of a change to the value of the AudioParam. The
     * change starts at the time specified in startTime and exponentially moves
     * towards the value given by the target parameter. The exponential decay
     * rate is defined by the timeConstant parameter, which is a time measured
     * in seconds. Parameters
     * 
     * target The value the parameter will start to transition towards at the
     * given start time. startTime The time that the exponential transition will
     * begin, which will be relative to AudioContext.currentTime. timeConstant
     * The time-constant value of first-order filter (exponential) approach to
     * the target value. The larger this value is, the slower the transition
     * will be. Returns
     * 
     * A reference to this AudioParam object. In some browsers older
     * implementations of this interface return void.
     */
    public AudioParam setTargetAtTime(float target, double startTime, float timeConstant) {
        return null;
    }

    /**
     * Schedules the values of the AudioParam to follow a set of values, defined
     * by the values Float32Array scaled to fit into the given interval,
     * starting at startTime, and having a specific duration. Parameters
     * 
     * values A Float32Array representing the value curve the AudioParam will
     * change through along the duration. startTime A double representing the
     * time (in seconds) after the AudioContext was first created that the
     * change in value will happen. duration A double representing the time (in
     * seconds) the values will be changed between. The values are spaced
     * equally along this duration. Return value
     * 
     * A reference to this AudioParam object. In some browsers older
     * implementations of this interface return void.
     */
    public AudioParam setValueCurveAtTime(Float32Array values, double startTime, double duration) {
        return null;
    }

    /**
     * Cancels all scheduled future changes to the AudioParam. Parameters
     * 
     * startTime A double representing the time (in seconds) after the
     * AudioContext was first created after which all scheduled changes will be
     * cancelled. Returns
     * 
     * A reference to this AudioParam object. In some browsers older
     * implementations of this interface return void.
     */
    public AudioParam cancelScheduledValues(double startTime) {
        return null;
    }

}
