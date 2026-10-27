package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingMapEntry<K, V> extends com.google.common.collect.ForwardingObject implements java.util.Map.Entry<K, V> {
    protected ForwardingMapEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract java.util.Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map.Entry
    public K getKey() {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // java.util.Map.Entry
    public V getValue() {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    public V setValue(V r2) {
            r1 = this;
            java.util.Map$Entry r0 = r1.delegate()
            java.lang.Object r2 = r0.setValue(r2)
            return r2
    }

    protected boolean standardEquals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L25
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r2 = r4.getKey()
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.getValue()
            java.lang.Object r4 = r4.getValue()
            boolean r4 = com.google.common.base.Objects.equal(r0, r4)
            if (r4 == 0) goto L25
            r4 = 1
            return r4
        L25:
            return r1
    }

    protected int standardHashCode() {
            r3 = this;
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r3.getValue()
            r2 = 0
            if (r0 != 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            int r0 = r0.hashCode()
        L11:
            if (r1 != 0) goto L14
            goto L18
        L14:
            int r2 = r1.hashCode()
        L18:
            r0 = r0 ^ r2
            return r0
    }

    @com.google.common.annotations.Beta
    protected java.lang.String standardToString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r1 = r2.getValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
