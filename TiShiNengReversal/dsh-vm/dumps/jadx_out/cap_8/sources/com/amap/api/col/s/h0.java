package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h0 implements com.amap.api.services.interfaces.IAutoTSearch {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private android.os.Handler f4467b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.auto.AutoTSearch.Query f4468c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.auto.AutoTSearch.OnChargeStationListener f4469d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.h0 a;

        a(com.amap.api.col.s.h0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r6 = this;
                java.lang.String r0 = "errorCode"
                com.amap.api.col.s.h0 r1 = r6.a
                android.os.Handler r1 = com.amap.api.col.s.h0.a(r1)
                android.os.Message r1 = r1.obtainMessage()
                r2 = 20
                r1.arg1 = r2
                r2 = 600(0x258, float:8.41E-43)
                r1.what = r2
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                r3 = 0
                com.amap.api.col.s.h0 r4 = r6.a     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                com.amap.api.services.auto.AutoTChargeStationResult r3 = r4.searchChargeStation()     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                r4 = 1000(0x3e8, float:1.401E-42)
                r2.putInt(r0, r4)     // Catch: java.lang.Throwable -> L43 com.amap.api.services.core.AMapException -> L45
                com.amap.api.col.s.u4$a r0 = new com.amap.api.col.s.u4$a
                r0.<init>()
            L2a:
                com.amap.api.col.s.h0 r4 = r6.a
                com.amap.api.services.auto.AutoTSearch$OnChargeStationListener r4 = com.amap.api.col.s.h0.b(r4)
                r0.f4735b = r4
                r0.a = r3
                r1.obj = r0
                r1.setData(r2)
                com.amap.api.col.s.h0 r0 = r6.a
                android.os.Handler r0 = com.amap.api.col.s.h0.a(r0)
                r0.sendMessage(r1)
                return
            L43:
                r0 = move-exception
                goto L53
            L45:
                r4 = move-exception
                int r4 = r4.getErrorCode()     // Catch: java.lang.Throwable -> L43
                r2.putInt(r0, r4)     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.s.u4$a r0 = new com.amap.api.col.s.u4$a
                r0.<init>()
                goto L2a
            L53:
                com.amap.api.col.s.u4$a r4 = new com.amap.api.col.s.u4$a
                r4.<init>()
                com.amap.api.col.s.h0 r5 = r6.a
                com.amap.api.services.auto.AutoTSearch$OnChargeStationListener r5 = com.amap.api.col.s.h0.b(r5)
                r4.f4735b = r5
                r4.a = r3
                r1.obj = r4
                r1.setData(r2)
                com.amap.api.col.s.h0 r2 = r6.a
                android.os.Handler r2 = com.amap.api.col.s.h0.a(r2)
                r2.sendMessage(r1)
                throw r0
        }
    }

    public h0(android.content.Context r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f4467b = r0
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L26
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.a = r4
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4467b = r4
            return
        L26:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r2 = 1
            r4.<init>(r1, r2, r1, r0)
            throw r4
    }

    static /* synthetic */ android.os.Handler a(com.amap.api.col.s.h0 r0) {
            android.os.Handler r0 = r0.f4467b
            return r0
    }

    static /* synthetic */ com.amap.api.services.auto.AutoTSearch.OnChargeStationListener b(com.amap.api.col.s.h0 r0) {
            com.amap.api.services.auto.AutoTSearch$OnChargeStationListener r0 = r0.f4469d
            return r0
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final com.amap.api.services.auto.AutoTChargeStationResult searchChargeStation() throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L1b
            com.amap.api.col.s.s4.d(r0)     // Catch: com.amap.api.services.core.AMapException -> L1b
            com.amap.api.services.auto.AutoTSearch$Query r0 = r3.f4468c     // Catch: com.amap.api.services.core.AMapException -> L1b
            if (r0 == 0) goto L1d
            com.amap.api.col.s.b0 r1 = new com.amap.api.col.s.b0     // Catch: com.amap.api.services.core.AMapException -> L1b
            android.content.Context r2 = r3.a     // Catch: com.amap.api.services.core.AMapException -> L1b
            com.amap.api.services.auto.AutoTSearch$Query r0 = r0.clone()     // Catch: com.amap.api.services.core.AMapException -> L1b
            r1.<init>(r2, r0)     // Catch: com.amap.api.services.core.AMapException -> L1b
            java.lang.Object r0 = r1.O()     // Catch: com.amap.api.services.core.AMapException -> L1b
            com.amap.api.services.auto.AutoTChargeStationResult r0 = (com.amap.api.services.auto.AutoTChargeStationResult) r0     // Catch: com.amap.api.services.core.AMapException -> L1b
            return r0
        L1b:
            r0 = move-exception
            goto L25
        L1d:
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException     // Catch: com.amap.api.services.core.AMapException -> L1b
            java.lang.String r1 = "无效的参数 - IllegalArgumentException"
            r0.<init>(r1)     // Catch: com.amap.api.services.core.AMapException -> L1b
            throw r0     // Catch: com.amap.api.services.core.AMapException -> L1b
        L25:
            com.amap.api.services.core.AMapException r1 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void searchChargeStationAsync() {
            r2 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Exception -> Lc
            com.amap.api.col.s.h0$a r1 = new com.amap.api.col.s.h0$a     // Catch: java.lang.Exception -> Lc
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lc
            r0.b(r1)     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void setChargeStationListener(com.amap.api.services.auto.AutoTSearch.OnChargeStationListener r1) {
            r0 = this;
            r0.f4469d = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void setQuery(com.amap.api.services.auto.AutoTSearch.Query r1) {
            r0 = this;
            r0.f4468c = r1
            return
    }
}
