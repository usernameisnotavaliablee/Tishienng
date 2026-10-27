package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class t1 extends kotlinx.coroutines.m0 implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.t1.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.ExperimentalStdlibApi
    public static final class a extends kotlin.coroutines.b<kotlinx.coroutines.m0, kotlinx.coroutines.t1> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlinx.coroutines.t1$a$a, reason: collision with other inner class name */
        static final class C0114a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.i.b, kotlinx.coroutines.t1> {
            public static final kotlinx.coroutines.t1.a.C0114a a = null;

            static {
                    kotlinx.coroutines.t1$a$a r0 = new kotlinx.coroutines.t1$a$a
                    r0.<init>()
                    kotlinx.coroutines.t1.a.C0114a.a = r0
                    return
            }

            C0114a() {
                    r1 = this;
                    r0 = 1
                    r1.<init>(r0)
                    return
            }

            @org.jetbrains.annotations.Nullable
            public final kotlinx.coroutines.t1 a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r2) {
                    r1 = this;
                    boolean r0 = r2 instanceof kotlinx.coroutines.t1
                    if (r0 == 0) goto L7
                    kotlinx.coroutines.t1 r2 = (kotlinx.coroutines.t1) r2
                    return r2
                L7:
                    r2 = 0
                    return r2
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlinx.coroutines.t1 invoke(kotlin.coroutines.i.b r1) {
                    r0 = this;
                    kotlin.coroutines.i$b r1 = (kotlin.coroutines.i.b) r1
                    kotlinx.coroutines.t1 r1 = r0.a(r1)
                    return r1
            }
        }

        private a() {
                r2 = this;
                kotlinx.coroutines.m0$a r0 = kotlinx.coroutines.m0.Key
                kotlinx.coroutines.t1$a$a r1 = kotlinx.coroutines.t1.a.C0114a.a
                r2.<init>(r0, r1)
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.t1$a r0 = new kotlinx.coroutines.t1$a
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.t1.a = r0
            return
    }

    public t1() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void close();

    @org.jetbrains.annotations.NotNull
    public abstract java.util.concurrent.Executor t();
}
