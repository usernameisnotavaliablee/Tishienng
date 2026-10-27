package com.bxkj.base.v2.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final /* synthetic */ class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object a(com.bxkj.base.v2.http.b r0, java.lang.String r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto L15
            r3 = r3 & 1
            if (r3 == 0) goto L10
            com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r1.a()
            java.lang.String r1 = r1.R()
        L10:
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: getAppSocketServer"
            r0.<init>(r1)
            throw r0
    }
}
