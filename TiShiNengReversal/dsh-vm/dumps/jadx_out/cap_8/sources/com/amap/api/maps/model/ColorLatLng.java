package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ColorLatLng {
    private int color;
    private java.util.List<com.amap.api.maps.model.LatLng> latLngs;

    public ColorLatLng(java.util.List<com.amap.api.maps.model.LatLng> r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.latLngs = r0
            r0.clear()
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.latLngs
            r0.addAll(r2)
            r1.color = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L25
        L12:
            com.amap.api.maps.model.ColorLatLng r5 = (com.amap.api.maps.model.ColorLatLng) r5
            int r2 = r4.color
            int r3 = r5.color
            if (r2 != r3) goto L25
            java.util.List<com.amap.api.maps.model.LatLng> r2 = r4.latLngs
            java.util.List<com.amap.api.maps.model.LatLng> r5 = r5.latLngs
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L25
            return r0
        L25:
            return r1
    }

    public int getColor() {
            r1 = this;
            int r0 = r1.color
            return r0
    }

    public java.util.List<com.amap.api.maps.model.LatLng> getLatLngs() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.latLngs
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r4.latLngs
            int r1 = r4.color
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = java.util.Objects.hash(r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColorLatLng{latLngs="
            r0.<init>(r1)
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r2.latLngs
            r0.append(r1)
            java.lang.String r1 = ", color="
            r0.append(r1)
            int r1 = r2.color
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
