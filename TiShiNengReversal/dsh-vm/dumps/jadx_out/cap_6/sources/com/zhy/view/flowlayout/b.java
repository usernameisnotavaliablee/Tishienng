package com.zhy.view.flowlayout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class b<T> {
    private java.util.List<T> a;
    private com.zhy.view.flowlayout.b.a b;
    private java.util.HashSet<java.lang.Integer> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface a {
        void a();
    }

    public b(java.util.List<T> r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.c = r0
            r1.a = r2
            return
    }

    public b(T[] r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public int a() {
            r1 = this;
            java.util.List<T> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public T b(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    java.util.HashSet<java.lang.Integer> c() {
            r1 = this;
            java.util.HashSet<java.lang.Integer> r0 = r1.c
            return r0
    }

    public abstract android.view.View d(com.zhy.view.flowlayout.FlowLayout r1, int r2, T r3);

    public void e() {
            r1 = this;
            com.zhy.view.flowlayout.b$a r0 = r1.b
            r0.a()
            return
    }

    void f(com.zhy.view.flowlayout.b.a r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public boolean g(int r1, T r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void h(java.util.Set<java.lang.Integer> r2) {
            r1 = this;
            java.util.HashSet<java.lang.Integer> r0 = r1.c
            r0.clear()
            if (r2 == 0) goto Lc
            java.util.HashSet<java.lang.Integer> r0 = r1.c
            r0.addAll(r2)
        Lc:
            r1.e()
            return
    }

    public void i(int... r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L12
            java.util.HashSet<java.lang.Integer> r1 = r3.c
            r2 = r4[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            int r0 = r0 + 1
            goto L1
        L12:
            r3.e()
            return
    }
}
