package com.kwad.components.offline.api.core.imageplayer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IImagePlayer {
    void destroy();

    android.widget.FrameLayout getImagePlayerView(android.content.Context r1);

    void pause();

    void play();

    void prepareToPlay();

    void registerMediaPlayStateListener(com.kwad.components.offline.api.core.video.listener.OfflineMediaPlayStateListener r1);

    void resume();

    void setDuration(long r1);

    void setEnableCache(boolean r1);

    void setHorizontalGravity(int r1);

    void setImageResize(int r1);

    void setRadius(float r1, float r2, float r3, float r4);

    void setSpeed(float r1);

    void setURLs(java.util.List<java.lang.String> r1);

    void setVerticalGravity(int r1);

    void stop();

    void unregisterMediaPlayStateListener(com.kwad.components.offline.api.core.video.listener.OfflineMediaPlayStateListener r1);
}
