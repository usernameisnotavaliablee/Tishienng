package com.baidu.idl.main.facesdk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BDFaceSDKActionConfig {
    public float eyeCloseThreshold;
    public float eyeOpenThreshold;
    public float lookDownThreshold;
    public float lookUpThreshold;
    public float mouthCloseThreshold;
    public float mouthOpenThreshold;
    public float shakeThreshold;
    public float turnLeftThreshold;
    public float turnRightThreshold;

    public BDFaceSDKActionConfig() {
            r2 = this;
            r2.<init>()
            r0 = 1060320051(0x3f333333, float:0.7)
            r2.eyeCloseThreshold = r0
            r1 = 1050253722(0x3e99999a, float:0.3)
            r2.eyeOpenThreshold = r1
            r2.mouthCloseThreshold = r0
            r2.mouthOpenThreshold = r1
            r0 = 1090519040(0x41000000, float:8.0)
            r2.lookUpThreshold = r0
            r1 = -1056964608(0xffffffffc1000000, float:-8.0)
            r2.lookDownThreshold = r1
            r2.turnLeftThreshold = r0
            r2.turnRightThreshold = r1
            r0 = 1092616192(0x41200000, float:10.0)
            r2.shakeThreshold = r0
            return
    }
}
