package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n37#2,2:128\n13579#3,2:130\n1855#4,2:132\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n42#1:128,2\n54#1:130,2\n66#1:132,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        int b;
        int c;
        /* synthetic */ java.lang.Object d;
        int e;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.f.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.d = r2
                int r2 = r1.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.e = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.f.d(r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        b(kotlin.coroutines.e<? super kotlinx.coroutines.f.b> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.b = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.f.c(r2, r1)
                return r2
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlinx.coroutines.x0<? extends T>> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<? extends T>> r3) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
        Lb:
            kotlinx.coroutines.e r0 = new kotlinx.coroutines.e
            r1 = 0
            kotlinx.coroutines.x0[] r1 = new kotlinx.coroutines.x0[r1]
            java.lang.Object[] r2 = r2.toArray(r1)
            kotlinx.coroutines.x0[] r2 = (kotlinx.coroutines.x0[]) r2
            r0.<init>(r2)
            java.lang.Object r2 = r0.c(r3)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.x0<? extends T>[] r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<? extends T>> r2) {
            int r0 = r1.length
            if (r0 != 0) goto L8
            java.util.List r1 = kotlin.collections.f0.J()
            return r1
        L8:
            kotlinx.coroutines.e r0 = new kotlinx.coroutines.e
            r0.<init>(r1)
            java.lang.Object r1 = r0.c(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlinx.coroutines.e2> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            boolean r0 = r5 instanceof kotlinx.coroutines.f.b
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.f$b r0 = (kotlinx.coroutines.f.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.f$b r0 = new kotlinx.coroutines.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.g0.n(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.g0.n(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.e2 r5 = (kotlinx.coroutines.e2) r5
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.M(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2[] r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.f.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.f$a r0 = (kotlinx.coroutines.f.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.f$a r0 = new kotlinx.coroutines.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.c
            int r2 = r0.b
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.e2[] r4 = (kotlinx.coroutines.e2[]) r4
            kotlin.g0.n(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.g0.n(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.a = r7
            r0.b = r2
            r0.c = r6
            r0.e = r3
            java.lang.Object r4 = r4.M(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }
}
