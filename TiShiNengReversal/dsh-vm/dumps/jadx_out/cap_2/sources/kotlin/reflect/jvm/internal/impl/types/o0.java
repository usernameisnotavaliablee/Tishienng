package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,207:1\n37#2:208\n36#2,3:209\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n*L\n127#1:208\n127#1:209,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o0 extends kotlin.reflect.jvm.internal.impl.types.f2 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.j1[] c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.c2[] d;
    private final boolean e;

    public o0(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r8, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r9) {
            r7 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "argumentsList"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.util.Collection r8 = (java.util.Collection) r8
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.j1[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.j1[r0]
            java.lang.Object[] r8 = r8.toArray(r1)
            r2 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.j1[] r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1[]) r2
            java.util.Collection r9 = (java.util.Collection) r9
            kotlin.reflect.jvm.internal.impl.types.c2[] r8 = new kotlin.reflect.jvm.internal.impl.types.c2[r0]
            java.lang.Object[] r8 = r9.toArray(r8)
            r3 = r8
            kotlin.reflect.jvm.internal.impl.types.c2[] r3 = (kotlin.reflect.jvm.internal.impl.types.c2[]) r3
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1[] r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2[] r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.c = r2
            r1.d = r3
            r1.e = r4
            int r2 = r2.length
            int r2 = r3.length
            return
    }

    public /* synthetic */ o0(kotlin.reflect.jvm.internal.impl.descriptors.j1[] r1, kotlin.reflect.jvm.internal.impl.types.c2[] r2, boolean r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    public boolean b() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.c2 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r5) {
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r5 = r5.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = r5.c()
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            r1 = 0
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r5
            goto L16
        L15:
            r5 = r1
        L16:
            if (r5 != 0) goto L19
            return r1
        L19:
            int r0 = r5.getIndex()
            kotlin.reflect.jvm.internal.impl.descriptors.j1[] r2 = r4.c
            int r3 = r2.length
            if (r0 >= r3) goto L37
            r2 = r2[r0]
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.o()
            kotlin.reflect.jvm.internal.impl.types.w1 r5 = r5.o()
            boolean r5 = kotlin.jvm.internal.g0.g(r2, r5)
            if (r5 == 0) goto L37
            kotlin.reflect.jvm.internal.impl.types.c2[] r5 = r4.d
            r5 = r5[r0]
            return r5
        L37:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    public boolean f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.c2[] r0 = r1.d
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.c2[] i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.c2[] r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.j1[] j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1[] r0 = r1.c
            return r0
    }
}
