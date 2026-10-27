package com.baidu.idl.face.platform.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceModel {
    private com.baidu.idl.main.facesdk.model.BDFaceImageInstance BitmapInstance;
    private com.baidu.idl.main.facesdk.model.BDFaceImageInstance cropInstance;
    private com.baidu.idl.face.platform.model.FaceExtInfo[] faceInfos;
    private com.baidu.idl.face.platform.FaceStatusNewEnum faceNewStatus;
    private com.baidu.idl.main.facesdk.FaceInfo[] faceSDKInfos;
    private long frameTime;
    private com.baidu.idl.main.facesdk.model.BDFaceImageInstance imageInstance;

    public FaceModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance getBitmapInstance() {
            r1 = this;
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r0 = r1.BitmapInstance
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance getCropInstance() {
            r1 = this;
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r0 = r1.cropInstance
            return r0
    }

    public com.baidu.idl.face.platform.model.FaceExtInfo[] getFaceInfos() {
            r1 = this;
            com.baidu.idl.face.platform.model.FaceExtInfo[] r0 = r1.faceInfos
            return r0
    }

    public com.baidu.idl.face.platform.FaceStatusNewEnum getFaceModuleStateNew() {
            r1 = this;
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = r1.faceNewStatus
            return r0
    }

    public com.baidu.idl.main.facesdk.FaceInfo[] getFaceSDKInfos() {
            r1 = this;
            com.baidu.idl.main.facesdk.FaceInfo[] r0 = r1.faceSDKInfos
            return r0
    }

    public long getFrameTime() {
            r2 = this;
            long r0 = r2.frameTime
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceImageInstance getImageInstance() {
            r1 = this;
            com.baidu.idl.main.facesdk.model.BDFaceImageInstance r0 = r1.imageInstance
            return r0
    }

    public void setBitmapInstance(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r1) {
            r0 = this;
            r0.BitmapInstance = r1
            return
    }

    public void setCropInstance(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r1) {
            r0 = this;
            r0.cropInstance = r1
            return
    }

    public void setFaceInfos(com.baidu.idl.face.platform.model.FaceExtInfo[] r1) {
            r0 = this;
            r0.faceInfos = r1
            return
    }

    public void setFaceModuleStateNew(com.baidu.idl.face.platform.FaceStatusNewEnum r1) {
            r0 = this;
            r0.faceNewStatus = r1
            return
    }

    public void setFaceSDKInfos(com.baidu.idl.main.facesdk.FaceInfo[] r1) {
            r0 = this;
            r0.faceSDKInfos = r1
            return
    }

    public void setFrameTime(long r1) {
            r0 = this;
            r0.frameTime = r1
            return
    }

    public void setImageInstance(com.baidu.idl.main.facesdk.model.BDFaceImageInstance r1) {
            r0 = this;
            r0.imageInstance = r1
            return
    }
}
