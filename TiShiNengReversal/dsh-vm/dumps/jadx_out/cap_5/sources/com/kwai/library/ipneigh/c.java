package com.kwai.library.ipneigh;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static com.kwai.library.ipneigh.d A(android.content.Context r0, boolean r1) {
            r1 = 0
            com.kwai.library.ipneigh.d r0 = b(r0, r1, r1)
            return r0
    }

    private static com.kwai.library.ipneigh.d b(android.content.Context r3, boolean r4, boolean r5) {
            java.lang.String r5 = ""
            r0 = 0
            boolean r1 = com.kwai.library.ipneigh.b.isWifiConnected(r3)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.kwai.library.ipneigh.d r3 = new com.kwai.library.ipneigh.d     // Catch: java.lang.Throwable -> Lf
            r3.<init>(r5, r0, r5)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            goto L5d
        L11:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> Lf
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "wifi"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> Lf
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3     // Catch: java.lang.Throwable -> Lf
            android.net.DhcpInfo r3 = r3.getDhcpInfo()     // Catch: java.lang.Throwable -> Lf
            int r3 = r3.gateway     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = com.kwai.library.ipneigh.b.fl(r3)     // Catch: java.lang.Throwable -> Lf
            if (r4 != 0) goto L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "timeout 5 ip neigh show "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            r1.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = com.kwai.library.ipneigh.a.hR(r1)     // Catch: java.lang.Throwable -> Lf
            goto L41
        L40:
            r1 = r5
        L41:
            if (r4 != 0) goto L49
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L4d
        L49:
            java.lang.String r1 = com.kwai.library.ipneigh.KwaiIpNeigh.i(r3, r0)     // Catch: java.lang.Throwable -> Lf
        L4d:
            java.lang.String r3 = com.kwai.library.ipneigh.b.hT(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lf
            r4 = r4 ^ 1
            com.kwai.library.ipneigh.d r2 = new com.kwai.library.ipneigh.d     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> Lf
            return r2
        L5d:
            com.kwai.library.ipneigh.d r4 = new com.kwai.library.ipneigh.d
            java.lang.String r3 = r3.getMessage()
            r4.<init>(r5, r0, r3)
            return r4
    }

    public static com.kwai.library.ipneigh.d es(android.content.Context r1) {
            r0 = 0
            com.kwai.library.ipneigh.d r1 = A(r1, r0)
            return r1
    }
}
