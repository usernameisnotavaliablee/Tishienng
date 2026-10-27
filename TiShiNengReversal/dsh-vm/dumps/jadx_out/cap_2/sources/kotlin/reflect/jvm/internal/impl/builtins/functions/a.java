package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuiltInFictitiousFunctionClassFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n808#2,11:71\n808#2,11:82\n*S KotlinDebug\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n*L\n55#1:71,11\n59#1:82,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a implements q3.b {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 b;

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    public boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r6) {
            r4 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r6 = r6.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            java.lang.String r0 = "Function"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.u.H2(r6, r0, r1, r2, r3)
            if (r0 != 0) goto L36
            java.lang.String r0 = "KFunction"
            boolean r0 = kotlin.text.u.H2(r6, r0, r1, r2, r3)
            if (r0 != 0) goto L36
            java.lang.String r0 = "SuspendFunction"
            boolean r0 = kotlin.text.u.H2(r6, r0, r1, r2, r3)
            if (r0 != 0) goto L36
            java.lang.String r0 = "KSuspendFunction"
            boolean r0 = kotlin.text.u.H2(r6, r0, r1, r2, r3)
            if (r0 == 0) goto L44
        L36:
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$a r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.f.c
            kotlin.reflect.jvm.internal.impl.builtins.functions.f r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$b r5 = r0.c(r5, r6)
            if (r5 == 0) goto L44
            r5 = 1
            return r5
        L44:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r7) {
            r6 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r7.i()
            r1 = 0
            if (r0 != 0) goto L99
            boolean r0 = r7.j()
            if (r0 == 0) goto L14
            goto L99
        L14:
            kotlin.reflect.jvm.internal.impl.name.c r0 = r7.g()
            java.lang.String r0 = r0.a()
            r2 = 0
            r3 = 2
            java.lang.String r4 = "Function"
            boolean r2 = kotlin.text.u.l3(r0, r4, r2, r3, r1)
            if (r2 != 0) goto L27
            return r1
        L27:
            kotlin.reflect.jvm.internal.impl.name.c r7 = r7.f()
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$a r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.f.c
            kotlin.reflect.jvm.internal.impl.builtins.functions.f r2 = r2.a()
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$b r0 = r2.c(r7, r0)
            if (r0 != 0) goto L38
            return r1
        L38:
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = r0.a()
            int r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r2 = r6.b
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r7 = r2.M(r7)
            java.util.List r7 = r7.L()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L55:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r7.next()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.builtins.c
            if (r4 == 0) goto L55
            r2.add(r3)
            goto L55
        L67:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r2.iterator()
        L70:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L82
            java.lang.Object r4 = r3.next()
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.builtins.h
            if (r5 == 0) goto L70
            r7.add(r4)
            goto L70
        L82:
            java.lang.Object r7 = kotlin.collections.f0.L2(r7)
            kotlin.reflect.jvm.internal.impl.builtins.h r7 = (kotlin.reflect.jvm.internal.impl.builtins.h) r7
            if (r7 == 0) goto L8b
            goto L91
        L8b:
            java.lang.Object r7 = kotlin.collections.f0.G2(r2)
            kotlin.reflect.jvm.internal.impl.builtins.c r7 = (kotlin.reflect.jvm.internal.impl.builtins.c) r7
        L91:
            kotlin.reflect.jvm.internal.impl.builtins.functions.b r2 = new kotlin.reflect.jvm.internal.impl.builtins.functions.b
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r6.a
            r2.<init>(r3, r7, r1, r0)
            return r2
        L99:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r2 = kotlin.collections.u1.k()
            return r2
    }
}
