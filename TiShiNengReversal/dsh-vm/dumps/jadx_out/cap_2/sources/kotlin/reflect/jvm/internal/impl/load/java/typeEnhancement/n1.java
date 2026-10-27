package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementInfo\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n463#2:348\n413#2:349\n1252#3,4:350\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementInfo\n*L\n28#1:348\n28#1:349\n28#1:350,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n1 {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> a;

    public n1(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> r2) {
            r1 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 a() {
            r11 = this;
            java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> r0 = r11.a
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r0.size()
            int r2 = kotlin.collections.i1.j(r2)
            r1.<init>(r2)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r4 = r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r4
            r9 = 7
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.c(r4, r5, r6, r7, r8, r9, r10)
            r1.put(r3, r2)
            goto L17
        L3c:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> b() {
            r1 = this;
            java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> r0 = r1.a
            return r0
    }
}
