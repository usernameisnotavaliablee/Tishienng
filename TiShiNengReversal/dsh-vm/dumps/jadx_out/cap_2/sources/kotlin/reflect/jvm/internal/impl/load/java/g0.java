package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJsr305Settings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,26:1\n1#2:27\n216#3,2:28\n37#4:30\n36#4,3:31\n*S KotlinDebug\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings\n*L\n19#1:28,2\n20#1:30\n20#1:31,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel b;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s d;
    private final boolean e;

    public g0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r4) {
            r1 = this;
            java.lang.String r0 = "globalLevel"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "userDefinedLevelForSpecificAnnotation"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            kotlin.reflect.jvm.internal.impl.load.java.f0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.f0
            r0.<init>(r1)
            kotlin.s r0 = kotlin.t.c(r0)
            r1.d = r0
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE
            if (r2 != r0) goto L2c
            if (r3 != r0) goto L2c
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L2c
            r2 = 1
            goto L2d
        L2c:
            r2 = 0
        L2d:
            r1.e = r2
            return
    }

    public /* synthetic */ g0(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2, java.util.Map r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.Map r3 = kotlin.collections.i1.z()
        Ld:
            r0.<init>(r1, r2, r3)
            return
    }

    static /* synthetic */ java.lang.String[] a(kotlin.reflect.jvm.internal.impl.load.java.g0 r0) {
            java.lang.String[] r0 = b(r0)
            return r0
    }

    private static final java.lang.String[] b(kotlin.reflect.jvm.internal.impl.load.java.g0 r4) {
            java.util.List r0 = kotlin.collections.f0.j()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r4.a
            java.lang.String r1 = r1.getDescription()
            r0.add(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r4.b
            if (r1 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "under-migration:"
            r2.append(r3)
            java.lang.String r1 = r1.getDescription()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.add(r1)
        L29:
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r4 = r4.c
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 64
            r2.append(r3)
            java.lang.Object r3 = r1.getKey()
            r2.append(r3)
            r3 = 58
            r2.append(r3)
            java.lang.Object r1 = r1.getValue()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r1
            java.lang.String r1 = r1.getDescription()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.add(r1)
            goto L33
        L6a:
            java.util.List r4 = kotlin.collections.f0.b(r0)
            java.util.Collection r4 = (java.util.Collection) r4
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> e() {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r0 = r1.c
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.g0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.load.java.g0 r5 = (kotlin.reflect.jvm.internal.impl.load.java.g0) r5
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r4.b
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r1 = r4.c
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r5 = r5.c
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L25
            return r2
        L25:
            return r0
    }

    public final boolean f() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r2.b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Jsr305Settings(globalLevel="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", migrationLevel="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", userDefinedLevelForSpecificAnnotation="
            r0.append(r1)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r1 = r2.c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
