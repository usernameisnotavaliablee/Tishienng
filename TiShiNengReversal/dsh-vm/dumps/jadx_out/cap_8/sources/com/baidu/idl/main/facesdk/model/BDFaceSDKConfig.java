package com.baidu.idl.main.facesdk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BDFaceSDKConfig {
    public float detectInterval;
    public boolean isAttribute;
    public boolean isCheckBlur;
    public boolean isCropFace;
    private boolean isEmotion;
    public boolean isEyeClose;
    public boolean isHeadPose;
    public boolean isIllumination;
    public boolean isMouthClose;
    public boolean isOcclusion;
    public int maxDetectNum;
    public int minFaceSize;
    public float notNIRFaceThreshold;
    public float notRGBFaceThreshold;
    public float scaleRatio;
    public float trackInterval;

    public BDFaceSDKConfig() {
            r2 = this;
            r2.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.scaleRatio = r0
            r0 = 10
            r2.maxDetectNum = r0
            r0 = 0
            r2.minFaceSize = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.notRGBFaceThreshold = r1
            r2.notNIRFaceThreshold = r1
            r1 = 0
            r2.detectInterval = r1
            r1 = 1140457472(0x43fa0000, float:500.0)
            r2.trackInterval = r1
            r2.isCheckBlur = r0
            r2.isOcclusion = r0
            r2.isIllumination = r0
            r2.isHeadPose = r0
            r2.isAttribute = r0
            r2.isEmotion = r0
            r2.isCropFace = r0
            r2.isEyeClose = r0
            r2.isMouthClose = r0
            return
    }
}
