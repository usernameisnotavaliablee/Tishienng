package io.reactivex.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class MainThreadDisposable implements io.reactivex.disposables.Disposable {
    private final java.util.concurrent.atomic.AtomicBoolean unsubscribed;


    public MainThreadDisposable() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.unsubscribed = r0
            return
    }

    public static void verifyMainThread() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected to be called on the main thread but was "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.unsubscribed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L24
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L18
            r3.onDispose()
            return
        L18:
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.android.MainThreadDisposable$1 r1 = new io.reactivex.android.MainThreadDisposable$1
            r1.<init>(r3)
            r0.scheduleDirect(r1)
        L24:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.unsubscribed
            boolean r0 = r0.get()
            return r0
    }

    protected abstract void onDispose();
}
