package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class y {
    private static java.util.List<java.lang.Integer> a;
    private static android.media.MediaPlayer b;
    private static android.media.MediaPlayer.OnCompletionListener c;
    private static android.media.MediaPlayer.OnErrorListener d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.media.MediaPlayer.OnErrorListener {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(android.media.MediaPlayer r1, int r2, int r3) {
                r0 = this;
                android.media.MediaPlayer r1 = com.bxkj.student.run.app.utils.y.b()
                if (r1 == 0) goto Ld
                android.media.MediaPlayer r1 = com.bxkj.student.run.app.utils.y.b()
                r1.reset()
            Ld:
                r1 = 0
                return r1
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bxkj.student.run.app.utils.y.a = r0
            com.bxkj.student.run.app.utils.x r0 = new com.bxkj.student.run.app.utils.x
            r0.<init>()
            com.bxkj.student.run.app.utils.y.c = r0
            com.bxkj.student.run.app.utils.y$a r0 = new com.bxkj.student.run.app.utils.y$a
            r0.<init>()
            com.bxkj.student.run.app.utils.y.d = r0
            return
    }

    public y() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(android.media.MediaPlayer r0) {
            h()
            return
    }

    static /* bridge */ /* synthetic */ android.media.MediaPlayer b() {
            android.media.MediaPlayer r0 = com.bxkj.student.run.app.utils.y.b
            return r0
    }

    private static android.media.MediaPlayer c(android.content.Context r0, int r1) {
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r0, r1)
            com.bxkj.student.run.app.utils.y.b = r0
            android.media.MediaPlayer$OnCompletionListener r1 = com.bxkj.student.run.app.utils.y.c
            r0.setOnCompletionListener(r1)
            android.media.MediaPlayer r0 = com.bxkj.student.run.app.utils.y.b
            android.media.MediaPlayer$OnErrorListener r1 = com.bxkj.student.run.app.utils.y.d
            r0.setOnErrorListener(r1)
            android.media.MediaPlayer r0 = com.bxkj.student.run.app.utils.y.b
            return r0
    }

    private static void d(android.content.Context r0, int r1) {
            android.media.MediaPlayer r0 = c(r0, r1)
            com.bxkj.student.run.app.utils.y.b = r0
            return
    }

    public static void e(android.content.Context r15, long r16, int r18) {
            r0 = r18
            r1 = 2131886173(0x7f12005d, float:1.9406917E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2131886109(0x7f12001d, float:1.9406788E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getFrequency()
            r4 = 3
            if (r3 != r4) goto L1d
            goto L2a1
        L1d:
            r3 = 216000000(0xcdfe600, double:1.067181795E-315)
            int r5 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r5 <= 0) goto L26
            goto L2a1
        L26:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getFrequency()
            r4 = 60
            r6 = 1
            if (r3 != 0) goto L34
            goto L4e
        L34:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getFrequency()
            if (r3 != r6) goto L41
            r4 = 120(0x78, double:5.93E-322)
            goto L4e
        L41:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getFrequency()
            r7 = 2
            if (r3 != r7) goto L4e
            r4 = 300(0x12c, double:1.48E-321)
        L4e:
            long r3 = r16 % r4
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L2a1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 2131886087(0x7f120007, float:1.9406743E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            r4 = 2131886080(0x7f120000, float:1.9406729E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            r4 = 100000(0x186a0, float:1.4013E-40)
            int r4 = r0 / r4
            int r4 = r4 % 10
            java.lang.String r5 = "raw"
            java.lang.String r7 = "num_"
            if (r4 <= 0) goto La2
            android.content.res.Resources r8 = r15.getResources()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            android.content.pm.ApplicationInfo r10 = r15.getApplicationInfo()
            java.lang.String r10 = r10.packageName
            int r8 = r8.getIdentifier(r9, r5, r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.add(r8)
            r3.add(r1)
        La2:
            int r8 = r0 / 10000
            int r8 = r8 % 10
            if (r8 <= 0) goto Ld7
            android.content.res.Resources r9 = r15.getResources()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            android.content.pm.ApplicationInfo r11 = r15.getApplicationInfo()
            java.lang.String r11 = r11.packageName
            int r9 = r9.getIdentifier(r10, r5, r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.add(r9)
            r9 = 2131886182(0x7f120066, float:1.9406936E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.add(r9)
            goto Ldc
        Ld7:
            if (r4 <= 0) goto Ldc
            r3.add(r2)
        Ldc:
            int r9 = r0 / 1000
            int r9 = r9 % 10
            if (r9 <= 0) goto L111
            android.content.res.Resources r10 = r15.getResources()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            android.content.pm.ApplicationInfo r12 = r15.getApplicationInfo()
            java.lang.String r12 = r12.packageName
            int r10 = r10.getIdentifier(r11, r5, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r3.add(r10)
            r10 = 2131886098(0x7f120012, float:1.9406765E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r3.add(r10)
            goto L116
        L111:
            if (r8 <= 0) goto L116
            r3.add(r2)
        L116:
            int r10 = r0 / 100
            int r10 = r10 % 10
            if (r10 <= 0) goto L14b
            android.content.res.Resources r11 = r15.getResources()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            android.content.pm.ApplicationInfo r13 = r15.getApplicationInfo()
            java.lang.String r13 = r13.packageName
            int r11 = r11.getIdentifier(r12, r5, r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.add(r11)
            r11 = 2131886081(0x7f120001, float:1.940673E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.add(r11)
            goto L150
        L14b:
            if (r9 <= 0) goto L150
            r3.add(r2)
        L150:
            int r11 = r0 / 10
            int r11 = r11 % 10
            if (r11 <= 0) goto L17e
            android.content.res.Resources r12 = r15.getResources()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            android.content.pm.ApplicationInfo r14 = r15.getApplicationInfo()
            java.lang.String r14 = r14.packageName
            int r12 = r12.getIdentifier(r13, r5, r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.add(r12)
            r3.add(r1)
            goto L183
        L17e:
            if (r10 <= 0) goto L183
            r3.add(r2)
        L183:
            int r1 = r0 % 10
            if (r1 <= 0) goto L1ab
            android.content.res.Resources r12 = r15.getResources()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            android.content.pm.ApplicationInfo r14 = r15.getApplicationInfo()
            java.lang.String r14 = r14.packageName
            int r12 = r12.getIdentifier(r13, r5, r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.add(r12)
        L1ab:
            if (r0 <= 0) goto L1cd
            int r12 = r3.size()
            if (r12 <= 0) goto L1cd
            int r12 = r3.size()
            int r12 = r12 - r6
            java.lang.Object r12 = r3.get(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L1cd
            int r0 = r3.size()
            int r0 = r0 - r6
            r3.remove(r0)
            goto L1d2
        L1cd:
            if (r0 != 0) goto L1d2
            r3.add(r2)
        L1d2:
            r0 = 2131886175(0x7f12005f, float:1.9406921E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "文字="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = "十"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r4 = "万"
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = "千"
            r0.append(r4)
            r0.append(r10)
            java.lang.String r4 = "百"
            r0.append(r4)
            r0.append(r11)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "个"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            r0 = 2131886089(0x7f120009, float:1.9406747E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            java.lang.String r0 = com.bxkj.student.run.app.utils.i.g(r16)
            java.lang.String r1 = "\\:"
            java.lang.String[] r0 = r0.split(r1)
            r1 = 0
            r1 = r0[r1]
            int r1 = java.lang.Integer.parseInt(r1)
            if (r1 <= 0) goto L266
            android.content.res.Resources r2 = r15.getResources()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.content.pm.ApplicationInfo r4 = r15.getApplicationInfo()
            java.lang.String r4 = r4.packageName
            int r1 = r2.getIdentifier(r1, r5, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            r1 = 2131886097(0x7f120011, float:1.9406763E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
        L266:
            r0 = r0[r6]
            int r0 = java.lang.Integer.parseInt(r0)
            android.content.res.Resources r1 = r15.getResources()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.content.pm.ApplicationInfo r2 = r15.getApplicationInfo()
            java.lang.String r2 = r2.packageName
            int r0 = r1.getIdentifier(r0, r5, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            r0 = 2131886108(0x7f12001c, float:1.9406786E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            com.bxkj.student.run.app.utils.d0 r0 = com.bxkj.student.run.app.utils.d0.e()
            r0.l(r15, r3)
        L2a1:
            return
    }

    public static void f(android.content.Context r2, int r3) {
            java.util.List<java.lang.Integer> r0 = com.bxkj.student.run.app.utils.y.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.add(r1)
            android.media.MediaPlayer r0 = com.bxkj.student.run.app.utils.y.b     // Catch: java.lang.IllegalStateException -> L2d
            if (r0 != 0) goto L11
            d(r2, r3)     // Catch: java.lang.IllegalStateException -> L2d
            goto L1a
        L11:
            boolean r0 = r0.isPlaying()     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1a
            h()     // Catch: java.lang.Exception -> L1a
        L1a:
            d(r2, r3)     // Catch: java.lang.IllegalStateException -> L2d
            android.media.MediaPlayer r2 = com.bxkj.student.run.app.utils.y.b     // Catch: java.lang.IllegalStateException -> L2d
            if (r2 != 0) goto L2a
            java.lang.String r2 = "cant find soundName"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalStateException -> L2d
            com.orhanobut.logger.j.e(r2, r3)     // Catch: java.lang.IllegalStateException -> L2d
            goto L2d
        L2a:
            r2.start()     // Catch: java.lang.IllegalStateException -> L2d
        L2d:
            return
    }

    public static void g(android.content.Context r16, long r17, double r19, int r21) {
            r0 = r21
            r1 = 2131886173(0x7f12005d, float:1.9406917E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2131886109(0x7f12001d, float:1.9406788E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getFrequency()
            r4 = 3
            if (r3 != r4) goto L1d
            goto L341
        L1d:
            r3 = 216000000(0xcdfe600, double:1.067181795E-315)
            int r5 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r5 <= 0) goto L26
            goto L341
        L26:
            r3 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            int r5 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r5 <= 0) goto L31
            goto L341
        L31:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getFrequency()
            r4 = 60
            r6 = 1
            if (r3 != 0) goto L3f
            goto L59
        L3f:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getFrequency()
            if (r3 != r6) goto L4c
            r4 = 120(0x78, double:5.93E-322)
            goto L59
        L4c:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getFrequency()
            r7 = 2
            if (r3 != r7) goto L59
            r4 = 300(0x12c, double:1.48E-321)
        L59:
            long r3 = r17 % r4
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L341
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 2131886087(0x7f120007, float:1.9406743E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            r4 = 2131886080(0x7f120000, float:1.9406729E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            java.lang.String r4 = com.bxkj.student.run.app.utils.i.d(r19)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "formatDistance="
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.orhanobut.logger.j.c(r5)
            java.lang.String r5 = "\\."
            java.lang.String[] r4 = r4.split(r5)
            r5 = 0
            r7 = r4[r5]
            int r7 = java.lang.Integer.parseInt(r7)
            android.content.res.Resources r8 = r16.getResources()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "num_"
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            android.content.pm.ApplicationInfo r9 = r16.getApplicationInfo()
            java.lang.String r9 = r9.packageName
            java.lang.String r11 = "raw"
            int r7 = r8.getIdentifier(r7, r11, r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.add(r7)
            r7 = 2131886088(0x7f120008, float:1.9406745E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.add(r7)
            r4 = r4[r6]
            char[] r4 = r4.toCharArray()
            int r7 = r4.length
            r8 = 0
        Ld8:
            if (r8 >= r7) goto L107
            char r9 = r4[r8]
            java.lang.String r9 = java.lang.String.valueOf(r9)
            android.content.res.Resources r12 = r16.getResources()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            android.content.pm.ApplicationInfo r13 = r16.getApplicationInfo()
            java.lang.String r13 = r13.packageName
            int r9 = r12.getIdentifier(r9, r11, r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.add(r9)
            int r8 = r8 + 1
            goto Ld8
        L107:
            r4 = 2131886100(0x7f120014, float:1.940677E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            r4 = 100000(0x186a0, float:1.4013E-40)
            int r4 = r0 / r4
            int r4 = r4 % 10
            if (r4 <= 0) goto L141
            android.content.res.Resources r7 = r16.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            android.content.pm.ApplicationInfo r9 = r16.getApplicationInfo()
            java.lang.String r9 = r9.packageName
            int r7 = r7.getIdentifier(r8, r11, r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.add(r7)
            r3.add(r1)
        L141:
            int r7 = r0 / 10000
            int r7 = r7 % 10
            if (r7 <= 0) goto L176
            android.content.res.Resources r8 = r16.getResources()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.content.pm.ApplicationInfo r12 = r16.getApplicationInfo()
            java.lang.String r12 = r12.packageName
            int r8 = r8.getIdentifier(r9, r11, r12)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.add(r8)
            r8 = 2131886182(0x7f120066, float:1.9406936E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.add(r8)
            goto L17b
        L176:
            if (r4 <= 0) goto L17b
            r3.add(r2)
        L17b:
            int r8 = r0 / 1000
            int r8 = r8 % 10
            if (r8 <= 0) goto L1b0
            android.content.res.Resources r9 = r16.getResources()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            android.content.pm.ApplicationInfo r13 = r16.getApplicationInfo()
            java.lang.String r13 = r13.packageName
            int r9 = r9.getIdentifier(r12, r11, r13)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.add(r9)
            r9 = 2131886098(0x7f120012, float:1.9406765E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.add(r9)
            goto L1b5
        L1b0:
            if (r7 <= 0) goto L1b5
            r3.add(r2)
        L1b5:
            int r9 = r0 / 100
            int r9 = r9 % 10
            if (r9 <= 0) goto L1ea
            android.content.res.Resources r12 = r16.getResources()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            android.content.pm.ApplicationInfo r14 = r16.getApplicationInfo()
            java.lang.String r14 = r14.packageName
            int r12 = r12.getIdentifier(r13, r11, r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.add(r12)
            r12 = 2131886081(0x7f120001, float:1.940673E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.add(r12)
            goto L1ef
        L1ea:
            if (r8 <= 0) goto L1ef
            r3.add(r2)
        L1ef:
            int r12 = r0 / 10
            int r12 = r12 % 10
            if (r12 <= 0) goto L21d
            android.content.res.Resources r13 = r16.getResources()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            android.content.pm.ApplicationInfo r15 = r16.getApplicationInfo()
            java.lang.String r15 = r15.packageName
            int r13 = r13.getIdentifier(r14, r11, r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r3.add(r13)
            r3.add(r1)
            goto L222
        L21d:
            if (r9 <= 0) goto L222
            r3.add(r2)
        L222:
            int r1 = r0 % 10
            if (r1 <= 0) goto L24a
            android.content.res.Resources r13 = r16.getResources()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            android.content.pm.ApplicationInfo r15 = r16.getApplicationInfo()
            java.lang.String r15 = r15.packageName
            int r13 = r13.getIdentifier(r14, r11, r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r3.add(r13)
        L24a:
            if (r0 <= 0) goto L26c
            int r13 = r3.size()
            if (r13 <= 0) goto L26c
            int r13 = r3.size()
            int r13 = r13 - r6
            java.lang.Object r13 = r3.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L26c
            int r0 = r3.size()
            int r0 = r0 - r6
            r3.remove(r0)
            goto L271
        L26c:
            if (r0 != 0) goto L271
            r3.add(r2)
        L271:
            r0 = 2131886175(0x7f12005f, float:1.9406921E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "文字="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = "十"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r4 = "万"
            r0.append(r4)
            r0.append(r8)
            java.lang.String r4 = "千"
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = "百"
            r0.append(r4)
            r0.append(r12)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "个"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            r0 = 2131886089(0x7f120009, float:1.9406747E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            java.lang.String r0 = com.bxkj.student.run.app.utils.i.g(r17)
            java.lang.String r1 = "\\:"
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0[r5]
            int r1 = java.lang.Integer.parseInt(r1)
            if (r1 <= 0) goto L304
            android.content.res.Resources r2 = r16.getResources()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.content.pm.ApplicationInfo r4 = r16.getApplicationInfo()
            java.lang.String r4 = r4.packageName
            int r1 = r2.getIdentifier(r1, r11, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            r1 = 2131886097(0x7f120011, float:1.9406763E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
        L304:
            r0 = r0[r6]
            int r0 = java.lang.Integer.parseInt(r0)
            android.content.res.Resources r1 = r16.getResources()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.content.pm.ApplicationInfo r2 = r16.getApplicationInfo()
            java.lang.String r2 = r2.packageName
            int r0 = r1.getIdentifier(r0, r11, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            r0 = 2131886108(0x7f12001c, float:1.9406786E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            com.bxkj.student.run.app.utils.d0 r0 = com.bxkj.student.run.app.utils.d0.e()
            r1 = r16
            r0.l(r1, r3)
        L341:
            return
    }

    private static void h() {
            android.media.MediaPlayer r0 = com.bxkj.student.run.app.utils.y.b
            if (r0 == 0) goto Lf
            r0.stop()
            android.media.MediaPlayer r0 = com.bxkj.student.run.app.utils.y.b
            r0.release()
            r0 = 0
            com.bxkj.student.run.app.utils.y.b = r0
        Lf:
            return
    }
}
