package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class TreeMultiset<E> extends com.google.common.collect.AbstractSortedMultiset<E> implements java.io.Serializable {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 1;
    private final transient com.google.common.collect.TreeMultiset.AvlNode<E> header;
    private final transient com.google.common.collect.GeneralRange<E> range;
    private final transient com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> rootReference;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;

        static {
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass4() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum Aggregate extends java.lang.Enum<com.google.common.collect.TreeMultiset.Aggregate> {
        private static final /* synthetic */ com.google.common.collect.TreeMultiset.Aggregate[] $VALUES = null;
        public static final com.google.common.collect.TreeMultiset.Aggregate DISTINCT = null;
        public static final com.google.common.collect.TreeMultiset.Aggregate SIZE = null;



        static {
                com.google.common.collect.TreeMultiset$Aggregate$1 r0 = new com.google.common.collect.TreeMultiset$Aggregate$1
                java.lang.String r1 = "SIZE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.collect.TreeMultiset.Aggregate.SIZE = r0
                com.google.common.collect.TreeMultiset$Aggregate$2 r1 = new com.google.common.collect.TreeMultiset$Aggregate$2
                java.lang.String r3 = "DISTINCT"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.collect.TreeMultiset.Aggregate.DISTINCT = r1
                r3 = 2
                com.google.common.collect.TreeMultiset$Aggregate[] r3 = new com.google.common.collect.TreeMultiset.Aggregate[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.common.collect.TreeMultiset.Aggregate.$VALUES = r3
                return
        }

        Aggregate(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Aggregate(java.lang.String r1, int r2, com.google.common.collect.TreeMultiset.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.TreeMultiset.Aggregate valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.TreeMultiset$Aggregate> r0 = com.google.common.collect.TreeMultiset.Aggregate.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.TreeMultiset$Aggregate r1 = (com.google.common.collect.TreeMultiset.Aggregate) r1
                return r1
        }

        public static com.google.common.collect.TreeMultiset.Aggregate[] values() {
                com.google.common.collect.TreeMultiset$Aggregate[] r0 = com.google.common.collect.TreeMultiset.Aggregate.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.TreeMultiset$Aggregate[] r0 = (com.google.common.collect.TreeMultiset.Aggregate[]) r0
                return r0
        }

        abstract int nodeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> r1);

        abstract long treeAggregate(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.TreeMultiset.AvlNode<?> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AvlNode<E> {
        private int distinctElements;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final E elem;
        private int elemCount;
        private int height;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private com.google.common.collect.TreeMultiset.AvlNode<E> left;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private com.google.common.collect.TreeMultiset.AvlNode<E> pred;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private com.google.common.collect.TreeMultiset.AvlNode<E> right;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private com.google.common.collect.TreeMultiset.AvlNode<E> succ;
        private long totalCount;

        AvlNode(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r3, int r4) {
                r2 = this;
                r2.<init>()
                r0 = 1
                if (r4 <= 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                com.google.common.base.Preconditions.checkArgument(r1)
                r2.elem = r3
                r2.elemCount = r4
                long r3 = (long) r4
                r2.totalCount = r3
                r2.distinctElements = r0
                r2.height = r0
                r3 = 0
                r2.left = r3
                r2.right = r3
                return
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1000(com.google.common.collect.TreeMultiset.AvlNode r0, java.util.Comparator r1, java.lang.Object r2) {
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.ceiling(r1, r2)
                return r0
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1100(com.google.common.collect.TreeMultiset.AvlNode r0, java.util.Comparator r1, java.lang.Object r2) {
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.floor(r1, r2)
                return r0
        }

        static /* synthetic */ int access$200(com.google.common.collect.TreeMultiset.AvlNode r0) {
                int r0 = r0.elemCount
                return r0
        }

        static /* synthetic */ int access$202(com.google.common.collect.TreeMultiset.AvlNode r0, int r1) {
                r0.elemCount = r1
                return r1
        }

        static /* synthetic */ long access$300(com.google.common.collect.TreeMultiset.AvlNode r2) {
                long r0 = r2.totalCount
                return r0
        }

        static /* synthetic */ int access$400(com.google.common.collect.TreeMultiset.AvlNode r0) {
                int r0 = r0.distinctElements
                return r0
        }

        static /* synthetic */ java.lang.Object access$500(com.google.common.collect.TreeMultiset.AvlNode r0) {
                E r0 = r0.elem
                return r0
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$600(com.google.common.collect.TreeMultiset.AvlNode r0) {
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.left
                return r0
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$602(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0.left = r1
                return r1
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$700(com.google.common.collect.TreeMultiset.AvlNode r0) {
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.right
                return r0
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$702(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0.right = r1
                return r1
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$800(com.google.common.collect.TreeMultiset.AvlNode r0) {
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.succ
                return r0
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$802(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0.succ = r1
                return r1
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$900(com.google.common.collect.TreeMultiset.AvlNode r0) {
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.pred
                return r0
        }

        static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$902(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
                r0.pred = r1
                return r1
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> addLeftChild(E r3, int r4) {
                r2 = this;
                com.google.common.collect.TreeMultiset$AvlNode r0 = new com.google.common.collect.TreeMultiset$AvlNode
                r0.<init>(r3, r4)
                r2.left = r0
                com.google.common.collect.TreeMultiset$AvlNode<E> r3 = r2.pred
                com.google.common.collect.TreeMultiset.access$1700(r3, r0, r2)
                r3 = 2
                int r0 = r2.height
                int r3 = java.lang.Math.max(r3, r0)
                r2.height = r3
                int r3 = r2.distinctElements
                int r3 = r3 + 1
                r2.distinctElements = r3
                long r0 = r2.totalCount
                long r3 = (long) r4
                long r0 = r0 + r3
                r2.totalCount = r0
                return r2
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> addRightChild(E r3, int r4) {
                r2 = this;
                com.google.common.collect.TreeMultiset$AvlNode r0 = new com.google.common.collect.TreeMultiset$AvlNode
                r0.<init>(r3, r4)
                r2.right = r0
                com.google.common.collect.TreeMultiset$AvlNode<E> r3 = r2.succ
                com.google.common.collect.TreeMultiset.access$1700(r2, r0, r3)
                r3 = 2
                int r0 = r2.height
                int r3 = java.lang.Math.max(r3, r0)
                r2.height = r3
                int r3 = r2.distinctElements
                int r3 = r3 + 1
                r2.distinctElements = r3
                long r0 = r2.totalCount
                long r3 = (long) r4
                long r0 = r0 + r3
                r2.totalCount = r0
                return r2
        }

        private int balanceFactor() {
                r2 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                int r0 = height(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r2.right
                int r1 = height(r1)
                int r0 = r0 - r1
                return r0
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private com.google.common.collect.TreeMultiset.AvlNode<E> ceiling(java.util.Comparator<? super E> r2, E r3) {
                r1 = this;
                E r0 = r1.elem
                int r0 = r2.compare(r3, r0)
                if (r0 >= 0) goto L18
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.left
                if (r0 != 0) goto Ld
                goto L1a
            Ld:
                com.google.common.collect.TreeMultiset$AvlNode r2 = r0.ceiling(r2, r3)
                java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r1)
                com.google.common.collect.TreeMultiset$AvlNode r2 = (com.google.common.collect.TreeMultiset.AvlNode) r2
                return r2
            L18:
                if (r0 != 0) goto L1b
            L1a:
                return r1
            L1b:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.right
                if (r0 != 0) goto L21
                r2 = 0
                return r2
            L21:
                com.google.common.collect.TreeMultiset$AvlNode r2 = r0.ceiling(r2, r3)
                return r2
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> deleteMe() {
                r6 = this;
                int r0 = r6.elemCount
                r1 = 0
                r6.elemCount = r1
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r6.pred
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.succ
                com.google.common.collect.TreeMultiset.access$1800(r1, r2)
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r6.left
                if (r1 != 0) goto L13
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r6.right
                return r0
            L13:
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.right
                if (r2 != 0) goto L18
                return r1
            L18:
                int r3 = r1.height
                int r4 = r2.height
                if (r3 < r4) goto L3b
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.pred
                com.google.common.collect.TreeMultiset$AvlNode r1 = r1.removeMax(r2)
                r2.left = r1
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r6.right
                r2.right = r1
                int r1 = r6.distinctElements
                int r1 = r1 + (-1)
                r2.distinctElements = r1
                long r3 = r6.totalCount
                long r0 = (long) r0
                long r3 = r3 - r0
                r2.totalCount = r3
                com.google.common.collect.TreeMultiset$AvlNode r0 = r2.rebalance()
                return r0
            L3b:
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r6.succ
                com.google.common.collect.TreeMultiset$AvlNode r2 = r2.removeMin(r1)
                r1.right = r2
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r6.left
                r1.left = r2
                int r2 = r6.distinctElements
                int r2 = r2 + (-1)
                r1.distinctElements = r2
                long r2 = r6.totalCount
                long r4 = (long) r0
                long r2 = r2 - r4
                r1.totalCount = r2
                com.google.common.collect.TreeMultiset$AvlNode r0 = r1.rebalance()
                return r0
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private com.google.common.collect.TreeMultiset.AvlNode<E> floor(java.util.Comparator<? super E> r2, E r3) {
                r1 = this;
                E r0 = r1.elem
                int r0 = r2.compare(r3, r0)
                if (r0 <= 0) goto L18
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.right
                if (r0 != 0) goto Ld
                goto L1a
            Ld:
                com.google.common.collect.TreeMultiset$AvlNode r2 = r0.floor(r2, r3)
                java.lang.Object r2 = com.google.common.base.MoreObjects.firstNonNull(r2, r1)
                com.google.common.collect.TreeMultiset$AvlNode r2 = (com.google.common.collect.TreeMultiset.AvlNode) r2
                return r2
            L18:
                if (r0 != 0) goto L1b
            L1a:
                return r1
            L1b:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r1.left
                if (r0 != 0) goto L21
                r2 = 0
                return r2
            L21:
                com.google.common.collect.TreeMultiset$AvlNode r2 = r0.floor(r2, r3)
                return r2
        }

        private static int height(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.TreeMultiset.AvlNode<?> r0) {
                if (r0 != 0) goto L4
                r0 = 0
                return r0
            L4:
                int r0 = r0.height
                return r0
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rebalance() {
                r2 = this;
                int r0 = r2.balanceFactor()
                r1 = -2
                if (r0 == r1) goto L23
                r1 = 2
                if (r0 == r1) goto Le
                r2.recomputeHeight()
                return r2
            Le:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                int r0 = r0.balanceFactor()
                if (r0 >= 0) goto L1e
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.rotateLeft()
                r2.left = r0
            L1e:
                com.google.common.collect.TreeMultiset$AvlNode r0 = r2.rotateRight()
                return r0
            L23:
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                int r0 = r0.balanceFactor()
                if (r0 <= 0) goto L33
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.rotateRight()
                r2.right = r0
            L33:
                com.google.common.collect.TreeMultiset$AvlNode r0 = r2.rotateLeft()
                return r0
        }

        private void recompute() {
                r0 = this;
                r0.recomputeMultiset()
                r0.recomputeHeight()
                return
        }

        private void recomputeHeight() {
                r2 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                int r0 = height(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r2.right
                int r1 = height(r1)
                int r0 = java.lang.Math.max(r0, r1)
                int r0 = r0 + 1
                r2.height = r0
                return
        }

        private void recomputeMultiset() {
                r4 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r4.left
                int r0 = com.google.common.collect.TreeMultiset.distinctElements(r0)
                int r0 = r0 + 1
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r4.right
                int r1 = com.google.common.collect.TreeMultiset.distinctElements(r1)
                int r0 = r0 + r1
                r4.distinctElements = r0
                int r0 = r4.elemCount
                long r0 = (long) r0
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r4.left
                long r2 = totalCount(r2)
                long r0 = r0 + r2
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r4.right
                long r2 = totalCount(r2)
                long r0 = r0 + r2
                r4.totalCount = r0
                return
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> removeMax(com.google.common.collect.TreeMultiset.AvlNode<E> r5) {
                r4 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r4.right
                if (r0 != 0) goto L7
                com.google.common.collect.TreeMultiset$AvlNode<E> r5 = r4.left
                return r5
            L7:
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.removeMax(r5)
                r4.right = r0
                int r0 = r4.distinctElements
                int r0 = r0 + (-1)
                r4.distinctElements = r0
                long r0 = r4.totalCount
                int r5 = r5.elemCount
                long r2 = (long) r5
                long r0 = r0 - r2
                r4.totalCount = r0
                com.google.common.collect.TreeMultiset$AvlNode r5 = r4.rebalance()
                return r5
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> removeMin(com.google.common.collect.TreeMultiset.AvlNode<E> r5) {
                r4 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r4.left
                if (r0 != 0) goto L7
                com.google.common.collect.TreeMultiset$AvlNode<E> r5 = r4.right
                return r5
            L7:
                com.google.common.collect.TreeMultiset$AvlNode r0 = r0.removeMin(r5)
                r4.left = r0
                int r0 = r4.distinctElements
                int r0 = r0 + (-1)
                r4.distinctElements = r0
                long r0 = r4.totalCount
                int r5 = r5.elemCount
                long r2 = (long) r5
                long r0 = r0 - r2
                r4.totalCount = r0
                com.google.common.collect.TreeMultiset$AvlNode r5 = r4.rebalance()
                return r5
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rotateLeft() {
                r3 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.right
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.right
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r0.left
                r3.right = r1
                r0.left = r3
                long r1 = r3.totalCount
                r0.totalCount = r1
                int r1 = r3.distinctElements
                r0.distinctElements = r1
                r3.recompute()
                r0.recomputeHeight()
                return r0
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rotateRight() {
                r3 = this;
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.left
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.base.Preconditions.checkState(r0)
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.left
                com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r0.right
                r3.left = r1
                r0.right = r3
                long r1 = r3.totalCount
                r0.totalCount = r1
                int r1 = r3.distinctElements
                r0.distinctElements = r1
                r3.recompute()
                r0.recomputeHeight()
                return r0
        }

        private static long totalCount(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.TreeMultiset.AvlNode<?> r2) {
                if (r2 != 0) goto L5
                r0 = 0
                return r0
            L5:
                long r0 = r2.totalCount
                return r0
        }

        com.google.common.collect.TreeMultiset.AvlNode<E> add(java.util.Comparator<? super E> r8, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r9, int r10, int[] r11) {
                r7 = this;
                E r0 = r7.elem
                int r0 = r8.compare(r9, r0)
                r1 = 1
                r2 = 0
                if (r0 >= 0) goto L36
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r7.left
                if (r0 != 0) goto L15
                r11[r2] = r2
                com.google.common.collect.TreeMultiset$AvlNode r8 = r7.addLeftChild(r9, r10)
                return r8
            L15:
                int r3 = r0.height
                com.google.common.collect.TreeMultiset$AvlNode r8 = r0.add(r8, r9, r10, r11)
                r7.left = r8
                r9 = r11[r2]
                if (r9 != 0) goto L26
                int r9 = r7.distinctElements
                int r9 = r9 + r1
                r7.distinctElements = r9
            L26:
                long r0 = r7.totalCount
                long r9 = (long) r10
                long r0 = r0 + r9
                r7.totalCount = r0
                int r8 = r8.height
                if (r8 != r3) goto L31
                goto L5e
            L31:
                com.google.common.collect.TreeMultiset$AvlNode r8 = r7.rebalance()
                return r8
            L36:
                if (r0 <= 0) goto L64
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r7.right
                if (r0 != 0) goto L43
                r11[r2] = r2
                com.google.common.collect.TreeMultiset$AvlNode r8 = r7.addRightChild(r9, r10)
                return r8
            L43:
                int r3 = r0.height
                com.google.common.collect.TreeMultiset$AvlNode r8 = r0.add(r8, r9, r10, r11)
                r7.right = r8
                r9 = r11[r2]
                if (r9 != 0) goto L54
                int r9 = r7.distinctElements
                int r9 = r9 + r1
                r7.distinctElements = r9
            L54:
                long r0 = r7.totalCount
                long r9 = (long) r10
                long r0 = r0 + r9
                r7.totalCount = r0
                int r8 = r8.height
                if (r8 != r3) goto L5f
            L5e:
                return r7
            L5f:
                com.google.common.collect.TreeMultiset$AvlNode r8 = r7.rebalance()
                return r8
            L64:
                int r8 = r7.elemCount
                r11[r2] = r8
                long r8 = (long) r8
                long r3 = (long) r10
                long r8 = r8 + r3
                r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r11 > 0) goto L73
                goto L74
            L73:
                r1 = 0
            L74:
                com.google.common.base.Preconditions.checkArgument(r1)
                int r8 = r7.elemCount
                int r8 = r8 + r10
                r7.elemCount = r8
                long r8 = r7.totalCount
                long r8 = r8 + r3
                r7.totalCount = r8
                return r7
        }

        public int count(java.util.Comparator<? super E> r3, E r4) {
                r2 = this;
                E r0 = r2.elem
                int r0 = r3.compare(r4, r0)
                r1 = 0
                if (r0 >= 0) goto L13
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                if (r0 != 0) goto Le
                return r1
            Le:
                int r3 = r0.count(r3, r4)
                return r3
            L13:
                if (r0 <= 0) goto L1f
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                if (r0 != 0) goto L1a
                return r1
            L1a:
                int r3 = r0.count(r3, r4)
                return r3
            L1f:
                int r3 = r2.elemCount
                return r3
        }

        int getCount() {
                r1 = this;
                int r0 = r1.elemCount
                return r0
        }

        E getElement() {
                r1 = this;
                E r0 = r1.elem
                return r0
        }

        com.google.common.collect.TreeMultiset.AvlNode<E> remove(java.util.Comparator<? super E> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r4, int r5, int[] r6) {
                r2 = this;
                E r0 = r2.elem
                int r0 = r3.compare(r4, r0)
                r1 = 0
                if (r0 >= 0) goto L37
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                if (r0 != 0) goto L10
                r6[r1] = r1
                return r2
            L10:
                com.google.common.collect.TreeMultiset$AvlNode r3 = r0.remove(r3, r4, r5, r6)
                r2.left = r3
                r3 = r6[r1]
                if (r3 <= 0) goto L2f
                if (r5 < r3) goto L29
                int r4 = r2.distinctElements
                int r4 = r4 + (-1)
                r2.distinctElements = r4
                long r4 = r2.totalCount
                long r0 = (long) r3
                long r4 = r4 - r0
                r2.totalCount = r4
                goto L2f
            L29:
                long r0 = r2.totalCount
                long r4 = (long) r5
                long r0 = r0 - r4
                r2.totalCount = r0
            L2f:
                if (r3 != 0) goto L32
                return r2
            L32:
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.rebalance()
                return r3
            L37:
                if (r0 <= 0) goto L64
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                if (r0 != 0) goto L40
                r6[r1] = r1
                return r2
            L40:
                com.google.common.collect.TreeMultiset$AvlNode r3 = r0.remove(r3, r4, r5, r6)
                r2.right = r3
                r3 = r6[r1]
                if (r3 <= 0) goto L5f
                if (r5 < r3) goto L59
                int r4 = r2.distinctElements
                int r4 = r4 + (-1)
                r2.distinctElements = r4
                long r4 = r2.totalCount
                long r0 = (long) r3
                long r4 = r4 - r0
                r2.totalCount = r4
                goto L5f
            L59:
                long r3 = r2.totalCount
                long r5 = (long) r5
                long r3 = r3 - r5
                r2.totalCount = r3
            L5f:
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.rebalance()
                return r3
            L64:
                int r3 = r2.elemCount
                r6[r1] = r3
                if (r5 < r3) goto L6f
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.deleteMe()
                return r3
            L6f:
                int r3 = r3 - r5
                r2.elemCount = r3
                long r3 = r2.totalCount
                long r5 = (long) r5
                long r3 = r3 - r5
                r2.totalCount = r3
                return r2
        }

        com.google.common.collect.TreeMultiset.AvlNode<E> setCount(java.util.Comparator<? super E> r9, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r10, int r11, int r12, int[] r13) {
                r8 = this;
                E r0 = r8.elem
                int r0 = r9.compare(r10, r0)
                r1 = 0
                if (r0 >= 0) goto L49
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r8.left
                if (r2 != 0) goto L18
                r13[r1] = r1
                if (r11 != 0) goto La2
                if (r12 <= 0) goto La2
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.addLeftChild(r10, r12)
                return r9
            L18:
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                com.google.common.collect.TreeMultiset$AvlNode r9 = r2.setCount(r3, r4, r5, r6, r7)
                r8.left = r9
                r9 = r7[r1]
                if (r9 != r5) goto L44
                if (r6 != 0) goto L32
                if (r9 == 0) goto L32
                int r10 = r8.distinctElements
                int r10 = r10 + (-1)
                r8.distinctElements = r10
                goto L3c
            L32:
                if (r6 <= 0) goto L3c
                if (r9 != 0) goto L3c
                int r10 = r8.distinctElements
                int r10 = r10 + 1
                r8.distinctElements = r10
            L3c:
                long r10 = r8.totalCount
                int r12 = r6 - r9
                long r12 = (long) r12
                long r10 = r10 + r12
                r8.totalCount = r10
            L44:
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.rebalance()
                return r9
            L49:
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                if (r0 <= 0) goto L8b
                com.google.common.collect.TreeMultiset$AvlNode<E> r2 = r8.right
                if (r2 != 0) goto L5f
                r7[r1] = r1
                if (r5 != 0) goto La2
                if (r6 <= 0) goto La2
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.addRightChild(r4, r6)
                return r9
            L5f:
                com.google.common.collect.TreeMultiset$AvlNode r9 = r2.setCount(r3, r4, r5, r6, r7)
                r8.right = r9
                r9 = r7[r1]
                if (r9 != r5) goto L86
                if (r6 != 0) goto L74
                if (r9 == 0) goto L74
                int r10 = r8.distinctElements
                int r10 = r10 + (-1)
                r8.distinctElements = r10
                goto L7e
            L74:
                if (r6 <= 0) goto L7e
                if (r9 != 0) goto L7e
                int r10 = r8.distinctElements
                int r10 = r10 + 1
                r8.distinctElements = r10
            L7e:
                long r10 = r8.totalCount
                int r12 = r6 - r9
                long r12 = (long) r12
                long r10 = r10 + r12
                r8.totalCount = r10
            L86:
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.rebalance()
                return r9
            L8b:
                int r9 = r8.elemCount
                r7[r1] = r9
                if (r5 != r9) goto La2
                if (r6 != 0) goto L98
                com.google.common.collect.TreeMultiset$AvlNode r9 = r8.deleteMe()
                return r9
            L98:
                long r10 = r8.totalCount
                int r12 = r6 - r9
                long r12 = (long) r12
                long r10 = r10 + r12
                r8.totalCount = r10
                r8.elemCount = r6
            La2:
                return r8
        }

        com.google.common.collect.TreeMultiset.AvlNode<E> setCount(java.util.Comparator<? super E> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r4, int r5, int[] r6) {
                r2 = this;
                E r0 = r2.elem
                int r0 = r3.compare(r4, r0)
                r1 = 0
                if (r0 >= 0) goto L43
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.left
                if (r0 != 0) goto L16
                r6[r1] = r1
                if (r5 <= 0) goto L52
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.addLeftChild(r4, r5)
                return r3
            L16:
                com.google.common.collect.TreeMultiset$AvlNode r3 = r0.setCount(r3, r4, r5, r6)
                r2.left = r3
                if (r5 != 0) goto L29
                r3 = r6[r1]
                if (r3 == 0) goto L29
                int r3 = r2.distinctElements
                int r3 = r3 + (-1)
                r2.distinctElements = r3
                goto L35
            L29:
                if (r5 <= 0) goto L35
                r3 = r6[r1]
                if (r3 != 0) goto L35
                int r3 = r2.distinctElements
                int r3 = r3 + 1
                r2.distinctElements = r3
            L35:
                long r3 = r2.totalCount
                r6 = r6[r1]
                int r5 = r5 - r6
                long r5 = (long) r5
                long r3 = r3 + r5
                r2.totalCount = r3
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.rebalance()
                return r3
            L43:
                if (r0 <= 0) goto L80
                com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r2.right
                if (r0 != 0) goto L53
                r6[r1] = r1
                if (r5 <= 0) goto L52
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.addRightChild(r4, r5)
                return r3
            L52:
                return r2
            L53:
                com.google.common.collect.TreeMultiset$AvlNode r3 = r0.setCount(r3, r4, r5, r6)
                r2.right = r3
                if (r5 != 0) goto L66
                r3 = r6[r1]
                if (r3 == 0) goto L66
                int r3 = r2.distinctElements
                int r3 = r3 + (-1)
                r2.distinctElements = r3
                goto L72
            L66:
                if (r5 <= 0) goto L72
                r3 = r6[r1]
                if (r3 != 0) goto L72
                int r3 = r2.distinctElements
                int r3 = r3 + 1
                r2.distinctElements = r3
            L72:
                long r3 = r2.totalCount
                r6 = r6[r1]
                int r5 = r5 - r6
                long r5 = (long) r5
                long r3 = r3 + r5
                r2.totalCount = r3
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.rebalance()
                return r3
            L80:
                int r3 = r2.elemCount
                r6[r1] = r3
                if (r5 != 0) goto L8b
                com.google.common.collect.TreeMultiset$AvlNode r3 = r2.deleteMe()
                return r3
            L8b:
                long r0 = r2.totalCount
                int r3 = r5 - r3
                long r3 = (long) r3
                long r0 = r0 + r3
                r2.totalCount = r0
                r2.elemCount = r5
                return r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.Object r0 = r2.getElement()
                int r1 = r2.getCount()
                com.google.common.collect.Multiset$Entry r0 = com.google.common.collect.Multisets.immutableEntry(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Reference<T> {

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private T value;

        private Reference() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Reference(com.google.common.collect.TreeMultiset.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void checkAndSet(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r2, T r3) {
                r1 = this;
                T r0 = r1.value
                if (r0 != r2) goto L7
                r1.value = r3
                return
            L7:
                java.util.ConcurrentModificationException r2 = new java.util.ConcurrentModificationException
                r2.<init>()
                throw r2
        }

        void clear() {
                r1 = this;
                r0 = 0
                r1.value = r0
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public T get() {
                r1 = this;
                T r0 = r1.value
                return r0
        }
    }

    TreeMultiset(com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> r2, com.google.common.collect.GeneralRange<E> r3, com.google.common.collect.TreeMultiset.AvlNode<E> r4) {
            r1 = this;
            java.util.Comparator r0 = r3.comparator()
            r1.<init>(r0)
            r1.rootReference = r2
            r1.range = r3
            r1.header = r4
            return
    }

    TreeMultiset(java.util.Comparator<? super E> r3) {
            r2 = this;
            r2.<init>(r3)
            com.google.common.collect.GeneralRange r3 = com.google.common.collect.GeneralRange.all(r3)
            r2.range = r3
            com.google.common.collect.TreeMultiset$AvlNode r3 = new com.google.common.collect.TreeMultiset$AvlNode
            r0 = 1
            r1 = 0
            r3.<init>(r1, r0)
            r2.header = r3
            successor(r3, r3)
            com.google.common.collect.TreeMultiset$Reference r3 = new com.google.common.collect.TreeMultiset$Reference
            r3.<init>(r1)
            r2.rootReference = r3
            return
    }

    static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1200(com.google.common.collect.TreeMultiset r0) {
            com.google.common.collect.TreeMultiset$AvlNode r0 = r0.firstNode()
            return r0
    }

    static /* synthetic */ com.google.common.collect.GeneralRange access$1300(com.google.common.collect.TreeMultiset r0) {
            com.google.common.collect.GeneralRange<E> r0 = r0.range
            return r0
    }

    static /* synthetic */ com.google.common.collect.Multiset.Entry access$1400(com.google.common.collect.TreeMultiset r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
            com.google.common.collect.Multiset$Entry r0 = r0.wrapEntry(r1)
            return r0
    }

    static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1500(com.google.common.collect.TreeMultiset r0) {
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r0.header
            return r0
    }

    static /* synthetic */ com.google.common.collect.TreeMultiset.AvlNode access$1600(com.google.common.collect.TreeMultiset r0) {
            com.google.common.collect.TreeMultiset$AvlNode r0 = r0.lastNode()
            return r0
    }

    static /* synthetic */ void access$1700(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1, com.google.common.collect.TreeMultiset.AvlNode r2) {
            successor(r0, r1, r2)
            return
    }

    static /* synthetic */ void access$1800(com.google.common.collect.TreeMultiset.AvlNode r0, com.google.common.collect.TreeMultiset.AvlNode r1) {
            successor(r0, r1)
            return
    }

    private long aggregateAboveRange(com.google.common.collect.TreeMultiset.Aggregate r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.TreeMultiset.AvlNode<E> r6) {
            r4 = this;
            if (r6 != 0) goto L5
            r5 = 0
            return r5
        L5:
            java.util.Comparator r0 = r4.comparator()
            com.google.common.collect.GeneralRange<E> r1 = r4.range
            java.lang.Object r1 = r1.getUpperEndpoint()
            java.lang.Object r2 = com.google.common.collect.TreeMultiset.AvlNode.access$500(r6)
            int r0 = r0.compare(r1, r2)
            if (r0 <= 0) goto L22
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r6)
            long r5 = r4.aggregateAboveRange(r5, r6)
            return r5
        L22:
            if (r0 != 0) goto L56
            int[] r0 = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType
            com.google.common.collect.GeneralRange<E> r1 = r4.range
            com.google.common.collect.BoundType r1 = r1.getUpperBoundType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L47
            r1 = 2
            if (r0 != r1) goto L41
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r6)
            long r5 = r5.treeAggregate(r6)
            return r5
        L41:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L47:
            int r0 = r5.nodeAggregate(r6)
            long r0 = (long) r0
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r6)
            long r5 = r5.treeAggregate(r6)
        L54:
            long r0 = r0 + r5
            return r0
        L56:
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r6)
            long r0 = r5.treeAggregate(r0)
            int r2 = r5.nodeAggregate(r6)
            long r2 = (long) r2
            long r0 = r0 + r2
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r5 = r4.aggregateAboveRange(r5, r6)
            goto L54
    }

    private long aggregateBelowRange(com.google.common.collect.TreeMultiset.Aggregate r5, @org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.TreeMultiset.AvlNode<E> r6) {
            r4 = this;
            if (r6 != 0) goto L5
            r5 = 0
            return r5
        L5:
            java.util.Comparator r0 = r4.comparator()
            com.google.common.collect.GeneralRange<E> r1 = r4.range
            java.lang.Object r1 = r1.getLowerEndpoint()
            java.lang.Object r2 = com.google.common.collect.TreeMultiset.AvlNode.access$500(r6)
            int r0 = r0.compare(r1, r2)
            if (r0 >= 0) goto L22
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r5 = r4.aggregateBelowRange(r5, r6)
            return r5
        L22:
            if (r0 != 0) goto L56
            int[] r0 = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType
            com.google.common.collect.GeneralRange<E> r1 = r4.range
            com.google.common.collect.BoundType r1 = r1.getLowerBoundType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L47
            r1 = 2
            if (r0 != r1) goto L41
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r5 = r5.treeAggregate(r6)
            return r5
        L41:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L47:
            int r0 = r5.nodeAggregate(r6)
            long r0 = (long) r0
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r5 = r5.treeAggregate(r6)
        L54:
            long r0 = r0 + r5
            return r0
        L56:
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$600(r6)
            long r0 = r5.treeAggregate(r0)
            int r2 = r5.nodeAggregate(r6)
            long r2 = (long) r2
            long r0 = r0 + r2
            com.google.common.collect.TreeMultiset$AvlNode r6 = com.google.common.collect.TreeMultiset.AvlNode.access$700(r6)
            long r5 = r4.aggregateBelowRange(r5, r6)
            goto L54
    }

    private long aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate r6) {
            r5 = this;
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r5.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            long r1 = r6.treeAggregate(r0)
            com.google.common.collect.GeneralRange<E> r3 = r5.range
            boolean r3 = r3.hasLowerBound()
            if (r3 == 0) goto L19
            long r3 = r5.aggregateBelowRange(r6, r0)
            long r1 = r1 - r3
        L19:
            com.google.common.collect.GeneralRange<E> r3 = r5.range
            boolean r3 = r3.hasUpperBound()
            if (r3 == 0) goto L26
            long r3 = r5.aggregateAboveRange(r6, r0)
            long r1 = r1 - r3
        L26:
            return r1
    }

    public static <E extends java.lang.Comparable> com.google.common.collect.TreeMultiset<E> create() {
            com.google.common.collect.TreeMultiset r0 = new com.google.common.collect.TreeMultiset
            com.google.common.collect.Ordering r1 = com.google.common.collect.Ordering.natural()
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Comparable> com.google.common.collect.TreeMultiset<E> create(java.lang.Iterable<? extends E> r1) {
            com.google.common.collect.TreeMultiset r0 = create()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    public static <E> com.google.common.collect.TreeMultiset<E> create(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<? super E> r1) {
            if (r1 != 0) goto Lc
            com.google.common.collect.TreeMultiset r1 = new com.google.common.collect.TreeMultiset
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            r1.<init>(r0)
            return r1
        Lc:
            com.google.common.collect.TreeMultiset r0 = new com.google.common.collect.TreeMultiset
            r0.<init>(r1)
            return r0
    }

    static int distinctElements(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.collect.TreeMultiset.AvlNode<?> r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = com.google.common.collect.TreeMultiset.AvlNode.access$400(r0)
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private com.google.common.collect.TreeMultiset.AvlNode<E> firstNode() {
            r5 = this;
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r5.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.google.common.collect.GeneralRange<E> r0 = r5.range
            boolean r0 = r0.hasLowerBound()
            if (r0 == 0) goto L4a
            com.google.common.collect.GeneralRange<E> r0 = r5.range
            java.lang.Object r0 = r0.getLowerEndpoint()
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r2 = r5.rootReference
            java.lang.Object r2 = r2.get()
            com.google.common.collect.TreeMultiset$AvlNode r2 = (com.google.common.collect.TreeMultiset.AvlNode) r2
            java.util.Comparator r3 = r5.comparator()
            com.google.common.collect.TreeMultiset$AvlNode r2 = com.google.common.collect.TreeMultiset.AvlNode.access$1000(r2, r3, r0)
            if (r2 != 0) goto L2d
            return r1
        L2d:
            com.google.common.collect.GeneralRange<E> r3 = r5.range
            com.google.common.collect.BoundType r3 = r3.getLowerBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L50
            java.util.Comparator r3 = r5.comparator()
            java.lang.Object r4 = r2.getElement()
            int r0 = r3.compare(r0, r4)
            if (r0 != 0) goto L50
            com.google.common.collect.TreeMultiset$AvlNode r2 = com.google.common.collect.TreeMultiset.AvlNode.access$800(r2)
            goto L50
        L4a:
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r5.header
            com.google.common.collect.TreeMultiset$AvlNode r2 = com.google.common.collect.TreeMultiset.AvlNode.access$800(r0)
        L50:
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r5.header
            if (r2 == r0) goto L62
            com.google.common.collect.GeneralRange<E> r0 = r5.range
            java.lang.Object r3 = r2.getElement()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L61
            goto L62
        L61:
            return r2
        L62:
            return r1
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private com.google.common.collect.TreeMultiset.AvlNode<E> lastNode() {
            r5 = this;
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r5.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.google.common.collect.GeneralRange<E> r0 = r5.range
            boolean r0 = r0.hasUpperBound()
            if (r0 == 0) goto L4a
            com.google.common.collect.GeneralRange<E> r0 = r5.range
            java.lang.Object r0 = r0.getUpperEndpoint()
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r2 = r5.rootReference
            java.lang.Object r2 = r2.get()
            com.google.common.collect.TreeMultiset$AvlNode r2 = (com.google.common.collect.TreeMultiset.AvlNode) r2
            java.util.Comparator r3 = r5.comparator()
            com.google.common.collect.TreeMultiset$AvlNode r2 = com.google.common.collect.TreeMultiset.AvlNode.access$1100(r2, r3, r0)
            if (r2 != 0) goto L2d
            return r1
        L2d:
            com.google.common.collect.GeneralRange<E> r3 = r5.range
            com.google.common.collect.BoundType r3 = r3.getUpperBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L50
            java.util.Comparator r3 = r5.comparator()
            java.lang.Object r4 = r2.getElement()
            int r0 = r3.compare(r0, r4)
            if (r0 != 0) goto L50
            com.google.common.collect.TreeMultiset$AvlNode r2 = com.google.common.collect.TreeMultiset.AvlNode.access$900(r2)
            goto L50
        L4a:
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r5.header
            com.google.common.collect.TreeMultiset$AvlNode r2 = com.google.common.collect.TreeMultiset.AvlNode.access$900(r0)
        L50:
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r5.header
            if (r2 == r0) goto L62
            com.google.common.collect.GeneralRange<E> r0 = r5.range
            java.lang.Object r3 = r2.getElement()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L61
            goto L62
        L61:
            return r2
        L62:
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            r4 = this;
            r5.defaultReadObject()
            java.lang.Object r0 = r5.readObject()
            java.util.Comparator r0 = (java.util.Comparator) r0
            java.lang.Class<com.google.common.collect.AbstractSortedMultiset> r1 = com.google.common.collect.AbstractSortedMultiset.class
            java.lang.String r2 = "comparator"
            com.google.common.collect.Serialization$FieldSetter r1 = com.google.common.collect.Serialization.getFieldSetter(r1, r2)
            r1.set(r4, r0)
            java.lang.String r1 = "range"
            java.lang.Class<com.google.common.collect.TreeMultiset> r2 = com.google.common.collect.TreeMultiset.class
            com.google.common.collect.Serialization$FieldSetter r1 = com.google.common.collect.Serialization.getFieldSetter(r2, r1)
            com.google.common.collect.GeneralRange r0 = com.google.common.collect.GeneralRange.all(r0)
            r1.set(r4, r0)
            java.lang.String r0 = "rootReference"
            com.google.common.collect.Serialization$FieldSetter r0 = com.google.common.collect.Serialization.getFieldSetter(r2, r0)
            com.google.common.collect.TreeMultiset$Reference r1 = new com.google.common.collect.TreeMultiset$Reference
            r3 = 0
            r1.<init>(r3)
            r0.set(r4, r1)
            com.google.common.collect.TreeMultiset$AvlNode r0 = new com.google.common.collect.TreeMultiset$AvlNode
            r1 = 1
            r0.<init>(r3, r1)
            java.lang.String r1 = "header"
            com.google.common.collect.Serialization$FieldSetter r1 = com.google.common.collect.Serialization.getFieldSetter(r2, r1)
            r1.set(r4, r0)
            successor(r0, r0)
            com.google.common.collect.Serialization.populateMultiset(r4, r5)
            return
    }

    private static <T> void successor(com.google.common.collect.TreeMultiset.AvlNode<T> r0, com.google.common.collect.TreeMultiset.AvlNode<T> r1) {
            com.google.common.collect.TreeMultiset.AvlNode.access$802(r0, r1)
            com.google.common.collect.TreeMultiset.AvlNode.access$902(r1, r0)
            return
    }

    private static <T> void successor(com.google.common.collect.TreeMultiset.AvlNode<T> r0, com.google.common.collect.TreeMultiset.AvlNode<T> r1, com.google.common.collect.TreeMultiset.AvlNode<T> r2) {
            successor(r0, r1)
            successor(r1, r2)
            return
    }

    private com.google.common.collect.Multiset.Entry<E> wrapEntry(com.google.common.collect.TreeMultiset.AvlNode<E> r2) {
            r1 = this;
            com.google.common.collect.TreeMultiset$1 r0 = new com.google.common.collect.TreeMultiset$1
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            r2.defaultWriteObject()
            java.util.NavigableSet r0 = r1.elementSet()
            java.util.Comparator r0 = r0.comparator()
            r2.writeObject(r0)
            com.google.common.collect.Serialization.writeMultiset(r1, r2)
            return
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int add(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r5, int r6) {
            r4 = this;
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            if (r6 != 0) goto Lc
            int r5 = r4.count(r5)
            return r5
        Lc:
            com.google.common.collect.GeneralRange<E> r0 = r4.range
            boolean r0 = r0.contains(r5)
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r4.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r1 = 0
            if (r0 != 0) goto L37
            java.util.Comparator r2 = r4.comparator()
            r2.compare(r5, r5)
            com.google.common.collect.TreeMultiset$AvlNode r2 = new com.google.common.collect.TreeMultiset$AvlNode
            r2.<init>(r5, r6)
            com.google.common.collect.TreeMultiset$AvlNode<E> r5 = r4.header
            successor(r5, r2, r5)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r5 = r4.rootReference
            r5.checkAndSet(r0, r2)
            return r1
        L37:
            r2 = 1
            int[] r2 = new int[r2]
            java.util.Comparator r3 = r4.comparator()
            com.google.common.collect.TreeMultiset$AvlNode r5 = r0.add(r3, r5, r6, r2)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r6 = r4.rootReference
            r6.checkAndSet(r0, r5)
            r5 = r2[r1]
            return r5
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r3 = this;
            com.google.common.collect.GeneralRange<E> r0 = r3.range
            boolean r0 = r0.hasLowerBound()
            if (r0 != 0) goto L3a
            com.google.common.collect.GeneralRange<E> r0 = r3.range
            boolean r0 = r0.hasUpperBound()
            if (r0 != 0) goto L3a
            com.google.common.collect.TreeMultiset$AvlNode<E> r0 = r3.header
            com.google.common.collect.TreeMultiset$AvlNode r0 = com.google.common.collect.TreeMultiset.AvlNode.access$800(r0)
        L16:
            com.google.common.collect.TreeMultiset$AvlNode<E> r1 = r3.header
            if (r0 == r1) goto L31
            com.google.common.collect.TreeMultiset$AvlNode r1 = com.google.common.collect.TreeMultiset.AvlNode.access$800(r0)
            r2 = 0
            com.google.common.collect.TreeMultiset.AvlNode.access$202(r0, r2)
            r2 = 0
            com.google.common.collect.TreeMultiset.AvlNode.access$602(r0, r2)
            com.google.common.collect.TreeMultiset.AvlNode.access$702(r0, r2)
            com.google.common.collect.TreeMultiset.AvlNode.access$902(r0, r2)
            com.google.common.collect.TreeMultiset.AvlNode.access$802(r0, r2)
            r0 = r1
            goto L16
        L31:
            successor(r1, r1)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r3.rootReference
            r0.clear()
            return
        L3a:
            java.util.Iterator r0 = r3.entryIterator()
            com.google.common.collect.Iterators.clear(r0)
            return
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Comparator comparator() {
            r1 = this;
            java.util.Comparator r0 = super.comparator()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // com.google.common.collect.Multiset
    public int count(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            r0 = 0
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r1 = r3.rootReference     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            com.google.common.collect.TreeMultiset$AvlNode r1 = (com.google.common.collect.TreeMultiset.AvlNode) r1     // Catch: java.lang.Throwable -> L1d
            com.google.common.collect.GeneralRange<E> r2 = r3.range     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            if (r1 != 0) goto L14
            goto L1d
        L14:
            java.util.Comparator r2 = r3.comparator()     // Catch: java.lang.Throwable -> L1d
            int r4 = r1.count(r2, r4)     // Catch: java.lang.Throwable -> L1d
            return r4
        L1d:
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> descendingEntryIterator() {
            r1 = this;
            com.google.common.collect.TreeMultiset$3 r0 = new com.google.common.collect.TreeMultiset$3
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset descendingMultiset() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = super.descendingMultiset()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
            r2 = this;
            com.google.common.collect.TreeMultiset$Aggregate r0 = com.google.common.collect.TreeMultiset.Aggregate.DISTINCT
            long r0 = r2.aggregateForEntries(r0)
            int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Iterator<E> elementIterator() {
            r1 = this;
            java.util.Iterator r0 = r1.entryIterator()
            java.util.Iterator r0 = com.google.common.collect.Multisets.elementIterator(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.NavigableSet elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = super.elementSet()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
            r1 = this;
            com.google.common.collect.TreeMultiset$2 r0 = new com.google.common.collect.TreeMultiset$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry firstEntry() {
            r1 = this;
            com.google.common.collect.Multiset$Entry r0 = super.firstEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r5, com.google.common.collect.BoundType r6) {
            r4 = this;
            com.google.common.collect.TreeMultiset r0 = new com.google.common.collect.TreeMultiset
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r1 = r4.rootReference
            com.google.common.collect.GeneralRange<E> r2 = r4.range
            java.util.Comparator r3 = r4.comparator()
            com.google.common.collect.GeneralRange r5 = com.google.common.collect.GeneralRange.upTo(r3, r5, r6)
            com.google.common.collect.GeneralRange r5 = r2.intersect(r5)
            com.google.common.collect.TreeMultiset$AvlNode<E> r6 = r4.header
            r0.<init>(r1, r5, r6)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
            r1 = this;
            boolean r0 = super.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Iterator r0 = com.google.common.collect.Multisets.iteratorImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry lastEntry() {
            r1 = this;
            com.google.common.collect.Multiset$Entry r0 = super.lastEntry()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry pollFirstEntry() {
            r1 = this;
            com.google.common.collect.Multiset$Entry r0 = super.pollFirstEntry()
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry pollLastEntry() {
            r1 = this;
            com.google.common.collect.Multiset$Entry r0 = super.pollLastEntry()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5, int r6) {
            r4 = this;
            java.lang.String r0 = "occurrences"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            if (r6 != 0) goto Lc
            int r5 = r4.count(r5)
            return r5
        Lc:
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r4.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            com.google.common.collect.GeneralRange<E> r3 = r4.range     // Catch: java.lang.Throwable -> L33
            boolean r3 = r3.contains(r5)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L33
            if (r0 != 0) goto L23
            goto L33
        L23:
            java.util.Comparator r3 = r4.comparator()     // Catch: java.lang.Throwable -> L33
            com.google.common.collect.TreeMultiset$AvlNode r5 = r0.remove(r3, r5, r6, r1)     // Catch: java.lang.Throwable -> L33
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r6 = r4.rootReference
            r6.checkAndSet(r0, r5)
            r5 = r1[r2]
            return r5
        L33:
            return r2
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int setCount(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r5, int r6) {
            r4 = this;
            java.lang.String r0 = "count"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r6, r0)
            com.google.common.collect.GeneralRange<E> r0 = r4.range
            boolean r0 = r0.contains(r5)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            if (r6 != 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            com.google.common.base.Preconditions.checkArgument(r1)
            return r2
        L17:
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r4.rootReference
            java.lang.Object r0 = r0.get()
            com.google.common.collect.TreeMultiset$AvlNode r0 = (com.google.common.collect.TreeMultiset.AvlNode) r0
            if (r0 != 0) goto L27
            if (r6 <= 0) goto L26
            r4.add(r5, r6)
        L26:
            return r2
        L27:
            int[] r1 = new int[r1]
            java.util.Comparator r3 = r4.comparator()
            com.google.common.collect.TreeMultiset$AvlNode r5 = r0.setCount(r3, r5, r6, r1)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r6 = r4.rootReference
            r6.checkAndSet(r0, r5)
            r5 = r1[r2]
            return r5
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setCount(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r9, int r10, int r11) {
            r8 = this;
            java.lang.String r0 = "newCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r11, r0)
            java.lang.String r0 = "oldCount"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r10, r0)
            com.google.common.collect.GeneralRange<E> r0 = r8.range
            boolean r0 = r0.contains(r9)
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r0 = r8.rootReference
            java.lang.Object r0 = r0.get()
            r1 = r0
            com.google.common.collect.TreeMultiset$AvlNode r1 = (com.google.common.collect.TreeMultiset.AvlNode) r1
            r0 = 0
            r7 = 1
            if (r1 != 0) goto L29
            if (r10 != 0) goto L28
            if (r11 <= 0) goto L27
            r8.add(r9, r11)
        L27:
            return r7
        L28:
            return r0
        L29:
            int[] r6 = new int[r7]
            java.util.Comparator r2 = r8.comparator()
            r3 = r9
            r4 = r10
            r5 = r11
            com.google.common.collect.TreeMultiset$AvlNode r9 = r1.setCount(r2, r3, r4, r5, r6)
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r10 = r8.rootReference
            r10.checkAndSet(r1, r9)
            r9 = r6[r0]
            if (r9 != r4) goto L40
            return r7
        L40:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
            r2 = this;
            com.google.common.collect.TreeMultiset$Aggregate r0 = com.google.common.collect.TreeMultiset.Aggregate.SIZE
            long r0 = r2.aggregateForEntries(r0)
            int r0 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset subMultiset(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, com.google.common.collect.BoundType r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3, com.google.common.collect.BoundType r4) {
            r0 = this;
            com.google.common.collect.SortedMultiset r1 = super.subMultiset(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r5, com.google.common.collect.BoundType r6) {
            r4 = this;
            com.google.common.collect.TreeMultiset r0 = new com.google.common.collect.TreeMultiset
            com.google.common.collect.TreeMultiset$Reference<com.google.common.collect.TreeMultiset$AvlNode<E>> r1 = r4.rootReference
            com.google.common.collect.GeneralRange<E> r2 = r4.range
            java.util.Comparator r3 = r4.comparator()
            com.google.common.collect.GeneralRange r5 = com.google.common.collect.GeneralRange.downTo(r3, r5, r6)
            com.google.common.collect.GeneralRange r5 = r2.intersect(r5)
            com.google.common.collect.TreeMultiset$AvlNode<E> r6 = r4.header
            r0.<init>(r1, r5, r6)
            return r0
    }
}
