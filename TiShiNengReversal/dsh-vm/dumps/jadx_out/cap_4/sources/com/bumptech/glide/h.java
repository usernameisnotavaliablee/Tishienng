package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h<TranscodeType> extends com.bumptech.glide.request.a<com.bumptech.glide.h<TranscodeType>> implements java.lang.Cloneable, com.bumptech.glide.g<com.bumptech.glide.h<TranscodeType>> {
    protected static final com.bumptech.glide.request.h J0 = null;

    @androidx.annotation.Nullable
    private java.lang.Float F0;
    private boolean G0;
    private boolean H0;
    private boolean I0;
    private final android.content.Context V;
    private final com.bumptech.glide.i W;
    private final java.lang.Class<TranscodeType> X;
    private final com.bumptech.glide.b Y;
    private final com.bumptech.glide.d Z;

    @androidx.annotation.NonNull
    private com.bumptech.glide.j<?, ? super TranscodeType> a0;

    @androidx.annotation.Nullable
    private java.lang.Object b0;

    @androidx.annotation.Nullable
    private java.util.List<com.bumptech.glide.request.g<TranscodeType>> c0;

    /* renamed from: k0, reason: collision with root package name */
    @androidx.annotation.Nullable
    private com.bumptech.glide.h<TranscodeType> f388k0;

    /* renamed from: p0, reason: collision with root package name */
    @androidx.annotation.Nullable
    private com.bumptech.glide.h<TranscodeType> f389p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;
        static final /* synthetic */ int[] b = null;

        static {
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.h.a.b = r0
                r1 = 1
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.bumptech.glide.h.a.b     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.bumptech.glide.h.a.b     // Catch: java.lang.NoSuchFieldError -> L28
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.bumptech.glide.h.a.b     // Catch: java.lang.NoSuchFieldError -> L33
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.bumptech.glide.h.a.a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = com.bumptech.glide.h.a.a     // Catch: java.lang.NoSuchFieldError -> L4e
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = com.bumptech.glide.h.a.a     // Catch: java.lang.NoSuchFieldError -> L58
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = com.bumptech.glide.h.a.a     // Catch: java.lang.NoSuchFieldError -> L62
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                int[] r0 = com.bumptech.glide.h.a.a     // Catch: java.lang.NoSuchFieldError -> L6d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                int[] r0 = com.bumptech.glide.h.a.a     // Catch: java.lang.NoSuchFieldError -> L78
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.bumptech.glide.h.a.a     // Catch: java.lang.NoSuchFieldError -> L83
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                int[] r0 = com.bumptech.glide.h.a.a     // Catch: java.lang.NoSuchFieldError -> L8f
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch: java.lang.NoSuchFieldError -> L8f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
            L8f:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            com.bumptech.glide.request.h r0 = new com.bumptech.glide.request.h
            r0.<init>()
            com.bumptech.glide.load.engine.j r1 = com.bumptech.glide.load.engine.j.c
            com.bumptech.glide.request.a r0 = r0.t(r1)
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            com.bumptech.glide.Priority r1 = com.bumptech.glide.Priority.LOW
            com.bumptech.glide.request.a r0 = r0.A0(r1)
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            r1 = 1
            com.bumptech.glide.request.a r0 = r0.I0(r1)
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            com.bumptech.glide.h.J0 = r0
            return
    }

    @android.annotation.SuppressLint({"CheckResult"})
    protected h(@androidx.annotation.NonNull com.bumptech.glide.b r2, com.bumptech.glide.i r3, java.lang.Class<TranscodeType> r4, android.content.Context r5) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.G0 = r0
            r1.Y = r2
            r1.W = r3
            r1.X = r4
            r1.V = r5
            com.bumptech.glide.j r4 = r3.E(r4)
            r1.a0 = r4
            com.bumptech.glide.d r2 = r2.j()
            r1.Z = r2
            java.util.List r2 = r3.C()
            r1.h1(r2)
            com.bumptech.glide.request.h r2 = r3.D()
            r1.V0(r2)
            return
    }

    @android.annotation.SuppressLint({"CheckResult"})
    protected h(java.lang.Class<TranscodeType> r4, com.bumptech.glide.h<?> r5) {
            r3 = this;
            com.bumptech.glide.b r0 = r5.Y
            com.bumptech.glide.i r1 = r5.W
            android.content.Context r2 = r5.V
            r3.<init>(r0, r1, r4, r2)
            java.lang.Object r4 = r5.b0
            r3.b0 = r4
            boolean r4 = r5.H0
            r3.H0 = r4
            r3.V0(r5)
            return
    }

    private com.bumptech.glide.request.e W0(com.bumptech.glide.request.target.p<TranscodeType> r12, @androidx.annotation.Nullable com.bumptech.glide.request.g<TranscodeType> r13, com.bumptech.glide.request.a<?> r14, java.util.concurrent.Executor r15) {
            r11 = this;
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            com.bumptech.glide.j<?, ? super TranscodeType> r5 = r11.a0
            com.bumptech.glide.Priority r6 = r14.R()
            int r7 = r14.O()
            int r8 = r14.N()
            r4 = 0
            r0 = r11
            r2 = r12
            r3 = r13
            r9 = r14
            r10 = r15
            com.bumptech.glide.request.e r12 = r0.X0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    private com.bumptech.glide.request.e X0(java.lang.Object r14, com.bumptech.glide.request.target.p<TranscodeType> r15, @androidx.annotation.Nullable com.bumptech.glide.request.g<TranscodeType> r16, @androidx.annotation.Nullable com.bumptech.glide.request.RequestCoordinator r17, com.bumptech.glide.j<?, ? super TranscodeType> r18, com.bumptech.glide.Priority r19, int r20, int r21, com.bumptech.glide.request.a<?> r22, java.util.concurrent.Executor r23) {
            r13 = this;
            com.bumptech.glide.h<TranscodeType> r0 = r13.f389p0
            if (r0 == 0) goto L1e
            com.bumptech.glide.request.b r0 = new com.bumptech.glide.request.b
            r1 = r17
            r0.<init>(r14, r1)
            r5 = r0
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            goto L33
        L1e:
            r1 = r17
            r0 = 0
            r5 = r1
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r1 = r13
        L33:
            com.bumptech.glide.request.e r12 = r1.Y0(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != 0) goto L3a
            return r12
        L3a:
            com.bumptech.glide.h<TranscodeType> r1 = r13.f389p0
            int r1 = r1.O()
            com.bumptech.glide.h<TranscodeType> r2 = r13.f389p0
            int r2 = r2.N()
            boolean r3 = com.bumptech.glide.util.l.w(r20, r21)
            if (r3 == 0) goto L5c
            com.bumptech.glide.h<TranscodeType> r3 = r13.f389p0
            boolean r3 = r3.l0()
            if (r3 != 0) goto L5c
            int r1 = r22.O()
            int r2 = r22.N()
        L5c:
            r8 = r1
            r9 = r2
            com.bumptech.glide.h<TranscodeType> r1 = r13.f389p0
            com.bumptech.glide.j<?, ? super TranscodeType> r6 = r1.a0
            com.bumptech.glide.Priority r7 = r1.R()
            com.bumptech.glide.h<TranscodeType> r10 = r13.f389p0
            r2 = r14
            r3 = r15
            r4 = r16
            r11 = r23
            r5 = r0
            com.bumptech.glide.request.e r14 = r1.X0(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r5.n(r12, r14)
            return r5
    }

    private com.bumptech.glide.request.e Y0(java.lang.Object r17, com.bumptech.glide.request.target.p<TranscodeType> r18, com.bumptech.glide.request.g<TranscodeType> r19, @androidx.annotation.Nullable com.bumptech.glide.request.RequestCoordinator r20, com.bumptech.glide.j<?, ? super TranscodeType> r21, com.bumptech.glide.Priority r22, int r23, int r24, com.bumptech.glide.request.a<?> r25, java.util.concurrent.Executor r26) {
            r16 = this;
            r0 = r16
            r1 = r17
            r5 = r20
            r7 = r22
            com.bumptech.glide.h<TranscodeType> r2 = r0.f388k0
            if (r2 == 0) goto L8d
            boolean r3 = r0.I0
            if (r3 != 0) goto L84
            com.bumptech.glide.j<?, ? super TranscodeType> r3 = r2.a0
            boolean r4 = r2.G0
            if (r4 == 0) goto L19
            r11 = r21
            goto L1a
        L19:
            r11 = r3
        L1a:
            boolean r2 = r2.d0()
            if (r2 == 0) goto L28
            com.bumptech.glide.h<TranscodeType> r2 = r0.f388k0
            com.bumptech.glide.Priority r2 = r2.R()
        L26:
            r12 = r2
            goto L2d
        L28:
            com.bumptech.glide.Priority r2 = r0.g1(r7)
            goto L26
        L2d:
            com.bumptech.glide.h<TranscodeType> r2 = r0.f388k0
            int r2 = r2.O()
            com.bumptech.glide.h<TranscodeType> r3 = r0.f388k0
            int r3 = r3.N()
            boolean r4 = com.bumptech.glide.util.l.w(r23, r24)
            if (r4 == 0) goto L4f
            com.bumptech.glide.h<TranscodeType> r4 = r0.f388k0
            boolean r4 = r4.l0()
            if (r4 != 0) goto L4f
            int r2 = r25.O()
            int r3 = r25.N()
        L4f:
            r13 = r2
            r14 = r3
            com.bumptech.glide.request.k r4 = new com.bumptech.glide.request.k
            r4.<init>(r1, r5)
            r2 = r18
            r3 = r19
            r6 = r21
            r8 = r23
            r9 = r24
            r10 = r26
            r5 = r4
            r4 = r25
            com.bumptech.glide.request.e r15 = r0.z1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 1
            r0.I0 = r1
            r1 = r0
            com.bumptech.glide.h<TranscodeType> r0 = r1.f388k0
            r9 = r0
            r4 = r5
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r11 = r1
            r1 = r17
            com.bumptech.glide.request.e r0 = r0.X0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r5 = r4
            r1 = 0
            r11.I0 = r1
            r5.m(r15, r0)
            return r5
        L84:
            r11 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L8d:
            r11 = r0
            java.lang.Float r0 = r11.F0
            if (r0 == 0) goto Lcb
            com.bumptech.glide.request.k r0 = new com.bumptech.glide.request.k
            r0.<init>(r1, r5)
            r2 = r18
            r3 = r19
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r4 = r25
            r10 = r26
            r5 = r0
            r0 = r11
            com.bumptech.glide.request.e r11 = r0.z1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.bumptech.glide.request.a r1 = r25.q()
            java.lang.Float r2 = r0.F0
            float r2 = r2.floatValue()
            com.bumptech.glide.request.a r4 = r1.H0(r2)
            com.bumptech.glide.Priority r7 = r0.g1(r7)
            r1 = r17
            r2 = r18
            com.bumptech.glide.request.e r1 = r0.z1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r5.m(r11, r1)
            return r5
        Lcb:
            r2 = r18
            r3 = r19
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r4 = r25
            r10 = r26
            r0 = r11
            com.bumptech.glide.request.e r1 = r0.z1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    private com.bumptech.glide.h<TranscodeType> a1() {
            r2 = this;
            com.bumptech.glide.h r0 = r2.Z0()
            r1 = 0
            com.bumptech.glide.h r0 = r0.d1(r1)
            com.bumptech.glide.h r0 = r0.F1(r1)
            return r0
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.Priority g1(@androidx.annotation.NonNull com.bumptech.glide.Priority r3) {
            r2 = this;
            int[] r0 = com.bumptech.glide.h.a.b
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L36
            r0 = 2
            if (r3 == r0) goto L33
            r0 = 3
            if (r3 == r0) goto L30
            r0 = 4
            if (r3 != r0) goto L15
            goto L30
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown priority: "
            r0.append(r1)
            com.bumptech.glide.Priority r1 = r2.R()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L30:
            com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.IMMEDIATE
            return r3
        L33:
            com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.HIGH
            return r3
        L36:
            com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL
            return r3
    }

    @android.annotation.SuppressLint({"CheckResult"})
    private void h1(java.util.List<com.bumptech.glide.request.g<java.lang.Object>> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            com.bumptech.glide.request.g r0 = (com.bumptech.glide.request.g) r0
            r1.U0(r0)
            goto L4
        L14:
            return
    }

    private <Y extends com.bumptech.glide.request.target.p<TranscodeType>> Y k1(@androidx.annotation.NonNull Y r2, @androidx.annotation.Nullable com.bumptech.glide.request.g<TranscodeType> r3, com.bumptech.glide.request.a<?> r4, java.util.concurrent.Executor r5) {
            r1 = this;
            com.bumptech.glide.util.k.d(r2)
            boolean r0 = r1.H0
            if (r0 == 0) goto L39
            com.bumptech.glide.request.e r3 = r1.W0(r2, r3, r4, r5)
            com.bumptech.glide.request.e r5 = r2.d()
            boolean r0 = r3.f(r5)
            if (r0 == 0) goto L2b
            boolean r4 = r1.n1(r4, r5)
            if (r4 != 0) goto L2b
            java.lang.Object r3 = com.bumptech.glide.util.k.d(r5)
            com.bumptech.glide.request.e r3 = (com.bumptech.glide.request.e) r3
            boolean r3 = r3.isRunning()
            if (r3 != 0) goto L2a
            r5.h()
        L2a:
            return r2
        L2b:
            com.bumptech.glide.i r4 = r1.W
            r4.z(r2)
            r2.n(r3)
            com.bumptech.glide.i r4 = r1.W
            r4.Y(r2, r3)
            return r2
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "You must call #load() before calling #into()"
            r2.<init>(r3)
            throw r2
    }

    private boolean n1(com.bumptech.glide.request.a<?> r1, com.bumptech.glide.request.e r2) {
            r0 = this;
            boolean r1 = r1.c0()
            if (r1 != 0) goto Le
            boolean r1 = r2.isComplete()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.h<TranscodeType> y1(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.Z()
            if (r0 == 0) goto Lf
            com.bumptech.glide.h r0 = r1.Z0()
            com.bumptech.glide.h r2 = r0.y1(r2)
            return r2
        Lf:
            r1.b0 = r2
            r2 = 1
            r1.H0 = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            return r2
    }

    private com.bumptech.glide.request.e z1(java.lang.Object r18, com.bumptech.glide.request.target.p<TranscodeType> r19, com.bumptech.glide.request.g<TranscodeType> r20, com.bumptech.glide.request.a<?> r21, com.bumptech.glide.request.RequestCoordinator r22, com.bumptech.glide.j<?, ? super TranscodeType> r23, com.bumptech.glide.Priority r24, int r25, int r26, java.util.concurrent.Executor r27) {
            r17 = this;
            r0 = r17
            android.content.Context r1 = r0.V
            com.bumptech.glide.d r2 = r0.Z
            java.lang.Object r4 = r0.b0
            java.lang.Class<TranscodeType> r5 = r0.X
            java.util.List<com.bumptech.glide.request.g<TranscodeType>> r12 = r0.c0
            com.bumptech.glide.load.engine.k r14 = r2.f()
            com.bumptech.glide.request.transition.g r15 = r23.c()
            r3 = r18
            r10 = r19
            r11 = r20
            r6 = r21
            r13 = r22
            r9 = r24
            r7 = r25
            r8 = r26
            r16 = r27
            com.bumptech.glide.request.j r1 = com.bumptech.glide.request.j.w(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.target.p<TranscodeType> A1() {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            com.bumptech.glide.request.target.p r0 = r1.B1(r0, r0)
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.target.p<TranscodeType> B1(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.i r0 = r1.W
            com.bumptech.glide.request.target.m r2 = com.bumptech.glide.request.target.m.c(r0, r2, r3)
            com.bumptech.glide.request.target.p r2 = r1.j1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.d<TranscodeType> C1() {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            com.bumptech.glide.request.d r0 = r1.D1(r0, r0)
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.d<TranscodeType> D1(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.request.f r0 = new com.bumptech.glide.request.f
            r0.<init>(r2, r3)
            java.util.concurrent.Executor r2 = com.bumptech.glide.util.e.a()
            com.bumptech.glide.request.target.p r2 = r1.l1(r0, r0, r2)
            com.bumptech.glide.request.d r2 = (com.bumptech.glide.request.d) r2
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> E1(float r2) {
            r1 = this;
            boolean r0 = r1.Z()
            if (r0 == 0) goto Lf
            com.bumptech.glide.h r0 = r1.Z0()
            com.bumptech.glide.h r2 = r0.E1(r2)
            return r2
        Lf:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L27
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L27
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.F0 = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            return r2
        L27:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sizeMultiplier must be between 0 and 1"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> F1(@androidx.annotation.Nullable com.bumptech.glide.h<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.Z()
            if (r0 == 0) goto Lf
            com.bumptech.glide.h r0 = r1.Z0()
            com.bumptech.glide.h r2 = r0.F1(r2)
            return r2
        Lf:
            r1.f388k0 = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> G1(@androidx.annotation.Nullable java.util.List<com.bumptech.glide.h<TranscodeType>> r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L2b
        La:
            int r1 = r4.size()
            int r1 = r1 + (-1)
        L10:
            if (r1 < 0) goto L26
            java.lang.Object r2 = r4.get(r1)
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            if (r2 != 0) goto L1b
            goto L23
        L1b:
            if (r0 != 0) goto L1f
            r0 = r2
            goto L23
        L1f:
            com.bumptech.glide.h r0 = r2.F1(r0)
        L23:
            int r1 = r1 + (-1)
            goto L10
        L26:
            com.bumptech.glide.h r4 = r3.F1(r0)
            return r4
        L2b:
            com.bumptech.glide.h r4 = r3.F1(r0)
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> H1(@androidx.annotation.Nullable com.bumptech.glide.h<TranscodeType>... r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.bumptech.glide.h r2 = r1.G1(r2)
            return r2
        Lf:
            r2 = 0
            com.bumptech.glide.h r2 = r1.F1(r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> I1(@androidx.annotation.NonNull com.bumptech.glide.j<?, ? super TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.Z()
            if (r0 == 0) goto Lf
            com.bumptech.glide.h r0 = r1.Z0()
            com.bumptech.glide.h r2 = r0.I1(r2)
            return r2
        Lf:
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.j r2 = (com.bumptech.glide.j) r2
            r1.a0 = r2
            r2 = 0
            r1.G0 = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> U0(@androidx.annotation.Nullable com.bumptech.glide.request.g<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.Z()
            if (r0 == 0) goto Lf
            com.bumptech.glide.h r0 = r1.Z0()
            com.bumptech.glide.h r2 = r0.U0(r2)
            return r2
        Lf:
            if (r2 == 0) goto L21
            java.util.List<com.bumptech.glide.request.g<TranscodeType>> r0 = r1.c0
            if (r0 != 0) goto L1c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
        L1c:
            java.util.List<com.bumptech.glide.request.g<TranscodeType>> r0 = r1.c0
            r0.add(r2)
        L21:
            com.bumptech.glide.request.a r2 = r1.E0()
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> V0(@androidx.annotation.NonNull com.bumptech.glide.request.a<?> r1) {
            r0 = this;
            com.bumptech.glide.util.k.d(r1)
            com.bumptech.glide.request.a r1 = super.b(r1)
            com.bumptech.glide.h r1 = (com.bumptech.glide.h) r1
            return r1
    }

    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> Z0() {
            r3 = this;
            com.bumptech.glide.request.a r0 = super.q()
            com.bumptech.glide.h r0 = (com.bumptech.glide.h) r0
            com.bumptech.glide.j<?, ? super TranscodeType> r1 = r0.a0
            com.bumptech.glide.j r1 = r1.a()
            r0.a0 = r1
            java.util.List<com.bumptech.glide.request.g<TranscodeType>> r1 = r0.c0
            if (r1 == 0) goto L1b
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.bumptech.glide.request.g<TranscodeType>> r2 = r0.c0
            r1.<init>(r2)
            r0.c0 = r1
        L1b:
            com.bumptech.glide.h<TranscodeType> r1 = r0.f388k0
            if (r1 == 0) goto L25
            com.bumptech.glide.h r1 = r1.Z0()
            r0.f388k0 = r1
        L25:
            com.bumptech.glide.h<TranscodeType> r1 = r0.f389p0
            if (r1 == 0) goto L2f
            com.bumptech.glide.h r1 = r1.Z0()
            r0.f389p0 = r1
        L2f:
            return r0
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object a(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.v1(r1)
            return r1
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a b(@androidx.annotation.NonNull com.bumptech.glide.request.a r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.V0(r1)
            return r1
    }

    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public com.bumptech.glide.request.d<java.io.File> b1(int r2, int r3) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.f1()
            com.bumptech.glide.request.d r2 = r0.D1(r2, r3)
            return r2
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.lang.Object c(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.w1(r1)
            return r1
    }

    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public <Y extends com.bumptech.glide.request.target.p<java.io.File>> Y c1(@androidx.annotation.NonNull Y r2) {
            r1 = this;
            com.bumptech.glide.h r0 = r1.f1()
            com.bumptech.glide.request.target.p r2 = r0.j1(r2)
            return r2
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bumptech.glide.h r0 = r1.Z0()
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.h<TranscodeType> d1(@androidx.annotation.Nullable com.bumptech.glide.h<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.Z()
            if (r0 == 0) goto Lf
            com.bumptech.glide.h r0 = r1.Z0()
            com.bumptech.glide.h r2 = r0.d1(r2)
            return r2
        Lf:
            r1.f389p0 = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            com.bumptech.glide.h r2 = (com.bumptech.glide.h) r2
            return r2
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object e(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.s1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> e1(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L8
            r2 = 0
            com.bumptech.glide.h r2 = r1.d1(r2)
            return r2
        L8:
            com.bumptech.glide.h r0 = r1.a1()
            com.bumptech.glide.h r2 = r0.u1(r2)
            com.bumptech.glide.h r2 = r1.d1(r2)
            return r2
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object f(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.q1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    protected com.bumptech.glide.h<java.io.File> f1() {
            r2 = this;
            com.bumptech.glide.h r0 = new com.bumptech.glide.h
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r0.<init>(r1, r2)
            com.bumptech.glide.request.h r1 = com.bumptech.glide.h.J0
            com.bumptech.glide.h r0 = r0.V0(r1)
            return r0
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object i(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.u1(r1)
            return r1
    }

    @java.lang.Deprecated
    public com.bumptech.glide.request.d<TranscodeType> i1(int r1, int r2) {
            r0 = this;
            com.bumptech.glide.request.d r1 = r0.D1(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public <Y extends com.bumptech.glide.request.target.p<TranscodeType>> Y j1(@androidx.annotation.NonNull Y r3) {
            r2 = this;
            r0 = 0
            java.util.concurrent.Executor r1 = com.bumptech.glide.util.e.b()
            com.bumptech.glide.request.target.p r3 = r2.l1(r3, r0, r1)
            return r3
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object k(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.r1(r1)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object l(@androidx.annotation.Nullable byte[] r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.x1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    <Y extends com.bumptech.glide.request.target.p<TranscodeType>> Y l1(@androidx.annotation.NonNull Y r1, @androidx.annotation.Nullable com.bumptech.glide.request.g<TranscodeType> r2, java.util.concurrent.Executor r3) {
            r0 = this;
            com.bumptech.glide.request.target.p r1 = r0.k1(r1, r2, r0, r3)
            return r1
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object m(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.p1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.request.target.r<android.widget.ImageView, TranscodeType> m1(@androidx.annotation.NonNull android.widget.ImageView r4) {
            r3 = this;
            com.bumptech.glide.util.l.b()
            com.bumptech.glide.util.k.d(r4)
            boolean r0 = r3.k0()
            if (r0 != 0) goto L4c
            boolean r0 = r3.i0()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.h.a.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            com.bumptech.glide.request.a r0 = r3.q()
            com.bumptech.glide.request.a r0 = r0.p0()
            goto L4d
        L31:
            com.bumptech.glide.request.a r0 = r3.q()
            com.bumptech.glide.request.a r0 = r0.r0()
            goto L4d
        L3a:
            com.bumptech.glide.request.a r0 = r3.q()
            com.bumptech.glide.request.a r0 = r0.p0()
            goto L4d
        L43:
            com.bumptech.glide.request.a r0 = r3.q()
            com.bumptech.glide.request.a r0 = r0.o0()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.Z
            java.lang.Class<TranscodeType> r2 = r3.X
            com.bumptech.glide.request.target.r r4 = r1.a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = com.bumptech.glide.util.e.b()
            com.bumptech.glide.request.target.p r4 = r3.k1(r4, r1, r0, r2)
            com.bumptech.glide.request.target.r r4 = (com.bumptech.glide.request.target.r) r4
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> o1(@androidx.annotation.Nullable com.bumptech.glide.request.g<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.Z()
            if (r0 == 0) goto Lf
            com.bumptech.glide.h r0 = r1.Z0()
            com.bumptech.glide.h r2 = r0.o1(r2)
            return r2
        Lf:
            r0 = 0
            r1.c0 = r0
            com.bumptech.glide.h r2 = r1.U0(r2)
            return r2
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object p(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.t1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> p1(@androidx.annotation.Nullable android.graphics.Bitmap r2) {
            r1 = this;
            com.bumptech.glide.h r2 = r1.y1(r2)
            com.bumptech.glide.load.engine.j r0 = com.bumptech.glide.load.engine.j.b
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.Z0(r0)
            com.bumptech.glide.h r2 = r2.V0(r0)
            return r2
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a q() {
            r1 = this;
            com.bumptech.glide.h r0 = r1.Z0()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> q1(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.bumptech.glide.h r2 = r1.y1(r2)
            com.bumptech.glide.load.engine.j r0 = com.bumptech.glide.load.engine.j.b
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.Z0(r0)
            com.bumptech.glide.h r2 = r2.V0(r0)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> r1(@androidx.annotation.Nullable android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.y1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> s1(@androidx.annotation.Nullable java.io.File r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.y1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> t1(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer r2) {
            r1 = this;
            com.bumptech.glide.h r2 = r1.y1(r2)
            android.content.Context r0 = r1.V
            com.bumptech.glide.load.c r0 = com.bumptech.glide.signature.a.c(r0)
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.q1(r0)
            com.bumptech.glide.h r2 = r2.V0(r0)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> u1(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.y1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> v1(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.y1(r1)
            return r1
    }

    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public com.bumptech.glide.h<TranscodeType> w1(@androidx.annotation.Nullable java.net.URL r1) {
            r0 = this;
            com.bumptech.glide.h r1 = r0.y1(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public com.bumptech.glide.h<TranscodeType> x1(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            com.bumptech.glide.h r2 = r1.y1(r2)
            boolean r0 = r2.a0()
            if (r0 != 0) goto L14
            com.bumptech.glide.load.engine.j r0 = com.bumptech.glide.load.engine.j.b
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.Z0(r0)
            com.bumptech.glide.h r2 = r2.V0(r0)
        L14:
            boolean r0 = r2.h0()
            if (r0 != 0) goto L23
            r0 = 1
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.s1(r0)
            com.bumptech.glide.h r2 = r2.V0(r0)
        L23:
            return r2
    }
}
