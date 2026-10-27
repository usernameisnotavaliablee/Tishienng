package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFloatLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/MutableFloatLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatLongMap.kt\nandroidx/collection/FloatLongMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatList.kt\nandroidx/collection/FloatList\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1047:1\n1037#1,2:1134\n1041#1,5:1142\n1037#1,2:1173\n1041#1,5:1181\n1037#1,2:1198\n1041#1,5:1206\n1037#1,2:1212\n1041#1,5:1220\n1#2:1048\n1672#3,6:1049\n1826#3:1065\n1688#3:1069\n1826#3:1087\n1688#3:1091\n1826#3:1112\n1688#3:1116\n1672#3,6:1136\n1672#3,6:1147\n1615#3:1156\n1619#3:1157\n1795#3,3:1158\n1809#3,3:1161\n1733#3:1164\n1721#3:1165\n1715#3:1166\n1728#3:1167\n1818#3:1168\n1682#3:1169\n1661#3:1170\n1680#3:1171\n1661#3:1172\n1672#3,6:1175\n1795#3,3:1186\n1826#3:1189\n1715#3:1190\n1685#3:1191\n1661#3:1192\n1615#3:1196\n1619#3:1197\n1672#3,6:1200\n1661#3:1211\n1672#3,6:1214\n1672#3,6:1225\n1672#3,6:1231\n385#4,4:1055\n357#4,6:1059\n367#4,3:1066\n370#4,2:1070\n389#4,2:1072\n373#4,6:1074\n391#4:1080\n357#4,6:1081\n367#4,3:1088\n370#4,9:1092\n262#5,4:1101\n232#5,7:1105\n243#5,3:1113\n246#5,2:1117\n266#5,2:1119\n249#5,6:1121\n268#5:1127\n253#6,6:1128\n849#7,3:1153\n849#7,3:1193\n*S KotlinDebug\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/MutableFloatLongMap\n*L\n875#1:1134,2\n875#1:1142,5\n933#1:1173,2\n933#1:1181,5\n1007#1:1198,2\n1007#1:1206,5\n1023#1:1212,2\n1023#1:1220,5\n711#1:1049,6\n789#1:1065\n789#1:1069\n828#1:1087\n828#1:1091\n855#1:1112\n855#1:1116\n875#1:1136,6\n885#1:1147,6\n899#1:1156\n900#1:1157\n907#1:1158,3\n908#1:1161,3\n909#1:1164\n910#1:1165\n910#1:1166\n914#1:1167\n917#1:1168\n926#1:1169\n926#1:1170\n932#1:1171\n932#1:1172\n933#1:1175,6\n948#1:1186,3\n949#1:1189\n951#1:1190\n1002#1:1191\n1002#1:1192\n1005#1:1196\n1007#1:1197\n1007#1:1200,6\n1021#1:1211\n1023#1:1214,6\n1038#1:1225,6\n1044#1:1231,6\n789#1:1055,4\n789#1:1059,6\n789#1:1066,3\n789#1:1070,2\n789#1:1072,2\n789#1:1074,6\n789#1:1080\n828#1:1081,6\n828#1:1088,3\n828#1:1092,9\n855#1:1101,4\n855#1:1105,7\n855#1:1113,3\n855#1:1117,2\n855#1:1119,2\n855#1:1121,6\n855#1:1127\n864#1:1128,6\n898#1:1153,3\n1004#1:1193,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableFloatLongMap extends androidx.collection.FloatLongMap {
    private int growthLimit;

    public MutableFloatLongMap() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableFloatLongMap(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r2 < 0) goto Le
            int r2 = androidx.collection.ScatterMapKt.unloadedCapacity(r2)
            r1.initializeStorage(r2)
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Capacity must be a positive value."
            r2.<init>(r0)
            throw r2
    }

    public /* synthetic */ MutableFloatLongMap(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 6
        L5:
            r0.<init>(r1)
            return
    }

    private final void adjustStorage() {
            r6 = this;
            int r0 = r6._capacity
            r1 = 8
            if (r0 <= r1) goto L2e
            int r0 = r6._size
            long r0 = (long) r0
            long r0 = kotlin.d1.k(r0)
            r2 = 32
            long r0 = r0 * r2
            long r0 = kotlin.d1.k(r0)
            int r2 = r6._capacity
            long r2 = (long) r2
            long r2 = kotlin.d1.k(r2)
            r4 = 25
            long r2 = r2 * r4
            long r2 = kotlin.d1.k(r2)
            int r0 = androidx.collection.a.a(r0, r2)
            if (r0 > 0) goto L2e
            r6.removeDeletedMarkers()
            return
        L2e:
            int r0 = r6._capacity
            int r0 = androidx.collection.ScatterMapKt.nextCapacity(r0)
            r6.resizeStorage(r0)
            return
    }

    private final int findFirstAvailableSlot(int r10) {
            r9 = this;
            int r0 = r9._capacity
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.metadata
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r2[r3]
            long r5 = r5 >>> r4
            int r3 = r3 + 1
            r7 = r2[r3]
            int r2 = 64 - r4
            long r2 = r7 << r2
            long r7 = (long) r4
            long r7 = -r7
            r4 = 63
            long r7 = r7 >> r4
            long r2 = r2 & r7
            long r2 = r2 | r5
            long r4 = ~r2
            r6 = 7
            long r4 = r4 << r6
            long r2 = r2 & r4
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L37
            int r1 = java.lang.Long.numberOfTrailingZeros(r2)
            int r1 = r1 >> 3
            int r10 = r10 + r1
            r10 = r10 & r0
            return r10
        L37:
            int r1 = r1 + 8
            int r10 = r10 + r1
            r10 = r10 & r0
            goto L4
    }

    private final int findInsertIndex(float r20) {
            r19 = this;
            r0 = r19
            int r1 = java.lang.Float.floatToIntBits(r20)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            r4 = r2 & r3
            r6 = 0
        L17:
            long[] r7 = r0.metadata
            int r8 = r4 >> 3
            r9 = r4 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r1
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r15 = r9 * r13
            r17 = r6
            long r5 = r7 ^ r15
            long r13 = r5 - r13
            long r5 = ~r5
            long r5 = r5 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r13
        L47:
            r15 = 0
            int r18 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r18 == 0) goto L64
            int r15 = java.lang.Long.numberOfTrailingZeros(r5)
            int r15 = r15 >> 3
            int r15 = r15 + r4
            r15 = r15 & r3
            float[] r11 = r0.keys
            r11 = r11[r15]
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 != 0) goto L5e
            return r15
        L5e:
            r15 = 1
            long r15 = r5 - r15
            long r5 = r5 & r15
            goto L47
        L64:
            long r5 = ~r7
            r11 = 6
            long r5 = r5 << r11
            long r5 = r5 & r7
            long r5 = r5 & r13
            int r7 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r7 == 0) goto Ld7
            int r1 = r0.findFirstAvailableSlot(r2)
            int r3 = r0.growthLimit
            r4 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto L91
            long[] r3 = r0.metadata
            int r6 = r1 >> 3
            r6 = r3[r6]
            r3 = r1 & 7
            int r3 = r3 << 3
            long r6 = r6 >> r3
            long r6 = r6 & r4
            r13 = 254(0xfe, double:1.255E-321)
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 != 0) goto L8a
            goto L91
        L8a:
            r0.adjustStorage()
            int r1 = r0.findFirstAvailableSlot(r2)
        L91:
            int r2 = r0._size
            int r2 = r2 + r12
            r0._size = r2
            int r2 = r0.growthLimit
            long[] r3 = r0.metadata
            int r6 = r1 >> 3
            r7 = r3[r6]
            r11 = r1 & 7
            int r11 = r11 << 3
            long r13 = r7 >> r11
            long r13 = r13 & r4
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto Lae
            r18 = 1
            goto Lb0
        Lae:
            r18 = 0
        Lb0:
            int r2 = r2 - r18
            r0.growthLimit = r2
            long r12 = r4 << r11
            long r12 = ~r12
            long r7 = r7 & r12
            long r11 = r9 << r11
            long r7 = r7 | r11
            r3[r6] = r7
            int r2 = r0._capacity
            int r6 = r1 + (-7)
            r6 = r6 & r2
            r2 = r2 & 7
            int r6 = r6 + r2
            int r2 = r6 >> 3
            r6 = r6 & 7
            int r6 = r6 << 3
            r7 = r3[r2]
            long r4 = r4 << r6
            long r4 = ~r4
            long r4 = r4 & r7
            long r6 = r9 << r6
            long r4 = r4 | r6
            r3[r2] = r4
            int r1 = ~r1
            return r1
        Ld7:
            int r6 = r17 + 8
            int r4 = r4 + r6
            r4 = r4 & r3
            goto L17
    }

    private final void initializeGrowth() {
            r2 = this;
            int r0 = r2.getCapacity()
            int r0 = androidx.collection.ScatterMapKt.loadedCapacity(r0)
            int r1 = r2._size
            int r0 = r0 - r1
            r2.growthLimit = r0
            return
    }

    private final void initializeMetadata(int r9) {
            r8 = this;
            if (r9 != 0) goto L5
            long[] r0 = androidx.collection.ScatterMapKt.EmptyGroup
            goto L1a
        L5:
            int r0 = r9 + 15
            r0 = r0 & (-8)
            int r0 = r0 >> 3
            long[] r1 = new long[r0]
            r6 = 6
            r7 = 0
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r4 = 0
            r5 = 0
            kotlin.collections.n.U1(r1, r2, r4, r5, r6, r7)
            r0 = r1
        L1a:
            r8.metadata = r0
            int r1 = r9 >> 3
            r9 = r9 & 7
            int r9 = r9 << 3
            r2 = r0[r1]
            r4 = 255(0xff, double:1.26E-321)
            long r4 = r4 << r9
            long r6 = ~r4
            long r2 = r2 & r6
            long r2 = r2 | r4
            r0[r1] = r2
            r8.initializeGrowth()
            return
    }

    private final void initializeStorage(int r2) {
            r1 = this;
            if (r2 <= 0) goto Lc
            r0 = 7
            int r2 = androidx.collection.ScatterMapKt.normalizeCapacity(r2)
            int r2 = java.lang.Math.max(r0, r2)
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1._capacity = r2
            r1.initializeMetadata(r2)
            float[] r0 = new float[r2]
            r1.keys = r0
            long[] r2 = new long[r2]
            r1.values = r2
            return
    }

    private final void removeDeletedMarkers() {
            r14 = this;
            long[] r0 = r14.metadata
            int r1 = r14._capacity
            r2 = 0
            r3 = 0
        L6:
            if (r2 >= r1) goto L47
            int r4 = r2 >> 3
            r5 = r0[r4]
            r7 = r2 & 7
            int r7 = r7 << 3
            long r5 = r5 >> r7
            r8 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r8
            r10 = 254(0xfe, double:1.255E-321)
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 != 0) goto L44
            long[] r5 = r14.metadata
            r10 = r5[r4]
            long r12 = r8 << r7
            long r12 = ~r12
            long r10 = r10 & r12
            r12 = 128(0x80, double:6.3E-322)
            long r6 = r12 << r7
            long r6 = r6 | r10
            r5[r4] = r6
            int r4 = r14._capacity
            int r6 = r2 + (-7)
            r6 = r6 & r4
            r4 = r4 & 7
            int r6 = r6 + r4
            int r4 = r6 >> 3
            r6 = r6 & 7
            int r6 = r6 << 3
            r10 = r5[r4]
            long r7 = r8 << r6
            long r7 = ~r7
            long r7 = r7 & r10
            long r9 = r12 << r6
            long r7 = r7 | r9
            r5[r4] = r7
            int r3 = r3 + 1
        L44:
            int r2 = r2 + 1
            goto L6
        L47:
            int r0 = r14.growthLimit
            int r0 = r0 + r3
            r14.growthLimit = r0
            return
    }

    private final void resizeStorage(int r22) {
            r21 = this;
            r0 = r21
            long[] r1 = r0.metadata
            float[] r2 = r0.keys
            long[] r3 = r0.values
            int r4 = r0._capacity
            r21.initializeStorage(r22)
            float[] r5 = r0.keys
            long[] r6 = r0.values
            r7 = 0
        L12:
            if (r7 >= r4) goto L7e
            int r8 = r7 >> 3
            r8 = r1[r8]
            r10 = r7 & 7
            int r10 = r10 << 3
            long r8 = r8 >> r10
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r10
            r12 = 128(0x80, double:6.3E-322)
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 >= 0) goto L75
            r8 = r2[r7]
            int r9 = java.lang.Float.floatToIntBits(r8)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r9 = r9 * r12
            int r12 = r9 << 16
            r9 = r9 ^ r12
            int r12 = r9 >>> 7
            int r12 = r0.findFirstAvailableSlot(r12)
            r9 = r9 & 127(0x7f, float:1.78E-43)
            long r13 = (long) r9
            long[] r9 = r0.metadata
            int r15 = r12 >> 3
            r16 = r12 & 7
            int r16 = r16 << 3
            r17 = r9[r15]
            r19 = r10
            long r10 = r19 << r16
            long r10 = ~r10
            long r10 = r17 & r10
            long r16 = r13 << r16
            long r10 = r10 | r16
            r9[r15] = r10
            int r10 = r0._capacity
            int r11 = r12 + (-7)
            r11 = r11 & r10
            r10 = r10 & 7
            int r11 = r11 + r10
            int r10 = r11 >> 3
            r11 = r11 & 7
            int r11 = r11 << 3
            r15 = r9[r10]
            r17 = r1
            long r0 = r19 << r11
            long r0 = ~r0
            long r0 = r0 & r15
            long r13 = r13 << r11
            long r0 = r0 | r13
            r9[r10] = r0
            r5[r12] = r8
            r0 = r3[r7]
            r6[r12] = r0
            goto L77
        L75:
            r17 = r1
        L77:
            int r7 = r7 + 1
            r0 = r21
            r1 = r17
            goto L12
        L7e:
            return
    }

    private final void writeMetadata(int r10, long r11) {
            r9 = this;
            long[] r0 = r9.metadata
            int r1 = r10 >> 3
            r2 = r10 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r7 = r5 << r2
            long r7 = ~r7
            long r3 = r3 & r7
            long r7 = r11 << r2
            long r3 = r3 | r7
            r0[r1] = r3
            int r1 = r9._capacity
            int r10 = r10 + (-7)
            r10 = r10 & r1
            r1 = r1 & 7
            int r10 = r10 + r1
            int r1 = r10 >> 3
            r10 = r10 & 7
            int r10 = r10 << 3
            r2 = r0[r1]
            long r4 = r5 << r10
            long r4 = ~r4
            long r2 = r2 & r4
            long r10 = r11 << r10
            long r10 = r10 | r2
            r0[r1] = r10
            return
    }

    public final void clear() {
            r9 = this;
            r0 = 0
            r9._size = r0
            long[] r1 = r9.metadata
            long[] r0 = androidx.collection.ScatterMapKt.EmptyGroup
            if (r1 == r0) goto L29
            r6 = 6
            r7 = 0
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r4 = 0
            r5 = 0
            kotlin.collections.n.U1(r1, r2, r4, r5, r6, r7)
            long[] r0 = r9.metadata
            int r1 = r9._capacity
            int r2 = r1 >> 3
            r1 = r1 & 7
            int r1 = r1 << 3
            r3 = r0[r2]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r1
            long r7 = ~r5
            long r3 = r3 & r7
            long r3 = r3 | r5
            r0[r2] = r3
        L29:
            r9.initializeGrowth()
            return
    }

    public final long getOrPut(float r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Long> r4) {
            r2 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r2.findKeyIndex(r3)
            if (r0 >= 0) goto L19
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            r2.put(r3, r0)
            return r0
        L19:
            long[] r3 = r2.values
            r0 = r3[r0]
            return r0
    }

    public final void minusAssign(float r1) {
            r0 = this;
            r0.remove(r1)
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull androidx.collection.FloatList r4) {
            r3 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r4, r0)
            float[] r0 = r4.content
            int r4 = r4._size
            r1 = 0
        La:
            if (r1 >= r4) goto L14
            r2 = r0[r1]
            r3.remove(r2)
            int r1 = r1 + 1
            goto La
        L14:
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull androidx.collection.FloatSet r15) {
            r14 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r15, r0)
            float[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r1 = r15.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L48
            r2 = 0
            r3 = 0
        L10:
            r4 = r15[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
        L2a:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r14.remove(r9)
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L2a
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto L10
        L48:
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull float[] r4) {
            r3 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L11
            r2 = r4[r1]
            r3.remove(r2)
            int r1 = r1 + 1
            goto L7
        L11:
            return
    }

    public final void plusAssign(@org.jetbrains.annotations.NotNull androidx.collection.FloatLongMap r2) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.putAll(r2)
            return
    }

    public final long put(float r4, long r5, long r7) {
            r3 = this;
            int r0 = r3.findInsertIndex(r4)
            if (r0 >= 0) goto L8
            int r0 = ~r0
            goto Ld
        L8:
            long[] r7 = r3.values
            r1 = r7[r0]
            r7 = r1
        Ld:
            float[] r1 = r3.keys
            r1[r0] = r4
            long[] r4 = r3.values
            r4[r0] = r5
            return r7
    }

    public final void put(float r1, long r2) {
            r0 = this;
            r0.set(r1, r2)
            return
    }

    public final void putAll(@org.jetbrains.annotations.NotNull androidx.collection.FloatLongMap r17) {
            r16 = this;
            r0 = r17
            java.lang.String r1 = "from"
            kotlin.jvm.internal.g0.p(r0, r1)
            float[] r1 = r0.keys
            long[] r2 = r0.values
            long[] r0 = r0.metadata
            int r3 = r0.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = 0
            r5 = 0
        L14:
            r6 = r0[r5]
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
        L2e:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L46
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r13 = r2[r11]
            r11 = r16
            r11.set(r12, r13)
            goto L48
        L46:
            r11 = r16
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2e
        L4c:
            r11 = r16
            if (r8 != r9) goto L5a
            goto L53
        L51:
            r11 = r16
        L53:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L14
        L58:
            r11 = r16
        L5a:
            return
    }

    public final void remove(float r1) {
            r0 = this;
            int r1 = r0.findKeyIndex(r1)
            if (r1 < 0) goto L9
            r0.removeValueAt(r1)
        L9:
            return
    }

    public final boolean remove(float r4, long r5) {
            r3 = this;
            int r4 = r3.findKeyIndex(r4)
            if (r4 < 0) goto L13
            long[] r0 = r3.values
            r1 = r0[r4]
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L13
            r3.removeValueAt(r4)
            r4 = 1
            return r4
        L13:
            r4 = 0
            return r4
    }

    public final void removeIf(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Long, java.lang.Boolean> r15) {
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r15, r0)
            long[] r0 = r14.metadata
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L60
            r2 = 0
            r3 = 0
        Le:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L5b
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
        L28:
            if (r8 >= r6) goto L59
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L55
            int r9 = r3 << 3
            int r9 = r9 + r8
            float[] r10 = r14.keys
            r10 = r10[r9]
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            long[] r11 = r14.values
            r12 = r11[r9]
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            java.lang.Object r10 = r15.invoke(r10, r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L55
            r14.removeValueAt(r9)
        L55:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L28
        L59:
            if (r6 != r7) goto L60
        L5b:
            if (r3 == r1) goto L60
            int r3 = r3 + 1
            goto Le
        L60:
            return
    }

    @kotlin.PublishedApi
    public final void removeValueAt(int r12) {
            r11 = this;
            int r0 = r11._size
            int r0 = r0 + (-1)
            r11._size = r0
            long[] r0 = r11.metadata
            int r1 = r12 >> 3
            r2 = r12 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r7 = r5 << r2
            long r7 = ~r7
            long r3 = r3 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r9 = r7 << r2
            long r3 = r3 | r9
            r0[r1] = r3
            int r1 = r11._capacity
            int r12 = r12 + (-7)
            r12 = r12 & r1
            r1 = r1 & 7
            int r12 = r12 + r1
            int r1 = r12 >> 3
            r12 = r12 & 7
            int r12 = r12 << 3
            r2 = r0[r1]
            long r4 = r5 << r12
            long r4 = ~r4
            long r2 = r2 & r4
            long r4 = r7 << r12
            long r2 = r2 | r4
            r0[r1] = r2
            return
    }

    public final void set(float r3, long r4) {
            r2 = this;
            int r0 = r2.findInsertIndex(r3)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            float[] r1 = r2.keys
            r1[r0] = r3
            long[] r3 = r2.values
            r3[r0] = r4
            return
    }

    public final int trim() {
            r2 = this;
            int r0 = r2._capacity
            int r1 = r2._size
            int r1 = androidx.collection.ScatterMapKt.unloadedCapacity(r1)
            int r1 = androidx.collection.ScatterMapKt.normalizeCapacity(r1)
            if (r1 >= r0) goto L15
            r2.resizeStorage(r1)
            int r1 = r2._capacity
            int r0 = r0 - r1
            return r0
        L15:
            r0 = 0
            return r0
    }
}
