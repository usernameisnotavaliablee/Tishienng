package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface f0 extends kotlin.reflect.jvm.internal.impl.descriptors.k {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @org.jetbrains.annotations.Nullable
        public static <R, D> R a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r2, D r3) {
                java.lang.String r0 = "visitor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r1 = r2.m(r1, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public static kotlin.reflect.jvm.internal.impl.descriptors.k b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r0) {
                r0 = 0
                return r0
        }
    }

    boolean B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.descriptors.s0 M(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1);

    @org.jetbrains.annotations.NotNull
    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.f0> P();

    @org.jetbrains.annotations.Nullable
    <T> T U(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e0<T> r1);

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.builtins.j p();

    @org.jetbrains.annotations.NotNull
    java.util.Collection<kotlin.reflect.jvm.internal.impl.name.c> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r2);
}
