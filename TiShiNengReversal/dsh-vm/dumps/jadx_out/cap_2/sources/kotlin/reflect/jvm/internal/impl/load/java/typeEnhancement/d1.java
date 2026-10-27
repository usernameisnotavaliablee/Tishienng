package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedFunctionEnhancementInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n1563#2:348\n1634#2,3:349\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedFunctionEnhancementInfo\n*L\n41#1:348\n41#1:349,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d1 {

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 a;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1> b;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1 d;

    public d1() {
            r6 = this;
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public d1(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1> r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "parametersInfo"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r0 = 0
            if (r5 == 0) goto L48
            if (r3 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r3 = r3.a()
            goto L19
        L18:
            r3 = r0
        L19:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r4, r1)
            r5.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L2a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r4.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1) r1
            if (r1 == 0) goto L3d
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r1 = r1.a()
            goto L3e
        L3d:
            r1 = r0
        L3e:
            r5.add(r1)
            goto L2a
        L42:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1 r4 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1
            r4.<init>(r3, r5, r0)
            r0 = r4
        L48:
            r2.d = r0
            return
    }

    public /* synthetic */ d1(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r2, java.util.List r3, java.lang.String r4, int r5, kotlin.jvm.internal.v r6) {
            r1 = this;
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            java.util.List r3 = kotlin.collections.f0.J()
        Le:
            r5 = r5 & 4
            if (r5 == 0) goto L13
            r4 = r0
        L13:
            r1.<init>(r2, r3, r4)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1> b() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1 d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1 r0 = r1.d
            return r0
    }
}
