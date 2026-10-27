package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class GoogleApiManager implements android.os.Handler.Callback {

    @androidx.annotation.NonNull
    public static final com.google.android.gms.common.api.Status zaa = null;
    private static final com.google.android.gms.common.api.Status zab = null;
    private static final java.lang.Object zac = null;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private static com.google.android.gms.common.api.internal.GoogleApiManager zad;
    private long zae;
    private boolean zaf;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.TelemetryData zag;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.TelemetryLoggingClient zah;
    private final android.content.Context zai;
    private final com.google.android.gms.common.GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;
    private final java.util.concurrent.atomic.AtomicInteger zal;
    private final java.util.concurrent.atomic.AtomicInteger zam;
    private final java.util.Map zan;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private com.google.android.gms.common.api.internal.zaae zao;

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private final java.util.Set zap;
    private final java.util.Set zaq;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.os.Handler zar;
    private volatile boolean zas;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 4
            java.lang.String r2 = "Sign-out occurred while this API call was in progress."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager.zaa = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "The user must be signed in to make this API call."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager.zab = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.api.internal.GoogleApiManager.zac = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    private GoogleApiManager(android.content.Context r6, android.os.Looper r7, com.google.android.gms.common.GoogleApiAvailability r8) {
            r5 = this;
            r5.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r5.zae = r0
            r0 = 0
            r5.zaf = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 1
            r1.<init>(r2)
            r5.zal = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r5.zam = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r3 = 5
            r4 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r3, r4, r2)
            r5.zan = r1
            r1 = 0
            r5.zao = r1
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
            r5.zap = r1
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
            r5.zaq = r1
            r5.zas = r2
            r5.zai = r6
            com.google.android.gms.internal.base.zau r1 = new com.google.android.gms.internal.base.zau
            r1.<init>(r7, r5)
            r5.zar = r1
            r5.zaj = r8
            com.google.android.gms.common.internal.zal r7 = new com.google.android.gms.common.internal.zal
            r7.<init>(r8)
            r5.zak = r7
            boolean r6 = com.google.android.gms.common.util.DeviceProperties.isAuto(r6)
            if (r6 == 0) goto L50
            r5.zas = r0
        L50:
            r6 = 6
            android.os.Message r6 = r1.obtainMessage(r6)
            r1.sendMessage(r6)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void reportSignOut() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.util.concurrent.atomic.AtomicInteger r2 = r1.zam     // Catch: java.lang.Throwable -> L18
            r2.incrementAndGet()     // Catch: java.lang.Throwable -> L18
            android.os.Handler r1 = r1.zar     // Catch: java.lang.Throwable -> L18
            r2 = 10
            android.os.Message r2 = r1.obtainMessage(r2)     // Catch: java.lang.Throwable -> L18
            r1.sendMessageAtFrontOfQueue(r2)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    static /* bridge */ /* synthetic */ boolean zaC(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            boolean r0 = r0.zas
            return r0
    }

    private static com.google.android.gms.common.api.Status zaF(com.google.android.gms.common.api.internal.ApiKey r4, com.google.android.gms.common.ConnectionResult r5) {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r4 = r4.zaa()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "API: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " is not available on this device. Connection failed with: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r0.<init>(r5, r4)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @androidx.annotation.WorkerThread
    private final com.google.android.gms.common.api.internal.zabq zaG(com.google.android.gms.common.api.GoogleApi r3) {
            r2 = this;
            java.util.Map r0 = r2.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = r3.getApiKey()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L18
            com.google.android.gms.common.api.internal.zabq r0 = new com.google.android.gms.common.api.internal.zabq
            r0.<init>(r2, r3)
            java.util.Map r3 = r2.zan
            r3.put(r1, r0)
        L18:
            boolean r3 = r0.zaA()
            if (r3 == 0) goto L23
            java.util.Set r3 = r2.zaq
            r3.add(r1)
        L23:
            r0.zao()
            return r0
    }

    @androidx.annotation.WorkerThread
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zaH() {
            r1 = this;
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zah
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.zai
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = com.google.android.gms.common.internal.TelemetryLogging.getClient(r0)
            r1.zah = r0
        Lc:
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zah
            return r0
    }

    @androidx.annotation.WorkerThread
    private final void zaI() {
            r2 = this;
            com.google.android.gms.common.internal.TelemetryData r0 = r2.zag
            if (r0 == 0) goto L1a
            int r1 = r0.zaa()
            if (r1 > 0) goto L10
            boolean r1 = r2.zaD()
            if (r1 == 0) goto L17
        L10:
            com.google.android.gms.common.internal.TelemetryLoggingClient r1 = r2.zaH()
            r1.log(r0)
        L17:
            r0 = 0
            r2.zag = r0
        L1a:
            return
    }

    private final void zaJ(com.google.android.gms.tasks.TaskCompletionSource r2, int r3, com.google.android.gms.common.api.GoogleApi r4) {
            r1 = this;
            if (r3 == 0) goto L1d
            com.google.android.gms.common.api.internal.ApiKey r4 = r4.getApiKey()
            com.google.android.gms.common.api.internal.zacd r3 = com.google.android.gms.common.api.internal.zacd.zaa(r1, r3, r4)
            if (r3 == 0) goto L1d
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            android.os.Handler r4 = r1.zar
            r4.getClass()
            com.google.android.gms.common.api.internal.zabk r0 = new com.google.android.gms.common.api.internal.zabk
            r0.<init>(r4)
            r2.addOnCompleteListener(r0, r3)
        L1d:
            return
    }

    static /* bridge */ /* synthetic */ long zab(com.google.android.gms.common.api.internal.GoogleApiManager r2) {
            long r0 = r2.zae
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context zac(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            android.content.Context r0 = r0.zai
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Handler zad(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            android.os.Handler r0 = r0.zar
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zae(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.GoogleApiAvailability r0 = r0.zaj
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zaf() {
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zab
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zag(com.google.android.gms.common.api.internal.ApiKey r0, com.google.android.gms.common.ConnectionResult r1) {
            com.google.android.gms.common.api.Status r0 = zaF(r0, r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zaae zah(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.api.internal.zaae r0 = r0.zao
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.api.internal.GoogleApiManager zaj() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Must guarantee manager is non-null before using getInstance"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.common.api.internal.GoogleApiManager zak(@androidx.annotation.NonNull android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L25
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L23
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = new com.google.android.gms.common.api.internal.GoogleApiManager     // Catch: java.lang.Throwable -> L23
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L23
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.common.GoogleApiAvailability r3 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L23
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.common.api.internal.GoogleApiManager.zad = r2     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r4 = move-exception
            goto L29
        L25:
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r4
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.zal zal(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.internal.zal r0 = r0.zak
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zaq() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zar(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            java.util.Map r0 = r0.zan
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Set zas(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            java.util.Set r0 = r0.zap
            return r0
    }

    static /* bridge */ /* synthetic */ void zat(com.google.android.gms.common.api.internal.GoogleApiManager r0, boolean r1) {
            r1 = 1
            r0.zaf = r1
            return
    }

    @Override // android.os.Handler.Callback
    @androidx.annotation.WorkerThread
    public final boolean handleMessage(@androidx.annotation.NonNull android.os.Message r9) {
            r8 = this;
            int r0 = r9.what
            r1 = 13
            r2 = 300000(0x493e0, double:1.482197E-318)
            r4 = 0
            r5 = 1
            r6 = 17
            r7 = 0
            switch(r0) {
                case 1: goto L2d0;
                case 2: goto L280;
                case 3: goto L263;
                case 4: goto L226;
                case 5: goto L1b6;
                case 6: goto L17f;
                case 7: goto L176;
                case 8: goto L226;
                case 9: goto L15d;
                case 10: goto L136;
                case 11: goto L11d;
                case 12: goto L104;
                case 13: goto L226;
                case 14: goto Ld0;
                case 15: goto Laf;
                case 16: goto L8e;
                case 17: goto L89;
                case 18: goto L14;
                case 19: goto L10;
                default: goto Lf;
            }
        Lf:
            return r7
        L10:
            r8.zaf = r7
            goto L308
        L14:
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.api.internal.zace r9 = (com.google.android.gms.common.api.internal.zace) r9
            long r0 = r9.zac
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L3a
            com.google.android.gms.common.internal.TelemetryData r0 = new com.google.android.gms.common.internal.TelemetryData
            int r1 = r9.zab
            com.google.android.gms.common.internal.MethodInvocation r9 = r9.zaa
            com.google.android.gms.common.internal.MethodInvocation[] r2 = new com.google.android.gms.common.internal.MethodInvocation[r5]
            r2[r7] = r9
            java.util.List r9 = java.util.Arrays.asList(r2)
            r0.<init>(r1, r9)
            com.google.android.gms.common.internal.TelemetryLoggingClient r9 = r8.zaH()
            r9.log(r0)
            goto L308
        L3a:
            com.google.android.gms.common.internal.TelemetryData r0 = r8.zag
            if (r0 == 0) goto L65
            java.util.List r1 = r0.zab()
            int r0 = r0.zaa()
            int r2 = r9.zab
            if (r0 != r2) goto L5d
            if (r1 == 0) goto L55
            int r0 = r1.size()
            int r1 = r9.zad
            if (r0 < r1) goto L55
            goto L5d
        L55:
            com.google.android.gms.common.internal.TelemetryData r0 = r8.zag
            com.google.android.gms.common.internal.MethodInvocation r1 = r9.zaa
            r0.zac(r1)
            goto L65
        L5d:
            android.os.Handler r0 = r8.zar
            r0.removeMessages(r6)
            r8.zaI()
        L65:
            com.google.android.gms.common.internal.TelemetryData r0 = r8.zag
            if (r0 != 0) goto L308
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.internal.MethodInvocation r1 = r9.zaa
            r0.add(r1)
            com.google.android.gms.common.internal.TelemetryData r1 = new com.google.android.gms.common.internal.TelemetryData
            int r2 = r9.zab
            r1.<init>(r2, r0)
            r8.zag = r1
            android.os.Handler r0 = r8.zar
            android.os.Message r1 = r0.obtainMessage(r6)
            long r2 = r9.zac
            r0.sendMessageDelayed(r1, r2)
            goto L308
        L89:
            r8.zaI()
            goto L308
        L8e:
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.api.internal.zabs r9 = (com.google.android.gms.common.api.internal.zabs) r9
            java.util.Map r0 = r8.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r9)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L308
            java.util.Map r0 = r8.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r9)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            com.google.android.gms.common.api.internal.zabq.zam(r0, r9)
            goto L308
        Laf:
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.api.internal.zabs r9 = (com.google.android.gms.common.api.internal.zabs) r9
            java.util.Map r0 = r8.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r9)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L308
            java.util.Map r0 = r8.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r9)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            com.google.android.gms.common.api.internal.zabq.zal(r0, r9)
            goto L308
        Ld0:
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.api.internal.zaaf r9 = (com.google.android.gms.common.api.internal.zaaf) r9
            com.google.android.gms.common.api.internal.ApiKey r0 = r9.zaa()
            java.util.Map r1 = r8.zan
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto Leb
            com.google.android.gms.tasks.TaskCompletionSource r9 = r9.zab()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.setResult(r0)
            goto L308
        Leb:
            java.util.Map r1 = r8.zan
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            boolean r0 = com.google.android.gms.common.api.internal.zabq.zay(r0, r7)
            com.google.android.gms.tasks.TaskCompletionSource r9 = r9.zab()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.setResult(r0)
            goto L308
        L104:
            java.util.Map r0 = r8.zan
            java.lang.Object r1 = r9.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L308
            java.util.Map r0 = r8.zan
            java.lang.Object r9 = r9.obj
            java.lang.Object r9 = r0.get(r9)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            r9.zaB()
            goto L308
        L11d:
            java.util.Map r0 = r8.zan
            java.lang.Object r1 = r9.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L308
            java.util.Map r0 = r8.zan
            java.lang.Object r9 = r9.obj
            java.lang.Object r9 = r0.get(r9)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            r9.zaw()
            goto L308
        L136:
            java.util.Set r9 = r8.zaq
            java.util.Iterator r9 = r9.iterator()
        L13c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L156
            java.lang.Object r0 = r9.next()
            com.google.android.gms.common.api.internal.ApiKey r0 = (com.google.android.gms.common.api.internal.ApiKey) r0
            java.util.Map r1 = r8.zan
            java.lang.Object r0 = r1.remove(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 == 0) goto L13c
            r0.zav()
            goto L13c
        L156:
            java.util.Set r9 = r8.zaq
            r9.clear()
            goto L308
        L15d:
            java.util.Map r0 = r8.zan
            java.lang.Object r1 = r9.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L308
            java.util.Map r0 = r8.zan
            java.lang.Object r9 = r9.obj
            java.lang.Object r9 = r0.get(r9)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            r9.zau()
            goto L308
        L176:
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.api.GoogleApi r9 = (com.google.android.gms.common.api.GoogleApi) r9
            r8.zaG(r9)
            goto L308
        L17f:
            android.content.Context r9 = r8.zai
            android.content.Context r9 = r9.getApplicationContext()
            android.content.Context r9 = com.stub.StubApp.getOrigApplicationContext(r9)
            boolean r9 = r9 instanceof android.app.Application
            if (r9 == 0) goto L308
            android.content.Context r9 = r8.zai
            android.content.Context r9 = r9.getApplicationContext()
            android.content.Context r9 = com.stub.StubApp.getOrigApplicationContext(r9)
            android.app.Application r9 = (android.app.Application) r9
            com.google.android.gms.common.api.internal.BackgroundDetector.initialize(r9)
            com.google.android.gms.common.api.internal.BackgroundDetector r9 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            com.google.android.gms.common.api.internal.zabl r0 = new com.google.android.gms.common.api.internal.zabl
            r0.<init>(r8)
            r9.addListener(r0)
            com.google.android.gms.common.api.internal.BackgroundDetector r9 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            boolean r9 = r9.readCurrentStateIfPossible(r5)
            if (r9 != 0) goto L308
            r8.zae = r2
            goto L308
        L1b6:
            int r0 = r9.arg1
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.ConnectionResult r9 = (com.google.android.gms.common.ConnectionResult) r9
            java.util.Map r2 = r8.zan
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L1c6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d9
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.internal.zabq r3 = (com.google.android.gms.common.api.internal.zabq) r3
            int r7 = r3.zab()
            if (r7 != r0) goto L1c6
            r4 = r3
        L1d9:
            if (r4 == 0) goto L21f
            int r0 = r9.getErrorCode()
            if (r0 != r1) goto L212
            com.google.android.gms.common.GoogleApiAvailability r0 = r8.zaj
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            int r2 = r9.getErrorCode()
            java.lang.String r0 = r0.getErrorString(r2)
            java.lang.String r9 = r9.getErrorMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error resolution was canceled by the user, original error message: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r1.<init>(r6, r9)
            com.google.android.gms.common.api.internal.zabq.zai(r4, r1)
            goto L308
        L212:
            com.google.android.gms.common.api.internal.ApiKey r0 = com.google.android.gms.common.api.internal.zabq.zag(r4)
            com.google.android.gms.common.api.Status r9 = zaF(r0, r9)
            com.google.android.gms.common.api.internal.zabq.zai(r4, r9)
            goto L308
        L21f:
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>()
            goto L308
        L226:
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.api.internal.zach r9 = (com.google.android.gms.common.api.internal.zach) r9
            java.util.Map r0 = r8.zan
            com.google.android.gms.common.api.GoogleApi r1 = r9.zac
            com.google.android.gms.common.api.internal.ApiKey r1 = r1.getApiKey()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L240
            com.google.android.gms.common.api.GoogleApi r0 = r9.zac
            com.google.android.gms.common.api.internal.zabq r0 = r8.zaG(r0)
        L240:
            boolean r1 = r0.zaA()
            if (r1 == 0) goto L25c
            java.util.concurrent.atomic.AtomicInteger r1 = r8.zam
            int r1 = r1.get()
            int r2 = r9.zab
            if (r1 == r2) goto L25c
            com.google.android.gms.common.api.internal.zai r9 = r9.zaa
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaa
            r9.zad(r1)
            r0.zav()
            goto L308
        L25c:
            com.google.android.gms.common.api.internal.zai r9 = r9.zaa
            r0.zap(r9)
            goto L308
        L263:
            java.util.Map r9 = r8.zan
            java.util.Collection r9 = r9.values()
            java.util.Iterator r9 = r9.iterator()
        L26d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L308
            java.lang.Object r0 = r9.next()
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            r0.zan()
            r0.zao()
            goto L26d
        L280:
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.api.internal.zal r9 = (com.google.android.gms.common.api.internal.zal) r9
            java.util.Set r0 = r9.zab()
            java.util.Iterator r0 = r0.iterator()
        L28c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L308
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.internal.ApiKey r2 = (com.google.android.gms.common.api.internal.ApiKey) r2
            java.util.Map r3 = r8.zan
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.common.api.internal.zabq r3 = (com.google.android.gms.common.api.internal.zabq) r3
            if (r3 != 0) goto L2ab
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r1)
            r9.zac(r2, r0, r4)
            goto L308
        L2ab:
            boolean r6 = r3.zaz()
            if (r6 == 0) goto L2bf
            com.google.android.gms.common.ConnectionResult r6 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            com.google.android.gms.common.api.Api$Client r3 = r3.zaf()
            java.lang.String r3 = r3.getEndpointPackageName()
            r9.zac(r2, r6, r3)
            goto L28c
        L2bf:
            com.google.android.gms.common.ConnectionResult r6 = r3.zad()
            if (r6 == 0) goto L2c9
            r9.zac(r2, r6, r4)
            goto L28c
        L2c9:
            r3.zat(r9)
            r3.zao()
            goto L28c
        L2d0:
            java.lang.Object r9 = r9.obj
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r5 == r9) goto L2db
            goto L2dd
        L2db:
            r2 = 10000(0x2710, double:4.9407E-320)
        L2dd:
            r8.zae = r2
            android.os.Handler r9 = r8.zar
            r0 = 12
            r9.removeMessages(r0)
            java.util.Map r9 = r8.zan
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L2f0:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L308
            java.lang.Object r1 = r9.next()
            com.google.android.gms.common.api.internal.ApiKey r1 = (com.google.android.gms.common.api.internal.ApiKey) r1
            android.os.Handler r2 = r8.zar
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            long r3 = r8.zae
            r2.sendMessageDelayed(r1, r3)
            goto L2f0
        L308:
            return r5
    }

    public final void zaA(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaae r3) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zaae r1 = r2.zao     // Catch: java.lang.Throwable -> Lf
            if (r1 == r3) goto L11
            r2.zao = r3     // Catch: java.lang.Throwable -> Lf
            java.util.Set r1 = r2.zap     // Catch: java.lang.Throwable -> Lf
            r1.clear()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L1c
        L11:
            java.util.Set r1 = r2.zap     // Catch: java.lang.Throwable -> Lf
            androidx.collection.ArraySet r3 = r3.zaa()     // Catch: java.lang.Throwable -> Lf
            r1.addAll(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    final void zaB(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaae r3) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zaae r1 = r2.zao     // Catch: java.lang.Throwable -> L10
            if (r1 != r3) goto L12
            r3 = 0
            r2.zao = r3     // Catch: java.lang.Throwable -> L10
            java.util.Set r3 = r2.zap     // Catch: java.lang.Throwable -> L10
            r3.clear()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @androidx.annotation.WorkerThread
    final boolean zaD() {
            r4 = this;
            boolean r0 = r4.zaf
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.getConfig()
            if (r0 == 0) goto L18
            boolean r0 = r0.getMethodInvocationTelemetryEnabled()
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            com.google.android.gms.common.internal.zal r0 = r4.zak
            android.content.Context r2 = r4.zai
            r3 = 203400000(0xc1fa340, float:1.2298041E-31)
            int r0 = r0.zaa(r2, r3)
            r2 = -1
            if (r0 == r2) goto L2a
            if (r0 != 0) goto L29
            goto L2a
        L29:
            return r1
        L2a:
            r0 = 1
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final boolean zaE(com.google.android.gms.common.ConnectionResult r3, int r4) {
            r2 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = r2.zaj
            android.content.Context r1 = r2.zai
            boolean r3 = r0.zah(r1, r3, r4)
            return r3
    }

    public final int zaa() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zal
            int r0 = r0.getAndIncrement()
            return r0
    }

    @androidx.annotation.Nullable
    final com.google.android.gms.common.api.internal.zabq zai(com.google.android.gms.common.api.internal.ApiKey r2) {
            r1 = this;
            java.util.Map r0 = r1.zan
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.internal.zabq r2 = (com.google.android.gms.common.api.internal.zabq) r2
            return r2
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task zam(@androidx.annotation.NonNull java.lang.Iterable r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zal r0 = new com.google.android.gms.common.api.internal.zal
            r0.<init>(r3)
            android.os.Handler r3 = r2.zar
            r1 = 2
            android.os.Message r3 = r3.obtainMessage(r1, r0)
            android.os.Handler r1 = r2.zar
            r1.sendMessage(r3)
            com.google.android.gms.tasks.Task r3 = r0.zaa()
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.tasks.Task zan(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaf r0 = new com.google.android.gms.common.api.internal.zaaf
            com.google.android.gms.common.api.internal.ApiKey r3 = r3.getApiKey()
            r0.<init>(r3)
            android.os.Handler r3 = r2.zar
            r1 = 14
            android.os.Message r3 = r3.obtainMessage(r1, r0)
            android.os.Handler r1 = r2.zar
            r1.sendMessage(r3)
            com.google.android.gms.tasks.TaskCompletionSource r3 = r0.zab()
            com.google.android.gms.tasks.Task r3 = r3.getTask()
            return r3
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task zao(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.RegisterListenerMethod r5, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.UnregisterListenerMethod r6, @androidx.annotation.NonNull java.lang.Runnable r7) {
            r3 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            int r1 = r5.zaa()
            r3.zaJ(r0, r1, r4)
            com.google.android.gms.common.api.internal.zaf r1 = new com.google.android.gms.common.api.internal.zaf
            com.google.android.gms.common.api.internal.zaci r2 = new com.google.android.gms.common.api.internal.zaci
            r2.<init>(r5, r6, r7)
            r1.<init>(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r5 = r3.zam
            com.google.android.gms.common.api.internal.zach r6 = new com.google.android.gms.common.api.internal.zach
            int r5 = r5.get()
            r6.<init>(r1, r5, r4)
            android.os.Handler r4 = r3.zar
            r5 = 8
            android.os.Message r4 = r4.obtainMessage(r5, r6)
            android.os.Handler r5 = r3.zar
            r5.sendMessage(r4)
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            return r4
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.tasks.Task zap(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi r3, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r4, int r5) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r2.zaJ(r0, r5, r3)
            com.google.android.gms.common.api.internal.zah r5 = new com.google.android.gms.common.api.internal.zah
            r5.<init>(r4, r0)
            java.util.concurrent.atomic.AtomicInteger r4 = r2.zam
            com.google.android.gms.common.api.internal.zach r1 = new com.google.android.gms.common.api.internal.zach
            int r4 = r4.get()
            r1.<init>(r5, r4, r3)
            android.os.Handler r3 = r2.zar
            r4 = 13
            android.os.Message r3 = r3.obtainMessage(r4, r1)
            android.os.Handler r4 = r2.zar
            r4.sendMessage(r3)
            com.google.android.gms.tasks.Task r3 = r0.getTask()
            return r3
    }

    public final void zau(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi r2, int r3, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r4) {
            r1 = this;
            com.google.android.gms.common.api.internal.zae r0 = new com.google.android.gms.common.api.internal.zae
            r0.<init>(r3, r4)
            java.util.concurrent.atomic.AtomicInteger r3 = r1.zam
            com.google.android.gms.common.api.internal.zach r4 = new com.google.android.gms.common.api.internal.zach
            int r3 = r3.get()
            r4.<init>(r0, r3, r2)
            android.os.Handler r2 = r1.zar
            r3 = 4
            android.os.Message r2 = r2.obtainMessage(r3, r4)
            android.os.Handler r3 = r1.zar
            r3.sendMessage(r2)
            return
    }

    public final void zav(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi r2, int r3, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.TaskApiCall r4, @androidx.annotation.NonNull com.google.android.gms.tasks.TaskCompletionSource r5, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
            r1 = this;
            int r0 = r4.zaa()
            r1.zaJ(r5, r0, r2)
            com.google.android.gms.common.api.internal.zag r0 = new com.google.android.gms.common.api.internal.zag
            r0.<init>(r3, r4, r5, r6)
            java.util.concurrent.atomic.AtomicInteger r3 = r1.zam
            com.google.android.gms.common.api.internal.zach r4 = new com.google.android.gms.common.api.internal.zach
            int r3 = r3.get()
            r4.<init>(r0, r3, r2)
            android.os.Handler r2 = r1.zar
            r3 = 4
            android.os.Message r2 = r2.obtainMessage(r3, r4)
            android.os.Handler r3 = r1.zar
            r3.sendMessage(r2)
            return
    }

    final void zaw(com.google.android.gms.common.internal.MethodInvocation r7, int r8, long r9, int r11) {
            r6 = this;
            com.google.android.gms.common.api.internal.zace r0 = new com.google.android.gms.common.api.internal.zace
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            android.os.Handler r7 = r6.zar
            r8 = 18
            android.os.Message r7 = r7.obtainMessage(r8, r0)
            android.os.Handler r8 = r6.zar
            r8.sendMessage(r7)
            return
    }

    public final void zax(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4, int r5) {
            r3 = this;
            boolean r0 = r3.zaE(r4, r5)
            if (r0 != 0) goto L11
            android.os.Handler r0 = r3.zar
            r1 = 5
            r2 = 0
            android.os.Message r4 = r0.obtainMessage(r1, r5, r2, r4)
            r0.sendMessage(r4)
        L11:
            return
    }

    public final void zay() {
            r2 = this;
            android.os.Handler r0 = r2.zar
            r1 = 3
            android.os.Message r1 = r0.obtainMessage(r1)
            r0.sendMessage(r1)
            return
    }

    public final void zaz(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi r3) {
            r2 = this;
            android.os.Handler r0 = r2.zar
            r1 = 7
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }
}
