package cn.jpush.android.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* renamed from: cn.jpush.android.x.a$a, reason: collision with other inner class name */
    public static class C0055a {
        public java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.CharSequence f2012b;

        /* renamed from: c, reason: collision with root package name */
        public int f2013c;

        /* renamed from: d, reason: collision with root package name */
        public int f2014d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2015e;

        /* renamed from: f, reason: collision with root package name */
        public int f2016f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f2017g;

        /* renamed from: h, reason: collision with root package name */
        public android.net.Uri f2018h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2019i;

        public C0055a(java.lang.String r1, java.lang.CharSequence r2, int r3, int r4, java.lang.String r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2012b = r2
                r0.f2013c = r3
                r0.f2016f = r4
                r0.f2017g = r5
                r0.f2014d = r6
                r1 = -1
                if (r1 == r6) goto L14
                r1 = 1
                goto L15
            L14:
                r1 = 0
            L15:
                r0.f2015e = r1
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(int r3) {
            r0 = -2
            r1 = 1
            if (r3 == r0) goto L11
            r0 = -1
            r2 = 2
            if (r3 == r0) goto L10
            if (r3 == r1) goto Le
            if (r3 == r2) goto Le
            r3 = 3
            return r3
        Le:
            r3 = 4
            return r3
        L10:
            return r2
        L11:
            return r1
    }

    private static java.lang.String a(android.content.Context r12, int r13) {
            java.lang.String r0 = "ChannelHelper"
            java.lang.String r1 = "LOW"
            java.lang.String r2 = "HIGH"
            r3 = 2
            r4 = -1
            r5 = 1
            r6 = -2
            if (r13 == r6) goto L19
            if (r13 == r4) goto L17
            if (r13 == r5) goto L15
            if (r13 == r3) goto L15
            java.lang.String r7 = "DEFAULT"
            goto L1b
        L15:
            r7 = r2
            goto L1b
        L17:
            r7 = r1
            goto L1b
        L19:
            java.lang.String r7 = "MIN"
        L1b:
            java.lang.String r8 = ""
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r9.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = "jg_channel_name_p_"
            r9.append(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r7.toLowerCase()     // Catch: java.lang.Throwable -> L67
            r9.append(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L67
            android.content.res.Resources r9 = r12.getResources()     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = "string"
            java.lang.String r11 = r12.getPackageName()     // Catch: java.lang.Throwable -> L67
            int r9 = r9.getIdentifier(r7, r10, r11)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L69
            android.content.res.Resources r12 = r12.getResources()     // Catch: java.lang.Throwable -> L67
            java.lang.String r8 = r12.getString(r9)     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r12.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r9 = "found "
            r12.append(r9)     // Catch: java.lang.Throwable -> L67
            r12.append(r8)     // Catch: java.lang.Throwable -> L67
            java.lang.String r9 = " from resource by name:"
            r12.append(r9)     // Catch: java.lang.Throwable -> L67
            r12.append(r7)     // Catch: java.lang.Throwable -> L67
        L5f:
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L67
            cn.jpush.android.helper.Logger.dd(r0, r12)     // Catch: java.lang.Throwable -> L67
            goto L8f
        L67:
            r12 = move-exception
            goto L77
        L69:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r12.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r9 = "not found string value from resource by name:"
            r12.append(r9)     // Catch: java.lang.Throwable -> L67
            r12.append(r7)     // Catch: java.lang.Throwable -> L67
            goto L5f
        L77:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "get resource channel ID failed:"
            r7.append(r9)
            java.lang.String r12 = r12.getMessage()
            r7.append(r12)
            java.lang.String r12 = r7.toString()
            cn.jpush.android.helper.Logger.ww(r0, r12)
        L8f:
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L96
            return r8
        L96:
            java.util.Locale r12 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> La6
            java.lang.String r12 = r12.getLanguage()     // Catch: java.lang.Throwable -> La6
            java.lang.String r7 = "zh"
            boolean r12 = r12.contains(r7)     // Catch: java.lang.Throwable -> La6
            goto Lc0
        La6:
            r12 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "get language failed:"
            r7.append(r8)
            java.lang.String r12 = r12.getMessage()
            r7.append(r12)
            java.lang.String r12 = r7.toString()
            cn.jpush.android.helper.Logger.ww(r0, r12)
            r12 = 1
        Lc0:
            if (r13 == r6) goto Ld8
            if (r13 == r4) goto Ld8
            if (r13 == r5) goto Ld1
            if (r13 == r3) goto Ld1
            if (r12 == 0) goto Lce
            java.lang.String r12 = "普通"
            goto Lde
        Lce:
            java.lang.String r12 = "NORMAL"
            goto Lde
        Ld1:
            if (r12 == 0) goto Ld6
            java.lang.String r2 = "重要"
        Ld6:
            r12 = r2
            goto Lde
        Ld8:
            if (r12 == 0) goto Ldd
            java.lang.String r1 = "不重要"
        Ldd:
            r12 = r1
        Lde:
            return r12
    }

    private static java.lang.String a(android.content.Context r7, int r8, int r9) {
            int r3 = a(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JPush_"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = a(r7, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "channelId:"
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = ",channelName:"
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = ",importance:"
            r8.append(r0)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "ChannelHelper"
            cn.jpush.android.helper.Logger.d(r0, r8)
            r5 = 0
            r6 = 0
            r0 = r7
            r4 = r9
            boolean r7 = a(r0, r1, r2, r3, r4, r5, r6)
            if (r7 == 0) goto L52
            return r1
        L52:
            java.lang.String r7 = ""
            return r7
    }

    private static java.lang.String a(cn.jpush.android.x.a.C0055a r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JPush_"
            r0.append(r1)
            int r1 = r3.f2014d
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            int r2 = r3.f2016f
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.net.Uri r2 = r3.f2018h
            if (r2 == 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r3 = r3.f2017g
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            return r3
        L36:
            return r0
    }

    public static void a(android.content.Context r2) {
            r0 = -1
            r1 = 0
            a(r2, r0, r1)
            r0 = 7
            a(r2, r1, r0)
            return
    }

    public static void a(android.content.Context r7, android.app.Notification.Builder r8, java.lang.String r9, java.lang.CharSequence r10, int r11, int r12, java.lang.String r13, int r14) {
            cn.jpush.android.x.a$a r0 = new cn.jpush.android.x.a$a
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            a(r7, r0)
            cn.jpush.android.x.b.a(r7, r8, r0)
            return
    }

    public static void a(android.content.Context r7, android.app.Notification r8, java.lang.String r9, java.lang.CharSequence r10, int r11, int r12, java.lang.String r13, int r14) {
            cn.jpush.android.x.a$a r0 = new cn.jpush.android.x.a$a
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            a(r7, r0)
            cn.jpush.android.x.b.a(r8, r0)
            return
    }

    public static void a(android.content.Context r11, cn.jpush.android.x.a.C0055a r12) {
            boolean r0 = cn.jpush.android.x.b.c(r11)
            r1 = 26
            r2 = 0
            java.lang.String r3 = "ChannelHelper"
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = "in silence push time,change defaults to 0"
            cn.jpush.android.helper.Logger.d(r3, r0)
            java.lang.String r0 = ""
            r12.a = r0
            r12.f2016f = r2
            r12.f2017g = r5
            goto L4e
        L1b:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L4e
            android.app.NotificationChannel r0 = b(r11, r12)
            if (r0 == 0) goto L4e
            java.lang.String r11 = cn.jpush.android.x.i.a(r0)
            r12.a = r11
            java.lang.CharSequence r11 = cn.jpush.android.x.n.a(r0)
            r12.f2012b = r11
            int r11 = cn.jpush.android.x.o.a(r0)
            r12.f2014d = r11
            int r11 = b(r11)
            r12.f2013c = r11
            android.net.Uri r11 = cn.jpush.android.x.p.a(r0)
            r12.f2018h = r11
            if (r11 == 0) goto L4b
            java.lang.String r11 = r11.getPath()
            r12.f2017g = r11
        L4b:
            r12.f2019i = r4
            return
        L4e:
            int r0 = r12.f2013c
            r6 = -2
            if (r0 == r6) goto L68
            r7 = -1
            if (r0 != r7) goto L57
            goto L68
        L57:
            if (r0 < 0) goto L6c
            int r0 = r12.f2016f
            if (r0 != 0) goto L6c
            java.lang.String r0 = r12.f2017g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L6c
            r12.f2013c = r7
            goto L6c
        L68:
            r12.f2016f = r2
            r12.f2017g = r5
        L6c:
            int r0 = r12.f2016f
            r0 = r0 & 7
            r12.f2016f = r0
            int r0 = r12.f2013c
            r2 = 2
            if (r0 != r2) goto L79
            r12.f2013c = r4
        L79:
            int r0 = r12.f2013c
            int r0 = a(r0)
            r12.f2014d = r0
            int r0 = b(r0)
            r12.f2013c = r0
            java.lang.String r0 = r12.f2017g
            android.net.Uri r0 = cn.jpush.android.x.b.a(r11, r0)
            r12.f2018h = r0
            if (r0 == 0) goto L97
            int r0 = r12.f2016f
            r0 = r0 & r6
            r12.f2016f = r0
            goto L99
        L97:
            r12.f2017g = r5
        L99:
            java.lang.String r0 = r12.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc0
            java.lang.String r0 = a(r12)
            r12.a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto Lc0
            android.app.NotificationChannel r0 = b(r11, r12)
            if (r0 == 0) goto Lc0
            java.lang.String r11 = cn.jpush.android.x.i.a(r0)
            r12.a = r11
            java.lang.CharSequence r11 = cn.jpush.android.x.n.a(r0)
            r12.f2012b = r11
            r12.f2019i = r4
            return
        Lc0:
            java.lang.CharSequence r0 = r12.f2012b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Leb
            java.lang.String r0 = "KG_channel_normal"
            java.lang.String r1 = r12.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le4
            java.lang.String r0 = "com.tencent.karaoke"
            java.lang.String r1 = r11.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le4
            java.lang.String r0 = "普通_K歌"
        Le1:
            r12.f2012b = r0
            goto Leb
        Le4:
            int r0 = r12.f2013c
            java.lang.String r0 = a(r11, r0)
            goto Le1
        Leb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "create channelId:"
            r0.append(r1)
            java.lang.String r1 = r12.a
            r0.append(r1)
            java.lang.String r1 = ",channelName:"
            r0.append(r1)
            java.lang.CharSequence r1 = r12.f2012b
            r0.append(r1)
            java.lang.String r1 = ",soundUri:"
            r0.append(r1)
            android.net.Uri r1 = r12.f2018h
            r0.append(r1)
            java.lang.String r1 = ",importance:"
            r0.append(r1)
            int r1 = r12.f2014d
            r0.append(r1)
            java.lang.String r1 = ", hasImportance:"
            r0.append(r1)
            boolean r1 = r12.f2015e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r3, r0)
            java.lang.String r5 = r12.a
            java.lang.CharSequence r6 = r12.f2012b
            int r7 = r12.f2014d
            int r8 = r12.f2016f
            android.net.Uri r9 = r12.f2018h
            boolean r10 = r12.f2015e
            r4 = r11
            boolean r11 = a(r4, r5, r6, r7, r8, r9, r10)
            r12.f2019i = r11
            return
    }

    private static boolean a(android.content.Context r6, java.lang.String r7, java.lang.CharSequence r8, int r9, int r10, android.net.Uri r11, boolean r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            java.lang.String r2 = "ChannelHelper"
            r3 = 26
            if (r0 < r3) goto L14a
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            if (r0 >= r3) goto L13
            goto L14a
        L13:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch: java.lang.Throwable -> L23
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L26
            java.lang.String r6 = "NotificationManager is null!"
            cn.jpush.android.helper.Logger.ee(r2, r6)     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r6 = move-exception
            goto L135
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "prepare NotificationChannel, channelId="
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            r3.append(r7)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = ""
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.Logger.dd(r2, r3)     // Catch: java.lang.Throwable -> L23
            r3 = 1
            android.app.NotificationChannel r4 = cn.jiguang.av.y.a(r0, r7)     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L89
            cn.jpush.android.x.r.a(r4, r8)     // Catch: java.lang.Throwable -> L6b
            if (r12 == 0) goto L6d
            cn.jpush.android.x.s.a(r4, r9)     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r12.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = "prepare NotificationChannel, channelId: "
            r12.append(r5)     // Catch: java.lang.Throwable -> L6b
            r12.append(r7)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = "set importance:"
            r12.append(r5)     // Catch: java.lang.Throwable -> L6b
            r12.append(r9)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L6b
            cn.jpush.android.helper.Logger.dd(r2, r12)     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r12 = move-exception
            goto L71
        L6d:
            cn.jiguang.av.z.a(r0, r4)     // Catch: java.lang.Throwable -> L6b
            return r3
        L71:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r4.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "check channelID failed:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L23
            r4.append(r12)     // Catch: java.lang.Throwable -> L23
            java.lang.String r12 = r4.toString()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.Logger.w(r2, r12)     // Catch: java.lang.Throwable -> L23
        L89:
            cn.jpush.android.f.g.a()     // Catch: java.lang.Throwable -> L23
            android.app.NotificationChannel r7 = cn.jiguang.av.b0.a(r7, r8, r9)     // Catch: java.lang.Throwable -> L23
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9f
            r9 = 28
            java.lang.String r12 = "JIGUANG_CHANNEL_GROUP"
            if (r8 < r9) goto La1
            android.app.NotificationChannelGroup r8 = cn.jpush.android.x.t.a(r0, r12)     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto La1
            goto Laf
        L9f:
            r6 = move-exception
            goto Lb3
        La1:
            cn.jpush.android.x.m.a()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = cn.jpush.android.ad.a.b(r6)     // Catch: java.lang.Throwable -> L9f
            android.app.NotificationChannelGroup r6 = cn.jpush.android.x.l.a(r12, r6)     // Catch: java.lang.Throwable -> L9f
            cn.jpush.android.x.u.a(r0, r6)     // Catch: java.lang.Throwable -> L9f
        Laf:
            cn.jpush.android.x.v.a(r7, r12)     // Catch: java.lang.Throwable -> L9f
            goto Lcb
        Lb3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r8.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r9 = "config channel group failed:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L23
            r8.append(r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.Logger.ww(r2, r6)     // Catch: java.lang.Throwable -> L23
        Lcb:
            r6 = r10 & 4
            if (r6 == 0) goto Ld1
            r6 = 1
            goto Ld2
        Ld1:
            r6 = 0
        Ld2:
            cn.jpush.android.x.j.a(r7, r6)     // Catch: java.lang.Throwable -> Ld6
            goto Leb
        Ld6:
            r6 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r8.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r9 = "enableLights fail:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L23
            r8.append(r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.Logger.ww(r2, r6)     // Catch: java.lang.Throwable -> L23
        Leb:
            r6 = r10 & 2
            if (r6 == 0) goto Lf1
            r6 = 1
            goto Lf2
        Lf1:
            r6 = 0
        Lf2:
            cn.jpush.android.x.k.a(r7, r6)     // Catch: java.lang.Throwable -> Lf6
            goto L10b
        Lf6:
            r6 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r8.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r9 = "enableVibration fail:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L23
            r8.append(r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.Logger.ww(r2, r6)     // Catch: java.lang.Throwable -> L23
        L10b:
            r6 = 0
            if (r11 == 0) goto L114
            cn.jpush.android.x.q.a(r7, r11, r6)     // Catch: java.lang.Throwable -> L112
            goto L131
        L112:
            r6 = move-exception
            goto L11d
        L114:
            r8 = r10 & 1
            if (r8 == 0) goto L119
            goto L131
        L119:
            cn.jpush.android.x.q.a(r7, r6, r6)     // Catch: java.lang.Throwable -> L112
            goto L131
        L11d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r8.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r9 = "setSound fail:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L23
            r8.append(r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.Logger.ww(r2, r6)     // Catch: java.lang.Throwable -> L23
        L131:
            cn.jiguang.av.z.a(r0, r7)     // Catch: java.lang.Throwable -> L23
            return r3
        L135:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "new NotificationChannel fail:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jpush.android.helper.Logger.ee(r2, r6)
            return r1
        L14a:
            java.lang.String r6 = "sdkversion < 26, no need use notificationChannel!"
            cn.jpush.android.helper.Logger.d(r2, r6)
            return r1
    }

    public static int b(int r2) {
            if (r2 == 0) goto L13
            r0 = 1
            if (r2 == r0) goto L13
            r1 = 2
            if (r2 == r1) goto L11
            r1 = 4
            if (r2 == r1) goto L10
            r1 = 5
            if (r2 == r1) goto L10
            r2 = 0
            return r2
        L10:
            return r0
        L11:
            r2 = -1
            return r2
        L13:
            r2 = -2
            return r2
    }

    private static android.app.NotificationChannel b(android.content.Context r6, cn.jpush.android.x.a.C0055a r7) {
            java.lang.String r0 = "ChannelHelper"
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L24
            r3 = 26
            if (r2 >= r3) goto La
            return r1
        La:
            if (r7 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r2 = r7.a     // Catch: java.lang.Throwable -> L24
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L7f
            java.lang.String r3 = "notification"
            java.lang.Object r6 = r6.getSystemService(r3)     // Catch: java.lang.Throwable -> L24
            android.app.NotificationManager r6 = (android.app.NotificationManager) r6     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            android.app.NotificationChannel r6 = cn.jiguang.av.y.a(r6, r2)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r6 = move-exception
            goto L6b
        L26:
            r6 = r1
        L27:
            if (r6 == 0) goto L65
            boolean r3 = r7.f2015e     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "channel has created: "
            if (r3 == 0) goto L52
            int r7 = r7.f2013c     // Catch: java.lang.Throwable -> L24
            int r7 = a(r7)     // Catch: java.lang.Throwable -> L24
            cn.jpush.android.x.s.a(r6, r7)     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            r3.append(r4)     // Catch: java.lang.Throwable -> L24
            r3.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = ",set importance:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L24
            r3.append(r7)     // Catch: java.lang.Throwable -> L24
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L24
            cn.jpush.android.helper.Logger.dd(r0, r7)     // Catch: java.lang.Throwable -> L24
        L52:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r7.<init>()     // Catch: java.lang.Throwable -> L24
            r7.append(r4)     // Catch: java.lang.Throwable -> L24
            r7.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L24
            cn.jpush.android.helper.Logger.dd(r0, r7)     // Catch: java.lang.Throwable -> L24
            return r6
        L65:
            java.lang.String r6 = "not found channed id from user set,will use sdk default channel ID"
            cn.jpush.android.helper.Logger.dd(r0, r6)     // Catch: java.lang.Throwable -> L24
            goto L7f
        L6b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "config channelID error,will use sdk default channel ID:"
            r7.append(r2)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jpush.android.helper.Logger.e(r0, r6)
        L7f:
            return r1
    }
}
