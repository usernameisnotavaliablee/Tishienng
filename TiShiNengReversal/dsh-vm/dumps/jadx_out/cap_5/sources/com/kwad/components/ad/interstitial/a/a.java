package com.kwad.components.ad.interstitial.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean s(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r9) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r9)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L19
            com.kwad.components.ad.interstitial.report.b r0 = com.kwad.components.ad.interstitial.report.b.eQ()
            java.lang.String r2 = "empty videoUrl"
            r0.b(r9, r2)
            return r1
        L19:
            com.kwad.components.ad.interstitial.report.b r0 = com.kwad.components.ad.interstitial.report.b.eQ()
            r0.x(r9)
            int r0 = com.kwad.sdk.core.config.e.BQ()
            r3 = 0
            r7 = 2
            r8 = 1
            java.lang.String r5 = ""
            if (r0 >= 0) goto L58
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r0 = r0.cf(r2)
            boolean r1 = com.kwad.sdk.utils.w.O(r0)
            if (r1 == 0) goto L3c
            r2 = 1
            goto L4b
        L3c:
            com.kwad.sdk.core.network.a.a$a r1 = new com.kwad.sdk.core.network.a.a$a
            r1.<init>()
            com.kwad.sdk.core.diskcache.b.a r5 = com.kwad.sdk.core.diskcache.b.a.GP()
            boolean r2 = r5.a(r2, r1)
            java.lang.String r5 = r1.msg
        L4b:
            if (r0 == 0) goto L51
            long r3 = r0.length()
        L51:
            r9.setDownloadSize(r3)
            r9.setDownloadType(r7)
            goto Lac
        L58:
            if (r0 <= 0) goto La5
            com.kwad.sdk.core.network.a.a$a r5 = new com.kwad.sdk.core.network.a.a$a
            r5.<init>()
            int r3 = com.kwad.sdk.core.config.e.Ge()
            if (r3 != r8) goto L6e
            android.content.Context r3 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.videocache.f r1 = com.kwad.sdk.core.videocache.c.a.b(r3, r8, r1)
            goto L85
        L6e:
            int r1 = com.kwad.sdk.core.config.e.Ge()
            if (r1 != r7) goto L7d
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.videocache.f r1 = com.kwad.sdk.core.videocache.c.a.b(r1, r8, r8)
            goto L85
        L7d:
            android.content.Context r1 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.videocache.f r1 = com.kwad.sdk.core.videocache.c.a.bR(r1)
        L85:
            boolean r3 = r1.eL(r2)
            if (r3 != 0) goto L95
            int r3 = r0 * 1024
            long r3 = (long) r3
            r6 = 0
            boolean r1 = r1.a(r2, r3, r5, r6)
            r2 = r1
            goto L96
        L95:
            r2 = 1
        L96:
            java.lang.String r5 = r5.msg
            long r0 = (long) r0
            r3 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r3
            r9.setDownloadSize(r0)
            r0 = 3
            r9.setDownloadType(r0)
            goto Lac
        La5:
            r9.setDownloadSize(r3)
            r9.setDownloadType(r8)
            r2 = 1
        Lac:
            if (r2 != 0) goto Lbf
            r9.setDownloadStatus(r7)
            com.kwad.components.ad.interstitial.report.b r0 = com.kwad.components.ad.interstitial.report.b.eQ()
            r0.b(r9, r5)
            com.kwad.components.ad.interstitial.report.realtime.a.eW()
            com.kwad.components.ad.interstitial.report.realtime.a.b(r5, r9)
            return r2
        Lbf:
            r9.setDownloadStatus(r8)
            return r2
    }
}
