package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RouteOverlay {
    private com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner mBaseRouteOverlay;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum MapRouteScene extends java.lang.Enum<com.amap.api.maps.model.RouteOverlay.MapRouteScene> {
        private static final /* synthetic */ com.amap.api.maps.model.RouteOverlay.MapRouteScene[] $VALUES = null;
        public static final com.amap.api.maps.model.RouteOverlay.MapRouteScene CHARGE = null;
        public static final com.amap.api.maps.model.RouteOverlay.MapRouteScene CIMMUTE = null;
        public static final com.amap.api.maps.model.RouteOverlay.MapRouteScene HD = null;
        public static final com.amap.api.maps.model.RouteOverlay.MapRouteScene LIMIT = null;
        public static final com.amap.api.maps.model.RouteOverlay.MapRouteScene NORMAL = null;
        public static final com.amap.api.maps.model.RouteOverlay.MapRouteScene SHARE = null;
        public static final com.amap.api.maps.model.RouteOverlay.MapRouteScene WRONG = null;

        static {
                com.amap.api.maps.model.RouteOverlay$MapRouteScene r0 = new com.amap.api.maps.model.RouteOverlay$MapRouteScene
                java.lang.String r1 = "NORMAL"
                r2 = 0
                r0.<init>(r1, r2)
                com.amap.api.maps.model.RouteOverlay.MapRouteScene.NORMAL = r0
                com.amap.api.maps.model.RouteOverlay$MapRouteScene r1 = new com.amap.api.maps.model.RouteOverlay$MapRouteScene
                java.lang.String r3 = "CHARGE"
                r4 = 1
                r1.<init>(r3, r4)
                com.amap.api.maps.model.RouteOverlay.MapRouteScene.CHARGE = r1
                com.amap.api.maps.model.RouteOverlay$MapRouteScene r3 = new com.amap.api.maps.model.RouteOverlay$MapRouteScene
                java.lang.String r5 = "LIMIT"
                r6 = 2
                r3.<init>(r5, r6)
                com.amap.api.maps.model.RouteOverlay.MapRouteScene.LIMIT = r3
                com.amap.api.maps.model.RouteOverlay$MapRouteScene r5 = new com.amap.api.maps.model.RouteOverlay$MapRouteScene
                java.lang.String r7 = "CIMMUTE"
                r8 = 3
                r5.<init>(r7, r8)
                com.amap.api.maps.model.RouteOverlay.MapRouteScene.CIMMUTE = r5
                com.amap.api.maps.model.RouteOverlay$MapRouteScene r7 = new com.amap.api.maps.model.RouteOverlay$MapRouteScene
                java.lang.String r9 = "WRONG"
                r10 = 4
                r7.<init>(r9, r10)
                com.amap.api.maps.model.RouteOverlay.MapRouteScene.WRONG = r7
                com.amap.api.maps.model.RouteOverlay$MapRouteScene r9 = new com.amap.api.maps.model.RouteOverlay$MapRouteScene
                java.lang.String r11 = "SHARE"
                r12 = 5
                r9.<init>(r11, r12)
                com.amap.api.maps.model.RouteOverlay.MapRouteScene.SHARE = r9
                com.amap.api.maps.model.RouteOverlay$MapRouteScene r11 = new com.amap.api.maps.model.RouteOverlay$MapRouteScene
                java.lang.String r13 = "HD"
                r14 = 6
                r11.<init>(r13, r14)
                com.amap.api.maps.model.RouteOverlay.MapRouteScene.HD = r11
                r13 = 7
                com.amap.api.maps.model.RouteOverlay$MapRouteScene[] r13 = new com.amap.api.maps.model.RouteOverlay.MapRouteScene[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.amap.api.maps.model.RouteOverlay.MapRouteScene.$VALUES = r13
                return
        }

        MapRouteScene(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.amap.api.maps.model.RouteOverlay.MapRouteScene valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.model.RouteOverlay$MapRouteScene> r0 = com.amap.api.maps.model.RouteOverlay.MapRouteScene.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.model.RouteOverlay$MapRouteScene r1 = (com.amap.api.maps.model.RouteOverlay.MapRouteScene) r1
                return r1
        }

        public static com.amap.api.maps.model.RouteOverlay.MapRouteScene[] values() {
                com.amap.api.maps.model.RouteOverlay$MapRouteScene[] r0 = com.amap.api.maps.model.RouteOverlay.MapRouteScene.$VALUES
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.model.RouteOverlay$MapRouteScene[] r0 = (com.amap.api.maps.model.RouteOverlay.MapRouteScene[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RouteOverlayHighLightParam {
        public int arrowColorNormal;
        public int borderColorHightLight;
        public int borderColorNormal;
        public int fillColorHightLight;
        public int fillColorNormal;

        public RouteOverlayHighLightParam() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public RouteOverlay(com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r1) {
            r0 = this;
            r0.<init>()
            r0.mBaseRouteOverlay = r1
            return
    }

    public void addRouteItem(int r7, com.amap.api.col.p0003l.er[] r8, boolean r9, com.amap.api.col.p0003l.eq r10, int[] r11) {
            r6 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r6.mBaseRouteOverlay     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto Lc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.addRouteItem(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    public void addRouteName() {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.addRouteName()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public android.util.Pair<java.lang.Float, java.lang.Float> getDisplayRange() {
            r2 = this;
            r0 = 0
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r1 = r2.mBaseRouteOverlay     // Catch: java.lang.Exception -> La
            if (r1 != 0) goto L6
            return r0
        L6:
            android.util.Pair r0 = r1.getDisplayRange()     // Catch: java.lang.Exception -> La
        La:
            return r0
    }

    public int getOverlayPriority() {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L9
            if (r0 == 0) goto L9
            int r0 = r0.getOverlayProperty()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L9
            if (r0 == 0) goto L9
            boolean r0 = r0.isVisible()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void remove() {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.remove()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void removeRouteName() {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.removeRouteName()     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setArrow3DTexture(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setArrow3DTexture(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setArrowFlow(boolean r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setArrowFlow(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setCar2DPosition(int r2, float r3) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setCar2DPosition(r2, r3)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setDisplayRange(float r2, float r3) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L8
            if (r0 != 0) goto L5
            goto L8
        L5:
            r0.setDisplayRange(r2, r3)     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    public void setHighlightParam(com.amap.api.maps.model.RouteOverlay.RouteOverlayHighLightParam r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setHighlightParam(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setHighlightType(int r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setHighlightType(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setLine2DWidth(int r2, int r3) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setLine2DWidth(r2, r3)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setLineWidthScale(float r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setLineWidthScale(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setOverlayPriority(int r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L8
            if (r0 != 0) goto L5
            goto L8
        L5:
            r0.setOverlayProperty(r2)     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    public void setRouteItemParam(com.amap.api.col.p0003l.er r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setRouteItemParam(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setSelectStatus(boolean r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setSelectStatus(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setShowArrow(boolean r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setShowArrow(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setShowNaviRouteNameCountMap(java.util.Map<java.lang.Integer, java.lang.Integer> r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setShowNaviRouteNameCountMap(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.IRouteOverlayInner r0 = r1.mBaseRouteOverlay     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            r0.setVisible(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }
}
