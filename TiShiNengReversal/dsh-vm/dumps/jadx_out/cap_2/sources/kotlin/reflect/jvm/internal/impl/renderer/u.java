package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface u {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        public static boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.u r0) {
                kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r0 = r0.e()
                boolean r0 = r0.getIncludeAnnotationArguments()
                return r0
        }

        public static boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.u r0) {
                kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r0 = r0.e()
                boolean r0 = r0.getIncludeEmptyAnnotationArguments()
                return r0
        }
    }

    void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r1);

    boolean b();

    @org.jetbrains.annotations.NotNull
    java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> c();

    boolean d();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy e();

    void f(@org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.name.c> r1);

    void g(@org.jetbrains.annotations.NotNull java.util.Set<? extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r1);

    void h(boolean r1);

    void i(boolean r1);

    void j(boolean r1);

    void k(boolean r1);

    void l(boolean r1);

    void m(boolean r1);

    void n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r1);

    void o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r1);

    void p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.a r1);

    void q(boolean r1);

    void setVerbose(boolean r1);
}
