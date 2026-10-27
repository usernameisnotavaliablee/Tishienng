package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/ObservedTableStates\n+ 2 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,604:1\n28#2,5:605\n28#2,3:610\n32#2:615\n28#2,3:616\n32#2:621\n28#2,5:622\n28#2,5:627\n13423#3,2:613\n13423#3,2:619\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/ObservedTableStates\n*L\n508#1:605,5\n530#1:610,3\n530#1:615\n545#1:616,3\n545#1:621\n559#1:622,5\n565#1:627,5\n532#1:613,2\n547#1:619,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ObservedTableStates {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock lock;
    private boolean needsSync;

    @org.jetbrains.annotations.NotNull
    private final boolean[] tableObservedState;

    @org.jetbrains.annotations.NotNull
    private final long[] tableObserversCount;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ObserveOp extends java.lang.Enum<androidx.room.ObservedTableStates.ObserveOp> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.room.ObservedTableStates.ObserveOp[] $VALUES = null;
        public static final androidx.room.ObservedTableStates.ObserveOp ADD = null;
        public static final androidx.room.ObservedTableStates.ObserveOp NO_OP = null;
        public static final androidx.room.ObservedTableStates.ObserveOp REMOVE = null;

        private static final /* synthetic */ androidx.room.ObservedTableStates.ObserveOp[] $values() {
                r0 = 3
                androidx.room.ObservedTableStates$ObserveOp[] r0 = new androidx.room.ObservedTableStates.ObserveOp[r0]
                androidx.room.ObservedTableStates$ObserveOp r1 = androidx.room.ObservedTableStates.ObserveOp.NO_OP
                r2 = 0
                r0[r2] = r1
                androidx.room.ObservedTableStates$ObserveOp r1 = androidx.room.ObservedTableStates.ObserveOp.ADD
                r2 = 1
                r0[r2] = r1
                androidx.room.ObservedTableStates$ObserveOp r1 = androidx.room.ObservedTableStates.ObserveOp.REMOVE
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                androidx.room.ObservedTableStates$ObserveOp r0 = new androidx.room.ObservedTableStates$ObserveOp
                java.lang.String r1 = "NO_OP"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.room.ObservedTableStates.ObserveOp.NO_OP = r0
                androidx.room.ObservedTableStates$ObserveOp r0 = new androidx.room.ObservedTableStates$ObserveOp
                java.lang.String r1 = "ADD"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.room.ObservedTableStates.ObserveOp.ADD = r0
                androidx.room.ObservedTableStates$ObserveOp r0 = new androidx.room.ObservedTableStates$ObserveOp
                java.lang.String r1 = "REMOVE"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.room.ObservedTableStates.ObserveOp.REMOVE = r0
                androidx.room.ObservedTableStates$ObserveOp[] r0 = $values()
                androidx.room.ObservedTableStates.ObserveOp.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.room.ObservedTableStates.ObserveOp.$ENTRIES = r0
                return
        }

        ObserveOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.room.ObservedTableStates.ObserveOp> getEntries() {
                kotlin.enums.a r0 = androidx.room.ObservedTableStates.ObserveOp.$ENTRIES
                return r0
        }

        public static androidx.room.ObservedTableStates.ObserveOp valueOf(java.lang.String r1) {
                java.lang.Class<androidx.room.ObservedTableStates$ObserveOp> r0 = androidx.room.ObservedTableStates.ObserveOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.room.ObservedTableStates$ObserveOp r1 = (androidx.room.ObservedTableStates.ObserveOp) r1
                return r1
        }

        public static androidx.room.ObservedTableStates.ObserveOp[] values() {
                androidx.room.ObservedTableStates$ObserveOp[] r0 = androidx.room.ObservedTableStates.ObserveOp.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.room.ObservedTableStates$ObserveOp[] r0 = (androidx.room.ObservedTableStates.ObserveOp[]) r0
                return r0
        }
    }

    public ObservedTableStates(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.lock = r0
            long[] r0 = new long[r2]
            r1.tableObserversCount = r0
            boolean[] r2 = new boolean[r2]
            r1.tableObservedState = r2
            return
    }

    public final void forceNeedSync$room_runtime_release() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            r1 = 1
            r2.needsSync = r1     // Catch: java.lang.Throwable -> Le
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> Le
            r0.unlock()
            return
        Le:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @org.jetbrains.annotations.Nullable
    public final androidx.room.ObservedTableStates.ObserveOp[] getTablesToSync$room_runtime_release() {
            r14 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r14.lock
            r0.lock()
            boolean r1 = r14.needsSync     // Catch: java.lang.Throwable -> L35
            r2 = 0
            if (r1 != 0) goto Le
            r0.unlock()
            return r2
        Le:
            r1 = 0
            r14.needsSync = r1     // Catch: java.lang.Throwable -> L35
            long[] r3 = r14.tableObserversCount     // Catch: java.lang.Throwable -> L35
            int r3 = r3.length     // Catch: java.lang.Throwable -> L35
            androidx.room.ObservedTableStates$ObserveOp[] r4 = new androidx.room.ObservedTableStates.ObserveOp[r3]     // Catch: java.lang.Throwable -> L35
            r5 = 0
            r6 = 0
        L18:
            if (r5 >= r3) goto L45
            long[] r7 = r14.tableObserversCount     // Catch: java.lang.Throwable -> L35
            r8 = r7[r5]     // Catch: java.lang.Throwable -> L35
            r10 = 0
            r7 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L27
            r8 = 1
            goto L28
        L27:
            r8 = 0
        L28:
            boolean[] r9 = r14.tableObservedState     // Catch: java.lang.Throwable -> L35
            boolean r10 = r9[r5]     // Catch: java.lang.Throwable -> L35
            if (r8 == r10) goto L3a
            r9[r5] = r8     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L37
            androidx.room.ObservedTableStates$ObserveOp r6 = androidx.room.ObservedTableStates.ObserveOp.ADD     // Catch: java.lang.Throwable -> L35
            goto L3f
        L35:
            r1 = move-exception
            goto L4c
        L37:
            androidx.room.ObservedTableStates$ObserveOp r6 = androidx.room.ObservedTableStates.ObserveOp.REMOVE     // Catch: java.lang.Throwable -> L35
            goto L3f
        L3a:
            androidx.room.ObservedTableStates$ObserveOp r7 = androidx.room.ObservedTableStates.ObserveOp.NO_OP     // Catch: java.lang.Throwable -> L35
            r13 = r7
            r7 = r6
            r6 = r13
        L3f:
            r4[r5] = r6     // Catch: java.lang.Throwable -> L35
            int r5 = r5 + 1
            r6 = r7
            goto L18
        L45:
            if (r6 == 0) goto L48
            r2 = r4
        L48:
            r0.unlock()
            return r2
        L4c:
            r0.unlock()
            throw r1
    }

    public final boolean onObserverAdded$room_runtime_release(@org.jetbrains.annotations.NotNull int[] r11) {
            r10 = this;
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r10.lock
            r0.lock()
            int r1 = r11.length     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r3 = 0
        Ld:
            if (r2 >= r1) goto L29
            r4 = r11[r2]     // Catch: java.lang.Throwable -> L24
            long[] r5 = r10.tableObserversCount     // Catch: java.lang.Throwable -> L24
            r6 = r5[r4]     // Catch: java.lang.Throwable -> L24
            r8 = 1
            long r8 = r8 + r6
            r5[r4] = r8     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L26
            r3 = 1
            r10.needsSync = r3     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r11 = move-exception
            goto L2d
        L26:
            int r2 = r2 + 1
            goto Ld
        L29:
            r0.unlock()
            return r3
        L2d:
            r0.unlock()
            throw r11
    }

    public final boolean onObserverRemoved$room_runtime_release(@org.jetbrains.annotations.NotNull int[] r13) {
            r12 = this;
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r12.lock
            r0.lock()
            int r1 = r13.length     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r3 = 0
        Ld:
            if (r2 >= r1) goto L28
            r4 = r13[r2]     // Catch: java.lang.Throwable -> L23
            long[] r5 = r12.tableObserversCount     // Catch: java.lang.Throwable -> L23
            r6 = r5[r4]     // Catch: java.lang.Throwable -> L23
            r8 = 1
            long r10 = r6 - r8
            r5[r4] = r10     // Catch: java.lang.Throwable -> L23
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L25
            r3 = 1
            r12.needsSync = r3     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r13 = move-exception
            goto L2c
        L25:
            int r2 = r2 + 1
            goto Ld
        L28:
            r0.unlock()
            return r3
        L2c:
            r0.unlock()
            throw r13
    }

    public final void resetTriggerState$room_runtime_release() {
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r1 = r8.lock
            r1.lock()
            boolean[] r2 = r8.tableObservedState     // Catch: java.lang.Throwable -> L18
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            kotlin.collections.n.X1(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L18
            r0 = 1
            r8.needsSync = r0     // Catch: java.lang.Throwable -> L18
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L18
            r1.unlock()
            return
        L18:
            r0 = move-exception
            r1.unlock()
            throw r0
    }
}
