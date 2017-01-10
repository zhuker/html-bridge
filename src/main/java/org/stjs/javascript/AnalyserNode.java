package org.stjs.javascript;

import org.stjs.javascript.typed.Float32Array;
import org.stjs.javascript.typed.Uint8Array;

public class AnalyserNode extends AudioNode {
    /**
     * Is an unsigned long value representing the size of the FFT (Fast Fourier
     * Transform) to be used to determine the frequency domain.
     */
    public long fftSize;
    /**
     * Is an unsigned long value half that of the FFT size. This generally
     * equates to the number of data values you will have to play with for the
     * visualization.
     */
    public long frequencyBinCount;
    /**
     * Is a double value representing the minimum power value in the scaling
     * range for the FFT analysis data, for conversion to unsigned byte values —
     * basically, this specifies the minimum value for the range of results when
     * using getByteFrequencyData().
     */
    public double minDecibels;
    /**
     * Is a double value representing the maximum power value in the scaling
     * range for the FFT analysis data, for conversion to unsigned byte values —
     * basically, this specifies the maximum value for the range of results when
     * using getByteFrequencyData().
     */
    public double maxDecibels;
    /**
     * Is a double value representing the averaging constant with the last
     * analysis frame — basically, it makes the transition between values over
     * time smoother.
     */
    public double smoothingTimeConstant;

    /**
     * Copies the current frequency data into a Float32Array array passed into
     * it.
     */
    public void getFloatFrequencyData(Float32Array array) {
    }

    /**
     * Copies the current frequency data into a Uint8Array (unsigned byte array)
     * passed into it.
     */
    public void getByteFrequencyData(Uint8Array data) {
    }

    /**
     * Copies the current waveform, or time-domain, data into a Float32Array
     * array passed into it.
     */
    public void getFloatTimeDomainData(Float32Array array) {
    }

    /**
     * Copies the current waveform, or time-domain, data into a Uint8Array
     * (unsigned byte array) passed into it.
     */
    public void getByteTimeDomainData(Uint8Array data) {
    }
}
