package io.netty.util;

import io.netty.util.AbstractConstant;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractConstant<T extends io.netty.util.AbstractConstant<T>> implements io.netty.util.Constant<T> {
    private static final java.util.concurrent.atomic.AtomicLong uniqueIdGenerator = null;
    private final int id;
    private final java.lang.String name;
    private final long uniquifier;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            io.netty.util.AbstractConstant.uniqueIdGenerator = r0
            return
    }

    protected AbstractConstant(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.name = r2
            java.util.concurrent.atomic.AtomicLong r1 = io.netty.util.AbstractConstant.uniqueIdGenerator
            long r1 = r1.getAndIncrement()
            r0.uniquifier = r1
            return
    }

    public final int compareTo(T r5) {
            r4 = this;
            if (r4 != r5) goto L4
            r5 = 0
            return r5
        L4:
            int r0 = r4.hashCode()
            int r1 = r5.hashCode()
            int r0 = r0 - r1
            if (r0 == 0) goto L10
            return r0
        L10:
            long r0 = r4.uniquifier
            long r2 = r5.uniquifier
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L1a
            r5 = -1
            return r5
        L1a:
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L20
            r5 = 1
            return r5
        L20:
            java.lang.Error r5 = new java.lang.Error
            java.lang.String r0 = "failed to compare two different constants"
            r5.<init>(r0)
            throw r5
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            io.netty.util.AbstractConstant r1 = (io.netty.util.AbstractConstant) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // io.netty.util.Constant
    public final int id() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    @Override // io.netty.util.Constant
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name()
            return r0
    }
}
