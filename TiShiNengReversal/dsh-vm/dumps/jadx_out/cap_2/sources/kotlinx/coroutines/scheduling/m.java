package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m extends kotlinx.coroutines.scheduling.j {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.Runnable c;

    public m(@org.jetbrains.annotations.NotNull java.lang.Runnable r1, long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.k r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.c = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> Lb
            r0.run()     // Catch: java.lang.Throwable -> Lb
            kotlinx.coroutines.scheduling.k r0 = r2.b
            r0.o()
            return
        Lb:
            r0 = move-exception
            kotlinx.coroutines.scheduling.k r1 = r2.b
            r1.o()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Task["
            r0.append(r1)
            java.lang.Runnable r1 = r4.c
            java.lang.String r1 = kotlinx.coroutines.u0.a(r1)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.Runnable r1 = r4.c
            java.lang.String r1 = kotlinx.coroutines.u0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.a
            r0.append(r2)
            r0.append(r1)
            kotlinx.coroutines.scheduling.k r1 = r4.b
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
