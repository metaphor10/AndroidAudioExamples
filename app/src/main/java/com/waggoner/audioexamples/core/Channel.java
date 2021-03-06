package com.waggoner.audioexamples.core;

/**
 * Created by nathanielwaggoner on 8/6/15.
 */
public interface Channel {

    void setAudioSource(OutputSource audioSource);
    OutputSource getAudioSource();
    void processBuffer(short[] buffer);
    void setEffect(Effect effect);
    Effect getEffect();
    void destroy();
    void play();

}
