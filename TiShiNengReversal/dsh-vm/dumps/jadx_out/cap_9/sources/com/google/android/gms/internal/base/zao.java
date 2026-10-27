package com.google.android.gms.internal.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zao extends androidx.core.content.ContextCompat {
    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static android.content.Intent zaa(android.content.Context r2, @androidx.annotation.Nullable android.content.BroadcastReceiver r3, android.content.IntentFilter r4) {
            boolean r0 = com.google.android.gms.internal.base.zan.zaa()
            if (r0 == 0) goto L15
            r0 = 1
            boolean r1 = com.google.android.gms.internal.base.zan.zaa()
            if (r0 == r1) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = 2
        L10:
            android.content.Intent r2 = cn.jiguang.commons.L.j1.a(r2, r3, r4, r0)
            return r2
        L15:
            android.content.Intent r2 = r2.registerReceiver(r3, r4)
            return r2
    }
}
