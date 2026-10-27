package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k {
    private static java.util.Map<java.lang.String, java.lang.Integer> abh;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.kwad.components.core.video.k.abh = r0
            return
    }

    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(android.content.Context r0, int r1, java.lang.String r2) {
            if (r1 >= 0) goto L17
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r0 = r0.cf(r2)
            if (r0 == 0) goto L22
            boolean r1 = r0.exists()
            if (r1 == 0) goto L22
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
        L17:
            if (r1 <= 0) goto L22
            com.kwad.sdk.core.videocache.f r0 = com.kwad.sdk.core.videocache.c.a.bR(r0)
            java.lang.String r0 = r0.eJ(r2)
            return r0
        L22:
            return r2
    }

    public static boolean a(@androidx.annotation.NonNull java.lang.String r6, java.lang.String r7, com.kwad.sdk.core.network.a.a.C0145a r8) {
            java.lang.String r0 = com.kwad.sdk.utils.al.md5(r7)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "start cache video key:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = "--url:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "VideoCacheHelper"
            com.kwad.sdk.core.d.c.i(r4, r3)
            com.kwad.sdk.core.diskcache.b.a r3 = com.kwad.sdk.core.diskcache.b.a.GP()
            boolean r6 = r3.b(r6, r7, r8)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "finish cache video key:"
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r0 = "--cache time:"
            r3.append(r0)
            long r7 = r7 - r1
            r3.append(r7)
            java.lang.String r7 = "--success:"
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = r3.toString()
            com.kwad.sdk.core.d.c.i(r4, r7)
            return r6
    }

    public static boolean aL(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1) {
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.K(r1)
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r1 = r0.cf(r1)
            if (r1 == 0) goto L1a
            boolean r1 = r1.exists()
            if (r1 == 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    private static int aM(java.lang.String r1) {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.kwad.components.core.video.k.abh
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r1 = r1.intValue()
            return r1
        Lf:
            int r1 = com.kwad.sdk.core.config.e.BQ()
            return r1
    }

    public static java.lang.String g(android.content.Context r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r2)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.K(r0)
            int r2 = com.kwad.sdk.core.response.b.e.eB(r2)
            java.lang.String r1 = a(r1, r2, r0)
            return r1
    }

    public static java.lang.String h(android.content.Context r1, java.lang.String r2) {
            int r0 = aM(r2)
            java.lang.String r1 = a(r1, r0, r2)
            return r1
    }

    public static void m(java.lang.String r1, int r2) {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.kwad.components.core.video.k.abh
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            return
    }
}
