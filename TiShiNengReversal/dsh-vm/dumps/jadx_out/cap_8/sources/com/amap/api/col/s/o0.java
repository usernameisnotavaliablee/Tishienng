package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o0 implements com.amap.api.services.interfaces.IInputtipsSearch {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.help.Inputtips.InputtipsListener f4590b;

    /* renamed from: c, reason: collision with root package name */
    private android.os.Handler f4591c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.services.help.InputtipsQuery f4592d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements java.lang.Runnable {
        final /* synthetic */ com.amap.api.col.s.o0 a;

        a(com.amap.api.col.s.o0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                com.amap.api.col.s.u4 r0 = com.amap.api.col.s.u4.a()
                android.os.Message r0 = r0.obtainMessage()
                com.amap.api.col.s.o0 r1 = r4.a
                com.amap.api.services.help.Inputtips$InputtipsListener r1 = com.amap.api.col.s.o0.a(r1)
                r0.obj = r1
                r1 = 5
                r0.arg1 = r1
                com.amap.api.col.s.o0 r1 = r4.a     // Catch: java.lang.Throwable -> L38 com.amap.api.services.core.AMapException -> L3a
                com.amap.api.services.help.InputtipsQuery r2 = com.amap.api.col.s.o0.d(r1)     // Catch: java.lang.Throwable -> L38 com.amap.api.services.core.AMapException -> L3a
                java.util.ArrayList r1 = com.amap.api.col.s.o0.b(r1, r2)     // Catch: java.lang.Throwable -> L38 com.amap.api.services.core.AMapException -> L3a
                android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L38 com.amap.api.services.core.AMapException -> L3a
                r2.<init>()     // Catch: java.lang.Throwable -> L38 com.amap.api.services.core.AMapException -> L3a
                java.lang.String r3 = "result"
                r2.putParcelableArrayList(r3, r1)     // Catch: java.lang.Throwable -> L38 com.amap.api.services.core.AMapException -> L3a
                r0.setData(r2)     // Catch: java.lang.Throwable -> L38 com.amap.api.services.core.AMapException -> L3a
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.what = r1     // Catch: java.lang.Throwable -> L38 com.amap.api.services.core.AMapException -> L3a
            L2e:
                com.amap.api.col.s.o0 r1 = r4.a
                android.os.Handler r1 = com.amap.api.col.s.o0.e(r1)
                r1.sendMessage(r0)
                return
            L38:
                r1 = move-exception
                goto L42
            L3a:
                r1 = move-exception
                int r1 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L38
                r0.what = r1     // Catch: java.lang.Throwable -> L38
                goto L2e
            L42:
                com.amap.api.col.s.o0 r2 = r4.a
                android.os.Handler r2 = com.amap.api.col.s.o0.e(r2)
                r2.sendMessage(r0)
                throw r1
        }
    }

    public o0(android.content.Context r4, com.amap.api.services.help.Inputtips.InputtipsListener r5) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r3.<init>()
            r0 = 0
            com.amap.api.col.s.i1 r0 = com.amap.api.col.s.i4.a(r0)
            com.amap.api.col.s.h1 r0 = com.amap.api.col.s.cf.a(r4, r0)
            com.amap.api.col.s.cf$c r1 = r0.a
            com.amap.api.col.s.cf$c r2 = com.amap.api.col.s.cf.c.a
            if (r1 != r2) goto L25
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            r3.a = r4
            r3.f4590b = r5
            com.amap.api.col.s.u4 r4 = com.amap.api.col.s.u4.a()
            r3.f4591c = r4
            return
        L25:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r5 = r0.f4470b
            com.amap.api.col.s.cf$c r0 = r0.a
            int r0 = r0.a()
            r1 = 1
            r4.<init>(r5, r1, r5, r0)
            throw r4
    }

    public o0(android.content.Context r1, com.amap.api.services.help.InputtipsQuery r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
            r0.f4592d = r2
            com.amap.api.col.s.u4 r1 = com.amap.api.col.s.u4.a()
            r0.f4591c = r1
            return
    }

    static /* synthetic */ com.amap.api.services.help.Inputtips.InputtipsListener a(com.amap.api.col.s.o0 r0) {
            com.amap.api.services.help.Inputtips$InputtipsListener r0 = r0.f4590b
            return r0
    }

    static /* synthetic */ java.util.ArrayList b(com.amap.api.col.s.o0 r0, com.amap.api.services.help.InputtipsQuery r1) throws com.amap.api.services.core.AMapException {
            java.util.ArrayList r0 = r0.c(r1)
            return r0
    }

    private java.util.ArrayList<com.amap.api.services.help.Tip> c(com.amap.api.services.help.InputtipsQuery r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            android.content.Context r0 = r3.a     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.s.s4.d(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            if (r4 == 0) goto L31
            java.lang.String r1 = r4.getKeyword()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.getKeyword()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L2b
            com.amap.api.col.s.q4 r0 = new com.amap.api.col.s.q4     // Catch: java.lang.Throwable -> L29
            android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L29
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r0.O()     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L29
            return r4
        L29:
            r4 = move-exception
            goto L37
        L2b:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> L29
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L31:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: java.lang.Throwable -> L29
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L37:
            java.lang.String r0 = "Inputtips"
            java.lang.String r1 = "requestInputtips"
            com.amap.api.col.s.j4.i(r4, r0, r1)
            boolean r0 = r4 instanceof com.amap.api.services.core.AMapException
            if (r0 != 0) goto L44
            r4 = 0
            return r4
        L44:
            com.amap.api.services.core.AMapException r4 = (com.amap.api.services.core.AMapException) r4
            throw r4
    }

    static /* synthetic */ com.amap.api.services.help.InputtipsQuery d(com.amap.api.col.s.o0 r0) {
            com.amap.api.services.help.InputtipsQuery r0 = r0.f4592d
            return r0
    }

    static /* synthetic */ android.os.Handler e(com.amap.api.col.s.o0 r0) {
            android.os.Handler r0 = r0.f4591c
            return r0
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final com.amap.api.services.help.InputtipsQuery getQuery() {
            r1 = this;
            com.amap.api.services.help.InputtipsQuery r0 = r1.f4592d
            return r0
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final java.util.ArrayList<com.amap.api.services.help.Tip> requestInputtips() throws com.amap.api.services.core.AMapException {
            r1 = this;
            com.amap.api.services.help.InputtipsQuery r0 = r1.f4592d
            java.util.ArrayList r0 = r1.c(r0)
            return r0
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtips(java.lang.String r2, java.lang.String r3) throws com.amap.api.services.core.AMapException {
            r1 = this;
            r0 = 0
            r1.requestInputtips(r2, r3, r0)
            return
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtips(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws com.amap.api.services.core.AMapException {
            r1 = this;
            if (r2 == 0) goto L18
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L18
            com.amap.api.services.help.InputtipsQuery r0 = new com.amap.api.services.help.InputtipsQuery
            r0.<init>(r2, r3)
            r1.f4592d = r0
            r0.setType(r4)
            r1.requestInputtipsAsyn()
            return
        L18:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r3 = "无效的参数 - IllegalArgumentException"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtipsAsyn() {
            r3 = this;
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.a()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.s.o0$a r1 = new com.amap.api.col.s.o0$a     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Ld
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r0 = move-exception
            java.lang.String r1 = "Inputtips"
            java.lang.String r2 = "requestInputtipsAsynThrowable"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            return
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void setInputtipsListener(com.amap.api.services.help.Inputtips.InputtipsListener r1) {
            r0 = this;
            r0.f4590b = r1
            return
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void setQuery(com.amap.api.services.help.InputtipsQuery r1) {
            r0 = this;
            r0.f4592d = r1
            return
    }
}
