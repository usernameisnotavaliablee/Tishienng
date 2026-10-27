package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface v {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.v a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.v {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static /* synthetic */ void c(int r4) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r4 == r2) goto Lc
                java.lang.String r3 = "descriptor"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "unresolvedSuperClasses"
                r0[r1] = r3
            L10:
                java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1"
                r0[r2] = r1
                r1 = 2
                if (r4 == r1) goto L1c
                java.lang.String r4 = "reportIncompleteHierarchy"
                r0[r1] = r4
                goto L20
            L1c:
                java.lang.String r4 = "reportCannotInferVisibility"
                r0[r1] = r4
            L20:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r4 = java.lang.String.format(r4, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r4)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.v
        public void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 2
                c(r1)
            L6:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.v
        public void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                c(r1)
            L6:
                if (r2 != 0) goto Lc
                r1 = 1
                c(r1)
            Lc:
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.v$a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a = r0
            return
    }

    void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1);

    void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r1, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r2);
}
