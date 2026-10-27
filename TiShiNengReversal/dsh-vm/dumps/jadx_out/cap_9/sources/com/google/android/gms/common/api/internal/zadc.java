package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zadc {
    public static final com.google.android.gms.common.api.Status zaa = null;

    @androidx.annotation.VisibleForTesting
    final java.util.Set zab;
    private final com.google.android.gms.common.api.internal.zadb zac;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 8
            java.lang.String r2 = "The connection to Google Play services was lost"
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.zadc.zaa = r0
            return
    }

    public zadc() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r1.zab = r0
            com.google.android.gms.common.api.internal.zadb r0 = new com.google.android.gms.common.api.internal.zadb
            r0.<init>(r1)
            r1.zac = r0
            return
    }

    final void zaa(com.google.android.gms.common.api.internal.BasePendingResult r2) {
            r1 = this;
            java.util.Set r0 = r1.zab
            r0.add(r2)
            com.google.android.gms.common.api.internal.zadb r0 = r1.zac
            r2.zan(r0)
            return
    }

    public final void zab() {
            r5 = this;
            java.util.Set r0 = r5.zab
            r1 = 0
            com.google.android.gms.common.api.internal.BasePendingResult[] r2 = new com.google.android.gms.common.api.internal.BasePendingResult[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.gms.common.api.internal.BasePendingResult[] r0 = (com.google.android.gms.common.api.internal.BasePendingResult[]) r0
            int r2 = r0.length
        Lc:
            if (r1 >= r2) goto L22
            r3 = r0[r1]
            r4 = 0
            r3.zan(r4)
            boolean r4 = r3.zam()
            if (r4 == 0) goto L1f
            java.util.Set r4 = r5.zab
            r4.remove(r3)
        L1f:
            int r1 = r1 + 1
            goto Lc
        L22:
            return
    }
}
