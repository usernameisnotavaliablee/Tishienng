package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HeatMapItem {
    private com.amap.api.maps.model.LatLng center;
    private int[] indexes;
    private double intensity;

    public HeatMapItem() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.amap.api.maps.model.LatLng getCenter() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.center
            return r0
    }

    public int[] getIndexes() {
            r1 = this;
            int[] r0 = r1.indexes
            return r0
    }

    public double getIntensity() {
            r2 = this;
            double r0 = r2.intensity
            return r0
    }

    public void setCenter(double r2, double r4) {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            r0.<init>(r2, r4)
            r1.center = r0
            return
    }

    public void setIndexes(int[] r1) {
            r0 = this;
            r0.indexes = r1
            return
    }

    public void setIntensity(double r1) {
            r0 = this;
            r0.intensity = r1
            return
    }
}
