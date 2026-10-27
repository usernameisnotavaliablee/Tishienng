package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Text {
    public static final int ALIGN_BOTTOM = 16;
    public static final int ALIGN_CENTER_HORIZONTAL = 4;
    public static final int ALIGN_CENTER_VERTICAL = 32;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_TOP = 8;
    private com.amap.api.maps.model.Marker marker;
    private com.amap.api.maps.model.TextOptions textOptions;

    public Text(com.amap.api.maps.model.Marker r1, com.amap.api.maps.model.TextOptions r2) {
            r0 = this;
            r0.<init>()
            r0.marker = r1
            r0.textOptions = r2
            return
    }

    private void a() {
            r2 = this;
            com.amap.api.maps.model.Marker r0 = r2.marker
            com.amap.api.maps.model.TextOptions r1 = r2.textOptions
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.col.p0003l.t1.c(r1)
            r0.setIcon(r1)
            return
    }

    public final void destroy() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker     // Catch: java.lang.Throwable -> L5
            r0.destroy()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.amap.api.maps.model.Text
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.amap.api.maps.model.Marker r0 = r2.marker     // Catch: java.lang.Throwable -> L11
            com.amap.api.maps.model.Text r3 = (com.amap.api.maps.model.Text) r3     // Catch: java.lang.Throwable -> L11
            com.amap.api.maps.model.Marker r3 = r3.marker     // Catch: java.lang.Throwable -> L11
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L11
            return r3
        L11:
            return r1
    }

    public final int getAlignX() {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getAlignX()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final int getAlignY() {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getAlignY()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final int getBackgroundColor() {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getBackgroundColor()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final int getFontColor() {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getFontColor()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final int getFontSize() {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L7
            int r0 = r0.getFontSize()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker     // Catch: java.lang.Throwable -> L7
            java.lang.String r0 = r0.getId()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final java.lang.Object getObject() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            java.lang.Object r0 = r0.getObject()
            return r0
    }

    public final com.amap.api.maps.model.LatLng getPosition() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker     // Catch: java.lang.Throwable -> L7
            com.amap.api.maps.model.LatLng r0 = r0.getPosition()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final float getRotate() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            float r0 = r0.getRotateAngle()
            return r0
    }

    public final java.lang.String getText() {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L7
            java.lang.String r0 = r0.getText()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final android.graphics.Typeface getTypeface() {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L7
            android.graphics.Typeface r0 = r0.getTypeface()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final float getZIndex() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            float r0 = r0.getZIndex()
            return r0
    }

    public final int hashCode() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker     // Catch: java.lang.Throwable -> L7
            boolean r0 = r0.isVisible()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final void remove() {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker     // Catch: java.lang.Throwable -> L5
            r0.remove()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setAlign(int r3, int r4) {
            r2 = this;
            com.amap.api.maps.model.TextOptions r0 = r2.textOptions     // Catch: java.lang.Throwable -> L23
            r0.align(r3, r4)     // Catch: java.lang.Throwable -> L23
            com.amap.api.maps.model.Marker r3 = r2.marker     // Catch: java.lang.Throwable -> L23
            com.amap.api.maps.model.TextOptions r4 = r2.textOptions     // Catch: java.lang.Throwable -> L23
            int r4 = r4.getAlignX()     // Catch: java.lang.Throwable -> L23
            r0 = 1
            float r4 = com.amap.api.col.p0003l.t1.a(r4, r0)     // Catch: java.lang.Throwable -> L23
            com.amap.api.maps.model.TextOptions r0 = r2.textOptions     // Catch: java.lang.Throwable -> L23
            int r0 = r0.getAlignY()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            float r0 = com.amap.api.col.p0003l.t1.a(r0, r1)     // Catch: java.lang.Throwable -> L23
            r3.setAnchor(r4, r0)     // Catch: java.lang.Throwable -> L23
            r2.a()     // Catch: java.lang.Throwable -> L23
        L23:
            return
    }

    public final void setBackgroundColor(int r2) {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L8
            r0.backgroundColor(r2)     // Catch: java.lang.Throwable -> L8
            r1.a()     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public final void setFontColor(int r2) {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L8
            r0.fontColor(r2)     // Catch: java.lang.Throwable -> L8
            r1.a()     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public final void setFontSize(int r2) {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L8
            r0.fontSize(r2)     // Catch: java.lang.Throwable -> L8
            r1.a()     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public final void setObject(java.lang.Object r2) {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            r0.setObject(r2)
            return
    }

    public final void setPosition(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker     // Catch: java.lang.Throwable -> L5
            r0.setPosition(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setRotate(float r2) {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker     // Catch: java.lang.Throwable -> L5
            r0.setRotateAngle(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setText(java.lang.String r2) {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L8
            r0.text(r2)     // Catch: java.lang.Throwable -> L8
            r1.a()     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    public final void setTypeface(android.graphics.Typeface r2) {
            r1 = this;
            com.amap.api.maps.model.TextOptions r0 = r1.textOptions     // Catch: java.lang.Throwable -> L5
            r0.typeface(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setVisible(boolean r2) {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker     // Catch: java.lang.Throwable -> L5
            r0.setVisible(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public final void setZIndex(float r2) {
            r1 = this;
            com.amap.api.maps.model.Marker r0 = r1.marker
            r0.setZIndex(r2)
            return
    }
}
