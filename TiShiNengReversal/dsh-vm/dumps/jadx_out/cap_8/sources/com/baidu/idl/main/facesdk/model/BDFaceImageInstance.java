package com.baidu.idl.main.facesdk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BDFaceImageInstance {
    public byte[] data;
    public int height;
    public com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType imageType;
    private long index;
    public int width;

    public BDFaceImageInstance(android.graphics.Bitmap r10) {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.index = r0
            if (r10 == 0) goto L3c
            int r0 = r10.getWidth()
            int r1 = r10.getHeight()
            int r0 = r0 * r1
            int[] r2 = new int[r0]
            int r4 = r10.getWidth()
            int r7 = r10.getWidth()
            int r8 = r10.getHeight()
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r1.getPixels(r2, r3, r4, r5, r6, r7, r8)
            int r3 = r1.getHeight()
            int r4 = r1.getWidth()
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r10 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_BGRA
            int r5 = r10.ordinal()
            r6 = 0
            r7 = 0
            r1 = r9
            r1.createInt(r2, r3, r4, r5, r6, r7)
        L3c:
            return
    }

    public BDFaceImageInstance(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.index = r0
            r2.height = r4
            r2.width = r5
            r2.data = r3
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType[] r3 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.values()
            r3 = r3[r6]
            r2.imageType = r3
            return
    }

    public BDFaceImageInstance(byte[] r10, int r11, int r12, com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType r13, float r14, int r15) {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.index = r0
            if (r10 == 0) goto L1a
            if (r11 <= 0) goto L1a
            if (r12 <= 0) goto L1a
            int r6 = r13.ordinal()
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r8 = r15
            r2.create(r3, r4, r5, r6, r7, r8)
        L1a:
            return
    }

    private native int create(byte[] r1, int r2, int r3, int r4, float r5, int r6);

    private native int createInt(int[] r1, int r2, int r3, int r4, float r5, int r6);

    public native int destory();

    public native com.baidu.idl.main.facesdk.model.BDFaceImageInstance getImage();
}
