package org.hamcrest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class a implements org.hamcrest.g {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.hamcrest.g i(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.Iterator<? extends org.hamcrest.l> r5) {
            r1 = this;
            r1.h(r2)
            r2 = 0
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L1a
            if (r2 == 0) goto Lf
            r1.h(r3)
        Lf:
            java.lang.Object r2 = r5.next()
            org.hamcrest.l r2 = (org.hamcrest.l) r2
            r1.f(r2)
            r2 = 1
            goto L4
        L1a:
            r1.h(r4)
            return r1
    }

    private <T> org.hamcrest.g j(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.Iterator<T> r5) {
            r1 = this;
            org.hamcrest.internal.d r0 = new org.hamcrest.internal.d
            r0.<init>(r5)
            org.hamcrest.g r2 = r1.i(r2, r3, r4, r0)
            return r2
    }

    private java.lang.String k(java.lang.Object r3) {
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L5
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "@"
            r0.append(r1)
            int r3 = r3.hashCode()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private void l(char r2) {
            r1 = this;
            r0 = 9
            if (r2 == r0) goto L26
            r0 = 10
            if (r2 == r0) goto L20
            r0 = 13
            if (r2 == r0) goto L1a
            r0 = 34
            if (r2 == r0) goto L14
            r1.g(r2)
            return
        L14:
            java.lang.String r2 = "\\\""
            r1.h(r2)
            return
        L1a:
            java.lang.String r2 = "\\r"
            r1.h(r2)
            return
        L20:
            java.lang.String r2 = "\\n"
            r1.h(r2)
            return
        L26:
            java.lang.String r2 = "\\t"
            r1.h(r2)
            return
    }

    private void m(java.lang.String r4) {
            r3 = this;
            r0 = 34
            r3.g(r0)
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 >= r2) goto L16
            char r2 = r4.charAt(r1)
            r3.l(r2)
            int r1 = r1 + 1
            goto L6
        L16:
            r3.g(r0)
            return
    }

    @Override // org.hamcrest.g
    public org.hamcrest.g a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.Iterable<? extends org.hamcrest.l> r4) {
            r0 = this;
            java.util.Iterator r4 = r4.iterator()
            org.hamcrest.g r1 = r0.i(r1, r2, r3, r4)
            return r1
    }

    @Override // org.hamcrest.g
    public org.hamcrest.g b(java.lang.String r1) {
            r0 = this;
            r0.h(r1)
            return r0
    }

    @Override // org.hamcrest.g
    public org.hamcrest.g c(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L8
            java.lang.String r4 = "null"
            r3.h(r4)
            return r3
        L8:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r4 = (java.lang.String) r4
            r3.m(r4)
            return r3
        L12:
            boolean r0 = r4 instanceof java.lang.Character
            if (r0 == 0) goto L28
            r0 = 34
            r3.g(r0)
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
            r3.l(r4)
            r3.g(r0)
            return r3
        L28:
            boolean r0 = r4 instanceof java.lang.Short
            r1 = 60
            if (r0 == 0) goto L3e
            r3.g(r1)
            java.lang.String r4 = r3.k(r4)
            r3.h(r4)
            java.lang.String r4 = "s>"
            r3.h(r4)
            return r3
        L3e:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L52
            r3.g(r1)
            java.lang.String r4 = r3.k(r4)
            r3.h(r4)
            java.lang.String r4 = "L>"
            r3.h(r4)
            return r3
        L52:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L66
            r3.g(r1)
            java.lang.String r4 = r3.k(r4)
            r3.h(r4)
            java.lang.String r4 = "F>"
            r3.h(r4)
            return r3
        L66:
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L7f
            org.hamcrest.internal.a r0 = new org.hamcrest.internal.a
            r0.<init>(r4)
            java.lang.String r4 = "["
            java.lang.String r1 = ", "
            java.lang.String r2 = "]"
            r3.j(r4, r1, r2, r0)
            return r3
        L7f:
            r3.g(r1)
            java.lang.String r4 = r3.k(r4)
            r3.h(r4)
            r4 = 62
            r3.g(r4)
            return r3
    }

    @Override // org.hamcrest.g
    public <T> org.hamcrest.g d(java.lang.String r1, java.lang.String r2, java.lang.String r3, T... r4) {
            r0 = this;
            java.util.List r4 = java.util.Arrays.asList(r4)
            org.hamcrest.g r1 = r0.e(r1, r2, r3, r4)
            return r1
    }

    @Override // org.hamcrest.g
    public <T> org.hamcrest.g e(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.Iterable<T> r4) {
            r0 = this;
            java.util.Iterator r4 = r4.iterator()
            org.hamcrest.g r1 = r0.j(r1, r2, r3, r4)
            return r1
    }

    @Override // org.hamcrest.g
    public org.hamcrest.g f(org.hamcrest.l r1) {
            r0 = this;
            r1.describeTo(r0)
            return r0
    }

    protected abstract void g(char r1);

    protected void h(java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.length()
            if (r0 >= r1) goto L11
            char r1 = r3.charAt(r0)
            r2.g(r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }
}
