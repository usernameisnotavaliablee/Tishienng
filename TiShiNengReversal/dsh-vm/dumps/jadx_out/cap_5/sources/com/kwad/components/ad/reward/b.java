package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private final java.util.Set<com.kwad.components.ad.reward.e.l> rg;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.ad.reward.b ri = null;

        static {
                com.kwad.components.ad.reward.b r0 = new com.kwad.components.ad.reward.b
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.ad.reward.b.a.ri = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.reward.b gm() {
                com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.a.ri
                return r0
        }
    }

    private b() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.rg = r0
            return
    }

    /* synthetic */ b(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.ad.reward.b gk() {
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.a.gm()
            return r0
    }

    private void gl() {
            r2 = this;
            java.util.Set<com.kwad.components.ad.reward.e.l> r0 = r2.rg
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto L1f
        L9:
            java.util.Set<com.kwad.components.ad.reward.e.l> r0 = r2.rg
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.reward.e.l r1 = (com.kwad.components.ad.reward.e.l) r1
            r1.onRewardVerify()
            goto Lf
        L1f:
            return
    }

    private static boolean isMainThread() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final void a(com.kwad.components.ad.reward.e.l r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Set<com.kwad.components.ad.reward.e.l> r0 = r1.rg
            r0.add(r2)
        L7:
            return
    }

    public final void b(com.kwad.components.ad.reward.e.l r2) {
            r1 = this;
            java.util.Set<com.kwad.components.ad.reward.e.l> r0 = r1.rg
            r0.remove(r2)
            return
    }

    public final void notifyRewardVerify() {
            r1 = this;
            boolean r0 = isMainThread()
            if (r0 == 0) goto La
            r1.gl()
            return
        La:
            com.kwad.components.ad.reward.b$1 r0 = new com.kwad.components.ad.reward.b$1
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }
}
