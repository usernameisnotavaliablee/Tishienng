package com.autonavi.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class AbstractCameraUpdateMessage {
    public float amount;
    public int anchorX;
    public int anchorY;
    public float bearing;
    public com.amap.api.maps.model.LatLngBounds bounds;
    public com.amap.api.maps.model.CameraPosition cameraPosition;
    public float curZoolScale;
    public android.graphics.Point focus;
    public com.autonavi.amap.mapcore.DPoint geoPoint;
    public int height;
    public boolean isChangeFinished;
    public boolean isUseAnchor;
    public com.amap.api.maps.AMap.CancelableCallback mCallback;
    public long mDuration;
    public com.autonavi.amap.mapcore.interfaces.IMapConfig mapConfig;
    public float maxZoomLevel;
    public float minZoomLevel;
    public com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type nowType;
    public int paddingBottom;
    public int paddingLeft;
    public int paddingRight;
    public int paddingTop;
    public float tilt;
    public int width;
    public float xPixel;
    public float yPixel;
    public float zoom;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Type extends java.lang.Enum<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type> {
        private static final /* synthetic */ com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type[] $VALUES = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type changeBearing = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type changeBearingGeoCenter = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type changeCenter = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type changeGeoCenterZoom = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type changeGeoCenterZoomTiltBearing = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type changeTilt = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type newCameraPosition = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type newLatLngBounds = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type newLatLngBoundsWithSize = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type none = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type scrollBy = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type zoomBy = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type zoomIn = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type zoomOut = null;
        public static final com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type zoomTo = null;

        static {
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r0 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                java.lang.String r1 = "none"
                r2 = 0
                r0.<init>(r1, r2)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.none = r0
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                java.lang.String r3 = "zoomIn"
                r4 = 1
                r1.<init>(r3, r4)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.zoomIn = r1
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r3 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                java.lang.String r5 = "changeCenter"
                r6 = 2
                r3.<init>(r5, r6)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.changeCenter = r3
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r5 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                java.lang.String r7 = "changeTilt"
                r8 = 3
                r5.<init>(r7, r8)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.changeTilt = r5
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r7 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                java.lang.String r9 = "changeBearing"
                r10 = 4
                r7.<init>(r9, r10)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.changeBearing = r7
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r9 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                java.lang.String r11 = "changeBearingGeoCenter"
                r12 = 5
                r9.<init>(r11, r12)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.changeBearingGeoCenter = r9
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r11 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                java.lang.String r13 = "changeGeoCenterZoom"
                r14 = 6
                r11.<init>(r13, r14)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.changeGeoCenterZoom = r11
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r13 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                java.lang.String r15 = "zoomOut"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.zoomOut = r13
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r15 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                r17 = 7
                java.lang.String r2 = "zoomTo"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.zoomTo = r15
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r2 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                r19 = 8
                java.lang.String r4 = "zoomBy"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.zoomBy = r2
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r4 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                r21 = 9
                java.lang.String r6 = "scrollBy"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.scrollBy = r4
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r6 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                r23 = 10
                java.lang.String r8 = "newCameraPosition"
                r24 = 4
                r10 = 11
                r6.<init>(r8, r10)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newCameraPosition = r6
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r8 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                r25 = 11
                java.lang.String r10 = "newLatLngBounds"
                r26 = 5
                r12 = 12
                r8.<init>(r10, r12)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newLatLngBounds = r8
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r10 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                r27 = 12
                java.lang.String r12 = "newLatLngBoundsWithSize"
                r28 = 6
                r14 = 13
                r10.<init>(r12, r14)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.newLatLngBoundsWithSize = r10
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r12 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type
                r29 = 13
                java.lang.String r14 = "changeGeoCenterZoomTiltBearing"
                r30 = r0
                r0 = 14
                r12.<init>(r14, r0)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.changeGeoCenterZoomTiltBearing = r12
                r14 = 15
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type[] r14 = new com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type[r14]
                r14[r16] = r30
                r14[r18] = r1
                r14[r20] = r3
                r14[r22] = r5
                r14[r24] = r7
                r14[r26] = r9
                r14[r28] = r11
                r14[r17] = r13
                r14[r19] = r15
                r14[r21] = r2
                r14[r23] = r4
                r14[r25] = r6
                r14[r27] = r8
                r14[r29] = r10
                r14[r0] = r12
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.$VALUES = r14
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type valueOf(java.lang.String r1) {
                java.lang.Class<com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type> r0 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r1 = (com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type) r1
                return r1
        }

        public static com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type[] values() {
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type[] r0 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type[] r0 = (com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type[]) r0
                return r0
        }
    }

    public AbstractCameraUpdateMessage() {
            r2 = this;
            r2.<init>()
            com.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type r0 = com.autonavi.amap.mapcore.AbstractCameraUpdateMessage.Type.none
            r2.nowType = r0
            r0 = 0
            r2.focus = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.zoom = r0
            r2.tilt = r0
            r2.bearing = r0
            r0 = 0
            r2.isUseAnchor = r0
            r0 = 250(0xfa, double:1.235E-321)
            r2.mDuration = r0
            r0 = 0
            r2.maxZoomLevel = r0
            r2.minZoomLevel = r0
            r2.curZoolScale = r0
            return
    }

    protected void changeCenterByAnchor(com.autonavi.amap.api.mapcore.IGLMapState r3, com.autonavi.amap.mapcore.DPoint r4) {
            r2 = this;
            int r0 = r2.anchorX
            int r1 = r2.anchorY
            r2.changeCenterByAnchor(r3, r4, r0, r1)
            return
    }

    protected void changeCenterByAnchor(com.autonavi.amap.api.mapcore.IGLMapState r7, com.autonavi.amap.mapcore.DPoint r8, int r9, int r10) {
            r6 = this;
            r7.recalculate()
            android.graphics.Point r9 = r6.getAnchorGeoPoint(r7, r9, r10)
            com.autonavi.amap.mapcore.DPoint r10 = r7.getMapGeoCenter()
            double r0 = r10.x
            double r2 = r8.x
            double r0 = r0 + r2
            int r2 = r9.x
            double r2 = (double) r2
            double r0 = r0 - r2
            double r2 = r10.y
            double r4 = r8.y
            double r2 = r2 + r4
            int r8 = r9.y
            double r8 = (double) r8
            double r2 = r2 - r8
            r7.setMapGeoCenter(r0, r2)
            return
    }

    public void generateMapAnimation(com.autonavi.amap.api.mapcore.IGLMapEngine r12) {
            r11 = this;
            r0 = r12
            com.autonavi.base.ae.gmap.GLMapEngine r0 = (com.autonavi.base.ae.gmap.GLMapEngine) r0
            r1 = 1
            int r3 = r0.getEngineIDWithType(r1)
            com.autonavi.amap.api.mapcore.IGLMapState r0 = r12.getNewMapState(r3)
            r11.runCameraUpdate(r0)
            com.autonavi.amap.mapcore.DPoint r1 = r0.getMapGeoCenter()
            long r4 = r11.mDuration
            int r4 = (int) r4
            float r5 = r0.getMapZoomer()
            float r2 = r0.getMapAngle()
            int r6 = (int) r2
            float r2 = r0.getCameraDegree()
            int r7 = (int) r2
            double r8 = r1.x
            int r8 = (int) r8
            double r1 = r1.y
            int r9 = (int) r1
            com.amap.api.maps.AMap$CancelableCallback r10 = r11.mCallback
            r2 = r12
            r2.addGroupAnimation(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.recycle()
            return
    }

    protected android.graphics.Point getAnchorGeoPoint(com.autonavi.amap.api.mapcore.IGLMapState r2, int r3, int r4) {
            r1 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r2.screenToP20Point(r3, r4, r0)
            return r0
    }

    public abstract void mergeCameraUpdateDelegate(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r1);

    protected void normalChange(com.autonavi.amap.api.mapcore.IGLMapState r9) {
            r8 = this;
            float r0 = r8.zoom
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto Ld
            float r0 = r9.getMapZoomer()
            goto Lf
        Ld:
            float r0 = r8.zoom
        Lf:
            r8.zoom = r0
            float r0 = r8.bearing
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L1e
            float r0 = r9.getMapAngle()
            goto L20
        L1e:
            float r0 = r8.bearing
        L20:
            r8.bearing = r0
            float r0 = r8.tilt
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L2f
            float r0 = r9.getCameraDegree()
            goto L31
        L2f:
            float r0 = r8.tilt
        L31:
            r8.tilt = r0
            com.autonavi.amap.mapcore.interfaces.IMapConfig r0 = r8.mapConfig
            float r1 = r8.zoom
            float r0 = com.amap.api.col.p0003l.b3.h(r0, r1)
            r8.zoom = r0
            com.autonavi.amap.mapcore.interfaces.IMapConfig r1 = r8.mapConfig
            float r2 = r8.tilt
            float r0 = com.amap.api.col.p0003l.b3.i(r1, r2, r0)
            r8.tilt = r0
            float r0 = r8.bearing
            double r0 = (double) r0
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = r0 % r2
            double r0 = r0 + r2
            double r0 = r0 % r2
            float r0 = (float) r0
            r8.bearing = r0
            android.graphics.Point r0 = r8.focus
            if (r0 == 0) goto L72
            com.autonavi.amap.mapcore.DPoint r1 = r8.geoPoint
            if (r1 != 0) goto L72
            int r1 = r0.x
            int r0 = r0.y
            android.graphics.Point r0 = r8.getAnchorGeoPoint(r9, r1, r0)
            com.autonavi.amap.mapcore.DPoint r1 = new com.autonavi.amap.mapcore.DPoint
            int r2 = r0.x
            double r2 = (double) r2
            int r0 = r0.y
            double r4 = (double) r0
            r1.<init>(r2, r4)
            r8.geoPoint = r1
        L72:
            float r0 = r8.zoom
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r8.zoom
            r9.setMapZoomer(r0)
        L7f:
            float r0 = r8.bearing
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8c
            float r0 = r8.bearing
            r9.setMapAngle(r0)
        L8c:
            float r0 = r8.tilt
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L99
            float r0 = r8.tilt
            r9.setCameraDegree(r0)
        L99:
            android.graphics.Point r0 = r8.focus
            if (r0 == 0) goto La7
            com.autonavi.amap.mapcore.DPoint r1 = r8.geoPoint
            int r2 = r0.x
            int r0 = r0.y
            r8.changeCenterByAnchor(r9, r1, r2, r0)
            return
        La7:
            com.autonavi.amap.mapcore.DPoint r0 = r8.geoPoint
            if (r0 == 0) goto Lbe
            double r1 = r0.x
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Lb9
            double r5 = r0.y
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto Lbe
        Lb9:
            double r3 = r0.y
            r9.setMapGeoCenter(r1, r3)
        Lbe:
            return
    }

    public abstract void runCameraUpdate(com.autonavi.amap.api.mapcore.IGLMapState r1);
}
