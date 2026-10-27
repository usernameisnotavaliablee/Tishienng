package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zal {
    private final android.util.SparseIntArray zaa;
    private com.google.android.gms.common.GoogleApiAvailabilityLight zab;

    public zal() {
            r1 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1.<init>(r0)
            return
    }

    public zal(@androidx.annotation.NonNull com.google.android.gms.common.GoogleApiAvailabilityLight r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.zaa = r0
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r1.zab = r2
            return
    }

    public final int zaa(android.content.Context r2, int r3) {
            r1 = this;
            android.util.SparseIntArray r2 = r1.zaa
            r0 = -1
            int r2 = r2.get(r3, r0)
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int zab(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull com.google.android.gms.common.api.Api.Client r7) {
            r5 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            boolean r0 = r7.requiresGooglePlayServices()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            int r7 = r7.getMinApkVersion()
            int r0 = r5.zaa(r6, r7)
            r2 = -1
            if (r0 == r2) goto L1a
            return r0
        L1a:
            r0 = 0
        L1b:
            android.util.SparseIntArray r3 = r5.zaa
            int r3 = r3.size()
            if (r0 >= r3) goto L37
            android.util.SparseIntArray r3 = r5.zaa
            int r3 = r3.keyAt(r0)
            if (r3 <= r7) goto L34
            android.util.SparseIntArray r4 = r5.zaa
            int r3 = r4.get(r3)
            if (r3 != 0) goto L34
            goto L38
        L34:
            int r0 = r0 + 1
            goto L1b
        L37:
            r1 = -1
        L38:
            if (r1 != r2) goto L40
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = r5.zab
            int r1 = r0.isGooglePlayServicesAvailable(r6, r7)
        L40:
            android.util.SparseIntArray r6 = r5.zaa
            r6.put(r7, r1)
            return r1
    }

    public final void zac() {
            r1 = this;
            android.util.SparseIntArray r0 = r1.zaa
            r0.clear()
            return
    }
}
