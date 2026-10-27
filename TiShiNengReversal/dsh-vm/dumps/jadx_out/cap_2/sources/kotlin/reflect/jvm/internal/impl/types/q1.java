package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface q1 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements kotlin.reflect.jvm.internal.impl.types.q1 {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.types.q1.a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.types.q1$a r0 = new kotlin.reflect.jvm.internal.impl.types.q1$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.types.q1.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q1
        public void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r5) {
                r1 = this;
                java.lang.String r0 = "substitutor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "unsubstitutedArgument"
                kotlin.jvm.internal.g0.p(r3, r2)
                java.lang.String r2 = "argument"
                kotlin.jvm.internal.g0.p(r4, r2)
                java.lang.String r2 = "typeParameter"
                kotlin.jvm.internal.g0.p(r5, r2)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q1
        public void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.i1 r2) {
                r1 = this;
                java.lang.String r0 = "typeAlias"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q1
        public void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2) {
                r1 = this;
                java.lang.String r0 = "annotation"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q1
        public void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.i1 r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.j1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
                r0 = this;
                java.lang.String r2 = "typeAlias"
                kotlin.jvm.internal.g0.p(r1, r2)
                java.lang.String r1 = "substitutedArgument"
                kotlin.jvm.internal.g0.p(r3, r1)
                return
        }
    }

    void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r4);

    void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.i1 r1);

    void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1);

    void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.i1 r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.j1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3);
}
