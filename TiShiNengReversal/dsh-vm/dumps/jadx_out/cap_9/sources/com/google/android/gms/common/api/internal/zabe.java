package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zabe extends com.google.android.gms.common.api.GoogleApiClient implements com.google.android.gms.common.api.internal.zabz {

    @androidx.annotation.VisibleForTesting
    final java.util.Queue zaa;

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    com.google.android.gms.common.api.internal.zabx zab;
    final java.util.Map zac;
    java.util.Set zad;
    final com.google.android.gms.common.internal.ClientSettings zae;
    final java.util.Map zaf;
    final com.google.android.gms.common.api.Api.AbstractClientBuilder zag;

    @androidx.annotation.Nullable
    java.util.Set zah;
    final com.google.android.gms.common.api.internal.zadc zai;
    private final java.util.concurrent.locks.Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.api.internal.zaca zal;
    private final int zam;
    private final android.content.Context zan;
    private final android.os.Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final com.google.android.gms.common.api.internal.zabc zas;
    private final com.google.android.gms.common.GoogleApiAvailability zat;
    private final com.google.android.gms.common.api.internal.ListenerHolders zau;
    private final java.util.ArrayList zav;
    private java.lang.Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;

    public zabe(android.content.Context r4, java.util.concurrent.locks.Lock r5, android.os.Looper r6, com.google.android.gms.common.internal.ClientSettings r7, com.google.android.gms.common.GoogleApiAvailability r8, com.google.android.gms.common.api.Api.AbstractClientBuilder r9, java.util.Map r10, java.util.List r11, java.util.List r12, java.util.Map r13, int r14, int r15, java.util.ArrayList r16) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.zal = r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r3.zaa = r1
            r1 = 1
            boolean r2 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r1 == r2) goto L18
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            goto L1a
        L18:
            r1 = 10000(0x2710, double:4.9407E-320)
        L1a:
            r3.zaq = r1
            r1 = 5000(0x1388, double:2.4703E-320)
            r3.zar = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.zad = r1
            com.google.android.gms.common.api.internal.ListenerHolders r1 = new com.google.android.gms.common.api.internal.ListenerHolders
            r1.<init>()
            r3.zau = r1
            r3.zaw = r0
            r3.zah = r0
            com.google.android.gms.common.api.internal.zaay r0 = new com.google.android.gms.common.api.internal.zaay
            r0.<init>(r3)
            r3.zax = r0
            r3.zan = r4
            r3.zaj = r5
            com.google.android.gms.common.internal.zak r4 = new com.google.android.gms.common.internal.zak
            r4.<init>(r6, r0)
            r3.zak = r4
            r3.zao = r6
            com.google.android.gms.common.api.internal.zabc r4 = new com.google.android.gms.common.api.internal.zabc
            r4.<init>(r3, r6)
            r3.zas = r4
            r3.zat = r8
            r3.zam = r14
            if (r14 < 0) goto L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r3.zaw = r4
        L59:
            r3.zaf = r10
            r3.zac = r13
            r4 = r16
            r3.zav = r4
            com.google.android.gms.common.api.internal.zadc r4 = new com.google.android.gms.common.api.internal.zadc
            r4.<init>()
            r3.zai = r4
            java.util.Iterator r4 = r11.iterator()
        L6c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r4.next()
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r5 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r5
            com.google.android.gms.common.internal.zak r6 = r3.zak
            r6.zaf(r5)
            goto L6c
        L7e:
            java.util.Iterator r4 = r12.iterator()
        L82:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L94
            java.lang.Object r5 = r4.next()
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r5 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r5
            com.google.android.gms.common.internal.zak r6 = r3.zak
            r6.zag(r5)
            goto L82
        L94:
            r3.zae = r7
            r3.zag = r9
            return
    }

    public static int zad(java.lang.Iterable r4, boolean r5) {
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r4.next()
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            boolean r3 = r2.requiresSignIn()
            r0 = r0 | r3
            boolean r2 = r2.providesSignIn()
            r1 = r1 | r2
            goto L6
        L1d:
            if (r0 == 0) goto L27
            if (r1 == 0) goto L25
            if (r5 == 0) goto L25
            r4 = 2
            return r4
        L25:
            r4 = 1
            return r4
        L27:
            r4 = 3
            return r4
    }

    static /* bridge */ /* synthetic */ android.content.Context zae(com.google.android.gms.common.api.internal.zabe r0) {
            android.content.Context r0 = r0.zan
            return r0
    }

    static java.lang.String zag(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.lang.String r1 = "UNKNOWN"
            return r1
        Lc:
            java.lang.String r1 = "SIGN_IN_MODE_NONE"
            return r1
        Lf:
            java.lang.String r1 = "SIGN_IN_MODE_OPTIONAL"
            return r1
        L12:
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED"
            return r1
    }

    static /* bridge */ /* synthetic */ void zah(com.google.android.gms.common.api.internal.zabe r0, com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.common.api.internal.StatusPendingResult r2, boolean r3) {
            r3 = 1
            r0.zam(r1, r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ void zai(com.google.android.gms.common.api.internal.zabe r1) {
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.lock()
            boolean r0 = r1.zap     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            r1.zan()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L15
        Lf:
            java.util.concurrent.locks.Lock r1 = r1.zaj
            r1.unlock()
            return
        L15:
            java.util.concurrent.locks.Lock r1 = r1.zaj
            r1.unlock()
            throw r0
    }

    static /* bridge */ /* synthetic */ void zaj(com.google.android.gms.common.api.internal.zabe r1) {
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.lock()
            boolean r0 = r1.zak()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r1.zan()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L17
        L11:
            java.util.concurrent.locks.Lock r1 = r1.zaj
            r1.unlock()
            return
        L17:
            java.util.concurrent.locks.Lock r1 = r1.zaj
            r1.unlock()
            throw r0
    }

    private final void zal(int r13) {
            r12 = this;
            java.lang.Integer r0 = r12.zaw
            if (r0 != 0) goto Lb
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.zaw = r13
            goto L11
        Lb:
            int r0 = r0.intValue()
            if (r0 != r13) goto L94
        L11:
            com.google.android.gms.common.api.internal.zaca r13 = r12.zal
            if (r13 == 0) goto L16
            return
        L16:
            java.util.Map r13 = r12.zac
            java.util.Collection r13 = r13.values()
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
            r1 = 0
        L22:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r13.next()
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            boolean r3 = r2.requiresSignIn()
            r0 = r0 | r3
            boolean r2 = r2.providesSignIn()
            r1 = r1 | r2
            goto L22
        L39:
            java.lang.Integer r13 = r12.zaw
            int r13 = r13.intValue()
            r2 = 1
            if (r13 == r2) goto L64
            r1 = 2
            if (r13 == r1) goto L47
        L45:
            r2 = r12
            goto L69
        L47:
            if (r0 == 0) goto L45
            android.content.Context r2 = r12.zan
            java.util.concurrent.locks.Lock r4 = r12.zaj
            android.os.Looper r5 = r12.zao
            com.google.android.gms.common.GoogleApiAvailability r6 = r12.zat
            java.util.Map r7 = r12.zac
            com.google.android.gms.common.internal.ClientSettings r8 = r12.zae
            java.util.Map r9 = r12.zaf
            com.google.android.gms.common.api.Api$AbstractClientBuilder r10 = r12.zag
            java.util.ArrayList r11 = r12.zav
            r3 = r12
            com.google.android.gms.common.api.internal.zaaa r13 = com.google.android.gms.common.api.internal.zaaa.zag(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = r3
            r2.zal = r13
            return
        L64:
            r2 = r12
            if (r0 == 0) goto L8c
            if (r1 != 0) goto L84
        L69:
            android.content.Context r1 = r2.zan
            java.util.concurrent.locks.Lock r3 = r2.zaj
            android.os.Looper r4 = r2.zao
            com.google.android.gms.common.GoogleApiAvailability r5 = r2.zat
            java.util.Map r6 = r2.zac
            com.google.android.gms.common.internal.ClientSettings r7 = r2.zae
            java.util.Map r8 = r2.zaf
            com.google.android.gms.common.api.Api$AbstractClientBuilder r9 = r2.zag
            java.util.ArrayList r10 = r2.zav
            com.google.android.gms.common.api.internal.zabi r0 = new com.google.android.gms.common.api.internal.zabi
            r11 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2.zal = r0
            return
        L84:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r13.<init>(r0)
            throw r13
        L8c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r13.<init>(r0)
            throw r13
        L94:
            r2 = r12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r1 = r2.zaw
            int r1 = r1.intValue()
            java.lang.String r1 = zag(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot use sign-in mode: "
            r3.append(r4)
            java.lang.String r13 = zag(r13)
            r3.append(r13)
            java.lang.String r13 = ". Mode was already set to "
            r3.append(r13)
            r3.append(r1)
            java.lang.String r13 = r3.toString()
            r0.<init>(r13)
            throw r0
    }

    private final void zam(com.google.android.gms.common.api.GoogleApiClient r3, com.google.android.gms.common.api.internal.StatusPendingResult r4, boolean r5) {
            r2 = this;
            com.google.android.gms.common.internal.service.zae r0 = com.google.android.gms.common.internal.service.Common.zaa
            com.google.android.gms.common.api.PendingResult r0 = r0.zaa(r3)
            com.google.android.gms.common.api.internal.zabb r1 = new com.google.android.gms.common.api.internal.zabb
            r1.<init>(r2, r4, r5, r3)
            r0.setResultCallback(r1)
            return
    }

    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private final void zan() {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zab()
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.api.internal.zaca r0 = (com.google.android.gms.common.api.internal.zaca) r0
            r0.zaq()
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.common.ConnectionResult blockingConnect() {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "blockingConnect must not be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.lock()
            int r0 = r4.zam     // Catch: java.lang.Throwable -> L29
            if (r0 < 0) goto L2b
            java.lang.Integer r0 = r4.zaw     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L22
            goto L23
        L22:
            r2 = 0
        L23:
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r0)     // Catch: java.lang.Throwable -> L29
            goto L47
        L29:
            r0 = move-exception
            goto L75
        L2b:
            java.lang.Integer r0 = r4.zaw     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L40
            java.util.Map r0 = r4.zac     // Catch: java.lang.Throwable -> L29
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L29
            int r0 = zad(r0, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L29
            r4.zaw = r0     // Catch: java.lang.Throwable -> L29
            goto L47
        L40:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L29
            r1 = 2
            if (r0 == r1) goto L6d
        L47:
            java.lang.Integer r0 = r4.zaw     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L29
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L29
            r4.zal(r0)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.internal.zak r0 = r4.zak     // Catch: java.lang.Throwable -> L29
            r0.zab()     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.api.internal.zaca r0 = r4.zal     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.api.internal.zaca r0 = (com.google.android.gms.common.api.internal.zaca) r0     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.ConnectionResult r0 = r0.zab()     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.locks.Lock r1 = r4.zaj
            r1.unlock()
            return r0
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L29
        L75:
            java.util.concurrent.locks.Lock r1 = r4.zaj
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.ConnectionResult blockingConnect(long r4, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r6) {
            r3 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            if (r0 == r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "blockingConnect must not be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.lang.String r0 = "TimeUnit must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.lock()
            java.lang.Integer r0 = r3.zaw     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.util.Map r0 = r3.zac     // Catch: java.lang.Throwable -> L32
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L32
            int r0 = zad(r0, r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L32
            r3.zaw = r0     // Catch: java.lang.Throwable -> L32
            goto L3b
        L32:
            r4 = move-exception
            goto L69
        L34:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L32
            r1 = 2
            if (r0 == r1) goto L61
        L3b:
            java.lang.Integer r0 = r3.zaw     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L32
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L32
            r3.zal(r0)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.internal.zak r0 = r3.zak     // Catch: java.lang.Throwable -> L32
            r0.zab()     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.internal.zaca r0 = r3.zal     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.api.internal.zaca r0 = (com.google.android.gms.common.api.internal.zaca) r0     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.ConnectionResult r4 = r0.zac(r4, r6)     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.locks.Lock r5 = r3.zaj
            r5.unlock()
            return r4
        L61:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L69:
            java.util.concurrent.locks.Lock r5 = r3.zaj
            r5.unlock()
            throw r4
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect() {
            r6 = this;
            boolean r0 = r6.isConnected()
            java.lang.String r1 = "GoogleApiClient is not connected yet."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.lang.Integer r0 = r6.zaw
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            int r0 = r0.intValue()
            r3 = 2
            if (r0 == r3) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            java.lang.String r0 = "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API"
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r0)
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = new com.google.android.gms.common.api.internal.StatusPendingResult
            r0.<init>(r6)
            java.util.Map r2 = r6.zac
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.common.internal.service.zah> r3 = com.google.android.gms.common.internal.service.Common.CLIENT_KEY
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L30
            r6.zam(r6, r0, r1)
            return r0
        L30:
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.common.api.internal.zaaz r2 = new com.google.android.gms.common.api.internal.zaaz
            r2.<init>(r6, r1, r0)
            com.google.android.gms.common.api.internal.zaba r3 = new com.google.android.gms.common.api.internal.zaba
            r3.<init>(r6, r0)
            android.content.Context r4 = r6.zan
            com.google.android.gms.common.api.GoogleApiClient$Builder r5 = new com.google.android.gms.common.api.GoogleApiClient$Builder
            r5.<init>(r4)
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r4 = com.google.android.gms.common.internal.service.Common.API
            r5.addApi(r4)
            r5.addConnectionCallbacks(r2)
            r5.addOnConnectionFailedListener(r3)
            com.google.android.gms.common.api.internal.zabc r2 = r6.zas
            r5.setHandler(r2)
            com.google.android.gms.common.api.GoogleApiClient r2 = r5.build()
            r1.set(r2)
            r2.connect()
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.zaj
            r0.lock()
            int r0 = r5.zam     // Catch: java.lang.Throwable -> L19
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 < 0) goto L1c
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.String r4 = "Sign-in mode should have been set explicitly by auto-manage."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r4)     // Catch: java.lang.Throwable -> L19
            goto L37
        L19:
            r0 = move-exception
            goto L89
        L1c:
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L31
            java.util.Map r0 = r5.zac     // Catch: java.lang.Throwable -> L19
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L19
            int r0 = zad(r0, r2)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L19
            r5.zaw = r0     // Catch: java.lang.Throwable -> L19
            goto L37
        L31:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L19
            if (r0 == r1) goto L81
        L37:
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L19
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.Lock r4 = r5.zaj     // Catch: java.lang.Throwable -> L19
            r4.lock()     // Catch: java.lang.Throwable -> L19
            r4 = 3
            if (r0 == r4) goto L53
            if (r0 == r3) goto L53
            if (r0 != r1) goto L51
        L4f:
            r2 = 1
            goto L55
        L51:
            r1 = r0
            goto L55
        L53:
            r1 = r0
            goto L4f
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Illegal sign-in mode: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L7a
            r0.append(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r0)     // Catch: java.lang.Throwable -> L7a
            r5.zal(r1)     // Catch: java.lang.Throwable -> L7a
            r5.zan()     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.locks.Lock r0 = r5.zaj     // Catch: java.lang.Throwable -> L19
            r0.unlock()     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.locks.Lock r0 = r5.zaj
            r0.unlock()
            return
        L7a:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r5.zaj     // Catch: java.lang.Throwable -> L19
            r1.unlock()     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L89:
            java.util.concurrent.locks.Lock r1 = r5.zaj
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int r4) {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.lock()
            r0 = 3
            r1 = 1
            if (r4 == r0) goto L11
            if (r4 == r1) goto L11
            r0 = 2
            if (r4 != r0) goto L10
            r4 = 2
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Illegal sign-in mode: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L31
            r0.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)     // Catch: java.lang.Throwable -> L31
            r3.zal(r4)     // Catch: java.lang.Throwable -> L31
            r3.zan()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.Lock r4 = r3.zaj
            r4.unlock()
            return
        L31:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.unlock()
            throw r4
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.lock()
            com.google.android.gms.common.api.internal.zadc r0 = r3.zai     // Catch: java.lang.Throwable -> L12
            r0.zab()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.api.internal.zaca r0 = r3.zal     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            r0.zar()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L4a
        L14:
            com.google.android.gms.common.api.internal.ListenerHolders r0 = r3.zau     // Catch: java.lang.Throwable -> L12
            r0.zab()     // Catch: java.lang.Throwable -> L12
            java.util.Queue r0 = r3.zaa     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
        L1f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r1     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.zan(r2)     // Catch: java.lang.Throwable -> L12
            r1.cancel()     // Catch: java.lang.Throwable -> L12
            goto L1f
        L33:
            java.util.Queue r0 = r3.zaa     // Catch: java.lang.Throwable -> L12
            r0.clear()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.api.internal.zaca r0 = r3.zal     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L44
            r3.zak()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.internal.zak r0 = r3.zak     // Catch: java.lang.Throwable -> L12
            r0.zaa()     // Catch: java.lang.Throwable -> L12
        L44:
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.unlock()
            return
        L4a:
            java.util.concurrent.locks.Lock r1 = r3.zaj
            r1.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(java.lang.String r3, @androidx.annotation.Nullable java.io.FileDescriptor r4, java.io.PrintWriter r5, @androidx.annotation.Nullable java.lang.String[] r6) {
            r2 = this;
            java.io.PrintWriter r0 = r5.append(r3)
            java.lang.String r1 = "mContext="
            java.io.PrintWriter r0 = r0.append(r1)
            android.content.Context r1 = r2.zan
            r0.println(r1)
            java.io.PrintWriter r0 = r5.append(r3)
            java.lang.String r1 = "mResuming="
            java.io.PrintWriter r0 = r0.append(r1)
            boolean r1 = r2.zap
            r0.print(r1)
            java.util.Queue r0 = r2.zaa
            java.lang.String r1 = " mWorkQueue.size()="
            java.io.PrintWriter r1 = r5.append(r1)
            int r0 = r0.size()
            r1.print(r0)
            com.google.android.gms.common.api.internal.zadc r0 = r2.zai
            java.util.Set r0 = r0.zab
            java.lang.String r1 = " mUnconsumedApiCalls.size()="
            java.io.PrintWriter r1 = r5.append(r1)
            int r0 = r0.size()
            r1.println(r0)
            com.google.android.gms.common.api.internal.zaca r0 = r2.zal
            if (r0 == 0) goto L45
            r0.zas(r3, r4, r5, r6)
        L45:
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@androidx.annotation.NonNull T r5) {
            r4 = this;
            com.google.android.gms.common.api.Api r0 = r5.getApi()
            java.util.Map r1 = r4.zac
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r5.getClientKey()
            boolean r1 = r1.containsKey(r2)
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.zad()
            goto L17
        L15:
            java.lang.String r0 = "the API"
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "GoogleApiClient is not configured to use "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " required for this call."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.lock()
            com.google.android.gms.common.api.internal.zaca r0 = r4.zal     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L41
            java.util.Queue r0 = r4.zaa     // Catch: java.lang.Throwable -> L3f
            r0.add(r5)     // Catch: java.lang.Throwable -> L3f
            goto L45
        L3f:
            r5 = move-exception
            goto L4b
        L41:
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r0.zae(r5)     // Catch: java.lang.Throwable -> L3f
        L45:
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.unlock()
            return r5
        L4b:
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.unlock()
            throw r5
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(@androidx.annotation.NonNull T r5) {
            r4 = this;
            java.util.Map r0 = r4.zac
            com.google.android.gms.common.api.Api r1 = r5.getApi()
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r5.getClientKey()
            boolean r0 = r0.containsKey(r2)
            if (r1 == 0) goto L15
            java.lang.String r1 = r1.zad()
            goto L17
        L15:
            java.lang.String r1 = "the API"
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "GoogleApiClient is not configured to use "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " required for this call."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.lock()
            com.google.android.gms.common.api.internal.zaca r0 = r4.zal     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L69
            boolean r1 = r4.zap     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5f
            java.util.Queue r0 = r4.zaa     // Catch: java.lang.Throwable -> L5d
            r0.add(r5)     // Catch: java.lang.Throwable -> L5d
        L42:
            java.util.Queue r0 = r4.zaa     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L63
            java.util.Queue r0 = r4.zaa     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r0     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.common.api.internal.zadc r1 = r4.zai     // Catch: java.lang.Throwable -> L5d
            r1.zaa(r0)     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR     // Catch: java.lang.Throwable -> L5d
            r0.setFailedResult(r1)     // Catch: java.lang.Throwable -> L5d
            goto L42
        L5d:
            r5 = move-exception
            goto L71
        L5f:
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r5 = r0.zaf(r5)     // Catch: java.lang.Throwable -> L5d
        L63:
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.unlock()
            return r5
        L69:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "GoogleApiClient is not connected yet."
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            throw r5     // Catch: java.lang.Throwable -> L5d
        L71:
            java.util.concurrent.locks.Lock r0 = r4.zaj
            r0.unlock()
            throw r5
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @androidx.annotation.NonNull
    public final <C extends com.google.android.gms.common.api.Api.Client> C getClient(@androidx.annotation.NonNull com.google.android.gms.common.api.Api.AnyClientKey<C> r2) {
            r1 = this;
            java.util.Map r0 = r1.zac
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            java.lang.String r0 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @androidx.annotation.NonNull
    public final com.google.android.gms.common.ConnectionResult getConnectionResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.lock()
            boolean r0 = r2.isConnected()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            boolean r0 = r2.zap     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L10
            goto L1a
        L10:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "Cannot invoke getConnectionResult unless GoogleApiClient is connected"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L18
            throw r3     // Catch: java.lang.Throwable -> L18
        L18:
            r3 = move-exception
            goto L75
        L1a:
            java.util.Map r0 = r2.zac     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.Api$AnyClientKey r1 = r3.zab()     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L5a
            com.google.android.gms.common.api.internal.zaca r0 = r2.zal     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.api.internal.zaca r0 = (com.google.android.gms.common.api.internal.zaca) r0     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.ConnectionResult r0 = r0.zad(r3)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L54
            boolean r0 = r2.zap     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L3b
            com.google.android.gms.common.ConnectionResult r3 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L18
            goto L4e
        L3b:
            r2.zaf()     // Catch: java.lang.Throwable -> L18
            r3.zad()     // Catch: java.lang.Throwable -> L18
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L18
            r0 = 8
            r1 = 0
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L18
        L4e:
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.unlock()
            return r3
        L54:
            java.util.concurrent.locks.Lock r3 = r2.zaj
            r3.unlock()
            return r0
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.zad()     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            r1.append(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = " was never registered with GoogleApiClient"
            r1.append(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L18
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L75:
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.unlock()
            throw r3
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.zan
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
            r1 = this;
            android.os.Looper r0 = r1.zao
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r2) {
            r1 = this;
            java.util.Map r0 = r1.zac
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r2.zab()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@androidx.annotation.NonNull com.google.android.gms.common.api.Api<?> r3) {
            r2 = this;
            boolean r0 = r2.isConnected()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.Map r0 = r2.zac
            com.google.android.gms.common.api.Api$AnyClientKey r3 = r3.zab()
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            if (r3 == 0) goto L1e
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            return r1
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
            r1 = this;
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            if (r0 == 0) goto Lc
            boolean r0 = r0.zaw()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
            r1 = this;
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            if (r0 == 0) goto Lc
            boolean r0 = r0.zax()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            boolean r2 = r0.zaj(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            boolean r2 = r0.zak(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            if (r0 == 0) goto Lc
            boolean r2 = r0.zay(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
            r1 = this;
            com.google.android.gms.common.api.internal.zaca r0 = r1.zal
            if (r0 == 0) goto L7
            r0.zau()
        L7:
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
            r0 = this;
            r0.disconnect()
            r0.connect()
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zaf(r2)
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zag(r2)
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(@androidx.annotation.NonNull L r4) {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.lock()
            com.google.android.gms.common.api.internal.ListenerHolders r0 = r3.zau     // Catch: java.lang.Throwable -> L15
            android.os.Looper r1 = r3.zao     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "NO_TYPE"
            com.google.android.gms.common.api.internal.ListenerHolder r4 = r0.zaa(r4, r1, r2)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.unlock()
            return r4
        L15:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.zaj
            r0.unlock()
            throw r4
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.LifecycleActivity r0 = new com.google.android.gms.common.api.internal.LifecycleActivity
            r0.<init>(r2)
            int r2 = r1.zam
            if (r2 < 0) goto L13
            com.google.android.gms.common.api.internal.zak r2 = com.google.android.gms.common.api.internal.zak.zaa(r0)
            int r0 = r1.zam
            r2.zae(r0)
            return
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Called stopAutoManage but automatic lifecycle management is not enabled."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zah(r2)
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zai(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    public final void zaa(com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = r3.zat
            android.content.Context r1 = r3.zan
            int r2 = r4.getErrorCode()
            boolean r0 = r0.isPlayServicesPossiblyUpdating(r1, r2)
            if (r0 != 0) goto L11
            r3.zak()
        L11:
            boolean r0 = r3.zap
            if (r0 != 0) goto L1f
            com.google.android.gms.common.internal.zak r0 = r3.zak
            r0.zac(r4)
            com.google.android.gms.common.internal.zak r4 = r3.zak
            r4.zaa()
        L1f:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    public final void zab(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
        L0:
            java.util.Queue r0 = r1.zaa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            java.util.Queue r0 = r1.zaa
            java.lang.Object r0 = r0.remove()
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r0
            r1.execute(r0)
            goto L0
        L14:
            com.google.android.gms.common.internal.zak r0 = r1.zak
            r0.zad(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    public final void zac(int r6, boolean r7) {
            r5 = this;
            r0 = 2
            r1 = 1
            if (r6 != r1) goto L46
            if (r7 != 0) goto La
            boolean r6 = r5.zap
            if (r6 == 0) goto Lc
        La:
            r6 = 1
            goto L46
        Lc:
            r5.zap = r1
            com.google.android.gms.common.api.internal.zabx r6 = r5.zab
            if (r6 != 0) goto L2f
            boolean r6 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r6 != 0) goto L2f
            com.google.android.gms.common.GoogleApiAvailability r6 = r5.zat     // Catch: java.lang.SecurityException -> L2f
            android.content.Context r7 = r5.zan     // Catch: java.lang.SecurityException -> L2f
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.SecurityException -> L2f
            android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)     // Catch: java.lang.SecurityException -> L2f
            com.google.android.gms.common.api.internal.zabd r2 = new com.google.android.gms.common.api.internal.zabd     // Catch: java.lang.SecurityException -> L2f
            r2.<init>(r5)     // Catch: java.lang.SecurityException -> L2f
            com.google.android.gms.common.api.internal.zabx r6 = r6.zac(r7, r2)     // Catch: java.lang.SecurityException -> L2f
            r5.zab = r6     // Catch: java.lang.SecurityException -> L2f
        L2f:
            com.google.android.gms.common.api.internal.zabc r6 = r5.zas
            android.os.Message r7 = r6.obtainMessage(r1)
            long r2 = r5.zaq
            r6.sendMessageDelayed(r7, r2)
            com.google.android.gms.common.api.internal.zabc r6 = r5.zas
            android.os.Message r7 = r6.obtainMessage(r0)
            long r2 = r5.zar
            r6.sendMessageDelayed(r7, r2)
            goto La
        L46:
            com.google.android.gms.common.api.internal.zadc r7 = r5.zai
            java.util.Set r7 = r7.zab
            r1 = 0
            com.google.android.gms.common.api.internal.BasePendingResult[] r2 = new com.google.android.gms.common.api.internal.BasePendingResult[r1]
            java.lang.Object[] r7 = r7.toArray(r2)
            com.google.android.gms.common.api.internal.BasePendingResult[] r7 = (com.google.android.gms.common.api.internal.BasePendingResult[]) r7
            int r2 = r7.length
        L54:
            if (r1 >= r2) goto L60
            r3 = r7[r1]
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.internal.zadc.zaa
            r3.forceFailureUnlessReady(r4)
            int r1 = r1 + 1
            goto L54
        L60:
            com.google.android.gms.common.internal.zak r7 = r5.zak
            r7.zae(r6)
            com.google.android.gms.common.internal.zak r7 = r5.zak
            r7.zaa()
            if (r6 != r0) goto L6f
            r5.zan()
        L6f:
            return
    }

    final java.lang.String zaf() {
            r4 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.String r2 = ""
            r3 = 0
            r4.dump(r2, r3, r1, r3)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    final boolean zak() {
            r2 = this;
            boolean r0 = r2.zap
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2.zap = r1
            com.google.android.gms.common.api.internal.zabc r0 = r2.zas
            r1 = 2
            r0.removeMessages(r1)
            com.google.android.gms.common.api.internal.zabc r0 = r2.zas
            r1 = 1
            r0.removeMessages(r1)
            com.google.android.gms.common.api.internal.zabx r0 = r2.zab
            if (r0 == 0) goto L1e
            r0.zab()
            r0 = 0
            r2.zab = r0
        L1e:
            return r1
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(com.google.android.gms.common.api.internal.zada r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.lock()
            java.util.Set r0 = r1.zah     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            r1.zah = r0     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L1e
        L13:
            java.util.Set r0 = r1.zah     // Catch: java.lang.Throwable -> L11
            r0.add(r2)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.locks.Lock r2 = r1.zaj
            r2.unlock()
            return
        L1e:
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(com.google.android.gms.common.api.internal.zada r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.lock()
            java.util.Set r0 = r1.zah     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            goto L3e
        Lf:
            r2 = move-exception
            goto L4b
        L11:
            boolean r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L1d
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            goto L3e
        L1d:
            java.util.concurrent.locks.Lock r2 = r1.zaj     // Catch: java.lang.Throwable -> Lf
            r2.lock()     // Catch: java.lang.Throwable -> Lf
            java.util.Set r2 = r1.zah     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L2c
            java.util.concurrent.locks.Lock r2 = r1.zaj     // Catch: java.lang.Throwable -> Lf
            r2.unlock()     // Catch: java.lang.Throwable -> Lf
            goto L37
        L2c:
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.locks.Lock r0 = r1.zaj     // Catch: java.lang.Throwable -> Lf
            r0.unlock()     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L3e
        L37:
            com.google.android.gms.common.api.internal.zaca r2 = r1.zal     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L3e
            r2.zat()     // Catch: java.lang.Throwable -> Lf
        L3e:
            java.util.concurrent.locks.Lock r2 = r1.zaj
            r2.unlock()
            return
        L44:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.zaj     // Catch: java.lang.Throwable -> Lf
            r0.unlock()     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> Lf
        L4b:
            java.util.concurrent.locks.Lock r0 = r1.zaj
            r0.unlock()
            throw r2
    }
}
