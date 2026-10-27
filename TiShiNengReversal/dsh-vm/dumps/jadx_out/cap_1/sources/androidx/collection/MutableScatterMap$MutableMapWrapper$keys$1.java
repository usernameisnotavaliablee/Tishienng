package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [K] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1850:1\n363#2,6:1851\n373#2,3:1858\n376#2,9:1862\n363#2,6:1871\n373#2,3:1878\n376#2,9:1882\n633#2:1891\n634#2:1895\n636#2,2:1897\n638#2,4:1900\n642#2:1907\n643#2:1911\n644#2:1913\n645#2,4:1916\n651#2:1921\n652#2,8:1923\n1826#3:1857\n1688#3:1861\n1826#3:1877\n1688#3:1881\n1605#3,3:1892\n1619#3:1896\n1615#3:1899\n1795#3,3:1904\n1809#3,3:1908\n1733#3:1912\n1721#3:1914\n1715#3:1915\n1728#3:1920\n1818#3:1922\n1726#4,3:1931\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n*L\n1466#1:1851,6\n1466#1:1858,3\n1466#1:1862,9\n1477#1:1871,6\n1477#1:1878,3\n1477#1:1882,9\n1487#1:1891\n1487#1:1895\n1487#1:1897,2\n1487#1:1900,4\n1487#1:1907\n1487#1:1911\n1487#1:1913\n1487#1:1916,4\n1487#1:1921\n1487#1:1923,8\n1466#1:1857\n1466#1:1861\n1477#1:1877\n1477#1:1881\n1487#1:1892,3\n1487#1:1896\n1487#1:1899\n1487#1:1904,3\n1487#1:1908,3\n1487#1:1912\n1487#1:1914\n1487#1:1915\n1487#1:1920\n1487#1:1922\n1496#1:1931,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1<K> implements java.util.Set<K>, l3.h {
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$keys$1(androidx.collection.MutableScatterMap<K, V> r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends K> r2) {
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
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
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
            boolean r1 = r0.containsKey(r1)
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

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<K> iterator() {
            r2 = this;
            androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            androidx.collection.MutableScatterMap<K, V> r2 = r0.this$0
            if (r1 == 0) goto Ld
            int r4 = r1.hashCode()
            goto Le
        Ld:
            r4 = 0
        Le:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r2._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L1e:
            long[] r8 = r2.metadata
            int r9 = r4 >> 3
            r10 = r4 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r5
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r14
            long r10 = r10 ^ r8
            long r14 = r10 - r14
            long r10 = ~r10
            long r10 = r10 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r14
        L4b:
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 == 0) goto L6d
            int r12 = java.lang.Long.numberOfTrailingZeros(r10)
            int r12 = r12 >> 3
            int r12 = r12 + r4
            r12 = r12 & r6
            r18 = 0
            java.lang.Object[] r3 = r2.keys
            r3 = r3[r12]
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r3 == 0) goto L66
            goto L79
        L66:
            r16 = 1
            long r16 = r10 - r16
            long r10 = r10 & r16
            goto L4b
        L6d:
            r18 = 0
            long r10 = ~r8
            r3 = 6
            long r10 = r10 << r3
            long r8 = r8 & r10
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 == 0) goto L82
            r12 = -1
        L79:
            if (r12 < 0) goto L81
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            r1.removeValueAt(r12)
            return r13
        L81:
            return r18
        L82:
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L1e
    }

    @Override // java.util.Set, java.util.Collection
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
            java.lang.Object[] r15 = r2.keys
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

    @Override // java.util.Set, java.util.Collection
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
            java.lang.Object[] r15 = r2.keys
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
