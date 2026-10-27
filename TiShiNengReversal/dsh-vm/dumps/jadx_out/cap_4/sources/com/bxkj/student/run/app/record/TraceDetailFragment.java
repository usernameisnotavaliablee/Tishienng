package com.bxkj.student.run.app.record;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TraceDetailFragment extends cn.bluemobi.dylan.base.BaseFragment {
    private java.util.List<java.lang.Integer> A;
    private com.amap.api.maps.model.PolylineOptions B;
    private com.amap.api.maps.model.Polyline C;
    private android.widget.LinearLayout j;
    private android.widget.LinearLayout k;

    /* renamed from: l, reason: collision with root package name */
    private android.widget.TextView f1186l;

    /* renamed from: m, reason: collision with root package name */
    private android.widget.TextView f1187m;

    /* renamed from: n, reason: collision with root package name */
    private android.widget.TextView f1188n;

    /* renamed from: o, reason: collision with root package name */
    private android.widget.TextView f1189o;

    /* renamed from: p, reason: collision with root package name */
    private com.amap.api.maps.TextureMapView f1190p;

    /* renamed from: q, reason: collision with root package name */
    private com.amap.api.maps.AMap f1191q;

    /* renamed from: r, reason: collision with root package name */
    private com.bxkj.student.run.app.utils.RecordPathView f1192r;

    /* renamed from: s, reason: collision with root package name */
    private com.bxkj.student.run.app.vm.RunVM f1193s;

    /* renamed from: t, reason: collision with root package name */
    private java.lang.String f1194t;

    /* renamed from: u, reason: collision with root package name */
    private java.lang.String f1195u;

    /* renamed from: v, reason: collision with root package name */
    private java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> f1196v;

    /* renamed from: w, reason: collision with root package name */
    private android.os.Bundle f1197w;

    /* renamed from: x, reason: collision with root package name */
    private java.util.List<com.amap.api.maps.model.LatLng> f1198x;

    /* renamed from: y, reason: collision with root package name */
    private com.amap.api.maps.model.PolylineOptions f1199y;

    /* renamed from: z, reason: collision with root package name */
    private com.amap.api.maps.model.Polyline f1200z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.amap.api.maps.AMap.OnMapScreenShotListener {
        final /* synthetic */ com.bxkj.student.run.app.record.TraceDetailFragment a;

        a(com.bxkj.student.run.app.record.TraceDetailFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onMapScreenShot(android.graphics.Bitmap r3) {
                r2 = this;
                com.bxkj.student.run.app.record.TraceDetailFragment r0 = r2.a
                android.widget.LinearLayout r1 = com.bxkj.student.run.app.record.TraceDetailFragment.Q(r0)
                android.graphics.Bitmap r1 = r0.d0(r1)
                android.graphics.Bitmap r3 = com.bxkj.student.run.app.record.TraceDetailFragment.T(r0, r3, r1)
                com.bxkj.student.run.app.record.TraceDetailFragment r0 = r2.a
                com.bxkj.student.run.app.record.TraceDetailFragment.U(r0, r3)
                return
        }

        public void onMapScreenShot(android.graphics.Bitmap r1, int r2) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.umeng.socialize.utils.ShareBoardlistener {
        final /* synthetic */ android.graphics.Bitmap a;
        final /* synthetic */ com.bxkj.student.run.app.record.TraceDetailFragment b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements com.umeng.socialize.UMShareListener {
            final /* synthetic */ com.bxkj.student.run.app.record.TraceDetailFragment.b a;

            a(com.bxkj.student.run.app.record.TraceDetailFragment.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void onCancel(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.student.run.app.record.TraceDetailFragment$b r3 = r2.a
                    com.bxkj.student.run.app.record.TraceDetailFragment r3 = r3.b
                    android.content.Context r3 = com.bxkj.student.run.app.record.TraceDetailFragment.Y(r3)
                    java.lang.String r0 = " 分享取消了"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    return
            }

            public void onError(com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.Throwable r3) {
                    r1 = this;
                    r3.getClass()
                    com.bxkj.student.run.app.record.TraceDetailFragment$b r2 = r1.a
                    com.bxkj.student.run.app.record.TraceDetailFragment r2 = r2.b
                    android.content.Context r2 = com.bxkj.student.run.app.record.TraceDetailFragment.X(r2)
                    java.lang.String r3 = " 分享失败啦"
                    r0 = 0
                    android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                    r2.show()
                    return
            }

            public void onResult(com.umeng.socialize.bean.SHARE_MEDIA r3) {
                    r2 = this;
                    com.bxkj.student.run.app.record.TraceDetailFragment$b r3 = r2.a
                    com.bxkj.student.run.app.record.TraceDetailFragment r3 = r3.b
                    android.content.Context r3 = com.bxkj.student.run.app.record.TraceDetailFragment.W(r3)
                    java.lang.String r0 = " 分享成功啦"
                    r1 = 0
                    android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                    r3.show()
                    return
            }

            public void onStart(com.umeng.socialize.bean.SHARE_MEDIA r1) {
                    r0 = this;
                    return
            }
        }

        b(com.bxkj.student.run.app.record.TraceDetailFragment r1, android.graphics.Bitmap r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onclick(com.umeng.socialize.shareboard.SnsPlatform r3, com.umeng.socialize.bean.SHARE_MEDIA r4) {
                r2 = this;
                com.umeng.socialize.media.UMImage r3 = new com.umeng.socialize.media.UMImage
                com.bxkj.student.run.app.record.TraceDetailFragment r0 = r2.b
                android.content.Context r0 = com.bxkj.student.run.app.record.TraceDetailFragment.V(r0)
                android.graphics.Bitmap r1 = r2.a
                r3.<init>(r0, r1)
                com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
                com.bxkj.student.run.app.record.TraceDetailFragment r1 = r2.b
                androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
                r0.<init>(r1)
                com.umeng.socialize.ShareAction r4 = r0.setPlatform(r4)
                com.bxkj.student.run.app.record.TraceDetailFragment$b$a r0 = new com.bxkj.student.run.app.record.TraceDetailFragment$b$a
                r0.<init>(r2)
                com.umeng.socialize.ShareAction r4 = r4.setCallback(r0)
                com.umeng.socialize.ShareAction r3 = r4.withMedia(r3)
                r3.share()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends com.alibaba.fastjson.TypeReference<java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>>> {
        final /* synthetic */ com.bxkj.student.run.app.record.TraceDetailFragment a;

        c(com.bxkj.student.run.app.record.TraceDetailFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends com.alibaba.fastjson.TypeReference<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> {
        final /* synthetic */ com.bxkj.student.run.app.record.TraceDetailFragment a;

        d(com.bxkj.student.run.app.record.TraceDetailFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends com.alibaba.fastjson.TypeReference<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> {
        final /* synthetic */ com.bxkj.student.run.app.record.TraceDetailFragment a;

        e(com.bxkj.student.run.app.record.TraceDetailFragment r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements com.amap.api.maps.AMap.OnCameraChangeListener {
        private boolean a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ java.util.List c;
        final /* synthetic */ com.bxkj.student.run.app.record.TraceDetailFragment d;

        f(com.bxkj.student.run.app.record.TraceDetailFragment r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                r1 = 0
                r0.a = r1
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.run.app.record.TraceDetailFragment.f r0, java.util.List r1, java.util.List r2) {
                r0.b(r1, r2)
                return
        }

        private /* synthetic */ void b(java.util.List r3, java.util.List r4) {
                r2 = this;
                com.bxkj.student.run.app.record.TraceDetailFragment r0 = r2.d
                com.bxkj.student.run.app.utils.RecordPathView r0 = com.bxkj.student.run.app.record.TraceDetailFragment.R(r0)
                r0.e()
                com.bxkj.student.run.app.record.TraceDetailFragment r0 = r2.d
                com.bxkj.student.run.app.utils.RecordPathView r0 = com.bxkj.student.run.app.record.TraceDetailFragment.R(r0)
                r1 = 8
                r0.setVisibility(r1)
                com.bxkj.student.run.app.record.TraceDetailFragment r0 = r2.d
                com.bxkj.student.run.app.record.TraceDetailFragment.S(r0, r3, r4)
                return
        }

        public void onCameraChange(com.amap.api.maps.model.CameraPosition r1) {
                r0 = this;
                return
        }

        public void onCameraChangeFinish(com.amap.api.maps.model.CameraPosition r6) {
                r5 = this;
                boolean r6 = r5.a
                if (r6 != 0) goto L7c
                r6 = 1
                r5.a = r6
                com.bxkj.student.run.app.utils.q r0 = new com.bxkj.student.run.app.utils.q
                r0.<init>()
            Lc:
                com.bxkj.student.run.app.record.TraceDetailFragment r1 = r5.d
                java.util.List r1 = com.bxkj.student.run.app.record.TraceDetailFragment.P(r1)
                int r1 = r1.size()
                if (r6 >= r1) goto L61
                com.bxkj.student.run.app.record.TraceDetailFragment r1 = r5.d
                java.util.List r1 = com.bxkj.student.run.app.record.TraceDetailFragment.P(r1)
                int r2 = r6 + (-1)
                java.lang.Object r1 = r1.get(r2)
                com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
                com.bxkj.student.run.app.record.TraceDetailFragment r2 = r5.d
                java.util.List r2 = com.bxkj.student.run.app.record.TraceDetailFragment.P(r2)
                java.lang.Object r2 = r2.get(r6)
                com.amap.api.maps.model.LatLng r2 = (com.amap.api.maps.model.LatLng) r2
                com.bxkj.student.run.app.record.TraceDetailFragment r3 = r5.d
                com.amap.api.maps.AMap r3 = com.bxkj.student.run.app.record.TraceDetailFragment.O(r3)
                com.amap.api.maps.Projection r3 = r3.getProjection()
                android.graphics.Point r1 = r3.toScreenLocation(r1)
                com.bxkj.student.run.app.record.TraceDetailFragment r3 = r5.d
                com.amap.api.maps.AMap r3 = com.bxkj.student.run.app.record.TraceDetailFragment.O(r3)
                com.amap.api.maps.Projection r3 = r3.getProjection()
                android.graphics.Point r2 = r3.toScreenLocation(r2)
                com.bxkj.student.run.app.record.TraceDetailFragment r3 = r5.d
                android.content.Context r3 = com.bxkj.student.run.app.record.TraceDetailFragment.Z(r3)
                r4 = 2131100565(0x7f060395, float:1.7813515E38)
                int r3 = androidx.core.content.ContextCompat.getColor(r3, r4)
                r0.a(r1, r2, r3, r3)
                int r6 = r6 + 1
                goto Lc
            L61:
                com.bxkj.student.run.app.record.TraceDetailFragment r6 = r5.d
                com.bxkj.student.run.app.utils.RecordPathView r6 = com.bxkj.student.run.app.record.TraceDetailFragment.R(r6)
                r6.setPath(r0)
                com.bxkj.student.run.app.record.TraceDetailFragment r6 = r5.d
                com.bxkj.student.run.app.utils.RecordPathView r6 = com.bxkj.student.run.app.record.TraceDetailFragment.R(r6)
                java.util.List r0 = r5.b
                java.util.List r1 = r5.c
                com.bxkj.student.run.app.record.o r2 = new com.bxkj.student.run.app.record.o
                r2.<init>(r5, r0, r1)
                r6.setOnAnimEnd(r2)
            L7c:
                return
        }
    }

    public TraceDetailFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1198x = r0
            com.amap.api.maps.model.PolylineOptions r0 = new com.amap.api.maps.model.PolylineOptions
            r0.<init>()
            r1.f1199y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A = r0
            com.amap.api.maps.model.PolylineOptions r0 = new com.amap.api.maps.model.PolylineOptions
            r0.<init>()
            r1.B = r0
            return
    }

    public static /* synthetic */ kotlin.n1 N(com.bxkj.student.run.app.record.TraceDetailFragment r0, java.util.List r1) {
            kotlin.n1 r0 = r0.p0(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.amap.api.maps.AMap O(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            com.amap.api.maps.AMap r0 = r0.f1191q
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List P(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            java.util.List<com.amap.api.maps.model.LatLng> r0 = r0.f1198x
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.LinearLayout Q(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            android.widget.LinearLayout r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.utils.RecordPathView R(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            com.bxkj.student.run.app.utils.RecordPathView r0 = r0.f1192r
            return r0
    }

    static /* bridge */ /* synthetic */ void S(com.bxkj.student.run.app.record.TraceDetailFragment r0, java.util.List r1, java.util.List r2) {
            r0.b0(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ android.graphics.Bitmap T(com.bxkj.student.run.app.record.TraceDetailFragment r0, android.graphics.Bitmap r1, android.graphics.Bitmap r2) {
            android.graphics.Bitmap r0 = r0.e0(r1, r2)
            return r0
    }

    static /* bridge */ /* synthetic */ void U(com.bxkj.student.run.app.record.TraceDetailFragment r0, android.graphics.Bitmap r1) {
            r0.r0(r1)
            return
    }

    static /* synthetic */ android.content.Context V(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context W(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context X(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Y(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    static /* synthetic */ android.content.Context Z(com.bxkj.student.run.app.record.TraceDetailFragment r0) {
            android.content.Context r0 = r0.g
            return r0
    }

    private void a0(java.lang.String r14) {
            r13 = this;
            androidx.collection.ArrayMap r14 = cn.bluemobi.dylan.http.JsonParse.jsonToMap(r14)
            java.lang.String r0 = "first"
            java.util.Map r0 = cn.bluemobi.dylan.http.JsonParse.getMap(r14, r0)
            java.lang.String r1 = "success"
            java.util.Map r14 = cn.bluemobi.dylan.http.JsonParse.getMap(r14, r1)
            java.lang.String r1 = "latitude"
            boolean r2 = r0.containsKey(r1)
            r3 = 0
            r4 = 1091567616(0x41100000, float:9.0)
            r5 = 2131689899(0x7f0f01ab, float:1.9008826E38)
            java.lang.String r6 = "longitude"
            if (r2 == 0) goto L57
            boolean r2 = r0.containsKey(r6)
            if (r2 == 0) goto L57
            com.amap.api.maps.model.BitmapDescriptor r2 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r5)
            com.amap.api.maps.model.MarkerOptions r7 = new com.amap.api.maps.model.MarkerOptions
            r7.<init>()
            com.amap.api.maps.model.LatLng r8 = new com.amap.api.maps.model.LatLng
            double r9 = cn.bluemobi.dylan.http.JsonParse.getDouble(r0, r1)
            double r11 = cn.bluemobi.dylan.http.JsonParse.getDouble(r0, r6)
            r8.<init>(r9, r11)
            com.amap.api.maps.model.MarkerOptions r0 = r7.position(r8)
            com.amap.api.maps.model.MarkerOptions r0 = r0.icon(r2)
            com.amap.api.maps.model.MarkerOptions r0 = r0.zIndex(r4)
            java.lang.String r2 = "开始打卡点"
            com.amap.api.maps.model.MarkerOptions r0 = r0.title(r2)
            com.amap.api.maps.model.MarkerOptions r0 = r0.draggable(r3)
            com.amap.api.maps.AMap r2 = r13.f1191q
            r2.addMarker(r0)
        L57:
            boolean r0 = r14.containsKey(r1)
            if (r0 == 0) goto L94
            boolean r0 = r14.containsKey(r6)
            if (r0 == 0) goto L94
            com.amap.api.maps.model.BitmapDescriptor r0 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r5)
            com.amap.api.maps.model.MarkerOptions r2 = new com.amap.api.maps.model.MarkerOptions
            r2.<init>()
            com.amap.api.maps.model.LatLng r5 = new com.amap.api.maps.model.LatLng
            double r7 = cn.bluemobi.dylan.http.JsonParse.getDouble(r14, r1)
            double r9 = cn.bluemobi.dylan.http.JsonParse.getDouble(r14, r6)
            r5.<init>(r7, r9)
            com.amap.api.maps.model.MarkerOptions r14 = r2.position(r5)
            com.amap.api.maps.model.MarkerOptions r14 = r14.icon(r0)
            com.amap.api.maps.model.MarkerOptions r14 = r14.zIndex(r4)
            java.lang.String r0 = "结束打卡点"
            com.amap.api.maps.model.MarkerOptions r14 = r14.title(r0)
            com.amap.api.maps.model.MarkerOptions r14 = r14.draggable(r3)
            com.amap.api.maps.AMap r0 = r13.f1191q
            r0.addMarker(r14)
        L94:
            return
    }

    private void b0(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r17, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r18) {
            r16 = this;
            r0 = r16
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r17.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "longitude"
            java.lang.String r5 = "latitude"
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            double r7 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r5)
            double r9 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r4)
            java.lang.String r4 = "puase"
            boolean r14 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r3, r4)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r6 = new com.bxkj.student.run.app.location.LatLngTimeSpeed
            java.lang.String r4 = "time"
            long r11 = cn.bluemobi.dylan.http.JsonParse.getLong(r3, r4)
            java.lang.String r4 = "speed"
            float r13 = cn.bluemobi.dylan.http.JsonParse.getFloat(r3, r4)
            java.lang.String r4 = "locationType"
            int r15 = cn.bluemobi.dylan.http.JsonParse.getInt(r3, r4)
            r6.<init>(r7, r9, r11, r13, r14, r15)
            r1.add(r6)
            goto Lb
        L44:
            float r1 = r0.i0(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "优化后距离countDistance="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.orhanobut.logger.j.c(r1)
            java.util.Iterator r1 = r18.iterator()
        L60:
            boolean r2 = r1.hasNext()
            r3 = 1091567616(0x41100000, float:9.0)
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            r6 = 2131689841(0x7f0f0171, float:1.9008709E38)
            com.amap.api.maps.model.BitmapDescriptor r6 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r6)
            double r7 = cn.bluemobi.dylan.http.JsonParse.getDouble(r2, r5)
            double r9 = cn.bluemobi.dylan.http.JsonParse.getDouble(r2, r4)
            com.amap.api.maps.model.MarkerOptions r2 = new com.amap.api.maps.model.MarkerOptions
            r2.<init>()
            com.amap.api.maps.model.LatLng r11 = new com.amap.api.maps.model.LatLng
            r11.<init>(r7, r9)
            com.amap.api.maps.model.MarkerOptions r2 = r2.position(r11)
            com.amap.api.maps.model.MarkerOptions r2 = r2.icon(r6)
            com.amap.api.maps.model.MarkerOptions r2 = r2.zIndex(r3)
            r3 = 0
            com.amap.api.maps.model.MarkerOptions r2 = r2.draggable(r3)
            com.amap.api.maps.AMap r3 = r0.f1191q
            r3.addMarker(r2)
            goto L60
        L9e:
            r1 = 2131689680(0x7f0f00d0, float:1.9008382E38)
            com.amap.api.maps.model.BitmapDescriptor r1 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r1)
            com.amap.api.maps.model.MarkerOptions r2 = new com.amap.api.maps.model.MarkerOptions
            r2.<init>()
            java.util.List<com.amap.api.maps.model.LatLng> r4 = r0.f1198x
            int r5 = r4.size()
            r6 = 1
            int r5 = r5 - r6
            java.lang.Object r4 = r4.get(r5)
            com.amap.api.maps.model.LatLng r4 = (com.amap.api.maps.model.LatLng) r4
            com.amap.api.maps.model.MarkerOptions r2 = r2.position(r4)
            com.amap.api.maps.model.MarkerOptions r1 = r2.icon(r1)
            com.amap.api.maps.model.MarkerOptions r1 = r1.zIndex(r3)
            com.amap.api.maps.model.MarkerOptions r1 = r1.draggable(r6)
            com.amap.api.maps.AMap r2 = r0.f1191q
            r2.addMarker(r1)
            return
    }

    private android.graphics.Bitmap e0(android.graphics.Bitmap r8, android.graphics.Bitmap r9) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = r8.getWidth()
            int r2 = r8.getHeight()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r4 = r4 + r2
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r1, r4, r5)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            r6 = 255(0xff, float:3.57E-43)
            r5.drawRGB(r6, r6, r6)
            r6 = 0
            r5.drawBitmap(r8, r6, r6, r0)
            int r1 = r1 - r3
            float r8 = (float) r1
            float r1 = (float) r2
            r5.drawBitmap(r9, r8, r1, r0)
            android.graphics.Paint r8 = new android.graphics.Paint
            r9 = 1
            r8.<init>(r9)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8.setColor(r9)
            r9 = 1101004800(0x41a00000, float:20.0)
            android.content.Context r0 = r7.g
            int r9 = cn.bluemobi.dylan.base.utils.u.a(r9, r0)
            float r9 = (float) r9
            r8.setTextSize(r9)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 0
            int r2 = r0.length()
            r8.getTextBounds(r0, r1, r2, r9)
            r9 = 1112014848(0x42480000, float:50.0)
            r5.drawText(r0, r9, r9, r8)
            r5.save()
            r5.restore()
            return r4
    }

    private void f0(com.amap.api.fence.GeoFence r7) {
            r6 = this;
            com.amap.api.maps.model.CircleOptions r0 = new com.amap.api.maps.model.CircleOptions
            r0.<init>()
            android.content.Context r1 = r6.g
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099808(0x7f0600a0, float:1.781198E38)
            int r1 = r1.getColor(r2)
            r0.fillColor(r1)
            android.content.Context r1 = r6.g
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100554(0x7f06038a, float:1.7813493E38)
            int r1 = r1.getColor(r2)
            r0.strokeColor(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            r0.strokeWidth(r1)
            float r1 = r7.getRadius()
            double r1 = (double) r1
            r0.radius(r1)
            com.amap.api.location.DPoint r7 = r7.getCenter()
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
            double r2 = r7.getLatitude()
            double r4 = r7.getLongitude()
            r1.<init>(r2, r4)
            r0.center(r1)
            com.amap.api.maps.AMap r7 = r6.f1191q
            r7.addCircle(r0)
            return
    }

    private void g0(java.util.List<com.amap.api.maps.model.LatLng> r5) {
            r4 = this;
            com.amap.api.maps.AMap r0 = r4.f1191q
            com.amap.api.maps.model.PolylineOptions r1 = new com.amap.api.maps.model.PolylineOptions
            r1.<init>()
            com.amap.api.maps.model.PolylineOptions r5 = r1.addAll(r5)
            android.content.Context r1 = r4.g
            r2 = 1084227584(0x40a00000, float:5.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            float r1 = (float) r1
            com.amap.api.maps.model.PolylineOptions r5 = r5.width(r1)
            r1 = 1
            com.amap.api.maps.model.PolylineOptions r5 = r5.setDottedLine(r1)
            android.content.Context r1 = r4.g
            r3 = 2131099715(0x7f060043, float:1.7811791E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r3)
            com.amap.api.maps.model.PolylineOptions r5 = r5.color(r1)
            android.content.Context r1 = r4.g
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            float r1 = (float) r1
            com.amap.api.maps.model.PolylineOptions r5 = r5.zIndex(r1)
            r0.addPolyline(r5)
            return
    }

    private void h0(com.amap.api.fence.GeoFence r3) {
            r2 = this;
            int r0 = r3.getType()
            if (r0 == 0) goto La
            r1 = 2
            if (r0 == r1) goto La
            return
        La:
            r2.f0(r3)
            return
    }

    private float i0(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r12) {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "抽稀前pathOptimize="
            r0.append(r1)
            int r1 = r12.size()
            r0.append(r1)
            java.lang.String r1 = "    convertFileSize="
            r0.append(r1)
            java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r12)
            int r2 = r2.length()
            long r2 = (long) r2
            java.lang.String r2 = r11.c0(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            int r0 = r12.size()
            r2 = 2
            if (r0 <= r2) goto L41
            com.bxkj.student.run.app.utils.o r0 = new com.bxkj.student.run.app.utils.o
            r0.<init>()
            r2 = 1
            r0.p(r2)
            java.util.List r12 = r0.k(r12)
        L41:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "抽稀后pathOptimize="
            r0.append(r2)
            int r2 = r12.size()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r12)
            int r1 = r1.length()
            long r1 = (long) r1
            java.lang.String r1 = r11.c0(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
            r3 = 0
            r4 = 0
        L7d:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto Lcf
            java.lang.Object r5 = r12.next()
            com.bxkj.student.run.app.location.LatLngTimeSpeed r5 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r5
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            double r7 = r5.getLatitude()
            double r9 = r5.getLongitude()
            r6.<init>(r7, r9)
            r0.add(r6)
            boolean r7 = r5.isPuase()
            android.content.Context r8 = r11.g
            float r5 = r5.getSpeed()
            int r5 = com.bxkj.student.run.app.utils.i.r(r8, r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r1.add(r8)
            if (r7 == r3) goto Lc3
            r11.k0(r0, r3, r1)
            r1.clear()
            r0.clear()
            r0.add(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.add(r5)
        Lc3:
            if (r4 == 0) goto Lcc
            if (r3 != 0) goto Lcc
            float r3 = com.amap.api.maps.AMapUtils.calculateLineDistance(r4, r6)
            float r2 = r2 + r3
        Lcc:
            r4 = r6
            r3 = r7
            goto L7d
        Lcf:
            r11.k0(r0, r3, r1)
            return r2
    }

    private void j0(com.amap.api.maps.model.LatLng r7, com.amap.api.maps.model.LatLng r8, float r9, boolean r10) {
            r6 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 1084227584(0x40a00000, float:5.0)
            if (r10 == 0) goto L86
            com.amap.api.maps.model.Polyline r9 = r6.C
            r10 = 2131099715(0x7f060043, float:1.7811791E38)
            if (r9 != 0) goto L58
            r6.f1199y = r3
            r6.f1200z = r3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r6.A = r9
            com.amap.api.maps.model.PolylineOptions r9 = new com.amap.api.maps.model.PolylineOptions
            r9.<init>()
            r6.B = r9
            com.amap.api.maps.AMap r3 = r6.f1191q
            com.amap.api.maps.model.LatLng[] r1 = new com.amap.api.maps.model.LatLng[r1]
            r1[r0] = r8
            r1[r2] = r7
            com.amap.api.maps.model.PolylineOptions r7 = r9.add(r1)
            android.content.Context r8 = r6.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
            float r8 = (float) r8
            com.amap.api.maps.model.PolylineOptions r7 = r7.width(r8)
            com.amap.api.maps.model.PolylineOptions r7 = r7.setDottedLine(r2)
            android.content.Context r8 = r6.g
            int r8 = androidx.core.content.ContextCompat.getColor(r8, r10)
            com.amap.api.maps.model.PolylineOptions r7 = r7.color(r8)
            android.content.Context r8 = r6.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
            float r8 = (float) r8
            com.amap.api.maps.model.PolylineOptions r7 = r7.zIndex(r8)
            com.amap.api.maps.model.Polyline r7 = r3.addPolyline(r7)
            r6.C = r7
            return
        L58:
            com.amap.api.maps.model.PolylineOptions r8 = r6.B
            com.amap.api.maps.model.PolylineOptions r7 = r8.add(r7)
            android.content.Context r8 = r6.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
            float r8 = (float) r8
            com.amap.api.maps.model.PolylineOptions r7 = r7.width(r8)
            com.amap.api.maps.model.PolylineOptions r7 = r7.setDottedLine(r2)
            android.content.Context r8 = r6.g
            int r8 = androidx.core.content.ContextCompat.getColor(r8, r10)
            com.amap.api.maps.model.PolylineOptions r7 = r7.color(r8)
            android.content.Context r8 = r6.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
            float r8 = (float) r8
            com.amap.api.maps.model.PolylineOptions r7 = r7.zIndex(r8)
            r9.setOptions(r7)
            return
        L86:
            java.util.List<java.lang.Integer> r10 = r6.A
            android.content.Context r5 = r6.g
            int r9 = com.bxkj.student.run.app.utils.i.r(r5, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.add(r9)
            com.amap.api.maps.model.Polyline r9 = r6.f1200z
            if (r9 != 0) goto Ld7
            r6.B = r3
            r6.C = r3
            com.amap.api.maps.model.PolylineOptions r9 = new com.amap.api.maps.model.PolylineOptions
            r9.<init>()
            r6.f1199y = r9
            com.amap.api.maps.AMap r10 = r6.f1191q
            com.amap.api.maps.model.LatLng[] r1 = new com.amap.api.maps.model.LatLng[r1]
            r1[r0] = r8
            r1[r2] = r7
            com.amap.api.maps.model.PolylineOptions r7 = r9.add(r1)
            android.content.Context r8 = r6.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
            float r8 = (float) r8
            com.amap.api.maps.model.PolylineOptions r7 = r7.width(r8)
            java.util.List<java.lang.Integer> r8 = r6.A
            com.amap.api.maps.model.PolylineOptions r7 = r7.colorValues(r8)
            com.amap.api.maps.model.PolylineOptions r7 = r7.useGradient(r2)
            android.content.Context r8 = r6.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
            float r8 = (float) r8
            com.amap.api.maps.model.PolylineOptions r7 = r7.zIndex(r8)
            com.amap.api.maps.model.Polyline r7 = r10.addPolyline(r7)
            r6.f1200z = r7
            return
        Ld7:
            com.amap.api.maps.model.PolylineOptions r8 = r6.f1199y
            com.amap.api.maps.model.PolylineOptions r7 = r8.add(r7)
            android.content.Context r8 = r6.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
            float r8 = (float) r8
            com.amap.api.maps.model.PolylineOptions r7 = r7.width(r8)
            java.util.List<java.lang.Integer> r8 = r6.A
            com.amap.api.maps.model.PolylineOptions r7 = r7.colorValues(r8)
            com.amap.api.maps.model.PolylineOptions r7 = r7.useGradient(r2)
            android.content.Context r8 = r6.g
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r4, r8)
            float r8 = (float) r8
            com.amap.api.maps.model.PolylineOptions r7 = r7.zIndex(r8)
            r9.setOptions(r7)
            return
    }

    private void k0(java.util.List<com.amap.api.maps.model.LatLng> r1, boolean r2, java.util.List<java.lang.Integer> r3) {
            r0 = this;
            if (r2 == 0) goto L6
            r0.g0(r1)
            return
        L6:
            r0.m0(r1, r3)
            return
    }

    private void l0(java.util.List<java.util.List<com.amap.api.location.DPoint>> r11) {
            r10 = this;
            if (r11 == 0) goto L7f
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto La
            goto L7f
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L13:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r11.next()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L22
            goto L13
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.amap.api.maps.model.PolygonOptions r3 = new com.amap.api.maps.model.PolygonOptions
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            com.amap.api.location.DPoint r4 = (com.amap.api.location.DPoint) r4
            com.amap.api.maps.model.LatLng r5 = new com.amap.api.maps.model.LatLng
            double r6 = r4.getLatitude()
            double r8 = r4.getLongitude()
            r5.<init>(r6, r8)
            r2.add(r5)
            goto L30
        L4d:
            r3.addAll(r2)
            android.content.Context r1 = r10.g
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099808(0x7f0600a0, float:1.781198E38)
            int r1 = r1.getColor(r2)
            r3.fillColor(r1)
            android.content.Context r1 = r10.g
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100554(0x7f06038a, float:1.7813493E38)
            int r1 = r1.getColor(r2)
            r3.strokeColor(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            r3.strokeWidth(r1)
            com.amap.api.maps.AMap r1 = r10.f1191q
            com.amap.api.maps.model.Polygon r1 = r1.addPolygon(r3)
            r0.add(r1)
            goto L13
        L7f:
            return
    }

    private void m0(java.util.List<com.amap.api.maps.model.LatLng> r4, java.util.List<java.lang.Integer> r5) {
            r3 = this;
            com.amap.api.maps.AMap r0 = r3.f1191q
            com.amap.api.maps.model.PolylineOptions r1 = new com.amap.api.maps.model.PolylineOptions
            r1.<init>()
            com.amap.api.maps.model.PolylineOptions r4 = r1.addAll(r4)
            android.content.Context r1 = r3.g
            r2 = 1084227584(0x40a00000, float:5.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            float r1 = (float) r1
            com.amap.api.maps.model.PolylineOptions r4 = r4.width(r1)
            com.amap.api.maps.model.PolylineOptions r4 = r4.colorValues(r5)
            r5 = 1
            com.amap.api.maps.model.PolylineOptions r4 = r4.useGradient(r5)
            android.content.Context r5 = r3.g
            int r5 = cn.bluemobi.dylan.base.utils.u.a(r2, r5)
            float r5 = (float) r5
            com.amap.api.maps.model.PolylineOptions r4 = r4.zIndex(r5)
            r0.addPolyline(r4)
            return
    }

    private void n0(java.lang.String r10) {
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L1a
            com.bxkj.student.run.app.record.TraceDetailFragment$c r0 = new com.bxkj.student.run.app.record.TraceDetailFragment$c
            r0.<init>(r9)
            java.lang.reflect.Type r0 = r0.getType()
            r1 = 0
            com.alibaba.fastjson.parser.Feature[] r1 = new com.alibaba.fastjson.parser.Feature[r1]
            java.lang.Object r10 = com.alibaba.fastjson.JSON.parseObject(r10, r0, r1)
            java.util.List r10 = (java.util.List) r10
            r9.f1196v = r10
        L1a:
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r10 = r9.f1196v
            if (r10 == 0) goto L6c
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L6c
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r0 = r9.f1196v
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r1.next()
            java.util.Map r3 = (java.util.Map) r3
            com.amap.api.location.DPoint r4 = new com.amap.api.location.DPoint
            java.lang.String r5 = "lat"
            double r5 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r5)
            java.lang.String r7 = "lng"
            double r7 = cn.bluemobi.dylan.http.JsonParse.getDouble(r3, r7)
            r4.<init>(r5, r7)
            r2.add(r4)
            goto L44
        L65:
            r10.add(r2)
            goto L2f
        L69:
            r9.l0(r10)
        L6c:
            return
    }

    private /* synthetic */ kotlin.n1 p0(java.util.List r9) {
            r8 = this;
            if (r9 == 0) goto L58
            int r0 = r9.size()
            if (r0 <= 0) goto L58
            r0 = 0
            java.lang.Object r9 = r9.get(r0)
            com.bxkj.student.run.app.offline.table.RunDb r9 = (com.bxkj.student.run.app.offline.table.RunDb) r9
            java.lang.String r1 = r9.getCountTime()
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.String r3 = r9.getDistance()
            float r3 = java.lang.Float.parseFloat(r3)
            double r3 = (double) r3
            java.lang.String r5 = com.bxkj.student.run.app.utils.i.a(r3, r1)
            java.lang.String r6 = com.bxkj.student.run.app.utils.i.b(r3, r1)
            android.widget.LinearLayout r7 = r8.j
            r7.setVisibility(r0)
            android.widget.TextView r0 = r8.f1186l
            r0.setText(r5)
            android.widget.TextView r0 = r8.f1188n
            r0.setText(r6)
            android.widget.TextView r0 = r8.f1187m
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.g(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r8.f1189o
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.d(r3)
            r0.setText(r1)
            java.lang.String r0 = r9.getPassLatLngList()
            r8.f1195u = r0
            java.lang.String r9 = r9.getLatLngList()
            r8.f1194t = r9
            r8.o0()
        L58:
            r9 = 0
            return r9
    }

    private void r0(android.graphics.Bitmap r5) {
            r4 = this;
            com.umeng.socialize.ShareAction r0 = new com.umeng.socialize.ShareAction
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            r0.<init>(r1)
            r1 = 4
            com.umeng.socialize.bean.SHARE_MEDIA[] r1 = new com.umeng.socialize.bean.SHARE_MEDIA[r1]
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r3 = 0
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            r3 = 1
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r3 = 2
            r1[r3] = r2
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            r3 = 3
            r1[r3] = r2
            com.umeng.socialize.ShareAction r0 = r0.setDisplayList(r1)
            com.bxkj.student.run.app.record.TraceDetailFragment$b r1 = new com.bxkj.student.run.app.record.TraceDetailFragment$b
            r1.<init>(r4, r5)
            com.umeng.socialize.ShareAction r5 = r0.setShareboardclickCallback(r1)
            r5.open()
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public java.lang.String c0(long r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L1b
            float r7 = (float) r7
            float r8 = (float) r2
            float r7 = r7 / r8
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r7
            java.lang.String r7 = "%.1f GB"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            return r7
        L1b:
            r2 = 1120403456(0x42c80000, float:100.0)
            r3 = 1048576(0x100000, double:5.180654E-318)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L3d
            float r7 = (float) r7
            float r8 = (float) r3
            float r7 = r7 / r8
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 <= 0) goto L2e
            java.lang.String r8 = "%.0f MB"
            goto L30
        L2e:
            java.lang.String r8 = "%.1f MB"
        L30:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = java.lang.String.format(r8, r1)
            return r7
        L3d:
            r3 = 1024(0x400, double:5.06E-321)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L5c
            float r7 = (float) r7
            float r8 = (float) r3
            float r7 = r7 / r8
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 <= 0) goto L4d
            java.lang.String r8 = "%.0f KB"
            goto L4f
        L4d:
            java.lang.String r8 = "%.1f KB"
        L4f:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = java.lang.String.format(r8, r1)
            return r7
        L5c:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r7
            java.lang.String r7 = "%d B"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            return r7
    }

    public android.graphics.Bitmap d0(android.view.View r2) {
            r1 = this;
            r0 = 1
            r2.setDrawingCacheEnabled(r0)
            r2.buildDrawingCache()
            android.graphics.Bitmap r2 = r2.getDrawingCache()
            return r2
    }

    public void e() {
            r4 = this;
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            r0.<init>(r4)
            java.lang.Class<com.bxkj.student.run.app.vm.RunVM> r1 = com.bxkj.student.run.app.vm.RunVM.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            com.bxkj.student.run.app.vm.RunVM r0 = (com.bxkj.student.run.app.vm.RunVM) r0
            r4.f1193s = r0
            android.widget.LinearLayout r0 = r4.j
            r1 = 8
            r0.setVisibility(r1)
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "latLngTimeSpeed"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L9e
            android.widget.LinearLayout r0 = r4.j
            r2 = 0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r4.f1186l
            android.os.Bundle r2 = r4.getArguments()
            java.lang.String r3 = "speed"
            java.lang.String r2 = r2.getString(r3)
            r0.setText(r2)
            android.widget.TextView r0 = r4.f1188n
            android.os.Bundle r2 = r4.getArguments()
            java.lang.String r3 = "peisu"
            java.lang.String r2 = r2.getString(r3)
            r0.setText(r2)
            android.widget.TextView r0 = r4.f1187m
            android.os.Bundle r2 = r4.getArguments()
            java.lang.String r3 = "time"
            java.lang.String r2 = r2.getString(r3)
            r0.setText(r2)
            android.widget.TextView r0 = r4.f1189o
            android.os.Bundle r2 = r4.getArguments()
            java.lang.String r3 = "distance"
            java.lang.String r2 = r2.getString(r3)
            r0.setText(r2)
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r2 = "okPointList"
            java.lang.String r0 = r0.getString(r2)
            r4.f1195u = r0
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            r4.f1194t = r0
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "geoFence"
            java.lang.String r0 = r0.getString(r1)
            r4.n0(r0)
            r4.o0()
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "punchCoordinate"
            java.lang.String r0 = r0.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lbc
            r4.a0(r0)
            return
        L9e:
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "runDataDbId"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Lbc
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r0 = r0.getString(r1)
            com.bxkj.student.run.app.vm.RunVM r1 = r4.f1193s
            com.bxkj.student.run.app.record.n r2 = new com.bxkj.student.run.app.record.n
            r2.<init>(r4)
            r1.w(r0, r2)
        Lbc:
            return
    }

    protected void f(android.view.View r4) {
            r3 = this;
            r4 = 2131298068(0x7f090714, float:1.8214099E38)
            android.view.View r4 = r3.c(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.j = r4
            r4 = 2131298015(0x7f0906df, float:1.8213991E38)
            android.view.View r4 = r3.c(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.k = r4
            r4 = 2131299109(0x7f090b25, float:1.821621E38)
            android.view.View r4 = r3.c(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f1186l = r4
            r4 = 2131299158(0x7f090b56, float:1.821631E38)
            android.view.View r4 = r3.c(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f1187m = r4
            r4 = 2131299022(0x7f090ace, float:1.8216034E38)
            android.view.View r4 = r3.c(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f1188n = r4
            r4 = 2131298881(0x7f090a41, float:1.8215748E38)
            android.view.View r4 = r3.c(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f1189o = r4
            r4 = 2131298420(0x7f090874, float:1.8214813E38)
            android.view.View r4 = r3.c(r4)
            com.bxkj.student.run.app.utils.RecordPathView r4 = (com.bxkj.student.run.app.utils.RecordPathView) r4
            r3.f1192r = r4
            r4 = 2131298111(0x7f09073f, float:1.8214186E38)
            android.view.View r4 = r3.c(r4)
            com.amap.api.maps.TextureMapView r4 = (com.amap.api.maps.TextureMapView) r4
            r3.f1190p = r4
            com.amap.api.maps.AMap r4 = r4.getMap()
            r3.f1191q = r4
            com.amap.api.maps.TextureMapView r4 = r3.f1190p
            android.os.Bundle r0 = r3.f1197w
            r4.onCreate(r0)
            com.amap.api.maps.TextureMapView r4 = r3.f1190p
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            android.content.Context r1 = r3.g
            r2 = 2131100543(0x7f06037f, float:1.781347E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.<init>(r1)
            r4.setForeground(r0)
            return
    }

    protected int i() {
            r1 = this;
            r0 = 2131493201(0x7f0c0151, float:1.8609875E38)
            return r0
    }

    public void o0() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r10.f1194t
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Le
            goto L4c
        Le:
            r1 = 0
            java.lang.String r2 = r10.f1194t     // Catch: java.lang.Exception -> L23
            com.bxkj.student.run.app.record.TraceDetailFragment$d r3 = new com.bxkj.student.run.app.record.TraceDetailFragment$d     // Catch: java.lang.Exception -> L23
            r3.<init>(r10)     // Catch: java.lang.Exception -> L23
            java.lang.reflect.Type r3 = r3.getType()     // Catch: java.lang.Exception -> L23
            com.alibaba.fastjson.parser.Feature[] r4 = new com.alibaba.fastjson.parser.Feature[r1]     // Catch: java.lang.Exception -> L23
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r2, r3, r4)     // Catch: java.lang.Exception -> L23
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L23
            r0 = r2
        L23:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r10.f1195u     // Catch: java.lang.Exception -> L45
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L45
            if (r3 != 0) goto L46
            java.lang.String r3 = r10.f1195u     // Catch: java.lang.Exception -> L45
            com.bxkj.student.run.app.record.TraceDetailFragment$e r4 = new com.bxkj.student.run.app.record.TraceDetailFragment$e     // Catch: java.lang.Exception -> L45
            r4.<init>(r10)     // Catch: java.lang.Exception -> L45
            java.lang.reflect.Type r4 = r4.getType()     // Catch: java.lang.Exception -> L45
            com.alibaba.fastjson.parser.Feature[] r5 = new com.alibaba.fastjson.parser.Feature[r1]     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = com.alibaba.fastjson.JSON.parseObject(r3, r4, r5)     // Catch: java.lang.Exception -> L45
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L45
            r2 = r3
            goto L46
        L45:
        L46:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L4d
        L4c:
            return
        L4d:
            java.util.Iterator r3 = r0.iterator()
        L51:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r3.next()
            java.util.Map r4 = (java.util.Map) r4
            com.amap.api.maps.model.LatLng r5 = new com.amap.api.maps.model.LatLng
            java.lang.String r6 = "latitude"
            double r6 = cn.bluemobi.dylan.http.JsonParse.getDouble(r4, r6)
            java.lang.String r8 = "longitude"
            double r8 = cn.bluemobi.dylan.http.JsonParse.getDouble(r4, r8)
            r5.<init>(r6, r8)
            java.util.List<com.amap.api.maps.model.LatLng> r4 = r10.f1198x
            r4.add(r5)
            goto L51
        L74:
            java.util.List<com.amap.api.maps.model.LatLng> r3 = r10.f1198x
            r4 = 1
            if (r3 == 0) goto Lcc
            int r3 = r3.size()
            r5 = 2
            if (r3 <= r5) goto Lcc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "优化前latLngs="
            r3.append(r5)
            java.util.List<com.amap.api.maps.model.LatLng> r5 = r10.f1198x
            int r5 = r5.size()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.orhanobut.logger.j.c(r3)
            com.bxkj.student.run.app.utils.p r3 = new com.bxkj.student.run.app.utils.p
            r3.<init>()
            r3.p(r4)
            java.util.List<com.amap.api.maps.model.LatLng> r5 = r10.f1198x
            java.util.List r3 = r3.k(r5)
            if (r3 == 0) goto Lb2
            int r5 = r3.size()
            if (r5 <= 0) goto Lb2
            r10.f1198x = r3
        Lb2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "优化后latLngs="
            r3.append(r5)
            java.util.List<com.amap.api.maps.model.LatLng> r5 = r10.f1198x
            int r5 = r5.size()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.orhanobut.logger.j.c(r3)
        Lcc:
            java.util.List<com.amap.api.maps.model.LatLng> r3 = r10.f1198x
            int r3 = r3.size()
            if (r3 != r4) goto Ldf
            java.util.List<com.amap.api.maps.model.LatLng> r3 = r10.f1198x
            java.lang.Object r5 = r3.get(r1)
            com.amap.api.maps.model.LatLng r5 = (com.amap.api.maps.model.LatLng) r5
            r3.add(r5)
        Ldf:
            r3 = 2131689681(0x7f0f00d1, float:1.9008384E38)
            com.amap.api.maps.model.BitmapDescriptor r3 = com.amap.api.maps.model.BitmapDescriptorFactory.fromResource(r3)
            com.amap.api.maps.model.MarkerOptions r5 = new com.amap.api.maps.model.MarkerOptions
            r5.<init>()
            java.util.List<com.amap.api.maps.model.LatLng> r6 = r10.f1198x
            java.lang.Object r1 = r6.get(r1)
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            com.amap.api.maps.model.MarkerOptions r1 = r5.position(r1)
            com.amap.api.maps.model.MarkerOptions r1 = r1.icon(r3)
            r3 = 1091567616(0x41100000, float:9.0)
            com.amap.api.maps.model.MarkerOptions r1 = r1.zIndex(r3)
            com.amap.api.maps.model.MarkerOptions r1 = r1.draggable(r4)
            com.amap.api.maps.AMap r3 = r10.f1191q
            com.amap.api.maps.model.Marker r1 = r3.addMarker(r1)
            com.amap.api.maps.model.animation.ScaleAnimation r3 = new com.amap.api.maps.model.animation.ScaleAnimation
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r5, r4, r5)
            r4 = 1000(0x3e8, double:4.94E-321)
            r3.setDuration(r4)
            r1.setAnimation(r3)
            r1.startAnimation()
            com.amap.api.maps.AMap r1 = r10.f1191q
            com.bxkj.student.run.app.record.TraceDetailFragment$f r3 = new com.bxkj.student.run.app.record.TraceDetailFragment$f
            r3.<init>(r10, r0, r2)
            r1.setOnCameraChangeListener(r3)
            com.amap.api.maps.model.LatLngBounds$Builder r0 = com.amap.api.maps.model.LatLngBounds.builder()
            com.amap.api.maps.model.LatLngBounds r1 = r0.build()
            java.util.List<com.amap.api.maps.model.LatLng> r2 = r10.f1198x
            java.util.Iterator r2 = r2.iterator()
        L136:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L14b
            java.lang.Object r1 = r2.next()
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            com.amap.api.maps.model.LatLngBounds$Builder r1 = r0.include(r1)
            com.amap.api.maps.model.LatLngBounds r1 = r1.build()
            goto L136
        L14b:
            com.amap.api.maps.AMap r0 = r10.f1191q
            r2 = 1112014848(0x42480000, float:50.0)
            android.content.Context r3 = r10.g
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            com.amap.api.maps.CameraUpdate r1 = com.amap.api.maps.CameraUpdateFactory.newLatLngBounds(r1, r2)
            r2 = 2000(0x7d0, double:9.88E-321)
            r4 = 0
            r0.animateCamera(r1, r2, r4)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r1) {
            r0 = this;
            super/*androidx.fragment.app.Fragment*/.onCreate(r1)
            r0.f1197w = r1
            return
    }

    public void onDestroy() {
            r1 = this;
            com.amap.api.maps.TextureMapView r0 = r1.f1190p
            r0.onDestroy()
            super/*androidx.fragment.app.Fragment*/.onDestroy()
            return
    }

    public void onPause() {
            r1 = this;
            super.onPause()
            com.amap.api.maps.TextureMapView r0 = r1.f1190p
            r0.onPause()
            return
    }

    public void onResume() {
            r1 = this;
            super/*androidx.fragment.app.Fragment*/.onResume()
            com.amap.api.maps.TextureMapView r0 = r1.f1190p
            r0.onResume()
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.amap.api.maps.TextureMapView r0 = r1.f1190p
            r0.onSaveInstanceState(r2)
            super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(r2)
            return
    }

    protected void q0() {
            r2 = this;
            com.amap.api.maps.AMap r0 = r2.f1191q
            com.bxkj.student.run.app.record.TraceDetailFragment$a r1 = new com.bxkj.student.run.app.record.TraceDetailFragment$a
            r1.<init>(r2)
            r0.getMapScreenShot(r1)
            return
    }
}
