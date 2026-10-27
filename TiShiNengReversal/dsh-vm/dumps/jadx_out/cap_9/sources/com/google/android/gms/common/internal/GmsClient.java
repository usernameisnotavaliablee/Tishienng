package com.google.android.gms.common.internal;

import android.os.IInterface;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class GmsClient<T extends android.os.IInterface> extends com.google.android.gms.common.internal.BaseGmsClient<T> implements com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.internal.zaj {

    @androidx.annotation.Nullable
    private static volatile java.util.concurrent.Executor zaa;
    private final com.google.android.gms.common.internal.ClientSettings zab;
    private final java.util.Set zac;

    @androidx.annotation.Nullable
    private final android.accounts.Account zad;

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    protected GmsClient(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull android.os.Handler r10, int r11, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r12) {
            r8 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r9)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.google.android.gms.common.internal.ClientSettings r9 = (com.google.android.gms.common.internal.ClientSettings) r9
            r0.zab = r9
            android.accounts.Account r9 = r12.getAccount()
            r0.zad = r9
            java.util.Set r9 = r12.getAllRequestedScopes()
            java.util.Set r9 = r8.zaa(r9)
            r0.zac = r9
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected GmsClient(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r13) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r7 = 0
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    protected GmsClient(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.os.Looper r2, int r3, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r4, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected GmsClient(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r13, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks r14, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener r15) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.ConnectionCallbacks r7 = (com.google.android.gms.common.api.internal.ConnectionCallbacks) r7
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)
            r8 = r14
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r8 = (com.google.android.gms.common.api.internal.OnConnectionFailedListener) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @androidx.annotation.VisibleForTesting
    protected GmsClient(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, @androidx.annotation.NonNull com.google.android.gms.common.internal.GmsClientSupervisor r12, @androidx.annotation.NonNull com.google.android.gms.common.GoogleApiAvailability r13, int r14, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r15, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.ConnectionCallbacks r16, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.OnConnectionFailedListener r17) {
            r9 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            if (r0 != 0) goto L9
            r6 = r2
            goto Lf
        L9:
            com.google.android.gms.common.internal.zah r3 = new com.google.android.gms.common.internal.zah
            r3.<init>(r0)
            r6 = r3
        Lf:
            if (r1 != 0) goto L13
        L11:
            r7 = r2
            goto L19
        L13:
            com.google.android.gms.common.internal.zai r2 = new com.google.android.gms.common.internal.zai
            r2.<init>(r1)
            goto L11
        L19:
            java.lang.String r8 = r15.zac()
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.zab = r15
            android.accounts.Account r2 = r15.getAccount()
            r9.zad = r2
            java.util.Set r1 = r15.getAllRequestedScopes()
            java.util.Set r1 = r9.zaa(r1)
            r9.zac = r1
            return
    }

    private final java.util.Set zaa(@androidx.annotation.NonNull java.util.Set r4) {
            r3 = this;
            java.util.Set r0 = r3.validateScopes(r4)
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L1b
            goto L8
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expanding scopes is not permitted, use implied scopes instead"
            r4.<init>(r0)
            throw r4
        L23:
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.Nullable
    public final android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.zad
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.util.concurrent.Executor getBindServiceExecutor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected final com.google.android.gms.common.internal.ClientSettings getClientSettings() {
            r1 = this;
            com.google.android.gms.common.internal.ClientSettings r0 = r1.zab
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected final java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
            r1 = this;
            java.util.Set r0 = r1.zac
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
            r1 = this;
            boolean r0 = r1.requiresSignIn()
            if (r0 == 0) goto L9
            java.util.Set r0 = r1.zac
            return r0
        L9:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.util.Set<com.google.android.gms.common.api.Scope> validateScopes(@androidx.annotation.NonNull java.util.Set<com.google.android.gms.common.api.Scope> r1) {
            r0 = this;
            return r1
    }
}
