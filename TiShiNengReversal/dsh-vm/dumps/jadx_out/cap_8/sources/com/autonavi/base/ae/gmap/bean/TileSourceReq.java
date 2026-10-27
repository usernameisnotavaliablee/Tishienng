package com.autonavi.base.ae.gmap.bean;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TileSourceReq {
    public int sourceType;
    public int x;
    public int y;
    public int zoom;

    public TileSourceReq() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TileSourceReq{x="
            r0.<init>(r1)
            int r1 = r2.x
            r0.append(r1)
            java.lang.String r1 = ", y="
            r0.append(r1)
            int r1 = r2.y
            r0.append(r1)
            java.lang.String r1 = ", zoom="
            r0.append(r1)
            int r1 = r2.zoom
            r0.append(r1)
            java.lang.String r1 = ", sourceId="
            r0.append(r1)
            int r1 = r2.sourceType
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
