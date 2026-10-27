package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t0 {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a = "kotlinx.coroutines.debug";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b = "kotlinx.coroutines.stacktrace.recovery";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c = "auto";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String d = "on";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String e = "off";
    private static final boolean f = false;
    private static final boolean g = false;
    private static final boolean h = false;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicLong i = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.v0.d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            int r3 = r0.hashCode()
            if (r3 == 0) goto L3a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L31
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L44
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L2f
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L2f:
            r0 = 0
            goto L64
        L31:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
            goto L42
        L3a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L42:
            r0 = 1
            goto L64
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L64:
            kotlinx.coroutines.t0.g = r0
            if (r0 == 0) goto L71
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.v0.f(r0, r1)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = 0
        L72:
            kotlinx.coroutines.t0.h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.t0.i = r0
            return
    }

    @kotlin.internal.InlineOnly
    private static final void a(kotlin.jvm.functions.Function0<java.lang.Boolean> r0) {
            return
    }

    public static final boolean b() {
            boolean r0 = kotlinx.coroutines.t0.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicLong c() {
            java.util.concurrent.atomic.AtomicLong r0 = kotlinx.coroutines.t0.i
            return r0
    }

    public static final boolean d() {
            boolean r0 = kotlinx.coroutines.t0.g
            return r0
    }

    public static final boolean e() {
            boolean r0 = kotlinx.coroutines.t0.h
            return r0
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void f() {
            return
    }

    public static final void g() {
            java.util.concurrent.atomic.AtomicLong r0 = kotlinx.coroutines.t0.i
            r1 = 0
            r0.set(r1)
            return
    }
}
