package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MutableClassToInstanceMap<B> extends com.google.common.collect.ForwardingMap<java.lang.Class<? extends B>, B> implements com.google.common.collect.ClassToInstanceMap<B>, java.io.Serializable {
    private final java.util.Map<java.lang.Class<? extends B>, B> delegate;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SerializedForm<B> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.Map<java.lang.Class<? extends B>, B> backingMap;

        SerializedForm(java.util.Map<java.lang.Class<? extends B>, B> r1) {
                r0 = this;
                r0.<init>()
                r0.backingMap = r1
                return
        }

        java.lang.Object readResolve() {
                r1 = this;
                java.util.Map<java.lang.Class<? extends B>, B> r0 = r1.backingMap
                com.google.common.collect.MutableClassToInstanceMap r0 = com.google.common.collect.MutableClassToInstanceMap.create(r0)
                return r0
        }
    }

    private MutableClassToInstanceMap(java.util.Map<java.lang.Class<? extends B>, B> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.delegate = r1
            return
    }

    static /* synthetic */ java.lang.Object access$000(java.lang.Class r0, java.lang.Object r1) {
            java.lang.Object r0 = cast(r0, r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private static <B, T extends B> T cast(java.lang.Class<T> r0, B r1) {
            java.lang.Class r0 = com.google.common.primitives.Primitives.wrap(r0)
            java.lang.Object r0 = r0.cast(r1)
            return r0
    }

    static <B> java.util.Map.Entry<java.lang.Class<? extends B>, B> checkedEntry(java.util.Map.Entry<java.lang.Class<? extends B>, B> r1) {
            com.google.common.collect.MutableClassToInstanceMap$1 r0 = new com.google.common.collect.MutableClassToInstanceMap$1
            r0.<init>(r1)
            return r0
    }

    public static <B> com.google.common.collect.MutableClassToInstanceMap<B> create() {
            com.google.common.collect.MutableClassToInstanceMap r0 = new com.google.common.collect.MutableClassToInstanceMap
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public static <B> com.google.common.collect.MutableClassToInstanceMap<B> create(java.util.Map<java.lang.Class<? extends B>, B> r1) {
            com.google.common.collect.MutableClassToInstanceMap r0 = new com.google.common.collect.MutableClassToInstanceMap
            r0.<init>(r1)
            return r0
    }

    private java.lang.Object writeReplace() {
            r2 = this;
            com.google.common.collect.MutableClassToInstanceMap$SerializedForm r0 = new com.google.common.collect.MutableClassToInstanceMap$SerializedForm
            java.util.Map r1 = r2.delegate()
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    protected java.util.Map<java.lang.Class<? extends B>, B> delegate() {
            r1 = this;
            java.util.Map<java.lang.Class<? extends B>, B> r0 = r1.delegate
            return r0
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.Class<? extends B>, B>> entrySet() {
            r1 = this;
            com.google.common.collect.MutableClassToInstanceMap$2 r0 = new com.google.common.collect.MutableClassToInstanceMap$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    public <T extends B> T getInstance(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            java.lang.Object r2 = cast(r2, r0)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public B put(java.lang.Class<? extends B> r1, B r2) {
            r0 = this;
            java.lang.Object r2 = cast(r1, r2)
            java.lang.Object r1 = super.put(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r1 = r0.put(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(java.util.Map<? extends java.lang.Class<? extends B>, ? extends B> r4) {
            r3 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r4)
            java.util.Set r4 = r0.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r1 = r1.getValue()
            cast(r2, r1)
            goto Ld
        L27:
            super.putAll(r0)
            return
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <T extends B> T putInstance(java.lang.Class<T> r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r0.put(r1, r2)
            java.lang.Object r1 = cast(r1, r2)
            return r1
    }
}
