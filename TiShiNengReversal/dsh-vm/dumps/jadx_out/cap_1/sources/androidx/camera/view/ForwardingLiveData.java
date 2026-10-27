package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ForwardingLiveData<T> extends androidx.lifecycle.MediatorLiveData<T> {
    private androidx.lifecycle.LiveData<T> mLiveDataSource;

    ForwardingLiveData() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
            r1 = this;
            androidx.lifecycle.LiveData<T> r0 = r1.mLiveDataSource
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    void setSource(@androidx.annotation.NonNull androidx.lifecycle.LiveData<T> r2) {
            r1 = this;
            androidx.lifecycle.LiveData<T> r0 = r1.mLiveDataSource
            if (r0 == 0) goto L7
            super.removeSource(r0)
        L7:
            r1.mLiveDataSource = r2
            androidx.camera.view.j r0 = new androidx.camera.view.j
            r0.<init>(r1)
            super.addSource(r2, r0)
            return
    }
}
