package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CoroutinesRoom {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.CoroutinesRoom.Companion Companion = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutinesRoom.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.android.kt\nandroidx/room/CoroutinesRoom$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,93:1\n314#2,11:94\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.android.kt\nandroidx/room/CoroutinesRoom$Companion\n*L\n65#1:94,11\n*E\n"})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ java.lang.Object a(java.util.concurrent.Callable r0, androidx.sqlite.SQLiteConnection r1) {
                java.lang.Object r0 = createFlow$lambda$1(r0, r1)
                return r0
        }

        private static final java.lang.Object createFlow$lambda$1(java.util.concurrent.Callable r1, androidx.sqlite.SQLiteConnection r2) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r1 = r1.call()
                return r1
        }

        @kotlin.Deprecated(message = "No longer called by generated implementation")
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final <R> kotlinx.coroutines.flow.i<R> createFlow(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2, boolean r3, @org.jetbrains.annotations.NotNull java.lang.String[] r4, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<R> r5) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "tableNames"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "callable"
                kotlin.jvm.internal.g0.p(r5, r0)
                androidx.room.e r0 = new androidx.room.e
                r0.<init>(r5)
                kotlinx.coroutines.flow.i r2 = androidx.room.coroutines.FlowUtil.createFlow(r2, r3, r4, r0)
                return r2
        }

        @kotlin.Deprecated(message = "No longer called by generated implementation")
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public final <R> java.lang.Object execute(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r17, boolean r18, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r19, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<R> r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r21) {
                r16 = this;
                r0 = r17
                r1 = r21
                boolean r2 = r1 instanceof androidx.room.CoroutinesRoom$Companion$execute$3
                if (r2 == 0) goto L19
                r2 = r1
                androidx.room.CoroutinesRoom$Companion$execute$3 r2 = (androidx.room.CoroutinesRoom$Companion$execute$3) r2
                int r3 = r2.label
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L19
                int r3 = r3 - r4
                r2.label = r3
                r3 = r16
                goto L20
            L19:
                androidx.room.CoroutinesRoom$Companion$execute$3 r2 = new androidx.room.CoroutinesRoom$Companion$execute$3
                r3 = r16
                r2.<init>(r3, r1)
            L20:
                java.lang.Object r1 = r2.result
                java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
                int r5 = r2.label
                r6 = 2
                r7 = 1
                if (r5 == 0) goto L61
                if (r5 == r7) goto L4c
                if (r5 != r6) goto L44
                java.lang.Object r0 = r2.L$3
                kotlin.coroutines.i r0 = (kotlin.coroutines.i) r0
                java.lang.Object r0 = r2.L$2
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.lang.Object r0 = r2.L$1
                android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
                java.lang.Object r0 = r2.L$0
                androidx.room.RoomDatabase r0 = (androidx.room.RoomDatabase) r0
                kotlin.g0.n(r1)
                return r1
            L44:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L4c:
                java.lang.Object r0 = r2.L$2
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.lang.Object r5 = r2.L$1
                android.os.CancellationSignal r5 = (android.os.CancellationSignal) r5
                java.lang.Object r8 = r2.L$0
                androidx.room.RoomDatabase r8 = (androidx.room.RoomDatabase) r8
                kotlin.g0.n(r1)
                r15 = r5
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r15
                goto L8a
            L61:
                kotlin.g0.n(r1)
                boolean r1 = r0.isOpenInternal()
                if (r1 == 0) goto L75
                boolean r1 = r0.inTransaction()
                if (r1 == 0) goto L75
                java.lang.Object r0 = r20.call()
                return r0
            L75:
                r2.L$0 = r0
                r1 = r19
                r2.L$1 = r1
                r5 = r20
                r2.L$2 = r5
                r2.label = r7
                r8 = r18
                java.lang.Object r8 = androidx.room.util.DBUtil.getCoroutineContext(r0, r8, r2)
                if (r8 != r4) goto L8a
                goto Lcb
            L8a:
                r10 = r8
                kotlin.coroutines.i r10 = (kotlin.coroutines.i) r10
                r2.L$0 = r0
                r2.L$1 = r1
                r2.L$2 = r5
                r2.L$3 = r10
                r2.label = r6
                kotlinx.coroutines.q r6 = new kotlinx.coroutines.q
                kotlin.coroutines.e r8 = kotlin.coroutines.intrinsics.a.e(r2)
                r6.<init>(r8, r7)
                r6.Q()
                kotlinx.coroutines.r0 r9 = r0.getCoroutineScope()
                androidx.room.CoroutinesRoom$Companion$execute$4$job$1 r12 = new androidx.room.CoroutinesRoom$Companion$execute$4$job$1
                r0 = 0
                r12.<init>(r5, r6, r0)
                r13 = 2
                r14 = 0
                r11 = 0
                kotlinx.coroutines.e2 r0 = kotlinx.coroutines.i.e(r9, r10, r11, r12, r13, r14)
                androidx.room.CoroutinesRoom$Companion$execute$4$1 r5 = new androidx.room.CoroutinesRoom$Companion$execute$4$1
                r5.<init>(r1, r0)
                r6.I(r5)
                java.lang.Object r0 = r6.x()
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                if (r0 != r1) goto Lc9
                kotlin.coroutines.jvm.internal.e.c(r2)
            Lc9:
                if (r0 != r4) goto Lcc
            Lcb:
                return r4
            Lcc:
                return r0
        }

        @kotlin.Deprecated(message = "No longer called by generated implementation")
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.Nullable
        public final <R> java.lang.Object execute(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r6, boolean r7, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<R> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r9) {
                r5 = this;
                boolean r0 = r9 instanceof androidx.room.CoroutinesRoom$Companion$execute$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.room.CoroutinesRoom$Companion$execute$1 r0 = (androidx.room.CoroutinesRoom$Companion$execute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.CoroutinesRoom$Companion$execute$1 r0 = new androidx.room.CoroutinesRoom$Companion$execute$1
                r0.<init>(r5, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3d
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.g0.n(r9)
                return r9
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.L$0
                r8 = r6
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                kotlin.g0.n(r9)
                goto L5c
            L3d:
                kotlin.g0.n(r9)
                boolean r9 = r6.isOpenInternal()
                if (r9 == 0) goto L51
                boolean r9 = r6.inTransaction()
                if (r9 == 0) goto L51
                java.lang.Object r6 = r8.call()
                return r6
            L51:
                r0.L$0 = r8
                r0.label = r4
                java.lang.Object r9 = androidx.room.util.DBUtil.getCoroutineContext(r6, r7, r0)
                if (r9 != r1) goto L5c
                goto L6e
            L5c:
                kotlin.coroutines.i r9 = (kotlin.coroutines.i) r9
                androidx.room.CoroutinesRoom$Companion$execute$2 r6 = new androidx.room.CoroutinesRoom$Companion$execute$2
                r7 = 0
                r6.<init>(r8, r7)
                r0.L$0 = r7
                r0.label = r3
                java.lang.Object r6 = kotlinx.coroutines.i.h(r9, r6, r0)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                return r6
        }
    }

    static {
            androidx.room.CoroutinesRoom$Companion r0 = new androidx.room.CoroutinesRoom$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.CoroutinesRoom.Companion = r0
            return
    }

    private CoroutinesRoom() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.Deprecated(message = "No longer called by generated implementation")
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final <R> kotlinx.coroutines.flow.i<R> createFlow(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r1, boolean r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<R> r4) {
            androidx.room.CoroutinesRoom$Companion r0 = androidx.room.CoroutinesRoom.Companion
            kotlinx.coroutines.flow.i r1 = r0.createFlow(r1, r2, r3, r4)
            return r1
    }

    @kotlin.Deprecated(message = "No longer called by generated implementation")
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object execute(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r6, boolean r7, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r8, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<R> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r10) {
            androidx.room.CoroutinesRoom$Companion r0 = androidx.room.CoroutinesRoom.Companion
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.Object r6 = r0.execute(r1, r2, r3, r4, r5)
            return r6
    }

    @kotlin.Deprecated(message = "No longer called by generated implementation")
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object execute(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r1, boolean r2, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<R> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
            androidx.room.CoroutinesRoom$Companion r0 = androidx.room.CoroutinesRoom.Companion
            java.lang.Object r1 = r0.execute(r1, r2, r3, r4)
            return r1
    }
}
