package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class EmptyImmutableListMultimap extends com.google.common.collect.ImmutableListMultimap<java.lang.Object, java.lang.Object> {
    static final com.google.common.collect.EmptyImmutableListMultimap INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.collect.EmptyImmutableListMultimap r0 = new com.google.common.collect.EmptyImmutableListMultimap
            r0.<init>()
            com.google.common.collect.EmptyImmutableListMultimap.INSTANCE = r0
            return
    }

    private EmptyImmutableListMultimap() {
            r2 = this;
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.EmptyImmutableListMultimap r0 = com.google.common.collect.EmptyImmutableListMultimap.INSTANCE
            return r0
    }
}
