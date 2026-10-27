package com.bxkj.student.v2.ui.sports.v3.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class m {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.ui.sports.v3.service.m.a a = null;
    private static final int b = 100;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String c = "my_channel_02";
    private static final int d = 101;

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

        public static /* synthetic */ void h(com.bxkj.student.v2.ui.sports.v3.service.m.a r0, android.content.Context r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                r0.g(r1, r2, r3)
                return
        }

        private final void i(android.content.Context r3) {
                r2 = this;
                java.lang.String r0 = "power"
                java.lang.Object r3 = r3.getSystemService(r0)
                java.lang.String r0 = "null cannot be cast to non-null type android.os.PowerManager"
                kotlin.jvm.internal.g0.n(r3, r0)
                android.os.PowerManager r3 = (android.os.PowerManager) r3
                boolean r0 = r3.isInteractive()
                if (r0 != 0) goto L21
                r0 = 268435462(0x10000006, float:2.5243567E-29)
                java.lang.String r1 = "tsnApp:notificationLock"
                android.os.PowerManager$WakeLock r3 = r3.newWakeLock(r0, r1)
                r0 = 3000(0xbb8, double:1.482E-320)
                r3.acquire(r0)
            L21:
                return
        }

        public final void a(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.i(r2)
                return
        }

        public final void b(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "notification"
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "null cannot be cast to non-null type android.app.NotificationManager"
                kotlin.jvm.internal.g0.n(r2, r0)
                android.app.NotificationManager r2 = (android.app.NotificationManager) r2
                r0 = 100
                r2.cancel(r0)
                r2.cancelAll()
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "notification"
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "null cannot be cast to non-null type android.app.NotificationManager"
                kotlin.jvm.internal.g0.n(r2, r0)
                android.app.NotificationManager r2 = (android.app.NotificationManager) r2
                r0 = 101(0x65, float:1.42E-43)
                r2.cancel(r0)
                return
        }

        public final void d(@org.jetbrains.annotations.NotNull android.app.Service r9, @org.jetbrains.annotations.Nullable com.amap.api.location.AMapLocationClient r10) {
                r8 = this;
                java.lang.String r0 = "service"
                kotlin.jvm.internal.g0.p(r9, r0)
                java.lang.String r0 = "notification"
                java.lang.Object r0 = r9.getSystemService(r0)
                java.lang.String r1 = "null cannot be cast to non-null type android.app.NotificationManager"
                kotlin.jvm.internal.g0.n(r0, r1)
                android.app.NotificationManager r0 = (android.app.NotificationManager) r0
                androidx.core.app.NotificationCompat$Builder r1 = new androidx.core.app.NotificationCompat$Builder
                java.lang.String r2 = "my_channel_02"
                r1.<init>(r9, r2)
                r3 = 2131689689(0x7f0f00d9, float:1.90084E38)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setSmallIcon(r3)
                r3 = 1
                androidx.core.app.NotificationCompat$Builder r1 = r1.setPriority(r3)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setOnlyAlertOnce(r3)
                r4 = 64
                androidx.core.app.NotificationCompat$Builder r1 = r1.setDefaults(r4)
                r4 = 0
                androidx.core.app.NotificationCompat$Builder r1 = r1.setAutoCancel(r4)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setOngoing(r3)
                java.lang.String r5 = "setOngoing(...)"
                kotlin.jvm.internal.g0.o(r1, r5)
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 26
                if (r5 < r6) goto L6e
                r5 = 2131951695(0x7f13004f, float:1.9539812E38)
                java.lang.String r5 = r9.getString(r5)
                java.lang.String r6 = "getString(...)"
                kotlin.jvm.internal.g0.o(r5, r6)
                r6 = 4
                android.app.NotificationChannel r5 = cn.jiguang.av.b0.a(r2, r5, r6)
                java.lang.String r6 = "正在记录本次跑步"
                com.bxkj.student.run.app.step.service.b.a(r5, r6)
                cn.jpush.android.x.j.a(r5, r3)
                r6 = -65536(0xffffffffffff0000, float:NaN)
                com.bxkj.student.run.app.step.service.c.a(r5, r6)
                com.bxkj.student.run.app.step.service.a.a(r5, r3)
                r6 = 0
                cn.jpush.android.x.q.a(r5, r6, r6)
                cn.jiguang.av.z.a(r0, r5)
                r1.setChannelId(r2)
            L6e:
                android.widget.RemoteViews r0 = new android.widget.RemoteViews
                java.lang.String r2 = r9.getPackageName()
                r5 = 2131493736(0x7f0c0368, float:1.861096E38)
                r0.<init>(r2, r5)
                com.bxkj.student.v2.common.data.i$a r2 = com.bxkj.student.v2.common.data.i.a
                double r5 = r2.g()
                java.lang.String r5 = com.bxkj.student.run.app.utils.i.c(r5)
                r6 = 2131298881(0x7f090a41, float:1.8215748E38)
                r0.setTextViewText(r6, r5)
                com.bxkj.base.v2.common.utils.x r5 = com.bxkj.base.v2.common.utils.x.a
                java.util.Map r6 = r2.B()
                java.lang.String r7 = "runType"
                int r5 = r5.k(r6, r7)
                r6 = 5
                if (r5 != r6) goto L9b
                r4 = 8
            L9b:
                r5 = 2131298031(0x7f0906ef, float:1.8214024E38)
                r0.setViewVisibility(r5, r4)
                r5 = 2131299173(0x7f090b65, float:1.821634E38)
                r0.setViewVisibility(r5, r4)
                r5 = 2131299117(0x7f090b2d, float:1.8216226E38)
                r0.setViewVisibility(r5, r4)
                long r6 = r2.e()
                java.lang.String r4 = com.bxkj.student.run.app.utils.i.g(r6)
                r6 = 2131299158(0x7f090b56, float:1.821631E38)
                r0.setTextViewText(r6, r4)
                int r2 = r2.G()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.setTextViewText(r5, r2)
                r1.setCustomContentView(r0)
                r1.setCustomBigContentView(r0)
                r1.setVisibility(r3)
                android.content.Intent r0 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V4SportActivity> r2 = com.bxkj.student.v2.ui.sports.v3.V4SportActivity.class
                r0.<init>(r9, r2)
                r2 = 134217728(0x8000000, float:3.85186E-34)
                android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r9, r3, r0, r2)
                r1.setContentIntent(r0)
                android.app.Notification r0 = r1.build()
                java.lang.String r1 = "build(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                r1 = 100
                r9.startForeground(r1, r0)
                if (r10 == 0) goto Lf2
                r10.enableBackgroundLocation(r1, r0)
            Lf2:
                return
        }

        public final void e(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "title"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "longText"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r0 = "notification"
                java.lang.Object r0 = r5.getSystemService(r0)
                java.lang.String r1 = "null cannot be cast to non-null type android.app.NotificationManager"
                kotlin.jvm.internal.g0.n(r0, r1)
                android.app.NotificationManager r0 = (android.app.NotificationManager) r0
                androidx.core.app.NotificationCompat$Builder r1 = new androidx.core.app.NotificationCompat$Builder
                java.lang.String r2 = "my_channel_02"
                r1.<init>(r5, r2)
                r3 = 2131689689(0x7f0f00d9, float:1.90084E38)
                androidx.core.app.NotificationCompat$Builder r1 = r1.setSmallIcon(r3)
                androidx.core.app.NotificationCompat$Builder r6 = r1.setContentTitle(r6)
                androidx.core.app.NotificationCompat$Builder r6 = r6.setContentText(r7)
                androidx.core.app.NotificationCompat$BigTextStyle r1 = new androidx.core.app.NotificationCompat$BigTextStyle
                r1.<init>()
                androidx.core.app.NotificationCompat$BigTextStyle r7 = r1.bigText(r7)
                androidx.core.app.NotificationCompat$Builder r6 = r6.setStyle(r7)
                r7 = 0
                androidx.core.app.NotificationCompat$Builder r6 = r6.setPriority(r7)
                r1 = 2131099718(0x7f060046, float:1.7811797E38)
                int r1 = androidx.core.content.ContextCompat.getColor(r5, r1)
                androidx.core.app.NotificationCompat$Builder r6 = r6.setColor(r1)
                r1 = 1
                androidx.core.app.NotificationCompat$Builder r6 = r6.setAutoCancel(r1)
                java.lang.String r1 = "setAutoCancel(...)"
                kotlin.jvm.internal.g0.o(r6, r1)
                android.content.Intent r1 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V4SportActivity> r3 = com.bxkj.student.v2.ui.sports.v3.V4SportActivity.class
                r1.<init>(r5, r3)
                r3 = 201326592(0xc000000, float:9.8607613E-32)
                android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r5, r7, r1, r3)
                r6.setContentIntent(r5)
                int r5 = android.os.Build.VERSION.SDK_INT
                r7 = 26
                if (r5 < r7) goto L72
                r6.setChannelId(r2)
            L72:
                r5 = 101(0x65, float:1.42E-43)
                android.app.Notification r6 = r6.build()
                r0.notify(r5, r6)
                return
        }

        public final void f(@org.jetbrains.annotations.NotNull android.content.Context r8) {
                r7 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r8, r0)
                r5 = 4
                r6 = 0
                java.lang.String r3 = ""
                r4 = 0
                r1 = r7
                r2 = r8
                h(r1, r2, r3, r4, r5, r6)
                return
        }

        public final void g(@org.jetbrains.annotations.NotNull android.content.Context r17, @org.jetbrains.annotations.NotNull java.lang.String r18, boolean r19) {
                r16 = this;
                r0 = r17
                r1 = r18
                java.lang.String r2 = "context"
                kotlin.jvm.internal.g0.p(r0, r2)
                java.lang.String r2 = "msg"
                kotlin.jvm.internal.g0.p(r1, r2)
                long r2 = java.lang.System.currentTimeMillis()
                androidx.core.app.NotificationCompat$Builder r4 = new androidx.core.app.NotificationCompat$Builder
                java.lang.String r5 = "my_channel_02"
                r4.<init>(r0, r5)
                r6 = 2131689689(0x7f0f00d9, float:1.90084E38)
                androidx.core.app.NotificationCompat$Builder r4 = r4.setSmallIcon(r6)
                androidx.core.app.NotificationCompat$Builder r2 = r4.setWhen(r2)
                r3 = 1
                androidx.core.app.NotificationCompat$Builder r2 = r2.setPriority(r3)
                r4 = r19 ^ 1
                androidx.core.app.NotificationCompat$Builder r2 = r2.setOnlyAlertOnce(r4)
                r4 = 64
                androidx.core.app.NotificationCompat$Builder r2 = r2.setDefaults(r4)
                r4 = 0
                androidx.core.app.NotificationCompat$Builder r2 = r2.setAutoCancel(r4)
                androidx.core.app.NotificationCompat$Builder r2 = r2.setOngoing(r3)
                java.lang.String r6 = "setOngoing(...)"
                kotlin.jvm.internal.g0.o(r2, r6)
                java.lang.String r6 = "notification"
                java.lang.Object r6 = r0.getSystemService(r6)
                java.lang.String r7 = "null cannot be cast to non-null type android.app.NotificationManager"
                kotlin.jvm.internal.g0.n(r6, r7)
                android.app.NotificationManager r6 = (android.app.NotificationManager) r6
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 26
                if (r7 < r8) goto L59
                r2.setChannelId(r5)
            L59:
                android.widget.RemoteViews r5 = new android.widget.RemoteViews
                java.lang.String r7 = r0.getPackageName()
                r8 = 2131493736(0x7f0c0368, float:1.861096E38)
                r5.<init>(r7, r8)
                com.bxkj.student.v2.common.data.i$a r7 = com.bxkj.student.v2.common.data.i.a
                double r8 = r7.g()
                java.lang.String r8 = com.bxkj.student.run.app.utils.i.c(r8)
                r9 = 2131298881(0x7f090a41, float:1.8215748E38)
                r5.setTextViewText(r9, r8)
                long r8 = r7.e()
                java.lang.String r8 = com.bxkj.student.run.app.utils.i.g(r8)
                r9 = 2131299158(0x7f090b56, float:1.821631E38)
                r5.setTextViewText(r9, r8)
                int r8 = r7.G()
                java.lang.String r8 = java.lang.String.valueOf(r8)
                r9 = 2131299117(0x7f090b2d, float:1.8216226E38)
                r5.setTextViewText(r9, r8)
                int r8 = r1.length()
                r10 = 2131099718(0x7f060046, float:1.7811797E38)
                r11 = 2131298776(0x7f0909d8, float:1.8215535E38)
                if (r8 != 0) goto Led
                double r12 = r7.i()
                r14 = 0
                int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r1 != 0) goto Lb7
                java.lang.String r1 = "体适能正在记录本次跑步"
                r5.setTextViewText(r11, r1)
                r1 = 2131099731(0x7f060053, float:1.7811823E38)
                int r1 = androidx.core.content.ContextCompat.getColor(r0, r1)
                r5.setTextColor(r11, r1)
                goto Lfa
            Lb7:
                com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                java.util.Map r8 = r7.B()
                java.lang.String r12 = "faceDistanceOut"
                double r12 = r1.f(r8, r12)
                r1 = 1000(0x3e8, float:1.401E-42)
                double r14 = (double) r1
                double r12 = r12 * r14
                int r1 = (int) r12
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r12 = "请在"
                r8.append(r12)
                r8.append(r1)
                java.lang.String r1 = "米范围内进行人脸识别！"
                r8.append(r1)
                java.lang.String r1 = r8.toString()
                r16.i(r17)
                r5.setTextViewText(r11, r1)
                int r1 = androidx.core.content.ContextCompat.getColor(r0, r10)
                r5.setTextColor(r11, r1)
                goto Lfa
            Led:
                r16.i(r17)
                r5.setTextViewText(r11, r1)
                int r1 = androidx.core.content.ContextCompat.getColor(r0, r10)
                r5.setTextColor(r11, r1)
            Lfa:
                com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                java.util.Map r7 = r7.B()
                java.lang.String r8 = "runType"
                int r1 = r1.k(r7, r8)
                r7 = 5
                if (r1 != r7) goto L10b
                r4 = 8
            L10b:
                r1 = 2131298031(0x7f0906ef, float:1.8214024E38)
                r5.setViewVisibility(r1, r4)
                r1 = 2131299173(0x7f090b65, float:1.821634E38)
                r5.setViewVisibility(r1, r4)
                r5.setViewVisibility(r9, r4)
                r2.setCustomContentView(r5)
                r2.setCustomBigContentView(r5)
                r2.setVisibility(r3)
                android.content.Intent r1 = new android.content.Intent
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.V4SportActivity> r4 = com.bxkj.student.v2.ui.sports.v3.V4SportActivity.class
                r1.<init>(r0, r4)
                r4 = 134217728(0x8000000, float:3.85186E-34)
                android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r3, r1, r4)
                r2.setContentIntent(r0)
                android.app.Notification r0 = r2.build()
                java.lang.String r1 = "build(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                r1 = 100
                r6.notify(r1, r0)
                return
        }
    }

    static {
            com.bxkj.student.v2.ui.sports.v3.service.m$a r0 = new com.bxkj.student.v2.ui.sports.v3.service.m$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.ui.sports.v3.service.m.a = r0
            return
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }
}
