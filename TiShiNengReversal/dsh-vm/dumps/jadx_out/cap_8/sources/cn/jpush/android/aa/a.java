package cn.jpush.android.aa;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jpush.android.aa.b f1604b;

    /* renamed from: cn.jpush.android.aa.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: cn.jpush.android.aa.a$a, reason: collision with other inner class name */
    class C0048a extends cn.jpush.android.ad.f {
        final /* synthetic */ cn.jpush.android.aa.a a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f1605b;

        public C0048a(cn.jpush.android.aa.a r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f1605b = r2
                return
        }

        @Override // cn.jpush.android.ad.f
        public void a() {
                r5 = this;
                java.lang.String r0 = r5.f1605b     // Catch: java.lang.Throwable -> L5a
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5a
                if (r0 != 0) goto L14
                cn.jpush.android.aa.a r0 = r5.a     // Catch: java.lang.Throwable -> L5a
                cn.jpush.android.aa.b r0 = cn.jpush.android.aa.a.a(r0)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r1 = r5.f1605b     // Catch: java.lang.Throwable -> L5a
                r0.a(r1)     // Catch: java.lang.Throwable -> L5a
                return
            L14:
                cn.jpush.android.aa.a r0 = r5.a     // Catch: java.lang.Throwable -> L5a
                cn.jpush.android.aa.b r0 = cn.jpush.android.aa.a.a(r0)     // Catch: java.lang.Throwable -> L5a
                java.util.Map r0 = r0.a()     // Catch: java.lang.Throwable -> L5a
                if (r0 == 0) goto L5a
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L5a
                if (r1 <= 0) goto L5a
                cn.jpush.android.aa.a r1 = r5.a     // Catch: java.lang.Throwable -> L5a
                android.content.Context r1 = cn.jpush.android.aa.a.b(r1)     // Catch: java.lang.Throwable -> L5a
                cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.LastReportApiStatisticTime()     // Catch: java.lang.Throwable -> L5a
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L5a
                cn.jpush.android.cache.Key r2 = r2.set(r3)     // Catch: java.lang.Throwable -> L5a
                r3 = 1
                cn.jpush.android.cache.Key[] r3 = new cn.jpush.android.cache.Key[r3]     // Catch: java.lang.Throwable -> L5a
                r4 = 0
                r3[r4] = r2     // Catch: java.lang.Throwable -> L5a
                cn.jpush.android.cache.Sp.set(r1, r3)     // Catch: java.lang.Throwable -> L5a
                cn.jpush.android.aa.a r1 = r5.a     // Catch: java.lang.Throwable -> L5a
                android.content.Context r1 = cn.jpush.android.aa.a.b(r1)     // Catch: java.lang.Throwable -> L5a
                boolean r0 = cn.jpush.android.helper.c.a(r1, r0)     // Catch: java.lang.Throwable -> L5a
                if (r0 == 0) goto L5a
                cn.jpush.android.aa.a r0 = r5.a     // Catch: java.lang.Throwable -> L5a
                cn.jpush.android.aa.b r0 = cn.jpush.android.aa.a.a(r0)     // Catch: java.lang.Throwable -> L5a
                r0.b()     // Catch: java.lang.Throwable -> L5a
            L5a:
                return
        }
    }

    private static class b {
        private static final cn.jpush.android.aa.a a = null;

        static {
                cn.jpush.android.aa.a r0 = new cn.jpush.android.aa.a
                r1 = 0
                r0.<init>(r1)
                cn.jpush.android.aa.a.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jpush.android.aa.a a() {
                cn.jpush.android.aa.a r0 = cn.jpush.android.aa.a.b.a
                return r0
        }
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ a(cn.jpush.android.aa.a.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static final cn.jpush.android.aa.a a() {
            cn.jpush.android.aa.a r0 = cn.jpush.android.aa.a.b.a()
            return r0
    }

    static /* synthetic */ cn.jpush.android.aa.b a(cn.jpush.android.aa.a r0) {
            cn.jpush.android.aa.b r0 = r0.f1604b
            return r0
    }

    static /* synthetic */ android.content.Context b(cn.jpush.android.aa.a r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    public void a(android.content.Context r2) {
            r1 = this;
            android.content.Context r0 = r1.a
            if (r0 == 0) goto La
            cn.jpush.android.aa.b r0 = r1.f1604b
            if (r0 != 0) goto L9
            goto La
        L9:
            return
        La:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
            cn.jpush.android.aa.b r0 = new cn.jpush.android.aa.b
            r0.<init>(r2)
            r1.f1604b = r0
            return
    }

    public void a(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.a(r2)
            r3.getClass()
            int r2 = r3.hashCode()
            r0 = -1
            switch(r2) {
                case -1589456679: goto L95;
                case -1346339041: goto L8a;
                case -1258365551: goto L7f;
                case -834809288: goto L74;
                case -653414577: goto L69;
                case -370069005: goto L5e;
                case -98347653: goto L53;
                case -63913041: goto L48;
                case 283445295: goto L3a;
                case 784590234: goto L2c;
                case 1554655777: goto L1e;
                case 1833972392: goto L10;
                default: goto Le;
            }
        Le:
            goto L9f
        L10:
            java.lang.String r2 = "on_check"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1a
            goto L9f
        L1a:
            r0 = 11
            goto L9f
        L1e:
            java.lang.String r2 = "rm_local_notify"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L28
            goto L9f
        L28:
            r0 = 10
            goto L9f
        L2c:
            java.lang.String r2 = "go_settings"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L9f
        L36:
            r0 = 9
            goto L9f
        L3a:
            java.lang.String r2 = "delete_geo_fence"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L44
            goto L9f
        L44:
            r0 = 8
            goto L9f
        L48:
            java.lang.String r2 = "geo_fence_max_num"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L51
            goto L9f
        L51:
            r0 = 7
            goto L9f
        L53:
            java.lang.String r2 = "add_local_notify"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L5c
            goto L9f
        L5c:
            r0 = 6
            goto L9f
        L5e:
            java.lang.String r2 = "geo_interval"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L67
            goto L9f
        L67:
            r0 = 5
            goto L9f
        L69:
            java.lang.String r2 = "clear_local_notify"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L72
            goto L9f
        L72:
            r0 = 4
            goto L9f
        L74:
            java.lang.String r2 = "is_enable"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L7d
            goto L9f
        L7d:
            r0 = 3
            goto L9f
        L7f:
            java.lang.String r2 = "clear_by_id"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L88
            goto L9f
        L88:
            r0 = 2
            goto L9f
        L8a:
            java.lang.String r2 = "set_mobile"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L93
            goto L9f
        L93:
            r0 = 1
            goto L9f
        L95:
            java.lang.String r2 = "clear_all_notify"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L9e
            goto L9f
        L9e:
            r0 = 0
        L9f:
            switch(r0) {
                case 0: goto Lc6;
                case 1: goto Lc3;
                case 2: goto Lc0;
                case 3: goto Lbd;
                case 4: goto Lba;
                case 5: goto Lb7;
                case 6: goto Lb4;
                case 7: goto Lb1;
                case 8: goto Lae;
                case 9: goto Lab;
                case 10: goto La8;
                case 11: goto La5;
                default: goto La2;
            }
        La2:
            java.lang.String r2 = ""
            goto Lc8
        La5:
            java.lang.String r2 = "JPushMessageReceiver#onNotificationSettingsCheck"
            goto Lc8
        La8:
            java.lang.String r2 = "JPushInterface#removeLocalNotification"
            goto Lc8
        Lab:
            java.lang.String r2 = "JPushInterface#goToAppNotificationSettings"
            goto Lc8
        Lae:
            java.lang.String r2 = "JPushInterface#deleteGeofence"
            goto Lc8
        Lb1:
            java.lang.String r2 = "JPushInterface#setMaxGeofenceNumber"
            goto Lc8
        Lb4:
            java.lang.String r2 = "JPushInterface#addLocalNotification"
            goto Lc8
        Lb7:
            java.lang.String r2 = "JPushInterface#setGeofenceInterval"
            goto Lc8
        Lba:
            java.lang.String r2 = "JPushInterface#clearLocalNotifications"
            goto Lc8
        Lbd:
            java.lang.String r2 = "JPushInterface#isNotificationEnabled"
            goto Lc8
        Lc0:
            java.lang.String r2 = "JPushInterface#clearNotificationById"
            goto Lc8
        Lc3:
            java.lang.String r2 = "JPushInterface#setMobileNumber"
            goto Lc8
        Lc6:
            java.lang.String r2 = "JPushInterface#clearAllNotifications"
        Lc8:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto Lcf
            return
        Lcf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "  statistic api ="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "JPushApiStatistics"
            cn.jpush.android.helper.Logger.d(r0, r3)
            android.content.Context r3 = r1.a
            cn.jpush.android.aa.a$a r0 = new cn.jpush.android.aa.a$a
            r0.<init>(r1, r2)
            r2 = 0
            cn.jpush.android.helper.JCoreHelper.normalExecutor(r3, r2, r0)
            return
    }

    public void b() {
            r9 = this;
            android.content.Context r0 = r9.a
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.LastReportApiStatisticTime()
            java.lang.Object r0 = cn.jpush.android.cache.Sp.get(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r2 - r0
            long r4 = java.lang.Math.abs(r4)
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L4e
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L4e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Less 24 hours since the last report so return. lastTime="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = " currentTime="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = " diffTime="
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "JPushApiStatistics"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            return
        L4e:
            android.content.Context r0 = r9.a
            cn.jpush.android.aa.a$a r1 = new cn.jpush.android.aa.a$a
            java.lang.String r2 = ""
            r1.<init>(r9, r2)
            r2 = 0
            cn.jpush.android.helper.JCoreHelper.normalExecutor(r0, r2, r1)
            return
    }
}
