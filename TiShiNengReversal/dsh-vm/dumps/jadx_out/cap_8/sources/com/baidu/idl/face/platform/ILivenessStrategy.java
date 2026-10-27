package com.baidu.idl.face.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ILivenessStrategy {
    void livenessStrategy(byte[] r1);

    void reset();

    void setLivenessStrategyConfig(java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r1, android.graphics.Rect r2, android.graphics.Rect r3, com.baidu.idl.face.platform.ILivenessStrategyCallback r4);

    void setLivenessStrategySoundEnable(boolean r1);

    void setPreviewDegree(int r1);
}
