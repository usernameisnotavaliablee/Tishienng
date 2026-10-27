package kotlin.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "TimersKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class a extends java.util.TimerTask {
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.TimerTask, kotlin.n1> a;

        public a(kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r1 = this;
                kotlin.jvm.functions.Function1<java.util.TimerTask, kotlin.n1> r0 = r1.a
                r0.invoke(r1)
                return
        }
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Timer a(java.lang.String r1, boolean r2, long r3, long r5, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r7) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.Timer r1 = k(r1, r2)
            kotlin.concurrent.c$a r2 = new kotlin.concurrent.c$a
            r2.<init>(r7)
            r1.scheduleAtFixedRate(r2, r3, r5)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Timer b(java.lang.String r1, boolean r2, java.util.Date r3, long r4, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r6) {
            java.lang.String r0 = "startAt"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Timer r1 = k(r1, r2)
            kotlin.concurrent.c$a r2 = new kotlin.concurrent.c$a
            r2.<init>(r6)
            r1.scheduleAtFixedRate(r2, r3, r4)
            return r1
    }

    static /* synthetic */ java.util.Timer c(java.lang.String r6, boolean r7, long r8, long r10, kotlin.jvm.functions.Function1 r12, int r13, java.lang.Object r14) {
            r14 = r13 & 1
            if (r14 == 0) goto L5
            r6 = 0
        L5:
            r14 = r13 & 2
            if (r14 == 0) goto La
            r7 = 0
        La:
            r13 = r13 & 4
            if (r13 == 0) goto L10
            r8 = 0
        L10:
            r2 = r8
            java.lang.String r8 = "action"
            kotlin.jvm.internal.g0.p(r12, r8)
            java.util.Timer r0 = k(r6, r7)
            kotlin.concurrent.c$a r1 = new kotlin.concurrent.c$a
            r1.<init>(r12)
            r4 = r10
            r0.scheduleAtFixedRate(r1, r2, r4)
            return r0
    }

    static /* synthetic */ java.util.Timer d(java.lang.String r0, boolean r1, java.util.Date r2, long r3, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r0 = 0
        L5:
            r6 = r6 & 2
            if (r6 == 0) goto La
            r1 = 0
        La:
            java.lang.String r6 = "startAt"
            kotlin.jvm.internal.g0.p(r2, r6)
            java.lang.String r6 = "action"
            kotlin.jvm.internal.g0.p(r5, r6)
            java.util.Timer r0 = k(r0, r1)
            kotlin.concurrent.c$a r1 = new kotlin.concurrent.c$a
            r1.<init>(r5)
            r0.scheduleAtFixedRate(r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask e(java.util.Timer r1, long r2, long r4, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = r6
            r5 = r4
            r3 = r2
            kotlin.concurrent.c$a r2 = new kotlin.concurrent.c$a
            r2.<init>(r0)
            r1.schedule(r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask f(java.util.Timer r1, long r2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.concurrent.c$a r0 = new kotlin.concurrent.c$a
            r0.<init>(r4)
            r1.schedule(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask g(java.util.Timer r1, java.util.Date r2, long r3, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "time"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.concurrent.c$a r0 = new kotlin.concurrent.c$a
            r0.<init>(r5)
            r1.schedule(r0, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask h(java.util.Timer r1, java.util.Date r2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "time"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.concurrent.c$a r0 = new kotlin.concurrent.c$a
            r0.<init>(r3)
            r1.schedule(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask i(java.util.Timer r1, long r2, long r4, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = r6
            r5 = r4
            r3 = r2
            kotlin.concurrent.c$a r2 = new kotlin.concurrent.c$a
            r2.<init>(r0)
            r1.scheduleAtFixedRate(r2, r3, r5)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask j(java.util.Timer r1, java.util.Date r2, long r3, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "time"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.concurrent.c$a r0 = new kotlin.concurrent.c$a
            r0.<init>(r5)
            r1.scheduleAtFixedRate(r0, r2, r3)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final java.util.Timer k(@org.jetbrains.annotations.Nullable java.lang.String r1, boolean r2) {
            if (r1 != 0) goto L8
            java.util.Timer r1 = new java.util.Timer
            r1.<init>(r2)
            return r1
        L8:
            java.util.Timer r0 = new java.util.Timer
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Timer l(java.lang.String r1, boolean r2, long r3, long r5, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r7) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.Timer r1 = k(r1, r2)
            kotlin.concurrent.c$a r2 = new kotlin.concurrent.c$a
            r2.<init>(r7)
            r1.schedule(r2, r3, r5)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Timer m(java.lang.String r1, boolean r2, java.util.Date r3, long r4, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r6) {
            java.lang.String r0 = "startAt"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Timer r1 = k(r1, r2)
            kotlin.concurrent.c$a r2 = new kotlin.concurrent.c$a
            r2.<init>(r6)
            r1.schedule(r2, r3, r4)
            return r1
    }

    static /* synthetic */ java.util.Timer n(java.lang.String r6, boolean r7, long r8, long r10, kotlin.jvm.functions.Function1 r12, int r13, java.lang.Object r14) {
            r14 = r13 & 1
            if (r14 == 0) goto L5
            r6 = 0
        L5:
            r14 = r13 & 2
            if (r14 == 0) goto La
            r7 = 0
        La:
            r13 = r13 & 4
            if (r13 == 0) goto L10
            r8 = 0
        L10:
            r2 = r8
            java.lang.String r8 = "action"
            kotlin.jvm.internal.g0.p(r12, r8)
            java.util.Timer r0 = k(r6, r7)
            kotlin.concurrent.c$a r1 = new kotlin.concurrent.c$a
            r1.<init>(r12)
            r4 = r10
            r0.schedule(r1, r2, r4)
            return r0
    }

    static /* synthetic */ java.util.Timer o(java.lang.String r0, boolean r1, java.util.Date r2, long r3, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r0 = 0
        L5:
            r6 = r6 & 2
            if (r6 == 0) goto La
            r1 = 0
        La:
            java.lang.String r6 = "startAt"
            kotlin.jvm.internal.g0.p(r2, r6)
            java.lang.String r6 = "action"
            kotlin.jvm.internal.g0.p(r5, r6)
            java.util.Timer r0 = k(r0, r1)
            kotlin.concurrent.c$a r1 = new kotlin.concurrent.c$a
            r1.<init>(r5)
            r0.schedule(r1, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask p(kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.n1> r1) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.concurrent.c$a r0 = new kotlin.concurrent.c$a
            r0.<init>(r1)
            return r0
    }
}
