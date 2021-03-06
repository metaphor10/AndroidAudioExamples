package com.waggoner.audioexamples.outputs;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import com.waggoner.audioexamples.core.OutputSource;

/**
 *
 * Sound pools are easier than audio tracks, but faster than MediaPlayers.  We like them!
 * Created by nathanielwaggoner on 8/7/15.
 */
public class SoundPoolSource implements OutputSource {

    SoundPool sp;
    int soundId;

    /**
     * Sound pool from raw resources.
     * @param context
     * @param rawId
     */
    public SoundPoolSource(Context context, int rawId) {
        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        /** soundId for Later handling of sound pool **/

        soundId = sp.load(context,rawId, 1);

    }
    @Override
    public void playAudio() {
        sp.play(soundId, 1, 1, 0, 0, 1);
    }

    @Override
    public void stopAudio() {
        sp.stop(soundId);
    }

    @Override
    public void destroy() {
        sp.release();
    }
}
