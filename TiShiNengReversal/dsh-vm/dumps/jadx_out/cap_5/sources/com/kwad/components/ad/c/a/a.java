package com.kwad.components.ad.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {


    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(com.kwad.components.ad.c.a.b r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.af()
            return
    }

    private static void a(com.kwad.components.ad.c.a.b r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.ag()
            return
    }

    @androidx.annotation.WorkerThread
    public static boolean a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r8, com.kwad.sdk.core.response.model.AdVideoPreCacheConfig r9, com.kwad.components.ad.c.a.b r10) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r8)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L15
            java.lang.String r8 = "字段为null"
            a(r10, r8)
            r8 = 0
            return r8
        L15:
            int r0 = r9.getAdVideoPreCacheSize()
            long r0 = (long) r0
            r3 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r3
            r3 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 <= 0) goto L57
            boolean r8 = r9.isContinueLoadingAll()
            if (r8 == 0) goto L2f
            r3 = -1
        L2d:
            r7 = 1
            goto L31
        L2f:
            r3 = r0
            goto L2d
        L31:
            com.kwad.sdk.core.network.a.a$a r5 = new com.kwad.sdk.core.network.a.a$a
            r5.<init>()
            android.content.Context r8 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.videocache.f r8 = com.kwad.sdk.core.videocache.c.a.bR(r8)
            boolean r6 = r8.eK(r2)
            if (r6 == 0) goto L49
            a(r10)
            r8 = 1
            goto L53
        L49:
            com.kwad.components.ad.c.a.a$1 r6 = new com.kwad.components.ad.c.a.a$1
            r6.<init>(r0, r10, r9)
            r1 = r8
            boolean r8 = r1.a(r2, r3, r5, r6)
        L53:
            java.lang.String r0 = r5.msg
            r5 = r8
            goto L8e
        L57:
            r7 = 1
            java.lang.String r0 = ""
            if (r6 >= 0) goto L8a
            com.kwad.sdk.core.diskcache.b.a r1 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r1 = r1.cf(r2)
            boolean r5 = com.kwad.sdk.utils.w.O(r1)
            if (r5 == 0) goto L6c
            r5 = 1
            goto L7b
        L6c:
            com.kwad.sdk.core.network.a.a$a r0 = new com.kwad.sdk.core.network.a.a$a
            r0.<init>()
            com.kwad.sdk.core.diskcache.b.a r5 = com.kwad.sdk.core.diskcache.b.a.GP()
            boolean r5 = r5.a(r2, r0)
            java.lang.String r0 = r0.msg
        L7b:
            if (r1 == 0) goto L81
            long r3 = r1.length()
        L81:
            r8.setDownloadSize(r3)
            if (r5 == 0) goto L8e
            a(r10)
            goto L8e
        L8a:
            a(r10)
            r5 = 1
        L8e:
            if (r5 == 0) goto L98
            int r8 = r9.getAdVideoPreCacheSize()
            com.kwad.components.core.video.k.m(r2, r8)
            return r5
        L98:
            a(r10, r0)
            return r5
    }

    static /* synthetic */ void b(com.kwad.components.ad.c.a.b r0) {
            a(r0)
            return
    }
}
