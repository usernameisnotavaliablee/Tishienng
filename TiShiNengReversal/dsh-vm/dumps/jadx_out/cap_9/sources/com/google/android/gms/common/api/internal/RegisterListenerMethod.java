package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class RegisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;

    @androidx.annotation.Nullable
    private final com.google.android.gms.common.Feature[] zab;
    private final boolean zac;
    private final int zad;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected RegisterListenerMethod(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder<L> r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1, r1)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected RegisterListenerMethod(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder<L> r2, @androidx.annotation.NonNull com.google.android.gms.common.Feature[] r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected RegisterListenerMethod(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder<L> r1, @androidx.annotation.Nullable com.google.android.gms.common.Feature[] r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void clearListener() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder r0 = r1.zaa
            r0.clear()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder r0 = r1.zaa
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = r1.zab
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract void registerListener(@androidx.annotation.NonNull A r1, @androidx.annotation.NonNull com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2) throws android.os.RemoteException;

    public final int zaa() {
            r1 = this;
            int r0 = r1.zad
            return r0
    }

    public final boolean zab() {
            r1 = this;
            boolean r0 = r1.zac
            return r0
    }
}
