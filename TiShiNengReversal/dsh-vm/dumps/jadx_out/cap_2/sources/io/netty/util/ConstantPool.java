package io.netty.util;

import io.netty.util.Constant;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ConstantPool<T extends io.netty.util.Constant<T>> {
    private final java.util.concurrent.ConcurrentMap<java.lang.String, T> constants;
    private final java.util.concurrent.atomic.AtomicInteger nextId;

    public ConstantPool() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r2.constants = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r2.nextId = r0
            return
    }

    private static java.lang.String checkNotNullAndNotEmpty(java.lang.String r1) {
            java.lang.String r0 = "name"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "empty name"
            r1.<init>(r0)
            throw r1
    }

    private T createOrThrow(java.lang.String r4) {
            r3 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, T extends io.netty.util.Constant<T>> r0 = r3.constants
            java.lang.Object r0 = r0.get(r4)
            io.netty.util.Constant r0 = (io.netty.util.Constant) r0
            if (r0 != 0) goto L1d
            int r0 = r3.nextId()
            io.netty.util.Constant r0 = r3.newConstant(r0, r4)
            java.util.concurrent.ConcurrentMap<java.lang.String, T extends io.netty.util.Constant<T>> r1 = r3.constants
            java.lang.Object r1 = r1.putIfAbsent(r4, r0)
            io.netty.util.Constant r1 = (io.netty.util.Constant) r1
            if (r1 != 0) goto L1d
            return r0
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "'%s' is already in use"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    private T getOrCreate(java.lang.String r3) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, T extends io.netty.util.Constant<T>> r0 = r2.constants
            java.lang.Object r0 = r0.get(r3)
            io.netty.util.Constant r0 = (io.netty.util.Constant) r0
            if (r0 != 0) goto L1e
            int r0 = r2.nextId()
            io.netty.util.Constant r0 = r2.newConstant(r0, r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, T extends io.netty.util.Constant<T>> r1 = r2.constants
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            io.netty.util.Constant r3 = (io.netty.util.Constant) r3
            if (r3 != 0) goto L1d
            return r0
        L1d:
            return r3
        L1e:
            return r0
    }

    public boolean exists(java.lang.String r2) {
            r1 = this;
            checkNotNullAndNotEmpty(r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, T extends io.netty.util.Constant<T>> r0 = r1.constants
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    protected abstract T newConstant(int r1, java.lang.String r2);

    public T newInstance(java.lang.String r1) {
            r0 = this;
            checkNotNullAndNotEmpty(r1)
            io.netty.util.Constant r1 = r0.createOrThrow(r1)
            return r1
    }

    @java.lang.Deprecated
    public final int nextId() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.nextId
            int r0 = r0.getAndIncrement()
            return r0
    }

    public T valueOf(java.lang.Class<?> r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L29
            if (r3 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r2 = 35
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            io.netty.util.Constant r2 = r1.valueOf(r2)
            return r2
        L21:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "secondNameComponent"
            r2.<init>(r3)
            throw r2
        L29:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "firstNameComponent"
            r2.<init>(r3)
            throw r2
    }

    public T valueOf(java.lang.String r1) {
            r0 = this;
            checkNotNullAndNotEmpty(r1)
            io.netty.util.Constant r1 = r0.getOrCreate(r1)
            return r1
    }
}
