package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class TextOptions implements android.os.Parcelable, java.lang.Cloneable {
    public static final com.amap.api.maps.model.TextOptionsCreator CREATOR = null;
    java.lang.String a;
    private int alignX;
    private int alignY;
    private int backgroundColor;
    private int fontColor;
    private int fontSize;
    private boolean isVisible;
    private java.lang.Object object;
    private com.amap.api.maps.model.LatLng position;
    private float rotate;
    private java.lang.String text;
    private android.graphics.Typeface typeface;
    private float zIndex;

    static {
            com.amap.api.maps.model.TextOptionsCreator r0 = new com.amap.api.maps.model.TextOptionsCreator
            r0.<init>()
            com.amap.api.maps.model.TextOptions.CREATOR = r0
            return
    }

    public TextOptions() {
            r1 = this;
            r1.<init>()
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1.typeface = r0
            r0 = 4
            r1.alignX = r0
            r0 = 32
            r1.alignY = r0
            r0 = -1
            r1.backgroundColor = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.fontColor = r0
            r0 = 20
            r1.fontSize = r0
            r0 = 0
            r1.zIndex = r0
            r0 = 1
            r1.isVisible = r0
            return
    }

    public final com.amap.api.maps.model.TextOptions align(int r1, int r2) {
            r0 = this;
            r0.alignX = r1
            r0.alignY = r2
            return r0
    }

    public final com.amap.api.maps.model.TextOptions backgroundColor(int r1) {
            r0 = this;
            r0.backgroundColor = r1
            return r0
    }

    public final com.amap.api.maps.model.TextOptions clone() {
            r2 = this;
            super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3
        L3:
            com.amap.api.maps.model.TextOptions r0 = new com.amap.api.maps.model.TextOptions
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.a = r1
            com.amap.api.maps.model.LatLng r1 = r2.position
            r0.position = r1
            java.lang.String r1 = r2.text
            r0.text = r1
            android.graphics.Typeface r1 = r2.typeface
            r0.typeface = r1
            float r1 = r2.rotate
            r0.rotate = r1
            int r1 = r2.alignX
            r0.alignX = r1
            int r1 = r2.alignY
            r0.alignY = r1
            int r1 = r2.backgroundColor
            r0.backgroundColor = r1
            int r1 = r2.fontColor
            r0.fontColor = r1
            java.lang.Object r1 = r2.object
            r0.object = r1
            int r1 = r2.fontSize
            r0.fontSize = r1
            float r1 = r2.zIndex
            r0.zIndex = r1
            boolean r1 = r2.isVisible
            r0.isVisible = r1
            return r0
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ java.lang.Object m16clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.clone()
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.amap.api.maps.model.TextOptions fontColor(int r1) {
            r0 = this;
            r0.fontColor = r1
            return r0
    }

    public final com.amap.api.maps.model.TextOptions fontSize(int r1) {
            r0 = this;
            r0.fontSize = r1
            return r0
    }

    public final int getAlignX() {
            r1 = this;
            int r0 = r1.alignX
            return r0
    }

    public final int getAlignY() {
            r1 = this;
            int r0 = r1.alignY
            return r0
    }

    public final int getBackgroundColor() {
            r1 = this;
            int r0 = r1.backgroundColor
            return r0
    }

    public final int getFontColor() {
            r1 = this;
            int r0 = r1.fontColor
            return r0
    }

    public final int getFontSize() {
            r1 = this;
            int r0 = r1.fontSize
            return r0
    }

    public final java.lang.Object getObject() {
            r1 = this;
            java.lang.Object r0 = r1.object
            return r0
    }

    public final com.amap.api.maps.model.LatLng getPosition() {
            r1 = this;
            com.amap.api.maps.model.LatLng r0 = r1.position
            return r0
    }

    public final float getRotate() {
            r1 = this;
            float r0 = r1.rotate
            return r0
    }

    public final java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.text
            return r0
    }

    public final android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.typeface
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

    public final com.amap.api.maps.model.TextOptions position(com.amap.api.maps.model.LatLng r1) {
            r0 = this;
            r0.position = r1
            return r0
    }

    public final com.amap.api.maps.model.TextOptions rotate(float r1) {
            r0 = this;
            r0.rotate = r1
            return r0
    }

    public final com.amap.api.maps.model.TextOptions setObject(java.lang.Object r1) {
            r0 = this;
            r0.object = r1
            return r0
    }

    public final com.amap.api.maps.model.TextOptions text(java.lang.String r1) {
            r0 = this;
            r0.text = r1
            return r0
    }

    public final com.amap.api.maps.model.TextOptions typeface(android.graphics.Typeface r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.typeface = r1
        L4:
            return r0
    }

    public final com.amap.api.maps.model.TextOptions visible(boolean r1) {
            r0 = this;
            r0.isVisible = r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r6 = r4.a
            r5.writeString(r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.amap.api.maps.model.LatLng r0 = r4.position
            if (r0 == 0) goto L1e
            java.lang.String r1 = "lat"
            double r2 = r0.latitude
            r6.putDouble(r1, r2)
            com.amap.api.maps.model.LatLng r0 = r4.position
            double r0 = r0.longitude
            java.lang.String r2 = "lng"
            r6.putDouble(r2, r0)
        L1e:
            r5.writeBundle(r6)
            java.lang.String r6 = r4.text
            r5.writeString(r6)
            android.graphics.Typeface r6 = r4.typeface
            int r6 = r6.getStyle()
            r5.writeInt(r6)
            float r6 = r4.rotate
            r5.writeFloat(r6)
            int r6 = r4.alignX
            r5.writeInt(r6)
            int r6 = r4.alignY
            r5.writeInt(r6)
            int r6 = r4.backgroundColor
            r5.writeInt(r6)
            int r6 = r4.fontColor
            r5.writeInt(r6)
            int r6 = r4.fontSize
            r5.writeInt(r6)
            float r6 = r4.zIndex
            r5.writeFloat(r6)
            boolean r6 = r4.isVisible
            byte r6 = (byte) r6
            r5.writeByte(r6)
            java.lang.Object r6 = r4.object
            boolean r6 = r6 instanceof android.os.Parcelable
            if (r6 == 0) goto L6f
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.Object r0 = r4.object
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            java.lang.String r1 = "obj"
            r6.putParcelable(r1, r0)
            r5.writeBundle(r6)
        L6f:
            return
    }

    public final com.amap.api.maps.model.TextOptions zIndex(float r1) {
            r0 = this;
            r0.zIndex = r1
            return r0
    }
}
