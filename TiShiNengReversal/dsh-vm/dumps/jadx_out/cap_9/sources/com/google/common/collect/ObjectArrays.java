package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ObjectArrays {
    private ObjectArrays() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    static java.lang.Object checkElementNotNull(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L3
            return r2
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "at index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    static java.lang.Object[] checkElementsNotNull(java.lang.Object... r1) {
            int r0 = r1.length
            java.lang.Object[] r1 = checkElementsNotNull(r1, r0)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    static java.lang.Object[] checkElementsNotNull(java.lang.Object[] r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto Lb
            r1 = r2[r0]
            checkElementNotNull(r1, r0)
            int r0 = r0 + 1
            goto L1
        Lb:
            return r2
    }

    public static <T> T[] concat(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r3, T[] r4) {
            int r0 = r4.length
            r1 = 1
            int r0 = r0 + r1
            java.lang.Object[] r0 = newArray(r4, r0)
            r2 = 0
            r0[r2] = r3
            int r3 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r1, r3)
            return r0
    }

    public static <T> T[] concat(T[] r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            int r0 = r1.length
            int r0 = r0 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            int r1 = r1.length
            r0[r1] = r2
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <T> T[] concat(T[] r2, T[] r3, java.lang.Class<T> r4) {
            int r0 = r2.length
            int r1 = r3.length
            int r0 = r0 + r1
            java.lang.Object[] r4 = newArray(r4, r0)
            int r0 = r2.length
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r4, r1, r0)
            int r2 = r2.length
            int r0 = r3.length
            java.lang.System.arraycopy(r3, r1, r4, r2, r0)
            return r4
    }

    static java.lang.Object[] copyAsObjectArray(java.lang.Object[] r2, int r3, int r4) {
            int r0 = r3 + r4
            int r1 = r2.length
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r0, r1)
            r0 = 0
            if (r4 != 0) goto Lc
            java.lang.Object[] r2 = new java.lang.Object[r0]
            return r2
        Lc:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.System.arraycopy(r2, r3, r1, r0, r4)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private static java.lang.Object[] fillArray(java.lang.Iterable<?> r3, java.lang.Object[] r4) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            r4[r0] = r1
            r0 = r2
            goto L5
        L15:
            return r4
    }

    @com.google.common.annotations.GwtIncompatible
    public static <T> T[] newArray(java.lang.Class<T> r0, int r1) {
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public static <T> T[] newArray(T[] r0, int r1) {
            java.lang.Object[] r0 = com.google.common.collect.Platform.newArray(r0, r1)
            return r0
    }

    static void swap(java.lang.Object[] r2, int r3, int r4) {
            r0 = r2[r3]
            r1 = r2[r4]
            r2[r3] = r1
            r2[r4] = r0
            return
    }

    static java.lang.Object[] toArrayImpl(java.util.Collection<?> r1) {
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r1 = fillArray(r1, r0)
            return r1
    }

    static <T> T[] toArrayImpl(java.util.Collection<?> r2, T[] r3) {
            int r0 = r2.size()
            int r1 = r3.length
            if (r1 >= r0) goto Lb
            java.lang.Object[] r3 = newArray(r3, r0)
        Lb:
            fillArray(r2, r3)
            int r2 = r3.length
            if (r2 <= r0) goto L14
            r2 = 0
            r3[r0] = r2
        L14:
            return r3
    }

    static <T> T[] toArrayImpl(java.lang.Object[] r2, int r3, int r4, T[] r5) {
            int r0 = r3 + r4
            int r1 = r2.length
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r0, r1)
            int r0 = r5.length
            if (r0 >= r4) goto Le
            java.lang.Object[] r5 = newArray(r5, r4)
            goto L14
        Le:
            int r0 = r5.length
            if (r0 <= r4) goto L14
            r0 = 0
            r5[r4] = r0
        L14:
            r0 = 0
            java.lang.System.arraycopy(r2, r3, r5, r0, r4)
            return r5
    }
}
