package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BaseOptions {
    protected java.lang.Object Field1;
    protected java.lang.Object Field2;
    protected java.lang.String type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public static class BaseUpdateFlags {
        protected boolean zIndexUpdate;

        public BaseUpdateFlags() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zIndexUpdate = r0
                return
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.zIndexUpdate = r0
                return
        }
    }

    public BaseOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    protected com.amap.api.maps.model.BaseOptions.BaseUpdateFlags getUpdateFlags() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected java.lang.Object method1(java.lang.Object... r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected java.lang.Object method2(java.lang.Object... r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void resetUpdateFlags() {
            r0 = this;
            return
    }
}
