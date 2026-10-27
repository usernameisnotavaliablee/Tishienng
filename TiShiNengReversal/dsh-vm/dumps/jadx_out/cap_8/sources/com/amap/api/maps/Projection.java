package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Projection {
    private final com.autonavi.amap.mapcore.interfaces.IProjection projectionDelegate;

    public Projection(com.autonavi.amap.mapcore.interfaces.IProjection r1) {
            r0 = this;
            r0.<init>()
            r0.projectionDelegate = r1
            return
    }

    public float calZoomByTargetPos(com.amap.api.maps.model.LatLng r2, int r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            float r2 = r0.calculateMapZoomer(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 1077936128(0x40400000, float:3.0)
            return r2
    }

    public com.amap.api.maps.model.TileProjection fromBoundsToTile(com.amap.api.maps.model.LatLngBounds r2, int r3, int r4) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.TileProjection r2 = r0.fromBoundsToTile(r2, r3, r4)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public com.amap.api.maps.model.LatLng fromScreenLocation(android.graphics.Point r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.LatLng r2 = r0.fromScreenLocation(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public com.amap.api.maps.model.AMapCameraInfo getCameraInfo() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.AMapCameraInfo r0 = r0.getCameraInfo()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public com.amap.api.maps.model.LatLngBounds getMapBounds(com.amap.api.maps.model.LatLng r2, float r3) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.LatLngBounds r2 = r0.getMapBounds(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public com.amap.api.maps.model.VisibleRegion getVisibleRegion() {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.VisibleRegion r0 = r0.getVisibleRegion()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.PointF toMapLocation(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            android.graphics.PointF r2 = r0.toMapLocation(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public android.graphics.PointF toOpenGLLocation(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            android.graphics.PointF r2 = r0.toMapLocation(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public float toOpenGLWidth(int r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            float r2 = r0.toMapLenWithWin(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public android.graphics.Point toScreenLocation(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            com.autonavi.amap.mapcore.interfaces.IProjection r0 = r1.projectionDelegate     // Catch: java.lang.Throwable -> L7
            android.graphics.Point r2 = r0.toScreenLocation(r2)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }
}
