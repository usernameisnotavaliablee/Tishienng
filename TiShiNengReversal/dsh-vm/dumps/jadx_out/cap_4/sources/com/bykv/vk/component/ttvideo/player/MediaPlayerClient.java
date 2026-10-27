package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class MediaPlayerClient {
    public static final int IsAudioVoiceWaitTimeout = 1;
    public static final int IsBuffering = 0;
    public static final int MAX_LOG_LINES = 40;

    public MediaPlayerClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void deselectTrack(int r1);

    public abstract int getCurrentPosition();

    public java.lang.String getDataSource() {
            r1 = this;
            r0 = 0
            return r0
    }

    public double getDoubleOption(int r1, double r2) {
            r0 = this;
            return r2
    }

    public abstract int getDuration();

    public float getFloatOption(int r1, float r2) {
            r0 = this;
            return r2
    }

    public int getIntOption(int r1, int r2) {
            r0 = this;
            return r2
    }

    public long getLongOption(int r1, long r2) {
            r0 = this;
            return r2
    }

    public abstract int getSelectedTrack(int r1);

    public java.lang.String getStringOption(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract com.bykv.vk.component.ttvideo.player.MediaPlayer.TrackInfo[] getTrackInfo();

    public abstract int getType();

    public abstract int getVideoHeight();

    public int getVideoType() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract int getVideoWidth();

    public abstract boolean isLooping();

    public boolean isMute() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean isPlaying();

    public void mouseEvent(int r1, int r2, int r3) {
            r0 = this;
            return
    }

    public abstract void pause();

    public abstract void prepare();

    public abstract void prepareAsync();

    @java.lang.Deprecated
    public abstract void prevClose();

    public abstract void release();

    public abstract void releaseAsync();

    public abstract void reset();

    public void rotateCamera(float r1, float r2) {
            r0 = this;
            java.lang.String r1 = "ttplayer"
            java.lang.String r2 = "<MediaPlayerClient.java,rotateCamera,55>rotateCamera is not implemented"
            com.bytedance.sdk.component.utils.vl.j(r1, r2)
            return
    }

    public abstract void seekTo(int r1);

    public abstract void selectTrack(int r1);

    public void setCacheFile(java.lang.String r1, int r2) {
            r0 = this;
            return
    }

    public abstract void setDataSource(android.content.Context r1, android.net.Uri r2) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException;

    public abstract void setDataSource(android.content.Context r1, android.net.Uri r2, java.util.Map<java.lang.String, java.lang.String> r3) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException;

    public abstract void setDataSource(com.bykv.vk.component.ttvideo.player.IMediaDataSource r1) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException;

    public abstract void setDataSource(java.io.FileDescriptor r1, long r2, long r4) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.io.IOException;

    public abstract void setDataSource(java.lang.String r1) throws java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException, java.io.IOException;

    public abstract void setDisplay(android.view.SurfaceHolder r1);

    public int setDoubleOption(int r1, double r2) {
            r0 = this;
            r1 = -1
            return r1
    }

    public int setFloatOption(int r1, float r2) {
            r0 = this;
            r1 = -1
            return r1
    }

    public abstract void setFrameMetadataListener(com.bykv.vk.component.ttvideo.player.FrameMetadataListener r1);

    public int setIntOption(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = "ttplayer"
            java.lang.String r2 = "<MediaPlayerClient.java,setIntOption,65>set os player is not inval"
            com.bytedance.sdk.component.utils.vl.j(r1, r2)
            r1 = -1
            return r1
    }

    public void setIsMute(boolean r1) {
            r0 = this;
            return
    }

    public int setLongOption(int r1, long r2) {
            r0 = this;
            r1 = -1
            return r1
    }

    public abstract void setLooping(boolean r1);

    public abstract void setMediaTransport(com.bykv.vk.component.ttvideo.player.MediaTransport r1);

    public abstract void setOnBufferingUpdateListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener r1);

    public abstract void setOnCompletionListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener r1);

    public abstract void setOnErrorListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener r1);

    public abstract void setOnExternInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnExternInfoListener r1);

    public abstract void setOnInfoListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener r1);

    public void setOnLogListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnLogListener r1) {
            r0 = this;
            return
    }

    public abstract void setOnPreparedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener r1);

    public abstract void setOnSARChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.onSARChangedListener r1);

    public abstract void setOnSeekCompleteListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener r1);

    public abstract void setOnVideoSizeChangedListener(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener r1);

    public void setPanoVideoControlModel(int r1) {
            r0 = this;
            return
    }

    public abstract void setPlaybackParams(com.bykv.vk.component.ttvideo.player.PlaybackParams r1);

    public abstract void setScreenOnWhilePlaying(boolean r1);

    public int setStringOption(int r1, java.lang.String r2) {
            r0 = this;
            r1 = -1
            return r1
    }

    public abstract void setSurface(android.view.Surface r1);

    public abstract void setVolume(float r1, float r2);

    public abstract void setWakeMode(android.content.Context r1, int r2);

    public abstract void start();

    public abstract void stop();

    public abstract void switchStream(int r1, int r2);

    public abstract void takeScreenshot(com.bykv.vk.component.ttvideo.player.MediaPlayer.OnScreenshotListener r1);
}
