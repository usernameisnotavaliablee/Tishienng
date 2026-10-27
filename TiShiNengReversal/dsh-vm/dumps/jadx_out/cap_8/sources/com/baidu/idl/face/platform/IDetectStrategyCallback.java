package com.baidu.idl.face.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IDetectStrategyCallback {
    public static final java.lang.String IMAGE_KEY_BEST_CROP_IMAGE = "bestCropDetectImage_";
    public static final java.lang.String IMAGE_KEY_BEST_SRC_IMAGE = "bestSrcDetectImage_";

    void onDetectCompletion(com.baidu.idl.face.platform.FaceStatusNewEnum r1, java.lang.String r2, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r3, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r4);
}
