package com.kwad.framework.filedownloader.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    private volatile com.kwad.framework.filedownloader.message.g aoK;
    private volatile com.kwad.framework.filedownloader.message.e.b aoL;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private static final com.kwad.framework.filedownloader.message.e aoM = null;

        static {
                com.kwad.framework.filedownloader.message.e r0 = new com.kwad.framework.filedownloader.message.e
                r0.<init>()
                com.kwad.framework.filedownloader.message.e.a.aoM = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.framework.filedownloader.message.e yU() {
                com.kwad.framework.filedownloader.message.e r0 = com.kwad.framework.filedownloader.message.e.a.aoM
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void r(com.kwad.framework.filedownloader.message.MessageSnapshot r1);
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.framework.filedownloader.message.e yT() {
            com.kwad.framework.filedownloader.message.e r0 = com.kwad.framework.filedownloader.message.e.a.yU()
            return r0
    }

    public final void a(com.kwad.framework.filedownloader.message.e.b r3) {
            r2 = this;
            r2.aoL = r3
            if (r3 != 0) goto L8
            r3 = 0
            r2.aoK = r3
            return
        L8:
            com.kwad.framework.filedownloader.message.g r0 = new com.kwad.framework.filedownloader.message.g
            r1 = 5
            r0.<init>(r1, r3)
            r2.aoK = r0
            return
    }

    public final void s(com.kwad.framework.filedownloader.message.MessageSnapshot r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.kwad.framework.filedownloader.message.b
            if (r0 == 0) goto Le
            com.kwad.framework.filedownloader.message.e$b r0 = r1.aoL
            if (r0 == 0) goto L17
            com.kwad.framework.filedownloader.message.e$b r0 = r1.aoL
            r0.r(r2)
            return
        Le:
            com.kwad.framework.filedownloader.message.g r0 = r1.aoK
            if (r0 == 0) goto L17
            com.kwad.framework.filedownloader.message.g r0 = r1.aoK
            r0.u(r2)
        L17:
            return
    }
}
