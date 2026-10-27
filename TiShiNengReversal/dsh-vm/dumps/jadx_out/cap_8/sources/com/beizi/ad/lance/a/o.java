package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o {
    public o() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r2) {
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r2, r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            int r2 = androidx.core.content.ContextCompat.checkSelfPermission(r2, r0)
            if (r2 == 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }
}
