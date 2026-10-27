package com.google.android.gms.auth.api.signin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zac implements java.util.Comparator {
    zac() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.google.android.gms.common.api.Scope r1 = (com.google.android.gms.common.api.Scope) r1
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            java.lang.String r1 = r1.getScopeUri()
            java.lang.String r2 = r2.getScopeUri()
            int r1 = r1.compareTo(r2)
            return r1
    }
}
