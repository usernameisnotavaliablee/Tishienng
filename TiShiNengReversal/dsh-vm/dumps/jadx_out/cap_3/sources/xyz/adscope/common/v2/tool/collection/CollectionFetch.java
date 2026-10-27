package xyz.adscope.common.v2.tool.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class CollectionFetch {
    private CollectionFetch() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <ITEM, WHICH> ITEM[] fetchAllFromArray(ITEM[] r6, WHICH r7, xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<ITEM, WHICH> r8) {
            if (r6 == 0) goto L26
            int r0 = r6.length
            if (r0 <= 0) goto L26
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r1) goto L1f
            r4 = r6[r3]
            if (r4 == 0) goto L1c
            boolean r5 = r8.fetch(r4, r7)
            if (r5 == 0) goto L1c
            r0.add(r4)
        L1c:
            int r3 = r3 + 1
            goto Ld
        L1f:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            return r6
        L26:
            r6 = 0
            return r6
    }

    public static <ITEM, WHICH> java.util.List<ITEM> fetchAllFromList(java.util.List<ITEM> r4, WHICH r5, xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<ITEM, WHICH> r6) {
            if (r4 == 0) goto L27
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Le:
            int r2 = r4.size()
            if (r1 >= r2) goto L26
            java.lang.Object r2 = r4.get(r1)
            if (r2 == 0) goto L23
            boolean r3 = r6.fetch(r2, r5)
            if (r3 == 0) goto L23
            r0.add(r2)
        L23:
            int r1 = r1 + 1
            goto Le
        L26:
            return r0
        L27:
            r4 = 0
            return r4
    }

    public static <ITEM, WHICH> ITEM fetchFirstFromArray(ITEM[] r4, WHICH r5, xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<ITEM, WHICH> r6) {
            if (r4 == 0) goto L14
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L14
            r2 = r4[r1]
            if (r2 == 0) goto L11
            boolean r3 = r6.fetch(r2, r5)
            if (r3 == 0) goto L11
            return r2
        L11:
            int r1 = r1 + 1
            goto L4
        L14:
            r4 = 0
            return r4
    }

    public static <ITEM, WHICH> ITEM fetchFirstFromList(java.util.List<ITEM> r3, WHICH r4, xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<ITEM, WHICH> r5) {
            if (r3 == 0) goto L1f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1f
            r0 = 0
        L9:
            int r1 = r3.size()
            if (r0 >= r1) goto L1f
            java.lang.Object r1 = r3.get(r0)
            if (r1 == 0) goto L1c
            boolean r2 = r5.fetch(r1, r4)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r0 = r0 + 1
            goto L9
        L1f:
            r3 = 0
            return r3
    }

    public static <ITEM, WHICH> boolean matchFromArray(ITEM[] r0, WHICH r1, xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<ITEM, WHICH> r2) {
            java.lang.Object r0 = fetchFirstFromArray(r0, r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static <ITEM, WHICH> boolean matchFromList(java.util.List<ITEM> r0, WHICH r1, xyz.adscope.common.v2.tool.collection.ICollectionFetchCompare<ITEM, WHICH> r2) {
            java.lang.Object r0 = fetchFirstFromList(r0, r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
