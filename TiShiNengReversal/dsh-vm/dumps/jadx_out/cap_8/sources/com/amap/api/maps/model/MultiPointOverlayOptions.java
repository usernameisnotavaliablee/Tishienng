package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MultiPointOverlayOptions extends com.amap.api.maps.model.BaseOptions implements java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float anchorU;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private float anchorV;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean enable;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.util.List<com.amap.api.maps.model.MultiPointItem> multiPointItems;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private boolean multiPointItemsUpdated;

    public MultiPointOverlayOptions() {
            r1 = this;
            r1.<init>()
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.anchorU = r0
            r1.anchorV = r0
            r0 = 1
            r1.enable = r0
            java.lang.String r0 = "MultiPointOverlayOptions"
            r1.type = r0
            return
    }

    public com.amap.api.maps.model.MultiPointOverlayOptions anchor(float r1, float r2) {
            r0 = this;
            r0.anchorU = r1
            r0.anchorV = r2
            return r0
    }

    public com.amap.api.maps.model.MultiPointOverlayOptions clone() {
            r2 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
        L3:
            com.amap.api.maps.model.MultiPointOverlayOptions r0 = new com.amap.api.maps.model.MultiPointOverlayOptions
            r0.<init>()
            com.amap.api.maps.model.BitmapDescriptor r1 = r2.bitmapDescriptor
            r0.bitmapDescriptor = r1
            float r1 = r2.anchorU
            r0.anchorU = r1
            float r1 = r2.anchorV
            r0.anchorV = r1
            boolean r1 = r2.multiPointItemsUpdated
            r0.multiPointItemsUpdated = r1
            java.util.List<com.amap.api.maps.model.MultiPointItem> r1 = r2.multiPointItems
            r0.multiPointItems = r1
            boolean r1 = r2.enable
            r0.enable = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m13clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.MultiPointOverlayOptions r0 = r1.clone()
            return r0
    }

    public float getAnchorU() {
            r1 = this;
            float r0 = r1.anchorU
            return r0
    }

    public float getAnchorV() {
            r1 = this;
            float r0 = r1.anchorV
            return r0
    }

    public com.amap.api.maps.model.BitmapDescriptor getIcon() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.bitmapDescriptor
            return r0
    }

    public java.util.List<com.amap.api.maps.model.MultiPointItem> getMultiPointItems() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.MultiPointItem> r0 = r1.multiPointItems
            return r0
    }

    public com.amap.api.maps.model.MultiPointOverlayOptions icon(com.amap.api.maps.model.BitmapDescriptor r1) {
            r0 = this;
            r0.bitmapDescriptor = r1
            return r0
    }

    public void setEnable(boolean r1) {
            r0 = this;
            r0.enable = r1
            return
    }

    public void setMultiPointItems(java.util.List<com.amap.api.maps.model.MultiPointItem> r1) {
            r0 = this;
            r0.multiPointItems = r1
            r1 = 1
            r0.multiPointItemsUpdated = r1
            return
    }
}
