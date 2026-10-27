package com.kwad.components.core.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static boolean Ob;
    private static boolean Oc;
    private static final java.util.concurrent.atomic.AtomicBoolean Od = null;
    private static java.util.List<java.lang.Throwable> Oe;
    private static java.util.Map<java.lang.String, java.lang.String> Of;
    private static final java.util.List<com.kwad.components.core.d.a.b> Og = null;
    private static final java.util.List<com.kwad.components.core.d.a.c> Oh = null;
    private static final java.util.concurrent.atomic.AtomicBoolean mHasInit = null;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.d.a$a, reason: collision with other inner class name */
    static class C0068a {
        public C0068a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static java.lang.String an(android.content.Context r2) {
                java.io.File r0 = new java.io.File
                java.io.File r2 = getDataDir(r2)
                java.lang.String r1 = "kwad_ex"
                r0.<init>(r2, r1)
                boolean r2 = r0.exists()
                if (r2 != 0) goto L14
                r0.mkdir()
            L14:
                java.lang.String r2 = r0.getAbsolutePath()
                return r2
        }

        private static java.io.File getDataDir(android.content.Context r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                r2 = 0
                if (r0 < r1) goto L15
                java.io.File r0 = new java.io.File
                java.io.File r3 = r3.getExternalFilesDir(r2)
                java.lang.String r3 = r3.getAbsolutePath()
                r0.<init>(r3)
                return r0
            L15:
                r1 = 24
                if (r0 < r1) goto L1d
                java.io.File r2 = l1.a.a(r3)
            L1d:
                if (r2 != 0) goto L62
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.io.File r2 = android.os.Environment.getDataDirectory()
                java.lang.String r2 = r2.getPath()
                r1.append(r2)
                java.lang.String r2 = "/data/"
                r1.append(r2)
                java.lang.String r2 = r3.getPackageName()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                boolean r1 = r0.exists()
                if (r1 != 0) goto L61
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "/data/data/"
                r1.<init>(r2)
                java.lang.String r3 = r3.getPackageName()
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
            L61:
                return r0
            L62:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        java.lang.String getKey();

        org.json.JSONObject getValue();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void onCrashOccur(int r1, java.lang.String r2);
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.kwad.components.core.d.a.mHasInit = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            com.kwad.components.core.d.a.Od = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.kwad.components.core.d.a.Og = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.kwad.components.core.d.a.Oh = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.kwad.components.core.d.a.b r1) {
            java.util.List<com.kwad.components.core.d.a$b> r0 = com.kwad.components.core.d.a.Og
            r0.add(r1)
            return
    }

    public static void a(com.kwad.components.core.d.a.c r1) {
            java.util.List<com.kwad.components.core.d.a$c> r0 = com.kwad.components.core.d.a.Oh
            r0.add(r1)
            return
    }

    private static com.kwad.sdk.crash.model.b ag(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Lc
            com.kwad.sdk.crash.model.b r1 = new com.kwad.sdk.crash.model.b
            r1.<init>()
            return r1
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L1a
            com.kwad.sdk.crash.model.b r1 = new com.kwad.sdk.crash.model.b     // Catch: java.lang.Exception -> L1a
            r1.<init>()     // Catch: java.lang.Exception -> L1a
            r1.parseJson(r0)     // Catch: java.lang.Exception -> L1a
            return r1
        L1a:
            r1 = move-exception
            java.lang.String r0 = "KsAdExceptionCollectorHelper"
            com.kwad.sdk.core.d.c.w(r0, r1)
            com.kwad.sdk.crash.model.b r1 = new com.kwad.sdk.crash.model.b
            r1.<init>()
            return r1
    }

    private static java.lang.String ah(java.lang.String r2) {
            r0 = 46
            int r1 = r2.indexOf(r0)     // Catch: java.lang.Throwable -> L14
            int r1 = r1 + 1
            int r0 = r2.indexOf(r0, r1)     // Catch: java.lang.Throwable -> L14
            if (r0 <= 0) goto L18
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r2)
        L18:
            r2 = 0
            return r2
    }

    public static synchronized void am(android.content.Context r1) {
            java.lang.Class<com.kwad.components.core.d.a> r0 = com.kwad.components.core.d.a.class
            monitor-enter(r0)
            if (r1 == 0) goto L22
            java.util.concurrent.atomic.AtomicBoolean r1 = com.kwad.components.core.d.a.Od     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L22
            boolean r1 = com.kwad.components.core.d.a.Oc     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L12
            goto L22
        L12:
            r1 = 1
            com.kwad.components.core.d.a.Oc = r1     // Catch: java.lang.Throwable -> L1f
            com.kwad.components.core.d.a$2 r1 = new com.kwad.components.core.d.a$2     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            com.kwad.sdk.utils.h.execute(r1)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return
        L1f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
        L22:
            monitor-exit(r0)
            return
    }

    private static void b(java.lang.Throwable r1) {
            java.util.List<java.lang.Throwable> r0 = com.kwad.components.core.d.a.Oe
            if (r0 != 0) goto Lb
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.kwad.components.core.d.a.Oe = r0
        Lb:
            java.util.List<java.lang.Throwable> r0 = com.kwad.components.core.d.a.Oe
            r0.add(r1)
            return
    }

    static /* synthetic */ java.util.List cb() {
            java.util.List<com.kwad.components.core.d.a$b> r0 = com.kwad.components.core.d.a.Og
            return r0
    }

    public static synchronized void initAsync(android.content.Context r1) {
            java.lang.Class<com.kwad.components.core.d.a> r0 = com.kwad.components.core.d.a.class
            monitor-enter(r0)
            if (r1 == 0) goto L22
            java.util.concurrent.atomic.AtomicBoolean r1 = com.kwad.components.core.d.a.mHasInit     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L22
            boolean r1 = com.kwad.components.core.d.a.Ob     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L12
            goto L22
        L12:
            r1 = 1
            com.kwad.components.core.d.a.Ob = r1     // Catch: java.lang.Throwable -> L1f
            com.kwad.components.core.d.a$1 r1 = new com.kwad.components.core.d.a$1     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            com.kwad.sdk.utils.h.execute(r1)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return
        L1f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
        L22:
            monitor-exit(r0)
            return
    }

    public static void j(java.lang.String r1, java.lang.String r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.d.a.mHasInit
            boolean r0 = r0.get()
            if (r0 != 0) goto Lc
            k(r1, r2)
            return
        Lc:
            com.kwad.sdk.crash.report.h.ah(r1, r2)
            return
    }

    private static void k(java.lang.String r1, java.lang.String r2) {
            java.util.Map<java.lang.String, java.lang.String> r0 = com.kwad.components.core.d.a.Of
            if (r0 != 0) goto Lb
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.kwad.components.core.d.a.Of = r0
        Lb:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L16
            java.util.Map<java.lang.String, java.lang.String> r0 = com.kwad.components.core.d.a.Of
            r0.put(r1, r2)
        L16:
            return
    }

    private static java.lang.String[] oA() {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Class<com.kwad.sdk.crash.d> r1 = com.kwad.sdk.crash.d.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "."
            int r2 = r1.lastIndexOf(r2)     // Catch: java.lang.Throwable -> L17
            r3 = 0
            java.lang.String r1 = r1.substring(r3, r2)     // Catch: java.lang.Throwable -> L17
            r0[r3] = r1     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
            return r0
    }

    static /* synthetic */ com.kwad.sdk.crash.c oB() {
            com.kwad.sdk.crash.c r0 = oy()
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean oC() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.d.a.mHasInit
            return r0
    }

    static /* synthetic */ void oD() {
            ow()
            return
    }

    static /* synthetic */ void oE() {
            ox()
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean oF() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.d.a.Od
            return r0
    }

    static /* synthetic */ java.util.List oG() {
            java.util.List<com.kwad.components.core.d.a$c> r0 = com.kwad.components.core.d.a.Oh
            return r0
    }

    private static boolean ov() {
            com.kwad.sdk.core.config.item.k r0 = com.kwad.sdk.core.config.c.ayG
            boolean r0 = com.kwad.sdk.core.config.e.b(r0)
            return r0
    }

    private static void ow() {
            java.util.List<java.lang.Throwable> r0 = com.kwad.components.core.d.a.Oe
            if (r0 == 0) goto L31
            boolean r0 = ov()
            if (r0 != 0) goto Lb
            goto L31
        Lb:
            java.util.List<java.lang.Throwable> r0 = com.kwad.components.core.d.a.Oe
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.kwad.sdk.crash.b.n(r1)
            goto L11
        L21:
            java.util.List<java.lang.Throwable> r0 = com.kwad.components.core.d.a.Oe
            r0.clear()
            r0 = 0
            com.kwad.components.core.d.a.Oe = r0
            com.kwad.components.core.d.a$3 r0 = new com.kwad.components.core.d.a$3
            r0.<init>()
            com.kwad.sdk.service.ServiceProvider.f(r0)
        L31:
            return
    }

    private static void ox() {
            java.util.Map<java.lang.String, java.lang.String> r0 = com.kwad.components.core.d.a.Of
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto Ld
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            com.kwad.sdk.crash.report.h.ah(r2, r1)
            goto Ld
        L2b:
            java.util.Map<java.lang.String, java.lang.String> r0 = com.kwad.components.core.d.a.Of
            r0.clear()
            return
    }

    @androidx.annotation.NonNull
    private static com.kwad.sdk.crash.c oy() {
            com.kwad.sdk.core.config.item.r r0 = com.kwad.sdk.core.config.c.aAd
            java.lang.String r0 = com.kwad.sdk.core.config.e.a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "configStr:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "KsAdExceptionCollectorHelper"
            com.kwad.sdk.core.d.c.d(r2, r1)
            com.kwad.sdk.crash.model.b r0 = ag(r0)
            java.lang.String r1 = r0.aPr
            java.lang.String r2 = r0.aPs
            boolean r3 = com.kwad.sdk.crash.utils.g.a(r0)
            boolean r4 = com.kwad.sdk.crash.utils.g.b(r0)
            android.content.Context r5 = com.kwad.sdk.service.ServiceProvider.getContext()
            java.lang.String r6 = com.kwad.components.core.d.a.C0068a.an(r5)
            com.kwad.sdk.crash.c$a r7 = new com.kwad.sdk.crash.c$a
            r7.<init>()
            com.kwad.sdk.crash.c$a r7 = r7.cb(r5)
            com.kwad.sdk.crash.c$a r3 = r7.bE(r3)
            com.kwad.sdk.crash.c$a r3 = r3.bF(r4)
            com.kwad.sdk.l r4 = com.kwad.sdk.l.Cf()
            boolean r4 = r4.Bk()
            com.kwad.sdk.crash.c$a r3 = r3.bG(r4)
            com.kwad.sdk.crash.c$a r1 = r3.fj(r1)
            com.kwad.sdk.crash.c$a r1 = r1.fi(r2)
            com.kwad.sdk.l.Cf()
            java.lang.String r2 = com.kwad.sdk.l.getSDKVersion()
            r3 = 1
            java.lang.String r2 = com.kwad.sdk.crash.model.message.ExceptionMessage.getSdkCrashVersionName(r2, r3)
            com.kwad.sdk.crash.c$a r1 = r1.fq(r2)
            com.kwad.sdk.l.Cf()
            r2 = 4063001(0x3dff19, float:5.693477E-39)
            com.kwad.sdk.crash.c$a r1 = r1.dT(r2)
            com.kwad.sdk.l r2 = com.kwad.sdk.l.Cf()
            java.lang.String r2 = r2.getApiVersion()
            java.lang.String r2 = com.kwad.sdk.crash.model.message.ExceptionMessage.getSdkCrashVersionName(r2, r3)
            com.kwad.sdk.crash.c$a r1 = r1.fr(r2)
            com.kwad.sdk.l r2 = com.kwad.sdk.l.Cf()
            int r2 = r2.getApiVersionCode()
            com.kwad.sdk.crash.c$a r1 = r1.dU(r2)
            com.kwad.sdk.crash.c$a r1 = r1.dV(r3)
            java.lang.String r2 = "com.kwad.sdk"
            com.kwad.sdk.crash.c$a r1 = r1.fp(r2)
            java.lang.String r2 = r5.getPackageName()
            com.kwad.sdk.crash.c$a r1 = r1.fs(r2)
            com.kwad.sdk.api.SdkConfig r2 = com.kwad.sdk.service.ServiceProvider.getSDKConfig()
            java.lang.String r2 = r2.appId
            com.kwad.sdk.crash.c$a r1 = r1.ft(r2)
            com.kwad.sdk.api.SdkConfig r2 = com.kwad.sdk.service.ServiceProvider.getSDKConfig()
            java.lang.String r2 = r2.appName
            com.kwad.sdk.crash.c$a r1 = r1.fu(r2)
            java.lang.String r2 = com.kwad.sdk.utils.m.cE(r5)
            com.kwad.sdk.crash.c$a r1 = r1.fv(r2)
            java.lang.String r2 = r0.aPn
            com.kwad.sdk.crash.c$a r1 = r1.fw(r2)
            java.lang.String r2 = r0.aPo
            com.kwad.sdk.crash.c$a r1 = r1.fx(r2)
            java.lang.String r2 = com.kwad.sdk.utils.bd.getDeviceId()
            com.kwad.sdk.crash.c$a r1 = r1.fm(r2)
            com.kwad.sdk.api.SdkConfig r2 = com.kwad.sdk.service.ServiceProvider.getSDKConfig()
            java.lang.String r2 = r2.appId
            com.kwad.sdk.crash.c$a r1 = r1.fn(r2)
            java.lang.String r2 = r0.version
            com.kwad.sdk.crash.c$a r1 = r1.fl(r2)
            java.lang.String r2 = r0.aPq
            com.kwad.sdk.crash.c$a r1 = r1.fy(r2)
            java.lang.String r0 = r0.aPp
            com.kwad.sdk.crash.c$a r0 = r1.fz(r0)
            java.lang.String r1 = "Android"
            com.kwad.sdk.crash.c$a r0 = r0.fk(r1)
            com.kwad.sdk.crash.c$a r0 = r0.fo(r6)
            com.kwad.components.core.d.a$5 r1 = new com.kwad.components.core.d.a$5
            r1.<init>(r5)
            com.kwad.sdk.crash.c$a r0 = r0.a(r1)
            com.kwad.components.core.d.a$4 r1 = new com.kwad.components.core.d.a$4
            r1.<init>(r5)
            com.kwad.sdk.crash.c$a r0 = r0.a(r1)
            java.lang.String[] r1 = oz()
            com.kwad.sdk.crash.c$a r0 = r0.d(r1)
            java.lang.String[] r1 = oA()
            com.kwad.sdk.crash.c$a r0 = r0.e(r1)
            java.util.List r1 = com.kwad.sdk.core.config.e.EY()
            com.kwad.sdk.crash.c$a r0 = r0.H(r1)
            com.kwad.sdk.core.config.item.f r1 = com.kwad.sdk.core.config.c.aBl
            double r1 = com.kwad.sdk.core.config.e.a(r1)
            com.kwad.sdk.crash.c$a r0 = r0.m(r1)
            com.kwad.sdk.crash.c r0 = r0.Lq()
            return r0
    }

    private static java.lang.String[] oz() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<com.kwad.sdk.KsAdSDKImpl> r1 = com.kwad.sdk.KsAdSDKImpl.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = ah(r1)     // Catch: java.lang.Throwable -> L20
            r0.add(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Class<com.kwad.sdk.DownloadTask> r1 = com.kwad.sdk.DownloadTask.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = ah(r1)     // Catch: java.lang.Throwable -> L20
            r0.add(r1)     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
        L24:
            java.lang.Class<com.kwai.CpuMemoryProfiler> r1 = com.kwai.CpuMemoryProfiler.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = ah(r1)     // Catch: java.lang.Throwable -> L3e
            r0.add(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<com.kuaishou.aegon.Aegon> r1 = com.kuaishou.aegon.Aegon.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = ah(r1)     // Catch: java.lang.Throwable -> L3e
            r0.add(r1)     // Catch: java.lang.Throwable -> L3e
        L3e:
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public static void reportSdkCaughtException(java.lang.Throwable r1) {
            com.kwad.sdk.core.d.c.printStackTrace(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.d.a.mHasInit
            boolean r0 = r0.get()
            if (r0 != 0) goto Lf
            b(r1)
            return
        Lf:
            boolean r0 = ov()
            if (r0 == 0) goto L18
            com.kwad.sdk.crash.b.n(r1)
        L18:
            return
    }
}
