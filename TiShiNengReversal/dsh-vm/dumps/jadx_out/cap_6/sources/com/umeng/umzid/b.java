package com.umeng.umzid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b implements javax.net.ssl.HostnameVerifier {
    public final /* synthetic */ java.lang.String a;

    public b(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String r1, javax.net.ssl.SSLSession r2) {
            r0 = this;
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L18
            java.lang.String r2 = r0.a
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 != 0) goto L16
            java.lang.String r2 = "pre-aaid.umeng.com"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L18
        L16:
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }
}
