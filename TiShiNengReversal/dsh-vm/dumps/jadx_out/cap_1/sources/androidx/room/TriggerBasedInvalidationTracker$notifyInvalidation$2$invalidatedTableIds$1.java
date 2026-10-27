package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", i = {0}, l = {413, 420}, m = "invokeSuspend", n = {"connection"}, s = {"L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super java.util.Set<? extends java.lang.Integer>>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker this$0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<java.util.Set<? extends java.lang.Integer>>, kotlin.coroutines.e<? super java.util.Set<? extends java.lang.Integer>>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker this$0;

        AnonymousClass1(androidx.room.TriggerBasedInvalidationTracker r1, kotlin.coroutines.e<? super androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1
                androidx.room.TriggerBasedInvalidationTracker r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        public final java.lang.Object invoke(androidx.room.TransactionScope<java.util.Set<java.lang.Integer>> r1, kotlin.coroutines.e<? super java.util.Set<java.lang.Integer>> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1 r1 = (androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.AnonymousClass1) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                java.lang.Object r4 = r3.L$0
                androidx.room.TransactionScope r4 = (androidx.room.TransactionScope) r4
                androidx.room.TriggerBasedInvalidationTracker r1 = r3.this$0
                r3.label = r2
                java.lang.Object r4 = androidx.room.TriggerBasedInvalidationTracker.access$checkInvalidatedTables(r1, r4, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                return r4
        }
    }

    TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(androidx.room.TriggerBasedInvalidationTracker r1, kotlin.coroutines.e<? super androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1
            androidx.room.TriggerBasedInvalidationTracker r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public final java.lang.Object invoke(androidx.room.Transactor r1, kotlin.coroutines.e<? super java.util.Set<java.lang.Integer>> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 r1 = (androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.g0.n(r7)     // Catch: android.database.SQLException -> L5a
            goto L57
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$0
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.g0.n(r7)
            goto L35
        L22:
            kotlin.g0.n(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r1.inTransaction(r6)
            if (r7 != r0) goto L35
            goto L56
        L35:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L42
            java.util.Set r7 = kotlin.collections.u1.k()
            return r7
        L42:
            androidx.room.Transactor$SQLiteTransactionType r7 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE     // Catch: android.database.SQLException -> L5a
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1 r3 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1     // Catch: android.database.SQLException -> L5a
            androidx.room.TriggerBasedInvalidationTracker r4 = r6.this$0     // Catch: android.database.SQLException -> L5a
            r5 = 0
            r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
            r6.L$0 = r5     // Catch: android.database.SQLException -> L5a
            r6.label = r2     // Catch: android.database.SQLException -> L5a
            java.lang.Object r7 = r1.withTransaction(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
            if (r7 != r0) goto L57
        L56:
            return r0
        L57:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
            return r7
        L5a:
            java.util.Set r7 = kotlin.collections.u1.k()
            return r7
    }
}
