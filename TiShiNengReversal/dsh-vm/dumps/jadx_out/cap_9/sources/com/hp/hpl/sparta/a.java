package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class a implements com.hp.hpl.sparta.f, com.hp.hpl.sparta.m {
    private final com.hp.hpl.sparta.n c;
    private com.hp.hpl.sparta.g d;
    private final com.hp.hpl.sparta.e e;
    private com.hp.hpl.sparta.o f;

    public a() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public a(com.hp.hpl.sparta.n r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            com.hp.hpl.sparta.e r1 = new com.hp.hpl.sparta.e
            r1.<init>()
            r2.e = r1
            r2.f = r0
            if (r3 != 0) goto L13
            com.hp.hpl.sparta.n r3 = com.hp.hpl.sparta.o.a
        L13:
            r2.c = r3
            return
    }

    @Override // com.hp.hpl.sparta.m
    public void a(com.hp.hpl.sparta.g r1) {
            r0 = this;
            com.hp.hpl.sparta.g r1 = r0.d
            com.hp.hpl.sparta.g r1 = r1.e()
            r0.d = r1
            return
    }

    @Override // com.hp.hpl.sparta.f
    public com.hp.hpl.sparta.e b() {
            r1 = this;
            com.hp.hpl.sparta.e r0 = r1.e
            return r0
    }

    @Override // com.hp.hpl.sparta.m
    public void c(com.hp.hpl.sparta.o r2) {
            r1 = this;
            r1.f = r2
            com.hp.hpl.sparta.e r0 = r1.e
            java.lang.String r2 = r2.toString()
            r0.D(r2)
            return
    }

    @Override // com.hp.hpl.sparta.m
    public void characters(char[] r4, int r5, int r6) {
            r3 = this;
            com.hp.hpl.sparta.g r0 = r3.d
            com.hp.hpl.sparta.i r1 = r0.G()
            boolean r1 = r1 instanceof com.hp.hpl.sparta.r
            if (r1 == 0) goto L14
            com.hp.hpl.sparta.i r0 = r0.G()
            com.hp.hpl.sparta.r r0 = (com.hp.hpl.sparta.r) r0
            r0.z(r4, r5, r6)
            return
        L14:
            com.hp.hpl.sparta.r r1 = new com.hp.hpl.sparta.r
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4, r5, r6)
            r1.<init>(r2)
            r0.y(r1)
            return
    }

    @Override // com.hp.hpl.sparta.m
    public com.hp.hpl.sparta.o d() {
            r1 = this;
            com.hp.hpl.sparta.o r0 = r1.f
            return r0
    }

    @Override // com.hp.hpl.sparta.m
    public void e(com.hp.hpl.sparta.g r2) {
            r1 = this;
            com.hp.hpl.sparta.g r0 = r1.d
            if (r0 != 0) goto La
            com.hp.hpl.sparta.e r0 = r1.e
            r0.C(r2)
            goto Ld
        La:
            r0.x(r2)
        Ld:
            r1.d = r2
            return
    }

    @Override // com.hp.hpl.sparta.m
    public void endDocument() {
            r0 = this;
            return
    }

    @Override // com.hp.hpl.sparta.o
    public int getLineNumber() {
            r1 = this;
            com.hp.hpl.sparta.o r0 = r1.f
            if (r0 == 0) goto L9
            int r0 = r0.getLineNumber()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.hp.hpl.sparta.o
    public java.lang.String getSystemId() {
            r1 = this;
            com.hp.hpl.sparta.o r0 = r1.f
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getSystemId()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.hp.hpl.sparta.m
    public void startDocument() {
            r0 = this;
            return
    }

    @Override // com.hp.hpl.sparta.o
    public java.lang.String toString() {
            r2 = this;
            com.hp.hpl.sparta.o r0 = r2.f
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BuildDoc: "
            r0.append(r1)
            com.hp.hpl.sparta.o r1 = r2.f
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1c:
            r0 = 0
            return r0
    }
}
