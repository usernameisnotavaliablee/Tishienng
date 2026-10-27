package kotlin.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface c<R> extends kotlin.reflect.b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @kotlin.internal.IntrinsicConstEvaluation
        public static /* synthetic */ void a() {
                return
        }

        @kotlin.SinceKotlin(version = "1.1")
        public static /* synthetic */ void b() {
                return
        }

        @kotlin.SinceKotlin(version = "1.1")
        public static /* synthetic */ void c() {
                return
        }

        @kotlin.SinceKotlin(version = "1.1")
        public static /* synthetic */ void d() {
                return
        }

        @kotlin.SinceKotlin(version = "1.1")
        public static /* synthetic */ void e() {
                return
        }

        @kotlin.SinceKotlin(version = "1.1")
        public static /* synthetic */ void f() {
                return
        }

        @kotlin.SinceKotlin(version = "1.3")
        public static /* synthetic */ void g() {
                return
        }
    }

    R call(@org.jetbrains.annotations.NotNull java.lang.Object... r1);

    R callBy(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r1);

    @org.jetbrains.annotations.NotNull
    java.lang.String getName();

    @org.jetbrains.annotations.NotNull
    java.util.List<kotlin.reflect.KParameter> getParameters();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.r getReturnType();

    @org.jetbrains.annotations.NotNull
    java.util.List<kotlin.reflect.s> getTypeParameters();

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
