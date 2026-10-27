package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class PolygonOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.PolygonOptionsCreator CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    java.lang.String a;
    private int fillColor;
    private java.util.List<com.amap.api.maps.model.BaseHoleOptions> holeOptions;
    private boolean isUsePolylineStroke;
    private boolean isVisible;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.AMapPara.LineJoinType lineJoinType;
    private int nLineCapType;
    private int nLineJoinType;
    private final java.util.List<com.amap.api.maps.model.LatLng> points;
    private int strokeColor;
    private float strokeWidth;
    private com.amap.api.maps.model.PolygonOptions.PolygonUpdateFlags updateFlags;
    private float zIndex;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected static class PolygonUpdateFlags extends com.amap.api.maps.model.BaseOptions.BaseUpdateFlags {
        protected boolean isHoleOptionsUpdated;
        protected boolean isPointsUpdated;

        protected PolygonUpdateFlags() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.isPointsUpdated = r0
                r1.isHoleOptionsUpdated = r0
                return
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
                r1 = this;
                super.reset()
                r0 = 0
                r1.isPointsUpdated = r0
                r1.isHoleOptionsUpdated = r0
                return
        }
    }

    static {
            com.amap.api.maps.model.PolygonOptionsCreator r0 = new com.amap.api.maps.model.PolygonOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.PolygonOptions.CREATOR = r0
            return
    }

    public PolygonOptions() {
            r1 = this;
            r1.<init>()
            r0 = 1092616192(0x41200000, float:10.0)
            r1.strokeWidth = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.strokeColor = r0
            r1.fillColor = r0
            r0 = 0
            r1.zIndex = r0
            r0 = 1
            r1.isVisible = r0
            r1.isUsePolylineStroke = r0
            com.amap.api.maps.model.AMapPara$LineJoinType r0 = com.amap.api.maps.model.AMapPara.LineJoinType.LineJoinBevel
            r1.lineJoinType = r0
            r0 = 3
            r1.nLineCapType = r0
            r0 = 0
            r1.nLineJoinType = r0
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r0 = new com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags
            r0.<init>()
            r1.updateFlags = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.points = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.holeOptions = r0
            java.lang.String r0 = "PolygonOptions"
            r1.type = r0
            return
    }

    private void a() {
            r5 = this;
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r0 = r5.holeOptions
            if (r0 == 0) goto L5d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r5.holeOptions
            r2 = 0
        Lc:
            int r3 = r1.size()
            if (r2 >= r3) goto L4e
            java.lang.Object r3 = r1.get(r2)
            com.amap.api.maps.model.BaseHoleOptions r3 = (com.amap.api.maps.model.BaseHoleOptions) r3
            boolean r4 = r3 instanceof com.amap.api.maps.model.PolygonHoleOptions
            if (r4 == 0) goto L32
            com.amap.api.maps.model.PolygonHoleOptions r3 = (com.amap.api.maps.model.PolygonHoleOptions) r3
            java.util.List r4 = r5.getPoints()
            boolean r4 = com.amap.api.col.p0003l.b3.b0(r4, r3)
            if (r4 == 0) goto L4b
            boolean r4 = com.amap.api.col.p0003l.b3.O(r0, r3)
            if (r4 != 0) goto L4b
            r0.add(r3)
            goto L4b
        L32:
            boolean r4 = r3 instanceof com.amap.api.maps.model.CircleHoleOptions
            if (r4 == 0) goto L4b
            com.amap.api.maps.model.CircleHoleOptions r3 = (com.amap.api.maps.model.CircleHoleOptions) r3
            java.util.List r4 = r5.getPoints()
            boolean r4 = com.amap.api.col.p0003l.b3.Q(r4, r0, r3)
            if (r4 == 0) goto L4b
            boolean r4 = com.amap.api.col.p0003l.b3.N(r0, r3)
            if (r4 != 0) goto L4b
            r0.add(r3)
        L4b:
            int r2 = r2 + 1
            goto Lc
        L4e:
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r5.holeOptions
            r1.clear()
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r5.holeOptions
            r1.addAll(r0)
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r0 = r5.updateFlags
            r1 = 1
            r0.isHoleOptionsUpdated = r1
        L5d:
            return
    }

    public final com.amap.api.maps.model.PolygonOptions add(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r2 = r1.updateFlags     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            r2.isPointsUpdated = r0     // Catch: java.lang.Throwable -> Ld
            r1.a()     // Catch: java.lang.Throwable -> Ld
        Ld:
            return r1
    }

    public final com.amap.api.maps.model.PolygonOptions add(com.amap.api.maps.model.LatLng... r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> L13
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L13
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L13
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r2 = r1.updateFlags     // Catch: java.lang.Throwable -> L13
            r0 = 1
            r2.isPointsUpdated = r0     // Catch: java.lang.Throwable -> L13
            r1.a()     // Catch: java.lang.Throwable -> L13
        L13:
            return r1
    }

    public final com.amap.api.maps.model.PolygonOptions addAll(java.lang.Iterable<com.amap.api.maps.model.LatLng> r3) {
            r2 = this;
            if (r3 == 0) goto L20
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L20
        L6:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.LatLng r0 = (com.amap.api.maps.model.LatLng) r0     // Catch: java.lang.Throwable -> L20
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r2.points     // Catch: java.lang.Throwable -> L20
            r1.add(r0)     // Catch: java.lang.Throwable -> L20
            goto L6
        L18:
            r2.a()     // Catch: java.lang.Throwable -> L20
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r3 = r2.updateFlags     // Catch: java.lang.Throwable -> L20
            r0 = 1
            r3.isPointsUpdated = r0     // Catch: java.lang.Throwable -> L20
        L20:
            return r2
    }

    public final com.amap.api.maps.model.PolygonOptions addHoles(java.lang.Iterable<com.amap.api.maps.model.BaseHoleOptions> r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L1c
        L3:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1c
        L7:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L1c
            com.amap.api.maps.model.BaseHoleOptions r0 = (com.amap.api.maps.model.BaseHoleOptions) r0     // Catch: java.lang.Throwable -> L1c
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r2.holeOptions     // Catch: java.lang.Throwable -> L1c
            r1.add(r0)     // Catch: java.lang.Throwable -> L1c
            goto L7
        L19:
            r2.a()     // Catch: java.lang.Throwable -> L1c
        L1c:
            return r2
    }

    public final com.amap.api.maps.model.PolygonOptions addHoles(com.amap.api.maps.model.BaseHoleOptions... r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto Lf
        L3:
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r0 = r1.holeOptions     // Catch: java.lang.Throwable -> Lf
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> Lf
            r0.addAll(r2)     // Catch: java.lang.Throwable -> Lf
            r1.a()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return r1
    }

    public final com.amap.api.maps.model.PolygonOptions clone() {
            r3 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
        L3:
            com.amap.api.maps.model.PolygonOptions r0 = new com.amap.api.maps.model.PolygonOptions
            r0.<init>()
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r0.points
            java.util.List<com.amap.api.maps.model.LatLng> r2 = r3.points
            r1.addAll(r2)
            float r1 = r3.strokeWidth
            r0.strokeWidth = r1
            int r1 = r3.strokeColor
            r0.strokeColor = r1
            int r1 = r3.fillColor
            r0.fillColor = r1
            float r1 = r3.zIndex
            r0.zIndex = r1
            boolean r1 = r3.isVisible
            r0.isVisible = r1
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r3.holeOptions
            r0.holeOptions = r1
            java.lang.String r1 = r3.a
            r0.a = r1
            boolean r1 = r3.isUsePolylineStroke
            r0.isUsePolylineStroke = r1
            com.amap.api.maps.model.AMapPara$LineJoinType r1 = r3.lineJoinType
            r0.lineJoinType = r1
            int r1 = r3.nLineCapType
            r0.nLineCapType = r1
            int r1 = r3.nLineJoinType
            r0.nLineJoinType = r1
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r1 = r3.updateFlags
            r0.updateFlags = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m15clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.PolygonOptions r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.PolygonOptions fillColor(int r1) {
            r0 = this;
            r0.fillColor = r1
            return r0
    }

    public final int getFillColor() {
            r1 = this;
            int r0 = r1.fillColor
            return r0
    }

    public final java.util.List<com.amap.api.maps.model.BaseHoleOptions> getHoleOptions() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r0 = r1.holeOptions
            return r0
    }

    public final com.amap.api.maps.model.AMapPara.LineJoinType getLineJoinType() {
            r1 = this;
            com.amap.api.maps.model.AMapPara$LineJoinType r0 = r1.lineJoinType
            return r0
    }

    public final java.util.List<com.amap.api.maps.model.LatLng> getPoints() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points
            return r0
    }

    public final int getStrokeColor() {
            r1 = this;
            int r0 = r1.strokeColor
            return r0
    }

    public final float getStrokeWidth() {
            r1 = this;
            float r0 = r1.strokeWidth
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final /* bridge */ /* synthetic */ com.amap.api.maps.model.BaseOptions.BaseUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r0 = r1.getUpdateFlags()
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final com.amap.api.maps.model.PolygonOptions.PolygonUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r0 = r1.updateFlags
            return r0
    }

    public final float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public final boolean isUsePolylineStroke() {
            r1 = this;
            boolean r0 = r1.isUsePolylineStroke
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public final com.amap.api.maps.model.PolygonOptions lineJoinType(com.amap.api.maps.model.AMapPara.LineJoinType r1) {
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
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r0 = r1.updateFlags
            r0.reset()
            return
    }

    public final void setHoleOptions(java.util.List<com.amap.api.maps.model.BaseHoleOptions> r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r0 = r1.holeOptions     // Catch: java.lang.Throwable -> Lf
            r0.clear()     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto Lc
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r0 = r1.holeOptions     // Catch: java.lang.Throwable -> Lf
            r0.addAll(r2)     // Catch: java.lang.Throwable -> Lf
        Lc:
            r1.a()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    public final void setPoints(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L8
            goto L15
        L8:
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r1.points     // Catch: java.lang.Throwable -> L15
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L15
            r1.a()     // Catch: java.lang.Throwable -> L15
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r2 = r1.updateFlags     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r2.isPointsUpdated = r0     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    public final com.amap.api.maps.model.PolygonOptions strokeColor(int r1) {
            r0 = this;
            r0.strokeColor = r1
            return r0
    }

    public final com.amap.api.maps.model.PolygonOptions strokeWidth(float r1) {
            r0 = this;
            r0.strokeWidth = r1
            return r0
    }

    public final com.amap.api.maps.model.PolygonOptions usePolylineStroke(boolean r1) {
            r0 = this;
            r0.isUsePolylineStroke = r1
            return r0
    }

    public final com.amap.api.maps.model.PolygonOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<com.amap.api.maps.model.LatLng> r2 = r0.points
            r1.writeTypedList(r2)
            float r2 = r0.strokeWidth
            r1.writeFloat(r2)
            int r2 = r0.strokeColor
            r1.writeInt(r2)
            int r2 = r0.fillColor
            r1.writeInt(r2)
            float r2 = r0.zIndex
            r1.writeFloat(r2)
            boolean r2 = r0.isVisible
            byte r2 = (byte) r2
            r1.writeByte(r2)
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r2 = r0.holeOptions
            r1.writeList(r2)
            com.amap.api.maps.model.AMapPara$LineJoinType r2 = r0.lineJoinType
            int r2 = r2.getTypeValue()
            r1.writeInt(r2)
            boolean r2 = r0.isUsePolylineStroke
            byte r2 = (byte) r2
            r1.writeByte(r2)
            return
    }

    public final com.amap.api.maps.model.PolygonOptions zIndex(float r3) {
            r2 = this;
            float r0 = r2.zIndex
            int r0 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            com.amap.api.maps.model.PolygonOptions$PolygonUpdateFlags r0 = r2.updateFlags
            r1 = 1
            r0.zIndexUpdate = r1
        Lb:
            r2.zIndex = r3
            return r2
    }
}
