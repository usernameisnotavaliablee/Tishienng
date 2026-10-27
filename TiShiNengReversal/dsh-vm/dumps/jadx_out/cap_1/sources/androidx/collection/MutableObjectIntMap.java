package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1074:1\n1064#1,2:1155\n1068#1,5:1163\n1064#1,2:1194\n1068#1,5:1202\n1064#1,2:1219\n1068#1,5:1227\n1064#1,2:1233\n1068#1,5:1241\n1#2:1075\n1672#3,6:1076\n1826#3:1092\n1688#3:1096\n1826#3:1114\n1688#3:1118\n1826#3:1139\n1688#3:1143\n1672#3,6:1157\n1672#3,6:1168\n1605#3,3:1174\n1615#3:1177\n1619#3:1178\n1795#3,3:1179\n1809#3,3:1182\n1733#3:1185\n1721#3:1186\n1715#3:1187\n1728#3:1188\n1818#3:1189\n1682#3:1190\n1661#3:1191\n1680#3:1192\n1661#3:1193\n1672#3,6:1196\n1795#3,3:1207\n1826#3:1210\n1715#3:1211\n1685#3:1212\n1661#3:1213\n1605#3,3:1214\n1615#3:1217\n1619#3:1218\n1672#3,6:1221\n1661#3:1232\n1672#3,6:1235\n1672#3,6:1246\n1672#3,6:1252\n401#4,4:1082\n373#4,6:1086\n383#4,3:1093\n386#4,2:1097\n406#4,2:1099\n389#4,6:1101\n408#4:1107\n373#4,6:1108\n383#4,3:1115\n386#4,9:1119\n267#5,4:1128\n237#5,7:1132\n248#5,3:1140\n251#5,2:1144\n272#5,2:1146\n254#5,6:1148\n274#5:1154\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n*L\n900#1:1155,2\n900#1:1163,5\n960#1:1194,2\n960#1:1202,5\n1034#1:1219,2\n1034#1:1227,5\n1050#1:1233,2\n1050#1:1241,5\n728#1:1076,6\n804#1:1092\n804#1:1096\n843#1:1114\n843#1:1118\n889#1:1139\n889#1:1143\n900#1:1157,6\n911#1:1168,6\n925#1:1174,3\n926#1:1177\n927#1:1178\n934#1:1179,3\n935#1:1182,3\n936#1:1185\n937#1:1186\n937#1:1187\n941#1:1188\n944#1:1189\n953#1:1190\n953#1:1191\n959#1:1192\n959#1:1193\n960#1:1196,6\n975#1:1207,3\n976#1:1210\n978#1:1211\n1029#1:1212\n1029#1:1213\n1031#1:1214,3\n1032#1:1217\n1034#1:1218\n1034#1:1221,6\n1048#1:1232\n1050#1:1235,6\n1065#1:1246,6\n1071#1:1252,6\n804#1:1082,4\n804#1:1086,6\n804#1:1093,3\n804#1:1097,2\n804#1:1099,2\n804#1:1101,6\n804#1:1107\n843#1:1108,6\n843#1:1115,3\n843#1:1119,9\n889#1:1128,4\n889#1:1132,7\n889#1:1140,3\n889#1:1144,2\n889#1:1146,2\n889#1:1148,6\n889#1:1154\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableObjectIntMap<K> extends androidx.collection.ObjectIntMap<K> {
    private int growthLimit;

    public MutableObjectIntMap() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableObjectIntMap(int r2) {
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

    public /* synthetic */ MutableObjectIntMap(int r1, int r2, kotlin.jvm.internal.v r3) {
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

    private final int findIndex(K r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            int r4 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            r6 = r4 & r5
            r7 = 0
        L1d:
            long[] r8 = r0.metadata
            int r9 = r6 >> 3
            r10 = r6 & 7
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
            long r10 = (long) r3
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r10 * r14
            r18 = r3
            long r2 = r8 ^ r16
            long r14 = r2 - r14
            long r2 = ~r2
            long r2 = r2 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r14
        L4d:
            r16 = 0
            int r19 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r19 == 0) goto L6f
            int r16 = java.lang.Long.numberOfTrailingZeros(r2)
            int r16 = r16 >> 3
            int r16 = r6 + r16
            r16 = r16 & r5
            java.lang.Object[] r12 = r0.keys
            r12 = r12[r16]
            boolean r12 = kotlin.jvm.internal.g0.g(r12, r1)
            if (r12 == 0) goto L68
            return r16
        L68:
            r16 = 1
            long r16 = r2 - r16
            long r2 = r2 & r16
            goto L4d
        L6f:
            long r2 = ~r8
            r12 = 6
            long r2 = r2 << r12
            long r2 = r2 & r8
            long r2 = r2 & r14
            int r8 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r8 == 0) goto Le3
            int r1 = r0.findFirstAvailableSlot(r4)
            int r2 = r0.growthLimit
            r5 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L9d
            long[] r2 = r0.metadata
            int r3 = r1 >> 3
            r7 = r2[r3]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r2 = r7 >> r2
            long r2 = r2 & r5
            r7 = 254(0xfe, double:1.255E-321)
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto L96
            goto L9d
        L96:
            r0.adjustStorage()
            int r1 = r0.findFirstAvailableSlot(r4)
        L9d:
            int r2 = r0._size
            int r2 = r2 + r13
            r0._size = r2
            int r2 = r0.growthLimit
            long[] r3 = r0.metadata
            int r4 = r1 >> 3
            r7 = r3[r4]
            r9 = r1 & 7
            int r9 = r9 << 3
            long r14 = r7 >> r9
            long r14 = r14 & r5
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 != 0) goto Lba
            r19 = 1
            goto Lbc
        Lba:
            r19 = 0
        Lbc:
            int r2 = r2 - r19
            r0.growthLimit = r2
            long r12 = r5 << r9
            long r12 = ~r12
            long r7 = r7 & r12
            long r12 = r10 << r9
            long r7 = r7 | r12
            r3[r4] = r7
            int r2 = r0._capacity
            int r4 = r1 + (-7)
            r4 = r4 & r2
            r2 = r2 & 7
            int r4 = r4 + r2
            int r2 = r4 >> 3
            r4 = r4 & 7
            int r4 = r4 << 3
            r7 = r3[r2]
            long r5 = r5 << r4
            long r5 = ~r5
            long r5 = r5 & r7
            long r7 = r10 << r4
            long r5 = r5 | r7
            r3[r2] = r5
            int r1 = ~r1
            return r1
        Le3:
            int r7 = r7 + 8
            int r6 = r6 + r7
            r6 = r6 & r5
            r3 = r18
            goto L1d
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
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.keys = r0
            int[] r2 = new int[r2]
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
            java.lang.Object[] r2 = r0.keys
            int[] r3 = r0.values
            int r4 = r0._capacity
            r21.initializeStorage(r22)
            java.lang.Object[] r5 = r0.keys
            int[] r6 = r0.values
            r8 = 0
        L12:
            if (r8 >= r4) goto L7c
            int r9 = r8 >> 3
            r9 = r1[r9]
            r11 = r8 & 7
            int r11 = r11 << 3
            long r9 = r9 >> r11
            r11 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r11
            r13 = 128(0x80, double:6.3E-322)
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 >= 0) goto L77
            r9 = r2[r8]
            if (r9 == 0) goto L2f
            int r10 = r9.hashCode()
            goto L30
        L2f:
            r10 = 0
        L30:
            r13 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r10 = r10 * r13
            int r13 = r10 << 16
            r10 = r10 ^ r13
            int r13 = r10 >>> 7
            int r13 = r0.findFirstAvailableSlot(r13)
            r10 = r10 & 127(0x7f, float:1.78E-43)
            long r14 = (long) r10
            long[] r10 = r0.metadata
            int r16 = r13 >> 3
            r17 = r13 & 7
            int r17 = r17 << 3
            r18 = r10[r16]
            r20 = r8
            long r7 = r11 << r17
            long r7 = ~r7
            long r7 = r18 & r7
            long r17 = r14 << r17
            long r7 = r7 | r17
            r10[r16] = r7
            int r7 = r0._capacity
            int r8 = r13 + (-7)
            r8 = r8 & r7
            r7 = r7 & 7
            int r8 = r8 + r7
            int r7 = r8 >> 3
            r8 = r8 & 7
            int r8 = r8 << 3
            r16 = r10[r7]
            long r11 = r11 << r8
            long r11 = ~r11
            long r11 = r16 & r11
            long r14 = r14 << r8
            long r11 = r11 | r14
            r10[r7] = r11
            r5[r13] = r9
            r7 = r3[r20]
            r6[r13] = r7
            goto L79
        L77:
            r20 = r8
        L79:
            int r8 = r20 + 1
            goto L12
        L7c:
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
            r10 = this;
            r0 = 0
            r10._size = r0
            long[] r1 = r10.metadata
            long[] r2 = androidx.collection.ScatterMapKt.EmptyGroup
            if (r1 == r2) goto L29
            r6 = 6
            r7 = 0
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r4 = 0
            r5 = 0
            kotlin.collections.n.U1(r1, r2, r4, r5, r6, r7)
            long[] r1 = r10.metadata
            int r2 = r10._capacity
            int r3 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r4 = r1[r3]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r2
            long r8 = ~r6
            long r4 = r4 & r8
            long r4 = r4 | r6
            r1[r3] = r4
        L29:
            java.lang.Object[] r1 = r10.keys
            r2 = 0
            int r3 = r10._capacity
            kotlin.collections.n.M1(r1, r2, r0, r3)
            r10.initializeGrowth()
            return
    }

    public final int getOrPut(K r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Integer> r3) {
            r1 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r1.findKeyIndex(r2)
            if (r0 < 0) goto L10
            int[] r2 = r1.values
            r2 = r2[r0]
            return r2
        L10:
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r1.set(r2, r3)
            return r3
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull androidx.collection.ScatterSet<K> r15) {
            r14 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.Object[] r0 = r15.elements
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

    public final void minusAssign(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends K> r2) {
            r1 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            r1.remove(r0)
            goto L9
        L17:
            return
    }

    public final void minusAssign(K r1) {
            r0 = this;
            r0.remove(r1)
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends K> r2) {
            r1 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            r1.remove(r0)
            goto L9
        L17:
            return
    }

    public final void minusAssign(@org.jetbrains.annotations.NotNull K[] r4) {
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

    public final void plusAssign(@org.jetbrains.annotations.NotNull androidx.collection.ObjectIntMap<K> r2) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.putAll(r2)
            return
    }

    public final int put(K r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.findIndex(r3)
            if (r0 >= 0) goto L8
            int r0 = ~r0
            goto Lc
        L8:
            int[] r5 = r2.values
            r5 = r5[r0]
        Lc:
            java.lang.Object[] r1 = r2.keys
            r1[r0] = r3
            int[] r3 = r2.values
            r3[r0] = r4
            return r5
    }

    public final void put(K r1, int r2) {
            r0 = this;
            r0.set(r1, r2)
            return
    }

    public final void putAll(@org.jetbrains.annotations.NotNull androidx.collection.ObjectIntMap<K> r17) {
            r16 = this;
            r0 = r17
            java.lang.String r1 = "from"
            kotlin.jvm.internal.g0.p(r0, r1)
            java.lang.Object[] r1 = r0.keys
            int[] r2 = r0.values
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
            r11 = r2[r11]
            r13 = r16
            r13.set(r12, r11)
            goto L48
        L46:
            r13 = r16
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2e
        L4c:
            r13 = r16
            if (r8 != r9) goto L5a
            goto L53
        L51:
            r13 = r16
        L53:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L14
        L58:
            r13 = r16
        L5a:
            return
    }

    public final void remove(K r1) {
            r0 = this;
            int r1 = r0.findKeyIndex(r1)
            if (r1 < 0) goto L9
            r0.removeValueAt(r1)
        L9:
            return
    }

    public final boolean remove(K r2, int r3) {
            r1 = this;
            int r2 = r1.findKeyIndex(r2)
            if (r2 < 0) goto L11
            int[] r0 = r1.values
            r0 = r0[r2]
            if (r0 != r3) goto L11
            r1.removeValueAt(r2)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final void removeIf(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super java.lang.Integer, java.lang.Boolean> r15) {
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.g0.p(r15, r0)
            long[] r0 = r14.metadata
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L5c
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
            if (r10 == 0) goto L57
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
        L28:
            if (r8 >= r6) goto L55
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L51
            int r9 = r3 << 3
            int r9 = r9 + r8
            java.lang.Object[] r10 = r14.keys
            r10 = r10[r9]
            int[] r11 = r14.values
            r11 = r11[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r15.invoke(r10, r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L51
            r14.removeValueAt(r9)
        L51:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L28
        L55:
            if (r6 != r7) goto L5c
        L57:
            if (r3 == r1) goto L5c
            int r3 = r3 + 1
            goto Le
        L5c:
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
            int r2 = r12 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            long r5 = r5 << r2
            long r5 = ~r5
            long r3 = r3 & r5
            long r5 = r7 << r2
            long r3 = r3 | r5
            r0[r1] = r3
            java.lang.Object[] r0 = r11.keys
            r1 = 0
            r0[r12] = r1
            return
    }

    public final void set(K r3, int r4) {
            r2 = this;
            int r0 = r2.findIndex(r3)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            java.lang.Object[] r1 = r2.keys
            r1[r0] = r3
            int[] r3 = r2.values
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
