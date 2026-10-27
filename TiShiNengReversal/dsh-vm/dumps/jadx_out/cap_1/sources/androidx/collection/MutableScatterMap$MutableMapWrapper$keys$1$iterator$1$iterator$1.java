package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1431}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n*L\n1430#1:1851,6\n1430#1:1858,3\n1430#1:1862,9\n1430#1:1857\n1430#1:1861\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super java.lang.Integer>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(androidx.collection.MutableScatterMap<K, V> r1, kotlin.coroutines.e<? super androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
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
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.o<? super java.lang.Integer> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 r1 = (androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2e
            if (r2 != r5) goto L26
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            kotlin.sequences.o r12 = (kotlin.sequences.o) r12
            kotlin.g0.n(r21)
            goto L8a
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            kotlin.g0.n(r21)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.o r2 = (kotlin.sequences.o) r2
            androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
            long[] r6 = r6.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L98
            r8 = 0
        L3f:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L93
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r6
            r6 = r12
            r12 = r2
            r2 = 0
            r18 = r9
            r10 = r7
            r9 = r8
            r7 = r18
        L61:
            if (r2 >= r6) goto L8d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L8a
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.f(r13)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r13 = r12.c(r13, r0)
            if (r13 != r1) goto L8a
            return r1
        L8a:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L61
        L8d:
            if (r6 != r4) goto L98
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L93:
            if (r8 == r7) goto L98
            int r8 = r8 + 1
            goto L3f
        L98:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }
}
