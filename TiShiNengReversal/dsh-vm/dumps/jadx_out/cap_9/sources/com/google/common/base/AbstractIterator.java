package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractIterator<T> implements java.util.Iterator<T> {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private T next;
    private com.google.common.base.AbstractIterator.State state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.base.AbstractIterator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$base$AbstractIterator$State = null;

        static {
                com.google.common.base.AbstractIterator$State[] r0 = com.google.common.base.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.base.AbstractIterator.AnonymousClass1.$SwitchMap$com$google$common$base$AbstractIterator$State = r0
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.READY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.base.AbstractIterator.AnonymousClass1.$SwitchMap$com$google$common$base$AbstractIterator$State     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.DONE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<com.google.common.base.AbstractIterator.State> {
        private static final /* synthetic */ com.google.common.base.AbstractIterator.State[] $VALUES = null;
        public static final com.google.common.base.AbstractIterator.State DONE = null;
        public static final com.google.common.base.AbstractIterator.State FAILED = null;
        public static final com.google.common.base.AbstractIterator.State NOT_READY = null;
        public static final com.google.common.base.AbstractIterator.State READY = null;

        static {
                com.google.common.base.AbstractIterator$State r0 = new com.google.common.base.AbstractIterator$State
                java.lang.String r1 = "READY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.base.AbstractIterator.State.READY = r0
                com.google.common.base.AbstractIterator$State r1 = new com.google.common.base.AbstractIterator$State
                java.lang.String r3 = "NOT_READY"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.base.AbstractIterator.State.NOT_READY = r1
                com.google.common.base.AbstractIterator$State r3 = new com.google.common.base.AbstractIterator$State
                java.lang.String r5 = "DONE"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.common.base.AbstractIterator.State.DONE = r3
                com.google.common.base.AbstractIterator$State r5 = new com.google.common.base.AbstractIterator$State
                java.lang.String r7 = "FAILED"
                r8 = 3
                r5.<init>(r7, r8)
                com.google.common.base.AbstractIterator.State.FAILED = r5
                r7 = 4
                com.google.common.base.AbstractIterator$State[] r7 = new com.google.common.base.AbstractIterator.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.google.common.base.AbstractIterator.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.base.AbstractIterator.State valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.base.AbstractIterator$State> r0 = com.google.common.base.AbstractIterator.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.base.AbstractIterator$State r1 = (com.google.common.base.AbstractIterator.State) r1
                return r1
        }

        public static com.google.common.base.AbstractIterator.State[] values() {
                com.google.common.base.AbstractIterator$State[] r0 = com.google.common.base.AbstractIterator.State.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.base.AbstractIterator$State[] r0 = (com.google.common.base.AbstractIterator.State[]) r0
                return r0
        }
    }

    protected AbstractIterator() {
            r1 = this;
            r1.<init>()
            com.google.common.base.AbstractIterator$State r0 = com.google.common.base.AbstractIterator.State.NOT_READY
            r1.state = r0
            return
    }

    private boolean tryToComputeNext() {
            r2 = this;
            com.google.common.base.AbstractIterator$State r0 = com.google.common.base.AbstractIterator.State.FAILED
            r2.state = r0
            java.lang.Object r0 = r2.computeNext()
            r2.next = r0
            com.google.common.base.AbstractIterator$State r0 = r2.state
            com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.DONE
            if (r0 == r1) goto L16
            com.google.common.base.AbstractIterator$State r0 = com.google.common.base.AbstractIterator.State.READY
            r2.state = r0
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    protected abstract T computeNext();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    protected final T endOfData() {
            r1 = this;
            com.google.common.base.AbstractIterator$State r0 = com.google.common.base.AbstractIterator.State.DONE
            r1.state = r0
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            com.google.common.base.AbstractIterator$State r0 = r4.state
            com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.FAILED
            r2 = 0
            r3 = 1
            if (r0 == r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r0)
            int[] r0 = com.google.common.base.AbstractIterator.AnonymousClass1.$SwitchMap$com$google$common$base$AbstractIterator$State
            com.google.common.base.AbstractIterator$State r1 = r4.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto L23
            r1 = 2
            if (r0 == r1) goto L22
            boolean r0 = r4.tryToComputeNext()
            return r0
        L22:
            return r2
        L23:
            return r3
    }

    @Override // java.util.Iterator
    public final T next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L10
            com.google.common.base.AbstractIterator$State r0 = com.google.common.base.AbstractIterator.State.NOT_READY
            r2.state = r0
            T r0 = r2.next
            r1 = 0
            r2.next = r1
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
