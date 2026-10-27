package com.qq.e.comm.pi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface AdData {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface VideoPlayer {
        int getCurrentPosition();

        int getDuration();

        int getVideoState();
    }

    boolean equalsAdData(com.qq.e.comm.pi.AdData r1);

    int getAdPatternType();

    java.lang.String getDesc();

    int getECPM();

    java.lang.String getECPMLevel();

    java.util.Map<java.lang.String, java.lang.Object> getExtraInfo();

    <T> T getProperty(java.lang.Class<T> r1);

    java.lang.String getProperty(java.lang.String r1);

    java.lang.String getTitle();

    int getVideoDuration();

    void setECPMLevel(java.lang.String r1);
}
