package org.stjs.javascript;

import org.stjs.javascript.dom.media.MediaStream;

public class AudioContext {
    /**
     * Read only Returns a double representing an ever-increasing hardware time
     * in seconds used for scheduling. It starts at 0.
     */
    public double currentTime;
    /**
     * Read only Returns an AudioDestinationNode representing the final
     * destination of all audio in the context. It can be thought of as the
     * audio-rendering device.
     */
    public AudioDestinationNode destination;
    /**
     * Read only Returns the AudioListener object, used for 3D spatialization.
     */
    public AudioListener listener;
    /**
     * Read only Returns a float representing the sample rate (in samples per
     * second) used by all nodes in this context. The sample-rate of an
     * AudioContext cannot be changed.
     */
    public float sampleRate;
    /**
     * Read only Returns the current state of the AudioContext.
     */
    public String state;

    /**
     * Closes the audio context, releasing any system audio resources that it
     * uses.
     */
    public void close() {
    };

    /**
     * Creates a new, empty AudioBuffer object, which can then be populated by
     * data and played via an AudioBufferSourceNode.
     */
    public void createBuffer() {
    };

    /**
     * Creates a ConstantSourceNode object, which is an audio source that
     * continuously outputs a monaural (one-channel) sound signal whose samples
     * all have the same value.
     */
    public void createConstantSource() {
    };

    /**
     * Creates an AudioBufferSourceNode, which can be used to play and
     * manipulate audio data contained within an AudioBuffer object.
     * AudioBuffers are created using AudioContext.createBuffer or returned by
     * AudioContext.decodeAudioData when it successfully decodes an audio track.
     */
    public void createBufferSource() {
    };

    /**
     * Creates a MediaElementAudioSourceNode associated with an
     * HTMLMediaElement. This can be used to play and manipulate audio from
     * <video> or <audio> elements.
     */
    public void createMediaElementSource() {
    };

    /**
     * Creates a MediaStreamAudioSourceNode associated with a MediaStream
     * representing an audio stream which may come from the local computer
     * microphone or other sources.
     */
    public MediaStreamAudioSourceNode createMediaStreamSource(MediaStream stream) {
        return null;
    };

    /**
     * Creates a MediaStreamAudioDestinationNode associated with a MediaStream
     * representing an audio stream which may be stored in a local file or sent
     * to another computer.
     */
    public void createMediaStreamDestination() {
    };

    /**
     * Creates a ScriptProcessorNode, which can be used for direct audio
     * processing via JavaScript.
     */
    public void createScriptProcessor() {
    };

    /**
     * Creates a StereoPannerNode, which can be used to apply stereo panning to
     * an audio source.
     */
    public void createStereoPanner() {
    };

    /**
     * Creates an AnalyserNode, which can be used to expose audio time and
     * frequency data and for example to create data visualisations.
     */
    public AnalyserNode createAnalyser() {
        return null;
    };

    /**
     * Creates a BiquadFilterNode, which represents a second order filter
     * configurable as several different common filter types: high-pass,
     * low-pass, band-pass, etc.
     */
    public void createBiquadFilter() {
    };

    /**
     * Creates a ChannelMergerNode, which is used to combine channels from
     * multiple audio streams into a single audio stream.
     */
    public void createChannelMerger() {
    };

    /**
     * Creates a ChannelSplitterNode, which is used to access the individual
     * channels of an audio stream and process them separately.
     */
    public void createChannelSplitter() {
    };

    /**
     * Creates a ConvolverNode, which can be used to apply convolution effects
     * to your audio graph, for example a reverberation effect.
     */
    public void createConvolver() {
    };

    /**
     * Creates a DelayNode, which is used to delay the incoming audio signal by
     * a certain amount. This node is also useful to create feedback loops in a
     * Web Audio API graph.
     */
    public void createDelay() {
    };

    /**
     * Creates a DynamicsCompressorNode, which can be used to apply acoustic
     * compression to an audio signal.
     */
    public void createDynamicsCompressor() {
    };

    /**
     * Creates a GainNode, which can be used to control the overall volume of
     * the audio graph.
     */
    public GainNode createGain() {
        return null;
    };

    /**
     * Creates an IIRFilterNode, which represents a second order filter
     * configurable as several different common filter types.
     */
    public void createIIRFilter() {
    };

    /**
     * Creates an OscillatorNode, a source representing a periodic waveform. It
     * basically generates a tone.
     */
    public void createOscillator() {
    };

    /**
     * Creates a PannerNode, which is used to spatialise an incoming audio
     * stream in 3D space.
     */
    public void createPanner() {
    };

    /**
     * Creates a PeriodicWave, used to define a periodic waveform that can be
     * used to determine the output of an OscillatorNode.
     */
    public void createPeriodicWave() {
    };

    /**
     * Creates a WaveShaperNode, which is used to implement non-linear
     * distortion effects.
     */
    public void createWaveShaper() {
    };

    /**
     * Creates an AudioWorkerNode, which can interact with a web worker thread
     * to generate, process, or analyse audio directly. This was added to the
     * spec on August 29 2014, and is not implemented in any browser yet.
     */
    public void createAudioWorker() {
    };

    /**
     * Asynchronously decodes audio file data contained in an ArrayBuffer. In
     * this case, the ArrayBuffer is usually loaded from an XMLHttpRequest's
     * response attribute after setting the responseType to arraybuffer. This
     * method only works on complete files, not fragments of audio files.
     */
    public void decodeAudioData() {
    };

    /**
     * Resumes the progression of time in an audio context that has previously
     * been suspended.
     */
    public void resume() {
    };

    /**
     * Suspends the progression of time in the audio context, temporarily
     * halting audio hardware access and reducing CPU/battery usage in the
     * process.
     */
    public void suspend() {
    };

}
