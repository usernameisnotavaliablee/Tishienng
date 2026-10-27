package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ee extends android.widget.LinearLayout {
    android.graphics.Bitmap a;

    /* renamed from: b, reason: collision with root package name */
    android.graphics.Bitmap f3197b;

    /* renamed from: c, reason: collision with root package name */
    android.graphics.Bitmap f3198c;

    /* renamed from: d, reason: collision with root package name */
    android.widget.ImageView f3199d;

    /* renamed from: e, reason: collision with root package name */
    com.autonavi.base.amap.api.mapcore.IAMapDelegate f3200e;

    /* renamed from: f, reason: collision with root package name */
    android.graphics.Matrix f3201f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.view.View.OnTouchListener {
        final /* synthetic */ com.amap.api.col.p0003l.ee a;

        a(com.amap.api.col.p0003l.ee r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
                r4 = this;
                r5 = 0
                com.amap.api.col.3l.ee r0 = r4.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.f3200e     // Catch: java.lang.Throwable -> L1c
                boolean r0 = r0.isMaploaded()     // Catch: java.lang.Throwable -> L1c
                if (r0 != 0) goto Lc
                return r5
            Lc:
                int r0 = r6.getAction()     // Catch: java.lang.Throwable -> L1c
                if (r0 != 0) goto L1e
                com.amap.api.col.3l.ee r6 = r4.a     // Catch: java.lang.Throwable -> L1c
                android.widget.ImageView r0 = r6.f3199d     // Catch: java.lang.Throwable -> L1c
                android.graphics.Bitmap r6 = r6.f3197b     // Catch: java.lang.Throwable -> L1c
                r0.setImageBitmap(r6)     // Catch: java.lang.Throwable -> L1c
                goto L53
            L1c:
                r6 = move-exception
                goto L4c
            L1e:
                int r6 = r6.getAction()     // Catch: java.lang.Throwable -> L1c
                r0 = 1
                if (r6 != r0) goto L53
                com.amap.api.col.3l.ee r6 = r4.a     // Catch: java.lang.Throwable -> L1c
                android.widget.ImageView r0 = r6.f3199d     // Catch: java.lang.Throwable -> L1c
                android.graphics.Bitmap r6 = r6.a     // Catch: java.lang.Throwable -> L1c
                r0.setImageBitmap(r6)     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.ee r6 = r4.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r6.f3200e     // Catch: java.lang.Throwable -> L1c
                com.amap.api.maps.model.CameraPosition r6 = r6.getCameraPosition()     // Catch: java.lang.Throwable -> L1c
                com.amap.api.col.3l.ee r0 = r4.a     // Catch: java.lang.Throwable -> L1c
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r0.f3200e     // Catch: java.lang.Throwable -> L1c
                com.amap.api.maps.model.CameraPosition r1 = new com.amap.api.maps.model.CameraPosition     // Catch: java.lang.Throwable -> L1c
                com.amap.api.maps.model.LatLng r2 = r6.target     // Catch: java.lang.Throwable -> L1c
                float r6 = r6.zoom     // Catch: java.lang.Throwable -> L1c
                r3 = 0
                r1.<init>(r2, r6, r3, r3)     // Catch: java.lang.Throwable -> L1c
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r6 = com.amap.api.col.p0003l.p.f(r1)     // Catch: java.lang.Throwable -> L1c
                r0.animateCamera(r6)     // Catch: java.lang.Throwable -> L1c
                goto L53
            L4c:
                java.lang.String r0 = "CompassView"
                java.lang.String r1 = "onTouch"
                com.amap.api.col.p0003l.w5.p(r6, r0, r1)
            L53:
                return r5
        }
    }

    public ee(android.content.Context r8, com.autonavi.base.amap.api.mapcore.IAMapDelegate r9) {
            r7 = this;
            r7.<init>(r8)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.f3201f = r0
            r7.f3200e = r9
            java.lang.String r9 = "maps_dav_compass_needle_large.png"
            android.graphics.Bitmap r9 = com.amap.api.col.p0003l.b3.l(r8, r9)     // Catch: java.lang.Throwable -> Lac
            r7.f3198c = r9     // Catch: java.lang.Throwable -> Lac
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Lac
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r0 = r0 * r1
            android.graphics.Bitmap r9 = com.amap.api.col.p0003l.b3.m(r9, r0)     // Catch: java.lang.Throwable -> Lac
            r7.f3197b = r9     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r9 = r7.f3198c     // Catch: java.lang.Throwable -> Lac
            float r0 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> Lac
            r1 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r1
            android.graphics.Bitmap r9 = com.amap.api.col.p0003l.b3.m(r9, r0)     // Catch: java.lang.Throwable -> Lac
            r7.f3198c = r9     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r0 = r7.f3197b     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lae
            if (r9 != 0) goto L37
            goto Lae
        L37:
            int r9 = r0.getWidth()     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r0 = r7.f3197b     // Catch: java.lang.Throwable -> Lac
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r0, r1)     // Catch: java.lang.Throwable -> Lac
            r7.a = r9     // Catch: java.lang.Throwable -> Lac
            android.graphics.Canvas r9 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r0 = r7.a     // Catch: java.lang.Throwable -> Lac
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lac
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch: java.lang.Throwable -> Lac
            r0.<init>()     // Catch: java.lang.Throwable -> Lac
            r1 = 1
            r0.setAntiAlias(r1)     // Catch: java.lang.Throwable -> Lac
            r0.setFilterBitmap(r1)     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r2 = r7.f3198c     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r3 = r7.f3197b     // Catch: java.lang.Throwable -> Lac
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r4 = r7.f3198c     // Catch: java.lang.Throwable -> Lac
            int r4 = r4.getWidth()     // Catch: java.lang.Throwable -> Lac
            int r3 = r3 - r4
            float r3 = (float) r3     // Catch: java.lang.Throwable -> Lac
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            android.graphics.Bitmap r5 = r7.f3197b     // Catch: java.lang.Throwable -> Lac
            int r5 = r5.getHeight()     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r6 = r7.f3198c     // Catch: java.lang.Throwable -> Lac
            int r6 = r6.getHeight()     // Catch: java.lang.Throwable -> Lac
            int r5 = r5 - r6
            float r5 = (float) r5     // Catch: java.lang.Throwable -> Lac
            float r5 = r5 / r4
            r9.drawBitmap(r2, r3, r5, r0)     // Catch: java.lang.Throwable -> Lac
            android.widget.ImageView r9 = new android.widget.ImageView     // Catch: java.lang.Throwable -> Lac
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lac
            r7.f3199d = r9     // Catch: java.lang.Throwable -> Lac
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.MATRIX     // Catch: java.lang.Throwable -> Lac
            r9.setScaleType(r8)     // Catch: java.lang.Throwable -> Lac
            android.widget.ImageView r8 = r7.f3199d     // Catch: java.lang.Throwable -> Lac
            android.graphics.Bitmap r9 = r7.a     // Catch: java.lang.Throwable -> Lac
            r8.setImageBitmap(r9)     // Catch: java.lang.Throwable -> Lac
            android.widget.ImageView r8 = r7.f3199d     // Catch: java.lang.Throwable -> Lac
            r8.setClickable(r1)     // Catch: java.lang.Throwable -> Lac
            r7.c()     // Catch: java.lang.Throwable -> Lac
            android.widget.ImageView r8 = r7.f3199d     // Catch: java.lang.Throwable -> Lac
            com.amap.api.col.3l.ee$a r9 = new com.amap.api.col.3l.ee$a     // Catch: java.lang.Throwable -> Lac
            r9.<init>(r7)     // Catch: java.lang.Throwable -> Lac
            r8.setOnTouchListener(r9)     // Catch: java.lang.Throwable -> Lac
            android.widget.ImageView r8 = r7.f3199d     // Catch: java.lang.Throwable -> Lac
            r7.addView(r8)     // Catch: java.lang.Throwable -> Lac
            return
        Lac:
            r8 = move-exception
            goto Laf
        Lae:
            return
        Laf:
            java.lang.String r9 = "CompassView"
            java.lang.String r0 = "create"
            com.amap.api.col.p0003l.w5.p(r8, r9, r0)
            return
    }

    public final void a() {
            r3 = this;
            r3.removeAllViews()     // Catch: java.lang.Throwable -> Lb
            android.graphics.Bitmap r0 = r3.a     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L2c
        Ld:
            android.graphics.Bitmap r0 = r3.f3197b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
        L14:
            android.graphics.Bitmap r0 = r3.f3198c     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L1b
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
        L1b:
            android.graphics.Matrix r0 = r3.f3201f     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            if (r0 == 0) goto L25
            r0.reset()     // Catch: java.lang.Throwable -> Lb
            r3.f3201f = r1     // Catch: java.lang.Throwable -> Lb
        L25:
            r3.f3198c = r1     // Catch: java.lang.Throwable -> Lb
            r3.a = r1     // Catch: java.lang.Throwable -> Lb
            r3.f3197b = r1     // Catch: java.lang.Throwable -> Lb
            return
        L2c:
            java.lang.String r1 = "CompassView"
            java.lang.String r2 = "destroy"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    public final void b(boolean r1) {
            r0 = this;
            if (r1 == 0) goto La
            r1 = 0
            r0.setVisibility(r1)
            r0.c()
            return
        La:
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    public final void c() {
            r7 = this;
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r7.f3200e     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto La3
            android.widget.ImageView r1 = r7.f3199d     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto La3
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1d
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r0 = r7.f3200e     // Catch: java.lang.Throwable -> L1a
            com.autonavi.base.ae.gmap.GLMapEngine r0 = r0.getGLMapEngine()     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            int r0 = r0.getEngineIDWithType(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r0 = move-exception
            goto La4
        L1d:
            r0 = 0
        L1e:
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r7.f3200e     // Catch: java.lang.Throwable -> L1a
            float r1 = r1.getCameraDegree(r0)     // Catch: java.lang.Throwable -> L1a
            com.autonavi.base.amap.api.mapcore.IAMapDelegate r2 = r7.f3200e     // Catch: java.lang.Throwable -> L1a
            float r0 = r2.getMapAngle(r0)     // Catch: java.lang.Throwable -> L1a
            android.graphics.Matrix r2 = r7.f3201f     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L35
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L1a
            r2.<init>()     // Catch: java.lang.Throwable -> L1a
            r7.f3201f = r2     // Catch: java.lang.Throwable -> L1a
        L35:
            android.graphics.Matrix r2 = r7.f3201f     // Catch: java.lang.Throwable -> L1a
            r2.reset()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Matrix r2 = r7.f3201f     // Catch: java.lang.Throwable -> L1a
            float r0 = -r0
            android.widget.ImageView r3 = r7.f3199d     // Catch: java.lang.Throwable -> L1a
            android.graphics.drawable.Drawable r3 = r3.getDrawable()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Rect r3 = r3.getBounds()     // Catch: java.lang.Throwable -> L1a
            int r3 = r3.width()     // Catch: java.lang.Throwable -> L1a
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L1a
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            android.widget.ImageView r5 = r7.f3199d     // Catch: java.lang.Throwable -> L1a
            android.graphics.drawable.Drawable r5 = r5.getDrawable()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Rect r5 = r5.getBounds()     // Catch: java.lang.Throwable -> L1a
            int r5 = r5.height()     // Catch: java.lang.Throwable -> L1a
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L1a
            float r5 = r5 / r4
            r2.postRotate(r0, r3, r5)     // Catch: java.lang.Throwable -> L1a
            android.graphics.Matrix r0 = r7.f3201f     // Catch: java.lang.Throwable -> L1a
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L1a
            r5 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r1 = r1 * r5
            r5 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r1 = r1 / r5
            double r1 = java.lang.Math.cos(r1)     // Catch: java.lang.Throwable -> L1a
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L1a
            android.widget.ImageView r2 = r7.f3199d     // Catch: java.lang.Throwable -> L1a
            android.graphics.drawable.Drawable r2 = r2.getDrawable()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Rect r2 = r2.getBounds()     // Catch: java.lang.Throwable -> L1a
            int r2 = r2.width()     // Catch: java.lang.Throwable -> L1a
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L1a
            float r2 = r2 / r4
            android.widget.ImageView r3 = r7.f3199d     // Catch: java.lang.Throwable -> L1a
            android.graphics.drawable.Drawable r3 = r3.getDrawable()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Rect r3 = r3.getBounds()     // Catch: java.lang.Throwable -> L1a
            int r3 = r3.height()     // Catch: java.lang.Throwable -> L1a
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L1a
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r4, r1, r2, r3)     // Catch: java.lang.Throwable -> L1a
            android.widget.ImageView r0 = r7.f3199d     // Catch: java.lang.Throwable -> L1a
            android.graphics.Matrix r1 = r7.f3201f     // Catch: java.lang.Throwable -> L1a
            r0.setImageMatrix(r1)     // Catch: java.lang.Throwable -> L1a
        La3:
            return
        La4:
            java.lang.String r1 = "CompassView"
            java.lang.String r2 = "invalidateAngle"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }
}
