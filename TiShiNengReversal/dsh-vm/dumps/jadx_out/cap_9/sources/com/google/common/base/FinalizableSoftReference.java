package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class FinalizableSoftReference<T> extends java.lang.ref.SoftReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizableSoftReference(T r2, com.google.common.base.FinalizableReferenceQueue r3) {
            r1 = this;
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r3.queue
            r1.<init>(r2, r0)
            r3.cleanUp()
            return
    }
}
