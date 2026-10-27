package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class PolylineOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.PolylineOptionsCreator CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int DOTTEDLINE_TYPE_CIRCLE = 1;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final int DOTTEDLINE_TYPE_SQUARE = 0;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    java.lang.String a;
    private int color;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.util.List<java.lang.Integer> colorValues;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.util.List<java.lang.Integer> customIndexs;
    private com.amap.api.maps.model.BitmapDescriptor customTexture;
    private java.util.List<com.amap.api.maps.model.BitmapDescriptor> customTextureList;
    private int dottedLineType;
    private int eraseColor;
    private com.amap.api.maps.model.BitmapDescriptor eraseTexture;
    private boolean eraseVisible;
    private float footPrintGap;
    private com.amap.api.maps.model.BitmapDescriptor footPrintTexture;
    private boolean isAboveMaskLayer;
    private boolean isDottedLine;
    private boolean isGeodesic;
    private boolean isGradient;
    private boolean isUseTexture;
    private boolean isVisible;
    private int[] jniColorValues;
    private int[] jniCustomIndexes;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.PolylineOptions.LineCapType lineCapType;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.PolylineOptions.LineJoinType lineJoinType;
    private int nLineCapType;
    private int nLineJoinType;
    private final java.util.List<com.amap.api.maps.model.LatLng> points;
    private boolean showPolylineRangeEnable;
    private float shownPolylineRangeBegin;
    private float shownPolylineRangeEnd;
    private float shownRangeBegin;
    private float shownRangeEnd;
    private float shownRatio;
    private float transparency;
    private com.amap.api.maps.model.PolylineOptions.PolylineUpdateFlags updateFlags;
    private boolean useEngine;
    private float width;
    private float zIndex;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LineCapType extends java.lang.Enum<com.amap.api.maps.model.PolylineOptions.LineCapType> {
        private static final /* synthetic */ com.amap.api.maps.model.PolylineOptions.LineCapType[] $VALUES = null;
        public static final com.amap.api.maps.model.PolylineOptions.LineCapType LineCapArrow = null;
        public static final com.amap.api.maps.model.PolylineOptions.LineCapType LineCapButt = null;
        public static final com.amap.api.maps.model.PolylineOptions.LineCapType LineCapRound = null;
        public static final com.amap.api.maps.model.PolylineOptions.LineCapType LineCapSquare = null;
        private int type;

        static {
                com.amap.api.maps.model.PolylineOptions$LineCapType r0 = new com.amap.api.maps.model.PolylineOptions$LineCapType
                java.lang.String r1 = "LineCapButt"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.amap.api.maps.model.PolylineOptions.LineCapType.LineCapButt = r0
                com.amap.api.maps.model.PolylineOptions$LineCapType r1 = new com.amap.api.maps.model.PolylineOptions$LineCapType
                java.lang.String r3 = "LineCapSquare"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.amap.api.maps.model.PolylineOptions.LineCapType.LineCapSquare = r1
                com.amap.api.maps.model.PolylineOptions$LineCapType r3 = new com.amap.api.maps.model.PolylineOptions$LineCapType
                java.lang.String r5 = "LineCapArrow"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.amap.api.maps.model.PolylineOptions.LineCapType.LineCapArrow = r3
                com.amap.api.maps.model.PolylineOptions$LineCapType r5 = new com.amap.api.maps.model.PolylineOptions$LineCapType
                java.lang.String r7 = "LineCapRound"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.amap.api.maps.model.PolylineOptions.LineCapType.LineCapRound = r5
                r7 = 4
                com.amap.api.maps.model.PolylineOptions$LineCapType[] r7 = new com.amap.api.maps.model.PolylineOptions.LineCapType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.amap.api.maps.model.PolylineOptions.LineCapType.$VALUES = r7
                return
        }

        LineCapType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.type = r3
                return
        }

        public static com.amap.api.maps.model.PolylineOptions.LineCapType valueOf(int r2) {
                com.amap.api.maps.model.PolylineOptions$LineCapType[] r0 = values()
                int r1 = r0.length
                int r2 = java.lang.Math.min(r2, r1)
                r1 = 0
                int r2 = java.lang.Math.max(r1, r2)
                r2 = r0[r2]
                return r2
        }

        public static com.amap.api.maps.model.PolylineOptions.LineCapType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.model.PolylineOptions$LineCapType> r0 = com.amap.api.maps.model.PolylineOptions.LineCapType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.model.PolylineOptions$LineCapType r1 = (com.amap.api.maps.model.PolylineOptions.LineCapType) r1
                return r1
        }

        public static com.amap.api.maps.model.PolylineOptions.LineCapType[] values() {
                com.amap.api.maps.model.PolylineOptions$LineCapType[] r0 = com.amap.api.maps.model.PolylineOptions.LineCapType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.model.PolylineOptions$LineCapType[] r0 = (com.amap.api.maps.model.PolylineOptions.LineCapType[]) r0
                return r0
        }

        public final int getTypeValue() {
                r1 = this;
                int r0 = r1.type
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LineJoinType extends java.lang.Enum<com.amap.api.maps.model.PolylineOptions.LineJoinType> {
        private static final /* synthetic */ com.amap.api.maps.model.PolylineOptions.LineJoinType[] $VALUES = null;
        public static final com.amap.api.maps.model.PolylineOptions.LineJoinType LineJoinBevel = null;
        public static final com.amap.api.maps.model.PolylineOptions.LineJoinType LineJoinMiter = null;
        public static final com.amap.api.maps.model.PolylineOptions.LineJoinType LineJoinRound = null;
        private int type;

        static {
                com.amap.api.maps.model.PolylineOptions$LineJoinType r0 = new com.amap.api.maps.model.PolylineOptions$LineJoinType
                java.lang.String r1 = "LineJoinBevel"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.amap.api.maps.model.PolylineOptions.LineJoinType.LineJoinBevel = r0
                com.amap.api.maps.model.PolylineOptions$LineJoinType r1 = new com.amap.api.maps.model.PolylineOptions$LineJoinType
                java.lang.String r3 = "LineJoinMiter"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.amap.api.maps.model.PolylineOptions.LineJoinType.LineJoinMiter = r1
                com.amap.api.maps.model.PolylineOptions$LineJoinType r3 = new com.amap.api.maps.model.PolylineOptions$LineJoinType
                java.lang.String r5 = "LineJoinRound"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.amap.api.maps.model.PolylineOptions.LineJoinType.LineJoinRound = r3
                r5 = 3
                com.amap.api.maps.model.PolylineOptions$LineJoinType[] r5 = new com.amap.api.maps.model.PolylineOptions.LineJoinType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.amap.api.maps.model.PolylineOptions.LineJoinType.$VALUES = r5
                return
        }

        LineJoinType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.type = r3
                return
        }

        public static com.amap.api.maps.model.PolylineOptions.LineJoinType valueOf(int r2) {
                com.amap.api.maps.model.PolylineOptions$LineJoinType[] r0 = values()
                int r1 = r0.length
                int r2 = java.lang.Math.min(r2, r1)
                r1 = 0
                int r2 = java.lang.Math.max(r1, r2)
                r2 = r0[r2]
                return r2
        }

        public static com.amap.api.maps.model.PolylineOptions.LineJoinType valueOf(java.lang.String r1) {
                java.lang.Class<com.amap.api.maps.model.PolylineOptions$LineJoinType> r0 = com.amap.api.maps.model.PolylineOptions.LineJoinType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.amap.api.maps.model.PolylineOptions$LineJoinType r1 = (com.amap.api.maps.model.PolylineOptions.LineJoinType) r1
                return r1
        }

        public static com.amap.api.maps.model.PolylineOptions.LineJoinType[] values() {
                com.amap.api.maps.model.PolylineOptions$LineJoinType[] r0 = com.amap.api.maps.model.PolylineOptions.LineJoinType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.amap.api.maps.model.PolylineOptions$LineJoinType[] r0 = (com.amap.api.maps.model.PolylineOptions.LineJoinType[]) r0
                return r0
        }

        public final int getTypeValue() {
                r1 = this;
                int r0 = r1.type
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected static class PolylineUpdateFlags extends com.amap.api.maps.model.BaseOptions.BaseUpdateFlags {
        protected boolean eraseUpdate;
        protected boolean footPrintBDUpdate;
        protected boolean isColorValuesUpdated;
        protected boolean isCustomIndexesUpdated;
        protected boolean isCustomTextureListUpdated;
        protected boolean isPointsUpdated;

        protected PolylineUpdateFlags() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.isPointsUpdated = r0
                r1.isCustomIndexesUpdated = r0
                r1.isCustomTextureListUpdated = r0
                r1.isColorValuesUpdated = r0
                r1.footPrintBDUpdate = r0
                r1.eraseUpdate = r0
                return
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
                r1 = this;
                super.reset()
                r0 = 0
                r1.isPointsUpdated = r0
                r1.isCustomIndexesUpdated = r0
                r1.isCustomTextureListUpdated = r0
                r1.isColorValuesUpdated = r0
                r1.footPrintBDUpdate = r0
                r1.eraseUpdate = r0
                return
        }
    }

    static {
            com.amap.api.maps.model.PolylineOptionsCreator r0 = new com.amap.api.maps.model.PolylineOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.PolylineOptions.CREATOR = r0
            return
    }

    public PolylineOptions() {
            r3 = this;
            r3.<init>()
            r0 = 1092616192(0x41200000, float:10.0)
            r3.width = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.color = r0
            r0 = 0
            r3.zIndex = r0
            r1 = 1
            r3.isVisible = r1
            r2 = 0
            r3.useEngine = r2
            r3.isUseTexture = r1
            r3.isGeodesic = r2
            r3.isDottedLine = r2
            r3.isGradient = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.transparency = r1
            r3.isAboveMaskLayer = r2
            r3.dottedLineType = r2
            com.amap.api.maps.model.PolylineOptions$LineCapType r1 = com.amap.api.maps.model.PolylineOptions.LineCapType.LineCapRound
            r3.lineCapType = r1
            com.amap.api.maps.model.PolylineOptions$LineJoinType r1 = com.amap.api.maps.model.PolylineOptions.LineJoinType.LineJoinBevel
            r3.lineJoinType = r1
            r1 = 3
            r3.nLineCapType = r1
            r3.nLineJoinType = r2
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.shownRatio = r1
            r3.shownRangeBegin = r1
            r3.shownRangeEnd = r1
            r1 = 1120403456(0x42c80000, float:100.0)
            r3.footPrintGap = r1
            r3.eraseVisible = r2
            r1 = -7829368(0xffffffffff888888, float:NaN)
            r3.eraseColor = r1
            r3.shownPolylineRangeBegin = r0
            r3.shownPolylineRangeEnd = r0
            r3.showPolylineRangeEnable = r2
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r0 = new com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags
            r0.<init>()
            r3.updateFlags = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.points = r0
            java.lang.String r0 = "PolylineOptions"
            r3.type = r0
            return
    }

    public final com.amap.api.maps.model.PolylineOptions aboveMaskLayer(boolean r1) {
            r0 = this;
            r0.isAboveMaskLayer = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions add(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> Lc
            r0.add(r2)     // Catch: java.lang.Throwable -> Lc
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r2 = r1.updateFlags     // Catch: java.lang.Throwable -> Lc
            r0 = 1
            r2.isPointsUpdated = r0     // Catch: java.lang.Throwable -> Lc
        Lc:
            return r1
    }

    public final com.amap.api.maps.model.PolylineOptions add(com.amap.api.maps.model.LatLng... r2) {
            r1 = this;
            if (r2 == 0) goto L10
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> L10
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L10
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L10
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r2 = r1.updateFlags     // Catch: java.lang.Throwable -> L10
            r0 = 1
            r2.isPointsUpdated = r0     // Catch: java.lang.Throwable -> L10
        L10:
            return r1
    }

    public final com.amap.api.maps.model.PolylineOptions addAll(java.lang.Iterable<com.amap.api.maps.model.LatLng> r3) {
            r2 = this;
            if (r3 == 0) goto L1d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1d
        L6:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L1d
            com.amap.api.maps.model.LatLng r0 = (com.amap.api.maps.model.LatLng) r0     // Catch: java.lang.Throwable -> L1d
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r2.points     // Catch: java.lang.Throwable -> L1d
            r1.add(r0)     // Catch: java.lang.Throwable -> L1d
            goto L6
        L18:
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r3 = r2.updateFlags     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.isPointsUpdated = r0     // Catch: java.lang.Throwable -> L1d
        L1d:
            return r2
    }

    public final com.amap.api.maps.model.PolylineOptions color(int r1) {
            r0 = this;
            r0.color = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions colorValues(java.util.List<java.lang.Integer> r4) {
            r3 = this;
            r3.colorValues = r4     // Catch: java.lang.Throwable -> L24
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L24
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L24
            r3.jniColorValues = r0     // Catch: java.lang.Throwable -> L24
            r0 = 0
        Lb:
            int[] r1 = r3.jniColorValues     // Catch: java.lang.Throwable -> L24
            int r2 = r1.length     // Catch: java.lang.Throwable -> L24
            if (r0 >= r2) goto L1f
            java.lang.Object r2 = r4.get(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L24
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L24
            r1[r0] = r2     // Catch: java.lang.Throwable -> L24
            int r0 = r0 + 1
            goto Lb
        L1f:
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r4 = r3.updateFlags     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r4.isColorValuesUpdated = r0     // Catch: java.lang.Throwable -> L24
        L24:
            return r3
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions geodesic(boolean r1) {
            r0 = this;
            r0.isGeodesic = r1
            return r0
    }

    public final int getColor() {
            r1 = this;
            int r0 = r1.color
            return r0
    }

    public final java.util.List<java.lang.Integer> getColorValues() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.colorValues
            return r0
    }

    public final com.amap.api.maps.model.BitmapDescriptor getCustomTexture() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.customTexture
            return r0
    }

    public final java.util.List<java.lang.Integer> getCustomTextureIndex() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.customIndexs
            return r0
    }

    public final java.util.List<com.amap.api.maps.model.BitmapDescriptor> getCustomTextureList() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r1.customTextureList
            return r0
    }

    public final int getDottedLineType() {
            r1 = this;
            int r0 = r1.dottedLineType
            return r0
    }

    public final int getEraseColor() {
            r1 = this;
            int r0 = r1.eraseColor
            return r0
    }

    public final com.amap.api.maps.model.BitmapDescriptor getEraseTexture() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.eraseTexture
            return r0
    }

    public final boolean getEraseVisible() {
            r1 = this;
            boolean r0 = r1.eraseVisible
            return r0
    }

    public final float getFootPrintGap() {
            r1 = this;
            float r0 = r1.footPrintGap
            return r0
    }

    public final com.amap.api.maps.model.BitmapDescriptor getFootPrintTexture() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.footPrintTexture
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions.LineCapType getLineCapType() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions$LineCapType r0 = r1.lineCapType
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions.LineJoinType getLineJoinType() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions$LineJoinType r0 = r1.lineJoinType
            return r0
    }

    public final java.util.List<com.amap.api.maps.model.LatLng> getPoints() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points
            return r0
    }

    public final float getPolylineShownRangeBegin() {
            r1 = this;
            float r0 = r1.shownPolylineRangeBegin
            return r0
    }

    public final float getPolylineShownRangeEnd() {
            r1 = this;
            float r0 = r1.shownPolylineRangeEnd
            return r0
    }

    public final float getShownRangeBegin() {
            r1 = this;
            float r0 = r1.shownRangeBegin
            return r0
    }

    public final float getShownRangeEnd() {
            r1 = this;
            float r0 = r1.shownRangeEnd
            return r0
    }

    public final float getShownRatio() {
            r1 = this;
            float r0 = r1.shownRatio
            return r0
    }

    public final float getTransparency() {
            r1 = this;
            float r0 = r1.transparency
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final /* bridge */ /* synthetic */ com.amap.api.maps.model.BaseOptions.BaseUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r0 = r1.getUpdateFlags()
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final com.amap.api.maps.model.PolylineOptions.PolylineUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r0 = r1.updateFlags
            return r0
    }

    public final boolean getUseEngine() {
            r1 = this;
            boolean r0 = r1.useEngine
            return r0
    }

    public final float getWidth() {
            r1 = this;
            float r0 = r1.width
            return r0
    }

    public final float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public final boolean isAboveMaskLayer() {
            r1 = this;
            boolean r0 = r1.isAboveMaskLayer
            return r0
    }

    public final boolean isDottedLine() {
            r1 = this;
            boolean r0 = r1.isDottedLine
            return r0
    }

    public final boolean isGeodesic() {
            r1 = this;
            boolean r0 = r1.isGeodesic
            return r0
    }

    public final boolean isShowPolylineRangeEnable() {
            r1 = this;
            boolean r0 = r1.showPolylineRangeEnable
            return r0
    }

    public final boolean isUseGradient() {
            r1 = this;
            boolean r0 = r1.isGradient
            return r0
    }

    public final boolean isUseTexture() {
            r1 = this;
            boolean r0 = r1.isUseTexture
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions lineCapType(com.amap.api.maps.model.PolylineOptions.LineCapType r1) {
            r0 = this;
            if (r1 == 0) goto La
            r0.lineCapType = r1
            int r1 = r1.getTypeValue()
            r0.nLineCapType = r1
        La:
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions lineJoinType(com.amap.api.maps.model.PolylineOptions.LineJoinType r1) {
            r0 = this;
            if (r1 == 0) goto La
            r0.lineJoinType = r1
            int r1 = r1.getTypeValue()
            r0.nLineJoinType = r1
        La:
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final void resetUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r0 = r1.updateFlags
            r0.reset()
            return
    }

    public final com.amap.api.maps.model.PolylineOptions setCustomTexture(com.amap.api.maps.model.BitmapDescriptor r1) {
            r0 = this;
            r0.customTexture = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions setCustomTextureIndex(java.util.List<java.lang.Integer> r4) {
            r3 = this;
            r3.customIndexs = r4     // Catch: java.lang.Throwable -> L26
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L26
            int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> L26
            r3.jniCustomIndexes = r0     // Catch: java.lang.Throwable -> L26
            r0 = 0
        Lb:
            int[] r1 = r3.jniCustomIndexes     // Catch: java.lang.Throwable -> L26
            int r2 = r1.length     // Catch: java.lang.Throwable -> L26
            if (r0 >= r2) goto L1f
            java.lang.Object r2 = r4.get(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L26
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L26
            r1[r0] = r2     // Catch: java.lang.Throwable -> L26
            int r0 = r0 + 1
            goto Lb
        L1f:
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r4 = r3.updateFlags     // Catch: java.lang.Throwable -> L26
            r0 = 1
            r4.isCustomIndexesUpdated = r0     // Catch: java.lang.Throwable -> L26
            r4.isCustomTextureListUpdated = r0     // Catch: java.lang.Throwable -> L26
        L26:
            return r3
    }

    public final com.amap.api.maps.model.PolylineOptions setCustomTextureList(java.util.List<com.amap.api.maps.model.BitmapDescriptor> r2) {
            r1 = this;
            r1.customTextureList = r2
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.isCustomTextureListUpdated = r0
            r2.isCustomIndexesUpdated = r0
            return r1
    }

    public final com.amap.api.maps.model.PolylineOptions setDottedLine(boolean r1) {
            r0 = this;
            r0.isDottedLine = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions setDottedLineType(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L5
        L4:
            r1 = 1
        L5:
            r0.dottedLineType = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions setEraseColor(boolean r1, int r2) {
            r0 = this;
            r0.eraseVisible = r1
            r0.eraseColor = r2
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r1 = r0.updateFlags
            r2 = 1
            r1.eraseUpdate = r2
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions setEraseTexture(boolean r1, com.amap.api.maps.model.BitmapDescriptor r2) {
            r0 = this;
            r0.eraseVisible = r1
            r0.eraseTexture = r2
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r1 = r0.updateFlags
            r2 = 1
            r1.eraseUpdate = r2
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions setFootPrintGap(float r1) {
            r0 = this;
            r0.footPrintGap = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions setFootPrintTexture(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            r1.footPrintTexture = r2
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.footPrintBDUpdate = r0
            return r1
    }

    public final void setPoints(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points
            if (r0 == r2) goto L13
            r0.clear()     // Catch: java.lang.Throwable -> L13
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> L13
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L13
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r2 = r1.updateFlags     // Catch: java.lang.Throwable -> L13
            r0 = 1
            r2.isPointsUpdated = r0     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public final com.amap.api.maps.model.PolylineOptions setPolylineShowRange(float r1, float r2) {
            r0 = this;
            r0.shownPolylineRangeBegin = r1
            r0.shownPolylineRangeEnd = r2
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions setShownRange(float r2, float r3) {
            r1 = this;
            r1.shownRangeBegin = r2
            r1.shownRangeEnd = r3
            r0 = 1
            r1.showPolylineRangeEnabled(r0)
            r1.setPolylineShowRange(r2, r3)
            return r1
    }

    public final com.amap.api.maps.model.PolylineOptions setShownRatio(float r2) {
            r1 = this;
            r1.shownRatio = r2
            r0 = 0
            r1.setPolylineShowRange(r0, r2)
            r2 = 1
            r1.showPolylineRangeEnabled(r2)
            return r1
    }

    public final void setUseEngine(boolean r1) {
            r0 = this;
            r0.useEngine = r1
            return
    }

    public final com.amap.api.maps.model.PolylineOptions setUseTexture(boolean r1) {
            r0 = this;
            r0.isUseTexture = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions showPolylineRangeEnabled(boolean r1) {
            r0 = this;
            r0.showPolylineRangeEnable = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions transparency(float r1) {
            r0 = this;
            r0.transparency = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions useGradient(boolean r1) {
            r0 = this;
            r0.isGradient = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    public final com.amap.api.maps.model.PolylineOptions width(float r1) {
            r0 = this;
            r0.width = r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r8, int r9) {
            r7 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r7.points
            r8.writeTypedList(r0)
            float r0 = r7.width
            r8.writeFloat(r0)
            int r0 = r7.color
            r8.writeInt(r0)
            int r0 = r7.dottedLineType
            r8.writeInt(r0)
            float r0 = r7.zIndex
            r8.writeFloat(r0)
            float r0 = r7.transparency
            r8.writeFloat(r0)
            java.lang.String r0 = r7.a
            r8.writeString(r0)
            com.amap.api.maps.model.PolylineOptions$LineCapType r0 = r7.lineCapType
            int r0 = r0.getTypeValue()
            r8.writeInt(r0)
            com.amap.api.maps.model.PolylineOptions$LineJoinType r0 = r7.lineJoinType
            int r0 = r0.getTypeValue()
            r8.writeInt(r0)
            boolean r0 = r7.isVisible
            boolean r1 = r7.isDottedLine
            boolean r2 = r7.isGeodesic
            boolean r3 = r7.isGradient
            boolean r4 = r7.isAboveMaskLayer
            r5 = 5
            boolean[] r5 = new boolean[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            r8.writeBooleanArray(r5)
            com.amap.api.maps.model.BitmapDescriptor r0 = r7.customTexture
            if (r0 == 0) goto L5b
            r8.writeParcelable(r0, r9)
        L5b:
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r9 = r7.customTextureList
            if (r9 == 0) goto L62
            r8.writeList(r9)
        L62:
            java.util.List<java.lang.Integer> r9 = r7.customIndexs
            if (r9 == 0) goto L69
            r8.writeList(r9)
        L69:
            java.util.List<java.lang.Integer> r9 = r7.colorValues
            if (r9 == 0) goto L70
            r8.writeList(r9)
        L70:
            float r9 = r7.shownRatio
            r8.writeFloat(r9)
            return
    }

    public final com.amap.api.maps.model.PolylineOptions zIndex(float r3) {
            r2 = this;
            float r0 = r2.zIndex
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lb
            com.amap.api.maps.model.PolylineOptions$PolylineUpdateFlags r0 = r2.updateFlags
            r1 = 1
            r0.zIndexUpdate = r1
        Lb:
            r2.zIndex = r3
            return r2
    }
}
