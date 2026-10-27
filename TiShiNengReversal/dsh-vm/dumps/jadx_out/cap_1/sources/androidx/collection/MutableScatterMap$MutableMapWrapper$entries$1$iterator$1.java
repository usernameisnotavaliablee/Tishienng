package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, l3.d {
    private int current;

    @org.jetbrains.annotations.NotNull
    private java.util.Iterator<? extends java.util.Map.Entry<K, V>> iterator;
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1328}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n1826#3:1857\n1688#3:1861\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n*L\n1326#1:1851,6\n1326#1:1858,3\n1326#1:1862,9\n1326#1:1857\n1326#1:1861\n*E\n"})
    /* renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.o<? super java.util.Map.Entry<K, V>>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;
        final /* synthetic */ androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 this$1;

        AnonymousClass1(androidx.collection.MutableScatterMap<K, V> r1, androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r2, kotlin.coroutines.e<? super androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.this$1 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                r3 = this;
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1
                androidx.collection.MutableScatterMap<K, V> r1 = r3.this$0
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r2 = r3.this$1
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
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
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.o<? super java.util.Map.Entry<K, V>> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1 r1 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r23) {
                r22 = this;
                r0 = r22
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.label
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L36
                if (r2 != r5) goto L2e
                int r2 = r0.I$3
                int r6 = r0.I$2
                long r7 = r0.J$0
                int r9 = r0.I$1
                int r10 = r0.I$0
                java.lang.Object r11 = r0.L$3
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.L$2
                androidx.collection.MutableScatterMap r12 = (androidx.collection.MutableScatterMap) r12
                java.lang.Object r13 = r0.L$1
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r13 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) r13
                java.lang.Object r14 = r0.L$0
                kotlin.sequences.o r14 = (kotlin.sequences.o) r14
                kotlin.g0.n(r23)
                goto La9
            L2e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L36:
                kotlin.g0.n(r23)
                java.lang.Object r2 = r0.L$0
                kotlin.sequences.o r2 = (kotlin.sequences.o) r2
                androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r7 = r0.this$1
                long[] r8 = r6.metadata
                int r9 = r8.length
                int r9 = r9 + (-2)
                if (r9 < 0) goto Lc5
                r10 = 0
            L49:
                r11 = r8[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r17 == 0) goto Lbe
                int r13 = r10 - r9
                int r13 = ~r13
                int r13 = r13 >>> 31
                int r13 = 8 - r13
                r14 = r10
                r10 = r9
                r9 = r14
                r14 = r2
                r2 = 0
                r20 = r11
                r12 = r6
                r11 = r8
                r6 = r13
                r13 = r7
                r7 = r20
            L6d:
                if (r2 >= r6) goto Lb3
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r7
                r17 = 128(0x80, double:6.3E-322)
                int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r19 >= 0) goto La9
                int r15 = r9 << 3
                int r15 = r15 + r2
                r13.setCurrent(r15)
                androidx.collection.MutableMapEntry r15 = new androidx.collection.MutableMapEntry
                java.lang.Object[] r3 = r12.keys
                r17 = 8
                java.lang.Object[] r4 = r12.values
                int r5 = r13.getCurrent()
                r15.<init>(r3, r4, r5)
                r0.L$0 = r14
                r0.L$1 = r13
                r0.L$2 = r12
                r0.L$3 = r11
                r0.I$0 = r10
                r0.I$1 = r9
                r0.J$0 = r7
                r0.I$2 = r6
                r0.I$3 = r2
                r3 = 1
                r0.label = r3
                java.lang.Object r4 = r14.c(r15, r0)
                if (r4 != r1) goto Lac
                return r1
            La9:
                r3 = 1
                r17 = 8
            Lac:
                long r7 = r7 >> r17
                int r2 = r2 + r3
                r4 = 8
                r5 = 1
                goto L6d
            Lb3:
                r3 = 1
                if (r6 != r4) goto Lc5
                r2 = r10
                r10 = r9
                r9 = r2
                r8 = r11
                r6 = r12
                r7 = r13
                r2 = r14
                goto Lbf
            Lbe:
                r3 = 1
            Lbf:
                if (r10 == r9) goto Lc5
                int r10 = r10 + 1
                r5 = 1
                goto L49
            Lc5:
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(androidx.collection.MutableScatterMap<K, V> r3) {
            r2 = this;
            r2.this$0 = r3
            r2.<init>()
            r0 = -1
            r2.current = r0
            androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            java.util.Iterator r3 = kotlin.sequences.p.a(r0)
            r2.iterator = r3
            return
    }

    public final int getCurrent() {
            r1 = this;
            int r0 = r1.current
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<java.util.Map.Entry<K, V>> getIterator() {
            r1 = this;
            java.util.Iterator<? extends java.util.Map$Entry<K, V>> r0 = r1.iterator
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends java.util.Map$Entry<K, V>> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.util.Map$Entry r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    @org.jetbrains.annotations.NotNull
    public java.util.Map.Entry<K, V> next() {
            r1 = this;
            java.util.Iterator<? extends java.util.Map$Entry<K, V>> r0 = r1.iterator
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r3 = this;
            int r0 = r3.current
            r1 = -1
            if (r0 == r1) goto Lc
            androidx.collection.MutableScatterMap<K, V> r2 = r3.this$0
            r2.removeValueAt(r0)
            r3.current = r1
        Lc:
            return
    }

    public final void setCurrent(int r1) {
            r0 = this;
            r0.current = r1
            return
    }

    public final void setIterator(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends java.util.Map.Entry<K, V>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.iterator = r2
            return
    }
}
