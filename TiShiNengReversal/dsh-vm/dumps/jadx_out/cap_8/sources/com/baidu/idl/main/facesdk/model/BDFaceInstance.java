package com.baidu.idl.main.facesdk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BDFaceInstance {
    private long index;

    public BDFaceInstance() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.index = r0
            return
    }

    private native long nativeCreateInstance();

    private native long nativeGetDefautlInstance();

    private void setIndex(long r1) {
            r0 = this;
            r0.index = r1
            return
    }

    public void creatInstance() {
            r2 = this;
            long r0 = r2.nativeCreateInstance()
            r2.index = r0
            r2.setIndex(r0)
            return
    }

    public native int destory();

    public void getDefautlInstance() {
            r2 = this;
            long r0 = r2.nativeGetDefautlInstance()
            r2.setIndex(r0)
            return
    }

    public long getIndex() {
            r2 = this;
            long r0 = r2.index
            return r0
    }
}
