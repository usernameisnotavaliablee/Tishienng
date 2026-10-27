package com.trello.rxlifecycle2.components.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class RxAppCompatDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment implements com.trello.rxlifecycle2.b<com.trello.rxlifecycle2.android.FragmentEvent> {
    private final io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> c;

    public RxAppCompatDialogFragment() {
            r1 = this;
            r1.<init>()
            io.reactivex.subjects.BehaviorSubject r0 = io.reactivex.subjects.BehaviorSubject.create()
            r1.c = r0
            return
    }

    @Override // com.trello.rxlifecycle2.b
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.trello.rxlifecycle2.c H(@androidx.annotation.NonNull com.trello.rxlifecycle2.android.FragmentEvent r1) {
            r0 = this;
            com.trello.rxlifecycle2.android.FragmentEvent r1 = (com.trello.rxlifecycle2.android.FragmentEvent) r1
            com.trello.rxlifecycle2.c r1 = r0.b(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public final <T> com.trello.rxlifecycle2.c<T> b(@androidx.annotation.NonNull com.trello.rxlifecycle2.android.FragmentEvent r2) {
            r1 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r1.c
            com.trello.rxlifecycle2.c r2 = com.trello.rxlifecycle2.d.c(r0, r2)
            return r2
    }

    @Override // com.trello.rxlifecycle2.b
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public final io.reactivex.Observable<com.trello.rxlifecycle2.android.FragmentEvent> n() {
            r1 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r1.c
            io.reactivex.Observable r0 = r0.hide()
            return r0
    }

    @androidx.annotation.CallSuper
    public void onAttach(android.app.Activity r2) {
            r1 = this;
            super/*androidx.fragment.app.Fragment*/.onAttach(r2)
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r2 = r1.c
            com.trello.rxlifecycle2.android.FragmentEvent r0 = com.trello.rxlifecycle2.android.FragmentEvent.ATTACH
            r2.onNext(r0)
            return
    }

    @androidx.annotation.CallSuper
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super/*androidx.fragment.app.DialogFragment*/.onCreate(r2)
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r2 = r1.c
            com.trello.rxlifecycle2.android.FragmentEvent r0 = com.trello.rxlifecycle2.android.FragmentEvent.CREATE
            r2.onNext(r0)
            return
    }

    @androidx.annotation.CallSuper
    public void onDestroy() {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r2.c
            com.trello.rxlifecycle2.android.FragmentEvent r1 = com.trello.rxlifecycle2.android.FragmentEvent.DESTROY
            r0.onNext(r1)
            super/*androidx.fragment.app.Fragment*/.onDestroy()
            return
    }

    @androidx.annotation.CallSuper
    public void onDestroyView() {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r2.c
            com.trello.rxlifecycle2.android.FragmentEvent r1 = com.trello.rxlifecycle2.android.FragmentEvent.DESTROY_VIEW
            r0.onNext(r1)
            super/*androidx.fragment.app.DialogFragment*/.onDestroyView()
            return
    }

    @androidx.annotation.CallSuper
    public void onDetach() {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r2.c
            com.trello.rxlifecycle2.android.FragmentEvent r1 = com.trello.rxlifecycle2.android.FragmentEvent.DETACH
            r0.onNext(r1)
            super/*androidx.fragment.app.DialogFragment*/.onDetach()
            return
    }

    @androidx.annotation.CallSuper
    public void onPause() {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r2.c
            com.trello.rxlifecycle2.android.FragmentEvent r1 = com.trello.rxlifecycle2.android.FragmentEvent.PAUSE
            r0.onNext(r1)
            super/*androidx.fragment.app.Fragment*/.onPause()
            return
    }

    @androidx.annotation.CallSuper
    public void onResume() {
            r2 = this;
            super/*androidx.fragment.app.Fragment*/.onResume()
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r2.c
            com.trello.rxlifecycle2.android.FragmentEvent r1 = com.trello.rxlifecycle2.android.FragmentEvent.RESUME
            r0.onNext(r1)
            return
    }

    @androidx.annotation.CallSuper
    public void onStart() {
            r2 = this;
            super/*androidx.fragment.app.DialogFragment*/.onStart()
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r2.c
            com.trello.rxlifecycle2.android.FragmentEvent r1 = com.trello.rxlifecycle2.android.FragmentEvent.START
            r0.onNext(r1)
            return
    }

    @androidx.annotation.CallSuper
    public void onStop() {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r2.c
            com.trello.rxlifecycle2.android.FragmentEvent r1 = com.trello.rxlifecycle2.android.FragmentEvent.STOP
            r0.onNext(r1)
            super/*androidx.fragment.app.DialogFragment*/.onStop()
            return
    }

    @androidx.annotation.CallSuper
    public void onViewCreated(android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super/*androidx.fragment.app.Fragment*/.onViewCreated(r1, r2)
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r1 = r0.c
            com.trello.rxlifecycle2.android.FragmentEvent r2 = com.trello.rxlifecycle2.android.FragmentEvent.CREATE_VIEW
            r1.onNext(r2)
            return
    }

    @Override // com.trello.rxlifecycle2.b
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public final <T> com.trello.rxlifecycle2.c<T> z() {
            r1 = this;
            io.reactivex.subjects.BehaviorSubject<com.trello.rxlifecycle2.android.FragmentEvent> r0 = r1.c
            com.trello.rxlifecycle2.c r0 = com.trello.rxlifecycle2.android.b.b(r0)
            return r0
    }
}
