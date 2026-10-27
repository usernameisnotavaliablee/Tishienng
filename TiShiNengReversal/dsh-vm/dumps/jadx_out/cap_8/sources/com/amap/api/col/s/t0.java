package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class t0 implements com.amap.api.services.interfaces.IRouteSearch {
    private com.amap.api.services.route.RouteSearch.OnRouteSearchListener a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.route.RouteSearch.OnTruckRouteSearchListener f4699b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.route.RouteSearch.OnRoutePlanSearchListener f4700c;

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f4701d;

    /* renamed from: e, reason: collision with root package name */
    private android.os.Handler f4702e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearch.WalkRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.t0 f4703b;

        a(com.amap.api.col.s.t0 r1, com.amap.api.services.route.RouteSearch.WalkRouteQuery r2) {
                r0 = this;
                r0.f4703b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "errorCode"
                java.lang.String r1 = "result"
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                android.os.Message r2 = r2.obtainMessage()
                r3 = 102(0x66, float:1.43E-43)
                r2.what = r3
                r3 = 1
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.t0 r5 = r7.f4703b     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                com.amap.api.services.route.RouteSearch$WalkRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                com.amap.api.services.route.WalkRouteResult r4 = r5.calculateWalkRoute(r6)     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
            L26:
                com.amap.api.col.s.t0 r0 = r7.f4703b
                com.amap.api.services.route.RouteSearch$OnRouteSearchListener r0 = com.amap.api.col.s.t0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r0 = r7.f4703b
                android.os.Handler r0 = com.amap.api.col.s.t0.c(r0)
                r0.sendMessage(r2)
                return
            L3e:
                r0 = move-exception
                goto L49
            L40:
                r5 = move-exception
                int r5 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L3e
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3e
                goto L26
            L49:
                com.amap.api.col.s.t0 r5 = r7.f4703b
                com.amap.api.services.route.RouteSearch$OnRouteSearchListener r5 = com.amap.api.col.s.t0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r1 = r7.f4703b
                android.os.Handler r1 = com.amap.api.col.s.t0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearch.BusRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.t0 f4704b;

        b(com.amap.api.col.s.t0 r1, com.amap.api.services.route.RouteSearch.BusRouteQuery r2) {
                r0 = this;
                r0.f4704b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "errorCode"
                java.lang.String r1 = "result"
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                android.os.Message r2 = r2.obtainMessage()
                r3 = 100
                r2.what = r3
                r3 = 1
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.t0 r5 = r7.f4704b     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                com.amap.api.services.route.RouteSearch$BusRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                com.amap.api.services.route.BusRouteResult r4 = r5.calculateBusRoute(r6)     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
            L26:
                com.amap.api.col.s.t0 r0 = r7.f4704b
                com.amap.api.services.route.RouteSearch$OnRouteSearchListener r0 = com.amap.api.col.s.t0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r0 = r7.f4704b
                android.os.Handler r0 = com.amap.api.col.s.t0.c(r0)
                r0.sendMessage(r2)
                return
            L3e:
                r0 = move-exception
                goto L49
            L40:
                r5 = move-exception
                int r5 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L3e
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3e
                goto L26
            L49:
                com.amap.api.col.s.t0 r5 = r7.f4704b
                com.amap.api.services.route.RouteSearch$OnRouteSearchListener r5 = com.amap.api.col.s.t0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r1 = r7.f4704b
                android.os.Handler r1 = com.amap.api.col.s.t0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearch.DriveRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.t0 f4705b;

        c(com.amap.api.col.s.t0 r1, com.amap.api.services.route.RouteSearch.DriveRouteQuery r2) {
                r0 = this;
                r0.f4705b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "errorCode"
                java.lang.String r1 = "result"
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                android.os.Message r2 = r2.obtainMessage()
                r3 = 101(0x65, float:1.42E-43)
                r2.what = r3
                r3 = 1
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.t0 r5 = r7.f4705b     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                com.amap.api.services.route.RouteSearch$DriveRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                com.amap.api.services.route.DriveRouteResult r4 = r5.calculateDriveRoute(r6)     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
            L26:
                com.amap.api.col.s.t0 r0 = r7.f4705b
                com.amap.api.services.route.RouteSearch$OnRouteSearchListener r0 = com.amap.api.col.s.t0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r0 = r7.f4705b
                android.os.Handler r0 = com.amap.api.col.s.t0.c(r0)
                r0.sendMessage(r2)
                return
            L3e:
                r0 = move-exception
                goto L49
            L40:
                r5 = move-exception
                int r5 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L3e
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3e
                goto L26
            L49:
                com.amap.api.col.s.t0 r5 = r7.f4705b
                com.amap.api.services.route.RouteSearch$OnRouteSearchListener r5 = com.amap.api.col.s.t0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r1 = r7.f4705b
                android.os.Handler r1 = com.amap.api.col.s.t0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class d implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearch.RideRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.t0 f4706b;

        d(com.amap.api.col.s.t0 r1, com.amap.api.services.route.RouteSearch.RideRouteQuery r2) {
                r0 = this;
                r0.f4706b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "errorCode"
                java.lang.String r1 = "result"
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                android.os.Message r2 = r2.obtainMessage()
                r3 = 103(0x67, float:1.44E-43)
                r2.what = r3
                r3 = 1
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.t0 r5 = r7.f4706b     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                com.amap.api.services.route.RouteSearch$RideRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                com.amap.api.services.route.RideRouteResult r4 = r5.calculateRideRoute(r6)     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3e com.amap.api.services.core.AMapException -> L40
            L26:
                com.amap.api.col.s.t0 r0 = r7.f4706b
                com.amap.api.services.route.RouteSearch$OnRouteSearchListener r0 = com.amap.api.col.s.t0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r0 = r7.f4706b
                android.os.Handler r0 = com.amap.api.col.s.t0.c(r0)
                r0.sendMessage(r2)
                return
            L3e:
                r0 = move-exception
                goto L49
            L40:
                r5 = move-exception
                int r5 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L3e
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3e
                goto L26
            L49:
                com.amap.api.col.s.t0 r5 = r7.f4706b
                com.amap.api.services.route.RouteSearch$OnRouteSearchListener r5 = com.amap.api.col.s.t0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r1 = r7.f4706b
                android.os.Handler r1 = com.amap.api.col.s.t0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class e implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearch.TruckRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.t0 f4707b;

        e(com.amap.api.col.s.t0 r1, com.amap.api.services.route.RouteSearch.TruckRouteQuery r2) {
                r0 = this;
                r0.f4707b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "errorCode"
                java.lang.String r1 = "result"
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                android.os.Message r2 = r2.obtainMessage()
                r3 = 104(0x68, float:1.46E-43)
                r2.what = r3
                r3 = 17
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.t0 r5 = r7.f4707b     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.RouteSearch$TruckRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.TruckRouteRestult r4 = r5.calculateTruckRoute(r6)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
            L27:
                com.amap.api.col.s.t0 r0 = r7.f4707b
                com.amap.api.services.route.RouteSearch$OnTruckRouteSearchListener r0 = com.amap.api.col.s.t0.d(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r0 = r7.f4707b
                android.os.Handler r0 = com.amap.api.col.s.t0.c(r0)
                r0.sendMessage(r2)
                return
            L3f:
                r0 = move-exception
                goto L4a
            L41:
                r5 = move-exception
                int r5 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L3f
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f
                goto L27
            L4a:
                com.amap.api.col.s.t0 r5 = r7.f4707b
                com.amap.api.services.route.RouteSearch$OnTruckRouteSearchListener r5 = com.amap.api.col.s.t0.d(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r1 = r7.f4707b
                android.os.Handler r1 = com.amap.api.col.s.t0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class f implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearch.DrivePlanQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.t0 f4708b;

        f(com.amap.api.col.s.t0 r1, com.amap.api.services.route.RouteSearch.DrivePlanQuery r2) {
                r0 = this;
                r0.f4708b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r7 = this;
                java.lang.String r0 = "errorCode"
                java.lang.String r1 = "result"
                com.amap.api.col.s.u4 r2 = com.amap.api.col.s.u4.a()
                android.os.Message r2 = r2.obtainMessage()
                r3 = 105(0x69, float:1.47E-43)
                r2.what = r3
                r3 = 18
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.t0 r5 = r7.f4708b     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.RouteSearch$DrivePlanQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.DriveRoutePlanResult r4 = r5.calculateDrivePlan(r6)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
            L27:
                com.amap.api.col.s.t0 r0 = r7.f4708b
                com.amap.api.services.route.RouteSearch$OnRoutePlanSearchListener r0 = com.amap.api.col.s.t0.e(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r0 = r7.f4708b
                android.os.Handler r0 = com.amap.api.col.s.t0.c(r0)
                r0.sendMessage(r2)
                return
            L3f:
                r0 = move-exception
                goto L4a
            L41:
                r5 = move-exception
                int r5 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L3f
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f
                goto L27
            L4a:
                com.amap.api.col.s.t0 r5 = r7.f4708b
                com.amap.api.services.route.RouteSearch$OnRoutePlanSearchListener r5 = com.amap.api.col.s.t0.e(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.t0 r1 = r7.f4708b
                android.os.Handler r1 = com.amap.api.col.s.t0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    public t0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L23
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.f4701d = r4
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4702e = r4
            return
        L23:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r2 = 1
            r4.<init>(r1, r2, r1, r0)
            throw r4
    }

    static /* synthetic */ com.amap.api.services.route.RouteSearch.OnRouteSearchListener a(com.amap.api.col.s.t0 r0) {
            com.amap.api.services.route.RouteSearch$OnRouteSearchListener r0 = r0.a
            return r0
    }

    private static boolean b(com.amap.api.services.route.RouteSearch.FromAndTo r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            com.amap.api.services.core.LatLonPoint r1 = r2.getFrom()
            if (r1 == 0) goto L12
            com.amap.api.services.core.LatLonPoint r2 = r2.getTo()
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            return r0
    }

    static /* synthetic */ android.os.Handler c(com.amap.api.col.s.t0 r0) {
            android.os.Handler r0 = r0.f4702e
            return r0
    }

    static /* synthetic */ com.amap.api.services.route.RouteSearch.OnTruckRouteSearchListener d(com.amap.api.col.s.t0 r0) {
            com.amap.api.services.route.RouteSearch$OnTruckRouteSearchListener r0 = r0.f4699b
            return r0
    }

    static /* synthetic */ com.amap.api.services.route.RouteSearch.OnRoutePlanSearchListener e(com.amap.api.col.s.t0 r0) {
            com.amap.api.services.route.RouteSearch$OnRoutePlanSearchListener r0 = r0.f4700c
            return r0
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final com.amap.api.services.route.BusRouteResult calculateBusRoute(com.amap.api.services.route.RouteSearch.BusRouteQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4701d     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L2a
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L33
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L2a
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L2a
            if (r1 == 0) goto L2d
            com.amap.api.services.route.RouteSearch$BusRouteQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.col.s.c4 r0 = new com.amap.api.col.s.c4     // Catch: com.amap.api.services.core.AMapException -> L2a
            android.content.Context r1 = r2.f4701d     // Catch: com.amap.api.services.core.AMapException -> L2a
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L2a
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.services.route.BusRouteResult r0 = (com.amap.api.services.route.BusRouteResult) r0     // Catch: com.amap.api.services.core.AMapException -> L2a
            if (r0 == 0) goto L2c
            r0.setBusQuery(r3)     // Catch: com.amap.api.services.core.AMapException -> L2a
            return r0
        L2a:
            r3 = move-exception
            goto L39
        L2c:
            return r0
        L2d:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L2a
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L2a
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L2a
        L33:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L2a
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L2a
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L2a
        L39:
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateBusRoute"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            throw r3
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateBusRouteAsyn(com.amap.api.services.route.RouteSearch.BusRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.t0$b r1 = new com.amap.api.col.s.t0$b     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateBusRouteAsyn"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final com.amap.api.services.route.DriveRoutePlanResult calculateDrivePlan(com.amap.api.services.route.RouteSearch.DrivePlanQuery r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.f4701d     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L2a
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r4 == 0) goto L33
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r4.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L2a
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L2a
            if (r1 == 0) goto L2d
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r0 = r4.clone()     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.col.s.m4 r1 = new com.amap.api.col.s.m4     // Catch: com.amap.api.services.core.AMapException -> L2a
            android.content.Context r2 = r3.f4701d     // Catch: com.amap.api.services.core.AMapException -> L2a
            r1.<init>(r2, r0)     // Catch: com.amap.api.services.core.AMapException -> L2a
            java.lang.Object r0 = r1.O()     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.services.route.DriveRoutePlanResult r0 = (com.amap.api.services.route.DriveRoutePlanResult) r0     // Catch: com.amap.api.services.core.AMapException -> L2a
            if (r0 == 0) goto L2c
            r0.setDrivePlanQuery(r4)     // Catch: com.amap.api.services.core.AMapException -> L2a
            return r0
        L2a:
            r4 = move-exception
            goto L39
        L2c:
            return r0
        L2d:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L2a
            r4.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L2a
            throw r4     // Catch: com.amap.api.services.core.AMapException -> L2a
        L33:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L2a
            r4.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L2a
            throw r4     // Catch: com.amap.api.services.core.AMapException -> L2a
        L39:
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateDrivePlan"
            com.amap.api.col.s.j4.i(r4, r0, r1)
            throw r4
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateDrivePlanAsyn(com.amap.api.services.route.RouteSearch.DrivePlanQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.t0$f r1 = new com.amap.api.col.s.t0$f     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateTruckRouteAsyn"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final com.amap.api.services.route.DriveRouteResult calculateDriveRoute(com.amap.api.services.route.RouteSearch.DriveRouteQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4701d     // Catch: com.amap.api.services.core.AMapException -> L40
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L40
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L49
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L40
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L40
            if (r1 == 0) goto L43
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L40
            java.util.List r1 = r3.getPassedByPoints()     // Catch: com.amap.api.services.core.AMapException -> L40
            r0.g(r1)     // Catch: com.amap.api.services.core.AMapException -> L40
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L40
            java.util.List r1 = r3.getAvoidpolygons()     // Catch: com.amap.api.services.core.AMapException -> L40
            r0.o(r1)     // Catch: com.amap.api.services.core.AMapException -> L40
            com.amap.api.services.route.RouteSearch$DriveRouteQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L40
            com.amap.api.col.s.n4 r0 = new com.amap.api.col.s.n4     // Catch: com.amap.api.services.core.AMapException -> L40
            android.content.Context r1 = r2.f4701d     // Catch: com.amap.api.services.core.AMapException -> L40
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L40
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L40
            com.amap.api.services.route.DriveRouteResult r0 = (com.amap.api.services.route.DriveRouteResult) r0     // Catch: com.amap.api.services.core.AMapException -> L40
            if (r0 == 0) goto L42
            r0.setDriveQuery(r3)     // Catch: com.amap.api.services.core.AMapException -> L40
            return r0
        L40:
            r3 = move-exception
            goto L4f
        L42:
            return r0
        L43:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L40
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L40
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L40
        L49:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L40
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L40
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L40
        L4f:
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateDriveRoute"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            throw r3
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateDriveRouteAsyn(com.amap.api.services.route.RouteSearch.DriveRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.t0$c r1 = new com.amap.api.col.s.t0$c     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateDriveRouteAsyn"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final com.amap.api.services.route.RideRouteResult calculateRideRoute(com.amap.api.services.route.RouteSearch.RideRouteQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4701d     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L35
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L3e
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L35
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L35
            if (r1 == 0) goto L38
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L35
            r0.c(r1)     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RouteSearch$RideRouteQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.col.s.s r0 = new com.amap.api.col.s.s     // Catch: com.amap.api.services.core.AMapException -> L35
            android.content.Context r1 = r2.f4701d     // Catch: com.amap.api.services.core.AMapException -> L35
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L35
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RideRouteResult r0 = (com.amap.api.services.route.RideRouteResult) r0     // Catch: com.amap.api.services.core.AMapException -> L35
            if (r0 == 0) goto L37
            r0.setRideQuery(r3)     // Catch: com.amap.api.services.core.AMapException -> L35
            return r0
        L35:
            r3 = move-exception
            goto L44
        L37:
            return r0
        L38:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L35
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L35
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L35
        L3e:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L35
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L35
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L35
        L44:
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculaterideRoute"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            throw r3
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateRideRouteAsyn(com.amap.api.services.route.RouteSearch.RideRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.t0$d r1 = new com.amap.api.col.s.t0$d     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateRideRouteAsyn"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final com.amap.api.services.route.TruckRouteRestult calculateTruckRoute(com.amap.api.services.route.RouteSearch.TruckRouteQuery r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.f4701d     // Catch: com.amap.api.services.core.AMapException -> L43
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L43
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r4 == 0) goto L4c
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r4.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L43
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L43
            if (r1 == 0) goto L46
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L43
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r4.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L43
            java.util.List r2 = r4.getPassedByPoints()     // Catch: com.amap.api.services.core.AMapException -> L43
            r0.d(r1, r2)     // Catch: com.amap.api.services.core.AMapException -> L43
            com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L43
            java.util.List r0 = r4.getPassedByPoints()     // Catch: com.amap.api.services.core.AMapException -> L43
            com.amap.api.col.s.q.l(r0)     // Catch: com.amap.api.services.core.AMapException -> L43
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r4 = r4.clone()     // Catch: com.amap.api.services.core.AMapException -> L43
            com.amap.api.col.s.z r0 = new com.amap.api.col.s.z     // Catch: com.amap.api.services.core.AMapException -> L43
            android.content.Context r1 = r3.f4701d     // Catch: com.amap.api.services.core.AMapException -> L43
            r0.<init>(r1, r4)     // Catch: com.amap.api.services.core.AMapException -> L43
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L43
            com.amap.api.services.route.TruckRouteRestult r0 = (com.amap.api.services.route.TruckRouteRestult) r0     // Catch: com.amap.api.services.core.AMapException -> L43
            if (r0 == 0) goto L45
            r0.setTruckQuery(r4)     // Catch: com.amap.api.services.core.AMapException -> L43
            return r0
        L43:
            r4 = move-exception
            goto L52
        L45:
            return r0
        L46:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L43
            r4.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L43
            throw r4     // Catch: com.amap.api.services.core.AMapException -> L43
        L4c:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L43
            r4.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L43
            throw r4     // Catch: com.amap.api.services.core.AMapException -> L43
        L52:
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateDriveRoute"
            com.amap.api.col.s.j4.i(r4, r0, r1)
            throw r4
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateTruckRouteAsyn(com.amap.api.services.route.RouteSearch.TruckRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.t0$e r1 = new com.amap.api.col.s.t0$e     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateTruckRouteAsyn"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final com.amap.api.services.route.WalkRouteResult calculateWalkRoute(com.amap.api.services.route.RouteSearch.WalkRouteQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4701d     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L35
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L3e
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L35
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L35
            if (r1 == 0) goto L38
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L35
            r0.j(r1)     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RouteSearch$WalkRouteQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.col.s.a0 r0 = new com.amap.api.col.s.a0     // Catch: com.amap.api.services.core.AMapException -> L35
            android.content.Context r1 = r2.f4701d     // Catch: com.amap.api.services.core.AMapException -> L35
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L35
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.WalkRouteResult r0 = (com.amap.api.services.route.WalkRouteResult) r0     // Catch: com.amap.api.services.core.AMapException -> L35
            if (r0 == 0) goto L37
            r0.setWalkQuery(r3)     // Catch: com.amap.api.services.core.AMapException -> L35
            return r0
        L35:
            r3 = move-exception
            goto L44
        L37:
            return r0
        L38:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L35
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L35
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L35
        L3e:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L35
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L35
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L35
        L44:
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateWalkRoute"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            throw r3
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void calculateWalkRouteAsyn(com.amap.api.services.route.RouteSearch.WalkRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.t0$a r1 = new com.amap.api.col.s.t0$a     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateWalkRouteAsyn"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            return
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setOnRoutePlanSearchListener(com.amap.api.services.route.RouteSearch.OnRoutePlanSearchListener r1) {
            r0 = this;
            r0.f4700c = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setOnTruckRouteSearchListener(com.amap.api.services.route.RouteSearch.OnTruckRouteSearchListener r1) {
            r0 = this;
            r0.f4699b = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public final void setRouteSearchListener(com.amap.api.services.route.RouteSearch.OnRouteSearchListener r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
