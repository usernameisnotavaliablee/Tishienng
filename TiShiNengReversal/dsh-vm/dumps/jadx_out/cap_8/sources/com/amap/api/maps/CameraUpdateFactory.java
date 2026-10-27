package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class CameraUpdateFactory {
    private static final java.lang.String CLASSNAME = "CameraUpdateFactory";

    public CameraUpdateFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.amap.api.maps.CameraUpdate changeBearing(float r2) {
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            r1 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r1
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2 = com.amap.api.col.p0003l.p.q(r2)
            r0.<init>(r2)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate changeBearingGeoCenter(float r3, com.autonavi.amap.mapcore.IPoint r4) {
            if (r4 != 0) goto Lc
            com.amap.api.maps.CameraUpdate r3 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r4 = com.amap.api.col.p0003l.p.o()
            r3.<init>(r4)
            return r3
        Lc:
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            r1 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r1
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.x
            int r4 = r4.y
            r1.<init>(r2, r4)
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r3 = com.amap.api.col.p0003l.p.n(r3, r1)
            r0.<init>(r3)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate changeLatLng(com.amap.api.maps.model.LatLng r4) {
            if (r4 != 0) goto Lc
            com.amap.api.maps.CameraUpdate r4 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r0 = com.amap.api.col.p0003l.p.o()
            r4.<init>(r0)
            return r4
        Lc:
            double r0 = r4.latitude
            double r2 = r4.longitude
            r4 = 20
            android.graphics.Point r4 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r0, r2, r4)
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r4 = com.amap.api.col.p0003l.p.e(r4)
            r0.<init>(r4)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate changeTilt(float r1) {
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.p(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate newCameraPosition(com.amap.api.maps.model.CameraPosition r1) {
            if (r1 != 0) goto Lc
            com.amap.api.maps.CameraUpdate r1 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r0 = com.amap.api.col.p0003l.p.o()
            r1.<init>(r0)
            return r1
        Lc:
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.f(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate newLatLng(com.amap.api.maps.model.LatLng r1) {
            if (r1 != 0) goto Lc
            com.amap.api.maps.CameraUpdate r1 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r0 = com.amap.api.col.p0003l.p.o()
            r1.<init>(r0)
            return r1
        Lc:
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.g(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate newLatLngBounds(com.amap.api.maps.model.LatLngBounds r1, int r2) {
            if (r1 != 0) goto Lc
            com.amap.api.maps.CameraUpdate r1 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2 = com.amap.api.col.p0003l.p.o()
            r1.<init>(r2)
            return r1
        Lc:
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.i(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate newLatLngBounds(com.amap.api.maps.model.LatLngBounds r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lc
            com.amap.api.maps.CameraUpdate r1 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2 = com.amap.api.col.p0003l.p.o()
            r1.<init>(r2)
            return r1
        Lc:
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.j(r1, r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate newLatLngBoundsRect(com.amap.api.maps.model.LatLngBounds r1, int r2, int r3, int r4, int r5) {
            if (r1 != 0) goto Lc
            com.amap.api.maps.CameraUpdate r1 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2 = com.amap.api.col.p0003l.p.o()
            r1.<init>(r2)
            return r1
        Lc:
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.k(r1, r2, r3, r4, r5)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate newLatLngZoom(com.amap.api.maps.model.LatLng r1, float r2) {
            if (r1 != 0) goto Lc
            com.amap.api.maps.CameraUpdate r1 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r2 = com.amap.api.col.p0003l.p.o()
            r1.<init>(r2)
            return r1
        Lc:
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.h(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate scrollBy(float r1, float r2) {
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.c(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate zoomBy(float r1) {
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.m(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate zoomBy(float r1, android.graphics.Point r2) {
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.d(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate zoomIn() {
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.a()
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate zoomOut() {
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.l()
            r0.<init>(r1)
            return r0
    }

    public static com.amap.api.maps.CameraUpdate zoomTo(float r1) {
            com.amap.api.maps.CameraUpdate r0 = new com.amap.api.maps.CameraUpdate
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = com.amap.api.col.p0003l.p.b(r1)
            r0.<init>(r1)
            return r0
    }
}
