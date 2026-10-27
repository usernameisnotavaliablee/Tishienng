package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FastThreadLocal<V> {
    private static final int variablesToRemoveIndex = 0;
    private final int index;

    static {
            int r0 = io.netty.util.internal.InternalThreadLocalMap.nextVariableIndex()
            io.netty.util.concurrent.FastThreadLocal.variablesToRemoveIndex = r0
            return
    }

    public FastThreadLocal() {
            r1 = this;
            r1.<init>()
            int r0 = io.netty.util.internal.InternalThreadLocalMap.nextVariableIndex()
            r1.index = r0
            return
    }

    private static void addToVariablesToRemove(io.netty.util.internal.InternalThreadLocalMap r3, io.netty.util.concurrent.FastThreadLocal<?> r4) {
            int r0 = io.netty.util.concurrent.FastThreadLocal.variablesToRemoveIndex
            java.lang.Object r1 = r3.indexedVariable(r0)
            java.lang.Object r2 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r1 == r2) goto L10
            if (r1 != 0) goto Ld
            goto L10
        Ld:
            java.util.Set r1 = (java.util.Set) r1
            goto L1c
        L10:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r3.setIndexedVariable(r0, r1)
        L1c:
            r1.add(r4)
            return
    }

    public static void destroy() {
            io.netty.util.internal.InternalThreadLocalMap.destroy()
            return
    }

    private V initialize(io.netty.util.internal.InternalThreadLocalMap r3) {
            r2 = this;
            java.lang.Object r0 = r2.initialValue()     // Catch: java.lang.Exception -> L5
            goto La
        L5:
            r0 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r0)
            r0 = 0
        La:
            int r1 = r2.index
            r3.setIndexedVariable(r1, r0)
            addToVariablesToRemove(r3, r2)
            return r0
    }

    public static void removeAll() {
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.getIfSet()
            if (r0 != 0) goto L7
            return
        L7:
            int r1 = io.netty.util.concurrent.FastThreadLocal.variablesToRemoveIndex     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r0.indexedVariable(r1)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L29
            java.lang.Object r2 = io.netty.util.internal.InternalThreadLocalMap.UNSET     // Catch: java.lang.Throwable -> L2d
            if (r1 == r2) goto L29
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            io.netty.util.concurrent.FastThreadLocal[] r3 = new io.netty.util.concurrent.FastThreadLocal[r2]     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch: java.lang.Throwable -> L2d
            io.netty.util.concurrent.FastThreadLocal[] r1 = (io.netty.util.concurrent.FastThreadLocal[]) r1     // Catch: java.lang.Throwable -> L2d
            int r3 = r1.length     // Catch: java.lang.Throwable -> L2d
        L1f:
            if (r2 >= r3) goto L29
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L2d
            r4.remove(r0)     // Catch: java.lang.Throwable -> L2d
            int r2 = r2 + 1
            goto L1f
        L29:
            io.netty.util.internal.InternalThreadLocalMap.remove()
            return
        L2d:
            r0 = move-exception
            io.netty.util.internal.InternalThreadLocalMap.remove()
            throw r0
    }

    private static void removeFromVariablesToRemove(io.netty.util.internal.InternalThreadLocalMap r1, io.netty.util.concurrent.FastThreadLocal<?> r2) {
            int r0 = io.netty.util.concurrent.FastThreadLocal.variablesToRemoveIndex
            java.lang.Object r1 = r1.indexedVariable(r0)
            java.lang.Object r0 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r1 == r0) goto L12
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            java.util.Set r1 = (java.util.Set) r1
            r1.remove(r2)
        L12:
            return
    }

    private void setKnownNotUnset(io.netty.util.internal.InternalThreadLocalMap r2, V r3) {
            r1 = this;
            int r0 = r1.index
            boolean r3 = r2.setIndexedVariable(r0, r3)
            if (r3 == 0) goto Lb
            addToVariablesToRemove(r2, r1)
        Lb:
            return
    }

    public static int size() {
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.getIfSet()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0.size()
            return r0
    }

    public final V get() {
            r3 = this;
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            int r1 = r3.index
            java.lang.Object r1 = r0.indexedVariable(r1)
            java.lang.Object r2 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r1 == r2) goto Lf
            return r1
        Lf:
            java.lang.Object r0 = r3.initialize(r0)
            return r0
    }

    public final V get(io.netty.util.internal.InternalThreadLocalMap r3) {
            r2 = this;
            int r0 = r2.index
            java.lang.Object r0 = r3.indexedVariable(r0)
            java.lang.Object r1 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r0 == r1) goto Lb
            return r0
        Lb:
            java.lang.Object r3 = r2.initialize(r3)
            return r3
    }

    public final V getIfExists() {
            r2 = this;
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.getIfSet()
            if (r0 == 0) goto L11
            int r1 = r2.index
            java.lang.Object r0 = r0.indexedVariable(r1)
            java.lang.Object r1 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r0 == r1) goto L11
            return r0
        L11:
            r0 = 0
            return r0
    }

    protected V initialValue() throws java.lang.Exception {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isSet() {
            r1 = this;
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.getIfSet()
            boolean r0 = r1.isSet(r0)
            return r0
    }

    public final boolean isSet(io.netty.util.internal.InternalThreadLocalMap r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            int r0 = r1.index
            boolean r2 = r2.isIndexedVariableSet(r0)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    protected void onRemoval(V r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    public final void remove() {
            r1 = this;
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.getIfSet()
            r1.remove(r0)
            return
    }

    public final void remove(io.netty.util.internal.InternalThreadLocalMap r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L18
        L3:
            int r0 = r1.index
            java.lang.Object r0 = r2.removeIndexedVariable(r0)
            removeFromVariablesToRemove(r2, r1)
            java.lang.Object r2 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r0 == r2) goto L18
            r1.onRemoval(r0)     // Catch: java.lang.Exception -> L14
            return
        L14:
            r2 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r2)
        L18:
            return
    }

    public final void set(io.netty.util.internal.InternalThreadLocalMap r2, V r3) {
            r1 = this;
            java.lang.Object r0 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r3 == r0) goto L8
            r1.setKnownNotUnset(r2, r3)
            return
        L8:
            r1.remove(r2)
            return
    }

    public final void set(V r2) {
            r1 = this;
            java.lang.Object r0 = io.netty.util.internal.InternalThreadLocalMap.UNSET
            if (r2 == r0) goto Lc
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            r1.setKnownNotUnset(r0, r2)
            return
        Lc:
            r1.remove()
            return
    }
}
