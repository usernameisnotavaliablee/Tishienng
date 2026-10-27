package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class l extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<kotlin.n1> {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.l.a b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.resolve.constants.l a(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "message"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.resolve.constants.l$b r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.l$b
                r0.<init>(r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.resolve.constants.l {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String c;

        public b(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "message"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.c = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.types.error.g getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
                r1 = this;
                java.lang.String r0 = "module"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_CONSTANT_VALUE
                java.lang.String r0 = r1.c
                java.lang.String[] r0 = new java.lang.String[]{r0}
                kotlin.reflect.jvm.internal.impl.types.error.g r2 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r2, r0)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 getType(kotlin.reflect.jvm.internal.impl.descriptors.f0 r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.types.error.g r1 = r0.getType(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.resolve.constants.l$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.l$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.constants.l.b = r0
            return
    }

    public l() {
            r1 = this;
            kotlin.n1 r0 = kotlin.n1.a
            r1.<init>(r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    public /* bridge */ /* synthetic */ kotlin.n1 a() {
            r1 = this;
            kotlin.n1 r0 = r1.b()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.n1 b() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
