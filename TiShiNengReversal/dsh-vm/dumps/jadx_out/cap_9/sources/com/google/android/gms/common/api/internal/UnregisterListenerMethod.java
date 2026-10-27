package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zaa;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected UnregisterListenerMethod(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r1.zaa
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract void unregisterListener(@androidx.annotation.NonNull A r1, @androidx.annotation.NonNull com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r2) throws android.os.RemoteException;
}
