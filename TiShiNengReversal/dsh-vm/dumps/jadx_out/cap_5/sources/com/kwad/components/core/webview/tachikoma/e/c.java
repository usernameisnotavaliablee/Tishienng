package com.kwad.components.core.webview.tachikoma.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private final java.util.Set<com.kwad.components.core.webview.tachikoma.f.g> ahQ;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.core.webview.tachikoma.e.c ahW = null;

        static {
                com.kwad.components.core.webview.tachikoma.e.c r0 = new com.kwad.components.core.webview.tachikoma.e.c
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.core.webview.tachikoma.e.c.a.ahW = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.webview.tachikoma.e.c vQ() {
                com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.a.ahW
                return r0
        }
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.ahQ = r0
            return
    }

    /* synthetic */ c(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.e.c r0, java.lang.String r1, long r2, long r4, long r6) {
            r0.b(r1, r2, r4, r6)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.webview.tachikoma.e.c r0, java.lang.String r1, java.lang.String r2) {
            r0.s(r1, r2)
            return
    }

    private void b(java.lang.String r11, long r12, long r14, long r16) {
            r10 = this;
            java.util.Set<com.kwad.components.core.webview.tachikoma.f.g> r0 = r10.ahQ
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto L2a
        L9:
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<com.kwad.components.core.webview.tachikoma.f.g> r1 = r10.ahQ
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.kwad.components.core.webview.tachikoma.f.g r2 = (com.kwad.components.core.webview.tachikoma.f.g) r2
            r3 = r11
            r4 = r12
            r6 = r14
            r8 = r16
            r2.a(r3, r4, r6, r8)
            goto L14
        L2a:
            return
    }

    private void s(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Set<com.kwad.components.core.webview.tachikoma.f.g> r2 = r1.ahQ
            int r2 = r2.size()
            if (r2 != 0) goto L9
            goto L24
        L9:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set<com.kwad.components.core.webview.tachikoma.f.g> r0 = r1.ahQ
            r2.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r2.next()
            com.kwad.components.core.webview.tachikoma.f.g r0 = (com.kwad.components.core.webview.tachikoma.f.g) r0
            r0.v(r3)
            goto L14
        L24:
            return
    }

    public static com.kwad.components.core.webview.tachikoma.e.c vO() {
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.a.vQ()
            return r0
    }

    public final void a(com.kwad.components.core.webview.tachikoma.f.g r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Set<com.kwad.components.core.webview.tachikoma.f.g> r0 = r1.ahQ
            r0.add(r2)
        L7:
            return
    }

    public final void b(com.kwad.components.core.webview.tachikoma.f.g r2) {
            r1 = this;
            java.util.Set<com.kwad.components.core.webview.tachikoma.f.g> r0 = r1.ahQ
            r0.remove(r2)
            return
    }

    public final void c(java.lang.String r10, long r11, long r13, long r15) {
            r9 = this;
            com.kwad.components.core.webview.tachikoma.e.c$2 r0 = new com.kwad.components.core.webview.tachikoma.e.c$2
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r5, r7)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final void t(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.e.c$1 r0 = new com.kwad.components.core.webview.tachikoma.e.c$1
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final void vP() {
            r1 = this;
            java.util.Set<com.kwad.components.core.webview.tachikoma.f.g> r0 = r1.ahQ
            r0.clear()
            return
    }
}
