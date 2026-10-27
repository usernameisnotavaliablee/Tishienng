package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MultiPointItem {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String customerId;
    private com.autonavi.amap.mapcore.IPoint iPoint;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private com.amap.api.maps.model.LatLng latLng;
    private java.lang.Object object;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String snippet;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String title;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private MultiPointItem() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.customerId = r0
            return
    }

    public MultiPointItem(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.customerId = r0
            r1.latLng = r2
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof com.amap.api.maps.model.MultiPointItem
            if (r1 == 0) goto L25
            java.lang.String r0 = r2.customerId
            if (r0 == 0) goto L20
            r0 = r3
            com.amap.api.maps.model.MultiPointItem r0 = (com.amap.api.maps.model.MultiPointItem) r0
            java.lang.String r1 = r0.getCustomerId()
            if (r1 == 0) goto L20
            java.lang.String r3 = r2.customerId
            java.lang.String r0 = r0.getCustomerId()
            boolean r3 = r3.equals(r0)
            return r3
        L20:
            boolean r3 = super.equals(r3)
            return r3
        L25:
            return r0
    }

    public java.lang.String getCustomerId() {
            r1 = this;
            java.lang.String r0 = r1.customerId
            return r0
    }

    public com.autonavi.amap.mapcore.IPoint getIPoint() {
            r1 = this;
            com.autonavi.amap.mapcore.IPoint r0 = r1.iPoint
            return r0
    }

    public com.amap.api.maps.model.LatLng getLatLng() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.latLng
            return r0
    }

    public java.lang.Object getObject() {
            r1 = this;
            java.lang.Object r0 = r1.object
            return r0
    }

    public java.lang.String getSnippet() {
            r1 = this;
            java.lang.String r0 = r1.snippet
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public void setCustomerId(java.lang.String r1) {
            r0 = this;
            r0.customerId = r1
            return
    }

    public void setIPoint(com.autonavi.amap.mapcore.IPoint r1) {
            r0 = this;
            r0.iPoint = r1
            return
    }

    public void setLatLng(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.latLng = r1
            return
    }

    public void setObject(java.lang.Object r1) {
            r0 = this;
            r0.object = r1
            return
    }

    public void setSnippet(java.lang.String r1) {
            r0 = this;
            r0.snippet = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return
    }
}
