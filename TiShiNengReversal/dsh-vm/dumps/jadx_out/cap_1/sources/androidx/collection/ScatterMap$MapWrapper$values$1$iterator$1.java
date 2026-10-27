package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {744}, m = "invokeSuspend", n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n418#2,3:1851\n363#2,6:1854\n373#2,3:1861\n376#2,2:1865\n422#2,2:1867\n379#2,6:1869\n424#2:1875\n1826#3:1860\n1688#3:1864\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n*L\n743#1:1851,3\n743#1:1854,6\n743#1:1861,3\n743#1:1865,2\n743#1:1867,2\n743#1:1869,6\n743#1:1875\n743#1:1860\n743#1:1864\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ScatterMap$MapWrapper$values$1$iterator$1<V> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super V>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ androidx.collection.ScatterMap<K, V> this$0;

    ScatterMap$MapWrapper$values$1$iterator$1(androidx.collection.ScatterMap<K, V> r1, kotlin.coroutines.e<? super androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1 r0 = new androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1
            androidx.collection.ScatterMap<K, V> r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlin.sequences.o r1 = (kotlin.sequences.o) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.o<? super V> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1 r1 = (androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
            r21 = this;
            r0 = r21
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2a
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.L$0
            kotlin.sequences.o r13 = (kotlin.sequences.o) r13
            kotlin.g0.n(r22)
            goto L8f
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            kotlin.g0.n(r22)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.o r2 = (kotlin.sequences.o) r2
            androidx.collection.ScatterMap<K, V> r6 = r0.this$0
            java.lang.Object[] r7 = r6.values
            long[] r6 = r6.metadata
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9d
            r9 = 0
        L45:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L98
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = 0
            r19 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r19
        L66:
            if (r2 >= r6) goto L92
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L8f
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r14 = r13.c(r14, r0)
            if (r14 != r1) goto L8f
            return r1
        L8f:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L66
        L92:
            if (r6 != r4) goto L9d
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L98:
            if (r9 == r8) goto L9d
            int r9 = r9 + 1
            goto L45
        L9d:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }
}
