package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class f implements com.autonavi.base.amap.api.mapcore.IProjectionDelegate {
    private com.autonavi.base.amap.api.mapcore.IAMapDelegate a;

    public f(com.autonavi.base.amap.api.mapcore.IAMapDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final float calculateMapZoomer(com.amap.api.maps.model.LatLng r10, int r11) {
            r9 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r9.a
            if (r0 == 0) goto L28
            if (r10 == 0) goto L28
            com.autonavi.base.ae.gmap.GLMapState r1 = r0.getMapProjection()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r9.a
            com.autonavi.base.amap.mapcore.MapConfig r0 = r0.getMapConfig()
            if (r1 == 0) goto L28
            if (r0 == 0) goto L28
            double r2 = r0.getSX()
            int r2 = (int) r2
            double r3 = r0.getSY()
            int r3 = (int) r3
            double r4 = r10.latitude
            double r6 = r10.longitude
            r8 = r11
            float r10 = com.amap.api.col.p0003l.b3.e(r1, r2, r3, r4, r6, r8)
            return r10
        L28:
            r10 = 1077936128(0x40400000, float:3.0)
            return r10
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final com.amap.api.maps.model.TileProjection fromBoundsToTile(com.amap.api.maps.model.LatLngBounds r24, int r25, int r26) throws android.os.RemoteException {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            if (r1 == 0) goto L62
            if (r2 < 0) goto L62
            r3 = 20
            if (r2 > r3) goto L62
            if (r26 > 0) goto L11
            goto L62
        L11:
            com.autonavi.amap.mapcore.IPoint r9 = com.autonavi.amap.mapcore.IPoint.obtain()
            com.autonavi.amap.mapcore.IPoint r15 = com.autonavi.amap.mapcore.IPoint.obtain()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r4 = r0.a
            com.amap.api.maps.model.LatLng r5 = r1.southwest
            double r6 = r5.latitude
            double r10 = r5.longitude
            r5 = r6
            r7 = r10
            r4.latlon2Geo(r5, r7, r9)
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r10 = r0.a
            com.amap.api.maps.model.LatLng r1 = r1.northeast
            double r11 = r1.latitude
            double r13 = r1.longitude
            r10.latlon2Geo(r11, r13, r15)
            int r1 = r9.x
            int r3 = r3 - r2
            int r2 = r1 >> r3
            int r19 = r2 / r26
            int r2 = r9.y
            int r2 = r2 >> r3
            int r22 = r2 / r26
            int r2 = r15.x
            int r2 = r2 >> r3
            int r20 = r2 / r26
            int r2 = r15.y
            int r4 = r2 >> r3
            int r21 = r4 / r26
            int r4 = r19 << r3
            int r4 = r4 * r26
            int r5 = r21 << r3
            int r5 = r5 * r26
            int r1 = r1 - r4
            int r17 = r1 >> r3
            int r2 = r2 - r5
            int r18 = r2 >> r3
            r9.recycle()
            r15.recycle()
            com.amap.api.maps.model.TileProjection r16 = new com.amap.api.maps.model.TileProjection
            r16.<init>(r17, r18, r19, r20, r21, r22)
            return r16
        L62:
            r1 = 0
            return r1
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final com.amap.api.maps.model.LatLng fromScreenLocation(android.graphics.Point r6) throws android.os.RemoteException {
            r5 = this;
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            com.autonavi.amap.mapcore.DPoint r0 = com.autonavi.amap.mapcore.DPoint.obtain()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r5.a
            int r2 = r6.x
            int r6 = r6.y
            r1.getPixel2LatLng(r2, r6, r0)
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            double r1 = r0.y
            double r3 = r0.x
            r6.<init>(r1, r3)
            r0.recycle()
            return r6
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final com.amap.api.maps.model.AMapCameraInfo getCameraInfo() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            com.amap.api.maps.model.AMapCameraInfo r0 = r0.getCamerInfo()
            return r0
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final com.amap.api.maps.model.LatLngBounds getMapBounds(com.amap.api.maps.model.LatLng r3, float r4) throws android.os.RemoteException {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r2.a
            if (r0 == 0) goto Ld
            if (r3 != 0) goto L7
            goto Ld
        L7:
            r1 = 0
            com.amap.api.maps.model.LatLngBounds r3 = r0.getMapBounds(r3, r4, r1, r1)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final com.amap.api.maps.model.VisibleRegion getVisibleRegion() throws android.os.RemoteException {
            r10 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r10.a
            int r0 = r0.getMapWidth()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r10.a
            int r1 = r1.getMapHeight()
            android.graphics.Point r2 = new android.graphics.Point
            r3 = 0
            r2.<init>(r3, r3)
            com.amap.api.maps.model.LatLng r7 = r10.fromScreenLocation(r2)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r0, r3)
            com.amap.api.maps.model.LatLng r8 = r10.fromScreenLocation(r2)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r3, r1)
            com.amap.api.maps.model.LatLng r5 = r10.fromScreenLocation(r2)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r0, r1)
            com.amap.api.maps.model.LatLng r6 = r10.fromScreenLocation(r2)
            com.amap.api.maps.model.LatLngBounds$Builder r0 = com.amap.api.maps.model.LatLngBounds.builder()
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r0.include(r5)
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r0.include(r6)
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r0.include(r7)
            com.amap.api.maps.model.LatLngBounds$Builder r0 = r0.include(r8)
            com.amap.api.maps.model.LatLngBounds r9 = r0.build()
            com.amap.api.maps.model.VisibleRegion r4 = new com.amap.api.maps.model.VisibleRegion
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final float toMapLenWithWin(int r2) {
            r1 = this;
            if (r2 > 0) goto L4
            r2 = 0
            return r2
        L4:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r1.a
            float r2 = r0.toMapLenWithWin(r2)
            return r2
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final android.graphics.PointF toMapLocation(com.amap.api.maps.model.LatLng r7) throws android.os.RemoteException {
            r6 = this;
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            com.autonavi.base.amap.mapcore.FPoint r5 = com.autonavi.base.amap.mapcore.FPoint.obtain()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r6.a
            double r1 = r7.latitude
            double r3 = r7.longitude
            r0.getLatLng2Map(r1, r3, r5)
            android.graphics.PointF r7 = new android.graphics.PointF
            float r0 = r5.x
            float r1 = r5.y
            r7.<init>(r0, r1)
            r5.recycle()
            return r7
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IProjection
    public final android.graphics.Point toScreenLocation(com.amap.api.maps.model.LatLng r7) throws android.os.RemoteException {
            r6 = this;
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            com.autonavi.amap.mapcore.IPoint r5 = com.autonavi.amap.mapcore.IPoint.obtain()
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r6.a
            double r1 = r7.latitude
            double r3 = r7.longitude
            r0.getLatLng2Pixel(r1, r3, r5)
            android.graphics.Point r7 = new android.graphics.Point
            int r0 = r5.x
            int r1 = r5.y
            r7.<init>(r0, r1)
            r5.recycle()
            return r7
    }
}
