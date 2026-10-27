package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CoordinateBean {
    private java.lang.String bottom;
    private java.lang.String color;
    private java.lang.String fontOrCorner;
    private java.lang.String height;
    private java.lang.String left;
    private java.lang.String right;
    private java.lang.String scale;
    private java.lang.String top;
    private java.lang.String width;

    public CoordinateBean() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.beizi.fusion.model.CoordinateBean getCoordinate(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L49
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r2.split(r0)
            com.beizi.fusion.model.CoordinateBean r0 = new com.beizi.fusion.model.CoordinateBean
            r0.<init>()
            r1 = 0
            r1 = r2[r1]
            r0.setLeft(r1)
            r1 = 1
            r1 = r2[r1]
            r0.setTop(r1)
            r1 = 2
            r1 = r2[r1]
            r0.setRight(r1)
            r1 = 3
            r1 = r2[r1]
            r0.setBottom(r1)
            r1 = 4
            r1 = r2[r1]
            r0.setWidth(r1)
            r1 = 5
            r1 = r2[r1]
            r0.setHeight(r1)
            r1 = 6
            r1 = r2[r1]
            r0.setScale(r1)
            r1 = 7
            r1 = r2[r1]
            r0.setFontOrCorner(r1)
            r1 = 8
            r2 = r2[r1]
            r0.setColor(r2)
            return r0
        L49:
            r2 = 0
            return r2
    }

    public java.lang.String getBottom() {
            r1 = this;
            java.lang.String r0 = r1.bottom
            return r0
    }

    public java.lang.String getColor() {
            r1 = this;
            java.lang.String r0 = r1.color
            return r0
    }

    public java.lang.String getFontOrCorner() {
            r1 = this;
            java.lang.String r0 = r1.fontOrCorner
            return r0
    }

    public java.lang.String getHeight() {
            r1 = this;
            java.lang.String r0 = r1.height
            return r0
    }

    public java.lang.String getLeft() {
            r1 = this;
            java.lang.String r0 = r1.left
            return r0
    }

    public java.lang.String getRight() {
            r1 = this;
            java.lang.String r0 = r1.right
            return r0
    }

    public java.lang.String getScale() {
            r1 = this;
            java.lang.String r0 = r1.scale
            return r0
    }

    public java.lang.String getTop() {
            r1 = this;
            java.lang.String r0 = r1.top
            return r0
    }

    public java.lang.String getWidth() {
            r1 = this;
            java.lang.String r0 = r1.width
            return r0
    }

    public void setBottom(java.lang.String r1) {
            r0 = this;
            r0.bottom = r1
            return
    }

    public void setColor(java.lang.String r1) {
            r0 = this;
            r0.color = r1
            return
    }

    public void setFontOrCorner(java.lang.String r1) {
            r0 = this;
            r0.fontOrCorner = r1
            return
    }

    public void setHeight(java.lang.String r1) {
            r0 = this;
            r0.height = r1
            return
    }

    public void setLeft(java.lang.String r1) {
            r0 = this;
            r0.left = r1
            return
    }

    public void setRight(java.lang.String r1) {
            r0 = this;
            r0.right = r1
            return
    }

    public void setScale(java.lang.String r1) {
            r0 = this;
            r0.scale = r1
            return
    }

    public void setTop(java.lang.String r1) {
            r0 = this;
            r0.top = r1
            return
    }

    public void setWidth(java.lang.String r1) {
            r0 = this;
            r0.width = r1
            return
    }
}
