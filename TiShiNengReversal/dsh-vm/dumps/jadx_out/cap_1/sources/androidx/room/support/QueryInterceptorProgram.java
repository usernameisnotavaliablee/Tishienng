package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class QueryInterceptorProgram implements androidx.sqlite.db.SupportSQLiteProgram {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Object> bindArgsCache;

    public QueryInterceptorProgram() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.bindArgsCache = r0
            return
    }

    private final void saveArgsToCache(int r4, java.lang.Object r5) {
            r3 = this;
            int r4 = r4 + (-1)
            java.util.List<java.lang.Object> r0 = r3.bindArgsCache
            int r0 = r0.size()
            if (r4 < r0) goto L1d
            java.util.List<java.lang.Object> r0 = r3.bindArgsCache
            int r0 = r0.size()
            if (r0 > r4) goto L1d
        L12:
            java.util.List<java.lang.Object> r1 = r3.bindArgsCache
            r2 = 0
            r1.add(r2)
            if (r0 == r4) goto L1d
            int r0 = r0 + 1
            goto L12
        L1d:
            java.util.List<java.lang.Object> r0 = r3.bindArgsCache
            r0.set(r4, r5)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.saveArgsToCache(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int r1, double r2) {
            r0 = this;
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.saveArgsToCache(r1, r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.saveArgsToCache(r1, r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int r2) {
            r1 = this;
            r0 = 0
            r1.saveArgsToCache(r2, r0)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.saveArgsToCache(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.bindArgsCache
            r0.clear()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> getBindArgsCache$room_runtime_release() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.bindArgsCache
            return r0
    }
}
