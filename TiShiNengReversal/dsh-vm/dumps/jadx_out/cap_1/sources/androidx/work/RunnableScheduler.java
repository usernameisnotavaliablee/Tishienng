package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface RunnableScheduler {
    void cancel(@androidx.annotation.NonNull java.lang.Runnable r1);

    void scheduleWithDelay(@androidx.annotation.IntRange(from = 0) long r1, @androidx.annotation.NonNull java.lang.Runnable r3);
}
