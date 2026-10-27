package kotlin.reflect.full;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "KAnnotatedElements")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n20#1:105\n295#2,2:103\n295#2,2:106\n295#2,2:108\n*S KotlinDebug\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n*L\n29#1:105\n20#1:103,2\n29#1:106,2\n62#1:108,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    @kotlin.SinceKotlin(version = "1.1")
    public static final /* synthetic */ <T extends java.lang.annotation.Annotation> T a(kotlin.reflect.b r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r4 = r4.getAnnotations()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            r2 = 3
            java.lang.String r3 = "T"
            kotlin.jvm.internal.g0.y(r2, r3)
            boolean r1 = androidx.activity.k.a(r1)
            if (r1 == 0) goto Lf
            goto L2a
        L29:
            r0 = 0
        L2a:
            r4 = 1
            java.lang.String r1 = "T?"
            kotlin.jvm.internal.g0.y(r4, r1)
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final /* synthetic */ <T extends java.lang.annotation.Annotation> java.util.List<T> b(kotlin.reflect.b r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<java.lang.annotation.Annotation> r0 = java.lang.annotation.Annotation.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            java.util.List r2 = c(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.annotation.Annotation> java.util.List<T> c(@org.jetbrains.annotations.NotNull kotlin.reflect.b r3, @org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r0 = r3.getAnnotations()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Class r1 = k3.a.e(r4)
            java.util.List r0 = kotlin.collections.f0.h1(r0, r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L22
            return r0
        L22:
            kotlin.reflect.full.a r0 = kotlin.reflect.full.a.a
            java.lang.Class r4 = k3.a.e(r4)
            java.lang.Class r4 = r0.b(r4)
            if (r4 == 0) goto L74
            java.util.List r3 = r3.getAnnotations()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L55
            java.lang.Object r0 = r3.next()
            r2 = r0
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            kotlin.reflect.d r2 = k3.a.a(r2)
            java.lang.Class r2 = k3.a.e(r2)
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L38
            goto L56
        L55:
            r0 = r1
        L56:
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            if (r0 == 0) goto L74
            java.lang.Class r3 = r0.getClass()
            java.lang.String r4 = "value"
            java.lang.reflect.Method r3 = r3.getMethod(r4, r1)
            java.lang.Object r3 = r3.invoke(r0, r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.full.KAnnotatedElements.findAnnotations>"
            kotlin.jvm.internal.g0.n(r3, r4)
            java.lang.annotation.Annotation[] r3 = (java.lang.annotation.Annotation[]) r3
            java.util.List r3 = kotlin.collections.n.t(r3)
            return r3
        L74:
            java.util.List r3 = kotlin.collections.f0.J()
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public static final /* synthetic */ <T extends java.lang.annotation.Annotation> boolean d(kotlin.reflect.b r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r4 = r4.getAnnotations()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            r2 = 3
            java.lang.String r3 = "T"
            kotlin.jvm.internal.g0.y(r2, r3)
            boolean r1 = androidx.activity.k.a(r1)
            if (r1 == 0) goto Lf
            goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.String r4 = "T?"
            r1 = 1
            kotlin.jvm.internal.g0.y(r1, r4)
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            if (r0 == 0) goto L35
            return r1
        L35:
            r4 = 0
            return r4
    }
}
