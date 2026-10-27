package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.ExperimentalRoomApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MultiInstanceInvalidationService extends android.app.Service {

    @org.jetbrains.annotations.NotNull
    private final androidx.room.IMultiInstanceInvalidationService.Stub binder;

    @org.jetbrains.annotations.NotNull
    private final android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> callbackList;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, java.lang.String> clientNames;
    private int maxClientId;

    public MultiInstanceInvalidationService() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.clientNames = r0
            androidx.room.MultiInstanceInvalidationService$callbackList$1 r0 = new androidx.room.MultiInstanceInvalidationService$callbackList$1
            r0.<init>(r1)
            r1.callbackList = r0
            androidx.room.MultiInstanceInvalidationService$binder$1 r0 = new androidx.room.MultiInstanceInvalidationService$binder$1
            r0.<init>(r1)
            r1.binder = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> getCallbackList$room_runtime_release() {
            r1 = this;
            android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> r0 = r1.callbackList
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, java.lang.String> getClientNames$room_runtime_release() {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r1.clientNames
            return r0
    }

    public final int getMaxClientId$room_runtime_release() {
            r1 = this;
            int r0 = r1.maxClientId
            return r0
    }

    @Override // android.app.Service
    @org.jetbrains.annotations.NotNull
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull android.content.Intent r2) {
            r1 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.IMultiInstanceInvalidationService$Stub r2 = r1.binder
            return r2
    }

    public final void setMaxClientId$room_runtime_release(int r1) {
            r0 = this;
            r0.maxClientId = r1
            return
    }
}
