package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Atomics {
    private Atomics() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference() {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            return r0
    }

    public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r1)
            return r0
    }

    public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(int r1) {
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r1)
            return r0
    }

    public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(E[] r1) {
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r1)
            return r0
    }
}
