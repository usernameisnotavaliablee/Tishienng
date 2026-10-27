package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zak implements android.os.Handler.Callback {

    @androidx.annotation.VisibleForTesting
    final java.util.ArrayList zaa;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.internal.zaj zab;
    private final java.util.ArrayList zac;
    private final java.util.ArrayList zad;
    private volatile boolean zae;
    private final java.util.concurrent.atomic.AtomicInteger zaf;
    private boolean zag;
    private final android.os.Handler zah;
    private final java.lang.Object zai;

    public zak(android.os.Looper r3, com.google.android.gms.common.internal.zaj r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zac = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zaa = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zad = r0
            r0 = 0
            r2.zae = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r2.zaf = r1
            r2.zag = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zai = r0
            r2.zab = r4
            com.google.android.gms.internal.base.zau r4 = new com.google.android.gms.internal.base.zau
            r4.<init>(r3, r2)
            r2.zah = r4
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r4) {
            r3 = this;
            int r0 = r4.what
            r1 = 1
            if (r0 != r1) goto L2b
            java.lang.Object r4 = r4.obj
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r4 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r4
            java.lang.Object r0 = r3.zai
            monitor-enter(r0)
            boolean r2 = r3.zae     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            com.google.android.gms.common.internal.zaj r2 = r3.zab     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.isConnected()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.util.ArrayList r2 = r3.zac     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            r2 = 0
            r4.onConnected(r2)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r4 = move-exception
            goto L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r1
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
        L2b:
            java.lang.Exception r4 = new java.lang.Exception
            r4.<init>()
            r4 = 0
            return r4
    }

    public final void zaa() {
            r1 = this;
            r0 = 0
            r1.zae = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zaf
            r0.incrementAndGet()
            return
    }

    public final void zab() {
            r1 = this;
            r0 = 1
            r1.zae = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    public final void zac(com.google.android.gms.common.ConnectionResult r6) {
            r5 = this;
            android.os.Handler r0 = r5.zah
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            android.os.Handler r0 = r5.zah
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r2 = r5.zad     // Catch: java.lang.Throwable -> L46
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.atomic.AtomicInteger r2 = r5.zaf     // Catch: java.lang.Throwable -> L46
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L46
        L21:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r3 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r3     // Catch: java.lang.Throwable -> L46
            boolean r4 = r5.zae     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L48
            java.util.concurrent.atomic.AtomicInteger r4 = r5.zaf     // Catch: java.lang.Throwable -> L46
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L46
            if (r4 == r2) goto L3a
            goto L48
        L3a:
            java.util.ArrayList r4 = r5.zad     // Catch: java.lang.Throwable -> L46
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L21
            r3.onConnectionFailed(r6)     // Catch: java.lang.Throwable -> L46
            goto L21
        L46:
            r6 = move-exception
            goto L4c
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r6
    }

    @androidx.annotation.VisibleForTesting
    public final void zad(@androidx.annotation.Nullable android.os.Bundle r6) {
            r5 = this;
            android.os.Handler r0 = r5.zah
            java.lang.String r1 = "onConnectionSuccess must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            java.lang.Object r0 = r5.zai
            monitor-enter(r0)
            boolean r1 = r5.zag     // Catch: java.lang.Throwable -> L5f
            r2 = 1
            r1 = r1 ^ r2
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L5f
            android.os.Handler r1 = r5.zah     // Catch: java.lang.Throwable -> L5f
            r1.removeMessages(r2)     // Catch: java.lang.Throwable -> L5f
            r5.zag = r2     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r1 = r5.zaa     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r2 = r5.zac     // Catch: java.lang.Throwable -> L5f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.atomic.AtomicInteger r2 = r5.zaf     // Catch: java.lang.Throwable -> L5f
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5f
        L32:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L61
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r3 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r3     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r5.zae     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L61
            com.google.android.gms.common.internal.zaj r4 = r5.zab     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r4.isConnected()     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L61
            java.util.concurrent.atomic.AtomicInteger r4 = r5.zaf     // Catch: java.lang.Throwable -> L5f
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L5f
            if (r4 == r2) goto L53
            goto L61
        L53:
            java.util.ArrayList r4 = r5.zaa     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L5f
            if (r4 != 0) goto L32
            r3.onConnected(r6)     // Catch: java.lang.Throwable -> L5f
            goto L32
        L5f:
            r6 = move-exception
            goto L6b
        L61:
            java.util.ArrayList r6 = r5.zaa     // Catch: java.lang.Throwable -> L5f
            r6.clear()     // Catch: java.lang.Throwable -> L5f
            r6 = 0
            r5.zag = r6     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r6
    }

    @androidx.annotation.VisibleForTesting
    public final void zae(int r6) {
            r5 = this;
            android.os.Handler r0 = r5.zah
            java.lang.String r1 = "onUnintentionalDisconnection must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            android.os.Handler r0 = r5.zah
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.zai
            monitor-enter(r0)
            r5.zag = r1     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r2 = r5.zac     // Catch: java.lang.Throwable -> L48
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.atomic.AtomicInteger r2 = r5.zaf     // Catch: java.lang.Throwable -> L48
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L48
        L23:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r3 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r3     // Catch: java.lang.Throwable -> L48
            boolean r4 = r5.zae     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L4a
            java.util.concurrent.atomic.AtomicInteger r4 = r5.zaf     // Catch: java.lang.Throwable -> L48
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L48
            if (r4 == r2) goto L3c
            goto L4a
        L3c:
            java.util.ArrayList r4 = r5.zac     // Catch: java.lang.Throwable -> L48
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L23
            r3.onConnectionSuspended(r6)     // Catch: java.lang.Throwable -> L48
            goto L23
        L48:
            r6 = move-exception
            goto L54
        L4a:
            java.util.ArrayList r6 = r5.zaa     // Catch: java.lang.Throwable -> L48
            r6.clear()     // Catch: java.lang.Throwable -> L48
            r6 = 0
            r5.zag = r6     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r6
    }

    public final void zaf(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.zac     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r3 = move-exception
            goto L2d
        L14:
            java.util.ArrayList r1 = r2.zac     // Catch: java.lang.Throwable -> L12
            r1.add(r3)     // Catch: java.lang.Throwable -> L12
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.internal.zaj r0 = r2.zab
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L2c
            android.os.Handler r0 = r2.zah
            r1 = 1
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
        L2c:
            return
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public final void zag(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.zad     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r3 = move-exception
            goto L1b
        L14:
            java.util.ArrayList r1 = r2.zad     // Catch: java.lang.Throwable -> L12
            r1.add(r3)     // Catch: java.lang.Throwable -> L12
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public final void zah(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.zac     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.remove(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L12
            goto L1d
        L12:
            r3 = move-exception
            goto L1f
        L14:
            boolean r1 = r2.zag     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L1d
            java.util.ArrayList r1 = r2.zaa     // Catch: java.lang.Throwable -> L12
            r1.add(r3)     // Catch: java.lang.Throwable -> L12
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public final void zai(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.zad     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.remove(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public final boolean zaj(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.zac     // Catch: java.lang.Throwable -> Le
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    public final boolean zak(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r0 = r2.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.zad     // Catch: java.lang.Throwable -> Le
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
