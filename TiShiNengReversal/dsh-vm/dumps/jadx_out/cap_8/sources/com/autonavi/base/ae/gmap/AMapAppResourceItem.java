package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapAppResourceItem {

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
    private byte[] data;
    private int imageHeight;
    private float imageScale;
    private int imageWidth;
    private boolean preAlpha;
    private int resourceType;
    private long size;

    public AMapAppResourceItem() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.resourceType = r0
            r1.preAlpha = r0
            r1.imageWidth = r0
            r1.imageHeight = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.imageScale = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public byte[] getData() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public int getImageHeight() {
            r1 = this;
            int r0 = r1.imageHeight
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public float getImageScale() {
            r1 = this;
            float r0 = r1.imageScale
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public int getImageWidth() {
            r1 = this;
            int r0 = r1.imageWidth
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public int getResourceType() {
            r1 = this;
            int r0 = r1.resourceType
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public boolean isPreAlpha() {
            r1 = this;
            boolean r0 = r1.preAlpha
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setData(byte[] r1) {
            r0 = this;
            r0.data = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setImageHeight(int r1) {
            r0 = this;
            r0.imageHeight = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setImageScale(float r1) {
            r0 = this;
            r0.imageScale = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setImageWidth(int r1) {
            r0 = this;
            r0.imageWidth = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setPreAlpha(boolean r1) {
            r0 = this;
            r0.preAlpha = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setResourceType(int r1) {
            r0 = this;
            r0.resourceType = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public void setSize(long r1) {
            r0 = this;
            r0.size = r1
            return
    }
}
