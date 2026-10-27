package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDescriptor.kt\norg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
    public static final class a {
        @org.jetbrains.annotations.Nullable
        public static kotlin.reflect.jvm.internal.impl.name.c a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2) {
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.l(r2)
                r0 = 0
                if (r2 == 0) goto L16
                boolean r1 = kotlin.reflect.jvm.internal.impl.types.error.i.m(r2)
                if (r1 != 0) goto Le
                goto Lf
            Le:
                r2 = r0
            Lf:
                if (r2 == 0) goto L16
                kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.k(r2)
                return r2
            L16:
                return r0
        }
    }

    @org.jetbrains.annotations.NotNull
    java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a();

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.name.c d();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource();

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.types.t0 getType();
}
