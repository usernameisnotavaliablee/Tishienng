package io.reactivex.android.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AndroidSchedulers {
    private static final io.reactivex.Scheduler MAIN_THREAD = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class MainHolder {
        static final io.reactivex.Scheduler DEFAULT = null;

        static {
                io.reactivex.android.schedulers.HandlerScheduler r0 = new io.reactivex.android.schedulers.HandlerScheduler
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.<init>(r1)
                io.reactivex.android.schedulers.AndroidSchedulers.MainHolder.DEFAULT = r0
                return
        }

        private MainHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            io.reactivex.android.schedulers.AndroidSchedulers$1 r0 = new io.reactivex.android.schedulers.AndroidSchedulers$1
            r0.<init>()
            io.reactivex.Scheduler r0 = io.reactivex.android.plugins.RxAndroidPlugins.initMainThreadScheduler(r0)
            io.reactivex.android.schedulers.AndroidSchedulers.MAIN_THREAD = r0
            return
    }

    private AndroidSchedulers() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No instances."
            r0.<init>(r1)
            throw r0
    }

    public static io.reactivex.Scheduler from(android.os.Looper r2) {
            if (r2 == 0) goto Ld
            io.reactivex.android.schedulers.HandlerScheduler r0 = new io.reactivex.android.schedulers.HandlerScheduler
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        Ld:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "looper == null"
            r2.<init>(r0)
            throw r2
    }

    public static io.reactivex.Scheduler mainThread() {
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.MAIN_THREAD
            io.reactivex.Scheduler r0 = io.reactivex.android.plugins.RxAndroidPlugins.onMainThreadScheduler(r0)
            return r0
    }
}
