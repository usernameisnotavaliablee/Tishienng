package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class EntityDeleteOrUpdateAdapter<T> {
    public EntityDeleteOrUpdateAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract void bind(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r1, T r2);

    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.String createQuery();

    public final int handle(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.Nullable T r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 != 0) goto L9
            r2 = 0
            return r2
        L9:
            java.lang.String r0 = r1.createQuery()
            androidx.sqlite.SQLiteStatement r0 = r2.prepare(r0)
            r1.bind(r0, r3)     // Catch: java.lang.Throwable -> L20
            r0.step()     // Catch: java.lang.Throwable -> L20
            r3 = 0
            kotlin.jdk7.a.c(r0, r3)
            int r2 = androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(r2)
            return r2
        L20:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L22
        L22:
            r3 = move-exception
            kotlin.jdk7.a.c(r0, r2)
            throw r3
    }

    public final int handleMultiple(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r4, @org.jetbrains.annotations.Nullable java.lang.Iterable<? extends T> r5) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            if (r5 != 0) goto L9
            return r0
        L9:
            java.lang.String r1 = r3.createQuery()
            androidx.sqlite.SQLiteStatement r1 = r4.prepare(r1)
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L30
        L15:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L15
            r3.bind(r1, r2)     // Catch: java.lang.Throwable -> L30
            r1.step()     // Catch: java.lang.Throwable -> L30
            r1.reset()     // Catch: java.lang.Throwable -> L30
            int r2 = androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(r4)     // Catch: java.lang.Throwable -> L30
            int r0 = r0 + r2
            goto L15
        L30:
            r4 = move-exception
            goto L39
        L32:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L30
            r4 = 0
            kotlin.jdk7.a.c(r1, r4)
            return r0
        L39:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L3a:
            r5 = move-exception
            kotlin.jdk7.a.c(r1, r4)
            throw r5
    }

    public final int handleMultiple(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r4, @org.jetbrains.annotations.Nullable T[] r5) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            if (r5 != 0) goto L9
            return r0
        L9:
            java.lang.String r1 = r3.createQuery()
            androidx.sqlite.SQLiteStatement r1 = r4.prepare(r1)
            java.util.Iterator r5 = kotlin.jvm.internal.h.a(r5)     // Catch: java.lang.Throwable -> L30
        L15:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L15
            r3.bind(r1, r2)     // Catch: java.lang.Throwable -> L30
            r1.step()     // Catch: java.lang.Throwable -> L30
            r1.reset()     // Catch: java.lang.Throwable -> L30
            int r2 = androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(r4)     // Catch: java.lang.Throwable -> L30
            int r0 = r0 + r2
            goto L15
        L30:
            r4 = move-exception
            goto L39
        L32:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L30
            r4 = 0
            kotlin.jdk7.a.c(r1, r4)
            return r0
        L39:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L3a:
            r5 = move-exception
            kotlin.jdk7.a.c(r1, r4)
            throw r5
    }
}
