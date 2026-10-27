package com.kwad.components.ad.feed.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.util.Pair<java.lang.Integer, java.lang.String> m(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r9) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r9)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r7 = 2
            if (r0 == 0) goto L1b
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.String r1 = "empty videoUrl"
            r9.<init>(r0, r1)
            return r9
        L1b:
            int r0 = com.kwad.sdk.core.config.e.BQ()
            r3 = 0
            r8 = 1
            java.lang.String r1 = ""
            if (r0 >= 0) goto L52
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r0 = r0.cf(r2)
            boolean r5 = com.kwad.sdk.utils.w.O(r0)
            if (r5 == 0) goto L35
            goto L48
        L35:
            com.kwad.sdk.core.network.a.a$a r1 = new com.kwad.sdk.core.network.a.a$a
            r1.<init>()
            com.kwad.sdk.core.diskcache.b.a r5 = com.kwad.sdk.core.diskcache.b.a.GP()
            boolean r2 = r5.a(r2, r1)
            if (r2 == 0) goto L45
            r7 = 1
        L45:
            java.lang.String r1 = r1.msg
            r8 = r7
        L48:
            if (r0 == 0) goto L4e
            long r3 = r0.length()
        L4e:
            r9.setDownloadSize(r3)
            goto L7f
        L52:
            if (r0 <= 0) goto L7c
            com.kwad.sdk.core.network.a.a$a r5 = new com.kwad.sdk.core.network.a.a$a
            r5.<init>()
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.videocache.f r1 = com.kwad.sdk.core.videocache.c.a.bR(r1)
            boolean r3 = r1.eL(r2)
            if (r3 != 0) goto L73
            int r3 = r0 * 1024
            long r3 = (long) r3
            r6 = 0
            boolean r1 = r1.a(r2, r3, r5, r6)
            if (r1 == 0) goto L72
            r7 = 1
        L72:
            r8 = r7
        L73:
            java.lang.String r1 = r5.msg
            int r0 = r0 * 1024
            long r2 = (long) r0
            r9.setDownloadSize(r2)
            goto L7f
        L7c:
            r9.setDownloadSize(r3)
        L7f:
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r9.<init>(r0, r1)
            return r9
    }
}
