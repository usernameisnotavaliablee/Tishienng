package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class WeakListener<T> extends java.lang.ref.WeakReference<androidx.databinding.ViewDataBinding> {
    protected final int mLocalFieldId;
    private final androidx.databinding.ObservableReference<T> mObservable;
    private T mTarget;

    public WeakListener(androidx.databinding.ViewDataBinding r1, int r2, androidx.databinding.ObservableReference<T> r3, java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
            r0 = this;
            r0.<init>(r1, r4)
            r0.mLocalFieldId = r2
            r0.mObservable = r3
            return
    }

    @androidx.annotation.Nullable
    protected androidx.databinding.ViewDataBinding getBinder() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            androidx.databinding.ViewDataBinding r0 = (androidx.databinding.ViewDataBinding) r0
            if (r0 != 0) goto Lb
            r1.unregister()
        Lb:
            return r0
    }

    public T getTarget() {
            r1 = this;
            T r0 = r1.mTarget
            return r0
    }

    public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            androidx.databinding.ObservableReference<T> r0 = r1.mObservable
            r0.setLifecycleOwner(r2)
            return
    }

    public void setTarget(T r2) {
            r1 = this;
            r1.unregister()
            r1.mTarget = r2
            if (r2 == 0) goto Lc
            androidx.databinding.ObservableReference<T> r0 = r1.mObservable
            r0.addListener(r2)
        Lc:
            return
    }

    public boolean unregister() {
            r2 = this;
            T r0 = r2.mTarget
            if (r0 == 0) goto Lb
            androidx.databinding.ObservableReference<T> r1 = r2.mObservable
            r1.removeListener(r0)
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = 0
            r2.mTarget = r1
            return r0
    }
}
