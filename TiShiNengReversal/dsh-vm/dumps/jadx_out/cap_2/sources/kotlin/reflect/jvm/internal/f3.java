package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class f3 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a<T> extends kotlin.reflect.jvm.internal.f3.b<T> implements kotlin.jvm.functions.Function0<T> {
        private final kotlin.jvm.functions.Function0<T> b;
        private volatile java.lang.ref.SoftReference<java.lang.Object> c;

        public a(@org.jetbrains.annotations.Nullable T r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<T> r3) {
                r1 = this;
                if (r3 != 0) goto L6
                r0 = 0
                d(r0)
            L6:
                r1.<init>()
                r0 = 0
                r1.c = r0
                r1.b = r3
                if (r2 == 0) goto L1b
                java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference
                java.lang.Object r2 = r1.a(r2)
                r3.<init>(r2)
                r1.c = r3
            L1b:
                return
        }

        private static /* synthetic */ void d(int r2) {
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "initializer"
                r1 = 0
                r2[r1] = r0
                java.lang.String r0 = "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal"
                r1 = 1
                r2[r1] = r0
                java.lang.String r0 = "<init>"
                r1 = 2
                r2[r1] = r0
                java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r2 = java.lang.String.format(r0, r2)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r2)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.f3.b, kotlin.jvm.functions.Function0
        public T invoke() {
                r3 = this;
                java.lang.ref.SoftReference<java.lang.Object> r0 = r3.c
                if (r0 == 0) goto Lf
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto Lf
                java.lang.Object r0 = r3.c(r0)
                return r0
            Lf:
                kotlin.jvm.functions.Function0<T> r0 = r3.b
                java.lang.Object r0 = r0.invoke()
                java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
                java.lang.Object r2 = r3.a(r0)
                r1.<init>(r2)
                r3.c = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b<T> {
        private static final java.lang.Object a = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static class a {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                kotlin.reflect.jvm.internal.f3$b$a r0 = new kotlin.reflect.jvm.internal.f3$b$a
                r0.<init>()
                kotlin.reflect.jvm.internal.f3.b.a = r0
                return
        }

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        protected java.lang.Object a(T r1) {
                r0 = this;
                if (r1 != 0) goto L4
                java.lang.Object r1 = kotlin.reflect.jvm.internal.f3.b.a
            L4:
                return r1
        }

        public final T b(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Object r1 = r0.invoke()
                return r1
        }

        protected T c(java.lang.Object r2) {
                r1 = this;
                java.lang.Object r0 = kotlin.reflect.jvm.internal.f3.b.a
                if (r2 != r0) goto L5
                r2 = 0
            L5:
                return r2
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int r2) {
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = "initializer"
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "kotlin/reflect/jvm/internal/ReflectProperties"
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "lazySoft"
            r1 = 2
            r2[r1] = r0
            java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.reflect.jvm.internal.f3.a<T> b(@org.jetbrains.annotations.Nullable T r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<T> r2) {
            if (r2 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.f3$a r0 = new kotlin.reflect.jvm.internal.f3$a
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.reflect.jvm.internal.f3.a<T> c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<T> r1) {
            if (r1 != 0) goto L6
            r0 = 1
            a(r0)
        L6:
            r0 = 0
            kotlin.reflect.jvm.internal.f3$a r1 = b(r0, r1)
            return r1
    }
}
