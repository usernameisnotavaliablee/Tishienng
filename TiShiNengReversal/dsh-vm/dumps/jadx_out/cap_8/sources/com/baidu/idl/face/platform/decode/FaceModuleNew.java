package com.baidu.idl.face.platform.decode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceModuleNew {
    private static final java.lang.String TAG = "FaceModuleNew";
    private com.baidu.idl.face.platform.FaceConfig mFaceConfig;
    private com.baidu.idl.face.platform.model.FaceExtInfo mFaceExtInfo;
    private com.baidu.idl.face.platform.model.FaceExtInfo[] mFaceExtInfos;

    public FaceModuleNew() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.ArrayList<com.baidu.idl.face.platform.model.ImageInfo> getDetectBestCropImageList(com.baidu.idl.face.platform.model.FaceExtInfo r5, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            if (r6 != 0) goto L7
            return r0
        L7:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.baidu.idl.face.platform.model.ImageInfo r0 = new com.baidu.idl.face.platform.model.ImageInfo
            r0.<init>()
            android.graphics.Bitmap r6 = com.baidu.idl.face.platform.utils.BitmapUtils.getInstaceBmp(r6)
            com.baidu.idl.face.platform.FaceConfig r1 = r4.mFaceConfig
            if (r1 == 0) goto L1c
            r1.getSecType()
        L1c:
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            r2 = 90
            byte[] r1 = r1.compressImage(r6, r2)
            com.baidu.idl.face.platform.FaceSDKManager r2 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            java.lang.String r1 = r2.bitmapToBase64(r1)
            if (r1 == 0) goto L3e
            int r2 = r1.length()
            if (r2 <= 0) goto L3e
            java.lang.String r2 = "\\/"
            java.lang.String r3 = "/"
            java.lang.String r1 = r1.replace(r2, r3)
        L3e:
            r0.setBase64(r1)
            r5.add(r0)
            if (r6 == 0) goto L49
            r6.recycle()
        L49:
            return r5
    }

    public java.util.ArrayList<com.baidu.idl.face.platform.model.ImageInfo> getDetectBestSrcImageList(com.baidu.idl.face.platform.model.FaceExtInfo r6, com.baidu.idl.main.facesdk.model.BDFaceImageInstance r7) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            if (r7 != 0) goto L7
            return r0
        L7:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.baidu.idl.face.platform.model.ImageInfo r0 = new com.baidu.idl.face.platform.model.ImageInfo
            r0.<init>()
            android.graphics.Bitmap r7 = com.baidu.idl.face.platform.utils.BitmapUtils.getInstaceBmp(r7)
            com.baidu.idl.face.platform.FaceConfig r1 = r5.mFaceConfig
            if (r1 == 0) goto L2d
            com.baidu.idl.face.platform.FaceSDKManager r1 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.face.platform.FaceConfig r2 = r5.mFaceConfig
            float r2 = r2.getScale()
            android.graphics.Bitmap r1 = r1.scaleImage(r7, r2)
            com.baidu.idl.face.platform.FaceConfig r2 = r5.mFaceConfig
            r2.getSecType()
            goto L2e
        L2d:
            r1 = r7
        L2e:
            com.baidu.idl.face.platform.FaceSDKManager r2 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            r3 = 90
            byte[] r2 = r2.compressImage(r1, r3)
            com.baidu.idl.face.platform.FaceSDKManager r3 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            java.lang.String r2 = r3.bitmapToBase64(r2)
            if (r2 == 0) goto L50
            int r3 = r2.length()
            if (r3 <= 0) goto L50
            java.lang.String r3 = "\\/"
            java.lang.String r4 = "/"
            java.lang.String r2 = r2.replace(r3, r4)
        L50:
            r0.setBase64(r2)
            r6.add(r0)
            if (r1 == 0) goto L5b
            r1.recycle()
        L5b:
            if (r7 == 0) goto L60
            r7.recycle()
        L60:
            return r6
    }

    public com.baidu.idl.face.platform.model.FaceExtInfo[] getFaceExtInfo(com.baidu.idl.main.facesdk.FaceInfo[] r3) {
            r2 = this;
            com.baidu.idl.face.platform.model.FaceExtInfo[] r0 = r2.mFaceExtInfos
            if (r0 != 0) goto L10
            r0 = 1
            com.baidu.idl.face.platform.model.FaceExtInfo[] r0 = new com.baidu.idl.face.platform.model.FaceExtInfo[r0]
            r2.mFaceExtInfos = r0
            com.baidu.idl.face.platform.model.FaceExtInfo r0 = new com.baidu.idl.face.platform.model.FaceExtInfo
            r0.<init>()
            r2.mFaceExtInfo = r0
        L10:
            r0 = 0
            if (r3 == 0) goto L2f
            int r1 = r3.length
            if (r1 <= 0) goto L2f
            com.baidu.idl.face.platform.model.FaceExtInfo r1 = r2.mFaceExtInfo
            if (r1 != 0) goto L21
            com.baidu.idl.face.platform.model.FaceExtInfo r1 = new com.baidu.idl.face.platform.model.FaceExtInfo
            r1.<init>()
            r2.mFaceExtInfo = r1
        L21:
            com.baidu.idl.face.platform.model.FaceExtInfo r1 = r2.mFaceExtInfo
            r3 = r3[r0]
            r1.addFaceInfo(r3)
            com.baidu.idl.face.platform.model.FaceExtInfo[] r3 = r2.mFaceExtInfos
            com.baidu.idl.face.platform.model.FaceExtInfo r1 = r2.mFaceExtInfo
            r3[r0] = r1
            goto L34
        L2f:
            com.baidu.idl.face.platform.model.FaceExtInfo[] r3 = r2.mFaceExtInfos
            r1 = 0
            r3[r0] = r1
        L34:
            com.baidu.idl.face.platform.model.FaceExtInfo[] r3 = r2.mFaceExtInfos
            return r3
    }

    public void setFaceConfig(com.baidu.idl.face.platform.FaceConfig r1) {
            r0 = this;
            r0.mFaceConfig = r1
            return
    }
}
