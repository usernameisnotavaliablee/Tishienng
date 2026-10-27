package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class j implements java.lang.Cloneable {
    public java.util.ArrayList<com.acse.ottn.j.a> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.acse.ottn.j r1);

        void b(com.acse.ottn.j r1);

        void c(com.acse.ottn.j r1);

        void d(com.acse.ottn.j r1);
    }

    public j() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public com.acse.ottn.j a() {
            r6 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L27
            com.acse.ottn.j r0 = (com.acse.ottn.j) r0     // Catch: java.lang.CloneNotSupportedException -> L27
            java.util.ArrayList<com.acse.ottn.j$a> r1 = r6.a     // Catch: java.lang.CloneNotSupportedException -> L27
            if (r1 == 0) goto L26
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.CloneNotSupportedException -> L27
            r2.<init>()     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.a = r2     // Catch: java.lang.CloneNotSupportedException -> L27
            int r2 = r1.size()     // Catch: java.lang.CloneNotSupportedException -> L27
            r3 = 0
        L16:
            if (r3 >= r2) goto L26
            java.util.ArrayList<com.acse.ottn.j$a> r4 = r0.a     // Catch: java.lang.CloneNotSupportedException -> L27
            java.lang.Object r5 = r1.get(r3)     // Catch: java.lang.CloneNotSupportedException -> L27
            com.acse.ottn.j$a r5 = (com.acse.ottn.j.a) r5     // Catch: java.lang.CloneNotSupportedException -> L27
            r4.add(r5)     // Catch: java.lang.CloneNotSupportedException -> L27
            int r3 = r3 + 1
            goto L16
        L26:
            return r0
        L27:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public abstract com.acse.ottn.j a(long r1);

    public abstract void a(android.view.animation.Interpolator r1);

    public void a(com.acse.ottn.j.a r2) {
            r1 = this;
            java.util.ArrayList<com.acse.ottn.j$a> r0 = r1.a
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
        Lb:
            java.util.ArrayList<com.acse.ottn.j$a> r0 = r1.a
            r0.add(r2)
            return
    }

    public void a(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public abstract void b(long r1);

    public void b(com.acse.ottn.j.a r2) {
            r1 = this;
            java.util.ArrayList<com.acse.ottn.j$a> r0 = r1.a
            if (r0 != 0) goto L5
            goto L13
        L5:
            r0.remove(r2)
            java.util.ArrayList<com.acse.ottn.j$a> r2 = r1.a
            int r2 = r2.size()
            if (r2 != 0) goto L13
            r2 = 0
            r1.a = r2
        L13:
            return
    }

    public abstract long c();

    public void cancel() {
            r0 = this;
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.acse.ottn.j r0 = r1.a()
            return r0
    }

    public java.util.ArrayList<com.acse.ottn.j.a> d() {
            r1 = this;
            java.util.ArrayList<com.acse.ottn.j$a> r0 = r1.a
            return r0
    }

    public abstract long e();

    public abstract boolean f();

    public boolean g() {
            r1 = this;
            boolean r0 = r1.f()
            return r0
    }

    public void h() {
            r1 = this;
            java.util.ArrayList<com.acse.ottn.j$a> r0 = r1.a
            if (r0 == 0) goto La
            r0.clear()
            r0 = 0
            r1.a = r0
        La:
            return
    }

    public void i() {
            r0 = this;
            return
    }

    public void j() {
            r0 = this;
            return
    }

    public void k() {
            r0 = this;
            return
    }
}
