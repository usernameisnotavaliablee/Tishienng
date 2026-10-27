package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
abstract class BaseObservableField extends androidx.databinding.BaseObservable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class DependencyCallback extends androidx.databinding.Observable.OnPropertyChangedCallback {
        final /* synthetic */ androidx.databinding.BaseObservableField this$0;

        DependencyCallback(androidx.databinding.BaseObservableField r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable r1, int r2) {
                r0 = this;
                androidx.databinding.BaseObservableField r1 = r0.this$0
                r1.notifyChange()
                return
        }
    }

    public BaseObservableField() {
            r0 = this;
            r0.<init>()
            return
    }

    public BaseObservableField(androidx.databinding.Observable... r4) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L19
            int r0 = r4.length
            if (r0 == 0) goto L19
            androidx.databinding.BaseObservableField$DependencyCallback r0 = new androidx.databinding.BaseObservableField$DependencyCallback
            r0.<init>(r3)
            r1 = 0
        Le:
            int r2 = r4.length
            if (r1 >= r2) goto L19
            r2 = r4[r1]
            r2.addOnPropertyChangedCallback(r0)
            int r1 = r1 + 1
            goto Le
        L19:
            return
    }
}
