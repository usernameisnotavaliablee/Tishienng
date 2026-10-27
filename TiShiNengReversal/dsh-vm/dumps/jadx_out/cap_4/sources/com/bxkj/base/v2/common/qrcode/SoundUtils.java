package com.bxkj.base.v2.common.qrcode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSoundUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundUtils.kt\ncom/bxkj/base/v2/common/qrcode/SoundUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,277:1\n1#2:278\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SoundUtils implements androidx.lifecycle.LifecycleObserver {

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.base.v2.common.qrcode.SoundUtils.a f594l = null;

    /* renamed from: m, reason: collision with root package name */
    private static final int f595m = -1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f596n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f597o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f598p = 3;

    @org.jetbrains.annotations.NotNull
    private final android.content.Context a;

    @org.jetbrains.annotations.Nullable
    private android.media.SoundPool b;

    @org.jetbrains.annotations.NotNull
    private final android.util.SparseArray<java.lang.Integer> c;

    @org.jetbrains.annotations.NotNull
    private final android.util.SparseArray<java.lang.Integer> d;
    private int e;
    private float f;
    private float g;
    private float h;

    @org.jetbrains.annotations.Nullable
    private android.os.Handler i;

    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.Integer> j;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.n1> k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.bxkj.base.v2.common.qrcode.SoundUtils$a r0 = new com.bxkj.base.v2.common.qrcode.SoundUtils$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.base.v2.common.qrcode.SoundUtils.f594l = r0
            return
    }

    private SoundUtils(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.c = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.d = r0
            r0 = 3
            r1.e = r0
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Exception -> L51
            r0.<init>()     // Catch: java.lang.Exception -> L51
            r1.i = r0     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = "null cannot be cast to non-null type android.media.AudioManager"
            kotlin.jvm.internal.g0.n(r2, r0)     // Catch: java.lang.Exception -> L51
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch: java.lang.Exception -> L51
            int r0 = r1.e     // Catch: java.lang.Exception -> L51
            int r0 = r2.getStreamMaxVolume(r0)     // Catch: java.lang.Exception -> L51
            float r0 = (float) r0     // Catch: java.lang.Exception -> L51
            r1.f = r0     // Catch: java.lang.Exception -> L51
            int r0 = r1.e     // Catch: java.lang.Exception -> L51
            int r2 = r2.getStreamVolume(r0)     // Catch: java.lang.Exception -> L51
            float r2 = (float) r2     // Catch: java.lang.Exception -> L51
            r1.g = r2     // Catch: java.lang.Exception -> L51
            float r0 = r1.f     // Catch: java.lang.Exception -> L51
            float r2 = r2 / r0
            r1.h = r2     // Catch: java.lang.Exception -> L51
            android.media.SoundPool$Builder r2 = new android.media.SoundPool$Builder     // Catch: java.lang.Exception -> L51
            r2.<init>()     // Catch: java.lang.Exception -> L51
            r0 = 5
            android.media.SoundPool$Builder r2 = r2.setMaxStreams(r0)     // Catch: java.lang.Exception -> L51
            android.media.SoundPool r2 = r2.build()     // Catch: java.lang.Exception -> L51
            r1.b = r2     // Catch: java.lang.Exception -> L51
        L51:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.j = r2
            return
    }

    public SoundUtils(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.content.Context r0 = r3.requireContext()
            java.lang.String r1 = "requireContext(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.<init>(r0)
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r3.addObserver(r2)
            return
    }

    public SoundUtils(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r3) {
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.<init>(r0)
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r3.addObserver(r2)
            return
    }

    public static /* synthetic */ void a(com.bxkj.base.v2.common.qrcode.SoundUtils r0, int r1) {
            e(r0, r1)
            return
    }

    public static /* synthetic */ void b(com.bxkj.base.v2.common.qrcode.SoundUtils r0, int r1, float r2, android.media.SoundPool r3, int r4, int r5) {
            l(r0, r1, r2, r3, r4, r5)
            return
    }

    private final void d() {
            r5 = this;
            java.util.List<java.lang.Integer> r0 = r5.j
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r5.k
            if (r0 == 0) goto L10
            r0.invoke()
        L10:
            java.lang.String r0 = "所有音乐播放完毕"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r1)
            return
        L18:
            java.util.List<java.lang.Integer> r0 = r5.j
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            android.os.Handler r1 = r5.i
            if (r1 == 0) goto L3d
            com.bxkj.base.v2.common.qrcode.d r2 = new com.bxkj.base.v2.common.qrcode.d
            r2.<init>(r5, r0)
            android.util.SparseArray<java.lang.Integer> r3 = r5.d
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r3 = (long) r0
            r1.postDelayed(r2, r3)
        L3d:
            return
    }

    private static final void e(com.bxkj.base.v2.common.qrcode.SoundUtils r1, int r2) {
            r1.g(r2)
            java.util.List<java.lang.Integer> r0 = r1.j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            r1.d()
            return
    }

    public static /* synthetic */ void k(com.bxkj.base.v2.common.qrcode.SoundUtils r0, int r1, float r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 1065353216(0x3f800000, float:1.0)
        L6:
            r0.h(r1, r2)
            return
    }

    private static final void l(com.bxkj.base.v2.common.qrcode.SoundUtils r7, int r8, float r9, android.media.SoundPool r10, int r11, int r12) {
            if (r10 == 0) goto L1d
            android.util.SparseArray<java.lang.Integer> r12 = r7.c
            java.lang.Object r11 = r12.get(r11)
            java.lang.String r12 = "get(...)"
            kotlin.jvm.internal.g0.o(r11, r12)
            java.lang.Number r11 = (java.lang.Number) r11
            int r1 = r11.intValue()
            float r2 = r7.h
            r4 = 1
            r3 = r2
            r5 = r8
            r6 = r9
            r0 = r10
            r0.play(r1, r2, r3, r4, r5, r6)
        L1d:
            return
    }

    public final int c(int r4) {
            r3 = this;
            android.content.Context r0 = r3.a     // Catch: java.io.IOException -> L39
            java.lang.String r0 = r0.getPackageName()     // Catch: java.io.IOException -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L39
            r1.<init>()     // Catch: java.io.IOException -> L39
            java.lang.String r2 = "android.resource://"
            r1.append(r2)     // Catch: java.io.IOException -> L39
            r1.append(r0)     // Catch: java.io.IOException -> L39
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.io.IOException -> L39
            r1.append(r4)     // Catch: java.io.IOException -> L39
            java.lang.String r4 = r1.toString()     // Catch: java.io.IOException -> L39
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.io.IOException -> L39
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch: java.io.IOException -> L39
            r0.<init>()     // Catch: java.io.IOException -> L39
            android.content.Context r1 = r3.a     // Catch: java.io.IOException -> L39
            r0.setDataSource(r1, r4)     // Catch: java.io.IOException -> L39
            r4 = 3
            r0.setAudioStreamType(r4)     // Catch: java.io.IOException -> L39
            r0.prepare()     // Catch: java.io.IOException -> L39
            int r4 = r0.getDuration()     // Catch: java.io.IOException -> L39
            return r4
        L39:
            r4 = 0
            return r4
    }

    public final void f(int r3) {
            r2 = this;
            android.media.SoundPool r0 = r2.b
            if (r0 == 0) goto L18
            android.util.SparseArray<java.lang.Integer> r1 = r2.c
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.pause(r3)
        L18:
            return
    }

    public final void g(int r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r2.i(r3, r0, r1)
            return
    }

    public final void h(int r2, float r3) {
            r1 = this;
            r0 = 0
            r1.i(r2, r3, r0)
            return
    }

    public final void i(int r9, float r10, int r11) {
            r8 = this;
            android.util.SparseArray<java.lang.Integer> r0 = r8.c     // Catch: java.lang.Exception -> L38
            int r0 = r0.indexOfKey(r9)     // Catch: java.lang.Exception -> L38
            if (r0 < 0) goto L27
            android.media.SoundPool r1 = r8.b     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L38
            android.util.SparseArray<java.lang.Integer> r0 = r8.c     // Catch: java.lang.Exception -> L38
            java.lang.Object r9 = r0.get(r9)     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = "get(...)"
            kotlin.jvm.internal.g0.o(r9, r0)     // Catch: java.lang.Exception -> L38
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Exception -> L38
            int r2 = r9.intValue()     // Catch: java.lang.Exception -> L38
            float r3 = r8.h     // Catch: java.lang.Exception -> L38
            r5 = 1
            r4 = r3
            r7 = r10
            r6 = r11
            r1.play(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L38
            return
        L27:
            r7 = r10
            r6 = r11
            r8.m(r9)     // Catch: java.lang.Exception -> L38
            android.media.SoundPool r9 = r8.b     // Catch: java.lang.Exception -> L38
            if (r9 == 0) goto L38
            com.bxkj.base.v2.common.qrcode.c r10 = new com.bxkj.base.v2.common.qrcode.c     // Catch: java.lang.Exception -> L38
            r10.<init>(r8, r6, r7)     // Catch: java.lang.Exception -> L38
            r9.setOnLoadCompleteListener(r10)     // Catch: java.lang.Exception -> L38
        L38:
            return
    }

    public final void j(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r2) {
            r1 = this;
            java.lang.String r0 = "soundList"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List<java.lang.Integer> r0 = r1.j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            java.util.List<java.lang.Integer> r0 = r1.j
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            r1.d()
            return
        L18:
            java.util.List<java.lang.Integer> r0 = r1.j
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            return
    }

    public final void m(int r5) {
            r4 = this;
            android.util.SparseArray<java.lang.Integer> r0 = r4.c
            android.media.SoundPool r1 = r4.b
            if (r1 == 0) goto L12
            android.content.Context r2 = r4.a
            r3 = 1
            int r1 = r1.load(r2, r5, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L13
        L12:
            r1 = 0
        L13:
            r0.put(r5, r1)
            android.util.SparseArray<java.lang.Integer> r0 = r4.d
            int r1 = r4.c(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r5, r1)
            return
    }

    public final void n(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r2) {
            r1 = this;
            java.lang.String r0 = "soundList"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.m(r0)
            goto L9
        L1d:
            return
    }

    public final void o(int r3) {
            r2 = this;
            android.media.SoundPool r0 = r2.b
            if (r0 == 0) goto L18
            android.util.SparseArray<java.lang.Integer> r1 = r2.c
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.resume(r3)
        L18:
            return
    }

    public final void p(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r2) {
            r1 = this;
            java.lang.String r0 = "completeListener"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.k = r2
            return
    }

    public final void q(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public final void r(int r3) {
            r2 = this;
            android.media.SoundPool r0 = r2.b
            if (r0 == 0) goto L18
            android.util.SparseArray<java.lang.Integer> r1 = r2.c
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.stop(r3)
        L18:
            android.os.Handler r3 = r2.i
            if (r3 == 0) goto L20
            r0 = 0
            r3.removeCallbacksAndMessages(r0)
        L20:
            android.media.SoundPool r3 = r2.b
            if (r3 == 0) goto L27
            r3.release()
        L27:
            return
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void release() {
            r5 = this;
            android.util.SparseArray<java.lang.Integer> r0 = r5.c     // Catch: java.lang.Exception -> L31
            int r0 = r0.size()     // Catch: java.lang.Exception -> L31
            r1 = 0
        L7:
            if (r1 >= r0) goto L2a
            android.util.SparseArray<java.lang.Integer> r2 = r5.c     // Catch: java.lang.Exception -> L31
            int r2 = r2.keyAt(r1)     // Catch: java.lang.Exception -> L31
            android.media.SoundPool r3 = r5.b     // Catch: java.lang.Exception -> L31
            if (r3 == 0) goto L27
            android.util.SparseArray<java.lang.Integer> r4 = r5.c     // Catch: java.lang.Exception -> L31
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = "get(...)"
            kotlin.jvm.internal.g0.o(r2, r4)     // Catch: java.lang.Exception -> L31
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> L31
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L31
            r3.stop(r2)     // Catch: java.lang.Exception -> L31
        L27:
            int r1 = r1 + 1
            goto L7
        L2a:
            android.media.SoundPool r0 = r5.b     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L31
            r0.release()     // Catch: java.lang.Exception -> L31
        L31:
            return
    }
}
