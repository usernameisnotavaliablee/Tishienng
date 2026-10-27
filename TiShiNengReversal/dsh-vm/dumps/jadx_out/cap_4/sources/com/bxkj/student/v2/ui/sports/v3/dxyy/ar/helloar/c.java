package com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {

    @org.jetbrains.annotations.Nullable
    private cn.easyar.DelayedCallbackScheduler a;

    @org.jetbrains.annotations.Nullable
    private cn.easyar.CameraDevice b;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<cn.easyar.ImageTracker> c;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer d;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.a e;

    @org.jetbrains.annotations.Nullable
    private cn.easyar.InputFrameThrottler f;

    @org.jetbrains.annotations.Nullable
    private cn.easyar.FeedbackFrameFork g;

    @org.jetbrains.annotations.Nullable
    private cn.easyar.InputFrameToOutputFrameAdapter h;

    @org.jetbrains.annotations.Nullable
    private cn.easyar.InputFrameFork i;

    @org.jetbrains.annotations.Nullable
    private cn.easyar.OutputFrameJoin j;

    @org.jetbrains.annotations.Nullable
    private cn.easyar.OutputFrameBuffer k;

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private cn.easyar.InputFrameToFeedbackFrameAdapter f1469l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private cn.easyar.OutputFrameFork f1470m;

    /* renamed from: n, reason: collision with root package name */
    private int f1471n;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private byte[] f1472o;

    public c() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1471n = r0
            cn.easyar.DelayedCallbackScheduler r0 = new cn.easyar.DelayedCallbackScheduler
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            return
    }

    public static /* synthetic */ void a(cn.easyar.Target r0, boolean r1) {
            e(r0, r1)
            return
    }

    private final void d(cn.easyar.ImageTracker r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            java.lang.String r4 = ""
            r5 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            java.lang.String r3 = ""
            r0 = r8
            r2 = r9
            cn.easyar.ImageTarget r8 = cn.easyar.ImageTarget.createFromImageFile(r0, r1, r2, r3, r4, r5)
            if (r8 != 0) goto L10
            return
        L10:
            cn.easyar.DelayedCallbackScheduler r9 = r6.a
            kotlin.jvm.internal.g0.m(r9)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.b r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.b
            r0.<init>()
            r7.loadTarget(r8, r9, r0)
            r8.a()
            return
    }

    private static final void e(cn.easyar.Target r4, boolean r5) {
            java.lang.String r0 = "t"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = r4.name()
            int r4 = r4.runtimeID()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r5 = 2
            r2[r5] = r4
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r5 = "load target (%b): %s (%d)"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.String r5 = "format(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            return
    }

    public final void b() {
            r3 = this;
            java.util.ArrayList<cn.easyar.ImageTracker> r0 = r3.c
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            cn.easyar.ImageTracker r1 = (cn.easyar.ImageTracker) r1
            r1.a()
            goto Lb
        L20:
            java.util.ArrayList<cn.easyar.ImageTracker> r0 = r3.c
            r0.clear()
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer r0 = r3.d
            r1 = 0
            if (r0 == 0) goto L32
            kotlin.jvm.internal.g0.m(r0)
            r0.a()
            r3.d = r1
        L32:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.a r0 = r3.e
            if (r0 == 0) goto L3e
            kotlin.jvm.internal.g0.m(r0)
            r0.c()
            r3.e = r1
        L3e:
            cn.easyar.CameraDevice r0 = r3.b
            if (r0 == 0) goto L4a
            kotlin.jvm.internal.g0.m(r0)
            r0.a()
            r3.b = r1
        L4a:
            cn.easyar.DelayedCallbackScheduler r0 = r3.a
            if (r0 == 0) goto L56
            kotlin.jvm.internal.g0.m(r0)
            r0.a()
            r3.a = r1
        L56:
            return
    }

    public final void c() {
            r9 = this;
            r9.f()
            r0 = 0
            cn.easyar.CameraDevice r1 = cn.easyar.CameraDeviceSelector.createCameraDevice(r0)
            r9.b = r1
            cn.easyar.InputFrameThrottler r1 = cn.easyar.InputFrameThrottler.create()
            r9.f = r1
            r1 = 2
            cn.easyar.InputFrameFork r2 = cn.easyar.InputFrameFork.create(r1)
            r9.i = r2
            cn.easyar.OutputFrameJoin r2 = cn.easyar.OutputFrameJoin.create(r1)
            r9.j = r2
            cn.easyar.OutputFrameBuffer r2 = cn.easyar.OutputFrameBuffer.create()
            r9.k = r2
            cn.easyar.InputFrameToOutputFrameAdapter r2 = cn.easyar.InputFrameToOutputFrameAdapter.create()
            r9.h = r2
            cn.easyar.InputFrameToFeedbackFrameAdapter r2 = cn.easyar.InputFrameToFeedbackFrameAdapter.create()
            r9.f1469l = r2
            cn.easyar.OutputFrameFork r2 = cn.easyar.OutputFrameFork.create(r1)
            r9.f1470m = r2
            cn.easyar.CameraDevice r2 = r9.b
            kotlin.jvm.internal.g0.m(r2)
            r3 = 1
            boolean r2 = r2.openWithPreferredType(r3)
            cn.easyar.CameraDevice r4 = r9.b
            kotlin.jvm.internal.g0.m(r4)
            cn.easyar.Vec2I r5 = new cn.easyar.Vec2I
            r6 = 1280(0x500, float:1.794E-42)
            r7 = 960(0x3c0, float:1.345E-42)
            r5.<init>(r6, r7)
            r4.setSize(r5)
            cn.easyar.CameraDevice r4 = r9.b
            kotlin.jvm.internal.g0.m(r4)
            r4.setFocusMode(r1)
            if (r2 != 0) goto L5b
            return
        L5b:
            cn.easyar.ImageTracker r2 = cn.easyar.ImageTracker.create()
            java.lang.String r4 = "create(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            java.lang.String r4 = "sightplus/argame00.jpg"
            java.lang.String r5 = "argame00"
            r9.d(r2, r4, r5)
            java.lang.String r4 = "sightplus/argame01.jpg"
            java.lang.String r5 = "argame01"
            r9.d(r2, r4, r5)
            java.lang.String r4 = "sightplus/argame02.jpg"
            java.lang.String r5 = "argame02"
            r9.d(r2, r4, r5)
            java.lang.String r4 = "sightplus/argame03.jpg"
            java.lang.String r5 = "argame03"
            r9.d(r2, r4, r5)
            java.lang.String r4 = "idback.jpg"
            java.lang.String r5 = "idback"
            r9.d(r2, r4, r5)
            java.lang.String r4 = "namecard.jpg"
            java.lang.String r5 = "namecard"
            r9.d(r2, r4, r5)
            r4 = 6
            r2.setSimultaneousNum(r4)
            java.util.ArrayList<cn.easyar.ImageTracker> r4 = r9.c
            r4.add(r2)
            java.util.ArrayList<cn.easyar.ImageTracker> r2 = r9.c
            int r2 = r2.size()
            cn.easyar.FeedbackFrameFork r2 = cn.easyar.FeedbackFrameFork.create(r2)
            r9.g = r2
            cn.easyar.CameraDevice r2 = r9.b
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.InputFrameSource r2 = r2.inputFrameSource()
            cn.easyar.InputFrameThrottler r4 = r9.f
            kotlin.jvm.internal.g0.m(r4)
            cn.easyar.InputFrameSink r4 = r4.input()
            r2.connect(r4)
            cn.easyar.InputFrameThrottler r2 = r9.f
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.InputFrameSource r2 = r2.output()
            cn.easyar.InputFrameFork r4 = r9.i
            kotlin.jvm.internal.g0.m(r4)
            cn.easyar.InputFrameSink r4 = r4.input()
            r2.connect(r4)
            cn.easyar.InputFrameFork r2 = r9.i
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.InputFrameSource r2 = r2.output(r0)
            cn.easyar.InputFrameToOutputFrameAdapter r4 = r9.h
            kotlin.jvm.internal.g0.m(r4)
            cn.easyar.InputFrameSink r4 = r4.input()
            r2.connect(r4)
            cn.easyar.InputFrameToOutputFrameAdapter r2 = r9.h
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.OutputFrameSource r2 = r2.output()
            cn.easyar.OutputFrameJoin r4 = r9.j
            kotlin.jvm.internal.g0.m(r4)
            cn.easyar.OutputFrameSink r4 = r4.input(r0)
            r2.connect(r4)
            cn.easyar.InputFrameFork r2 = r9.i
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.InputFrameSource r2 = r2.output(r3)
            cn.easyar.InputFrameToFeedbackFrameAdapter r4 = r9.f1469l
            kotlin.jvm.internal.g0.m(r4)
            cn.easyar.InputFrameSink r4 = r4.input()
            r2.connect(r4)
            cn.easyar.InputFrameToFeedbackFrameAdapter r2 = r9.f1469l
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.FeedbackFrameSource r2 = r2.output()
            cn.easyar.FeedbackFrameFork r4 = r9.g
            kotlin.jvm.internal.g0.m(r4)
            cn.easyar.FeedbackFrameSink r4 = r4.input()
            r2.connect(r4)
            java.util.ArrayList<cn.easyar.ImageTracker> r2 = r9.c
            java.util.Iterator r2 = r2.iterator()
            java.lang.String r4 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r2, r4)
            r4 = 0
            r5 = 0
        L12e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L166
            java.lang.Object r6 = r2.next()
            java.lang.String r7 = "next(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            cn.easyar.ImageTracker r6 = (cn.easyar.ImageTracker) r6
            cn.easyar.FeedbackFrameFork r7 = r9.g
            kotlin.jvm.internal.g0.m(r7)
            cn.easyar.FeedbackFrameSource r7 = r7.output(r5)
            cn.easyar.FeedbackFrameSink r8 = r6.feedbackFrameSink()
            r7.connect(r8)
            cn.easyar.OutputFrameSource r7 = r6.outputFrameSource()
            cn.easyar.OutputFrameJoin r8 = r9.j
            kotlin.jvm.internal.g0.m(r8)
            int r5 = r5 + r3
            cn.easyar.OutputFrameSink r8 = r8.input(r5)
            r7.connect(r8)
            int r6 = r6.bufferRequirement()
            int r4 = r4 + r6
            goto L12e
        L166:
            cn.easyar.OutputFrameJoin r2 = r9.j
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.OutputFrameSource r2 = r2.output()
            cn.easyar.OutputFrameFork r5 = r9.f1470m
            kotlin.jvm.internal.g0.m(r5)
            cn.easyar.OutputFrameSink r5 = r5.input()
            r2.connect(r5)
            cn.easyar.OutputFrameFork r2 = r9.f1470m
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.OutputFrameSource r0 = r2.output(r0)
            cn.easyar.OutputFrameBuffer r2 = r9.k
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.OutputFrameSink r2 = r2.input()
            r0.connect(r2)
            cn.easyar.OutputFrameFork r0 = r9.f1470m
            kotlin.jvm.internal.g0.m(r0)
            cn.easyar.OutputFrameSource r0 = r0.output(r3)
            cn.easyar.InputFrameToFeedbackFrameAdapter r2 = r9.f1469l
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.OutputFrameSink r2 = r2.sideInput()
            r0.connect(r2)
            cn.easyar.OutputFrameBuffer r0 = r9.k
            kotlin.jvm.internal.g0.m(r0)
            cn.easyar.SignalSource r0 = r0.signalOutput()
            cn.easyar.InputFrameThrottler r2 = r9.f
            kotlin.jvm.internal.g0.m(r2)
            cn.easyar.SignalSink r2 = r2.signalInput()
            r0.connect(r2)
            cn.easyar.CameraDevice r0 = r9.b
            kotlin.jvm.internal.g0.m(r0)
            cn.easyar.InputFrameThrottler r2 = r9.f
            kotlin.jvm.internal.g0.m(r2)
            int r2 = r2.bufferRequirement()
            cn.easyar.InputFrameToFeedbackFrameAdapter r3 = r9.f1469l
            kotlin.jvm.internal.g0.m(r3)
            int r3 = r3.bufferRequirement()
            int r2 = r2 + r3
            cn.easyar.OutputFrameBuffer r3 = r9.k
            kotlin.jvm.internal.g0.m(r3)
            int r3 = r3.bufferRequirement()
            int r2 = r2 + r3
            int r2 = r2 + r4
            int r2 = r2 + r1
            r0.setBufferCapacity(r2)
            return
    }

    public final void f() {
            r2 = this;
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer r0 = r2.d
            r1 = 0
            if (r0 == 0) goto Ld
            kotlin.jvm.internal.g0.m(r0)
            r0.a()
            r2.d = r1
        Ld:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.a r0 = r2.e
            if (r0 == 0) goto L19
            kotlin.jvm.internal.g0.m(r0)
            r0.c()
            r2.e = r1
        L19:
            r0 = -1
            r2.f1471n = r0
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer
            r0.<init>()
            r2.d = r0
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.a r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.a
            r0.<init>()
            r2.e = r0
            return
    }

    public final void g(int r22, int r23, int r24) {
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            java.lang.String r3 = "next(...)"
            java.lang.String r4 = "iterator(...)"
        La:
            cn.easyar.DelayedCallbackScheduler r5 = r1.a
            kotlin.jvm.internal.g0.m(r5)
            boolean r5 = r5.runOne()
            if (r5 != 0) goto La
            r5 = 0
            android.opengl.GLES20.glViewport(r5, r5, r0, r2)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            android.opengl.GLES20.glClearColor(r7, r7, r7, r6)
            r6 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r6)
            cn.easyar.OutputFrameBuffer r6 = r1.k
            kotlin.jvm.internal.g0.m(r6)
            cn.easyar.OutputFrame r6 = r6.peek()
            if (r6 != 0) goto L30
            return
        L30:
            cn.easyar.InputFrame r7 = r6.inputFrame()
            java.lang.String r8 = "inputFrame(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            cn.easyar.CameraParameters r9 = r7.cameraParameters()
            java.lang.String r8 = "cameraParameters(...)"
            kotlin.jvm.internal.g0.o(r9, r8)
            float r0 = (float) r0
            float r2 = (float) r2
            float r12 = r0 / r2
            r0 = 1
            r13 = r24
            cn.easyar.Matrix44F r0 = r9.imageProjection(r12, r13, r0, r5)
            java.lang.String r2 = "imageProjection(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            cn.easyar.Image r2 = r7.image()
            java.lang.String r8 = "image(...)"
            kotlin.jvm.internal.g0.o(r2, r8)
            int r8 = r7.index()     // Catch: java.lang.Throwable -> Lc3
            int r10 = r1.f1471n     // Catch: java.lang.Throwable -> Lc3
            if (r8 == r10) goto Lcc
            cn.easyar.Buffer r8 = r2.buffer()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r10 = "buffer(...)"
            kotlin.jvm.internal.g0.o(r8, r10)     // Catch: java.lang.Throwable -> Lc3
            byte[] r10 = r1.f1472o     // Catch: java.lang.Throwable -> L7b
            if (r10 == 0) goto L7d
            kotlin.jvm.internal.g0.m(r10)     // Catch: java.lang.Throwable -> L7b
            int r10 = r10.length     // Catch: java.lang.Throwable -> L7b
            int r11 = r8.size()     // Catch: java.lang.Throwable -> L7b
            if (r10 == r11) goto L85
            goto L7d
        L7b:
            r0 = move-exception
            goto Lc8
        L7d:
            int r10 = r8.size()     // Catch: java.lang.Throwable -> L7b
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L7b
            r1.f1472o = r10     // Catch: java.lang.Throwable -> L7b
        L85:
            byte[] r10 = r1.f1472o     // Catch: java.lang.Throwable -> L7b
            kotlin.jvm.internal.g0.m(r10)     // Catch: java.lang.Throwable -> L7b
            r8.h(r10)     // Catch: java.lang.Throwable -> L7b
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer r14 = r1.d     // Catch: java.lang.Throwable -> L7b
            kotlin.jvm.internal.g0.m(r14)     // Catch: java.lang.Throwable -> L7b
            int r15 = r2.format()     // Catch: java.lang.Throwable -> L7b
            int r16 = r2.width()     // Catch: java.lang.Throwable -> L7b
            int r17 = r2.height()     // Catch: java.lang.Throwable -> L7b
            int r18 = r2.pixelWidth()     // Catch: java.lang.Throwable -> L7b
            int r19 = r2.pixelHeight()     // Catch: java.lang.Throwable -> L7b
            byte[] r10 = r1.f1472o     // Catch: java.lang.Throwable -> L7b
            kotlin.jvm.internal.g0.m(r10)     // Catch: java.lang.Throwable -> L7b
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r11 = "wrap(...)"
            kotlin.jvm.internal.g0.o(r10, r11)     // Catch: java.lang.Throwable -> L7b
            r20 = r10
            r14.g(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L7b
            r8.a()     // Catch: java.lang.Throwable -> Lc3
            int r8 = r7.index()     // Catch: java.lang.Throwable -> Lc3
            r1.f1471n = r8     // Catch: java.lang.Throwable -> Lc3
            goto Lcc
        Lc3:
            r0 = move-exception
            r23 = r2
            goto L1ad
        Lc8:
            r8.a()     // Catch: java.lang.Throwable -> Lc3
            throw r0     // Catch: java.lang.Throwable -> Lc3
        Lcc:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer r8 = r1.d     // Catch: java.lang.Throwable -> Lc3
            kotlin.jvm.internal.g0.m(r8)     // Catch: java.lang.Throwable -> Lc3
            r8.e(r0)     // Catch: java.lang.Throwable -> Lc3
            r14 = 1
            r15 = 0
            r10 = 1008981770(0x3c23d70a, float:0.01)
            r11 = 1148846080(0x447a0000, float:1000.0)
            cn.easyar.Matrix44F r0 = r9.projection(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r8 = "projection(...)"
            kotlin.jvm.internal.g0.o(r0, r8)     // Catch: java.lang.Throwable -> Lc3
            java.util.ArrayList r8 = r6.results()     // Catch: java.lang.Throwable -> Lc3
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lc3
            kotlin.jvm.internal.g0.o(r8, r4)     // Catch: java.lang.Throwable -> Lc3
        Lef:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto L19e
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> Lc3
            cn.easyar.o r10 = (cn.easyar.o) r10     // Catch: java.lang.Throwable -> Lc3
            boolean r11 = r10 instanceof cn.easyar.ImageTrackerResult     // Catch: java.lang.Throwable -> Lc3
            if (r11 == 0) goto L102
            cn.easyar.ImageTrackerResult r10 = (cn.easyar.ImageTrackerResult) r10     // Catch: java.lang.Throwable -> Lc3
            goto L103
        L102:
            r10 = 0
        L103:
            if (r10 == 0) goto Lef
            java.util.ArrayList r11 = r10.targetInstances()     // Catch: java.lang.Throwable -> Lc3
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lc3
            kotlin.jvm.internal.g0.o(r11, r4)     // Catch: java.lang.Throwable -> Lc3
        L110:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r13 == 0) goto L194
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Throwable -> Lc3
            kotlin.jvm.internal.g0.o(r13, r3)     // Catch: java.lang.Throwable -> Lc3
            cn.easyar.TargetInstance r13 = (cn.easyar.TargetInstance) r13     // Catch: java.lang.Throwable -> Lc3
            cn.easyar.Target r14 = r13.target()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r15 = "target(...)"
            kotlin.jvm.internal.g0.o(r14, r15)     // Catch: java.lang.Throwable -> Lc3
            boolean r15 = r14 instanceof cn.easyar.ImageTarget     // Catch: java.lang.Throwable -> Lc3
            if (r15 == 0) goto L130
            r15 = r14
            cn.easyar.ImageTarget r15 = (cn.easyar.ImageTarget) r15     // Catch: java.lang.Throwable -> Lc3
            goto L131
        L130:
            r15 = 0
        L131:
            if (r15 != 0) goto L134
            goto L110
        L134:
            cn.easyar.ImageTarget r14 = (cn.easyar.ImageTarget) r14     // Catch: java.lang.Throwable -> Lc3
            java.util.ArrayList r14 = r14.images()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r12 = "images(...)"
            kotlin.jvm.internal.g0.o(r14, r12)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r12 = r14.get(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = "get(...)"
            kotlin.jvm.internal.g0.o(r12, r5)     // Catch: java.lang.Throwable -> Lc3
            cn.easyar.Image r12 = (cn.easyar.Image) r12     // Catch: java.lang.Throwable -> Lc3
            float r5 = r15.scale()     // Catch: java.lang.Throwable -> Lc3
            cn.easyar.Vec2F r15 = new cn.easyar.Vec2F     // Catch: java.lang.Throwable -> Lc3
            r23 = r2
            int r2 = r12.height()     // Catch: java.lang.Throwable -> L18d
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L18d
            float r2 = r2 * r5
            int r12 = r12.width()     // Catch: java.lang.Throwable -> L18d
            float r12 = (float) r12     // Catch: java.lang.Throwable -> L18d
            float r2 = r2 / r12
            r15.<init>(r5, r2)     // Catch: java.lang.Throwable -> L18d
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.a r2 = r1.e     // Catch: java.lang.Throwable -> L18d
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Throwable -> L18d
            cn.easyar.Matrix44F r5 = r13.pose()     // Catch: java.lang.Throwable -> L18d
            java.lang.String r12 = "pose(...)"
            kotlin.jvm.internal.g0.o(r5, r12)     // Catch: java.lang.Throwable -> L18d
            r2.j(r0, r5, r15)     // Catch: java.lang.Throwable -> L18d
            java.util.Iterator r2 = r14.iterator()     // Catch: java.lang.Throwable -> L18d
            kotlin.jvm.internal.g0.o(r2, r4)     // Catch: java.lang.Throwable -> L18d
        L17a:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L18d
            if (r5 == 0) goto L18f
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L18d
            kotlin.jvm.internal.g0.o(r5, r3)     // Catch: java.lang.Throwable -> L18d
            cn.easyar.Image r5 = (cn.easyar.Image) r5     // Catch: java.lang.Throwable -> L18d
            r5.a()     // Catch: java.lang.Throwable -> L18d
            goto L17a
        L18d:
            r0 = move-exception
            goto L1ad
        L18f:
            r2 = r23
            r5 = 0
            goto L110
        L194:
            r23 = r2
            r10.a()     // Catch: java.lang.Throwable -> L18d
            r2 = r23
            r5 = 0
            goto Lef
        L19e:
            r23 = r2
            r7.a()
            r6.a()
            r9.a()
            r23.a()
            return
        L1ad:
            r7.a()
            r6.a()
            r9.a()
            r23.a()
            throw r0
    }

    public final boolean h() {
            r4 = this;
            cn.easyar.CameraDevice r0 = r4.b
            if (r0 == 0) goto Lc
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = r0.start()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.util.ArrayList<cn.easyar.ImageTracker> r1 = r4.c
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r2 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.lang.String r3 = "next(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            cn.easyar.ImageTracker r2 = (cn.easyar.ImageTracker) r2
            boolean r2 = r2.start()
            r0 = r0 & r2
            goto L18
        L2f:
            return r0
    }

    public final void i() {
            r3 = this;
            cn.easyar.CameraDevice r0 = r3.b
            if (r0 == 0) goto La
            kotlin.jvm.internal.g0.m(r0)
            r0.stop()
        La:
            java.util.ArrayList<cn.easyar.ImageTracker> r0 = r3.c
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            cn.easyar.ImageTracker r1 = (cn.easyar.ImageTracker) r1
            r1.stop()
            goto L15
        L2a:
            return
    }
}
