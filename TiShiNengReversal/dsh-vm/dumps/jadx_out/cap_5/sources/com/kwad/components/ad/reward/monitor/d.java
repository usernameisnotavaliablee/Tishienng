package com.kwad.components.ad.reward.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, boolean r4, com.kwad.sdk.core.response.model.AdVideoPreCacheConfig r5) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.setLoadDataTime(r0)
            r3.setLoadFromCache(r4)
            int r4 = r5.getAdVideoPreCacheSize()
            long r4 = (long) r4
            r0 = 1024(0x400, double:5.06E-321)
            long r4 = r4 * r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L21
            r0 = 3
            r3.setDownloadType(r0)
            r3.setDownloadSize(r4)
            return
        L21:
            if (r2 >= 0) goto L28
            r4 = 2
            r3.setDownloadType(r4)
            return
        L28:
            r4 = 1
            r3.setDownloadType(r4)
            r3.setDownloadSize(r0)
            return
    }
}
