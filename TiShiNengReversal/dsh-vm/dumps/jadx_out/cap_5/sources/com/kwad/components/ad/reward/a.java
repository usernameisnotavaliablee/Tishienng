package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private final java.util.Set<com.kwad.components.ad.reward.e.j> rb;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.reward.a$a, reason: collision with other inner class name */
    static class C0035a {
        private static final com.kwad.components.ad.reward.a rf = null;

        static {
                com.kwad.components.ad.reward.a r0 = new com.kwad.components.ad.reward.a
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.ad.reward.a.C0035a.rf = r0
                return
        }

        public C0035a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.ad.reward.a gj() {
                com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.C0035a.rf
                return r0
        }
    }

    private a() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.rb = r0
            return
    }

    /* synthetic */ a(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.a r0, com.kwad.components.core.playable.PlayableSource r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.a r0, com.kwad.components.core.playable.PlayableSource r1, com.kwad.components.ad.reward.e.n r2) {
            r0.b(r1, r2)
            return
    }

    private void b(com.kwad.components.core.playable.PlayableSource r3, @androidx.annotation.Nullable com.kwad.components.ad.reward.e.n r4) {
            r2 = this;
            java.util.Set<com.kwad.components.ad.reward.e.j> r0 = r2.rb
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto L1f
        L9:
            java.util.Set<com.kwad.components.ad.reward.e.j> r0 = r2.rb
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.reward.e.j r1 = (com.kwad.components.ad.reward.e.j) r1
            r1.a(r3, r4)
            goto Lf
        L1f:
            return
    }

    private void c(com.kwad.components.core.playable.PlayableSource r2) {
            r1 = this;
            java.util.Set<com.kwad.components.ad.reward.e.j> r2 = r1.rb
            int r2 = r2.size()
            if (r2 != 0) goto L9
            goto L1f
        L9:
            java.util.Set<com.kwad.components.ad.reward.e.j> r2 = r1.rb
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            com.kwad.components.ad.reward.e.j r0 = (com.kwad.components.ad.reward.e.j) r0
            r0.dl()
            goto Lf
        L1f:
            return
    }

    public static com.kwad.components.ad.reward.a gg() {
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.C0035a.gj()
            return r0
    }

    private void gi() {
            r2 = this;
            java.util.Set<com.kwad.components.ad.reward.e.j> r0 = r2.rb
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto L1f
        L9:
            java.util.Set<com.kwad.components.ad.reward.e.j> r0 = r2.rb
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.reward.e.j r1 = (com.kwad.components.ad.reward.e.j) r1
            r1.dk()
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

    public final void a(com.kwad.components.ad.reward.e.j r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Set<com.kwad.components.ad.reward.e.j> r0 = r1.rb
            r0.add(r2)
        L7:
            return
    }

    public final void a(com.kwad.components.core.playable.PlayableSource r2) {
            r1 = this;
            r0 = 0
            r1.c(r2, r0)
            return
    }

    public final void b(com.kwad.components.ad.reward.e.j r2) {
            r1 = this;
            java.util.Set<com.kwad.components.ad.reward.e.j> r0 = r1.rb
            r0.remove(r2)
            return
    }

    public final void b(com.kwad.components.core.playable.PlayableSource r2) {
            r1 = this;
            boolean r0 = isMainThread()
            if (r0 == 0) goto La
            r1.c(r2)
            return
        La:
            com.kwad.components.ad.reward.a$3 r0 = new com.kwad.components.ad.reward.a$3
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final void c(com.kwad.components.core.playable.PlayableSource r2, @androidx.annotation.Nullable com.kwad.components.ad.reward.e.n r3) {
            r1 = this;
            boolean r0 = isMainThread()
            if (r0 == 0) goto La
            r1.b(r2, r3)
            return
        La:
            com.kwad.components.ad.reward.a$1 r0 = new com.kwad.components.ad.reward.a$1
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final void gh() {
            r1 = this;
            boolean r0 = isMainThread()
            if (r0 == 0) goto La
            r1.gi()
            return
        La:
            com.kwad.components.ad.reward.a$2 r0 = new com.kwad.components.ad.reward.a$2
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }
}
