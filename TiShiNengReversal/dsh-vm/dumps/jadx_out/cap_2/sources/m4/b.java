package m4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"all"})
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    public static final m4.b a = null;
    private static final boolean b = false;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.lang.instrument.ClassFileTransformer {

        @org.jetbrains.annotations.NotNull
        public static final m4.b.a a = null;

        static {
                m4.b$a r0 = new m4.b$a
                r0.<init>()
                m4.b.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public byte[] transform(@org.jetbrains.annotations.Nullable java.lang.ClassLoader r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Class<?> r3, @org.jetbrains.annotations.NotNull java.security.ProtectionDomain r4, @org.jetbrains.annotations.Nullable byte[] r5) {
                r0 = this;
                if (r1 == 0) goto L1c
                java.lang.String r3 = "kotlin/coroutines/jvm/internal/DebugProbesKt"
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
                if (r2 != 0) goto Lb
                goto L1c
            Lb:
                kotlinx.coroutines.debug.internal.a r2 = kotlinx.coroutines.debug.internal.a.a
                r3 = 1
                r2.b(r3)
                java.lang.String r2 = "DebugProbesKt.bin"
                java.io.InputStream r1 = r1.getResourceAsStream(r2)
                byte[] r1 = kotlin.io.a.p(r1)
                return r1
            L1c:
                r1 = 0
                return r1
        }
    }

    static {
            m4.b r0 = new m4.b
            r0.<init>()
            m4.b.a = r0
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "kotlinx.coroutines.debug.enable.creation.stack.trace"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r1 = move-exception
            goto L23
        L1d:
            r1 = r0
        L1e:
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L1b
            goto L2d
        L23:
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.g0.a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
        L2d:
            boolean r2 = kotlin.Result.m17isFailureimpl(r1)
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L3e
            boolean r0 = r0.booleanValue()
            goto L44
        L3e:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a
            boolean r0 = r0.u()
        L44:
            m4.b.b = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(sun.misc.Signal r0) {
            c(r0)
            return
    }

    private final void b() {
            r2 = this;
            sun.misc.Signal r0 = new sun.misc.Signal     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "TRAP"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            m4.a r1 = new m4.a     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            sun.misc.Signal.handle(r0, r1)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    private static final void c(sun.misc.Signal r1) {
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a
            boolean r0 = r1.A()
            if (r0 == 0) goto Le
            java.io.PrintStream r0 = java.lang.System.out
            r1.f(r0)
            return
        Le:
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void d(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.instrument.Instrumentation r2) {
            kotlinx.coroutines.debug.internal.a r1 = kotlinx.coroutines.debug.internal.a.a
            r0 = 1
            r1.b(r0)
            m4.b$a r1 = m4.b.a.a
            r2.addTransformer(r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.a
            boolean r2 = m4.b.b
            r1.L(r2)
            r1.y()
            m4.b r1 = m4.b.a
            r1.b()
            return
    }
}
