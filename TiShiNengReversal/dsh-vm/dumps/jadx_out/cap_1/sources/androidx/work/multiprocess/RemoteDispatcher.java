package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"LambdaLast"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface RemoteDispatcher<T> {
    void execute(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r2) throws java.lang.Throwable;
}
