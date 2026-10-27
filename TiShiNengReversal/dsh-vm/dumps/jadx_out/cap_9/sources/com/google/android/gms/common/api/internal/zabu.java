package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zabu implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks, com.google.android.gms.common.api.internal.zacs {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final com.google.android.gms.common.api.Api.Client zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.internal.IAccountAccessor zad;

    @androidx.annotation.Nullable
    private java.util.Set zae;
    private boolean zaf;

    public zabu(com.google.android.gms.common.api.internal.GoogleApiManager r1, com.google.android.gms.common.api.Api.Client r2, com.google.android.gms.common.api.internal.ApiKey r3) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r1 = 0
            r0.zad = r1
            r0.zae = r1
            r1 = 0
            r0.zaf = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client zaa(com.google.android.gms.common.api.internal.zabu r0) {
            com.google.android.gms.common.api.Api$Client r0 = r0.zab
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.ApiKey zab(com.google.android.gms.common.api.internal.zabu r0) {
            com.google.android.gms.common.api.internal.ApiKey r0 = r0.zac
            return r0
    }

    static /* bridge */ /* synthetic */ void zac(com.google.android.gms.common.api.internal.zabu r0, boolean r1) {
            r1 = 1
            r0.zaf = r1
            return
    }

    static /* bridge */ /* synthetic */ void zad(com.google.android.gms.common.api.internal.zabu r0) {
            r0.zah()
            return
    }

    @androidx.annotation.WorkerThread
    private final void zah() {
            r3 = this;
            boolean r0 = r3.zaf
            if (r0 == 0) goto Lf
            com.google.android.gms.common.internal.IAccountAccessor r0 = r3.zad
            if (r0 == 0) goto Lf
            com.google.android.gms.common.api.Api$Client r1 = r3.zab
            java.util.Set r2 = r3.zae
            r1.getRemoteService(r0, r2)
        Lf:
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.api.internal.zabt r1 = new com.google.android.gms.common.api.internal.zabt
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @androidx.annotation.WorkerThread
    public final void zae(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            java.util.Map r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zar(r0)
            com.google.android.gms.common.api.internal.ApiKey r1 = r2.zac
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 == 0) goto L13
            r0.zas(r3)
        L13:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @androidx.annotation.WorkerThread
    public final void zaf(@androidx.annotation.Nullable com.google.android.gms.common.internal.IAccountAccessor r1, @androidx.annotation.Nullable java.util.Set r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            if (r2 != 0) goto L5
            goto Ld
        L5:
            r0.zad = r1
            r0.zae = r2
            r0.zah()
            return
        Ld:
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r2 = 4
            r1.<init>(r2)
            r0.zae(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @androidx.annotation.WorkerThread
    public final void zag(int r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            java.util.Map r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zar(r0)
            com.google.android.gms.common.api.internal.ApiKey r1 = r2.zac
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 == 0) goto L24
            boolean r1 = com.google.android.gms.common.api.internal.zabq.zax(r0)
            if (r1 == 0) goto L21
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r1 = 17
            r3.<init>(r1)
            r0.zas(r3)
            return
        L21:
            r0.onConnectionSuspended(r3)
        L24:
            return
    }
}
