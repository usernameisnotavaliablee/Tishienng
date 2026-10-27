package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage a() {
            com.amap.api.col.3l.m r0 = new com.amap.api.col.3l.m
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.zoomBy
            r0.nowType = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.amount = r1
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage b(float r2) {
            com.amap.api.col.3l.k r0 = new com.amap.api.col.3l.k
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newCameraPosition
            r0.nowType = r1
            r0.zoom = r2
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage c(float r2, float r3) {
            com.amap.api.col.3l.l r0 = new com.amap.api.col.3l.l
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.scrollBy
            r0.nowType = r1
            r0.xPixel = r2
            r0.yPixel = r3
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage d(float r2, android.graphics.Point r3) {
            com.amap.api.col.3l.m r0 = new com.amap.api.col.3l.m
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.zoomBy
            r0.nowType = r1
            r0.amount = r2
            r0.focus = r3
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage e(android.graphics.Point r6) {
            com.amap.api.col.3l.k r0 = new com.amap.api.col.3l.k
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newCameraPosition
            r0.nowType = r1
            com.autonavi.amap.mapcore.DPoint r1 = new com.autonavi.amap.mapcore.DPoint
            int r2 = r6.x
            double r2 = (double) r2
            int r6 = r6.y
            double r4 = (double) r6
            r1.<init>(r2, r4)
            r0.geoPoint = r1
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage f(com.amap.api.maps.model.CameraPosition r7) {
            com.amap.api.col.3l.k r0 = new com.amap.api.col.3l.k
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newCameraPosition
            r0.nowType = r1
            if (r7 == 0) goto L33
            com.amap.api.maps.model.LatLng r1 = r7.target
            if (r1 != 0) goto L10
            goto L33
        L10:
            double r2 = r1.latitude
            double r4 = r1.longitude
            r1 = 20
            com.autonavi.amap.mapcore.DPoint r1 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixelsDouble(r2, r4, r1)
            com.autonavi.amap.mapcore.DPoint r2 = new com.autonavi.amap.mapcore.DPoint
            double r3 = r1.x
            double r5 = r1.y
            r2.<init>(r3, r5)
            r0.geoPoint = r2
            float r1 = r7.zoom
            r0.zoom = r1
            float r1 = r7.bearing
            r0.bearing = r1
            float r1 = r7.tilt
            r0.tilt = r1
            r0.cameraPosition = r7
        L33:
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage g(com.amap.api.maps.model.LatLng r1) {
            com.amap.api.maps.model.CameraPosition$Builder r0 = com.amap.api.maps.model.CameraPosition.builder()
            com.amap.api.maps.model.CameraPosition$Builder r1 = r0.target(r1)
            r0 = 2143289344(0x7fc00000, float:NaN)
            com.amap.api.maps.model.CameraPosition$Builder r1 = r1.zoom(r0)
            com.amap.api.maps.model.CameraPosition$Builder r1 = r1.bearing(r0)
            com.amap.api.maps.model.CameraPosition$Builder r1 = r1.tilt(r0)
            com.amap.api.maps.model.CameraPosition r1 = r1.build()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = f(r1)
            return r1
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage h(com.amap.api.maps.model.LatLng r1, float r2) {
            com.amap.api.maps.model.CameraPosition$Builder r0 = com.amap.api.maps.model.CameraPosition.builder()
            com.amap.api.maps.model.CameraPosition$Builder r1 = r0.target(r1)
            com.amap.api.maps.model.CameraPosition$Builder r1 = r1.zoom(r2)
            r2 = 2143289344(0x7fc00000, float:NaN)
            com.amap.api.maps.model.CameraPosition$Builder r1 = r1.bearing(r2)
            com.amap.api.maps.model.CameraPosition$Builder r1 = r1.tilt(r2)
            com.amap.api.maps.model.CameraPosition r1 = r1.build()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = f(r1)
            return r1
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage i(com.amap.api.maps.model.LatLngBounds r2, int r3) {
            com.amap.api.col.3l.j r0 = new com.amap.api.col.3l.j
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newLatLngBounds
            r0.nowType = r1
            r0.bounds = r2
            r0.paddingLeft = r3
            r0.paddingRight = r3
            r0.paddingTop = r3
            r0.paddingBottom = r3
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage j(com.amap.api.maps.model.LatLngBounds r2, int r3, int r4, int r5) {
            com.amap.api.col.3l.j r0 = new com.amap.api.col.3l.j
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newLatLngBoundsWithSize
            r0.nowType = r1
            r0.bounds = r2
            r0.paddingLeft = r5
            r0.paddingRight = r5
            r0.paddingTop = r5
            r0.paddingBottom = r5
            r0.width = r3
            r0.height = r4
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage k(com.amap.api.maps.model.LatLngBounds r2, int r3, int r4, int r5, int r6) {
            com.amap.api.col.3l.j r0 = new com.amap.api.col.3l.j
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newLatLngBounds
            r0.nowType = r1
            r0.bounds = r2
            r0.paddingLeft = r3
            r0.paddingRight = r4
            r0.paddingTop = r5
            r0.paddingBottom = r6
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage l() {
            com.amap.api.col.3l.m r0 = new com.amap.api.col.3l.m
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.zoomBy
            r0.nowType = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.amount = r1
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage m(float r1) {
            r0 = 0
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1 = d(r1, r0)
            return r1
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage n(float r6, android.graphics.Point r7) {
            com.amap.api.col.3l.k r0 = new com.amap.api.col.3l.k
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newCameraPosition
            r0.nowType = r1
            com.autonavi.amap.mapcore.DPoint r1 = new com.autonavi.amap.mapcore.DPoint
            int r2 = r7.x
            double r2 = (double) r2
            int r7 = r7.y
            double r4 = (double) r7
            r1.<init>(r2, r4)
            r0.geoPoint = r1
            r0.bearing = r6
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage o() {
            com.amap.api.col.3l.k r0 = new com.amap.api.col.3l.k
            r0.<init>()
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage p(float r2) {
            com.amap.api.col.3l.k r0 = new com.amap.api.col.3l.k
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newCameraPosition
            r0.nowType = r1
            r0.tilt = r2
            return r0
    }

    public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage q(float r2) {
            com.amap.api.col.3l.k r0 = new com.amap.api.col.3l.k
            r0.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newCameraPosition
            r0.nowType = r1
            r0.bearing = r2
            return r0
    }
}
