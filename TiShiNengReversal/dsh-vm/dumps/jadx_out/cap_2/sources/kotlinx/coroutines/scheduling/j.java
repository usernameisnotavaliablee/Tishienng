package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class j implements java.lang.Runnable {

    @kotlin.jvm.JvmField
    public long a;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.scheduling.k b;

    public j() {
            r3 = this;
            r0 = 0
            kotlinx.coroutines.scheduling.k r2 = kotlinx.coroutines.scheduling.n.i
            r3.<init>(r0, r2)
            return
    }

    public j(long r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.k r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public final int c() {
            r1 = this;
            kotlinx.coroutines.scheduling.k r0 = r1.b
            int r0 = r0.q()
            return r0
    }
}
