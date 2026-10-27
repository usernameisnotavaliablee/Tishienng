package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {
    @kotlin.jvm.JvmName(name = "isSchedulerWorker")
    public static final boolean a(@org.jetbrains.annotations.NotNull java.lang.Thread r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.c
            return r0
    }

    @kotlin.jvm.JvmName(name = "mayNotBlock")
    public static final boolean b(@org.jetbrains.annotations.NotNull java.lang.Thread r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.c
            if (r0 == 0) goto Le
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r1
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r1.c
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
            if (r1 != r0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }
}
