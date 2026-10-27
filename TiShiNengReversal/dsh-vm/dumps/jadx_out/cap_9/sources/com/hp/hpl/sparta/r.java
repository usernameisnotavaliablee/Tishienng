package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class r extends com.hp.hpl.sparta.i {
    private java.lang.StringBuffer g;

    public r(char r2) {
            r1 = this;
            r1.<init>()
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1.g = r0
            r0.append(r2)
            return
    }

    public r(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r2)
            r1.g = r0
            return
    }

    public java.lang.String A() {
            r1 = this;
            java.lang.StringBuffer r0 = r1.g
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void B(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r2)
            r1.g = r0
            r1.j()
            return
    }

    @Override // com.hp.hpl.sparta.i
    protected int a() {
            r1 = this;
            java.lang.StringBuffer r0 = r1.g
            java.lang.String r0 = r0.toString()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.hp.hpl.sparta.i
    public java.lang.Object clone() {
            r2 = this;
            com.hp.hpl.sparta.r r0 = new com.hp.hpl.sparta.r
            java.lang.StringBuffer r1 = r2.g
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.hp.hpl.sparta.r
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.hp.hpl.sparta.r r2 = (com.hp.hpl.sparta.r) r2
            java.lang.StringBuffer r0 = r1.g
            java.lang.String r0 = r0.toString()
            java.lang.StringBuffer r2 = r2.g
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.hp.hpl.sparta.i
    void p(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuffer r0 = r1.g
            java.lang.String r0 = r0.toString()
            r2.write(r0)
            return
    }

    @Override // com.hp.hpl.sparta.i
    void r(java.io.Writer r4) throws java.io.IOException {
            r3 = this;
            java.lang.StringBuffer r0 = r3.g
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            r2 = 50
            if (r1 >= r2) goto L12
            com.hp.hpl.sparta.i.g(r4, r0)
            return
        L12:
            java.lang.String r1 = "<![CDATA["
            r4.write(r1)
            r4.write(r0)
            java.lang.String r0 = "]]>"
            r4.write(r0)
            return
    }

    @Override // com.hp.hpl.sparta.i
    public com.hp.hpl.sparta.g s(java.lang.String r2) {
            r1 = this;
            java.lang.Error r2 = new java.lang.Error
            java.lang.String r0 = "Sorry, not implemented"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.hp.hpl.sparta.i
    public java.util.Enumeration t(java.lang.String r2) {
            r1 = this;
            java.lang.Error r2 = new java.lang.Error
            java.lang.String r0 = "Sorry, not implemented"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.hp.hpl.sparta.i
    public java.lang.String u(java.lang.String r2) {
            r1 = this;
            java.lang.Error r2 = new java.lang.Error
            java.lang.String r0 = "Sorry, not implemented"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.hp.hpl.sparta.i
    public java.util.Enumeration v(java.lang.String r2) {
            r1 = this;
            java.lang.Error r2 = new java.lang.Error
            java.lang.String r0 = "Sorry, not implemented"
            r2.<init>(r0)
            throw r2
    }

    public void x(char r2) {
            r1 = this;
            java.lang.StringBuffer r0 = r1.g
            r0.append(r2)
            r1.j()
            return
    }

    public void y(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuffer r0 = r1.g
            r0.append(r2)
            r1.j()
            return
    }

    public void z(char[] r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuffer r0 = r1.g
            r0.append(r2, r3, r4)
            r1.j()
            return
    }
}
