package com.kwad.components.offline.api.core.adWaynePlayer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IAdWaynePlayerPlayModule {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCompletionListener {
        void onCompletion();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnErrorListener {
        boolean onError(int r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnInfoListener {
        boolean onInfo(int r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPreparedListener {
        void onPrepared();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPreparingListener {
        void onPreparing();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnSeekCompleteListener {
        void onSeekComplete();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(int r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnVseReportListener {
        void onVseReport(java.lang.String r1, java.lang.String r2);
    }

    int getAudioSessionId();

    java.lang.String getCurrentPlayingUrl();

    long getCurrentPosition();

    long getDuration();

    int getVideoHeight();

    int getVideoWidth();

    boolean isLooping();

    boolean isPlaying();

    boolean isWaynePlayerReady();

    void pause();

    boolean prepareAsync();

    void release();

    void reset();

    void seekTo(long r1);

    void setAudioStreamType(int r1);

    void setDataSource(java.lang.String r1, boolean r2);

    void setDisplay(android.view.SurfaceHolder r1);

    void setLooping(boolean r1);

    void setOnBufferingUpdateListener(com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnBufferingUpdateListener r1);

    void setOnCompletionListener(com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnCompletionListener r1);

    void setOnErrorListener(com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnErrorListener r1);

    void setOnInfoListener(com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnInfoListener r1);

    void setOnPreparedListener(com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnPreparedListener r1);

    void setOnSeekCompleteListener(com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnSeekCompleteListener r1);

    void setOnVideoSizeChangedListener(com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnVideoSizeChangedListener r1);

    void setOnVseReportListener(com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnVseReportListener r1);

    void setScreenOnWhilePlaying(boolean r1);

    void setSpeed(float r1);

    void setSurface(android.view.Surface r1);

    void setVolume(float r1, float r2);

    void start();

    void stop();
}
