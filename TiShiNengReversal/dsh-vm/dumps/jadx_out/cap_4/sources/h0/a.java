package h0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            com.bxkj.student.run.app.offline.RunDatabase$Companion r0 = com.bxkj.student.run.app.offline.RunDatabase.Companion
            com.bxkj.student.run.app.offline.RunDatabase r0 = r0.getInstance()
            com.bxkj.student.run.app.offline.dao.RunDao r0 = r0.runDao()
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.deleteByIdentify(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L17
            return r2
        L17:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r3) {
            r1 = this;
            com.bxkj.student.run.app.offline.RunDatabase$Companion r0 = com.bxkj.student.run.app.offline.RunDatabase.Companion
            com.bxkj.student.run.app.offline.RunDatabase r0 = r0.getInstance()
            com.bxkj.student.run.app.offline.dao.RunDao r0 = r0.runDao()
            if (r0 == 0) goto L11
            java.lang.Object r2 = r0.getExceptionSports(r2, r3)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r3) {
            r1 = this;
            com.bxkj.student.run.app.offline.RunDatabase$Companion r0 = com.bxkj.student.run.app.offline.RunDatabase.Companion
            com.bxkj.student.run.app.offline.RunDatabase r0 = r0.getInstance()
            com.bxkj.student.run.app.offline.dao.RunDao r0 = r0.runDao()
            if (r0 == 0) goto L11
            java.lang.Object r2 = r0.getLocalRecordById(r2, r3)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r3) {
            r1 = this;
            com.bxkj.student.run.app.offline.RunDatabase$Companion r0 = com.bxkj.student.run.app.offline.RunDatabase.Companion
            com.bxkj.student.run.app.offline.RunDatabase r0 = r0.getInstance()
            com.bxkj.student.run.app.offline.dao.RunDao r0 = r0.runDao()
            if (r0 == 0) goto L11
            java.lang.Object r2 = r0.getUploadFailSports(r2, r3)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r4) {
            r1 = this;
            com.bxkj.student.run.app.offline.RunDatabase$Companion r0 = com.bxkj.student.run.app.offline.RunDatabase.Companion
            com.bxkj.student.run.app.offline.RunDatabase r0 = r0.getInstance()
            com.bxkj.student.run.app.offline.dao.RunDao r0 = r0.runDao()
            if (r0 == 0) goto L11
            java.lang.Object r2 = r0.getUploadFailSportsByType(r2, r3, r4)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.offline.table.RunDb r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            com.bxkj.student.run.app.offline.RunDatabase$Companion r0 = com.bxkj.student.run.app.offline.RunDatabase.Companion
            com.bxkj.student.run.app.offline.RunDatabase r0 = r0.getInstance()
            com.bxkj.student.run.app.offline.dao.RunDao r0 = r0.runDao()
            if (r0 == 0) goto L20
            r1 = 1
            com.bxkj.student.run.app.offline.table.RunDb[] r1 = new com.bxkj.student.run.app.offline.table.RunDb[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.Object r4 = r0.insertRun(r1, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L1d
            return r4
        L1d:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L20:
            r4 = 0
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r1 = this;
            com.bxkj.student.run.app.offline.RunDatabase$Companion r0 = com.bxkj.student.run.app.offline.RunDatabase.Companion
            com.bxkj.student.run.app.offline.RunDatabase r0 = r0.getInstance()
            com.bxkj.student.run.app.offline.dao.RunDao r0 = r0.runDao()
            if (r0 == 0) goto L1a
            java.lang.Object r2 = r0.updateSports(r2, r3, r4, r5)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L17
            return r2
        L17:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L1a:
            r2 = 0
            return r2
    }
}
