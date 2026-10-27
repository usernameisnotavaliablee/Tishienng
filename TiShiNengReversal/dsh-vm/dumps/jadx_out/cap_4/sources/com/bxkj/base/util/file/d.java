package com.bxkj.base.util.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements io.reactivex.ObservableTransformer {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public io.reactivex.ObservableSource apply(io.reactivex.Observable r2) {
                r1 = this;
                io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.io()
                io.reactivex.Observable r2 = r2.subscribeOn(r0)
                io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
                io.reactivex.Observable r2 = r2.observeOn(r0)
                return r2
        }
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.trello.rxlifecycle2.c a(@androidx.annotation.NonNull android.content.Context r1) {
            boolean r0 = r1 instanceof com.trello.rxlifecycle2.b
            if (r0 == 0) goto Lb
            com.trello.rxlifecycle2.b r1 = (com.trello.rxlifecycle2.b) r1
            com.trello.rxlifecycle2.c r1 = r1.z()
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "context not the LifecycleProvider type"
            r1.<init>(r0)
            throw r1
    }

    public static <T> com.trello.rxlifecycle2.c b(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1) {
            boolean r0 = r1 instanceof com.trello.rxlifecycle2.b
            if (r0 == 0) goto Lb
            com.trello.rxlifecycle2.b r1 = (com.trello.rxlifecycle2.b) r1
            com.trello.rxlifecycle2.c r1 = r1.z()
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "fragment not the LifecycleProvider type"
            r1.<init>(r0)
            throw r1
    }

    public static <T> com.trello.rxlifecycle2.c c(@androidx.annotation.NonNull com.trello.rxlifecycle2.b r0) {
            com.trello.rxlifecycle2.c r0 = r0.z()
            return r0
    }

    public static io.reactivex.ObservableTransformer d() {
            com.bxkj.base.util.file.d$a r0 = new com.bxkj.base.util.file.d$a
            r0.<init>()
            return r0
    }
}
