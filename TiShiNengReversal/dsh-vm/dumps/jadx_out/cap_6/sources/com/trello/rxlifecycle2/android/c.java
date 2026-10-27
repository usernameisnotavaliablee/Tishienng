package com.trello.rxlifecycle2.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class c implements io.reactivex.ObservableOnSubscribe<java.lang.Object> {
    static final java.lang.Object b = null;
    final android.view.View a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends io.reactivex.android.MainThreadDisposable implements android.view.View.OnAttachStateChangeListener {
        final io.reactivex.ObservableEmitter<java.lang.Object> a;
        final /* synthetic */ com.trello.rxlifecycle2.android.c b;

        public a(com.trello.rxlifecycle2.android.c r1, io.reactivex.ObservableEmitter<java.lang.Object> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        protected void onDispose() {
                r1 = this;
                com.trello.rxlifecycle2.android.c r0 = r1.b
                android.view.View r0 = r0.a
                r0.removeOnAttachStateChangeListener(r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r2) {
                r1 = this;
                io.reactivex.ObservableEmitter<java.lang.Object> r2 = r1.a
                java.lang.Object r0 = com.trello.rxlifecycle2.android.c.b
                r2.onNext(r0)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.trello.rxlifecycle2.android.c.b = r0
            return
    }

    public c(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void subscribe(io.reactivex.ObservableEmitter<java.lang.Object> r2) throws java.lang.Exception {
            r1 = this;
            io.reactivex.android.MainThreadDisposable.verifyMainThread()
            com.trello.rxlifecycle2.android.c$a r0 = new com.trello.rxlifecycle2.android.c$a
            r0.<init>(r1, r2)
            r2.setDisposable(r0)
            android.view.View r2 = r1.a
            r2.addOnAttachStateChangeListener(r0)
            return
    }
}
