package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BaseObservable implements androidx.databinding.Observable {
    private transient androidx.databinding.PropertyChangeRegistry mCallbacks;

    public BaseObservable() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.databinding.Observable
    public void addOnPropertyChangedCallback(@androidx.annotation.NonNull androidx.databinding.Observable.OnPropertyChangedCallback r2) {
            r1 = this;
            monitor-enter(r1)
            androidx.databinding.PropertyChangeRegistry r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            androidx.databinding.PropertyChangeRegistry r0 = new androidx.databinding.PropertyChangeRegistry     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            r1.mCallbacks = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            androidx.databinding.PropertyChangeRegistry r0 = r1.mCallbacks
            r0.add(r2)
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public void notifyChange() {
            r3 = this;
            monitor-enter(r3)
            androidx.databinding.PropertyChangeRegistry r0 = r3.mCallbacks     // Catch: java.lang.Throwable -> L7
            if (r0 != 0) goto L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L10
        L9:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            r1 = 0
            r2 = 0
            r0.notifyCallbacks(r3, r1, r2)
            return
        L10:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    public void notifyPropertyChanged(int r3) {
            r2 = this;
            monitor-enter(r2)
            androidx.databinding.PropertyChangeRegistry r0 = r2.mCallbacks     // Catch: java.lang.Throwable -> L7
            if (r0 != 0) goto L9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r3 = move-exception
            goto Lf
        L9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            r1 = 0
            r0.notifyCallbacks(r2, r3, r1)
            return
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            throw r3
    }

    @Override // androidx.databinding.Observable
    public void removeOnPropertyChangedCallback(@androidx.annotation.NonNull androidx.databinding.Observable.OnPropertyChangedCallback r2) {
            r1 = this;
            monitor-enter(r1)
            androidx.databinding.PropertyChangeRegistry r0 = r1.mCallbacks     // Catch: java.lang.Throwable -> L7
            if (r0 != 0) goto L9
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            goto Le
        L9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            r0.remove(r2)
            return
        Le:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
