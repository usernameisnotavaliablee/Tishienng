package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ComparisonChain {
    private static final com.google.common.collect.ComparisonChain ACTIVE = null;
    private static final com.google.common.collect.ComparisonChain GREATER = null;
    private static final com.google.common.collect.ComparisonChain LESS = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InactiveComparisonChain extends com.google.common.collect.ComparisonChain {
        final int result;

        InactiveComparisonChain(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.result = r2
                return
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(double r1, double r3) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(float r1, float r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(int r1, int r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(long r1, long r3) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Comparable r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Comparable r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> com.google.common.collect.ComparisonChain compare(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.util.Comparator<T> r3) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareFalseFirst(boolean r1, boolean r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareTrueFirst(boolean r1, boolean r2) {
                r0 = this;
                return r0
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
                r1 = this;
                int r0 = r1.result
                return r0
        }
    }

    static {
            com.google.common.collect.ComparisonChain$1 r0 = new com.google.common.collect.ComparisonChain$1
            r0.<init>()
            com.google.common.collect.ComparisonChain.ACTIVE = r0
            com.google.common.collect.ComparisonChain$InactiveComparisonChain r0 = new com.google.common.collect.ComparisonChain$InactiveComparisonChain
            r1 = -1
            r0.<init>(r1)
            com.google.common.collect.ComparisonChain.LESS = r0
            com.google.common.collect.ComparisonChain$InactiveComparisonChain r0 = new com.google.common.collect.ComparisonChain$InactiveComparisonChain
            r1 = 1
            r0.<init>(r1)
            com.google.common.collect.ComparisonChain.GREATER = r0
            return
    }

    private ComparisonChain() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ ComparisonChain(com.google.common.collect.ComparisonChain.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.common.collect.ComparisonChain access$100() {
            com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.LESS
            return r0
    }

    static /* synthetic */ com.google.common.collect.ComparisonChain access$200() {
            com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.GREATER
            return r0
    }

    static /* synthetic */ com.google.common.collect.ComparisonChain access$300() {
            com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.ACTIVE
            return r0
    }

    public static com.google.common.collect.ComparisonChain start() {
            com.google.common.collect.ComparisonChain r0 = com.google.common.collect.ComparisonChain.ACTIVE
            return r0
    }

    public abstract com.google.common.collect.ComparisonChain compare(double r1, double r3);

    public abstract com.google.common.collect.ComparisonChain compare(float r1, float r2);

    public abstract com.google.common.collect.ComparisonChain compare(int r1, int r2);

    public abstract com.google.common.collect.ComparisonChain compare(long r1, long r3);

    @java.lang.Deprecated
    public final com.google.common.collect.ComparisonChain compare(java.lang.Boolean r1, java.lang.Boolean r2) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            boolean r2 = r2.booleanValue()
            com.google.common.collect.ComparisonChain r1 = r0.compareFalseFirst(r1, r2)
            return r1
    }

    public abstract com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> r1, java.lang.Comparable<?> r2);

    public abstract <T> com.google.common.collect.ComparisonChain compare(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2, java.util.Comparator<T> r3);

    public abstract com.google.common.collect.ComparisonChain compareFalseFirst(boolean r1, boolean r2);

    public abstract com.google.common.collect.ComparisonChain compareTrueFirst(boolean r1, boolean r2);

    public abstract int result();
}
