package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class GroundOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private static final java.lang.String CLASSNAME = "GroundOverlayOptions";

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.GroundOverlayOptionsCreator CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final float NO_DIMENSION = -1.0f;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final double NF_PI;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final double R;
    private float anchorU;
    private float anchorV;
    private float bearing;
    private com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor;
    private float height;
    private boolean isVisible;
    private com.amap.api.maps.model.LatLng latLng;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private com.amap.api.maps.model.LatLngBounds latlngBounds;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private final int mVersionCode;
    private com.amap.api.maps.model.LatLng northeast;
    private com.amap.api.maps.model.LatLng southwest;
    private float transparency;
    private float width;
    private float zIndex;

    static {
            com.amap.api.maps.model.GroundOverlayOptionsCreator r0 = new com.amap.api.maps.model.GroundOverlayOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.GroundOverlayOptions.CREATOR = r0
            return
    }

    public GroundOverlayOptions() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.zIndex = r0
            r1 = 1
            r4.isVisible = r1
            r4.transparency = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.anchorU = r0
            r4.anchorV = r0
            r2 = 4580687790476533047(0x3f91df46a2529d37, double:0.01745329251994329)
            r4.NF_PI = r2
            r2 = 4708598820983757865(0x41584dae328f5c29, double:6371000.79)
            r4.R = r2
            r4.mVersionCode = r1
            java.lang.String r0 = "GroundOverlayOptions"
            r4.type = r0
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    GroundOverlayOptions(int r3, com.amap.api.maps.model.LatLng r4, float r5, float r6, com.amap.api.maps.model.LatLngBounds r7, float r8, float r9, boolean r10, float r11, float r12, float r13) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zIndex = r0
            r1 = 1
            r2.isVisible = r1
            r2.transparency = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.anchorU = r0
            r2.anchorV = r0
            r0 = 4580687790476533047(0x3f91df46a2529d37, double:0.01745329251994329)
            r2.NF_PI = r0
            r0 = 4708598820983757865(0x41584dae328f5c29, double:6371000.79)
            r2.R = r0
            r2.mVersionCode = r3
            r3 = 0
            com.amap.api.maps.model.BitmapDescriptor r3 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r3)
            r2.bitmapDescriptor = r3
            r2.latLng = r4
            r2.width = r5
            r2.height = r6
            r2.latlngBounds = r7
            r2.bearing = r8
            r2.zIndex = r9
            r2.isVisible = r10
            r2.transparency = r11
            r2.anchorU = r12
            r2.anchorV = r13
            com.amap.api.maps.model.LatLng r3 = r7.southwest
            r2.southwest = r3
            com.amap.api.maps.model.LatLng r3 = r7.northeast
            r2.northeast = r3
            java.lang.String r3 = "GroundOverlayOptions"
            r2.type = r3
            return
    }

    private com.amap.api.maps.model.GroundOverlayOptions a(com.amap.api.maps.model.LatLng r1, float r2, float r3) {
            r0 = this;
            r0.latLng = r1
            r0.width = r2
            r0.height = r3
            r0.b()
            return r0
    }

    private void a() {
            r12 = this;
            com.amap.api.maps.model.LatLng r0 = r12.southwest
            if (r0 == 0) goto L5d
            com.amap.api.maps.model.LatLng r0 = r12.northeast
            if (r0 != 0) goto L9
            goto L5d
        L9:
            com.amap.api.maps.model.LatLng r0 = new com.amap.api.maps.model.LatLng
            com.amap.api.maps.model.LatLng r1 = r12.southwest
            double r2 = r1.latitude
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r12.anchorV
            float r4 = r4 - r5
            double r4 = (double) r4
            com.amap.api.maps.model.LatLng r6 = r12.northeast
            double r7 = r6.latitude
            double r7 = r7 - r2
            double r4 = r4 * r7
            double r2 = r2 + r4
            double r4 = r1.longitude
            float r1 = r12.anchorU
            double r7 = (double) r1
            double r9 = r6.longitude
            double r9 = r9 - r4
            double r7 = r7 * r9
            double r4 = r4 + r7
            r0.<init>(r2, r4)
            r12.latLng = r0
            double r0 = r0.latitude
            r2 = 4580687790476533047(0x3f91df46a2529d37, double:0.01745329251994329)
            double r0 = r0 * r2
            double r0 = java.lang.Math.cos(r0)
            r4 = 4708598820983757865(0x41584dae328f5c29, double:6371000.79)
            double r0 = r0 * r4
            com.amap.api.maps.model.LatLng r6 = r12.northeast
            double r7 = r6.longitude
            com.amap.api.maps.model.LatLng r9 = r12.southwest
            double r10 = r9.longitude
            double r7 = r7 - r10
            double r0 = r0 * r7
            double r0 = r0 * r2
            float r0 = (float) r0
            r12.width = r0
            double r0 = r6.latitude
            double r6 = r9.latitude
            double r0 = r0 - r6
            double r0 = r0 * r4
            double r0 = r0 * r2
            float r0 = (float) r0
            r12.height = r0
        L5d:
            return
    }

    private void b() {
            r15 = this;
            com.amap.api.maps.model.LatLng r0 = r15.latLng
            if (r0 != 0) goto L5
            goto L6a
        L5:
            float r1 = r15.width
            double r1 = (double) r1
            double r3 = r0.latitude
            r5 = 4580687790476533047(0x3f91df46a2529d37, double:0.01745329251994329)
            double r3 = r3 * r5
            double r3 = java.lang.Math.cos(r3)
            r7 = 4708598820983757865(0x41584dae328f5c29, double:6371000.79)
            double r3 = r3 * r7
            double r3 = r3 * r5
            double r1 = r1 / r3
            float r0 = r15.height
            double r3 = (double) r0
            r5 = 4682377671332797918(0x40fb25af0c031dde, double:111194.94043265979)
            double r3 = r3 / r5
            com.amap.api.maps.model.LatLngBounds r0 = new com.amap.api.maps.model.LatLngBounds     // Catch: java.lang.Throwable -> L6a
            com.amap.api.maps.model.LatLng r5 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L6a
            com.amap.api.maps.model.LatLng r6 = r15.latLng     // Catch: java.lang.Throwable -> L6a
            double r7 = r6.latitude     // Catch: java.lang.Throwable -> L6a
            float r9 = r15.anchorV     // Catch: java.lang.Throwable -> L6a
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = r10 - r9
            double r11 = (double) r9     // Catch: java.lang.Throwable -> L6a
            double r11 = r11 * r3
            double r7 = r7 - r11
            double r11 = r6.longitude     // Catch: java.lang.Throwable -> L6a
            float r6 = r15.anchorU     // Catch: java.lang.Throwable -> L6a
            double r13 = (double) r6     // Catch: java.lang.Throwable -> L6a
            double r13 = r13 * r1
            double r11 = r11 - r13
            r5.<init>(r7, r11)     // Catch: java.lang.Throwable -> L6a
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L6a
            com.amap.api.maps.model.LatLng r7 = r15.latLng     // Catch: java.lang.Throwable -> L6a
            double r8 = r7.latitude     // Catch: java.lang.Throwable -> L6a
            float r11 = r15.anchorV     // Catch: java.lang.Throwable -> L6a
            double r11 = (double) r11     // Catch: java.lang.Throwable -> L6a
            double r11 = r11 * r3
            double r8 = r8 + r11
            double r3 = r7.longitude     // Catch: java.lang.Throwable -> L6a
            float r7 = r15.anchorU     // Catch: java.lang.Throwable -> L6a
            float r10 = r10 - r7
            double r10 = (double) r10     // Catch: java.lang.Throwable -> L6a
            double r10 = r10 * r1
            double r3 = r3 + r10
            r6.<init>(r8, r3)     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L6a
            r15.latlngBounds = r0     // Catch: java.lang.Throwable -> L6a
            com.amap.api.maps.model.LatLng r1 = r0.southwest     // Catch: java.lang.Throwable -> L6a
            r15.southwest = r1     // Catch: java.lang.Throwable -> L6a
            com.amap.api.maps.model.LatLng r0 = r0.northeast     // Catch: java.lang.Throwable -> L6a
            r15.northeast = r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            return
    }

    public final com.amap.api.maps.model.GroundOverlayOptions anchor(float r1, float r2) {
            r0 = this;
            r0.anchorU = r1
            r0.anchorV = r2
            com.amap.api.maps.model.LatLngBounds r1 = r0.latlngBounds
            if (r1 == 0) goto Lc
            r0.a()
            return r0
        Lc:
            com.amap.api.maps.model.LatLng r1 = r0.latLng
            if (r1 == 0) goto L13
            r0.b()
        L13:
            return r0
    }

    public final com.amap.api.maps.model.GroundOverlayOptions bearing(float r1) {
            r0 = this;
            r0.bearing = r1
            return r0
    }

    public final com.amap.api.maps.model.GroundOverlayOptions clone() {
            r2 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
        L3:
            com.amap.api.maps.model.GroundOverlayOptions r0 = new com.amap.api.maps.model.GroundOverlayOptions
            r0.<init>()
            com.amap.api.maps.model.BitmapDescriptor r1 = r2.bitmapDescriptor
            r0.bitmapDescriptor = r1
            com.amap.api.maps.model.LatLng r1 = r2.latLng
            r0.latLng = r1
            float r1 = r2.width
            r0.width = r1
            float r1 = r2.height
            r0.height = r1
            com.amap.api.maps.model.LatLngBounds r1 = r2.latlngBounds
            r0.latlngBounds = r1
            float r1 = r2.bearing
            r0.bearing = r1
            float r1 = r2.zIndex
            r0.zIndex = r1
            boolean r1 = r2.isVisible
            r0.isVisible = r1
            float r1 = r2.transparency
            r0.transparency = r1
            float r1 = r2.anchorU
            r0.anchorU = r1
            float r1 = r2.anchorV
            r0.anchorV = r1
            com.amap.api.maps.model.LatLng r1 = r2.southwest
            r0.southwest = r1
            com.amap.api.maps.model.LatLng r1 = r2.northeast
            r0.northeast = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m10clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.GroundOverlayOptions r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
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

    public final float getBearing() {
            r1 = this;
            float r0 = r1.bearing
            return r0
    }

    public final com.amap.api.maps.model.LatLngBounds getBounds() {
            r1 = this;
            com.amap.api.maps.model.LatLngBounds r0 = r1.latlngBounds
            return r0
    }

    public final float getHeight() {
            r1 = this;
            float r0 = r1.height
            return r0
    }

    public final com.amap.api.maps.model.BitmapDescriptor getImage() {
            r1 = this;
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.bitmapDescriptor
            return r0
    }

    public final com.amap.api.maps.model.LatLng getLocation() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.latLng
            return r0
    }

    public final float getTransparency() {
            r1 = this;
            float r0 = r1.transparency
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

    public final com.amap.api.maps.model.GroundOverlayOptions image(com.amap.api.maps.model.BitmapDescriptor r1) {
            r0 = this;
            r0.bitmapDescriptor = r1
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public final com.amap.api.maps.model.GroundOverlayOptions position(com.amap.api.maps.model.LatLng r1, float r2) {
            r0 = this;
            com.amap.api.maps.model.GroundOverlayOptions r1 = r0.a(r1, r2, r2)
            return r1
    }

    public final com.amap.api.maps.model.GroundOverlayOptions position(com.amap.api.maps.model.LatLng r3, float r4, float r5) {
            r2 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L7
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
        L7:
            com.amap.api.maps.model.GroundOverlayOptions r3 = r2.a(r3, r4, r5)
            return r3
    }

    public final com.amap.api.maps.model.GroundOverlayOptions positionFromBounds(com.amap.api.maps.model.LatLngBounds r2) {
            r1 = this;
            r1.latlngBounds = r2
            com.amap.api.maps.model.LatLng r0 = r2.southwest
            r1.southwest = r0
            com.amap.api.maps.model.LatLng r2 = r2.northeast
            r1.northeast = r2
            r1.a()
            return r1
    }

    public final com.amap.api.maps.model.GroundOverlayOptions transparency(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r3 = 0
        L6:
            r2.transparency = r3
            return r2
    }

    public final com.amap.api.maps.model.GroundOverlayOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r0 = r1.mVersionCode
            r2.writeInt(r0)
            com.amap.api.maps.model.BitmapDescriptor r0 = r1.bitmapDescriptor
            r2.writeParcelable(r0, r3)
            com.amap.api.maps.model.LatLng r0 = r1.latLng
            r2.writeParcelable(r0, r3)
            float r0 = r1.width
            r2.writeFloat(r0)
            float r0 = r1.height
            r2.writeFloat(r0)
            com.amap.api.maps.model.LatLngBounds r0 = r1.latlngBounds
            r2.writeParcelable(r0, r3)
            float r3 = r1.bearing
            r2.writeFloat(r3)
            float r3 = r1.zIndex
            r2.writeFloat(r3)
            boolean r3 = r1.isVisible
            byte r3 = (byte) r3
            r2.writeByte(r3)
            float r3 = r1.transparency
            r2.writeFloat(r3)
            float r3 = r1.anchorU
            r2.writeFloat(r3)
            float r3 = r1.anchorV
            r2.writeFloat(r3)
            return
    }

    public final com.amap.api.maps.model.GroundOverlayOptions zIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }
}
