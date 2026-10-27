package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MoreObjects {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.base.MoreObjects$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ToStringHelper {
        private final java.lang.String className;
        private final com.google.common.base.MoreObjects.ToStringHelper.ValueHolder holderHead;
        private com.google.common.base.MoreObjects.ToStringHelper.ValueHolder holderTail;
        private boolean omitNullValues;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class ValueHolder {

            @org.checkerframework.checker.nullness.compatqual.NullableDecl
            java.lang.String name;

            @org.checkerframework.checker.nullness.compatqual.NullableDecl
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder next;

            @org.checkerframework.checker.nullness.compatqual.NullableDecl
            java.lang.Object value;

            private ValueHolder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ ValueHolder(com.google.common.base.MoreObjects.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        private ToStringHelper(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = new com.google.common.base.MoreObjects$ToStringHelper$ValueHolder
                r1 = 0
                r0.<init>(r1)
                r2.holderHead = r0
                r2.holderTail = r0
                r0 = 0
                r2.omitNullValues = r0
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.String r3 = (java.lang.String) r3
                r2.className = r3
                return
        }

        /* synthetic */ ToStringHelper(java.lang.String r1, com.google.common.base.MoreObjects.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.common.base.MoreObjects.ToStringHelper.ValueHolder addHolder() {
                r2 = this;
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = new com.google.common.base.MoreObjects$ToStringHelper$ValueHolder
                r1 = 0
                r0.<init>(r1)
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r1 = r2.holderTail
                r1.next = r0
                r2.holderTail = r0
                return r0
        }

        private com.google.common.base.MoreObjects.ToStringHelper addHolder(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = r1.addHolder()
                r0.value = r2
                return r1
        }

        private com.google.common.base.MoreObjects.ToStringHelper addHolder(java.lang.String r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
                r1 = this;
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r0 = r1.addHolder()
                r0.value = r3
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.String r2 = (java.lang.String) r2
                r0.name = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, char r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, double r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, float r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, int r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, long r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r0 = this;
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String r1, boolean r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1, r2)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(char r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(double r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(float r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(int r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(long r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
                r0 = this;
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper addValue(boolean r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.google.common.base.MoreObjects$ToStringHelper r1 = r0.addHolder(r1)
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.common.base.MoreObjects.ToStringHelper omitNullValues() {
                r1 = this;
                r0 = 1
                r1.omitNullValues = r0
                return r1
        }

        public java.lang.String toString() {
                r7 = this;
                boolean r0 = r7.omitNullValues
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = 32
                r1.<init>(r2)
                java.lang.String r2 = r7.className
                r1.append(r2)
                r2 = 123(0x7b, float:1.72E-43)
                r1.append(r2)
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r2 = r7.holderHead
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r2 = r2.next
                java.lang.String r3 = ""
            L19:
                if (r2 == 0) goto L57
                java.lang.Object r4 = r2.value
                if (r0 == 0) goto L21
                if (r4 == 0) goto L54
            L21:
                r1.append(r3)
                java.lang.String r3 = r2.name
                if (r3 == 0) goto L30
                r1.append(r3)
                r3 = 61
                r1.append(r3)
            L30:
                if (r4 == 0) goto L4f
                java.lang.Class r3 = r4.getClass()
                boolean r3 = r3.isArray()
                if (r3 == 0) goto L4f
                r3 = 1
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r6 = 0
                r5[r6] = r4
                java.lang.String r4 = java.util.Arrays.deepToString(r5)
                int r5 = r4.length()
                int r5 = r5 - r3
                r1.append(r4, r3, r5)
                goto L52
            L4f:
                r1.append(r4)
            L52:
                java.lang.String r3 = ", "
            L54:
                com.google.common.base.MoreObjects$ToStringHelper$ValueHolder r2 = r2.next
                goto L19
            L57:
                r0 = 125(0x7d, float:1.75E-43)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    private MoreObjects() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T firstNonNull(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r0, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            if (r1 == 0) goto L6
            return r1
        L6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Both parameters are null"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Class<?> r2) {
            com.google.common.base.MoreObjects$ToStringHelper r0 = new com.google.common.base.MoreObjects$ToStringHelper
            java.lang.String r2 = r2.getSimpleName()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Object r2) {
            com.google.common.base.MoreObjects$ToStringHelper r0 = new com.google.common.base.MoreObjects$ToStringHelper
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.String r2) {
            com.google.common.base.MoreObjects$ToStringHelper r0 = new com.google.common.base.MoreObjects$ToStringHelper
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
