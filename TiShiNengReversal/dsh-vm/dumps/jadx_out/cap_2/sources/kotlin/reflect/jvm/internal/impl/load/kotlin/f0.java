package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSignatureBuildingComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,40:1\n11228#2:41\n11563#2,3:42\n11563#2,3:49\n37#3:45\n36#3,3:46\n*S KotlinDebug\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n*L\n21#1:41\n21#1:42,3\n26#1:49,3\n21#1:45\n21#1:46,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.f0 a = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.kotlin.f0 r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.f0
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.kotlin.f0.a = r0
            return
    }

    private f0() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.CharSequence a(java.lang.String r0) {
            java.lang.CharSequence r0 = l(r0)
            return r0
    }

    private final java.lang.String c(java.lang.String r3) {
            r2 = this;
            int r0 = r3.length()
            r1 = 1
            if (r0 <= r1) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 76
            r0.append(r1)
            r0.append(r3)
            r3 = 59
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L1d:
            return r3
    }

    private static final java.lang.CharSequence l(java.lang.String r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.f0 r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.f0.a
            java.lang.String r1 = r0.c(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] b(@org.jetbrains.annotations.NotNull java.lang.String... r8) {
            r7 = this;
            java.lang.String r0 = "signatures"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r1) goto L2e
            r4 = r8[r3]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "<init>("
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ")V"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L2e:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> d(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String... r8) {
            r6 = this;
            java.lang.String r0 = "internalName"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "signatures"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L2f
            r3 = r8[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r5 = 46
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.add(r3)
            int r2 = r2 + 1
            goto L11
        L2f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> e(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String... r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "signatures"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r2 = r1.h(r2)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.Set r2 = r1.d(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> f(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String... r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "signatures"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r2 = r1.i(r2)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.Set r2 = r1.d(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String g(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "java/util/function/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String h(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "java/lang/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String i(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "java/util/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String j(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "java/util/concurrent/atomic/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String k(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r12, @org.jetbrains.annotations.NotNull java.lang.String r13) {
            r10 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "ret"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r11 = 40
            r0.append(r11)
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.reflect.jvm.internal.impl.load.kotlin.e0 r7 = kotlin.reflect.jvm.internal.impl.load.kotlin.e0.a
            r8 = 30
            r9 = 0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r11 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.append(r11)
            r11 = 41
            r0.append(r11)
            java.lang.String r11 = r10.c(r13)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String m(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "internalName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "jvmDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r2 = 46
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
