package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j a;

    @org.jetbrains.annotations.NotNull
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> b;
    private final boolean c;

    public v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r2, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "nullabilityQualifier"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "qualifierApplicabilityTypes"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public /* synthetic */ v(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r1, java.util.Collection r2, boolean r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = r1.c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            if (r3 != r4) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.v b(kotlin.reflect.jvm.internal.impl.load.java.v r0, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r1, java.util.Collection r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r1 = r0.a
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r2 = r0.b
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            boolean r3 = r0.c
        L12:
            kotlin.reflect.jvm.internal.impl.load.java.v r0 = r0.a(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.v a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r2, @org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "nullabilityQualifier"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "qualifierApplicabilityTypes"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.v r0 = new kotlin.reflect.jvm.internal.impl.load.java.v
            r0.<init>(r2, r3, r4)
            return r0
    }

    public final boolean c() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> e() {
            r1 = this;
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r0 = r1.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.v
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.load.java.v r5 = (kotlin.reflect.jvm.internal.impl.load.java.v) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r1 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r1 = r4.b
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r3 = r5.b
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.c
            boolean r5 = r5.c
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.c
            int r1 = kotlin.reflect.jvm.internal.impl.km.f.a(r1)
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JavaDefaultQualifiers(nullabilityQualifier="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", qualifierApplicabilityTypes="
            r0.append(r1)
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", definitelyNotNull="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
