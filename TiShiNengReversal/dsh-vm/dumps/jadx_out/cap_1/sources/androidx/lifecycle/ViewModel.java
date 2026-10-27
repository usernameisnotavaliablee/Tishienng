package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ViewModel {

    @androidx.annotation.Nullable
    private final java.util.Map<java.lang.String, java.lang.Object> mBagOfTags;
    private volatile boolean mCleared;

    @androidx.annotation.Nullable
    private final java.util.Set<java.io.Closeable> mCloseables;

    public ViewModel() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mBagOfTags = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mCloseables = r0
            r0 = 0
            r1.mCleared = r0
            return
    }

    public ViewModel(@androidx.annotation.NonNull java.io.Closeable... r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBagOfTags = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.mCloseables = r0
            r1 = 0
            r2.mCleared = r1
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.addAll(r3)
            return
    }

    private static void closeWithRuntimeException(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.io.Closeable
            if (r0 == 0) goto L11
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch: java.io.IOException -> La
            r1.close()     // Catch: java.io.IOException -> La
            return
        La:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L11:
            return
    }

    public void addCloseable(@androidx.annotation.NonNull java.io.Closeable r3) {
            r2 = this;
            java.util.Set<java.io.Closeable> r0 = r2.mCloseables
            if (r0 == 0) goto Lf
            monitor-enter(r0)
            java.util.Set<java.io.Closeable> r1 = r2.mCloseables     // Catch: java.lang.Throwable -> Lc
            r1.add(r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
        Lf:
            return
    }

    @androidx.annotation.MainThread
    final void clear() {
            r3 = this;
            r0 = 1
            r3.mCleared = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mBagOfTags
            if (r0 == 0) goto L26
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L20
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L20
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L20
            closeWithRuntimeException(r2)     // Catch: java.lang.Throwable -> L20
            goto L12
        L20:
            r1 = move-exception
            goto L24
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            goto L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
        L26:
            java.util.Set<java.io.Closeable> r0 = r3.mCloseables
            if (r0 == 0) goto L47
            monitor-enter(r0)
            java.util.Set<java.io.Closeable> r1 = r3.mCloseables     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L41
        L31:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L41
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.lang.Throwable -> L41
            closeWithRuntimeException(r2)     // Catch: java.lang.Throwable -> L41
            goto L31
        L41:
            r1 = move-exception
            goto L45
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            goto L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1
        L47:
            r3.onCleared()
            return
    }

    <T> T getTag(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mBagOfTags
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.mBagOfTags     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    protected void onCleared() {
            r0 = this;
            return
    }

    <T> T setTagIfAbsent(java.lang.String r4, T r5) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mBagOfTags
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L11
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r4 = move-exception
            goto L20
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L17
            goto L18
        L17:
            r5 = r1
        L18:
            boolean r4 = r3.mCleared
            if (r4 == 0) goto L1f
            closeWithRuntimeException(r5)
        L1f:
            return r5
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }
}
