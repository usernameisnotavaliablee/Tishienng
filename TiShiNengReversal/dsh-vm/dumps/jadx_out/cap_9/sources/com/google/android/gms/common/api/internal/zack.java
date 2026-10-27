package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zack extends com.google.android.gms.common.api.internal.RegisterListenerMethod {
    final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaa;

    zack(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r1, com.google.android.gms.common.api.internal.ListenerHolder r2, com.google.android.gms.common.Feature[] r3, boolean r4, int r5) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final void registerListener(com.google.android.gms.common.api.Api.AnyClient r2, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = r1.zaa
            com.google.android.gms.common.api.internal.RemoteCall r0 = com.google.android.gms.common.api.internal.RegistrationMethods.Builder.zaa(r0)
            r0.accept(r2, r3)
            return
    }
}
