package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ArcOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public static final com.amap.api.maps.model.ArcOptionsCreator CREATOR = null;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    java.lang.String a;
    private com.amap.api.maps.model.LatLng endpoint;
    private boolean isVisible;
    private com.amap.api.maps.model.LatLng passedpoint;
    private com.amap.api.maps.model.LatLng startpoint;
    private int strokeColor;
    private float strokeWidth;
    private float zIndex;

    static {
            com.amap.api.maps.model.ArcOptionsCreator r0 = new com.amap.api.maps.model.ArcOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.ArcOptions.CREATOR = r0
            return
    }

    public ArcOptions() {
            r1 = this;
            r1.<init>()
            r0 = 1092616192(0x41200000, float:10.0)
            r1.strokeWidth = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.strokeColor = r0
            r0 = 0
            r1.zIndex = r0
            r0 = 1
            r1.isVisible = r0
            java.lang.String r0 = "ArcOptions"
            r1.type = r0
            return
    }

    public final com.amap.api.maps.model.ArcOptions clone() {
            r2 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
        L3:
            com.amap.api.maps.model.ArcOptions r0 = new com.amap.api.maps.model.ArcOptions
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.a = r1
            com.amap.api.maps.model.LatLng r1 = r2.startpoint
            r0.startpoint = r1
            com.amap.api.maps.model.LatLng r1 = r2.passedpoint
            r0.passedpoint = r1
            com.amap.api.maps.model.LatLng r1 = r2.endpoint
            r0.endpoint = r1
            float r1 = r2.strokeWidth
            r0.strokeWidth = r1
            int r1 = r2.strokeColor
            r0.strokeColor = r1
            float r1 = r2.zIndex
            r0.zIndex = r1
            boolean r1 = r2.isVisible
            r0.isVisible = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m6clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.ArcOptions r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    @com.autonavi.base.amap.mapcore.jbinding.JBinding2cFieldOrMethod
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.LatLng getEnd() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.endpoint
            return r0
    }

    public final com.amap.api.maps.model.LatLng getPassed() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.passedpoint
            return r0
    }

    public final com.amap.api.maps.model.LatLng getStart() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.startpoint
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

    public final float getZIndex() {
            r1 = this;
            float r0 = r1.zIndex
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isVisible
            return r0
    }

    public final com.amap.api.maps.model.ArcOptions point(com.amap.api.maps.model.LatLng r1, com.amap.api.maps.model.LatLng r2, com.amap.api.maps.model.LatLng r3) {
            r0 = this;
            r0.startpoint = r1
            r0.passedpoint = r2
            r0.endpoint = r3
            return r0
    }

    public final com.amap.api.maps.model.ArcOptions strokeColor(int r1) {
            r0 = this;
            r0.strokeColor = r1
            return r0
    }

    public final com.amap.api.maps.model.ArcOptions strokeWidth(float r1) {
            r0 = this;
            r0.strokeWidth = r1
            return r0
    }

    public final com.amap.api.maps.model.ArcOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    @Override // android.os.Parcelable
    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.amap.api.maps.model.LatLng r0 = r4.startpoint
            if (r0 == 0) goto L19
            java.lang.String r1 = "startlat"
            double r2 = r0.latitude
            r6.putDouble(r1, r2)
            com.amap.api.maps.model.LatLng r0 = r4.startpoint
            double r0 = r0.longitude
            java.lang.String r2 = "startlng"
            r6.putDouble(r2, r0)
        L19:
            com.amap.api.maps.model.LatLng r0 = r4.passedpoint
            if (r0 == 0) goto L2d
            java.lang.String r1 = "passedlat"
            double r2 = r0.latitude
            r6.putDouble(r1, r2)
            com.amap.api.maps.model.LatLng r0 = r4.passedpoint
            double r0 = r0.longitude
            java.lang.String r2 = "passedlng"
            r6.putDouble(r2, r0)
        L2d:
            com.amap.api.maps.model.LatLng r0 = r4.endpoint
            if (r0 == 0) goto L41
            java.lang.String r1 = "endlat"
            double r2 = r0.latitude
            r6.putDouble(r1, r2)
            com.amap.api.maps.model.LatLng r0 = r4.endpoint
            double r0 = r0.longitude
            java.lang.String r2 = "endlng"
            r6.putDouble(r2, r0)
        L41:
            r5.writeBundle(r6)
            float r6 = r4.strokeWidth
            r5.writeFloat(r6)
            int r6 = r4.strokeColor
            r5.writeInt(r6)
            float r6 = r4.zIndex
            r5.writeFloat(r6)
            boolean r6 = r4.isVisible
            byte r6 = (byte) r6
            r5.writeByte(r6)
            java.lang.String r6 = r4.a
            r5.writeString(r6)
            return
    }

    public final com.amap.api.maps.model.ArcOptions zIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }
}
