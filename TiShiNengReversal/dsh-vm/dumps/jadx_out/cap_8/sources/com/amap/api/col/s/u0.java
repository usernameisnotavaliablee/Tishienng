package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u0 implements com.amap.api.services.interfaces.IRouteSearchV2 {
    private com.amap.api.services.route.RouteSearchV2.OnRouteSearchListener a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f4713b;

    /* renamed from: c, reason: collision with root package name */
    private android.os.Handler f4714c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearchV2.DriveRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.u0 f4715b;

        a(com.amap.api.col.s.u0 r1, com.amap.api.services.route.RouteSearchV2.DriveRouteQuery r2) {
                r0 = this;
                r0.f4715b = r1
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
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.u0 r5 = r7.f4715b     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.route.RouteSearchV2$DriveRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                com.amap.api.services.route.DriveRouteResultV2 r4 = r5.calculateDriveRoute(r6)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3d com.amap.api.services.core.AMapException -> L3f
            L25:
                com.amap.api.col.s.u0 r0 = r7.f4715b
                com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r0 = com.amap.api.col.s.u0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.u0 r0 = r7.f4715b
                android.os.Handler r0 = com.amap.api.col.s.u0.c(r0)
                r0.sendMessage(r2)
                return
            L3d:
                r0 = move-exception
                goto L48
            L3f:
                r5 = move-exception
                int r5 = r5.getErrorCode()     // Catch: java.lang.Throwable -> L3d
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3d
                goto L25
            L48:
                com.amap.api.col.s.u0 r5 = r7.f4715b
                com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r5 = com.amap.api.col.s.u0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.u0 r1 = r7.f4715b
                android.os.Handler r1 = com.amap.api.col.s.u0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearchV2.WalkRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.u0 f4716b;

        b(com.amap.api.col.s.u0 r1, com.amap.api.services.route.RouteSearchV2.WalkRouteQuery r2) {
                r0 = this;
                r0.f4716b = r1
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
                r3 = 101(0x65, float:1.42E-43)
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.u0 r5 = r7.f4716b     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.WalkRouteResultV2 r4 = r5.calculateWalkRoute(r6)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
            L27:
                com.amap.api.col.s.u0 r0 = r7.f4716b
                com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r0 = com.amap.api.col.s.u0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.u0 r0 = r7.f4716b
                android.os.Handler r0 = com.amap.api.col.s.u0.c(r0)
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
                com.amap.api.col.s.u0 r5 = r7.f4716b
                com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r5 = com.amap.api.col.s.u0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.u0 r1 = r7.f4716b
                android.os.Handler r1 = com.amap.api.col.s.u0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class c implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearchV2.RideRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.u0 f4717b;

        c(com.amap.api.col.s.u0 r1, com.amap.api.services.route.RouteSearchV2.RideRouteQuery r2) {
                r0 = this;
                r0.f4717b = r1
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
                r3 = 101(0x65, float:1.42E-43)
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.u0 r5 = r7.f4717b     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.RouteSearchV2$RideRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.RideRouteResultV2 r4 = r5.calculateRideRoute(r6)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
            L27:
                com.amap.api.col.s.u0 r0 = r7.f4717b
                com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r0 = com.amap.api.col.s.u0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.u0 r0 = r7.f4717b
                android.os.Handler r0 = com.amap.api.col.s.u0.c(r0)
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
                com.amap.api.col.s.u0 r5 = r7.f4717b
                com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r5 = com.amap.api.col.s.u0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.u0 r1 = r7.f4717b
                android.os.Handler r1 = com.amap.api.col.s.u0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class d implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.services.route.RouteSearchV2.BusRouteQuery a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.s.u0 f4718b;

        d(com.amap.api.col.s.u0 r1, com.amap.api.services.route.RouteSearchV2.BusRouteQuery r2) {
                r0 = this;
                r0.f4718b = r1
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
                r3 = 101(0x65, float:1.42E-43)
                r2.arg1 = r3
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r4 = 0
                com.amap.api.col.s.u0 r5 = r7.f4718b     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.RouteSearchV2$BusRouteQuery r6 = r7.a     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                com.amap.api.services.route.BusRouteResultV2 r4 = r5.calculateBusRoute(r6)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
                r5 = 1000(0x3e8, float:1.401E-42)
                r3.putInt(r0, r5)     // Catch: java.lang.Throwable -> L3f com.amap.api.services.core.AMapException -> L41
            L27:
                com.amap.api.col.s.u0 r0 = r7.f4718b
                com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r0 = com.amap.api.col.s.u0.a(r0)
                r2.obj = r0
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.u0 r0 = r7.f4718b
                android.os.Handler r0 = com.amap.api.col.s.u0.c(r0)
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
                com.amap.api.col.s.u0 r5 = r7.f4718b
                com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r5 = com.amap.api.col.s.u0.a(r5)
                r2.obj = r5
                r3.putParcelable(r1, r4)
                r2.setData(r3)
                com.amap.api.col.s.u0 r1 = r7.f4718b
                android.os.Handler r1 = com.amap.api.col.s.u0.c(r1)
                r1.sendMessage(r2)
                throw r0
        }
    }

    public u0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
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
            r3.f4713b = r4
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4714c = r4
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

    static /* synthetic */ com.amap.api.services.route.RouteSearchV2.OnRouteSearchListener a(com.amap.api.col.s.u0 r0) {
            com.amap.api.services.route.RouteSearchV2$OnRouteSearchListener r0 = r0.a
            return r0
    }

    private static boolean b(com.amap.api.services.route.RouteSearchV2.FromAndTo r2) {
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

    static /* synthetic */ android.os.Handler c(com.amap.api.col.s.u0 r0) {
            android.os.Handler r0 = r0.f4714c
            return r0
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final com.amap.api.services.route.BusRouteResultV2 calculateBusRoute(com.amap.api.services.route.RouteSearchV2.BusRouteQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4713b     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L2a
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L33
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L2a
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L2a
            if (r1 == 0) goto L2d
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.col.s.d4 r0 = new com.amap.api.col.s.d4     // Catch: com.amap.api.services.core.AMapException -> L2a
            android.content.Context r1 = r2.f4713b     // Catch: com.amap.api.services.core.AMapException -> L2a
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L2a
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L2a
            com.amap.api.services.route.BusRouteResultV2 r0 = (com.amap.api.services.route.BusRouteResultV2) r0     // Catch: com.amap.api.services.core.AMapException -> L2a
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

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateBusRouteAsyn(com.amap.api.services.route.RouteSearchV2.BusRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.u0$d r1 = new com.amap.api.col.s.u0$d     // Catch: java.lang.Throwable -> Ld
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

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final com.amap.api.services.route.DriveRouteResultV2 calculateDriveRoute(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4713b     // Catch: com.amap.api.services.core.AMapException -> L3f
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L3f
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L48
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L3f
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L3f
            if (r1 == 0) goto L42
            com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L3f
            java.util.List r0 = r3.getPassedByPoints()     // Catch: com.amap.api.services.core.AMapException -> L3f
            com.amap.api.col.s.q.l(r0)     // Catch: com.amap.api.services.core.AMapException -> L3f
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L3f
            java.util.List r1 = r3.getAvoidpolygons()     // Catch: com.amap.api.services.core.AMapException -> L3f
            r0.o(r1)     // Catch: com.amap.api.services.core.AMapException -> L3f
            com.amap.api.services.route.RouteSearchV2$DriveRouteQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L3f
            com.amap.api.col.s.o4 r0 = new com.amap.api.col.s.o4     // Catch: com.amap.api.services.core.AMapException -> L3f
            android.content.Context r1 = r2.f4713b     // Catch: com.amap.api.services.core.AMapException -> L3f
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L3f
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L3f
            com.amap.api.services.route.DriveRouteResultV2 r0 = (com.amap.api.services.route.DriveRouteResultV2) r0     // Catch: com.amap.api.services.core.AMapException -> L3f
            if (r0 == 0) goto L41
            r0.setDriveQuery(r3)     // Catch: com.amap.api.services.core.AMapException -> L3f
            return r0
        L3f:
            r3 = move-exception
            goto L4e
        L41:
            return r0
        L42:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L3f
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L3f
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L3f
        L48:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L3f
            r3.<init>(r0)     // Catch: com.amap.api.services.core.AMapException -> L3f
            throw r3     // Catch: com.amap.api.services.core.AMapException -> L3f
        L4e:
            java.lang.String r0 = "RouteSearch"
            java.lang.String r1 = "calculateDriveRoute"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            throw r3
    }

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateDriveRouteAsyn(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.u0$a r1 = new com.amap.api.col.s.u0$a     // Catch: java.lang.Throwable -> Ld
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

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final com.amap.api.services.route.RideRouteResultV2 calculateRideRoute(com.amap.api.services.route.RouteSearchV2.RideRouteQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4713b     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L35
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L3e
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L35
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L35
            if (r1 == 0) goto L38
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L35
            r0.e(r1)     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RouteSearchV2$RideRouteQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.col.s.t r0 = new com.amap.api.col.s.t     // Catch: com.amap.api.services.core.AMapException -> L35
            android.content.Context r1 = r2.f4713b     // Catch: com.amap.api.services.core.AMapException -> L35
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L35
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RideRouteResultV2 r0 = (com.amap.api.services.route.RideRouteResultV2) r0     // Catch: com.amap.api.services.core.AMapException -> L35
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

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateRideRouteAsyn(com.amap.api.services.route.RouteSearchV2.RideRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.u0$c r1 = new com.amap.api.col.s.u0$c     // Catch: java.lang.Throwable -> Ld
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

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final com.amap.api.services.route.WalkRouteResultV2 calculateWalkRoute(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            android.content.Context r0 = r2.f4713b     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L35
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r3 == 0) goto L3e
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L35
            boolean r1 = b(r1)     // Catch: com.amap.api.services.core.AMapException -> L35
            if (r1 == 0) goto L38
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.a()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r3.getFromAndTo()     // Catch: com.amap.api.services.core.AMapException -> L35
            r0.k(r1)     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r3 = r3.clone()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.col.s.c0 r0 = new com.amap.api.col.s.c0     // Catch: com.amap.api.services.core.AMapException -> L35
            android.content.Context r1 = r2.f4713b     // Catch: com.amap.api.services.core.AMapException -> L35
            r0.<init>(r1, r3)     // Catch: com.amap.api.services.core.AMapException -> L35
            java.lang.Object r0 = r0.O()     // Catch: com.amap.api.services.core.AMapException -> L35
            com.amap.api.services.route.WalkRouteResultV2 r0 = (com.amap.api.services.route.WalkRouteResultV2) r0     // Catch: com.amap.api.services.core.AMapException -> L35
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

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void calculateWalkRouteAsyn(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery r3) {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.u0$b r1 = new com.amap.api.col.s.u0$b     // Catch: java.lang.Throwable -> Ld
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

    @Override // com.amap.api.services.interfaces.IRouteSearchV2
    public final void setRouteSearchListener(com.amap.api.services.route.RouteSearchV2.OnRouteSearchListener r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
