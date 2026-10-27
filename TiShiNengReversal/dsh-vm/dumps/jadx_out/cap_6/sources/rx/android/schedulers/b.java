package rx.android.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b extends rx.android.schedulers.c {
    private b(android.os.Handler r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public static rx.android.schedulers.b e(android.os.Handler r1) {
            if (r1 == 0) goto L8
            rx.android.schedulers.b r0 = new rx.android.schedulers.b
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "handler == null"
            r1.<init>(r0)
            throw r1
    }

    @Override // rx.android.schedulers.c, rx.h
    public /* bridge */ /* synthetic */ rx.h.a a() {
            r1 = this;
            rx.h$a r0 = super.a()
            return r0
    }
}
