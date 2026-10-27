package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class eg extends android.widget.LinearLayout {
    android.graphics.Bitmap a;

    /* renamed from: b, reason: collision with root package name */
    android.graphics.Bitmap f3217b;

    /* renamed from: c, reason: collision with root package name */
    android.graphics.Bitmap f3218c;

    /* renamed from: d, reason: collision with root package name */
    android.graphics.Bitmap f3219d;

    /* renamed from: e, reason: collision with root package name */
    android.graphics.Bitmap f3220e;

    /* renamed from: f, reason: collision with root package name */
    android.graphics.Bitmap f3221f;

    /* renamed from: g, reason: collision with root package name */
    android.widget.ImageView f3222g;

    /* renamed from: h, reason: collision with root package name */
    com.autonavi.base.amap.api.mapcore.IAMapDelegate f3223h;

    /* renamed from: i, reason: collision with root package name */
    boolean f3224i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.view.View.OnTouchListener {
        final /* synthetic */ com.amap.api.col.p0003l.eg a;

        a(com.amap.api.col.p0003l.eg r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
                r5 = this;
                com.amap.api.col.3l.eg r6 = r5.a
                boolean r6 = r6.f3224i
                r0 = 0
                if (r6 != 0) goto L8
                return r0
            L8:
                int r6 = r7.getAction()
                if (r6 != 0) goto L18
                com.amap.api.col.3l.eg r6 = r5.a
                android.widget.ImageView r7 = r6.f3222g
                android.graphics.Bitmap r6 = r6.f3217b
                r7.setImageBitmap(r6)
                goto L66
            L18:
                int r6 = r7.getAction()
                r7 = 1
                if (r6 != r7) goto L66
                com.amap.api.col.3l.eg r6 = r5.a     // Catch: java.lang.Throwable -> L5e
                android.widget.ImageView r1 = r6.f3222g     // Catch: java.lang.Throwable -> L5e
                android.graphics.Bitmap r6 = r6.a     // Catch: java.lang.Throwable -> L5e
                r1.setImageBitmap(r6)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.eg r6 = r5.a     // Catch: java.lang.Throwable -> L5e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r6.f3223h     // Catch: java.lang.Throwable -> L5e
                r6.setMyLocationEnabled(r7)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.eg r6 = r5.a     // Catch: java.lang.Throwable -> L5e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r6.f3223h     // Catch: java.lang.Throwable -> L5e
                android.location.Location r6 = r6.getMyLocation()     // Catch: java.lang.Throwable -> L5e
                if (r6 != 0) goto L3a
                return r0
            L3a:
                com.amap.api.maps.model.LatLng r7 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L5e
                double r1 = r6.getLatitude()     // Catch: java.lang.Throwable -> L5e
                double r3 = r6.getLongitude()     // Catch: java.lang.Throwable -> L5e
                r7.<init>(r1, r3)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.eg r1 = r5.a     // Catch: java.lang.Throwable -> L5e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r1 = r1.f3223h     // Catch: java.lang.Throwable -> L5e
                r1.showMyLocationOverlay(r6)     // Catch: java.lang.Throwable -> L5e
                com.amap.api.col.3l.eg r6 = r5.a     // Catch: java.lang.Throwable -> L5e
                com.autonavi.base.amap.api.mapcore.IAMapDelegate r6 = r6.f3223h     // Catch: java.lang.Throwable -> L5e
                float r1 = r6.getZoomLevel()     // Catch: java.lang.Throwable -> L5e
                com.autonavi.amap.mapcore.AbstractCameraUpdateMessage r7 = com.amap.api.col.p0003l.p.h(r7, r1)     // Catch: java.lang.Throwable -> L5e
                r6.moveCamera(r7)     // Catch: java.lang.Throwable -> L5e
                goto L66
            L5e:
                r6 = move-exception
                java.lang.String r7 = "LocationView"
                java.lang.String r1 = "onTouch"
                com.amap.api.col.p0003l.w5.p(r6, r7, r1)
            L66:
                return r0
        }
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public eg(android.content.Context r3, com.autonavi.base.amap.api.mapcore.IAMapDelegate r4) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.f3224i = r0
            r2.f3223h = r4
            java.lang.String r4 = "location_selected.png"
            android.graphics.Bitmap r4 = com.amap.api.col.p0003l.b3.l(r3, r4)     // Catch: java.lang.Throwable -> L61
            r2.f3219d = r4     // Catch: java.lang.Throwable -> L61
            float r1 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> L61
            android.graphics.Bitmap r4 = com.amap.api.col.p0003l.b3.m(r4, r1)     // Catch: java.lang.Throwable -> L61
            r2.a = r4     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "location_pressed.png"
            android.graphics.Bitmap r4 = com.amap.api.col.p0003l.b3.l(r3, r4)     // Catch: java.lang.Throwable -> L61
            r2.f3220e = r4     // Catch: java.lang.Throwable -> L61
            float r1 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> L61
            android.graphics.Bitmap r4 = com.amap.api.col.p0003l.b3.m(r4, r1)     // Catch: java.lang.Throwable -> L61
            r2.f3217b = r4     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "location_unselected.png"
            android.graphics.Bitmap r4 = com.amap.api.col.p0003l.b3.l(r3, r4)     // Catch: java.lang.Throwable -> L61
            r2.f3221f = r4     // Catch: java.lang.Throwable -> L61
            float r1 = com.amap.api.col.p0003l.ha.a     // Catch: java.lang.Throwable -> L61
            android.graphics.Bitmap r4 = com.amap.api.col.p0003l.b3.m(r4, r1)     // Catch: java.lang.Throwable -> L61
            r2.f3218c = r4     // Catch: java.lang.Throwable -> L61
            android.widget.ImageView r4 = new android.widget.ImageView     // Catch: java.lang.Throwable -> L61
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L61
            r2.f3222g = r4     // Catch: java.lang.Throwable -> L61
            android.graphics.Bitmap r3 = r2.a     // Catch: java.lang.Throwable -> L61
            r4.setImageBitmap(r3)     // Catch: java.lang.Throwable -> L61
            android.widget.ImageView r3 = r2.f3222g     // Catch: java.lang.Throwable -> L61
            r4 = 1
            r3.setClickable(r4)     // Catch: java.lang.Throwable -> L61
            android.widget.ImageView r3 = r2.f3222g     // Catch: java.lang.Throwable -> L61
            r4 = 20
            r3.setPadding(r0, r4, r4, r0)     // Catch: java.lang.Throwable -> L61
            android.widget.ImageView r3 = r2.f3222g     // Catch: java.lang.Throwable -> L61
            com.amap.api.col.3l.eg$a r4 = new com.amap.api.col.3l.eg$a     // Catch: java.lang.Throwable -> L61
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L61
            r3.setOnTouchListener(r4)     // Catch: java.lang.Throwable -> L61
            android.widget.ImageView r3 = r2.f3222g     // Catch: java.lang.Throwable -> L61
            r2.addView(r3)     // Catch: java.lang.Throwable -> L61
            return
        L61:
            r3 = move-exception
            java.lang.String r4 = "LocationView"
            java.lang.String r0 = "create"
            com.amap.api.col.p0003l.w5.p(r3, r4, r0)
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
            goto L40
        Ld:
            android.graphics.Bitmap r0 = r3.f3217b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
        L14:
            android.graphics.Bitmap r0 = r3.f3217b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L1d
            android.graphics.Bitmap r0 = r3.f3218c     // Catch: java.lang.Throwable -> Lb
            com.amap.api.col.p0003l.b3.B(r0)     // Catch: java.lang.Throwable -> Lb
        L1d:
            r0 = 0
            r3.a = r0     // Catch: java.lang.Throwable -> Lb
            r3.f3217b = r0     // Catch: java.lang.Throwable -> Lb
            r3.f3218c = r0     // Catch: java.lang.Throwable -> Lb
            android.graphics.Bitmap r1 = r3.f3219d     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L2d
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> Lb
            r3.f3219d = r0     // Catch: java.lang.Throwable -> Lb
        L2d:
            android.graphics.Bitmap r1 = r3.f3220e     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L36
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> Lb
            r3.f3220e = r0     // Catch: java.lang.Throwable -> Lb
        L36:
            android.graphics.Bitmap r1 = r3.f3221f     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L3f
            com.amap.api.col.p0003l.b3.B(r1)     // Catch: java.lang.Throwable -> Lb
            r3.f3221f = r0     // Catch: java.lang.Throwable -> Lb
        L3f:
            return
        L40:
            java.lang.String r1 = "LocationView"
            java.lang.String r2 = "destroy"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            return
    }

    public final void b(boolean r3) {
            r2 = this;
            r2.f3224i = r3
            if (r3 == 0) goto Le
            android.widget.ImageView r3 = r2.f3222g     // Catch: java.lang.Throwable -> Lc
            android.graphics.Bitmap r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            r3.setImageBitmap(r0)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r3 = move-exception
            goto L1b
        Le:
            android.widget.ImageView r3 = r2.f3222g     // Catch: java.lang.Throwable -> Lc
            android.graphics.Bitmap r0 = r2.f3218c     // Catch: java.lang.Throwable -> Lc
            r3.setImageBitmap(r0)     // Catch: java.lang.Throwable -> Lc
        L15:
            android.widget.ImageView r3 = r2.f3222g     // Catch: java.lang.Throwable -> Lc
            r3.invalidate()     // Catch: java.lang.Throwable -> Lc
            return
        L1b:
            java.lang.String r0 = "LocationView"
            java.lang.String r1 = "showSelect"
            com.amap.api.col.p0003l.w5.p(r3, r0, r1)
            return
    }
}
