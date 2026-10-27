package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e0 {

    @org.jetbrains.annotations.NotNull
    private final java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.v> a;

    public e0(@org.jetbrains.annotations.NotNull java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.v> r2) {
            r1 = this;
            java.lang.String r0 = "defaultQualifiers"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.java.v a(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r2) {
            r1 = this;
            java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.v> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.load.java.v r2 = (kotlin.reflect.jvm.internal.impl.load.java.v) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.v> b() {
            r1 = this;
            java.util.EnumMap<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, kotlin.reflect.jvm.internal.impl.load.java.v> r0 = r1.a
            return r0
    }
}
