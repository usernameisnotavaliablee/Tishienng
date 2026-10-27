package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n1726#2,3:1851\n363#3,6:1854\n373#3,3:1861\n376#3,9:1865\n363#3,6:1874\n373#3,3:1881\n376#3,9:1885\n633#3:1894\n634#3:1898\n636#3,2:1900\n638#3,4:1903\n642#3:1910\n643#3:1914\n644#3:1916\n645#3,4:1919\n651#3:1924\n652#3,8:1926\n1826#4:1860\n1688#4:1864\n1826#4:1880\n1688#4:1884\n1605#4,3:1895\n1619#4:1899\n1615#4:1902\n1795#4,3:1907\n1809#4,3:1911\n1733#4:1915\n1721#4:1917\n1715#4:1918\n1728#4:1923\n1818#4:1925\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1\n*L\n1358#1:1851,3\n1376#1:1854,6\n1376#1:1861,3\n1376#1:1865,9\n1398#1:1874,6\n1398#1:1881,3\n1398#1:1885,9\n1413#1:1894\n1413#1:1898\n1413#1:1900,2\n1413#1:1903,4\n1413#1:1910\n1413#1:1914\n1413#1:1916\n1413#1:1919,4\n1413#1:1924\n1413#1:1926,8\n1376#1:1860\n1376#1:1864\n1398#1:1880\n1398#1:1884\n1413#1:1895,3\n1413#1:1899\n1413#1:1902\n1413#1:1907,3\n1413#1:1911,3\n1413#1:1915\n1413#1:1917\n1413#1:1918\n1413#1:1923\n1413#1:1925\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1<K, V> implements java.util.Set<java.util.Map.Entry<K, V>>, l3.h {
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$entries$1(androidx.collection.MutableScatterMap<K, V> r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    public boolean add(@org.jetbrains.annotations.NotNull java.util.Map.Entry<K, V> r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.util.Map.Entry<K, V>> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            r0.clear()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = kotlin.jvm.internal.u0.I(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public boolean contains(@org.jetbrains.annotations.NotNull java.util.Map.Entry<K, V> r3) {
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.collection.MutableScatterMap<K, V> r0 = r2.this$0
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r3 = r3.getValue()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            androidx.collection.MutableScatterMap<K, V> r0 = r4.this$0
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r3 = r0.get(r3)
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r1 != 0) goto L18
            r5 = 0
            return r5
        L38:
            return r2
    }

    public int getSize() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            int r0 = r0._size
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r2 = this;
            androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = kotlin.jvm.internal.u0.I(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r1.remove(r2)
            return r2
    }

    public boolean remove(@org.jetbrains.annotations.NotNull java.util.Map.Entry<K, V> r22) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "element"
            r2 = r22
            kotlin.jvm.internal.g0.p(r2, r1)
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            java.lang.Object r3 = r2.getKey()
            if (r3 == 0) goto L16
            int r5 = r3.hashCode()
            goto L17
        L16:
            r5 = 0
        L17:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r5 = r5 ^ r6
            r6 = r5 & 127(0x7f, float:1.78E-43)
            int r7 = r1._capacity
            int r5 = r5 >>> 7
            r5 = r5 & r7
            r8 = 0
        L27:
            long[] r9 = r1.metadata
            int r10 = r5 >> 3
            r11 = r5 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            r16 = r5
            r15 = 0
            long r4 = (long) r11
            long r4 = -r4
            r11 = 63
            long r4 = r4 >> r11
            long r4 = r4 & r9
            long r4 = r4 | r12
            long r9 = (long) r6
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r11
            long r9 = r9 ^ r4
            long r11 = r9 - r11
            long r9 = ~r9
            long r9 = r9 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
        L57:
            r17 = 0
            int r13 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r13 == 0) goto L7b
            int r13 = java.lang.Long.numberOfTrailingZeros(r9)
            int r13 = r13 >> 3
            int r13 = r16 + r13
            r13 = r13 & r7
            r19 = r11
            java.lang.Object[] r11 = r1.keys
            r11 = r11[r13]
            boolean r11 = kotlin.jvm.internal.g0.g(r11, r3)
            if (r11 == 0) goto L73
            goto L88
        L73:
            r11 = 1
            long r11 = r9 - r11
            long r9 = r9 & r11
            r11 = r19
            goto L57
        L7b:
            r19 = r11
            long r9 = ~r4
            r11 = 6
            long r9 = r9 << r11
            long r4 = r4 & r9
            long r4 = r4 & r19
            int r9 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r9 == 0) goto La1
            r13 = -1
        L88:
            if (r13 < 0) goto La0
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            java.lang.Object[] r1 = r1.values
            r1 = r1[r13]
            java.lang.Object r2 = r2.getValue()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto La0
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            r1.removeValueAt(r13)
            return r14
        La0:
            return r15
        La1:
            int r8 = r8 + 8
            int r5 = r16 + r8
            r5 = r5 & r7
            goto L27
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r19) {
            r18 = this;
            java.lang.String r0 = "elements"
            r1 = r19
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = r18
            androidx.collection.MutableScatterMap<K, V> r2 = r0.this$0
            long[] r3 = r2.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L8f
            r6 = 0
            r7 = 0
        L14:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L87
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2e:
            if (r12 >= r10) goto L7f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L74
            int r13 = r6 << 3
            int r13 = r13 + r12
            java.util.Iterator r14 = r1.iterator()
        L40:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L74
            java.lang.Object r15 = r14.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            r16 = 0
            java.lang.Object r5 = r15.getKey()
            r17 = 8
            java.lang.Object[] r11 = r2.keys
            r11 = r11[r13]
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r11)
            if (r5 == 0) goto L71
            java.lang.Object r5 = r15.getValue()
            java.lang.Object[] r11 = r2.values
            r11 = r11[r13]
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r11)
            if (r5 == 0) goto L71
            r2.removeValueAt(r13)
            r7 = 1
            goto L78
        L71:
            r11 = 8
            goto L40
        L74:
            r16 = 0
            r17 = 8
        L78:
            long r8 = r8 >> r17
            int r12 = r12 + 1
            r11 = 8
            goto L2e
        L7f:
            r5 = 8
            r16 = 0
            if (r10 != r5) goto L86
            goto L89
        L86:
            return r7
        L87:
            r16 = 0
        L89:
            if (r6 == r4) goto L8e
            int r6 = r6 + 1
            goto L14
        L8e:
            return r7
        L8f:
            r16 = 0
            return r16
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r19) {
            r18 = this;
            java.lang.String r0 = "elements"
            r1 = r19
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = r18
            androidx.collection.MutableScatterMap<K, V> r2 = r0.this$0
            long[] r3 = r2.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L94
            r6 = 0
            r7 = 0
        L14:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L8c
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2e:
            if (r12 >= r10) goto L84
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L79
            int r13 = r6 << 3
            int r13 = r13 + r12
            java.util.Iterator r14 = r1.iterator()
        L40:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L70
            java.lang.Object r15 = r14.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            r16 = 0
            java.lang.Object r5 = r15.getKey()
            r17 = 8
            java.lang.Object[] r11 = r2.keys
            r11 = r11[r13]
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r11)
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r15.getValue()
            java.lang.Object[] r11 = r2.values
            r11 = r11[r13]
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r11)
            if (r5 == 0) goto L6d
            goto L7d
        L6d:
            r11 = 8
            goto L40
        L70:
            r16 = 0
            r17 = 8
            r2.removeValueAt(r13)
            r7 = 1
            goto L7d
        L79:
            r16 = 0
            r17 = 8
        L7d:
            long r8 = r8 >> r17
            int r12 = r12 + 1
            r11 = 8
            goto L2e
        L84:
            r5 = 8
            r16 = 0
            if (r10 != r5) goto L8b
            goto L8e
        L8b:
            return r7
        L8c:
            r16 = 0
        L8e:
            if (r6 == r4) goto L93
            int r6 = r6 + 1
            goto L14
        L93:
            return r7
        L94:
            r16 = 0
            return r16
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = kotlin.jvm.internal.u.a(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object[] r2 = kotlin.jvm.internal.u.b(r1, r2)
            return r2
    }
}
