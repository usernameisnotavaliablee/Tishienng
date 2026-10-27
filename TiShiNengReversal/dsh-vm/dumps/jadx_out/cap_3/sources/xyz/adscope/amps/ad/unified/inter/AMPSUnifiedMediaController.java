package xyz.adscope.amps.ad.unified.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface AMPSUnifiedMediaController {
    long getVideoCurrentPosition();

    long getVideoDuration();

    void pauseVideo();

    void resumeVideo();

    void setVideoMute(boolean r1);

    void startVideo();

    void stopVideo();
}
