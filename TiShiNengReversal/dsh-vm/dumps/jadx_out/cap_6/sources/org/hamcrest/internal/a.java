package org.hamcrest.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements java.util.Iterator<java.lang.Object> {
    private final java.lang.Object a;
    private int b;

    public a(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L13
            r1.a = r2
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "not an array"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.b
            java.lang.Object r1 = r2.a
            int r1 = java.lang.reflect.Array.getLength(r1)
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r3 = this;
            java.lang.Object r0 = r3.a
            int r1 = r3.b
            int r2 = r1 + 1
            r3.b = r2
            java.lang.Object r0 = java.lang.reflect.Array.get(r0, r1)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "cannot remove items from an array"
            r0.<init>(r1)
            throw r0
    }
}
