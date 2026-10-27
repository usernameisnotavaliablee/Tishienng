package androidx.work.impl.foreground;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface ForegroundProcessor {
    void startForeground(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ForegroundInfo r2);

    void stopForeground(@androidx.annotation.NonNull java.lang.String r1);
}
