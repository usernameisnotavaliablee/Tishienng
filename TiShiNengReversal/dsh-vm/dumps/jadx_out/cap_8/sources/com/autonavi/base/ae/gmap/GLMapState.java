package com.autonavi.base.ae.gmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GLMapState implements com.autonavi.amap.api.mapcore.IGLMapState {
    private int engineID;
    private boolean isNewInstance;
    private long nativeEngineInstance;
    private long nativeStateInstance;

    public GLMapState(int r4, long r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.nativeStateInstance = r0
            r3.nativeEngineInstance = r0
            r2 = 0
            r3.isNewInstance = r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L1d
            r3.engineID = r4
            r3.nativeEngineInstance = r5
            long r4 = nativeNewInstance(r4, r5)
            r3.nativeStateInstance = r4
            r4 = 1
            r3.isNewInstance = r4
        L1d:
            return
    }

    public GLMapState(int r4, long r5, long r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.nativeStateInstance = r0
            r3.nativeEngineInstance = r0
            r2 = 0
            r3.isNewInstance = r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L19
            r3.engineID = r4
            r3.nativeEngineInstance = r5
            r3.nativeStateInstance = r7
            r4 = 1
            r3.isNewInstance = r4
        L19:
            return
    }

    public static void geo2LonLat(long r1, long r3, com.autonavi.amap.mapcore.DPoint r5) {
            r0 = 20
            com.autonavi.amap.mapcore.DPoint r1 = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(r1, r3, r0)
            double r2 = r1.x
            r5.x = r2
            double r2 = r1.y
            r5.y = r2
            r1.recycle()
            return
    }

    public static void lonlat2Geo(double r1, double r3, com.autonavi.amap.mapcore.IPoint r5) {
            r0 = 20
            android.graphics.Point r1 = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(r3, r1, r0)
            int r2 = r1.x
            r5.x = r2
            int r1 = r1.y
            r5.y = r1
            return
    }

    public static native float nativeCalMapZoomScalefactor(long r0, int r2, int r3, float r4);

    public static native float nativeCalculateMapZoomer(long r0, int r2, int r3, int r4, int r5, int r6);

    public static native float nativeGetCameraDegree(long r0);

    public static native float nativeGetGLUnitWithWin(long r0, int r2);

    public static native float nativeGetMapAngle(long r0);

    public static native void nativeGetMapCenter(long r0, android.graphics.Point r2);

    public static native double nativeGetMapCenterXDouble(long r0);

    public static native double nativeGetMapCenterYDouble(long r0);

    public static native float nativeGetMapZoomer(long r0);

    public static native void nativeGetPixel20Bound(long r0, android.graphics.Rect r2, int r3, int r4);

    public static native void nativeGetProjectionMatrix(long r0, float[] r2);

    public static native float nativeGetSkyHeight(long r0);

    public static native void nativeGetViewMatrix(long r0, float[] r2);

    public static native long nativeNewInstance(int r0, long r1);

    public static native void nativeP20ToScreenPoint(long r0, int r2, int r3, int r4, android.graphics.PointF r5);

    public static native void nativeRecalculate(long r0);

    public static native void nativeScreenToP20Point(long r0, float r2, float r3, android.graphics.Point r4);

    public static native void nativeSetCameraDegree(long r0, float r2);

    public static native void nativeSetMapAngle(long r0, float r2);

    public static native void nativeSetMapCenter(long r0, double r2, double r4);

    private static native void nativeSetMapState(int r0, long r1, long r3);

    public static native void nativeSetMapZoomer(long r0, float r2);

    public static native void nativeStateDestroy(long r0, long r2);

    public float calMapZoomScalefactor(int r3, int r4, int r5) {
            r2 = this;
            long r0 = r2.nativeStateInstance
            float r5 = (float) r5
            float r3 = nativeCalMapZoomScalefactor(r0, r3, r4, r5)
            return r3
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public float calculateMapZoomer(int r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            long r0 = r7.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L12
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            float r8 = nativeCalculateMapZoomer(r0, r2, r3, r4, r5, r6)
            return r8
        L12:
            r8 = 1077936128(0x40400000, float:3.0)
            return r8
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public float getCameraDegree() {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            float r0 = nativeGetCameraDegree(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public float getGLUnitWithWin(int r6) {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            float r6 = nativeGetGLUnitWithWin(r0, r6)
            return r6
        Ld:
            r6 = 0
            return r6
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public float getMapAngle() {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            float r0 = nativeGetMapAngle(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public com.autonavi.amap.mapcore.DPoint getMapGeoCenter() {
            r3 = this;
            com.autonavi.amap.mapcore.DPoint r0 = new com.autonavi.amap.mapcore.DPoint
            r0.<init>()
            long r1 = r3.nativeStateInstance
            double r1 = nativeGetMapCenterXDouble(r1)
            r0.x = r1
            long r1 = r3.nativeStateInstance
            double r1 = nativeGetMapCenterYDouble(r1)
            r0.y = r1
            return r0
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void getMapGeoCenter(com.autonavi.amap.mapcore.IPoint r3) {
            r2 = this;
            long r0 = r2.nativeStateInstance
            nativeGetMapCenter(r0, r3)
            return
    }

    public double getMapGeoCenterX() {
            r2 = this;
            long r0 = r2.nativeStateInstance
            double r0 = nativeGetMapCenterXDouble(r0)
            return r0
    }

    public double getMapGeoCenterY() {
            r2 = this;
            long r0 = r2.nativeStateInstance
            double r0 = nativeGetMapCenterXDouble(r0)
            return r0
    }

    public float getMapLenWithWin(int r1) {
            r0 = this;
            float r1 = r0.getGLUnitWithWin(r1)
            return r1
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public float getMapZoomer() {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            float r0 = nativeGetMapZoomer(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public long getNativeInstance() {
            r2 = this;
            long r0 = r2.nativeStateInstance
            return r0
    }

    public void getPixel20Bound(android.graphics.Rect r6, int r7, int r8) {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeGetPixel20Bound(r0, r6, r7, r8)
        Lb:
            return
    }

    public void getProjectionMatrix(float[] r3) {
            r2 = this;
            if (r3 == 0) goto Lc
            int r0 = r3.length
            r1 = 16
            if (r0 != r1) goto Lc
            long r0 = r2.nativeStateInstance
            nativeGetProjectionMatrix(r0, r3)
        Lc:
            return
    }

    public float getSkyHeight() {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            float r0 = nativeGetSkyHeight(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public void getViewMatrix(float[] r3) {
            r2 = this;
            if (r3 == 0) goto Lc
            int r0 = r3.length
            r1 = 16
            if (r0 != r1) goto Lc
            long r0 = r2.nativeStateInstance
            nativeGetViewMatrix(r0, r3)
        Lc:
            return
    }

    public void p20ToScreenPoint(int r7, int r8, com.autonavi.base.amap.mapcore.FPoint r9) {
            r6 = this;
            long r0 = r6.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r4 = 0
            r2 = r7
            r3 = r8
            r5 = r9
            nativeP20ToScreenPoint(r0, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void recalculate() {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeRecalculate(r0)
        Lb:
            return
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void recycle() {
            r6 = this;
            long r0 = r6.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L11
            boolean r4 = r6.isNewInstance
            if (r4 == 0) goto L11
            long r4 = r6.nativeEngineInstance
            nativeStateDestroy(r0, r4)
        L11:
            r6.nativeStateInstance = r2
            return
    }

    public void reset() {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            r5.recycle()
        Lb:
            long r0 = r5.nativeEngineInstance
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            int r2 = r5.engineID
            long r0 = nativeNewInstance(r2, r0)
            r5.nativeStateInstance = r0
        L19:
            return
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void screenToP20Point(int r6, int r7, android.graphics.Point r8) {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            float r6 = (float) r6
            float r7 = (float) r7
            nativeScreenToP20Point(r0, r6, r7, r8)
        Ld:
            return
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void setCameraDegree(float r6) {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetCameraDegree(r0, r6)
        Lb:
            return
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void setMapAngle(float r6) {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetMapAngle(r0, r6)
        Lb:
            return
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void setMapGeoCenter(double r7, double r9) {
            r6 = this;
            long r0 = r6.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r2 = r7
            r4 = r9
            nativeSetMapCenter(r0, r2, r4)
        Ld:
            return
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void setMapZoomer(float r6) {
            r5 = this;
            long r0 = r5.nativeStateInstance
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            nativeSetMapZoomer(r0, r6)
        Lb:
            return
    }

    public void setNativeMapengineState(int r6, long r7) {
            r5 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L12
            long r2 = r5.nativeStateInstance
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Ld
            goto L12
        Ld:
            r5.nativeEngineInstance = r7
            nativeSetMapState(r6, r7, r2)
        L12:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "instance: "
            r0.<init>(r1)
            long r1 = r3.nativeStateInstance
            r0.append(r1)
            java.lang.String r1 = " center: "
            r0.append(r1)
            com.autonavi.amap.mapcore.DPoint r1 = r3.getMapGeoCenter()
            double r1 = r1.x
            r0.append(r1)
            java.lang.String r1 = " , "
            r0.append(r1)
            com.autonavi.amap.mapcore.DPoint r1 = r3.getMapGeoCenter()
            double r1 = r1.y
            r0.append(r1)
            java.lang.String r1 = " bearing:"
            r0.append(r1)
            float r1 = r3.getCameraDegree()
            r0.append(r1)
            java.lang.String r1 = "  tilt:"
            r0.append(r1)
            float r1 = r3.getMapAngle()
            r0.append(r1)
            java.lang.String r1 = "  zoom:"
            r0.append(r1)
            float r1 = r3.getMapZoomer()
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
