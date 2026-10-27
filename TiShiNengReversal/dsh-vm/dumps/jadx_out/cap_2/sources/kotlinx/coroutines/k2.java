package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class k2 extends kotlinx.coroutines.f0 implements kotlinx.coroutines.j1, kotlinx.coroutines.y1 {
    public kotlinx.coroutines.l2 d;

    public k2() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.l2 A() {
            r1 = this;
            kotlinx.coroutines.l2 r0 = r1.d
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    public final void B(@org.jetbrains.annotations.NotNull kotlinx.coroutines.l2 r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // kotlinx.coroutines.y1
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.q2 a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.j1
    public void dispose() {
            r1 = this;
            kotlinx.coroutines.l2 r0 = r1.A()
            r0.j1(r1)
            return
    }

    @Override // kotlinx.coroutines.y1
    public boolean isActive() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.internal.y
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.u0.a(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.u0.b(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            kotlinx.coroutines.l2 r1 = r2.A()
            java.lang.String r1 = kotlinx.coroutines.u0.b(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
