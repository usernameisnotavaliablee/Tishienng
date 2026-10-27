package com.kwad.framework.filedownloader.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.framework.filedownloader.message.a$a, reason: collision with other inner class name */
    public static class C0117a extends com.kwad.framework.filedownloader.message.MessageSnapshot implements com.kwad.framework.filedownloader.message.a {
        private final com.kwad.framework.filedownloader.message.MessageSnapshot aoE;

        public C0117a(com.kwad.framework.filedownloader.message.MessageSnapshot r5) {
                r4 = this;
                int r0 = r5.getId()
                r4.<init>(r0)
                byte r0 = r5.wJ()
                r1 = -3
                if (r0 != r1) goto L11
                r4.aoE = r5
                return
            L11:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                int r1 = r5.getId()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                byte r5 = r5.wJ()
                java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r5
                java.lang.String r5 = "can't create the block complete message for id[%d], status[%d]"
                java.lang.String r5 = com.kwad.framework.filedownloader.f.f.c(r5, r2)
                r0.<init>(r5)
                throw r0
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte wJ() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // com.kwad.framework.filedownloader.message.a
        public final com.kwad.framework.filedownloader.message.MessageSnapshot yL() {
                r1 = this;
                com.kwad.framework.filedownloader.message.MessageSnapshot r0 = r1.aoE
                return r0
        }
    }

    com.kwad.framework.filedownloader.message.MessageSnapshot yL();
}
