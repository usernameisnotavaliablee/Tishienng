package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class MarkerOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.MarkerOptionsCreator CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    java.lang.String a;
    private float alpha;
    private float altitude;
    private float anchorU;
    private float anchorV;
    private float angleOffset;
    private boolean autoOverturn;
    private java.util.List<com.amap.api.maps.model.BitmapDescriptor> bitmapDescriptors;
    private int dispLevel;
    private com.amap.api.maps.model.LatLng gpsLatLng;
    private boolean infoWindowEnabled;
    private boolean isBelowMaskLayer;
    private boolean isDraggable;
    private boolean isFlat;
    private boolean isGps;
    private boolean isRotatingMode;
    private boolean isViewMode;
    private boolean isVisible;
    private com.amap.api.maps.model.LatLng latLng;
    private int offsetX;
    private int offsetY;
    private int period;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private boolean perspective;
    private float rotate;
    private int screenX;
    private int screenY;
    private java.lang.String snippet;
    private java.lang.String title;
    private com.amap.api.maps.model.MarkerOptions.MarkerUpdateFlags updateFlags;
    private float zIndex;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    protected static class MarkerUpdateFlags extends com.amap.api.maps.model.BaseOptions.BaseUpdateFlags {
        protected boolean bitmapDescriptorsUpdate;
        protected boolean gpsLatLngUpdate;
        protected boolean latlngUpdate;

        protected MarkerUpdateFlags() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.latlngUpdate = r0
                r1.gpsLatLngUpdate = r0
                r1.bitmapDescriptorsUpdate = r0
                return
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
                r1 = this;
                super.reset()
                r0 = 0
                r1.latlngUpdate = r0
                r1.gpsLatLngUpdate = r0
                r1.bitmapDescriptorsUpdate = r0
                return
        }
    }

    static {
            com.amap.api.maps.model.MarkerOptionsCreator r0 = new com.amap.api.maps.model.MarkerOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.MarkerOptions.CREATOR = r0
            return
    }

    public MarkerOptions() {
            r5 = this;
            r5.<init>()
            r0 = 1056964608(0x3f000000, float:0.5)
            r5.anchorU = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.anchorV = r0
            r1 = 0
            r5.zIndex = r1
            r2 = 0
            r5.isDraggable = r2
            r3 = 1
            r5.isVisible = r3
            r5.altitude = r1
            r5.perspective = r2
            r5.offsetX = r2
            r5.offsetY = r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.bitmapDescriptors = r4
            r4 = 20
            r5.period = r4
            r5.isGps = r2
            r5.isFlat = r2
            r5.isRotatingMode = r2
            r5.angleOffset = r1
            r5.isViewMode = r2
            r5.alpha = r0
            r5.autoOverturn = r2
            r5.infoWindowEnabled = r3
            r0 = 5
            r5.dispLevel = r0
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r0 = new com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags
            r0.<init>()
            r5.updateFlags = r0
            java.lang.String r0 = "MarkerOptions"
            r5.type = r0
            return
    }

    private void a() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r1.bitmapDescriptors
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            r1.bitmapDescriptors = r0     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    private void b() {
            r7 = this;
            boolean r0 = r7.isGps     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L21
            com.amap.api.maps.model.LatLng r0 = r7.latLng     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L21
            double r1 = r0.longitude     // Catch: java.lang.Throwable -> L21
            double r3 = r0.latitude     // Catch: java.lang.Throwable -> L21
            double[] r0 = com.autonavi.util.a.a(r1, r3)     // Catch: java.lang.Throwable -> L21
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L21
            r2 = 1
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L21
            r5 = 0
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L21
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L21
            r7.gpsLatLng = r1     // Catch: java.lang.Throwable -> L21
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r0 = r7.updateFlags     // Catch: java.lang.Throwable -> L21
            r0.gpsLatLngUpdate = r2     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    public final com.amap.api.maps.model.MarkerOptions alpha(float r1) {
            r0 = this;
            r0.alpha = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions altitude(float r1) {
            r0 = this;
            r0.altitude = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions anchor(float r1, float r2) {
            r0 = this;
            r0.anchorU = r1
            r0.anchorV = r2
            return r0
    }

    protected final com.amap.api.maps.model.MarkerOptions angleOffset(float r1) {
            r0 = this;
            r0.angleOffset = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions autoOverturnInfoWindow(boolean r1) {
            r0 = this;
            r0.autoOverturn = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions belowMaskLayer(boolean r1) {
            r0 = this;
            r0.isBelowMaskLayer = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions clone() {
            r2 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
        L3:
            com.amap.api.maps.model.MarkerOptions r0 = new com.amap.api.maps.model.MarkerOptions
            r0.<init>()
            com.amap.api.maps.model.LatLng r1 = r2.latLng
            r0.latLng = r1
            com.amap.api.maps.model.LatLng r1 = r2.gpsLatLng
            r0.gpsLatLng = r1
            java.lang.String r1 = r2.title
            r0.title = r1
            java.lang.String r1 = r2.snippet
            r0.snippet = r1
            float r1 = r2.anchorU
            r0.anchorU = r1
            float r1 = r2.anchorV
            r0.anchorV = r1
            float r1 = r2.zIndex
            r0.zIndex = r1
            boolean r1 = r2.isDraggable
            r0.isDraggable = r1
            boolean r1 = r2.isVisible
            r0.isVisible = r1
            java.lang.String r1 = r2.a
            r0.a = r1
            boolean r1 = r2.perspective
            r0.perspective = r1
            int r1 = r2.offsetX
            r0.offsetX = r1
            int r1 = r2.offsetY
            r0.offsetY = r1
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r1 = r2.bitmapDescriptors
            r0.bitmapDescriptors = r1
            int r1 = r2.period
            r0.period = r1
            boolean r1 = r2.isGps
            r0.isGps = r1
            boolean r1 = r2.isFlat
            r0.isFlat = r1
            boolean r1 = r2.isRotatingMode
            r0.isRotatingMode = r1
            float r1 = r2.angleOffset
            r0.angleOffset = r1
            int r1 = r2.screenX
            r0.screenX = r1
            int r1 = r2.screenY
            r0.screenY = r1
            boolean r1 = r2.isViewMode
            r0.isViewMode = r1
            float r1 = r2.alpha
            r0.alpha = r1
            boolean r1 = r2.autoOverturn
            r0.autoOverturn = r1
            boolean r1 = r2.infoWindowEnabled
            r0.infoWindowEnabled = r1
            int r1 = r2.dispLevel
            r0.dispLevel = r1
            float r1 = r2.rotate
            r0.rotate = r1
            boolean r1 = r2.isBelowMaskLayer
            r0.isBelowMaskLayer = r1
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r1 = r2.updateFlags
            r0.updateFlags = r1
            float r1 = r2.altitude
            r0.altitude = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m12clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions displayLevel(int r1) {
            r0 = this;
            r0.dispLevel = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions draggable(boolean r1) {
            r0 = this;
            r0.isDraggable = r1
            return r0
    }

    public final float getAlpha() {
            r1 = this;
            float r0 = r1.alpha
            return r0
    }

    public final float getAltitude() {
            r1 = this;
            float r0 = r1.altitude
            return r0
    }

    public final float getAnchorU() {
            r1 = this;
            float r0 = r1.anchorU
            return r0
    }

    public final float getAnchorV() {
            r1 = this;
            float r0 = r1.anchorV
            return r0
    }

    public final float getAngleOffset() {
            r1 = this;
            float r0 = r1.angleOffset
            return r0
    }

    public final int getDisplayLevel() {
            r1 = this;
            int r0 = r1.dispLevel
            return r0
    }

    public final com.amap.api.maps.model.BitmapDescriptor getIcon() {
            r2 = this;
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r2.bitmapDescriptors
            if (r0 == 0) goto L14
            int r0 = r0.size()
            if (r0 == 0) goto L14
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r2.bitmapDescriptors
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.amap.api.maps.model.BitmapDescriptor r0 = (com.amap.api.maps.model.BitmapDescriptor) r0
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final java.util.ArrayList<com.amap.api.maps.model.BitmapDescriptor> getIcons() {
            r1 = this;
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r1.bitmapDescriptors
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            return r0
    }

    public final int getInfoWindowOffsetX() {
            r1 = this;
            int r0 = r1.offsetX
            return r0
    }

    public final int getInfoWindowOffsetY() {
            r1 = this;
            int r0 = r1.offsetY
            return r0
    }

    public final int getPeriod() {
            r1 = this;
            int r0 = r1.period
            return r0
    }

    public final com.amap.api.maps.model.LatLng getPosition() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.latLng
            return r0
    }

    public final float getRotateAngle() {
            r1 = this;
            float r0 = r1.rotate
            return r0
    }

    protected final int getScreenX() {
            r1 = this;
            int r0 = r1.screenX
            return r0
    }

    protected final int getScreenY() {
            r1 = this;
            int r0 = r1.screenY
            return r0
    }

    public final java.lang.String getSnippet() {
            r1 = this;
            java.lang.String r0 = r1.snippet
            return r0
    }

    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final /* bridge */ /* synthetic */ com.amap.api.maps.model.BaseOptions.BaseUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r0 = r1.getUpdateFlags()
            return r0
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final com.amap.api.maps.model.MarkerOptions.MarkerUpdateFlags getUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r0 = r1.updateFlags
            return r0
    }

    public final float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions icon(com.amap.api.maps.model.BitmapDescriptor r2) {
            r1 = this;
            r1.a()     // Catch: java.lang.Throwable -> L15
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r1.bitmapDescriptors     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r1.bitmapDescriptors     // Catch: java.lang.Throwable -> L15
            r0.add(r2)     // Catch: java.lang.Throwable -> L15
            r2 = 0
            r1.isRotatingMode = r2     // Catch: java.lang.Throwable -> L15
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r2 = r1.updateFlags     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r2.bitmapDescriptorsUpdate = r0     // Catch: java.lang.Throwable -> L15
        L15:
            return r1
    }

    public final com.amap.api.maps.model.MarkerOptions icons(java.util.ArrayList<com.amap.api.maps.model.BitmapDescriptor> r2) {
            r1 = this;
            if (r2 == 0) goto L12
            int r0 = r2.size()
            if (r0 <= 0) goto L12
            r1.bitmapDescriptors = r2
            r2 = 0
            r1.isRotatingMode = r2
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.bitmapDescriptorsUpdate = r0
        L12:
            return r1
    }

    public final com.amap.api.maps.model.MarkerOptions infoWindowEnable(boolean r1) {
            r0 = this;
            r0.infoWindowEnabled = r1
            return r0
    }

    public final boolean isBelowMaskLayer() {
            r1 = this;
            boolean r0 = r1.isBelowMaskLayer
            return r0
    }

    public final boolean isDraggable() {
            r1 = this;
            boolean r0 = r1.isDraggable
            return r0
    }

    public final boolean isFlat() {
            r1 = this;
            boolean r0 = r1.isFlat
            return r0
    }

    public final boolean isGps() {
            r1 = this;
            boolean r0 = r1.isGps
            return r0
    }

    public final boolean isInfoWindowAutoOverturn() {
            r1 = this;
            boolean r0 = r1.autoOverturn
            return r0
    }

    public final boolean isInfoWindowEnable() {
            r1 = this;
            boolean r0 = r1.infoWindowEnabled
            return r0
    }

    public final boolean isPerspective() {
            r1 = this;
            boolean r0 = r1.perspective
            return r0
    }

    public final boolean isRotatingMode() {
            r1 = this;
            boolean r0 = r1.isRotatingMode
            return r0
    }

    protected final boolean isViewMode() {
            r1 = this;
            boolean r0 = r1.isViewMode
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions period(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L6
            r1.period = r0
            return r1
        L6:
            r1.period = r2
            return r1
    }

    public final com.amap.api.maps.model.MarkerOptions perspective(boolean r1) {
            r0 = this;
            r0.perspective = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions position(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            r1.latLng = r2
            r2 = 0
            r1.isViewMode = r2
            r1.b()
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r2 = r1.updateFlags
            r0 = 1
            r2.latlngUpdate = r0
            return r1
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public final void resetUpdateFlags() {
            r1 = this;
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r0 = r1.updateFlags
            r0.reset()
            return
    }

    public final com.amap.api.maps.model.MarkerOptions rotateAngle(float r1) {
            r0 = this;
            r0.rotate = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions rotatingIcons(java.util.ArrayList<com.amap.api.maps.model.BitmapDescriptor> r2, float r3) {
            r1 = this;
            if (r2 == 0) goto L23
            int r0 = r2.size()
            if (r0 <= 0) goto L23
            r1.bitmapDescriptors = r2
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L12
            r1.angleOffset = r3
            goto L1c
        L12:
            int r2 = r2.size()
            float r2 = (float) r2
            r3 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 / r2
            r1.angleOffset = r3
        L1c:
            r2 = 1
            r1.isRotatingMode = r2
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r3 = r1.updateFlags
            r3.bitmapDescriptorsUpdate = r2
        L23:
            return r1
    }

    public final com.amap.api.maps.model.MarkerOptions setFlat(boolean r1) {
            r0 = this;
            r0.isFlat = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions setGps(boolean r1) {
            r0 = this;
            r0.isGps = r1
            r0.b()
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions setInfoWindowOffset(int r1, int r2) {
            r0 = this;
            r0.offsetX = r1
            r0.offsetY = r2
            return r0
    }

    protected final com.amap.api.maps.model.MarkerOptions setRotatingMode(boolean r1) {
            r0 = this;
            r0.isRotatingMode = r1
            return r0
    }

    protected final void setScreenPosition(int r1, int r2) {
            r0 = this;
            r0.screenX = r1
            r0.screenY = r2
            r1 = 1
            r0.isViewMode = r1
            return
    }

    public final com.amap.api.maps.model.MarkerOptions snippet(java.lang.String r1) {
            r0 = this;
            r0.snippet = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions title(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return r0
    }

    public final com.amap.api.maps.model.MarkerOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r11, int r12) {
            r10 = this;
            com.amap.api.maps.model.LatLng r0 = r10.latLng
            r11.writeParcelable(r0, r12)
            java.lang.String r0 = r10.title
            r11.writeString(r0)
            java.lang.String r0 = r10.snippet
            r11.writeString(r0)
            float r0 = r10.anchorU
            r11.writeFloat(r0)
            float r0 = r10.anchorV
            r11.writeFloat(r0)
            int r0 = r10.offsetX
            r11.writeInt(r0)
            int r0 = r10.offsetY
            r11.writeInt(r0)
            boolean r0 = r10.isVisible
            boolean r1 = r10.isDraggable
            boolean r2 = r10.isGps
            boolean r3 = r10.isFlat
            boolean r4 = r10.autoOverturn
            boolean r5 = r10.infoWindowEnabled
            boolean r6 = r10.isBelowMaskLayer
            boolean r7 = r10.isRotatingMode
            r8 = 8
            boolean[] r8 = new boolean[r8]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r5
            r0 = 6
            r8[r0] = r6
            r0 = 7
            r8[r0] = r7
            r11.writeBooleanArray(r8)
            java.lang.String r0 = r10.a
            r11.writeString(r0)
            int r0 = r10.period
            r11.writeInt(r0)
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r10.bitmapDescriptors
            r11.writeList(r0)
            float r0 = r10.zIndex
            r11.writeFloat(r0)
            float r0 = r10.alpha
            r11.writeFloat(r0)
            int r0 = r10.dispLevel
            r11.writeInt(r0)
            float r0 = r10.rotate
            r11.writeFloat(r0)
            float r0 = r10.angleOffset
            r11.writeFloat(r0)
            int r0 = r10.screenX
            r11.writeInt(r0)
            int r0 = r10.screenY
            r11.writeInt(r0)
            float r0 = r10.altitude
            r11.writeFloat(r0)
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r10.bitmapDescriptors
            if (r0 == 0) goto L9e
            int r0 = r0.size()
            if (r0 == 0) goto L9e
            java.util.List<com.amap.api.maps.model.BitmapDescriptor> r0 = r10.bitmapDescriptors
            java.lang.Object r0 = r0.get(r9)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r11.writeParcelable(r0, r12)
        L9e:
            return
    }

    public final com.amap.api.maps.model.MarkerOptions zIndex(float r3) {
            r2 = this;
            float r0 = r2.zIndex
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lb
            com.amap.api.maps.model.MarkerOptions$MarkerUpdateFlags r0 = r2.updateFlags
            r1 = 1
            r0.zIndexUpdate = r1
        Lb:
            r2.zIndex = r3
            return r2
    }
}
