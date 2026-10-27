package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class GeneralRange<T> implements java.io.Serializable {
    private final java.util.Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final com.google.common.collect.BoundType lowerBoundType;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private final T lowerEndpoint;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.google.common.collect.GeneralRange<T> reverse;
    private final com.google.common.collect.BoundType upperBoundType;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private final T upperEndpoint;

    private GeneralRange(java.util.Comparator<? super T> r3, boolean r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r5, com.google.common.collect.BoundType r6, boolean r7, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r8, com.google.common.collect.BoundType r9) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Comparator r0 = (java.util.Comparator) r0
            r2.comparator = r0
            r2.hasLowerBound = r4
            r2.hasUpperBound = r7
            r2.lowerEndpoint = r5
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.collect.BoundType r0 = (com.google.common.collect.BoundType) r0
            r2.lowerBoundType = r0
            r2.upperEndpoint = r8
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r9)
            com.google.common.collect.BoundType r0 = (com.google.common.collect.BoundType) r0
            r2.upperBoundType = r0
            if (r4 == 0) goto L28
            r3.compare(r5, r5)
        L28:
            if (r7 == 0) goto L2d
            r3.compare(r8, r8)
        L2d:
            if (r4 == 0) goto L52
            if (r7 == 0) goto L52
            int r3 = r3.compare(r5, r8)
            r4 = 0
            r7 = 1
            if (r3 > 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            java.lang.String r1 = "lowerEndpoint (%s) > upperEndpoint (%s)"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r8)
            if (r3 != 0) goto L52
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.OPEN
            if (r6 == r3) goto L49
            r5 = 1
            goto L4a
        L49:
            r5 = 0
        L4a:
            if (r9 == r3) goto L4d
            r4 = 1
        L4d:
            r3 = r5 | r4
            com.google.common.base.Preconditions.checkArgument(r3)
        L52:
            return
    }

    static <T> com.google.common.collect.GeneralRange<T> all(java.util.Comparator<? super T> r8) {
            com.google.common.collect.GeneralRange r0 = new com.google.common.collect.GeneralRange
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = 0
            r7 = r4
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    static <T> com.google.common.collect.GeneralRange<T> downTo(java.util.Comparator<? super T> r8, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r9, com.google.common.collect.BoundType r10) {
            com.google.common.collect.GeneralRange r0 = new com.google.common.collect.GeneralRange
            r6 = 0
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            r2 = 1
            r5 = 0
            r1 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    static <T extends java.lang.Comparable> com.google.common.collect.GeneralRange<T> from(com.google.common.collect.Range<T> r10) {
            boolean r0 = r10.hasLowerBound()
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.Comparable r0 = r10.lowerEndpoint()
            r5 = r0
            goto Le
        Ld:
            r5 = r1
        Le:
            boolean r0 = r10.hasLowerBound()
            if (r0 == 0) goto L1a
            com.google.common.collect.BoundType r0 = r10.lowerBoundType()
        L18:
            r6 = r0
            goto L1d
        L1a:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            goto L18
        L1d:
            boolean r0 = r10.hasUpperBound()
            if (r0 == 0) goto L27
            java.lang.Comparable r1 = r10.upperEndpoint()
        L27:
            r8 = r1
            boolean r0 = r10.hasUpperBound()
            if (r0 == 0) goto L34
            com.google.common.collect.BoundType r0 = r10.upperBoundType()
        L32:
            r9 = r0
            goto L37
        L34:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            goto L32
        L37:
            com.google.common.collect.GeneralRange r2 = new com.google.common.collect.GeneralRange
            com.google.common.collect.Ordering r3 = com.google.common.collect.Ordering.natural()
            boolean r4 = r10.hasLowerBound()
            boolean r7 = r10.hasUpperBound()
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    static <T> com.google.common.collect.GeneralRange<T> range(java.util.Comparator<? super T> r8, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r9, com.google.common.collect.BoundType r10, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r11, com.google.common.collect.BoundType r12) {
            com.google.common.collect.GeneralRange r0 = new com.google.common.collect.GeneralRange
            r2 = 1
            r5 = 1
            r1 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    static <T> com.google.common.collect.GeneralRange<T> upTo(java.util.Comparator<? super T> r8, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r9, com.google.common.collect.BoundType r10) {
            com.google.common.collect.GeneralRange r0 = new com.google.common.collect.GeneralRange
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            r5 = 1
            r2 = 0
            r3 = 0
            r1 = r8
            r6 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    java.util.Comparator<? super T> comparator() {
            r1 = this;
            java.util.Comparator<? super T> r0 = r1.comparator
            return r0
    }

    boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            r1 = this;
            boolean r0 = r1.tooLow(r2)
            if (r0 != 0) goto Le
            boolean r2 = r1.tooHigh(r2)
            if (r2 != 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.common.collect.GeneralRange
            r1 = 0
            if (r0 == 0) goto L57
            com.google.common.collect.GeneralRange r4 = (com.google.common.collect.GeneralRange) r4
            java.util.Comparator<? super T> r0 = r3.comparator
            java.util.Comparator<? super T> r2 = r4.comparator
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L57
            boolean r0 = r3.hasLowerBound
            boolean r2 = r4.hasLowerBound
            if (r0 != r2) goto L57
            boolean r0 = r3.hasUpperBound
            boolean r2 = r4.hasUpperBound
            if (r0 != r2) goto L57
            com.google.common.collect.BoundType r0 = r3.getLowerBoundType()
            com.google.common.collect.BoundType r2 = r4.getLowerBoundType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L57
            com.google.common.collect.BoundType r0 = r3.getUpperBoundType()
            com.google.common.collect.BoundType r2 = r4.getUpperBoundType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L57
            java.lang.Object r0 = r3.getLowerEndpoint()
            java.lang.Object r2 = r4.getLowerEndpoint()
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 == 0) goto L57
            java.lang.Object r0 = r3.getUpperEndpoint()
            java.lang.Object r4 = r4.getUpperEndpoint()
            boolean r4 = com.google.common.base.Objects.equal(r0, r4)
            if (r4 == 0) goto L57
            r4 = 1
            return r4
        L57:
            return r1
    }

    com.google.common.collect.BoundType getLowerBoundType() {
            r1 = this;
            com.google.common.collect.BoundType r0 = r1.lowerBoundType
            return r0
    }

    T getLowerEndpoint() {
            r1 = this;
            T r0 = r1.lowerEndpoint
            return r0
    }

    com.google.common.collect.BoundType getUpperBoundType() {
            r1 = this;
            com.google.common.collect.BoundType r0 = r1.upperBoundType
            return r0
    }

    T getUpperEndpoint() {
            r1 = this;
            T r0 = r1.upperEndpoint
            return r0
    }

    boolean hasLowerBound() {
            r1 = this;
            boolean r0 = r1.hasLowerBound
            return r0
    }

    boolean hasUpperBound() {
            r1 = this;
            boolean r0 = r1.hasUpperBound
            return r0
    }

    public int hashCode() {
            r7 = this;
            java.util.Comparator<? super T> r0 = r7.comparator
            java.lang.Object r1 = r7.getLowerEndpoint()
            com.google.common.collect.BoundType r2 = r7.getLowerBoundType()
            java.lang.Object r3 = r7.getUpperEndpoint()
            com.google.common.collect.BoundType r4 = r7.getUpperBoundType()
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            int r0 = com.google.common.base.Objects.hashCode(r5)
            return r0
    }

    com.google.common.collect.GeneralRange<T> intersect(com.google.common.collect.GeneralRange<T> r12) {
            r11 = this;
            com.google.common.base.Preconditions.checkNotNull(r12)
            java.util.Comparator<? super T> r0 = r11.comparator
            java.util.Comparator<? super T> r1 = r12.comparator
            boolean r0 = r0.equals(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r11.hasLowerBound
            java.lang.Object r1 = r11.getLowerEndpoint()
            com.google.common.collect.BoundType r2 = r11.getLowerBoundType()
            boolean r3 = r11.hasLowerBound()
            if (r3 != 0) goto L2a
            boolean r0 = r12.hasLowerBound
            java.lang.Object r1 = r12.getLowerEndpoint()
            com.google.common.collect.BoundType r2 = r12.getLowerBoundType()
        L28:
            r5 = r0
            goto L53
        L2a:
            boolean r3 = r12.hasLowerBound()
            if (r3 == 0) goto L28
            java.util.Comparator<? super T> r3 = r11.comparator
            java.lang.Object r4 = r11.getLowerEndpoint()
            java.lang.Object r5 = r12.getLowerEndpoint()
            int r3 = r3.compare(r4, r5)
            if (r3 < 0) goto L4a
            if (r3 != 0) goto L28
            com.google.common.collect.BoundType r3 = r12.getLowerBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L28
        L4a:
            java.lang.Object r1 = r12.getLowerEndpoint()
            com.google.common.collect.BoundType r2 = r12.getLowerBoundType()
            goto L28
        L53:
            boolean r0 = r11.hasUpperBound
            java.lang.Object r3 = r11.getUpperEndpoint()
            com.google.common.collect.BoundType r4 = r11.getUpperBoundType()
            boolean r6 = r11.hasUpperBound()
            if (r6 != 0) goto L70
            boolean r0 = r12.hasUpperBound
            java.lang.Object r3 = r12.getUpperEndpoint()
            com.google.common.collect.BoundType r4 = r12.getUpperBoundType()
        L6d:
            r8 = r0
            r9 = r3
            goto L99
        L70:
            boolean r6 = r12.hasUpperBound()
            if (r6 == 0) goto L6d
            java.util.Comparator<? super T> r6 = r11.comparator
            java.lang.Object r7 = r11.getUpperEndpoint()
            java.lang.Object r8 = r12.getUpperEndpoint()
            int r6 = r6.compare(r7, r8)
            if (r6 > 0) goto L90
            if (r6 != 0) goto L6d
            com.google.common.collect.BoundType r6 = r12.getUpperBoundType()
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            if (r6 != r7) goto L6d
        L90:
            java.lang.Object r3 = r12.getUpperEndpoint()
            com.google.common.collect.BoundType r4 = r12.getUpperBoundType()
            goto L6d
        L99:
            if (r5 == 0) goto Lb5
            if (r8 == 0) goto Lb5
            java.util.Comparator<? super T> r12 = r11.comparator
            int r12 = r12.compare(r1, r9)
            if (r12 > 0) goto Lad
            if (r12 != 0) goto Lb5
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            if (r2 != r12) goto Lb5
            if (r4 != r12) goto Lb5
        Lad:
            com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.CLOSED
            r6 = r9
        Lb2:
            r7 = r2
            r10 = r4
            goto Lb7
        Lb5:
            r6 = r1
            goto Lb2
        Lb7:
            com.google.common.collect.GeneralRange r3 = new com.google.common.collect.GeneralRange
            java.util.Comparator<? super T> r4 = r11.comparator
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
    }

    boolean isEmpty() {
            r1 = this;
            boolean r0 = r1.hasUpperBound()
            if (r0 == 0) goto L10
            java.lang.Object r0 = r1.getUpperEndpoint()
            boolean r0 = r1.tooLow(r0)
            if (r0 != 0) goto L20
        L10:
            boolean r0 = r1.hasLowerBound()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.getLowerEndpoint()
            boolean r0 = r1.tooHigh(r0)
            if (r0 == 0) goto L22
        L20:
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    com.google.common.collect.GeneralRange<T> reverse() {
            r9 = this;
            com.google.common.collect.GeneralRange<T> r0 = r9.reverse
            if (r0 != 0) goto L2c
            com.google.common.collect.GeneralRange r1 = new com.google.common.collect.GeneralRange
            java.util.Comparator<? super T> r0 = r9.comparator
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
            com.google.common.collect.Ordering r2 = r0.reverse()
            boolean r3 = r9.hasUpperBound
            java.lang.Object r4 = r9.getUpperEndpoint()
            com.google.common.collect.BoundType r5 = r9.getUpperBoundType()
            boolean r6 = r9.hasLowerBound
            java.lang.Object r7 = r9.getLowerEndpoint()
            com.google.common.collect.BoundType r8 = r9.getLowerBoundType()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.reverse = r9
            r9.reverse = r1
            return r1
        L2c:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Comparator<? super T> r1 = r3.comparator
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            com.google.common.collect.BoundType r1 = r3.lowerBoundType
            com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.CLOSED
            if (r1 != r2) goto L18
            r1 = 91
            goto L1a
        L18:
            r1 = 40
        L1a:
            r0.append(r1)
            boolean r1 = r3.hasLowerBound
            if (r1 == 0) goto L24
            T r1 = r3.lowerEndpoint
            goto L26
        L24:
            java.lang.String r1 = "-∞"
        L26:
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            boolean r1 = r3.hasUpperBound
            if (r1 == 0) goto L35
            T r1 = r3.upperEndpoint
            goto L37
        L35:
            java.lang.String r1 = "∞"
        L37:
            r0.append(r1)
            com.google.common.collect.BoundType r1 = r3.upperBoundType
            if (r1 != r2) goto L41
            r1 = 93
            goto L43
        L41:
            r1 = 41
        L43:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    boolean tooHigh(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r6) {
            r5 = this;
            boolean r0 = r5.hasUpperBound()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r5.getUpperEndpoint()
            java.util.Comparator<? super T> r2 = r5.comparator
            int r6 = r2.compare(r6, r0)
            r0 = 1
            if (r6 <= 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r6 != 0) goto L1c
            r6 = 1
            goto L1d
        L1c:
            r6 = 0
        L1d:
            com.google.common.collect.BoundType r3 = r5.getUpperBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L26
            r1 = 1
        L26:
            r6 = r6 & r1
            r6 = r6 | r2
            return r6
    }

    boolean tooLow(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r6) {
            r5 = this;
            boolean r0 = r5.hasLowerBound()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r5.getLowerEndpoint()
            java.util.Comparator<? super T> r2 = r5.comparator
            int r6 = r2.compare(r6, r0)
            r0 = 1
            if (r6 >= 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r6 != 0) goto L1c
            r6 = 1
            goto L1d
        L1c:
            r6 = 0
        L1d:
            com.google.common.collect.BoundType r3 = r5.getLowerBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L26
            r1 = 1
        L26:
            r6 = r6 & r1
            r6 = r6 | r2
            return r6
    }
}
