package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInvalidationTracker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,592:1\n13497#2,3:593\n1755#3,3:596\n1863#3,2:599\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/ObserverWrapper\n*L\n532#1:593,3\n550#1:596,3\n558#1:599,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ObserverWrapper {

    @org.jetbrains.annotations.NotNull
    private final androidx.room.InvalidationTracker.Observer observer;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<java.lang.String> singleTableSet;

    @org.jetbrains.annotations.NotNull
    private final int[] tableIds;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] tableNames;

    public ObserverWrapper(@org.jetbrains.annotations.NotNull androidx.room.InvalidationTracker.Observer r2, @org.jetbrains.annotations.NotNull int[] r3, @org.jetbrains.annotations.NotNull java.lang.String[] r4) {
            r1 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.observer = r2
            r1.tableIds = r3
            r1.tableNames = r4
            int r2 = r3.length
            int r3 = r4.length
            if (r2 != r3) goto L33
            int r2 = r4.length
            r3 = 0
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 != 0) goto L2c
            r2 = r4[r3]
            java.util.Set r2 = kotlin.collections.u1.f(r2)
            goto L30
        L2c:
            java.util.Set r2 = kotlin.collections.u1.k()
        L30:
            r1.singleTableSet = r2
            return
        L33:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Check failed."
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.InvalidationTracker.Observer getObserver$room_runtime_release() {
            r1 = this;
            androidx.room.InvalidationTracker$Observer r0 = r1.observer
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final int[] getTableIds$room_runtime_release() {
            r1 = this;
            int[] r0 = r1.tableIds
            return r0
    }

    public final void notifyByTableIds$room_runtime_release(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.Integer> r8) {
            r7 = this;
            java.lang.String r0 = "invalidatedTablesIds"
            kotlin.jvm.internal.g0.p(r8, r0)
            int[] r0 = r7.tableIds
            int r1 = r0.length
            if (r1 == 0) goto L4a
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L36
            java.util.Set r0 = kotlin.collections.u1.d()
            int[] r1 = r7.tableIds
            int r3 = r1.length
            r4 = 0
        L16:
            if (r2 >= r3) goto L31
            r5 = r1[r2]
            int r6 = r4 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L2d
            java.lang.String[] r5 = r7.tableNames
            r4 = r5[r4]
            r0.add(r4)
        L2d:
            int r2 = r2 + 1
            r4 = r6
            goto L16
        L31:
            java.util.Set r8 = kotlin.collections.u1.a(r0)
            goto L4e
        L36:
            r0 = r0[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L45
            java.util.Set<java.lang.String> r8 = r7.singleTableSet
            goto L4e
        L45:
            java.util.Set r8 = kotlin.collections.u1.k()
            goto L4e
        L4a:
            java.util.Set r8 = kotlin.collections.u1.k()
        L4e:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L59
            androidx.room.InvalidationTracker$Observer r0 = r7.observer
            r0.onInvalidated(r8)
        L59:
            return
    }

    public final void notifyByTableNames$room_runtime_release(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r10) {
            r9 = this;
            java.lang.String r0 = "invalidatedTablesNames"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String[] r0 = r9.tableNames
            int r0 = r0.length
            if (r0 == 0) goto L6b
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L3c
            java.util.Set r0 = kotlin.collections.u1.d()
            java.util.Iterator r10 = r10.iterator()
        L16:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r10.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String[] r4 = r9.tableNames
            int r5 = r4.length
            r6 = 0
        L26:
            if (r6 >= r5) goto L16
            r7 = r4[r6]
            boolean r8 = kotlin.text.u.a2(r7, r3, r2)
            if (r8 == 0) goto L34
            r0.add(r7)
            goto L16
        L34:
            int r6 = r6 + 1
            goto L26
        L37:
            java.util.Set r10 = kotlin.collections.u1.a(r0)
            goto L6f
        L3c:
            boolean r0 = androidx.activity.k.a(r10)
            if (r0 == 0) goto L49
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L49
            goto L66
        L49:
            java.util.Iterator r10 = r10.iterator()
        L4d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r3 = r9.tableNames
            r3 = r3[r1]
            boolean r0 = kotlin.text.u.a2(r0, r3, r2)
            if (r0 == 0) goto L4d
            java.util.Set<java.lang.String> r10 = r9.singleTableSet
            goto L6f
        L66:
            java.util.Set r10 = kotlin.collections.u1.k()
            goto L6f
        L6b:
            java.util.Set r10 = kotlin.collections.u1.k()
        L6f:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L7a
            androidx.room.InvalidationTracker$Observer r0 = r9.observer
            r0.onInvalidated(r10)
        L7a:
            return
    }
}
