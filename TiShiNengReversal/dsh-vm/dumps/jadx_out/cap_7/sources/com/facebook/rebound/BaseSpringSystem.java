package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BaseSpringSystem {
    private final java.util.Map<java.lang.String, com.facebook.rebound.Spring> a;
    private final java.util.Set<com.facebook.rebound.Spring> b;
    private final com.facebook.rebound.SpringLooper c;
    private final java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringSystemListener> d;
    private boolean e;

    public BaseSpringSystem(com.facebook.rebound.SpringLooper r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.b = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.d = r0
            r0 = 1
            r1.e = r0
            if (r2 == 0) goto L23
            r1.c = r2
            r2.a(r1)
            return
        L23:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "springLooper is required"
            r2.<init>(r0)
            throw r2
    }

    void a(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.facebook.rebound.Spring> r0 = r3.a
            java.lang.Object r0 = r0.get(r4)
            com.facebook.rebound.Spring r0 = (com.facebook.rebound.Spring) r0
            if (r0 == 0) goto L1e
            java.util.Set<com.facebook.rebound.Spring> r4 = r3.b
            r4.add(r0)
            boolean r4 = r3.g()
            if (r4 == 0) goto L1d
            r4 = 0
            r3.e = r4
            com.facebook.rebound.SpringLooper r4 = r3.c
            r4.b()
        L1d:
            return
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "springId "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " does not reference a registered spring"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void b(com.facebook.rebound.SpringSystemListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringSystemListener> r0 = r1.d
            r0.add(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newListener is required"
            r2.<init>(r0)
            throw r2
    }

    void c(double r5) {
            r4 = this;
            java.util.Set<com.facebook.rebound.Spring> r0 = r4.b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            com.facebook.rebound.Spring r1 = (com.facebook.rebound.Spring) r1
            boolean r2 = r1.D()
            if (r2 == 0) goto L23
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r5 / r2
            r1.b(r2)
            goto L6
        L23:
            java.util.Set<com.facebook.rebound.Spring> r2 = r4.b
            r2.remove(r1)
            goto L6
        L29:
            return
    }

    public com.facebook.rebound.Spring d() {
            r1 = this;
            com.facebook.rebound.Spring r0 = new com.facebook.rebound.Spring
            r0.<init>(r1)
            r1.j(r0)
            return r0
    }

    void e(com.facebook.rebound.Spring r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.util.Set<com.facebook.rebound.Spring> r0 = r1.b
            r0.remove(r2)
            java.util.Map<java.lang.String, com.facebook.rebound.Spring> r0 = r1.a
            java.lang.String r2 = r2.i()
            r0.remove(r2)
            return
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "spring is required"
            r2.<init>(r0)
            throw r2
    }

    public java.util.List<com.facebook.rebound.Spring> f() {
            r2 = this;
            java.util.Map<java.lang.String, com.facebook.rebound.Spring> r0 = r2.a
            java.util.Collection r0 = r0.values()
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto Ld
            java.util.List r0 = (java.util.List) r0
            goto L13
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r0 = r1
        L13:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public boolean g() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public com.facebook.rebound.Spring h(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            java.util.Map<java.lang.String, com.facebook.rebound.Spring> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            com.facebook.rebound.Spring r2 = (com.facebook.rebound.Spring) r2
            return r2
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "id is required"
            r2.<init>(r0)
            throw r2
    }

    public void i(double r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringSystemListener> r0 = r2.d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.facebook.rebound.SpringSystemListener r1 = (com.facebook.rebound.SpringSystemListener) r1
            r1.b(r2)
            goto L6
        L16:
            r2.c(r3)
            java.util.Set<com.facebook.rebound.Spring> r3 = r2.b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L24
            r3 = 1
            r2.e = r3
        L24:
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringSystemListener> r3 = r2.d
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r3.next()
            com.facebook.rebound.SpringSystemListener r4 = (com.facebook.rebound.SpringSystemListener) r4
            r4.a(r2)
            goto L2a
        L3a:
            boolean r3 = r2.e
            if (r3 == 0) goto L43
            com.facebook.rebound.SpringLooper r3 = r2.c
            r3.c()
        L43:
            return
    }

    void j(com.facebook.rebound.Spring r3) {
            r2 = this;
            if (r3 == 0) goto L20
            java.util.Map<java.lang.String, com.facebook.rebound.Spring> r0 = r2.a
            java.lang.String r1 = r3.i()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L18
            java.util.Map<java.lang.String, com.facebook.rebound.Spring> r0 = r2.a
            java.lang.String r1 = r3.i()
            r0.put(r1, r3)
            return
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "spring is already registered"
            r3.<init>(r0)
            throw r3
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "spring is required"
            r3.<init>(r0)
            throw r3
    }

    public void k() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringSystemListener> r0 = r1.d
            r0.clear()
            return
    }

    public void l(com.facebook.rebound.SpringSystemListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.rebound.SpringSystemListener> r0 = r1.d
            r0.remove(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "listenerToRemove is required"
            r2.<init>(r0)
            throw r2
    }
}
