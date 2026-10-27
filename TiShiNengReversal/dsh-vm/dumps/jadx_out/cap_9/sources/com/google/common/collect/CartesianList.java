package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class CartesianList<E> extends java.util.AbstractList<java.util.List<E>> implements java.util.RandomAccess {
    private final transient com.google.common.collect.ImmutableList<java.util.List<E>> axes;
    private final transient int[] axesSizeProduct;


    CartesianList(com.google.common.collect.ImmutableList<java.util.List<E>> r5) {
            r4 = this;
            r4.<init>()
            r4.axes = r5
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            int r2 = r5.size()
            r0[r2] = r1
            int r2 = r5.size()     // Catch: java.lang.ArithmeticException -> L34
            int r2 = r2 - r1
        L18:
            if (r2 < 0) goto L31
            int r1 = r2 + 1
            r1 = r0[r1]     // Catch: java.lang.ArithmeticException -> L34
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.ArithmeticException -> L34
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.ArithmeticException -> L34
            int r3 = r3.size()     // Catch: java.lang.ArithmeticException -> L34
            int r1 = com.google.common.math.IntMath.checkedMultiply(r1, r3)     // Catch: java.lang.ArithmeticException -> L34
            r0[r2] = r1     // Catch: java.lang.ArithmeticException -> L34
            int r2 = r2 + (-1)
            goto L18
        L31:
            r4.axesSizeProduct = r0
            return
        L34:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cartesian product too large; must have size at most Integer.MAX_VALUE"
            r5.<init>(r0)
            throw r5
    }

    static /* synthetic */ com.google.common.collect.ImmutableList access$000(com.google.common.collect.CartesianList r0) {
            com.google.common.collect.ImmutableList<java.util.List<E>> r0 = r0.axes
            return r0
    }

    static /* synthetic */ int access$100(com.google.common.collect.CartesianList r0, int r1, int r2) {
            int r0 = r0.getAxisIndexForProductIndex(r1, r2)
            return r0
    }

    static <E> java.util.List<java.util.List<E>> create(java.util.List<? extends java.util.List<? extends E>> r3) {
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            java.util.List r1 = (java.util.List) r1
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L28
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            return r3
        L28:
            r0.add(r1)
            goto Ld
        L2c:
            com.google.common.collect.CartesianList r3 = new com.google.common.collect.CartesianList
            com.google.common.collect.ImmutableList r0 = r0.build()
            r3.<init>(r0)
            return r3
    }

    private int getAxisIndexForProductIndex(int r3, int r4) {
            r2 = this;
            int[] r0 = r2.axesSizeProduct
            int r1 = r4 + 1
            r0 = r0[r1]
            int r3 = r3 / r0
            com.google.common.collect.ImmutableList<java.util.List<E>> r0 = r2.axes
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r3 = r3 % r4
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public com.google.common.collect.ImmutableList<E> get(int r2) {
            r1 = this;
            int r0 = r1.size()
            com.google.common.base.Preconditions.checkElementIndex(r2, r0)
            com.google.common.collect.CartesianList$1 r0 = new com.google.common.collect.CartesianList$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof java.util.List
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            com.google.common.collect.ImmutableList<java.util.List<E>> r2 = r5.axes
            int r2 = r2.size()
            if (r0 == r2) goto L15
            return r1
        L15:
            java.util.ListIterator r6 = r6.listIterator()
            r0 = 0
        L1a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L41
            int r2 = r6.nextIndex()
            com.google.common.collect.ImmutableList<java.util.List<E>> r3 = r5.axes
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r6.next()
            int r3 = r3.indexOf(r4)
            if (r3 != r1) goto L37
            return r1
        L37:
            int[] r4 = r5.axesSizeProduct
            int r2 = r2 + 1
            r2 = r4[r2]
            int r3 = r3 * r2
            int r0 = r0 + r3
            goto L1a
        L41:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r2 = this;
            int[] r0 = r2.axesSizeProduct
            r1 = 0
            r0 = r0[r1]
            return r0
    }
}
