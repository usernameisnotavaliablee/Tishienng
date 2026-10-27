package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapAppRequestParam {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int RESOURCE_TYPE_ABSPATH = 4;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int RESOURCE_TYPE_BINARY = 3;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int RESOURCE_TYPE_IMAGE = 1;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int RESOURCE_TYPE_NONE = 0;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int RESOURCE_TYPE_SVG = 2;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.autonavi.base.ae.gmap.ResourceCallback callback;
    private long contextId;
    private int expectHeight;
    private int expectWidth;
    private int resourceType;
    private java.lang.String url;

    public AMapAppRequestParam() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.resourceType = r0
            r1 = 0
            r3.contextId = r1
            r3.expectWidth = r0
            r3.expectHeight = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void generateCallback(long r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.ResourceCallback r0 = new com.autonavi.base.ae.gmap.ResourceCallback
            r0.<init>(r2)
            r1.callback = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public com.autonavi.base.ae.gmap.ResourceCallback getCallback() {
            r1 = this;
            com.autonavi.base.ae.gmap.ResourceCallback r0 = r1.callback
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public long getContextId() {
            r2 = this;
            long r0 = r2.contextId
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public int getExpectHeight() {
            r1 = this;
            int r0 = r1.expectHeight
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public int getExpectWidth() {
            r1 = this;
            int r0 = r1.expectWidth
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public int getResourceType() {
            r1 = this;
            int r0 = r1.resourceType
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setCallback(com.autonavi.base.ae.gmap.ResourceCallback r1) {
            r0 = this;
            r0.callback = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setContextId(long r1) {
            r0 = this;
            r0.contextId = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setExpectHeight(int r1) {
            r0 = this;
            r0.expectHeight = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setExpectWidth(int r1) {
            r0 = this;
            r0.expectWidth = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setResourceType(int r1) {
            r0 = this;
            r0.resourceType = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }
}
