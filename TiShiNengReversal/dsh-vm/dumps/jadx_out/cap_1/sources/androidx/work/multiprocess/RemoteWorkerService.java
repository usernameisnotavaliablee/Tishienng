package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RemoteWorkerService extends android.app.Service {
    static final java.lang.String TAG = null;
    private android.os.IBinder mBinder;

    static {
            java.lang.String r0 = "RemoteWorkerService"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.multiprocess.RemoteWorkerService.TAG = r0
            return
    }

    public RemoteWorkerService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(@androidx.annotation.NonNull android.content.Intent r4) {
            r3 = this;
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.multiprocess.RemoteWorkerService.TAG
            r1 = 0
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r2 = "Binding to RemoteWorkerService"
            r4.info(r0, r2, r1)
            android.os.IBinder r4 = r3.mBinder
            return r4
    }

    @Override // android.app.Service
    public void onCreate() {
            r1 = this;
            super.onCreate()
            androidx.work.multiprocess.ListenableWorkerImpl r0 = new androidx.work.multiprocess.ListenableWorkerImpl
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }
}
