package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class p extends com.kwad.framework.filedownloader.services.a<com.kwad.framework.filedownloader.p.a, com.kwad.framework.filedownloader.c.b> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class a extends com.kwad.framework.filedownloader.c.a.AbstractBinderC0113a {
        protected a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.framework.filedownloader.c.a
        public final void q(com.kwad.framework.filedownloader.message.MessageSnapshot r2) {
                r1 = this;
                com.kwad.framework.filedownloader.message.e r0 = com.kwad.framework.filedownloader.message.e.yT()
                r0.s(r2)
                return
        }
    }

    p(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static com.kwad.framework.filedownloader.c.b a(android.os.IBinder r0) {
            com.kwad.framework.filedownloader.c.b r0 = com.kwad.framework.filedownloader.c.b.a.a(r0)
            return r0
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.framework.filedownloader.c.b r0, com.kwad.framework.filedownloader.p.a r1) {
            r0.a(r1)
            return
    }

    private static com.kwad.framework.filedownloader.p.a xE() {
            com.kwad.framework.filedownloader.p$a r0 = new com.kwad.framework.filedownloader.p$a
            r0.<init>()
            return r0
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* bridge */ /* synthetic */ void a(com.kwad.framework.filedownloader.c.b r1, com.kwad.framework.filedownloader.p.a r2) {
            r0 = this;
            com.kwad.framework.filedownloader.c.b r1 = (com.kwad.framework.filedownloader.c.b) r1
            com.kwad.framework.filedownloader.p$a r2 = (com.kwad.framework.filedownloader.p.a) r2
            a2(r1, r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(java.lang.String r12, java.lang.String r13, boolean r14, int r15, int r16, int r17, boolean r18, com.kwad.framework.filedownloader.d.b r19, boolean r20) {
            r11 = this;
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto Lb
            boolean r12 = com.kwad.framework.filedownloader.f.a.h(r12, r13, r14)
            return r12
        Lb:
            android.os.IInterface r0 = r11.ze()     // Catch: android.os.RemoteException -> L25
            r1 = r0
            com.kwad.framework.filedownloader.c.b r1 = (com.kwad.framework.filedownloader.c.b) r1     // Catch: android.os.RemoteException -> L25
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: android.os.RemoteException -> L25
            r12 = 1
            return r12
        L25:
            r12 = 0
            return r12
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* synthetic */ com.kwad.framework.filedownloader.c.b b(android.os.IBinder r1) {
            r0 = this;
            com.kwad.framework.filedownloader.c.b r1 = a(r1)
            return r1
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean bw(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 != 0) goto Lb
            boolean r2 = com.kwad.framework.filedownloader.f.a.bw(r2)
            return r2
        Lb:
            android.os.IInterface r0 = r1.ze()     // Catch: android.os.RemoteException -> L16
            com.kwad.framework.filedownloader.c.b r0 = (com.kwad.framework.filedownloader.c.b) r0     // Catch: android.os.RemoteException -> L16
            boolean r2 = r0.bw(r2)     // Catch: android.os.RemoteException -> L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte bx(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 != 0) goto Lb
            byte r2 = com.kwad.framework.filedownloader.f.a.bx(r2)
            return r2
        Lb:
            android.os.IInterface r0 = r1.ze()     // Catch: android.os.RemoteException -> L16
            com.kwad.framework.filedownloader.c.b r0 = (com.kwad.framework.filedownloader.c.b) r0     // Catch: android.os.RemoteException -> L16
            byte r2 = r0.bx(r2)     // Catch: android.os.RemoteException -> L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean by(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 != 0) goto Lb
            boolean r2 = com.kwad.framework.filedownloader.f.a.by(r2)
            return r2
        Lb:
            android.os.IInterface r0 = r1.ze()     // Catch: android.os.RemoteException -> L16
            com.kwad.framework.filedownloader.c.b r0 = (com.kwad.framework.filedownloader.c.b) r0     // Catch: android.os.RemoteException -> L16
            boolean r2 = r0.by(r2)     // Catch: android.os.RemoteException -> L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* synthetic */ com.kwad.framework.filedownloader.p.a xF() {
            r1 = this;
            com.kwad.framework.filedownloader.p$a r0 = xE()
            return r0
    }
}
