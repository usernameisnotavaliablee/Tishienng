package kotlin.reflect.jvm.internal.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class WrappedValues {
    private static final java.lang.Object a = null;
    public static volatile boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WrappedProcessCanceledException extends java.lang.RuntimeException {
        public WrappedProcessCanceledException(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "Rethrow stored exception"
                r1.<init>(r0, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "NULL_VALUE"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b {
        private final java.lang.Throwable a;

        private b(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
                r1 = this;
                if (r2 != 0) goto L6
                r0 = 0
                a(r0)
            L6:
                r1.<init>()
                r1.a = r2
                return
        }

        /* synthetic */ b(java.lang.Throwable r1, kotlin.reflect.jvm.internal.impl.utils.WrappedValues.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void a(int r7) {
                r0 = 1
                if (r7 == r0) goto L6
                java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L8
            L6:
                java.lang.String r1 = "@NotNull method %s.%s must not return null"
            L8:
                r2 = 2
                if (r7 == r0) goto Ld
                r3 = 3
                goto Le
            Ld:
                r3 = 2
            Le:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper"
                r5 = 0
                if (r7 == r0) goto L1a
                java.lang.String r6 = "throwable"
                r3[r5] = r6
                goto L1c
            L1a:
                r3[r5] = r4
            L1c:
                if (r7 == r0) goto L21
                r3[r0] = r4
                goto L25
            L21:
                java.lang.String r4 = "getThrowable"
                r3[r0] = r4
            L25:
                if (r7 == r0) goto L2b
                java.lang.String r4 = "<init>"
                r3[r2] = r4
            L2b:
                java.lang.String r1 = java.lang.String.format(r1, r3)
                if (r7 == r0) goto L37
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>(r1)
                goto L3c
            L37:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r7.<init>(r1)
            L3c:
                throw r7
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.Throwable b() {
                r2 = this;
                java.lang.Throwable r0 = r2.a
                if (r0 != 0) goto L8
                r1 = 1
                a(r1)
            L8:
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.Throwable r0 = r1.a
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a r0 = new kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.utils.WrappedValues.a = r0
            r0 = 0
            kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b = r0
            return
    }

    private static /* synthetic */ void a(int r8) {
            r0 = 2
            r1 = 1
            if (r8 == r1) goto L9
            if (r8 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            if (r8 == r1) goto L12
            if (r8 == r0) goto L12
            r4 = 3
            goto L13
        L12:
            r4 = 2
        L13:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues"
            r6 = 0
            if (r8 == r1) goto L28
            if (r8 == r0) goto L28
            if (r8 == r3) goto L23
            java.lang.String r7 = "value"
            r4[r6] = r7
            goto L2a
        L23:
            java.lang.String r7 = "throwable"
            r4[r6] = r7
            goto L2a
        L28:
            r4[r6] = r5
        L2a:
            if (r8 == r1) goto L31
            if (r8 == r0) goto L31
            r4[r1] = r5
            goto L35
        L31:
            java.lang.String r5 = "escapeNull"
            r4[r1] = r5
        L35:
            if (r8 == r1) goto L4c
            if (r8 == r0) goto L4c
            if (r8 == r3) goto L48
            r3 = 4
            if (r8 == r3) goto L43
            java.lang.String r3 = "unescapeNull"
            r4[r0] = r3
            goto L4c
        L43:
            java.lang.String r3 = "unescapeExceptionOrNull"
            r4[r0] = r3
            goto L4c
        L48:
            java.lang.String r3 = "escapeThrowable"
            r4[r0] = r3
        L4c:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto L5a
            if (r8 == r0) goto L5a
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto L5f
        L5a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        L5f:
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public static <V> java.lang.Object b(@org.jetbrains.annotations.Nullable V r1) {
            if (r1 != 0) goto La
            java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.a
            if (r1 != 0) goto La
            r0 = 1
            a(r0)
        La:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            if (r2 != 0) goto L6
            r0 = 3
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b r0 = new kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static <V> V d(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            if (r1 != 0) goto L6
            r0 = 4
            a(r0)
        L6:
            java.lang.Object r1 = f(r1)
            java.lang.Object r1 = e(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static <V> V e(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            if (r1 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.a
            if (r1 != r0) goto Lb
            r1 = 0
        Lb:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static <V> V f(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b
            if (r0 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b r1 = (kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b) r1
            java.lang.Throwable r1 = r1.b()
            boolean r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b
            if (r0 == 0) goto L1a
            boolean r0 = kotlin.reflect.jvm.internal.impl.utils.c.a(r1)
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.utils.WrappedValues$WrappedProcessCanceledException r0 = new kotlin.reflect.jvm.internal.impl.utils.WrappedValues$WrappedProcessCanceledException
            r0.<init>(r1)
            throw r0
        L1a:
            java.lang.RuntimeException r1 = kotlin.reflect.jvm.internal.impl.utils.c.b(r1)
            throw r1
        L1f:
            return r1
    }
}
