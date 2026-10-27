package com.bumptech.glide.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f implements com.bumptech.glide.manager.d {
    private static final java.lang.String a = "ConnectivityMonitor";
    private static final java.lang.String b = "android.permission.ACCESS_NETWORK_STATE";

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.manager.d
    @androidx.annotation.NonNull
    public com.bumptech.glide.manager.c a(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull com.bumptech.glide.manager.c.a r5) {
            r3 = this;
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r4, r0)
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "ConnectivityMonitor"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)
            if (r0 == 0) goto L19
            com.bumptech.glide.manager.e r0 = new com.bumptech.glide.manager.e
            r0.<init>(r4, r5)
            return r0
        L19:
            com.bumptech.glide.manager.n r4 = new com.bumptech.glide.manager.n
            r4.<init>()
            return r4
    }
}
