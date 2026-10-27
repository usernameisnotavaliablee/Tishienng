package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "e", "bufferInitialCapacity", "gap", "skip", "$this$iterator", "buffer", "bufferInitialCapacity", "gap", "skip", "$this$iterator", "buffer", "e", "bufferInitialCapacity", "gap", "$this$iterator", "buffer", "bufferInitialCapacity", "gap", "$this$iterator", "buffer", "bufferInitialCapacity", "gap"}, nl = {35, 43, 50, 56, 61}, s = {"L$0", "L$1", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
    static final class a<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super java.util.List<? extends T>>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        int e;
        int f;
        int g;
        private /* synthetic */ java.lang.Object h;
        final /* synthetic */ int i;
        final /* synthetic */ int j;
        final /* synthetic */ java.util.Iterator<T> k;
        final /* synthetic */ boolean l;
        final /* synthetic */ boolean m;

        a(int r1, int r2, java.util.Iterator<? extends T> r3, boolean r4, boolean r5, kotlin.coroutines.e<? super kotlin.collections.z1.a> r6) {
                r0 = this;
                r0.i = r1
                r0.j = r2
                r0.k = r3
                r0.l = r4
                r0.m = r5
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r8, kotlin.coroutines.e<?> r9) {
                r7 = this;
                kotlin.collections.z1$a r0 = new kotlin.collections.z1$a
                int r1 = r7.i
                int r2 = r7.j
                java.util.Iterator<T> r3 = r7.k
                boolean r4 = r7.l
                boolean r5 = r7.m
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.h = r8
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.sequences.o r1 = (kotlin.sequences.o) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlin.sequences.o<? super java.util.List<? extends T>> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlin.collections.z1$a r1 = (kotlin.collections.z1.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = r12.h
                kotlin.sequences.o r0 = (kotlin.sequences.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r12.g
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L61
                if (r2 == r7) goto L50
                if (r2 == r6) goto L47
                if (r2 == r5) goto L36
                if (r2 == r4) goto L29
                if (r2 != r3) goto L21
                java.lang.Object r0 = r12.a
                kotlin.collections.t1 r0 = (kotlin.collections.t1) r0
                goto L4b
            L21:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L29:
                int r2 = r12.e
                int r5 = r12.d
                java.lang.Object r6 = r12.a
                kotlin.collections.t1 r6 = (kotlin.collections.t1) r6
                kotlin.g0.n(r13)
                goto L179
            L36:
                int r2 = r12.e
                int r6 = r12.d
                java.lang.Object r7 = r12.b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r9 = r12.a
                kotlin.collections.t1 r9 = (kotlin.collections.t1) r9
                kotlin.g0.n(r13)
                goto L145
            L47:
                java.lang.Object r0 = r12.a
                java.util.ArrayList r0 = (java.util.ArrayList) r0
            L4b:
                kotlin.g0.n(r13)
                goto L1a2
            L50:
                int r2 = r12.e
                int r3 = r12.d
                java.lang.Object r4 = r12.b
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r12.a
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                kotlin.g0.n(r13)
            L5f:
                r13 = r2
                goto Lb4
            L61:
                kotlin.g0.n(r13)
                int r13 = r12.i
                r2 = 1024(0x400, float:1.435E-42)
                int r13 = kotlin.ranges.t.B(r13, r2)
                int r2 = r12.j
                int r9 = r12.i
                int r2 = r2 - r9
                if (r2 < 0) goto Lf8
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r13)
                java.util.Iterator<T> r4 = r12.k
                r5 = 0
                r5 = r3
                r3 = r13
                r13 = 0
            L7e:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto Lc6
                java.lang.Object r9 = r4.next()
                if (r13 <= 0) goto L8d
                int r13 = r13 + (-1)
                goto L7e
            L8d:
                r5.add(r9)
                int r10 = r5.size()
                int r11 = r12.i
                if (r10 != r11) goto L7e
                r12.h = r0
                r12.a = r5
                r12.b = r4
                java.lang.Object r9 = kotlin.coroutines.jvm.internal.j.a(r9)
                r12.c = r9
                r12.d = r3
                r12.e = r2
                r12.f = r13
                r12.g = r7
                java.lang.Object r13 = r0.c(r5, r12)
                if (r13 != r1) goto L5f
                goto L1a1
            Lb4:
                boolean r2 = r12.l
                if (r2 == 0) goto Lbc
                r5.clear()
                goto Lc4
            Lbc:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r5 = r12.i
                r2.<init>(r5)
                r5 = r2
            Lc4:
                r2 = r13
                goto L7e
            Lc6:
                boolean r4 = r5.isEmpty()
                if (r4 != 0) goto L1a2
                boolean r4 = r12.m
                if (r4 != 0) goto Ld8
                int r4 = r5.size()
                int r7 = r12.i
                if (r4 != r7) goto L1a2
            Ld8:
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r0)
                r12.h = r4
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.j.a(r5)
                r12.a = r4
                r12.b = r8
                r12.c = r8
                r12.d = r3
                r12.e = r2
                r12.f = r13
                r12.g = r6
                java.lang.Object r13 = r0.c(r5, r12)
                if (r13 != r1) goto L1a2
                goto L1a1
            Lf8:
                kotlin.collections.t1 r6 = new kotlin.collections.t1
                r6.<init>(r13)
                java.util.Iterator<T> r7 = r12.k
                r9 = r6
                r6 = r13
            L101:
                boolean r13 = r7.hasNext()
                if (r13 == 0) goto L14b
                java.lang.Object r13 = r7.next()
                r9.j(r13)
                boolean r10 = r9.o()
                if (r10 == 0) goto L101
                int r10 = r9.size()
                int r11 = r12.i
                if (r10 >= r11) goto L121
                kotlin.collections.t1 r9 = r9.m(r11)
                goto L101
            L121:
                boolean r10 = r12.l
                if (r10 == 0) goto L127
                r10 = r9
                goto L12c
            L127:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>(r9)
            L12c:
                r12.h = r0
                r12.a = r9
                r12.b = r7
                java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r13)
                r12.c = r13
                r12.d = r6
                r12.e = r2
                r12.g = r5
                java.lang.Object r13 = r0.c(r10, r12)
                if (r13 != r1) goto L145
                goto L1a1
            L145:
                int r13 = r12.j
                r9.p(r13)
                goto L101
            L14b:
                boolean r13 = r12.m
                if (r13 == 0) goto L1a2
                r5 = r6
                r6 = r9
            L151:
                int r13 = r6.size()
                int r7 = r12.j
                if (r13 <= r7) goto L17f
                boolean r13 = r12.l
                if (r13 == 0) goto L15f
                r13 = r6
                goto L164
            L15f:
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>(r6)
            L164:
                r12.h = r0
                r12.a = r6
                r12.b = r8
                r12.c = r8
                r12.d = r5
                r12.e = r2
                r12.g = r4
                java.lang.Object r13 = r0.c(r13, r12)
                if (r13 != r1) goto L179
                goto L1a1
            L179:
                int r13 = r12.j
                r6.p(r13)
                goto L151
            L17f:
                boolean r13 = r6.isEmpty()
                if (r13 != 0) goto L1a2
                java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r0)
                r12.h = r13
                java.lang.Object r13 = kotlin.coroutines.jvm.internal.j.a(r6)
                r12.a = r13
                r12.b = r8
                r12.c = r8
                r12.d = r5
                r12.e = r2
                r12.g = r3
                java.lang.Object r13 = r0.c(r6, r12)
                if (r13 != r1) goto L1a2
            L1a1:
                return r1
            L1a2:
                kotlin.n1 r13 = kotlin.n1.a
                return r13
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,731:1\n19#2:732\n*E\n"})
    public static final class b<T> implements kotlin.sequences.m<java.util.List<? extends T>> {
        final /* synthetic */ kotlin.sequences.m a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;

        public b(kotlin.sequences.m r1, int r2, int r3, boolean r4, boolean r5) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.<init>()
                return
        }

        @Override // kotlin.sequences.m
        public java.util.Iterator<java.util.List<? extends T>> iterator() {
                r5 = this;
                kotlin.sequences.m r0 = r5.a
                java.util.Iterator r0 = r0.iterator()
                int r1 = r5.b
                int r2 = r5.c
                boolean r3 = r5.d
                boolean r4 = r5.e
                java.util.Iterator r0 = kotlin.collections.z1.b(r0, r1, r2, r3, r4)
                return r0
        }
    }

    public static final void a(int r3, int r4) {
            if (r3 <= 0) goto L5
            if (r4 <= 0) goto L5
            return
        L5:
            java.lang.String r0 = " must be greater than zero."
            if (r3 == r4) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Both size "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " and step "
            r1.append(r3)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            goto L3a
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "size "
            r4.append(r1)
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
        L3a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Iterator<java.util.List<T>> b(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r7, int r8, int r9, boolean r10, boolean r11) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto Le
            kotlin.collections.t0 r7 = kotlin.collections.t0.a
            return r7
        Le:
            kotlin.collections.z1$a r0 = new kotlin.collections.z1$a
            r6 = 0
            r3 = r7
            r1 = r8
            r2 = r9
            r5 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.Iterator r7 = kotlin.sequences.p.a(r0)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.sequences.m<java.util.List<T>> c(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r7, int r8, int r9, boolean r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            a(r8, r9)
            kotlin.collections.z1$b r1 = new kotlin.collections.z1$b
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }
}
