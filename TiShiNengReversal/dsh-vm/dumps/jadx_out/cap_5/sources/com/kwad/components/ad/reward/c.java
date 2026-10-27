package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private final java.util.Set<com.kwad.components.ad.reward.e.m> rj;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.ad.reward.c rm = null;

        static {
                com.kwad.components.ad.reward.c r0 = new com.kwad.components.ad.reward.c
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.ad.reward.c.a.rm = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.reward.c go() {
                com.kwad.components.ad.reward.c r0 = com.kwad.components.ad.reward.c.a.rm
                return r0
        }
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.rj = r0
            return
    }

    /* synthetic */ c(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.c r0, com.kwad.components.core.webview.tachikoma.c.r r1) {
            r0.b(r1)
            return
    }

    private void b(@androidx.annotation.Nullable com.kwad.components.core.webview.tachikoma.c.r r3) {
            r2 = this;
            java.util.Set<com.kwad.components.ad.reward.e.m> r0 = r2.rj
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto L1f
        L9:
            java.util.Set<com.kwad.components.ad.reward.e.m> r0 = r2.rj
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.reward.e.m r1 = (com.kwad.components.ad.reward.e.m) r1
            r1.a(r3)
            goto Lf
        L1f:
            return
    }

    public static com.kwad.components.ad.reward.c gn() {
            com.kwad.components.ad.reward.c r0 = com.kwad.components.ad.reward.c.a.go()
            return r0
    }

    public final void a(com.kwad.components.ad.reward.e.m r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Set<com.kwad.components.ad.reward.e.m> r0 = r1.rj
            r0.add(r2)
        L7:
            return
    }

    public final void b(com.kwad.components.ad.reward.e.m r2) {
            r1 = this;
            java.util.Set<com.kwad.components.ad.reward.e.m> r0 = r1.rj
            r0.remove(r2)
            return
    }

    public final void c(@androidx.annotation.Nullable com.kwad.components.core.webview.tachikoma.c.r r2) {
            r1 = this;
            com.kwad.components.ad.reward.c$1 r0 = new com.kwad.components.ad.reward.c$1
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }
}
