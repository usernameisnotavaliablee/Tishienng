package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zabt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabu zab;

    zabt(com.google.android.gms.common.api.internal.zabu r1, com.google.android.gms.common.ConnectionResult r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.common.api.internal.zabu r0 = r4.zab
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r0.zaa
            java.util.Map r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zar(r1)
            com.google.android.gms.common.api.internal.ApiKey r0 = com.google.android.gms.common.api.internal.zabu.zab(r0)
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L15
            return
        L15:
            com.google.android.gms.common.ConnectionResult r1 = r4.zaa
            boolean r1 = r1.isSuccess()
            r2 = 0
            if (r1 == 0) goto L5e
            com.google.android.gms.common.api.internal.zabu r1 = r4.zab
            r3 = 1
            com.google.android.gms.common.api.internal.zabu.zac(r1, r3)
            com.google.android.gms.common.api.internal.zabu r1 = r4.zab
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabu.zaa(r1)
            boolean r1 = r1.requiresSignIn()
            if (r1 == 0) goto L36
            com.google.android.gms.common.api.internal.zabu r0 = r4.zab
            com.google.android.gms.common.api.internal.zabu.zad(r0)
            return
        L36:
            com.google.android.gms.common.api.internal.zabu r1 = r4.zab     // Catch: java.lang.SecurityException -> L48
            com.google.android.gms.common.api.Api$Client r3 = com.google.android.gms.common.api.internal.zabu.zaa(r1)     // Catch: java.lang.SecurityException -> L48
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabu.zaa(r1)     // Catch: java.lang.SecurityException -> L48
            java.util.Set r1 = r1.getScopesForConnectionlessNonSignIn()     // Catch: java.lang.SecurityException -> L48
            r3.getRemoteService(r2, r1)     // Catch: java.lang.SecurityException -> L48
            return
        L48:
            com.google.android.gms.common.api.internal.zabu r1 = r4.zab
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabu.zaa(r1)
            java.lang.String r3 = "Failed to get service from broker."
            r1.disconnect(r3)
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r3 = 10
            r1.<init>(r3)
            r0.zar(r1, r2)
            return
        L5e:
            com.google.android.gms.common.ConnectionResult r1 = r4.zaa
            r0.zar(r1, r2)
            return
    }
}
