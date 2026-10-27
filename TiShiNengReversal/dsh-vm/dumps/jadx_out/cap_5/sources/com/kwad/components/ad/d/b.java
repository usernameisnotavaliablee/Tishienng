package com.kwad.components.ad.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {


    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(com.kwad.components.ad.d.a r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.af()
            return
    }

    private static void a(com.kwad.components.ad.d.a r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.ag()
            return
    }

    @androidx.annotation.WorkerThread
    public static boolean a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r9, boolean r10, com.kwad.sdk.core.response.model.AdVideoPreCacheConfig r11, com.kwad.components.ad.d.a r12) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r9)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L10
            r9 = 0
            return r9
        L10:
            int r0 = r11.getAdVideoPreCacheSize()
            long r0 = (long) r0
            r3 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r3
            r3 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 <= 0) goto L53
            boolean r3 = r11.isContinueLoadingAll()
            if (r3 == 0) goto L2a
            r3 = -1
        L28:
            r7 = 1
            goto L2c
        L2a:
            r3 = r0
            goto L28
        L2c:
            com.kwad.sdk.core.network.a.a$a r5 = new com.kwad.sdk.core.network.a.a$a
            r5.<init>()
            android.content.Context r6 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.videocache.f r6 = com.kwad.sdk.core.videocache.c.a.bR(r6)
            boolean r8 = r6.eK(r2)
            if (r8 == 0) goto L44
            a(r12)
            r0 = 1
            goto L4f
        L44:
            r7 = r0
            r1 = r6
            com.kwad.components.ad.d.b$1 r6 = new com.kwad.components.ad.d.b$1
            r6.<init>(r7, r12, r11)
            boolean r0 = r1.a(r2, r3, r5, r6)
        L4f:
            java.lang.String r1 = r5.msg
            r5 = r0
            goto L8a
        L53:
            r7 = 1
            java.lang.String r1 = ""
            if (r6 >= 0) goto L86
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r0 = r0.cf(r2)
            boolean r5 = com.kwad.sdk.utils.w.O(r0)
            if (r5 == 0) goto L68
            r5 = 1
            goto L77
        L68:
            com.kwad.sdk.core.network.a.a$a r1 = new com.kwad.sdk.core.network.a.a$a
            r1.<init>()
            com.kwad.sdk.core.diskcache.b.a r5 = com.kwad.sdk.core.diskcache.b.a.GP()
            boolean r5 = r5.a(r2, r1)
            java.lang.String r1 = r1.msg
        L77:
            if (r0 == 0) goto L7d
            long r3 = r0.length()
        L7d:
            r9.setDownloadSize(r3)
            if (r5 == 0) goto L8a
            a(r12)
            goto L8a
        L86:
            a(r12)
            r5 = 1
        L8a:
            if (r5 == 0) goto L94
            int r9 = r11.getAdVideoPreCacheSize()
            com.kwad.components.core.video.k.m(r2, r9)
            return r5
        L94:
            com.kwad.components.ad.reward.monitor.c.a(r10, r9, r1)
            com.kwad.components.ad.reward.monitor.b.a(r10, r9)
            a(r12, r1)
            return r5
    }

    static /* synthetic */ void b(com.kwad.components.ad.d.a r0) {
            a(r0)
            return
    }
}
