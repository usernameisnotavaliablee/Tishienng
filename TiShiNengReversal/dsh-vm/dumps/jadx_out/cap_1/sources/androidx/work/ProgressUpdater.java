package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ProgressUpdater {
    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateProgress(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.util.UUID r2, @androidx.annotation.NonNull androidx.work.Data r3);
}
