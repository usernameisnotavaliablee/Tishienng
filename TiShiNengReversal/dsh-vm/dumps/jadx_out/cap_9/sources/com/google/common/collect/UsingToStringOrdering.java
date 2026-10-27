package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class UsingToStringOrdering extends com.google.common.collect.Ordering<java.lang.Object> implements java.io.Serializable {
    static final com.google.common.collect.UsingToStringOrdering INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.collect.UsingToStringOrdering r0 = new com.google.common.collect.UsingToStringOrdering
            r0.<init>()
            com.google.common.collect.UsingToStringOrdering.INSTANCE = r0
            return
    }

    private UsingToStringOrdering() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.UsingToStringOrdering r0 = com.google.common.collect.UsingToStringOrdering.INSTANCE
            return r0
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r2.toString()
            int r1 = r1.compareTo(r2)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.usingToString()"
            return r0
    }
}
