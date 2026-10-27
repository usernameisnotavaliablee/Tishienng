package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class t1 {
    private static android.graphics.Paint a;

    /* renamed from: b, reason: collision with root package name */
    private static android.graphics.Rect f3980b;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            com.amap.api.col.p0003l.t1.a = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.amap.api.col.p0003l.t1.f3980b = r0
            return
    }

    public t1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static float a(int r3, boolean r4) {
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L10
            r4 = 1
            if (r3 == r4) goto Lf
            r4 = 2
            if (r3 == r4) goto Le
            return r2
        Le:
            return r1
        Lf:
            return r0
        L10:
            r4 = 8
            if (r3 == r4) goto L1a
            r4 = 16
            if (r3 == r4) goto L19
            return r2
        L19:
            return r1
        L1a:
            return r0
    }

    public static com.amap.api.maps.model.MarkerOptions b(com.amap.api.maps.model.TextOptions r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.amap.api.maps.model.MarkerOptions r0 = new com.amap.api.maps.model.MarkerOptions
            r0.<init>()
            com.amap.api.maps.model.LatLng r1 = r3.getPosition()
            r0.position(r1)
            boolean r1 = r3.isVisible()
            r0.visible(r1)
            float r1 = r3.getZIndex()
            r0.zIndex(r1)
            float r1 = r3.getRotate()
            r0.rotateAngle(r1)
            com.amap.api.maps.model.BitmapDescriptor r1 = c(r3)
            r0.icon(r1)
            int r1 = r3.getAlignX()
            r2 = 1
            float r1 = a(r1, r2)
            int r3 = r3.getAlignY()
            r2 = 0
            float r3 = a(r3, r2)
            r0.anchor(r1, r3)
            return r0
    }

    public static com.amap.api.maps.model.BitmapDescriptor c(com.amap.api.maps.model.TextOptions r7) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            android.graphics.Typeface r1 = r7.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            r1 = 1
            r0.setSubpixelText(r1)
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            r1 = 1084227584(0x40a00000, float:5.0)
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            int r1 = r7.getFontSize()
            float r1 = (float) r1
            r0.setTextSize(r1)
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            int r1 = r7.getFontColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = com.amap.api.col.p0003l.t1.a
            android.graphics.Paint$FontMetrics r0 = r0.getFontMetrics()
            float r1 = r0.descent
            float r2 = r0.ascent
            float r1 = r1 - r2
            int r1 = (int) r1
            float r2 = (float) r1
            float r3 = r0.bottom
            float r2 = r2 - r3
            float r0 = r0.top
            float r2 = r2 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            int r0 = (int) r2
            java.lang.String r2 = r7.getText()
            if (r2 == 0) goto L71
            android.graphics.Paint r2 = com.amap.api.col.p0003l.t1.a
            java.lang.String r3 = r7.getText()
            java.lang.String r4 = r7.getText()
            int r4 = r4.length()
            android.graphics.Rect r5 = com.amap.api.col.p0003l.t1.f3980b
            r6 = 0
            r2.getTextBounds(r3, r6, r4, r5)
        L71:
            android.graphics.Rect r2 = com.amap.api.col.p0003l.t1.f3980b
            int r2 = r2.width()
            int r2 = r2 + 6
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            int r3 = r7.getBackgroundColor()
            r2.drawColor(r3)
            java.lang.String r3 = r7.getText()
            if (r3 == 0) goto La4
            java.lang.String r7 = r7.getText()
            android.graphics.Rect r3 = com.amap.api.col.p0003l.t1.f3980b
            int r3 = r3.centerX()
            int r3 = r3 + 3
            float r3 = (float) r3
            float r0 = (float) r0
            android.graphics.Paint r4 = com.amap.api.col.p0003l.t1.a
            r2.drawText(r7, r3, r0, r4)
        La4:
            com.amap.api.maps.model.BitmapDescriptor r7 = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(r1)
            return r7
    }
}
