package com.trello.rxlifecycle2.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class RxActivity extends android.app.Activity implements com.trello.rxlifecycle2.b<com.trello.rxlifecycle2.android.ActivityEvent> {
    private final io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> a;

    public RxActivity() {
            r1 = this;
            r1.<init>()
            io.reactivex.subjects.BehaviorSubject r0 = io.reactivex.subjects.BehaviorSubject.create()
            r1.a = r0
            return
    }

    @Override // com.trello.rxlifecycle2.b
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.trello.rxlifecycle2.c H(@androidx.annotation.NonNull com.trello.rxlifecycle2.android.ActivityEvent r1) {
            r0 = this;
            com.trello.rxlifecycle2.android.ActivityEvent r1 = (com.trello.rxlifecycle2.android.ActivityEvent) r1
            com.trello.rxlifecycle2.c r1 = r0.a(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public final <T> com.trello.rxlifecycle2.c<T> a(@androidx.annotation.NonNull com.trello.rxlifecycle2.android.ActivityEvent r2) {
            r1 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r0 = r1.a
            com.trello.rxlifecycle2.c r2 = com.trello.rxlifecycle2.d.c(r0, r2)
            return r2
    }

    @Override // com.trello.rxlifecycle2.b
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public final io.reactivex.Observable<com.trello.rxlifecycle2.android.ActivityEvent> n() {
            r1 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r0 = r1.a
            io.reactivex.Observable r0 = r0.hide()
            return r0
    }

    @Override // android.app.Activity
    @androidx.annotation.CallSuper
    protected void onCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r2 = r1.a
            com.trello.rxlifecycle2.android.ActivityEvent r0 = com.trello.rxlifecycle2.android.ActivityEvent.CREATE
            r2.onNext(r0)
            return
    }

    @Override // android.app.Activity
    @androidx.annotation.CallSuper
    protected void onDestroy() {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r0 = r2.a
            com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.DESTROY
            r0.onNext(r1)
            super.onDestroy()
            return
    }

    @Override // android.app.Activity
    @androidx.annotation.CallSuper
    protected void onPause() {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r0 = r2.a
            com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.PAUSE
            r0.onNext(r1)
            super.onPause()
            return
    }

    @Override // android.app.Activity
    @androidx.annotation.CallSuper
    protected void onResume() {
            r2 = this;
            super.onResume()
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r0 = r2.a
            com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.RESUME
            r0.onNext(r1)
            return
    }

    @Override // android.app.Activity
    @androidx.annotation.CallSuper
    protected void onStart() {
            r2 = this;
            super.onStart()
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r0 = r2.a
            com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.START
            r0.onNext(r1)
            return
    }

    @Override // android.app.Activity
    @androidx.annotation.CallSuper
    protected void onStop() {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r0 = r2.a
            com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.STOP
            r0.onNext(r1)
            super.onStop()
            return
    }

    @Override // com.trello.rxlifecycle2.b
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public final <T> com.trello.rxlifecycle2.c<T> z() {
            r1 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.ActivityEvent> r0 = r1.a
            com.trello.rxlifecycle2.c r0 = com.trello.rxlifecycle2.android.b.a(r0)
            return r0
    }
}
