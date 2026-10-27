package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zak extends com.google.android.gms.common.api.internal.zap {
    private final android.util.SparseArray zad;

    private zak(com.google.android.gms.common.api.internal.LifecycleFragment r2) {
            r1 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1.<init>(r2, r0)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.zad = r2
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = r1.mLifecycleFragment
            java.lang.String r0 = "AutoManageHelper"
            r2.addCallback(r0, r1)
            return
    }

    public static com.google.android.gms.common.api.internal.zak zaa(com.google.android.gms.common.api.internal.LifecycleActivity r2) {
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(r2)
            java.lang.String r0 = "AutoManageHelper"
            java.lang.Class<com.google.android.gms.common.api.internal.zak> r1 = com.google.android.gms.common.api.internal.zak.class
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r2.getCallbackOrNull(r0, r1)
            com.google.android.gms.common.api.internal.zak r0 = (com.google.android.gms.common.api.internal.zak) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            com.google.android.gms.common.api.internal.zak r0 = new com.google.android.gms.common.api.internal.zak
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.Nullable
    private final com.google.android.gms.common.api.internal.zaj zai(int r2) {
            r1 = this;
            android.util.SparseArray r0 = r1.zad
            int r0 = r0.size()
            if (r0 > r2) goto La
            r2 = 0
            return r2
        La:
            android.util.SparseArray r0 = r1.zad
            int r2 = r0.keyAt(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.internal.zaj r2 = (com.google.android.gms.common.api.internal.zaj) r2
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            r0 = 0
        L1:
            android.util.SparseArray r1 = r4.zad
            int r1 = r1.size()
            if (r0 >= r1) goto L35
            com.google.android.gms.common.api.internal.zaj r1 = r4.zai(r0)
            if (r1 == 0) goto L32
            java.io.PrintWriter r2 = r7.append(r5)
            java.lang.String r3 = "GoogleApiClient #"
            java.io.PrintWriter r2 = r2.append(r3)
            int r3 = r1.zaa
            r2.print(r3)
            java.lang.String r2 = ":"
            r7.println(r2)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.zab
            java.lang.String r3 = "  "
            java.lang.String r2 = r2.concat(r3)
            r1.dump(r2, r6, r7, r8)
        L32:
            int r0 = r0 + 1
            goto L1
        L35:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
            r2 = this;
            super.onStart()
            android.util.SparseArray r0 = r2.zad
            java.lang.String.valueOf(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L27
            r0 = 0
        L11:
            android.util.SparseArray r1 = r2.zad
            int r1 = r1.size()
            if (r0 >= r1) goto L27
            com.google.android.gms.common.api.internal.zaj r1 = r2.zai(r0)
            if (r1 == 0) goto L24
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.zab
            r1.connect()
        L24:
            int r0 = r0 + 1
            goto L11
        L27:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
            r2 = this;
            super.onStop()
            r0 = 0
        L4:
            android.util.SparseArray r1 = r2.zad
            int r1 = r1.size()
            if (r0 >= r1) goto L1a
            com.google.android.gms.common.api.internal.zaj r1 = r2.zai(r0)
            if (r1 == 0) goto L17
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.zab
            r1.disconnect()
        L17:
            int r0 = r0 + 1
            goto L4
        L1a:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(com.google.android.gms.common.ConnectionResult r2, int r3) {
            r1 = this;
            if (r3 >= 0) goto L8
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            return
        L8:
            android.util.SparseArray r0 = r1.zad
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.common.api.internal.zaj r0 = (com.google.android.gms.common.api.internal.zaj) r0
            if (r0 == 0) goto L1c
            r1.zae(r3)
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r3 = r0.zac
            if (r3 == 0) goto L1c
            r3.onConnectionFailed(r2)
        L1c:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
            r2 = this;
            r0 = 0
        L1:
            android.util.SparseArray r1 = r2.zad
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            com.google.android.gms.common.api.internal.zaj r1 = r2.zai(r0)
            if (r1 == 0) goto L14
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.zab
            r1.connect()
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    public final void zad(int r4, com.google.android.gms.common.api.GoogleApiClient r5, @androidx.annotation.Nullable com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r6) {
            r3 = this;
            java.lang.String r0 = "GoogleApiClient instance cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            android.util.SparseArray r0 = r3.zad
            int r0 = r0.indexOfKey(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Already managing a GoogleApiClient with id "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            if (r0 >= 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.util.concurrent.atomic.AtomicReference r0 = r3.zab
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zam r0 = (com.google.android.gms.common.api.internal.zam) r0
            java.lang.String.valueOf(r0)
            com.google.android.gms.common.api.internal.zaj r1 = new com.google.android.gms.common.api.internal.zaj
            r1.<init>(r3, r4, r5, r6)
            r5.registerConnectionFailedListener(r1)
            android.util.SparseArray r6 = r3.zad
            r6.put(r4, r1)
            boolean r4 = r3.zaa
            if (r4 == 0) goto L4e
            if (r0 != 0) goto L4e
            java.lang.String r4 = r5.toString()
            java.lang.String r6 = "connecting "
            r6.concat(r4)
            r5.connect()
        L4e:
            return
    }

    public final void zae(int r3) {
            r2 = this;
            android.util.SparseArray r0 = r2.zad
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.common.api.internal.zaj r0 = (com.google.android.gms.common.api.internal.zaj) r0
            android.util.SparseArray r1 = r2.zad
            r1.remove(r3)
            if (r0 == 0) goto L19
            com.google.android.gms.common.api.GoogleApiClient r3 = r0.zab
            r3.unregisterConnectionFailedListener(r0)
            com.google.android.gms.common.api.GoogleApiClient r3 = r0.zab
            r3.disconnect()
        L19:
            return
    }
}
