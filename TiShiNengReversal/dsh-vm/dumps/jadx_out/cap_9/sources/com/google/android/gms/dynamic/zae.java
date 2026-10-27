package com.google.android.gms.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zae implements android.view.View.OnClickListener {
    final /* synthetic */ android.content.Context zaa;
    final /* synthetic */ android.content.Intent zab;

    zae(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.content.Context r2 = r1.zaa     // Catch: android.content.ActivityNotFoundException -> L7
            android.content.Intent r0 = r1.zab     // Catch: android.content.ActivityNotFoundException -> L7
            r2.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L7
        L7:
            return
    }
}
