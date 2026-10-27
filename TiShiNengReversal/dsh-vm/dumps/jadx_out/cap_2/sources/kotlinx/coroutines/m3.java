package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class m3<U, T extends U> extends kotlinx.coroutines.internal.o0<T> implements java.lang.Runnable {

    @kotlin.jvm.JvmField
    public final long e;

    public m3(long r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super U> r4) {
            r1 = this;
            kotlin.coroutines.i r0 = r4.getContext()
            r1.<init>(r0, r4)
            r1.e = r2
            return
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.l2
    @org.jetbrains.annotations.NotNull
    public java.lang.String W0() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.W0()
            r0.append(r1)
            java.lang.String r1 = "(timeMillis="
            r0.append(r1)
            long r1 = r3.e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            long r0 = r3.e
            kotlin.coroutines.i r2 = r3.getContext()
            kotlinx.coroutines.z0 r2 = kotlinx.coroutines.a1.d(r2)
            kotlinx.coroutines.TimeoutCancellationException r0 = kotlinx.coroutines.n3.a(r0, r2, r3)
            r3.h0(r0)
            return
    }
}
