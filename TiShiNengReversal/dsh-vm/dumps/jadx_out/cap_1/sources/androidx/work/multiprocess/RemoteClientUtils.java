package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RemoteClientUtils {
    public static final androidx.arch.core.util.Function<byte[], java.lang.Void> sVoidMapper = null;



    static {
            androidx.work.multiprocess.RemoteClientUtils$1 r0 = new androidx.work.multiprocess.RemoteClientUtils$1
            r0.<init>()
            androidx.work.multiprocess.RemoteClientUtils.sVoidMapper = r0
            return
    }

    private RemoteClientUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> map(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<I> r2, @androidx.annotation.NonNull androidx.arch.core.util.Function<I, O> r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            androidx.work.multiprocess.RemoteClientUtils$2 r1 = new androidx.work.multiprocess.RemoteClientUtils$2
            r1.<init>(r2, r3, r0)
            r2.addListener(r1, r4)
            return r0
    }
}
