package io.reactivex.disposables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompositeDisposable implements io.reactivex.disposables.Disposable, io.reactivex.internal.disposables.DisposableContainer {
    volatile boolean disposed;
    io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> resources;

    public CompositeDisposable() {
            r0 = this;
            r0.<init>()
            return
    }

    public CompositeDisposable(java.lang.Iterable<? extends io.reactivex.disposables.Disposable> r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "resources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.util.OpenHashSet r0 = new io.reactivex.internal.util.OpenHashSet
            r0.<init>()
            r2.resources = r0
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            java.lang.String r1 = "Disposable item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r1 = r2.resources
            r1.add(r0)
            goto L13
        L2a:
            return
    }

    public CompositeDisposable(io.reactivex.disposables.Disposable... r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "resources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.util.OpenHashSet r0 = new io.reactivex.internal.util.OpenHashSet
            int r1 = r5.length
            int r1 = r1 + 1
            r0.<init>(r1)
            r4.resources = r0
            int r0 = r5.length
            r1 = 0
        L14:
            if (r1 >= r0) goto L25
            r2 = r5[r1]
            java.lang.String r3 = "Disposable item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r3 = r4.resources
            r3.add(r2)
            int r1 = r1 + 1
            goto L14
        L25:
            return
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.lang.String r0 = "d is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r1.disposed
            if (r0 != 0) goto L26
            monitor-enter(r1)
            boolean r0 = r1.disposed     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L22
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r1.resources     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            io.reactivex.internal.util.OpenHashSet r0 = new io.reactivex.internal.util.OpenHashSet     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r1.resources = r0     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L24
        L1c:
            r0.add(r2)     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return r2
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L26
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
        L26:
            r2.dispose()
            r2 = 0
            return r2
    }

    public boolean addAll(io.reactivex.disposables.Disposable... r7) {
            r6 = this;
            java.lang.String r0 = "ds is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            boolean r0 = r6.disposed
            r1 = 0
            if (r0 != 0) goto L36
            monitor-enter(r6)
            boolean r0 = r6.disposed     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L32
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r6.resources     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            if (r0 != 0) goto L20
            io.reactivex.internal.util.OpenHashSet r0 = new io.reactivex.internal.util.OpenHashSet     // Catch: java.lang.Throwable -> L1e
            int r3 = r7.length     // Catch: java.lang.Throwable -> L1e
            int r3 = r3 + r2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            r6.resources = r0     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L34
        L20:
            int r3 = r7.length     // Catch: java.lang.Throwable -> L1e
        L21:
            if (r1 >= r3) goto L30
            r4 = r7[r1]     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = "d is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r5)     // Catch: java.lang.Throwable -> L1e
            r0.add(r4)     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + 1
            goto L21
        L30:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1e
            return r2
        L32:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1e
            goto L36
        L34:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1e
            throw r7
        L36:
            int r0 = r7.length
            r2 = 0
        L38:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            r3.dispose()
            int r2 = r2 + 1
            goto L38
        L42:
            return r1
    }

    public void clear() {
            r2 = this;
            boolean r0 = r2.disposed
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            goto L18
        Le:
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            r2.resources = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            r2.dispose(r0)
            return
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            boolean r0 = r2.disposed
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r3 = move-exception
            goto L24
        L14:
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L22
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L1f
            goto L22
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            r3 = 1
            return r3
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return r1
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r2 = this;
            boolean r0 = r2.disposed
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            goto L1b
        Le:
            r0 = 1
            r2.disposed = r0     // Catch: java.lang.Throwable -> Lc
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            r2.resources = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            r2.dispose(r0)
            return
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    void dispose(io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r7) {
            r6 = this;
            if (r7 != 0) goto L3
            goto L44
        L3:
            java.lang.Object[] r7 = r7.keys()
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L2a
            r4 = r7[r3]
            boolean r5 = r4 instanceof io.reactivex.disposables.Disposable
            if (r5 == 0) goto L27
            io.reactivex.disposables.Disposable r4 = (io.reactivex.disposables.Disposable) r4     // Catch: java.lang.Throwable -> L19
            r4.dispose()     // Catch: java.lang.Throwable -> L19
            goto L27
        L19:
            r4 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
            if (r2 != 0) goto L24
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L24:
            r2.add(r4)
        L27:
            int r3 = r3 + 1
            goto Lb
        L2a:
            if (r2 == 0) goto L44
            int r7 = r2.size()
            r0 = 1
            if (r7 != r0) goto L3e
            java.lang.Object r7 = r2.get(r1)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.RuntimeException r7 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r7)
            throw r7
        L3e:
            io.reactivex.exceptions.CompositeException r7 = new io.reactivex.exceptions.CompositeException
            r7.<init>(r2)
            throw r7
        L44:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.disposed
            return r0
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            boolean r0 = r1.delete(r2)
            if (r0 == 0) goto Lb
            r2.dispose()
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public int size() {
            r2 = this;
            boolean r0 = r2.disposed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r0 = move-exception
            goto L19
        Lf:
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L17
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Ld
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return r1
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }
}
