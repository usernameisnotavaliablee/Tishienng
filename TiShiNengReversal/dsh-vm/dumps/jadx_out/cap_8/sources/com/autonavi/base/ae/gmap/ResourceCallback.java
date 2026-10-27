package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ResourceCallback {
    private long instance;

    public ResourceCallback() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.instance = r0
            return
    }

    public ResourceCallback(long r1) {
            r0 = this;
            r0.<init>()
            r0.instance = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static native void nativeCallCancel();

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static native void nativeCallFailed(long r0, java.lang.String r2);

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static native void nativeCallSuccess(long r0, com.autonavi.base.ae.gmap.AMapAppResourceItem r2);

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void callCancel() {
            r0 = this;
            nativeCallCancel()
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void callFailed(java.lang.String r3) {
            r2 = this;
            long r0 = r2.instance
            nativeCallFailed(r0, r3)
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void callSuccess(com.autonavi.base.ae.gmap.AMapAppResourceItem r3) {
            r2 = this;
            long r0 = r2.instance
            nativeCallSuccess(r0, r3)
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public long getInstance() {
            r2 = this;
            long r0 = r2.instance
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setInstance(long r1) {
            r0 = this;
            r0.instance = r1
            return
    }
}
