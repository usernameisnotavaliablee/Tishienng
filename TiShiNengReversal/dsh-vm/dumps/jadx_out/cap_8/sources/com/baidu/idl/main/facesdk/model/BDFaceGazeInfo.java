package com.baidu.idl.main.facesdk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BDFaceGazeInfo {
    public float leftEyeConf;
    public com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection leftEyeGaze;
    public float rightEyeConf;
    public com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection rightEyeGaze;

    public BDFaceGazeInfo(int r2, float r3, int r4, float r5) {
            r1 = this;
            r1.<init>()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.values()
            r2 = r0[r2]
            r1.leftEyeGaze = r2
            r1.leftEyeConf = r3
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection[] r2 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.values()
            r2 = r2[r4]
            r1.rightEyeGaze = r2
            r1.rightEyeConf = r5
            return
    }
}
