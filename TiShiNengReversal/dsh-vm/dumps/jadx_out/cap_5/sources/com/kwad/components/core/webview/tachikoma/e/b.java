package com.kwad.components.core.webview.tachikoma.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private final java.util.Set<java.lang.Integer> ahN;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> ahO;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.core.webview.tachikoma.e.b ahP = null;

        static {
                com.kwad.components.core.webview.tachikoma.e.b r0 = new com.kwad.components.core.webview.tachikoma.e.b
                r0.<init>()
                com.kwad.components.core.webview.tachikoma.e.b.a.ahP = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.webview.tachikoma.e.b vN() {
                com.kwad.components.core.webview.tachikoma.e.b r0 = com.kwad.components.core.webview.tachikoma.e.b.a.ahP
                return r0
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.ahN = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.ahO = r0
            return
    }

    private void a(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            java.util.Set<java.lang.Integer> r2 = r0.ahN
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.remove(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r2 = r0.ahO
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L50
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r2 = r0.ahO
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r3)
            if (r2 != 0) goto L1e
            goto L50
        L1e:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r2 = r0.ahO
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r3)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L50
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L33
            goto L50
        L33:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r3 = r0.ahO
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.remove(r1)
            java.util.Iterator r1 = r2.iterator()
        L40:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            com.kwad.components.core.webview.tachikoma.f.f r2 = (com.kwad.components.core.webview.tachikoma.f.f) r2
            r2.vw()
            goto L40
        L50:
            return
    }

    private void bo(int r3) {
            r2 = this;
            java.util.Set<java.lang.Integer> r0 = r2.ahN
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.remove(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r0 = r2.ahO
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L50
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r0 = r2.ahO
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L1e
            goto L50
        L1e:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r0 = r2.ahO
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L50
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L33
            goto L50
        L33:
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.webview.tachikoma.f.f r1 = (com.kwad.components.core.webview.tachikoma.f.f) r1
            r1.vx()
            goto L37
        L47:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r0 = r2.ahO
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.remove(r3)
        L50:
            return
    }

    public static com.kwad.components.core.webview.tachikoma.e.b vM() {
            com.kwad.components.core.webview.tachikoma.e.b r0 = com.kwad.components.core.webview.tachikoma.e.b.a.vN()
            return r0
    }

    public final void a(int r3, com.kwad.components.core.webview.tachikoma.f.f r4) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r0 = r2.ahO
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L12
            r0.add(r4)
            return
        L12:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r0.add(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Set<com.kwad.components.core.webview.tachikoma.f.f>> r4 = r2.ahO
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.put(r3, r0)
            return
    }

    public final void b(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.a(r1, r2, r3)
            return
    }

    public final boolean bn(int r3) {
            r2 = this;
            java.util.Set<java.lang.Integer> r0 = r2.ahN
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Le
            r3 = 0
            return r3
        Le:
            java.util.Set<java.lang.Integer> r0 = r2.ahN
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            r3 = 1
            return r3
    }

    public final void bp(int r1) {
            r0 = this;
            r0.bo(r1)
            return
    }
}
