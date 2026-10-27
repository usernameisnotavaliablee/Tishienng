package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class v0 implements com.amap.api.services.interfaces.IShareSearch {

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f4750c = "http://wb.amap.com/?r=%f,%f,%s,%f,%f,%s,%d,%d,%d,%s,%s,%s&sourceapplication=openapi/0";

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f4751d = "http://wb.amap.com/?q=%f,%f,%s&sourceapplication=openapi/0";

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f4752e = "http://wb.amap.com/?n=%f,%f,%f,%f,%d&sourceapplication=openapi/0";

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.String f4753f = "http://wb.amap.com/?p=%s,%f,%f,%s,%s&sourceapplication=openapi/0";

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f4754g = "";
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.share.ShareSearch.OnShareSearchListener f4755b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.core.PoiItem a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.v0 f4756b;

        a(com.amap.api.col.s.v0 r1, com.amap.api.services.core.PoiItem r2) {
                r0 = this;
                r0.f4756b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.v0 r0 = r4.f4756b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r0 = com.amap.api.col.s.v0.a(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 11
                r0.arg1 = r1
                r1 = 1100(0x44c, float:1.541E-42)
                r0.what = r1
                com.amap.api.col.s.v0 r1 = r4.f4756b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r1 = com.amap.api.col.s.v0.a(r1)
                r0.obj = r1
                com.amap.api.col.s.v0 r1 = r4.f4756b     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                com.amap.api.services.core.PoiItem r2 = r4.a     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r1 = r1.searchPoiShareUrl(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r2.<init>()     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r3 = "shareurlkey"
                r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r0.setData(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
            L3a:
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
                r1.sendMessage(r0)
                return
            L42:
                r1 = move-exception
                goto L4c
            L44:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L42
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42
                goto L3a
            L4c:
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                r2.sendMessage(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.share.ShareSearch.ShareBusRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.v0 f4757b;

        b(com.amap.api.col.s.v0 r1, com.amap.api.services.share.ShareSearch.ShareBusRouteQuery r2) {
                r0 = this;
                r0.f4757b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.v0 r0 = r4.f4757b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r0 = com.amap.api.col.s.v0.a(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 11
                r0.arg1 = r1
                r1 = 1103(0x44f, float:1.546E-42)
                r0.what = r1
                com.amap.api.col.s.v0 r1 = r4.f4757b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r1 = com.amap.api.col.s.v0.a(r1)
                r0.obj = r1
                com.amap.api.col.s.v0 r1 = r4.f4757b     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                com.amap.api.services.share.ShareSearch$ShareBusRouteQuery r2 = r4.a     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r1 = r1.searchBusRouteShareUrl(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r2.<init>()     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r3 = "shareurlkey"
                r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r0.setData(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
            L3a:
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
                r1.sendMessage(r0)
                return
            L42:
                r1 = move-exception
                goto L4c
            L44:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L42
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42
                goto L3a
            L4c:
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                r2.sendMessage(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.share.ShareSearch.ShareWalkRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.v0 f4758b;

        c(com.amap.api.col.s.v0 r1, com.amap.api.services.share.ShareSearch.ShareWalkRouteQuery r2) {
                r0 = this;
                r0.f4758b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.v0 r0 = r4.f4758b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r0 = com.amap.api.col.s.v0.a(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 11
                r0.arg1 = r1
                r1 = 1105(0x451, float:1.548E-42)
                r0.what = r1
                com.amap.api.col.s.v0 r1 = r4.f4758b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r1 = com.amap.api.col.s.v0.a(r1)
                r0.obj = r1
                com.amap.api.col.s.v0 r1 = r4.f4758b     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                com.amap.api.services.share.ShareSearch$ShareWalkRouteQuery r2 = r4.a     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r1 = r1.searchWalkRouteShareUrl(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r2.<init>()     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r3 = "shareurlkey"
                r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r0.setData(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
            L3a:
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
                r1.sendMessage(r0)
                return
            L42:
                r1 = move-exception
                goto L4c
            L44:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L42
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42
                goto L3a
            L4c:
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                r2.sendMessage(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class d implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.share.ShareSearch.ShareDrivingRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.v0 f4759b;

        d(com.amap.api.col.s.v0 r1, com.amap.api.services.share.ShareSearch.ShareDrivingRouteQuery r2) {
                r0 = this;
                r0.f4759b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.v0 r0 = r4.f4759b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r0 = com.amap.api.col.s.v0.a(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 11
                r0.arg1 = r1
                r1 = 1104(0x450, float:1.547E-42)
                r0.what = r1
                com.amap.api.col.s.v0 r1 = r4.f4759b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r1 = com.amap.api.col.s.v0.a(r1)
                r0.obj = r1
                com.amap.api.col.s.v0 r1 = r4.f4759b     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                com.amap.api.services.share.ShareSearch$ShareDrivingRouteQuery r2 = r4.a     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r1 = r1.searchDrivingRouteShareUrl(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r2.<init>()     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r3 = "shareurlkey"
                r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r0.setData(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
            L3a:
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
                r1.sendMessage(r0)
                return
            L42:
                r1 = move-exception
                goto L4c
            L44:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L42
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42
                goto L3a
            L4c:
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                r2.sendMessage(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class e implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.share.ShareSearch.ShareNaviQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.v0 f4760b;

        e(com.amap.api.col.s.v0 r1, com.amap.api.services.share.ShareSearch.ShareNaviQuery r2) {
                r0 = this;
                r0.f4760b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.v0 r0 = r4.f4760b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r0 = com.amap.api.col.s.v0.a(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 11
                r0.arg1 = r1
                r1 = 1102(0x44e, float:1.544E-42)
                r0.what = r1
                com.amap.api.col.s.v0 r1 = r4.f4760b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r1 = com.amap.api.col.s.v0.a(r1)
                r0.obj = r1
                com.amap.api.col.s.v0 r1 = r4.f4760b     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                com.amap.api.services.share.ShareSearch$ShareNaviQuery r2 = r4.a     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r1 = r1.searchNaviShareUrl(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r2.<init>()     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r3 = "shareurlkey"
                r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r0.setData(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
            L3a:
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
                r1.sendMessage(r0)
                return
            L42:
                r1 = move-exception
                goto L4c
            L44:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L42
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42
                goto L3a
            L4c:
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                r2.sendMessage(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class f implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.core.LatLonSharePoint a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.v0 f4761b;

        f(com.amap.api.col.s.v0 r1, com.amap.api.services.core.LatLonSharePoint r2) {
                r0 = this;
                r0.f4761b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.v0 r0 = r4.f4761b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r0 = com.amap.api.col.s.v0.a(r0)
                if (r0 != 0) goto L9
                return
            L9:
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                r1 = 11
                r0.arg1 = r1
                r1 = 1101(0x44d, float:1.543E-42)
                r0.what = r1
                com.amap.api.col.s.v0 r1 = r4.f4761b
                com.amap.api.services.share.ShareSearch$OnShareSearchListener r1 = com.amap.api.col.s.v0.a(r1)
                r0.obj = r1
                com.amap.api.col.s.v0 r1 = r4.f4761b     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                com.amap.api.services.core.LatLonSharePoint r2 = r4.a     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r1 = r1.searchLocationShareUrl(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r2.<init>()     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                java.lang.String r3 = "shareurlkey"
                r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r0.setData(r2)     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42 com.amap.api.services.core.AMapException -> L44
            L3a:
                com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
                r1.sendMessage(r0)
                return
            L42:
                r1 = move-exception
                goto L4c
            L44:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L42
                r0.arg2 = r1     // Catch: java.lang.Throwable -> L42
                goto L3a
            L4c:
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                r2.sendMessage(r0)
                throw r1
        }
    }

    static {
            return
    }

    public v0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L15
            r3.a = r4
            return
        L15:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r2 = 1
            r4.<init>(r1, r2, r1, r0)
            throw r4
    }

    static /* synthetic */ com.amap.api.services.share.ShareSearch.OnShareSearchListener a(com.amap.api.col.s.v0 r0) {
            com.amap.api.services.share.ShareSearch$OnShareSearchListener r0 = r0.f4755b
            return r0
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final java.lang.String searchBusRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareBusRouteQuery r13) throws com.amap.api.services.core.AMapException {
            r12 = this;
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r13 == 0) goto L9e
            int r1 = r13.getBusMode()     // Catch: com.amap.api.services.core.AMapException -> L96
            com.amap.api.services.share.ShareSearch$ShareFromAndTo r13 = r13.getShareFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L96
            com.amap.api.services.core.LatLonPoint r2 = r13.getFrom()     // Catch: com.amap.api.services.core.AMapException -> L96
            if (r2 == 0) goto L98
            com.amap.api.services.core.LatLonPoint r2 = r13.getTo()     // Catch: com.amap.api.services.core.AMapException -> L96
            if (r2 == 0) goto L98
            com.amap.api.services.core.LatLonPoint r0 = r13.getFrom()     // Catch: com.amap.api.services.core.AMapException -> L96
            com.amap.api.services.core.LatLonPoint r2 = r13.getTo()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r3 = r13.getFromName()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r13 = r13.getToName()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r4 = com.amap.api.col.s.v0.f4750c     // Catch: com.amap.api.services.core.AMapException -> L96
            double r5 = r0.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch: com.amap.api.services.core.AMapException -> L96
            double r6 = r0.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Double r0 = java.lang.Double.valueOf(r6)     // Catch: com.amap.api.services.core.AMapException -> L96
            double r6 = r2.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch: com.amap.api.services.core.AMapException -> L96
            double r7 = r2.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Double r2 = java.lang.Double.valueOf(r7)     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: com.amap.api.services.core.AMapException -> L96
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch: com.amap.api.services.core.AMapException -> L96
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch: com.amap.api.services.core.AMapException -> L96
            r11 = 12
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: com.amap.api.services.core.AMapException -> L96
            r11[r9] = r5     // Catch: com.amap.api.services.core.AMapException -> L96
            r11[r7] = r0     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 2
            r11[r0] = r3     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 3
            r11[r0] = r6     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 4
            r11[r0] = r2     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 5
            r11[r0] = r13     // Catch: com.amap.api.services.core.AMapException -> L96
            r13 = 6
            r11[r13] = r1     // Catch: com.amap.api.services.core.AMapException -> L96
            r13 = 7
            r11[r13] = r8     // Catch: com.amap.api.services.core.AMapException -> L96
            r13 = 8
            r11[r13] = r10     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r13 = com.amap.api.col.s.v0.f4754g     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 9
            r11[r0] = r13     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 10
            r11[r0] = r13     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 11
            r11[r0] = r13     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r13 = java.lang.String.format(r4, r11)     // Catch: com.amap.api.services.core.AMapException -> L96
            com.amap.api.col.s.v r0 = new com.amap.api.col.s.v     // Catch: com.amap.api.services.core.AMapException -> L96
            android.content.Context r1 = r12.a     // Catch: com.amap.api.services.core.AMapException -> L96
            r0.<init>(r1, r13)     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Object r13 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r13 = (java.lang.String) r13     // Catch: com.amap.api.services.core.AMapException -> L96
            return r13
        L96:
            r13 = move-exception
            goto La4
        L98:
            com.amap.api.services.core.AMapException r13 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L96
            r13.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L96
            throw r13     // Catch: com.amap.api.services.core.AMapException -> L96
        L9e:
            com.amap.api.services.core.AMapException r13 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L96
            r13.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L96
            throw r13     // Catch: com.amap.api.services.core.AMapException -> L96
        La4:
            java.lang.String r0 = "ShareSearch"
            java.lang.String r1 = "searchBusRouteShareUrl"
            com.amap.api.col.s.j4.i(r13, r0, r1)
            throw r13
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchBusRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareBusRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.v0$b r1 = new com.amap.api.col.s.v0$b     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final java.lang.String searchDrivingRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareDrivingRouteQuery r12) throws com.amap.api.services.core.AMapException {
            r11 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "无效的参数 - IllegalArgumentException"
            if (r12 == 0) goto L9a
            int r3 = r12.getDrivingMode()     // Catch: com.amap.api.services.core.AMapException -> L92
            com.amap.api.services.share.ShareSearch$ShareFromAndTo r12 = r12.getShareFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L92
            com.amap.api.services.core.LatLonPoint r4 = r12.getFrom()     // Catch: com.amap.api.services.core.AMapException -> L92
            if (r4 == 0) goto L94
            com.amap.api.services.core.LatLonPoint r4 = r12.getTo()     // Catch: com.amap.api.services.core.AMapException -> L92
            if (r4 == 0) goto L94
            com.amap.api.services.core.LatLonPoint r2 = r12.getFrom()     // Catch: com.amap.api.services.core.AMapException -> L92
            com.amap.api.services.core.LatLonPoint r4 = r12.getTo()     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.String r5 = r12.getFromName()     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.String r12 = r12.getToName()     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.String r6 = com.amap.api.col.s.v0.f4750c     // Catch: com.amap.api.services.core.AMapException -> L92
            double r7 = r2.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch: com.amap.api.services.core.AMapException -> L92
            double r8 = r2.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.Double r2 = java.lang.Double.valueOf(r8)     // Catch: com.amap.api.services.core.AMapException -> L92
            double r8 = r4.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch: com.amap.api.services.core.AMapException -> L92
            double r9 = r4.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.Double r4 = java.lang.Double.valueOf(r9)     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: com.amap.api.services.core.AMapException -> L92
            r9 = 12
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: com.amap.api.services.core.AMapException -> L92
            r9[r0] = r7     // Catch: com.amap.api.services.core.AMapException -> L92
            r0 = 1
            r9[r0] = r2     // Catch: com.amap.api.services.core.AMapException -> L92
            r0 = 2
            r9[r0] = r5     // Catch: com.amap.api.services.core.AMapException -> L92
            r0 = 3
            r9[r0] = r8     // Catch: com.amap.api.services.core.AMapException -> L92
            r0 = 4
            r9[r0] = r4     // Catch: com.amap.api.services.core.AMapException -> L92
            r0 = 5
            r9[r0] = r12     // Catch: com.amap.api.services.core.AMapException -> L92
            r12 = 6
            r9[r12] = r3     // Catch: com.amap.api.services.core.AMapException -> L92
            r12 = 7
            r9[r12] = r1     // Catch: com.amap.api.services.core.AMapException -> L92
            r12 = 8
            r9[r12] = r1     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.String r12 = com.amap.api.col.s.v0.f4754g     // Catch: com.amap.api.services.core.AMapException -> L92
            r0 = 9
            r9[r0] = r12     // Catch: com.amap.api.services.core.AMapException -> L92
            r0 = 10
            r9[r0] = r12     // Catch: com.amap.api.services.core.AMapException -> L92
            r0 = 11
            r9[r0] = r12     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.String r12 = java.lang.String.format(r6, r9)     // Catch: com.amap.api.services.core.AMapException -> L92
            com.amap.api.col.s.v r0 = new com.amap.api.col.s.v     // Catch: com.amap.api.services.core.AMapException -> L92
            android.content.Context r1 = r11.a     // Catch: com.amap.api.services.core.AMapException -> L92
            r0.<init>(r1, r12)     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.Object r12 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L92
            java.lang.String r12 = (java.lang.String) r12     // Catch: com.amap.api.services.core.AMapException -> L92
            return r12
        L92:
            r12 = move-exception
            goto La0
        L94:
            com.amap.api.services.core.AMapException r12 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L92
            r12.<init>(r2)     // Catch: com.amap.api.services.core.AMapException -> L92
            throw r12     // Catch: com.amap.api.services.core.AMapException -> L92
        L9a:
            com.amap.api.services.core.AMapException r12 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L92
            r12.<init>(r2)     // Catch: com.amap.api.services.core.AMapException -> L92
            throw r12     // Catch: com.amap.api.services.core.AMapException -> L92
        La0:
            java.lang.String r0 = "ShareSearch"
            java.lang.String r1 = "searchDrivingRouteShareUrl"
            com.amap.api.col.s.j4.i(r12, r0, r1)
            throw r12
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchDrivingRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareDrivingRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.v0$d r1 = new com.amap.api.col.s.v0$d     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final java.lang.String searchLocationShareUrl(com.amap.api.services.core.LatLonSharePoint r6) throws com.amap.api.services.core.AMapException {
            r5 = this;
            if (r6 == 0) goto L38
            java.lang.String r0 = com.amap.api.col.s.v0.f4751d     // Catch: com.amap.api.services.core.AMapException -> L36
            double r1 = r6.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L36
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: com.amap.api.services.core.AMapException -> L36
            double r2 = r6.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L36
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: com.amap.api.services.core.AMapException -> L36
            java.lang.String r6 = r6.getSharePointName()     // Catch: com.amap.api.services.core.AMapException -> L36
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: com.amap.api.services.core.AMapException -> L36
            r4 = 0
            r3[r4] = r1     // Catch: com.amap.api.services.core.AMapException -> L36
            r1 = 1
            r3[r1] = r2     // Catch: com.amap.api.services.core.AMapException -> L36
            r1 = 2
            r3[r1] = r6     // Catch: com.amap.api.services.core.AMapException -> L36
            java.lang.String r6 = java.lang.String.format(r0, r3)     // Catch: com.amap.api.services.core.AMapException -> L36
            com.amap.api.col.s.v r0 = new com.amap.api.col.s.v     // Catch: com.amap.api.services.core.AMapException -> L36
            android.content.Context r1 = r5.a     // Catch: com.amap.api.services.core.AMapException -> L36
            r0.<init>(r1, r6)     // Catch: com.amap.api.services.core.AMapException -> L36
            java.lang.Object r6 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L36
            java.lang.String r6 = (java.lang.String) r6     // Catch: com.amap.api.services.core.AMapException -> L36
            return r6
        L36:
            r6 = move-exception
            goto L40
        L38:
            com.amap.api.services.core.AMapException r6 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L36
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r6.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L36
            throw r6     // Catch: com.amap.api.services.core.AMapException -> L36
        L40:
            java.lang.String r0 = "ShareSearch"
            java.lang.String r1 = "searchLocationShareUrl"
            com.amap.api.col.s.j4.i(r6, r0, r1)
            throw r6
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchLocationShareUrlAsyn(com.amap.api.services.core.LatLonSharePoint r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.v0$f r1 = new com.amap.api.col.s.v0$f     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final java.lang.String searchNaviShareUrl(com.amap.api.services.share.ShareSearch.ShareNaviQuery r14) throws com.amap.api.services.core.AMapException {
            r13 = this;
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r14 == 0) goto L9a
            com.amap.api.services.share.ShareSearch$ShareFromAndTo r1 = r14.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L4e
            com.amap.api.services.core.LatLonPoint r2 = r1.getTo()     // Catch: com.amap.api.services.core.AMapException -> L4e
            if (r2 == 0) goto L94
            com.amap.api.services.core.LatLonPoint r0 = r1.getFrom()     // Catch: com.amap.api.services.core.AMapException -> L4e
            com.amap.api.services.core.LatLonPoint r2 = r1.getTo()     // Catch: com.amap.api.services.core.AMapException -> L4e
            int r14 = r14.getNaviMode()     // Catch: com.amap.api.services.core.AMapException -> L4e
            com.amap.api.services.core.LatLonPoint r1 = r1.getFrom()     // Catch: com.amap.api.services.core.AMapException -> L4e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 5
            if (r1 != 0) goto L50
            java.lang.String r0 = com.amap.api.col.s.v0.f4752e     // Catch: com.amap.api.services.core.AMapException -> L4e
            double r9 = r2.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Double r1 = java.lang.Double.valueOf(r9)     // Catch: com.amap.api.services.core.AMapException -> L4e
            double r9 = r2.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Double r2 = java.lang.Double.valueOf(r9)     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: com.amap.api.services.core.AMapException -> L4e
            r9 = 0
            r8[r7] = r9     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r6] = r9     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r5] = r1     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r4] = r2     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r3] = r14     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r14 = java.lang.String.format(r0, r8)     // Catch: com.amap.api.services.core.AMapException -> L4e
            goto L86
        L4e:
            r14 = move-exception
            goto La0
        L50:
            java.lang.String r1 = com.amap.api.col.s.v0.f4752e     // Catch: com.amap.api.services.core.AMapException -> L4e
            double r9 = r0.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch: com.amap.api.services.core.AMapException -> L4e
            double r10 = r0.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Double r0 = java.lang.Double.valueOf(r10)     // Catch: com.amap.api.services.core.AMapException -> L4e
            double r10 = r2.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch: com.amap.api.services.core.AMapException -> L4e
            double r11 = r2.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Double r2 = java.lang.Double.valueOf(r11)     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r7] = r9     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r6] = r0     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r5] = r10     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r4] = r2     // Catch: com.amap.api.services.core.AMapException -> L4e
            r8[r3] = r14     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r14 = java.lang.String.format(r1, r8)     // Catch: com.amap.api.services.core.AMapException -> L4e
        L86:
            com.amap.api.col.s.v r0 = new com.amap.api.col.s.v     // Catch: com.amap.api.services.core.AMapException -> L4e
            android.content.Context r1 = r13.a     // Catch: com.amap.api.services.core.AMapException -> L4e
            r0.<init>(r1, r14)     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Object r14 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r14 = (java.lang.String) r14     // Catch: com.amap.api.services.core.AMapException -> L4e
            return r14
        L94:
            com.amap.api.services.core.AMapException r14 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L4e
            r14.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L4e
            throw r14     // Catch: com.amap.api.services.core.AMapException -> L4e
        L9a:
            com.amap.api.services.core.AMapException r14 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L4e
            r14.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L4e
            throw r14     // Catch: com.amap.api.services.core.AMapException -> L4e
        La0:
            java.lang.String r0 = "ShareSearch"
            java.lang.String r1 = "searchNaviShareUrl"
            com.amap.api.col.s.j4.i(r14, r0, r1)
            throw r14
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchNaviShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareNaviQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.v0$e r1 = new com.amap.api.col.s.v0$e     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final java.lang.String searchPoiShareUrl(com.amap.api.services.core.PoiItem r8) throws com.amap.api.services.core.AMapException {
            r7 = this;
            if (r8 == 0) goto L50
            com.amap.api.services.core.LatLonPoint r0 = r8.getLatLonPoint()     // Catch: com.amap.api.services.core.AMapException -> L4e
            if (r0 == 0) goto L50
            com.amap.api.services.core.LatLonPoint r0 = r8.getLatLonPoint()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r1 = com.amap.api.col.s.v0.f4753f     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r2 = r8.getPoiId()     // Catch: com.amap.api.services.core.AMapException -> L4e
            double r3 = r0.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: com.amap.api.services.core.AMapException -> L4e
            double r4 = r0.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Double r0 = java.lang.Double.valueOf(r4)     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r4 = r8.getTitle()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r8 = r8.getSnippet()     // Catch: com.amap.api.services.core.AMapException -> L4e
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: com.amap.api.services.core.AMapException -> L4e
            r6 = 0
            r5[r6] = r2     // Catch: com.amap.api.services.core.AMapException -> L4e
            r2 = 1
            r5[r2] = r3     // Catch: com.amap.api.services.core.AMapException -> L4e
            r2 = 2
            r5[r2] = r0     // Catch: com.amap.api.services.core.AMapException -> L4e
            r0 = 3
            r5[r0] = r4     // Catch: com.amap.api.services.core.AMapException -> L4e
            r0 = 4
            r5[r0] = r8     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r8 = java.lang.String.format(r1, r5)     // Catch: com.amap.api.services.core.AMapException -> L4e
            com.amap.api.col.s.v r0 = new com.amap.api.col.s.v     // Catch: com.amap.api.services.core.AMapException -> L4e
            android.content.Context r1 = r7.a     // Catch: com.amap.api.services.core.AMapException -> L4e
            r0.<init>(r1, r8)     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.Object r8 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r8 = (java.lang.String) r8     // Catch: com.amap.api.services.core.AMapException -> L4e
            return r8
        L4e:
            r8 = move-exception
            goto L58
        L50:
            com.amap.api.services.core.AMapException r8 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L4e
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r8.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L4e
            throw r8     // Catch: com.amap.api.services.core.AMapException -> L4e
        L58:
            java.lang.String r0 = "ShareSearch"
            java.lang.String r1 = "searchPoiShareUrl"
            com.amap.api.col.s.j4.i(r8, r0, r1)
            throw r8
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchPoiShareUrlAsyn(com.amap.api.services.core.PoiItem r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.v0$a r1 = new com.amap.api.col.s.v0$a     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final java.lang.String searchWalkRouteShareUrl(com.amap.api.services.share.ShareSearch.ShareWalkRouteQuery r13) throws com.amap.api.services.core.AMapException {
            r12 = this;
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r13 == 0) goto L9e
            int r1 = r13.getWalkMode()     // Catch: com.amap.api.services.core.AMapException -> L96
            com.amap.api.services.share.ShareSearch$ShareFromAndTo r13 = r13.getShareFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L96
            com.amap.api.services.core.LatLonPoint r2 = r13.getFrom()     // Catch: com.amap.api.services.core.AMapException -> L96
            if (r2 == 0) goto L98
            com.amap.api.services.core.LatLonPoint r2 = r13.getTo()     // Catch: com.amap.api.services.core.AMapException -> L96
            if (r2 == 0) goto L98
            com.amap.api.services.core.LatLonPoint r0 = r13.getFrom()     // Catch: com.amap.api.services.core.AMapException -> L96
            com.amap.api.services.core.LatLonPoint r2 = r13.getTo()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r3 = r13.getFromName()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r13 = r13.getToName()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r4 = com.amap.api.col.s.v0.f4750c     // Catch: com.amap.api.services.core.AMapException -> L96
            double r5 = r0.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch: com.amap.api.services.core.AMapException -> L96
            double r6 = r0.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Double r0 = java.lang.Double.valueOf(r6)     // Catch: com.amap.api.services.core.AMapException -> L96
            double r6 = r2.getLatitude()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch: com.amap.api.services.core.AMapException -> L96
            double r7 = r2.getLongitude()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Double r2 = java.lang.Double.valueOf(r7)     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: com.amap.api.services.core.AMapException -> L96
            r7 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch: com.amap.api.services.core.AMapException -> L96
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch: com.amap.api.services.core.AMapException -> L96
            r11 = 12
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: com.amap.api.services.core.AMapException -> L96
            r11[r9] = r5     // Catch: com.amap.api.services.core.AMapException -> L96
            r5 = 1
            r11[r5] = r0     // Catch: com.amap.api.services.core.AMapException -> L96
            r11[r7] = r3     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 3
            r11[r0] = r6     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 4
            r11[r0] = r2     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 5
            r11[r0] = r13     // Catch: com.amap.api.services.core.AMapException -> L96
            r13 = 6
            r11[r13] = r1     // Catch: com.amap.api.services.core.AMapException -> L96
            r13 = 7
            r11[r13] = r8     // Catch: com.amap.api.services.core.AMapException -> L96
            r13 = 8
            r11[r13] = r10     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r13 = com.amap.api.col.s.v0.f4754g     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 9
            r11[r0] = r13     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 10
            r11[r0] = r13     // Catch: com.amap.api.services.core.AMapException -> L96
            r0 = 11
            r11[r0] = r13     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r13 = java.lang.String.format(r4, r11)     // Catch: com.amap.api.services.core.AMapException -> L96
            com.amap.api.col.s.v r0 = new com.amap.api.col.s.v     // Catch: com.amap.api.services.core.AMapException -> L96
            android.content.Context r1 = r12.a     // Catch: com.amap.api.services.core.AMapException -> L96
            r0.<init>(r1, r13)     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.Object r13 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L96
            java.lang.String r13 = (java.lang.String) r13     // Catch: com.amap.api.services.core.AMapException -> L96
            return r13
        L96:
            r13 = move-exception
            goto La4
        L98:
            com.amap.api.services.core.AMapException r13 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L96
            r13.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L96
            throw r13     // Catch: com.amap.api.services.core.AMapException -> L96
        L9e:
            com.amap.api.services.core.AMapException r13 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L96
            r13.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L96
            throw r13     // Catch: com.amap.api.services.core.AMapException -> L96
        La4:
            java.lang.String r0 = "ShareSearch"
            java.lang.String r1 = "searchWalkRouteShareUrl"
            com.amap.api.col.s.j4.i(r13, r0, r1)
            throw r13
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void searchWalkRouteShareUrlAsyn(com.amap.api.services.share.ShareSearch.ShareWalkRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.s.v0$c r1 = new com.amap.api.col.s.v0$c     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.b(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public final void setOnShareSearchListener(com.amap.api.services.share.ShareSearch.OnShareSearchListener r1) {
            r0 = this;
            r0.f4755b = r1
            return
    }
}
