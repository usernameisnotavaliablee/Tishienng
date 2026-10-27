package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n363#2,6:1871\n373#2,3:1878\n376#2,9:1882\n363#2,6:1891\n373#2,3:1898\n376#2,9:1902\n1826#3:1857\n1688#3:1861\n1826#3:1877\n1688#3:1881\n1826#3:1897\n1688#3:1901\n1726#4,3:1911\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n*L\n1546#1:1851,6\n1546#1:1858,3\n1546#1:1862,9\n1557#1:1871,6\n1557#1:1878,3\n1557#1:1882,9\n1567#1:1891,6\n1567#1:1898,3\n1567#1:1902,9\n1546#1:1857\n1546#1:1861\n1557#1:1877\n1557#1:1881\n1567#1:1897\n1567#1:1901\n1577#1:1911,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1<V> implements java.util.Collection<V>, l3.b {
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$values$1(androidx.collection.MutableScatterMap<K, V> r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Collection
    public boolean add(V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Collection
    public void clear() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            r0.clear()
            return
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Collection
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            androidx.collection.MutableScatterMap<K, V> r0 = r3.this$0
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r4.next()
            boolean r1 = r0.containsValue(r1)
            if (r1 != 0) goto L18
            r4 = 0
            return r4
        L2a:
            return r2
    }

    public int getSize() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            int r0 = r0._size
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<V> iterator() {
            r2 = this;
            androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            long[] r2 = r1.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L58
            r5 = 0
        Ld:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L51
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = 0
        L27:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L46
            int r11 = r5 << 3
            int r11 = r11 + r10
            java.lang.Object[] r12 = r1.values
            r12 = r12[r11]
            r13 = r17
            boolean r12 = kotlin.jvm.internal.g0.g(r12, r13)
            if (r12 == 0) goto L48
            r1.removeValueAt(r11)
            r1 = 1
            return r1
        L46:
            r13 = r17
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L27
        L4c:
            r13 = r17
            if (r8 != r9) goto L58
            goto L53
        L51:
            r13 = r17
        L53:
            if (r5 == r3) goto L58
            int r5 = r5 + 1
            goto Ld
        L58:
            return r4
    }

    @Override // java.util.Collection
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r19) {
            r18 = this;
            r0 = r19
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r18
            androidx.collection.MutableScatterMap<K, V> r2 = r1.this$0
            long[] r3 = r2.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L5c
            r6 = 0
            r7 = 0
        L15:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L56
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2f:
            if (r12 >= r10) goto L52
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L4e
            int r13 = r6 << 3
            int r13 = r13 + r12
            r14 = r0
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object[] r15 = r2.values
            r15 = r15[r13]
            boolean r14 = kotlin.collections.f0.a2(r14, r15)
            if (r14 == 0) goto L4e
            r2.removeValueAt(r13)
            r7 = 1
        L4e:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2f
        L52:
            if (r10 != r11) goto L55
            goto L56
        L55:
            return r7
        L56:
            if (r6 == r4) goto L5b
            int r6 = r6 + 1
            goto L15
        L5b:
            return r7
        L5c:
            return r5
    }

    @Override // java.util.Collection
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r19) {
            r18 = this;
            r0 = r19
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r18
            androidx.collection.MutableScatterMap<K, V> r2 = r1.this$0
            long[] r3 = r2.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L5c
            r6 = 0
            r7 = 0
        L15:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L56
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2f:
            if (r12 >= r10) goto L52
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L4e
            int r13 = r6 << 3
            int r13 = r13 + r12
            r14 = r0
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object[] r15 = r2.values
            r15 = r15[r13]
            boolean r14 = kotlin.collections.f0.a2(r14, r15)
            if (r14 != 0) goto L4e
            r2.removeValueAt(r13)
            r7 = 1
        L4e:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2f
        L52:
            if (r10 != r11) goto L55
            goto L56
        L55:
            return r7
        L56:
            if (r6 == r4) goto L5b
            int r6 = r6 + 1
            goto L15
        L5b:
            return r7
        L5c:
            return r5
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = kotlin.jvm.internal.u.a(r1)
            return r0
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object[] r2 = kotlin.jvm.internal.u.b(r1, r2)
            return r2
    }
}
