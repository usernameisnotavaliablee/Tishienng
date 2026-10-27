package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a0 {
    com.amap.api.maps.AMap.InfoWindowAdapter a;

    /* renamed from: b, reason: collision with root package name */
    com.amap.api.maps.AMap.CommonInfoWindowAdapter f2938b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2939c;

    /* renamed from: d, reason: collision with root package name */
    private android.view.View f2940d;

    /* renamed from: e, reason: collision with root package name */
    private android.widget.TextView f2941e;

    /* renamed from: f, reason: collision with root package name */
    private android.widget.TextView f2942f;

    /* renamed from: g, reason: collision with root package name */
    private android.graphics.drawable.Drawable f2943g;

    /* renamed from: h, reason: collision with root package name */
    android.content.Context f2944h;

    /* renamed from: i, reason: collision with root package name */
    private com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction f2945i;

    /* renamed from: j, reason: collision with root package name */
    private com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction f2946j;

    /* renamed from: k, reason: collision with root package name */
    private com.amap.api.maps.model.BaseOverlay f2947k;
    private com.amap.api.maps.AMap.InfoWindowAdapter l;
    private com.amap.api.maps.AMap.CommonInfoWindowAdapter m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements com.amap.api.maps.AMap.InfoWindowAdapter {
        final /* synthetic */ com.amap.api.col.p0003l.a0 a;

        a(com.amap.api.col.p0003l.a0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.maps.AMap.InfoWindowAdapter
        public final android.view.View getInfoContents(com.amap.api.maps.model.Marker r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.amap.api.maps.AMap.InfoWindowAdapter
        public final android.view.View getInfoWindow(com.amap.api.maps.model.Marker r5) {
                r4 = this;
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.graphics.drawable.Drawable r0 = com.amap.api.col.p0003l.a0.a(r0)     // Catch: java.lang.Throwable -> L16
                if (r0 != 0) goto L19
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.content.Context r1 = r0.f2944h     // Catch: java.lang.Throwable -> L16
                java.lang.String r2 = "infowindow_bg.9.png"
                android.graphics.drawable.Drawable r1 = com.amap.api.col.p0003l.q2.c(r1, r2)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.p0003l.a0.b(r0, r1)     // Catch: java.lang.Throwable -> L16
                goto L19
            L16:
                r5 = move-exception
                goto Lb7
            L19:
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.view.View r0 = com.amap.api.col.p0003l.a0.o(r0)     // Catch: java.lang.Throwable -> L16
                if (r0 != 0) goto Lbe
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r2 = r4.a     // Catch: java.lang.Throwable -> L16
                android.content.Context r2 = r2.f2944h     // Catch: java.lang.Throwable -> L16
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.p0003l.a0.c(r0, r1)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.view.View r0 = com.amap.api.col.p0003l.a0.o(r0)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r1 = r4.a     // Catch: java.lang.Throwable -> L16
                android.graphics.drawable.Drawable r1 = com.amap.api.col.p0003l.a0.a(r1)     // Catch: java.lang.Throwable -> L16
                r0.setBackground(r1)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r2 = r4.a     // Catch: java.lang.Throwable -> L16
                android.content.Context r2 = r2.f2944h     // Catch: java.lang.Throwable -> L16
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.p0003l.a0.e(r0, r1)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.TextView r0 = com.amap.api.col.p0003l.a0.v(r0)     // Catch: java.lang.Throwable -> L16
                java.lang.String r1 = r5.getTitle()     // Catch: java.lang.Throwable -> L16
                r0.setText(r1)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.TextView r0 = com.amap.api.col.p0003l.a0.v(r0)     // Catch: java.lang.Throwable -> L16
                r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r0.setTextColor(r1)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.TextView r2 = new android.widget.TextView     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r3 = r4.a     // Catch: java.lang.Throwable -> L16
                android.content.Context r3 = r3.f2944h     // Catch: java.lang.Throwable -> L16
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.p0003l.a0.q(r0, r2)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.TextView r0 = com.amap.api.col.p0003l.a0.x(r0)     // Catch: java.lang.Throwable -> L16
                r0.setTextColor(r1)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.TextView r0 = com.amap.api.col.p0003l.a0.x(r0)     // Catch: java.lang.Throwable -> L16
                java.lang.String r5 = r5.getSnippet()     // Catch: java.lang.Throwable -> L16
                r0.setText(r5)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r5 = r4.a     // Catch: java.lang.Throwable -> L16
                android.view.View r5 = com.amap.api.col.p0003l.a0.o(r5)     // Catch: java.lang.Throwable -> L16
                android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5     // Catch: java.lang.Throwable -> L16
                r0 = 1
                r5.setOrientation(r0)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r5 = r4.a     // Catch: java.lang.Throwable -> L16
                android.view.View r5 = com.amap.api.col.p0003l.a0.o(r5)     // Catch: java.lang.Throwable -> L16
                android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.TextView r0 = com.amap.api.col.p0003l.a0.v(r0)     // Catch: java.lang.Throwable -> L16
                r5.addView(r0)     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r5 = r4.a     // Catch: java.lang.Throwable -> L16
                android.view.View r5 = com.amap.api.col.p0003l.a0.o(r5)     // Catch: java.lang.Throwable -> L16
                android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5     // Catch: java.lang.Throwable -> L16
                com.amap.api.col.3l.a0 r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.widget.TextView r0 = com.amap.api.col.p0003l.a0.x(r0)     // Catch: java.lang.Throwable -> L16
                r5.addView(r0)     // Catch: java.lang.Throwable -> L16
                goto Lbe
            Lb7:
                java.lang.String r0 = "InfoWindowDelegate"
                java.lang.String r1 = "showInfoWindow decodeDrawableFromAsset"
                com.amap.api.col.p0003l.w5.p(r5, r0, r1)
            Lbe:
                com.amap.api.col.3l.a0 r5 = r4.a
                android.view.View r5 = com.amap.api.col.p0003l.a0.o(r5)
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements com.amap.api.maps.AMap.CommonInfoWindowAdapter {
        private com.amap.api.maps.InfoWindowParams a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.a0 f2948b;

        b(com.amap.api.col.p0003l.a0 r1) {
                r0 = this;
                r0.f2948b = r1
                r0.<init>()
                r1 = 0
                r0.a = r1
                return
        }

        @Override // com.amap.api.maps.AMap.CommonInfoWindowAdapter
        public final com.amap.api.maps.InfoWindowParams getInfoWindowParams(com.amap.api.maps.model.BasePointOverlay r4) {
                r3 = this;
                com.amap.api.maps.InfoWindowParams r4 = r3.a     // Catch: java.lang.Throwable -> L21
                if (r4 != 0) goto Lc6
                com.amap.api.maps.InfoWindowParams r4 = new com.amap.api.maps.InfoWindowParams     // Catch: java.lang.Throwable -> L21
                r4.<init>()     // Catch: java.lang.Throwable -> L21
                r3.a = r4     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.graphics.drawable.Drawable r4 = com.amap.api.col.p0003l.a0.a(r4)     // Catch: java.lang.Throwable -> L21
                if (r4 != 0) goto L24
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.content.Context r0 = r4.f2944h     // Catch: java.lang.Throwable -> L21
                java.lang.String r1 = "infowindow_bg.9.png"
                android.graphics.drawable.Drawable r0 = com.amap.api.col.p0003l.q2.c(r0, r1)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.p0003l.a0.b(r4, r0)     // Catch: java.lang.Throwable -> L21
                goto L24
            L21:
                r4 = move-exception
                goto Lc9
            L24:
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r1 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.content.Context r1 = r1.f2944h     // Catch: java.lang.Throwable -> L21
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.p0003l.a0.c(r4, r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.view.View r4 = com.amap.api.col.p0003l.a0.o(r4)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r0 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.graphics.drawable.Drawable r0 = com.amap.api.col.p0003l.a0.a(r0)     // Catch: java.lang.Throwable -> L21
                r4.setBackground(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r1 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.content.Context r1 = r1.f2944h     // Catch: java.lang.Throwable -> L21
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.p0003l.a0.e(r4, r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.TextView r4 = com.amap.api.col.p0003l.a0.v(r4)     // Catch: java.lang.Throwable -> L21
                java.lang.String r0 = "标题"
                r4.setText(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.TextView r4 = com.amap.api.col.p0003l.a0.v(r4)     // Catch: java.lang.Throwable -> L21
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r4.setTextColor(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r2 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.content.Context r2 = r2.f2944h     // Catch: java.lang.Throwable -> L21
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.p0003l.a0.q(r4, r1)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.TextView r4 = com.amap.api.col.p0003l.a0.x(r4)     // Catch: java.lang.Throwable -> L21
                r4.setTextColor(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.TextView r4 = com.amap.api.col.p0003l.a0.x(r4)     // Catch: java.lang.Throwable -> L21
                java.lang.String r0 = "内容"
                r4.setText(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.view.View r4 = com.amap.api.col.p0003l.a0.o(r4)     // Catch: java.lang.Throwable -> L21
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4     // Catch: java.lang.Throwable -> L21
                r0 = 1
                r4.setOrientation(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.view.View r4 = com.amap.api.col.p0003l.a0.o(r4)     // Catch: java.lang.Throwable -> L21
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r0 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.TextView r0 = com.amap.api.col.p0003l.a0.v(r0)     // Catch: java.lang.Throwable -> L21
                r4.addView(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r4 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.view.View r4 = com.amap.api.col.p0003l.a0.o(r4)     // Catch: java.lang.Throwable -> L21
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r0 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.widget.TextView r0 = com.amap.api.col.p0003l.a0.x(r0)     // Catch: java.lang.Throwable -> L21
                r4.addView(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.maps.InfoWindowParams r4 = r3.a     // Catch: java.lang.Throwable -> L21
                r0 = 2
                r4.setInfoWindowType(r0)     // Catch: java.lang.Throwable -> L21
                com.amap.api.maps.InfoWindowParams r4 = r3.a     // Catch: java.lang.Throwable -> L21
                com.amap.api.col.3l.a0 r0 = r3.f2948b     // Catch: java.lang.Throwable -> L21
                android.view.View r0 = com.amap.api.col.p0003l.a0.o(r0)     // Catch: java.lang.Throwable -> L21
                r4.setInfoWindow(r0)     // Catch: java.lang.Throwable -> L21
            Lc6:
                com.amap.api.maps.InfoWindowParams r4 = r3.a     // Catch: java.lang.Throwable -> L21
                return r4
            Lc9:
                java.lang.String r0 = "InfoWindowDelegate"
                java.lang.String r1 = "showInfoWindow decodeDrawableFromAsset"
                com.amap.api.col.p0003l.w5.p(r4, r0, r1)
                r4 = 0
                return r4
        }
    }

    public a0(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            r2.f2938b = r0
            r1 = 1
            r2.f2939c = r1
            r2.f2943g = r0
            com.amap.api.col.3l.a0$a r0 = new com.amap.api.col.3l.a0$a
            r0.<init>(r2)
            r2.l = r0
            com.amap.api.col.3l.a0$b r0 = new com.amap.api.col.3l.a0$b
            r0.<init>(r2)
            r2.m = r0
            r2.f2944h = r3
            return
    }

    static /* synthetic */ android.graphics.drawable.Drawable a(com.amap.api.col.p0003l.a0 r0) {
            android.graphics.drawable.Drawable r0 = r0.f2943g
            return r0
    }

    static /* synthetic */ android.graphics.drawable.Drawable b(com.amap.api.col.p0003l.a0 r0, android.graphics.drawable.Drawable r1) {
            r0.f2943g = r1
            return r1
    }

    static /* synthetic */ android.view.View c(com.amap.api.col.p0003l.a0 r0, android.view.View r1) {
            r0.f2940d = r1
            return r1
    }

    static /* synthetic */ android.widget.TextView e(com.amap.api.col.p0003l.a0 r0, android.widget.TextView r1) {
            r0.f2941e = r1
            return r1
    }

    private static void g(android.view.View r2, com.amap.api.maps.model.BasePointOverlay r3) {
            if (r2 == 0) goto L27
            if (r3 == 0) goto L27
            com.amap.api.maps.model.LatLng r0 = r3.getPosition()
            if (r0 == 0) goto L27
            boolean r0 = com.amap.api.col.p0003l.p2.g()
            if (r0 == 0) goto L27
            java.lang.String r2 = com.amap.api.col.p0003l.b3.Y(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L27
            com.amap.api.col.3l.p2 r0 = com.amap.api.col.p0003l.p2.a()
            com.amap.api.maps.model.LatLng r3 = r3.getPosition()
            java.lang.String r1 = ""
            r0.c(r3, r2, r1)
        L27:
            return
    }

    static /* synthetic */ android.view.View o(com.amap.api.col.p0003l.a0 r0) {
            android.view.View r0 = r0.f2940d
            return r0
    }

    static /* synthetic */ android.widget.TextView q(com.amap.api.col.p0003l.a0 r0, android.widget.TextView r1) {
            r0.f2942f = r1
            return r1
    }

    private static boolean t(com.amap.api.maps.AMap.InfoWindowAdapter r5) {
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            com.amap.api.maps.model.Marker r1 = new com.amap.api.maps.model.Marker
            com.amap.api.maps.model.MarkerOptions r2 = new com.amap.api.maps.model.MarkerOptions
            r2.<init>()
            java.lang.String r3 = "check"
            r4 = 0
            r1.<init>(r4, r2, r3)
            android.view.View r2 = r5.getInfoWindow(r1)
            if (r2 != 0) goto L1e
            android.view.View r5 = r5.getInfoContents(r1)
            if (r5 != 0) goto L1e
            return r0
        L1e:
            r5 = 0
            return r5
    }

    static /* synthetic */ android.widget.TextView v(com.amap.api.col.p0003l.a0 r0) {
            android.widget.TextView r0 = r0.f2941e
            return r0
    }

    static /* synthetic */ android.widget.TextView x(com.amap.api.col.p0003l.a0 r0) {
            android.widget.TextView r0 = r0.f2942f
            return r0
    }

    private synchronized com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction y() {
            r2 = this;
            monitor-enter(r2)
            com.amap.api.maps.AMap$InfoWindowAdapter r0 = r2.a     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L17
            boolean r1 = r0 instanceof com.amap.api.maps.AMap.ImageInfoWindowAdapter     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r2.f2946j     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r0
        Ld:
            r0 = move-exception
            goto L2f
        Lf:
            boolean r0 = r0 instanceof com.amap.api.maps.AMap.MultiPositionInfoWindowAdapter     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L17
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r2.f2946j     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r0
        L17:
            com.amap.api.maps.AMap$CommonInfoWindowAdapter r0 = r2.f2938b     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L2b
            r1 = 0
            com.amap.api.maps.InfoWindowParams r0 = r0.getInfoWindowParams(r1)     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.getInfoWindowType()     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            if (r0 != r1) goto L2b
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r2.f2946j     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r0
        L2b:
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r2.f2945i     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r0
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public final android.view.View d(com.amap.api.maps.model.BasePointOverlay r3) {
            r2 = this;
            com.amap.api.maps.AMap$InfoWindowAdapter r0 = r2.a
            if (r0 == 0) goto Lf
            r1 = r3
            com.amap.api.maps.model.Marker r1 = (com.amap.api.maps.model.Marker) r1
            android.view.View r0 = r0.getInfoWindow(r1)
            g(r0, r3)
            return r0
        Lf:
            com.amap.api.maps.AMap$CommonInfoWindowAdapter r0 = r2.f2938b
            if (r0 == 0) goto L21
            com.amap.api.maps.InfoWindowParams r0 = r0.getInfoWindowParams(r3)
            if (r0 == 0) goto L21
            android.view.View r0 = r0.getInfoWindow()
            g(r0, r3)
            return r0
        L21:
            com.amap.api.maps.AMap$CommonInfoWindowAdapter r0 = r2.m
            com.amap.api.maps.InfoWindowParams r3 = r0.getInfoWindowParams(r3)
            if (r3 == 0) goto L2e
            android.view.View r3 = r3.getInfoWindow()
            return r3
        L2e:
            r3 = 0
            return r3
    }

    public final com.amap.api.maps.model.BaseOverlay f(android.view.MotionEvent r2) {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r1.y()
            if (r0 == 0) goto Lf
            boolean r2 = r0.onInfoWindowTap(r2)
            if (r2 == 0) goto Lf
            com.amap.api.maps.model.BaseOverlay r2 = r1.f2947k
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final synchronized void h(com.amap.api.maps.AMap.CommonInfoWindowAdapter r2) {
            r1 = this;
            monitor-enter(r1)
            r1.f2938b = r2     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r1.a = r0     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L12
            com.amap.api.maps.AMap$CommonInfoWindowAdapter r2 = r1.m     // Catch: java.lang.Throwable -> L10
            r1.f2938b = r2     // Catch: java.lang.Throwable -> L10
            r2 = 1
            r1.f2939c = r2     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r2 = move-exception
            goto L25
        L12:
            r2 = 0
            r1.f2939c = r2     // Catch: java.lang.Throwable -> L10
        L15:
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r2 = r1.f2946j     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L1c
            r2.hideInfoWindow()     // Catch: java.lang.Throwable -> L10
        L1c:
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r2 = r1.f2945i     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L23
            r2.hideInfoWindow()     // Catch: java.lang.Throwable -> L10
        L23:
            monitor-exit(r1)
            return
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public final synchronized void i(com.amap.api.maps.AMap.InfoWindowAdapter r2) {
            r1 = this;
            monitor-enter(r1)
            r1.a = r2     // Catch: java.lang.Throwable -> L14
            r0 = 0
            r1.f2938b = r0     // Catch: java.lang.Throwable -> L14
            boolean r2 = t(r2)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L16
            com.amap.api.maps.AMap$InfoWindowAdapter r2 = r1.l     // Catch: java.lang.Throwable -> L14
            r1.a = r2     // Catch: java.lang.Throwable -> L14
            r2 = 1
            r1.f2939c = r2     // Catch: java.lang.Throwable -> L14
            goto L19
        L14:
            r2 = move-exception
            goto L29
        L16:
            r2 = 0
            r1.f2939c = r2     // Catch: java.lang.Throwable -> L14
        L19:
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r2 = r1.f2946j     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L20
            r2.hideInfoWindow()     // Catch: java.lang.Throwable -> L14
        L20:
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r2 = r1.f2945i     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L27
            r2.hideInfoWindow()     // Catch: java.lang.Throwable -> L14
        L27:
            monitor-exit(r1)
            return
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public final void j(com.amap.api.maps.model.BaseOverlay r3) throws android.os.RemoteException {
            r2 = this;
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r2.y()
            if (r0 == 0) goto L12
            boolean r1 = r3 instanceof com.amap.api.maps.model.BasePointOverlay
            if (r1 == 0) goto L12
            r1 = r3
            com.amap.api.maps.model.BasePointOverlay r1 = (com.amap.api.maps.model.BasePointOverlay) r1
            r0.showInfoWindow(r1)
            r2.f2947k = r3
        L12:
            return
    }

    public final void k(com.autonavi.base.amap.api.mapcore.BaseOverlayImp r2) throws android.os.RemoteException {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r1.y()
            if (r0 == 0) goto L9
            r0.showInfoWindow(r2)
        L9:
            return
    }

    public final void l(com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f2945i = r1     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            r1.setInfoWindowAdapterManager(r0)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r1 = move-exception
            goto Ld
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public final void m(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.widget.TextView r0 = r1.f2941e
            if (r0 == 0) goto Lc
            r0.requestLayout()
            android.widget.TextView r0 = r1.f2941e
            r0.setText(r2)
        Lc:
            android.widget.TextView r2 = r1.f2942f
            if (r2 == 0) goto L18
            r2.requestLayout()
            android.widget.TextView r2 = r1.f2942f
            r2.setText(r3)
        L18:
            android.view.View r2 = r1.f2940d
            if (r2 == 0) goto L1f
            r2.requestLayout()
        L1f:
            return
    }

    public final synchronized boolean n() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f2939c     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final android.view.View p(com.amap.api.maps.model.BasePointOverlay r3) {
            r2 = this;
            com.amap.api.maps.AMap$InfoWindowAdapter r0 = r2.a
            if (r0 == 0) goto Lf
            r1 = r3
            com.amap.api.maps.model.Marker r1 = (com.amap.api.maps.model.Marker) r1
            android.view.View r0 = r0.getInfoContents(r1)
            g(r0, r3)
            return r0
        Lf:
            com.amap.api.maps.AMap$CommonInfoWindowAdapter r0 = r2.f2938b
            if (r0 == 0) goto L21
            com.amap.api.maps.InfoWindowParams r0 = r0.getInfoWindowParams(r3)
            if (r0 == 0) goto L21
            android.view.View r0 = r0.getInfoContents()
            g(r0, r3)
            return r0
        L21:
            com.amap.api.maps.AMap$CommonInfoWindowAdapter r0 = r2.m
            com.amap.api.maps.InfoWindowParams r3 = r0.getInfoWindowParams(r3)
            if (r3 == 0) goto L2e
            android.view.View r3 = r3.getInfoContents()
            return r3
        L2e:
            r3 = 0
            return r3
    }

    public final void r() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r1.y()
            if (r0 == 0) goto L9
            r0.redrawInfoWindow()
        L9:
            return
    }

    public final void s(com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f2946j = r1     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            r1.setInfoWindowAdapterManager(r0)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r1 = move-exception
            goto Ld
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public final long u(com.amap.api.maps.model.BasePointOverlay r3) {
            r2 = this;
            com.amap.api.maps.AMap$InfoWindowAdapter r0 = r2.a
            if (r0 == 0) goto Lf
            boolean r1 = r0 instanceof com.amap.api.maps.AMap.ImageInfoWindowAdapter
            if (r1 == 0) goto Lf
            com.amap.api.maps.AMap$ImageInfoWindowAdapter r0 = (com.amap.api.maps.AMap.ImageInfoWindowAdapter) r0
            long r0 = r0.getInfoWindowUpdateTime()
            return r0
        Lf:
            com.amap.api.maps.AMap$CommonInfoWindowAdapter r0 = r2.f2938b
            if (r0 == 0) goto L1e
            com.amap.api.maps.InfoWindowParams r3 = r0.getInfoWindowParams(r3)
            if (r3 == 0) goto L1e
            long r0 = r3.getInfoWindowUpdateTime()
            return r0
        L1e:
            r0 = 0
            return r0
    }

    public final void w() {
            r1 = this;
            com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction r0 = r1.y()
            if (r0 == 0) goto L9
            r0.hideInfoWindow()
        L9:
            return
    }
}
