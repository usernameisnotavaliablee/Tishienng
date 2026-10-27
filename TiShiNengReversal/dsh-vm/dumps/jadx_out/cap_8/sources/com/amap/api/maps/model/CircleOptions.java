package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class CircleOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.CircleOptionsCreator CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    java.lang.String a;
    private int dottedLineType;
    private int fillColor;
    private java.util.List<com.amap.api.maps.model.BaseHoleOptions> holeOptions;
    private boolean isUsePolylineStroke;
    private boolean isVisible;
    private com.amap.api.maps.model.LatLng point;
    private double radius;
    private int strokeColor;
    private float strokeWidth;
    private com.amap.api.maps.model.CircleOptions.CircleUpdateFlags updateFlags;
    private float zIndex;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected static class CircleUpdateFlags extends com.amap.api.maps.model.BaseOptions.BaseUpdateFlags {
        protected boolean isCenterUpdated;
        protected boolean isHoleOptionsUpdated;
        protected boolean isRadiusUpdated;

        protected CircleUpdateFlags() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.isCenterUpdated = r0
                r1.isRadiusUpdated = r0
                r1.isHoleOptionsUpdated = r0
                return
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
                r1 = this;
                super.reset()
                r0 = 0
                r1.isCenterUpdated = r0
                r1.isRadiusUpdated = r0
                r1.isHoleOptionsUpdated = r0
                return
        }
    }

    static {
            com.amap.api.maps.model.CircleOptionsCreator r0 = new com.amap.api.maps.model.CircleOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.CircleOptions.CREATOR = r0
            return
    }

    public CircleOptions() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.point = r0
            r0 = 0
            r2.radius = r0
            r0 = 1092616192(0x41200000, float:10.0)
            r2.strokeWidth = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.strokeColor = r0
            r0 = 0
            r2.fillColor = r0
            r0 = 0
            r2.zIndex = r0
            r0 = 1
            r2.isVisible = r0
            r1 = -1
            r2.dottedLineType = r1
            r2.isUsePolylineStroke = r0
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r0 = new com.amap.api.maps.model.CircleOptions$CircleUpdateFlags
            r0.<init>()
            r2.updateFlags = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.holeOptions = r0
            java.lang.String r0 = "CircleOptions"
            r2.type = r0
            return
    }

    private void a() {
            r7 = this;
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r0 = r7.holeOptions
            if (r0 == 0) goto L65
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r7.holeOptions
            r2 = 0
        Lc:
            int r3 = r1.size()
            if (r2 >= r3) goto L56
            java.lang.Object r3 = r1.get(r2)
            com.amap.api.maps.model.BaseHoleOptions r3 = (com.amap.api.maps.model.BaseHoleOptions) r3
            boolean r4 = r3 instanceof com.amap.api.maps.model.PolygonHoleOptions
            if (r4 == 0) goto L36
            com.amap.api.maps.model.PolygonHoleOptions r3 = (com.amap.api.maps.model.PolygonHoleOptions) r3
            double r4 = r7.getRadius()
            com.amap.api.maps.model.LatLng r6 = r7.getCenter()
            boolean r4 = com.amap.api.col.p0003l.b3.H(r4, r6, r0, r3)
            if (r4 == 0) goto L53
            boolean r4 = com.amap.api.col.p0003l.b3.O(r0, r3)
            if (r4 != 0) goto L53
            r0.add(r3)
            goto L53
        L36:
            boolean r4 = r3 instanceof com.amap.api.maps.model.CircleHoleOptions
            if (r4 == 0) goto L53
            com.amap.api.maps.model.CircleHoleOptions r3 = (com.amap.api.maps.model.CircleHoleOptions) r3
            double r4 = r7.getRadius()
            com.amap.api.maps.model.LatLng r6 = r7.getCenter()
            boolean r4 = com.amap.api.col.p0003l.b3.F(r4, r6, r3)
            if (r4 == 0) goto L53
            boolean r4 = com.amap.api.col.p0003l.b3.N(r0, r3)
            if (r4 != 0) goto L53
            r0.add(r3)
        L53:
            int r2 = r2 + 1
            goto Lc
        L56:
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r7.holeOptions
            r1.clear()
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r7.holeOptions
            r1.addAll(r0)
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r0 = r7.updateFlags
            r1 = 1
            r0.isHoleOptionsUpdated = r1
        L65:
            return
    }

    public final com.amap.api.maps.model.CircleOptions addHoles(java.lang.Iterable<com.amap.api.maps.model.BaseHoleOptions> r3) {
            r2 = this;
            if (r3 == 0) goto L1b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1b
        L6:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L1b
            com.amap.api.maps.model.BaseHoleOptions r0 = (com.amap.api.maps.model.BaseHoleOptions) r0     // Catch: java.lang.Throwable -> L1b
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r1 = r2.holeOptions     // Catch: java.lang.Throwable -> L1b
            r1.add(r0)     // Catch: java.lang.Throwable -> L1b
            goto L6
        L18:
            r2.a()     // Catch: java.lang.Throwable -> L1b
        L1b:
            return r2
    }

    public final com.amap.api.maps.model.CircleOptions addHoles(com.amap.api.maps.model.BaseHoleOptions... r2) {
            r1 = this;
            if (r2 == 0) goto Le
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r0 = r1.holeOptions     // Catch: java.lang.Throwable -> Le
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> Le
            r0.addAll(r2)     // Catch: java.lang.Throwable -> Le
            r1.a()     // Catch: java.lang.Throwable -> Le
        Le:
            return r1
    }

    public final com.amap.api.maps.model.CircleOptions center(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            r1.point = r2
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.isCenterUpdated = r0
            r1.a()
            return r1
    }

    public final com.amap.api.maps.model.CircleOptions clone() {
            r3 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
        L3:
            com.amap.api.maps.model.CircleOptions r0 = new com.amap.api.maps.model.CircleOptions
            r0.<init>()
            java.lang.String r1 = r3.a
            r0.a = r1
            com.amap.api.maps.model.LatLng r1 = r3.point
            r0.point = r1
            double r1 = r3.radius
            r0.radius = r1
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
            int r1 = r3.dottedLineType
            r0.dottedLineType = r1
            boolean r1 = r3.isUsePolylineStroke
            r0.isUsePolylineStroke = r1
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r1 = r3.updateFlags
            r0.updateFlags = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m8clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.CircleOptions r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.CircleOptions fillColor(int r1) {
            r0 = this;
            r0.fillColor = r1
            return r0
    }

    public final com.amap.api.maps.model.LatLng getCenter() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.point
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

    public final double getRadius() {
            r2 = this;
            double r0 = r2.radius
            return r0
    }

    public final int getStrokeColor() {
            r1 = this;
            int r0 = r1.strokeColor
            return r0
    }

    public final int getStrokeDottedLineType() {
            r1 = this;
            int r0 = r1.dottedLineType
            return r0
    }

    public final float getStrokeWidth() {
            r1 = this;
            float r0 = r1.strokeWidth
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    protected final /* bridge */ /* synthetic */ com.amap.api.maps.model.BaseOptions.BaseUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r0 = r1.getUpdateFlags()
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    protected final com.amap.api.maps.model.CircleOptions.CircleUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r0 = r1.updateFlags
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

    public final com.amap.api.maps.model.CircleOptions radius(double r1) {
            r0 = this;
            r0.radius = r1
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r1 = r0.updateFlags
            r2 = 1
            r1.isRadiusUpdated = r2
            r0.a()
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final void resetUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r0 = r1.updateFlags
            r0.reset()
            return
    }

    public final com.amap.api.maps.model.CircleOptions setStrokeDottedLineType(int r1) {
            r0 = this;
            r0.dottedLineType = r1
            return r0
    }

    public final com.amap.api.maps.model.CircleOptions strokeColor(int r1) {
            r0 = this;
            r0.strokeColor = r1
            return r0
    }

    public final com.amap.api.maps.model.CircleOptions strokeWidth(float r1) {
            r0 = this;
            r0.strokeWidth = r1
            return r0
    }

    public final com.amap.api.maps.model.CircleOptions usePolylineStroke(boolean r1) {
            r0 = this;
            r0.isUsePolylineStroke = r1
            return r0
    }

    public final com.amap.api.maps.model.CircleOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.amap.api.maps.model.LatLng r0 = r4.point
            if (r0 == 0) goto L19
            java.lang.String r1 = "lat"
            double r2 = r0.latitude
            r6.putDouble(r1, r2)
            com.amap.api.maps.model.LatLng r0 = r4.point
            double r0 = r0.longitude
            java.lang.String r2 = "lng"
            r6.putDouble(r2, r0)
        L19:
            r5.writeBundle(r6)
            double r0 = r4.radius
            r5.writeDouble(r0)
            float r6 = r4.strokeWidth
            r5.writeFloat(r6)
            int r6 = r4.strokeColor
            r5.writeInt(r6)
            int r6 = r4.fillColor
            r5.writeInt(r6)
            float r6 = r4.zIndex
            r5.writeFloat(r6)
            boolean r6 = r4.isVisible
            byte r6 = (byte) r6
            r5.writeByte(r6)
            java.lang.String r6 = r4.a
            r5.writeString(r6)
            java.util.List<com.amap.api.maps.model.BaseHoleOptions> r6 = r4.holeOptions
            r5.writeList(r6)
            int r6 = r4.dottedLineType
            r5.writeInt(r6)
            boolean r6 = r4.isUsePolylineStroke
            byte r6 = (byte) r6
            r5.writeByte(r6)
            return
    }

    public final com.amap.api.maps.model.CircleOptions zIndex(float r3) {
            r2 = this;
            float r0 = r2.zIndex
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lb
            com.amap.api.maps.model.CircleOptions$CircleUpdateFlags r0 = r2.updateFlags
            r1 = 1
            r0.zIndexUpdate = r1
        Lb:
            r2.zIndex = r3
            return r2
    }
}
