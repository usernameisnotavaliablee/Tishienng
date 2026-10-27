package com.kwad.components.core.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private final java.util.List<com.kwad.components.core.request.b.a> WW;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void sl();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.request.b$b, reason: collision with other inner class name */
    static class C0090b {
        private static final com.kwad.components.core.request.b WX = null;

        static {
                com.kwad.components.core.request.b r0 = new com.kwad.components.core.request.b
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.core.request.b.C0090b.WX = r0
                return
        }

        public C0090b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.request.b sm() {
                com.kwad.components.core.request.b r0 = com.kwad.components.core.request.b.C0090b.WX
                return r0
        }
    }

    private b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.WW = r0
            return
    }

    /* synthetic */ b(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.core.request.b sj() {
            com.kwad.components.core.request.b r0 = com.kwad.components.core.request.b.C0090b.sm()
            return r0
    }

    public final void a(com.kwad.components.core.request.b.a r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.request.b$a> r0 = r1.WW
            r0.add(r2)
            return
    }

    public final void b(com.kwad.components.core.request.b.a r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.request.b$a> r0 = r1.WW
            r0.remove(r2)
            return
    }

    public final void sk() {
            r2 = this;
            java.util.List<com.kwad.components.core.request.b$a> r0 = r2.WW
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.request.b$a r1 = (com.kwad.components.core.request.b.a) r1
            if (r1 == 0) goto L6
            r1.sl()     // Catch: java.lang.Throwable -> L18
            goto L6
        L18:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            goto L6
        L1d:
            return
    }
}
