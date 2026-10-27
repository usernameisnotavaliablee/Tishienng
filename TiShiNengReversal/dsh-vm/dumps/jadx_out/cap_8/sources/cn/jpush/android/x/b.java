package cn.jpush.android.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static java.lang.Integer a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.Boolean f2020b;

    static class a extends cn.jpush.android.ad.f {
        private android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        private cn.jpush.android.d.d f2021b;

        public a(android.content.Context r1, cn.jpush.android.d.d r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2021b = r2
                java.lang.String r1 = "NotificationHelper#NotifyAction"
                r0.f1674e = r1
                return
        }

        public static void a(android.content.Context r3, cn.jpush.android.d.d r4) {
                cn.jpush.android.x.b.d(r3, r4)
                int r0 = r4.ad
                if (r0 == 0) goto Lf
                r1 = 4
                if (r0 != r1) goto Lb
                goto Lf
            Lb:
                cn.jpush.android.x.b.e(r3, r4)
                return
            Lf:
                java.lang.String r0 = r4.f1757d
                r1 = 995(0x3e3, double:4.916E-321)
                cn.jpush.android.helper.c.a(r0, r1, r3)
                cn.jpush.android.x.b.b(r3, r4)
                return
        }

        @Override // cn.jpush.android.ad.f
        public void a() {
                r10 = this;
                java.lang.String r0 = "NotificationHelper"
                cn.jpush.android.d.d r1 = r10.f2021b     // Catch: java.lang.Throwable -> L22
                java.lang.String r1 = r1.av     // Catch: java.lang.Throwable -> L22
                long r1 = cn.jpush.android.ad.b.b(r1)     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.d.d r3 = r10.f2021b     // Catch: java.lang.Throwable -> L22
                java.lang.String r3 = r3.aw     // Catch: java.lang.Throwable -> L22
                long r3 = cn.jpush.android.ad.b.b(r3)     // Catch: java.lang.Throwable -> L22
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 <= 0) goto L25
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 != 0) goto L25
                java.lang.String r1 = "the beginTime == endTime,not deal this notification"
                cn.jpush.android.helper.Logger.ww(r0, r1)     // Catch: java.lang.Throwable -> L22
                return
            L22:
                r1 = move-exception
                goto L9e
            L25:
                long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 <= 0) goto L5f
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 >= 0) goto L37
                java.lang.String r1 = "illegal argument, endTime earlier than beginTime"
                cn.jpush.android.helper.Logger.e(r0, r1)     // Catch: java.lang.Throwable -> L22
                return
            L37:
                int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r5 >= 0) goto L5f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
                r1.<init>()     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.d.d r2 = r10.f2021b     // Catch: java.lang.Throwable -> L22
                java.lang.String r2 = r2.f1757d     // Catch: java.lang.Throwable -> L22
                r1.append(r2)     // Catch: java.lang.Throwable -> L22
                java.lang.String r2 = " already end"
                r1.append(r2)     // Catch: java.lang.Throwable -> L22
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.helper.Logger.w(r0, r1)     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.d.d r1 = r10.f2021b     // Catch: java.lang.Throwable -> L22
                java.lang.String r1 = r1.f1757d     // Catch: java.lang.Throwable -> L22
                android.content.Context r2 = r10.a     // Catch: java.lang.Throwable -> L22
                r3 = 1034(0x40a, double:5.11E-321)
                cn.jpush.android.helper.c.a(r1, r3, r2)     // Catch: java.lang.Throwable -> L22
                return
            L5f:
                int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r5 >= 0) goto L81
                android.content.Context r1 = r10.a     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.d.d r2 = r10.f2021b     // Catch: java.lang.Throwable -> L22
                a(r1, r2)     // Catch: java.lang.Throwable -> L22
                if (r9 <= 0) goto L80
                cn.jpush.android.x.e$a r1 = new cn.jpush.android.x.e$a     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.d.d r2 = r10.f2021b     // Catch: java.lang.Throwable -> L22
                int r2 = cn.jpush.android.x.b.a(r2)     // Catch: java.lang.Throwable -> L22
                r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.x.e r2 = cn.jpush.android.x.e.a()     // Catch: java.lang.Throwable -> L22
                android.content.Context r3 = r10.a     // Catch: java.lang.Throwable -> L22
                r2.a(r3, r1)     // Catch: java.lang.Throwable -> L22
            L80:
                return
            L81:
                cn.jpush.android.x.e$a r3 = new cn.jpush.android.x.e$a     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.d.d r4 = r10.f2021b     // Catch: java.lang.Throwable -> L22
                r5 = 0
                r3.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.x.e r1 = cn.jpush.android.x.e.a()     // Catch: java.lang.Throwable -> L22
                android.content.Context r2 = r10.a     // Catch: java.lang.Throwable -> L22
                r1.a(r2, r3)     // Catch: java.lang.Throwable -> L22
                cn.jpush.android.d.d r1 = r10.f2021b     // Catch: java.lang.Throwable -> L22
                java.lang.String r1 = r1.f1757d     // Catch: java.lang.Throwable -> L22
                android.content.Context r2 = r10.a     // Catch: java.lang.Throwable -> L22
                r3 = 1035(0x40b, double:5.114E-321)
                cn.jpush.android.helper.c.a(r1, r3, r2)     // Catch: java.lang.Throwable -> L22
                return
            L9e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "run NotifyAction failed:"
                r2.append(r3)
                java.lang.String r1 = r1.getMessage()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                cn.jpush.android.helper.Logger.w(r0, r1)
                return
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r2) {
            r0 = 1
            if (r2 == 0) goto Lf
            if (r2 == r0) goto Lc
            r1 = 2
            if (r2 == r1) goto L9
            return r0
        L9:
            r2 = 32
            return r2
        Lc:
            r2 = 16
            return r2
        Lf:
            return r0
    }

    public static int a(cn.jpush.android.d.d r1) {
            java.lang.String r0 = r1.f1761h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = r1.f1757d
            goto Ld
        Lb:
            java.lang.String r1 = r1.f1761h
        Ld:
            r0 = 0
            int r1 = a(r1, r0)
            return r1
    }

    public static int a(java.lang.String r1, int r2) {
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r0 = "NotificationHelper"
            if (r2 == 0) goto Lf
            java.lang.String r1 = "action:getNotificationID - empty messageId"
            cn.jpush.android.helper.Logger.d(r0, r1)
            r1 = 0
            return r1
        Lf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L18
            int r1 = r2.intValue()     // Catch: java.lang.Exception -> L18
            return r1
        L18:
            java.lang.String r2 = "Ths msgId is not a integer"
            cn.jpush.android.helper.Logger.w(r0, r2)
            java.util.zip.Adler32 r2 = new java.util.zip.Adler32
            r2.<init>()
            byte[] r1 = r1.getBytes()
            r2.update(r1)
            long r1 = r2.getValue()
            int r2 = (int) r1
            if (r2 >= 0) goto L35
            int r2 = java.lang.Math.abs(r2)
        L35:
            return r2
    }

    private static android.app.Notification a(android.app.Notification.Builder r2) {
            android.app.Notification r2 = r2.build()     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Build notification error:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "NotificationHelper"
            cn.jpush.android.helper.Logger.ww(r0, r2)
            r2 = 0
            return r2
    }

    private static android.app.Notification a(android.content.Context r7, cn.jpush.android.d.d r8, cn.jpush.android.x.c r9, cn.jpush.android.x.c r10) {
            cn.jpush.android.x.a$a r0 = new cn.jpush.android.x.a$a
            java.lang.String r1 = r8.I
            int r3 = r8.D
            int r4 = r8.H
            java.lang.String r5 = r8.au
            int r6 = r8.E
            java.lang.String r2 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6)
            cn.jpush.android.x.a.a(r7, r0)
            android.app.Notification$Builder r1 = new android.app.Notification$Builder
            r1.<init>(r7)
            java.lang.String r2 = r8.v
            android.app.Notification$Builder r2 = r1.setContentTitle(r2)
            java.lang.String r3 = r8.y
            android.app.Notification$Builder r2 = r2.setContentText(r3)
            java.lang.String r3 = r8.y
            r2.setTicker(r3)
            java.lang.String r2 = r8.u
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3b
            java.lang.String r2 = r8.u
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setColor(r2)
        L3b:
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.mApplicationContext
            a(r2, r1, r9, r10)
            r9 = 1
            r1.setShowWhen(r9)
            a(r7, r1, r0)
            java.lang.String r10 = r0.a
            boolean r10 = d(r7, r10)
            if (r10 != 0) goto L56
            java.lang.String r10 = r8.f1757d
            r2 = 1037(0x40d, double:5.123E-321)
            cn.jpush.android.helper.c.a(r10, r2, r7)
        L56:
            int r7 = r8.z
            if (r7 != r9) goto L6f
            java.lang.String r7 = r8.A
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L6f
            android.app.Notification$BigTextStyle r7 = new android.app.Notification$BigTextStyle
            r7.<init>()
            java.lang.String r9 = r8.A
            r7.bigText(r9)
            r1.setStyle(r7)
        L6f:
            int r7 = r8.z
            r9 = 2
            java.lang.String r10 = "NotificationHelper"
            if (r7 != r9) goto Lfb
            java.lang.String r7 = r8.C
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lfb
            android.app.Notification$InboxStyle r7 = new android.app.Notification$InboxStyle
            r7.<init>()
            java.util.TreeMap r9 = new java.util.TreeMap     // Catch: java.lang.Throwable -> La7
            r9.<init>()     // Catch: java.lang.Throwable -> La7
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = r8.C     // Catch: java.lang.Throwable -> La7
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r2 = r0.keys()     // Catch: java.lang.Throwable -> La7
        L93:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto Laa
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r0.optString(r3)     // Catch: java.lang.Throwable -> La7
            r9.put(r3, r4)     // Catch: java.lang.Throwable -> La7
            goto L93
        La7:
            r0 = move-exception
            r9 = r0
            goto Le0
        Laa:
            java.util.Collection r9 = r9.values()     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> La7
        Lb2:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La7
            r7.addLine(r2)     // Catch: java.lang.Throwable -> La7
            goto Lb2
        Lc2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r9.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = " + "
            r9.append(r2)     // Catch: java.lang.Throwable -> La7
            int r0 = r0.length()     // Catch: java.lang.Throwable -> La7
            r9.append(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = " new messages"
            r9.append(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> La7
            r7.setSummaryText(r9)     // Catch: java.lang.Throwable -> La7
            goto Lf8
        Le0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Set inbox style error: "
            r0.append(r2)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            cn.jpush.android.helper.Logger.ee(r10, r9)
        Lf8:
            r1.setStyle(r7)
        Lfb:
            int r7 = r8.z
            r9 = 3
            if (r7 != r9) goto L153
            java.lang.String r7 = r8.B
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L153
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Set notification BPS with picture path:"
            r7.append(r9)
            java.lang.String r9 = r8.B
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            cn.jpush.android.helper.Logger.i(r10, r7)
            android.app.Notification$BigPictureStyle r7 = new android.app.Notification$BigPictureStyle     // Catch: java.lang.Throwable -> L130 java.lang.OutOfMemoryError -> L133
            r7.<init>()     // Catch: java.lang.Throwable -> L130 java.lang.OutOfMemoryError -> L133
            java.lang.String r9 = r8.B     // Catch: java.lang.Throwable -> L130 java.lang.OutOfMemoryError -> L133
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeFile(r9)     // Catch: java.lang.Throwable -> L130 java.lang.OutOfMemoryError -> L133
            r7.bigPicture(r9)     // Catch: java.lang.Throwable -> L130 java.lang.OutOfMemoryError -> L133
            r1.setStyle(r7)     // Catch: java.lang.Throwable -> L130 java.lang.OutOfMemoryError -> L133
            goto L153
        L130:
            r0 = move-exception
            r7 = r0
            goto L136
        L133:
            r0 = move-exception
            r7 = r0
            goto L14b
        L136:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Create big picture style failed. error:"
        L13d:
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            cn.jpush.android.helper.Logger.ww(r10, r7)
            goto L153
        L14b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Create bitmap failed caused by OutOfMemoryError.error:"
            goto L13d
        L153:
            java.lang.String r7 = r8.F
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L160
            java.lang.String r7 = r8.F
            r1.setCategory(r7)
        L160:
            android.app.Notification r7 = a(r1)
            return r7
    }

    public static android.content.Intent a(android.content.Context r1, java.lang.String r2, cn.jpush.android.d.d r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            java.lang.Class<cn.jpush.android.ui.PushActivity> r2 = cn.jpush.android.ui.PushActivity.class
            r0.setClass(r1, r2)
            if (r3 == 0) goto L15
            java.lang.String r2 = "msg_data"
            java.lang.String r3 = r3.c()
            r0.putExtra(r2, r3)
        L15:
            boolean r1 = cn.jpush.android.ad.a.j(r1)
            if (r1 != 0) goto L21
            r1 = 32768(0x8000, float:4.5918E-41)
            r0.addFlags(r1)
        L21:
            return r0
    }

    @android.annotation.TargetApi(23)
    private static android.graphics.drawable.Icon a(java.lang.String r3) {
            java.lang.String r0 = "NotificationHelper"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L12
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            android.graphics.drawable.Icon r3 = cn.jpush.android.x.w.a(r3)     // Catch: java.lang.Throwable -> L12
            return r3
        L12:
            r3 = move-exception
            goto L29
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "icon file doesn't exist, path="
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            r1.append(r3)     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L12
            cn.jpush.android.helper.Logger.w(r0, r3)     // Catch: java.lang.Throwable -> L12
            goto L3d
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "createIcon err:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
        L3d:
            r3 = 0
            return r3
    }

    public static android.net.Uri a(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = "NotificationHelper"
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L79
            android.content.res.Resources r1 = r4.getResources()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "raw"
            java.lang.String r3 = r4.getPackageName()     // Catch: java.lang.Throwable -> L4e
            int r1 = r1.getIdentifier(r5, r2, r3)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "android.resource://"
            r1.append(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L4e
            r1.append(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = "/raw/"
            r1.append(r4)     // Catch: java.lang.Throwable -> L4e
            r1.append(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L4e
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r5.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "found sound uri="
            r5.append(r1)     // Catch: java.lang.Throwable -> L4e
            r5.append(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4e
            cn.jpush.android.helper.Logger.d(r0, r5)     // Catch: java.lang.Throwable -> L4e
            return r4
        L4e:
            r4 = move-exception
            goto L65
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r4.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "not found sound="
            r4.append(r1)     // Catch: java.lang.Throwable -> L4e
            r4.append(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4e
            cn.jpush.android.helper.Logger.d(r0, r4)     // Catch: java.lang.Throwable -> L4e
            goto L79
        L65:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "find sound e:"
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.w(r0, r4)
        L79:
            r4 = 0
            return r4
    }

    private static cn.jpush.android.api.PushNotificationBuilder a(android.content.Context r7, cn.jpush.android.api.NotificationMessage r8) {
            java.lang.String r0 = "cn.jpush.android.support.JPushSupport"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "getNotificationBuilder"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Class<cn.jpush.android.api.NotificationMessage> r4 = cn.jpush.android.api.NotificationMessage.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L26
            r2[r5] = r7     // Catch: java.lang.Throwable -> L26
            r2[r6] = r8     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L26
            cn.jpush.android.api.PushNotificationBuilder r7 = (cn.jpush.android.api.PushNotificationBuilder) r7     // Catch: java.lang.Throwable -> L26
            return r7
        L26:
            r7 = 0
            return r7
    }

    @android.annotation.TargetApi(11)
    public static cn.jpush.android.x.c a(android.content.Context r3, java.lang.String r4, int r5) {
            cn.jpush.android.x.c r0 = new cn.jpush.android.x.c
            r0.<init>()
            java.lang.Object r3 = b(r3, r4, r5)
            r4 = 973(0x3cd, double:4.807E-321)
            if (r3 != 0) goto L11
            r0.a(r4)
            return r0
        L11:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L26
            boolean r1 = androidx.core.app.k.a(r3)
            if (r1 == 0) goto L26
            r4 = 102(0x66, float:1.43E-43)
            r0.a(r4)
            r0.a(r3)
            return r0
        L26:
            boolean r1 = r3 instanceof android.graphics.Bitmap
            if (r1 == 0) goto L35
            r4 = 100
            r0.a(r4)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r0.a(r3)
            return r0
        L35:
            r0.a(r4)
            return r0
    }

    @android.annotation.TargetApi(11)
    public static cn.jpush.android.x.c a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            java.lang.String r7 = "NotificationHelper"
            cn.jpush.android.x.c r10 = new cn.jpush.android.x.c
            r10.<init>()
            java.lang.String r0 = ""
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L35
            boolean r2 = cn.jpush.android.ad.a.c(r9)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L22
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L20
            r3 = 307200(0x4b000, float:4.30479E-40)
            java.lang.String r0 = d(r2, r9, r3)     // Catch: java.lang.Throwable -> L20
            goto L53
        L20:
            r2 = move-exception
            goto L3b
        L22:
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L20
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "drawable"
            android.content.Context r4 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L20
            int r1 = r2.getIdentifier(r9, r3, r4)     // Catch: java.lang.Throwable -> L20
            goto L53
        L35:
            java.lang.String r2 = "[buildSmallIcon] smallIcon is empty"
            cn.jpush.android.helper.Logger.d(r7, r2)     // Catch: java.lang.Throwable -> L20
            goto L53
        L3b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "load small icon failed:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jpush.android.helper.Logger.d(r7, r2)
        L53:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 100
            if (r2 != 0) goto Lb9
            boolean r2 = cn.jpush.android.ad.c.a(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L66
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch: java.lang.Throwable -> Lb4
            goto L67
        L66:
            r2 = 0
        L67:
            if (r2 == 0) goto L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r0.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = "set small icon with path bitmap:"
            r0.append(r4)     // Catch: java.lang.Throwable -> Lb4
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb4
            cn.jpush.android.helper.Logger.d(r7, r0)     // Catch: java.lang.Throwable -> Lb4
            r10.a(r3)     // Catch: java.lang.Throwable -> Lb4
            r10.a(r2)     // Catch: java.lang.Throwable -> Lb4
            goto L133
        L85:
            java.lang.String r2 = "not set small icon by bitmap"
            cn.jpush.android.helper.Logger.d(r7, r2)     // Catch: java.lang.Throwable -> Lb4
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb4
            r4 = 23
            if (r2 < r4) goto Lb9
            android.graphics.drawable.Icon r2 = a(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r4.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "set small icon success by path:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb4
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lb4
            cn.jpush.android.helper.Logger.d(r7, r0)     // Catch: java.lang.Throwable -> Lb4
            r0 = 102(0x66, float:1.43E-43)
            r10.a(r0)     // Catch: java.lang.Throwable -> Lb4
            r10.a(r2)     // Catch: java.lang.Throwable -> Lb4
            goto L133
        Lb4:
            java.lang.String r0 = "resource not found with sdcard path"
            cn.jpush.android.helper.Logger.w(r7, r0)
        Lb9:
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == 0) goto Le0
            r10.a(r0)
            r10.b(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "set small icon success by resId:"
            r6.append(r8)
            r6.append(r1)
            java.lang.String r8 = ",resName:"
            r6.append(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            cn.jpush.android.helper.Logger.d(r7, r6)
            return r10
        Le0:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            r1 = 972(0x3cc, double:4.8E-321)
            if (r9 != 0) goto L150
            java.lang.String r9 = r6.getPackageName()
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L150
            boolean r9 = cn.jpush.android.ad.a.a(r6, r8, r11)     // Catch: java.lang.Throwable -> L117
            if (r9 != 0) goto L119
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L117
            r6.<init>()     // Catch: java.lang.Throwable -> L117
            java.lang.String r9 = "targetApp ："
            r6.append(r9)     // Catch: java.lang.Throwable -> L117
            r6.append(r8)     // Catch: java.lang.Throwable -> L117
            java.lang.String r8 = " is not install,will give up notify the msg"
            r6.append(r8)     // Catch: java.lang.Throwable -> L117
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L117
            cn.jpush.android.helper.Logger.w(r7, r6)     // Catch: java.lang.Throwable -> L117
            r8 = 993(0x3e1, double:4.906E-321)
            r10.a(r8)     // Catch: java.lang.Throwable -> L117
            goto L133
        L117:
            r6 = move-exception
            goto L134
        L119:
            android.graphics.Bitmap r6 = c(r6, r8)     // Catch: java.lang.Throwable -> L117
            if (r6 != 0) goto L128
            java.lang.String r6 = "not found targetApp small icon bitmap,will give up notify the msg"
            cn.jpush.android.helper.Logger.w(r7, r6)     // Catch: java.lang.Throwable -> L117
            r10.a(r1)     // Catch: java.lang.Throwable -> L117
            goto L133
        L128:
            r10.a(r3)     // Catch: java.lang.Throwable -> L117
            r10.a(r6)     // Catch: java.lang.Throwable -> L117
            java.lang.String r6 = "set small icon success by targetAppBitmap"
            cn.jpush.android.helper.Logger.d(r7, r6)     // Catch: java.lang.Throwable -> L117
        L133:
            return r10
        L134:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "set small icon by targetApp icon bitmap failed:"
            r8.append(r9)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            cn.jpush.android.helper.Logger.w(r7, r6)
            r10.a(r1)
            return r10
        L150:
            int r6 = cn.jpush.android.x.g.a(r6)
            if (r6 == 0) goto L171
            r10.a(r0)
            r10.b(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "set small icon success by mine icon resId:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            cn.jpush.android.helper.Logger.d(r7, r6)
            return r10
        L171:
            r10.a(r1)
            return r10
    }

    private static java.lang.String a(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
            r0 = 0
            boolean r0 = cn.jpush.android.ad.a.a(r11, r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "NotificationHelper"
            if (r0 == 0) goto L60
            java.lang.String r0 = "The url is a picture resources."
            cn.jpush.android.helper.Logger.i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r3 = cn.jpush.android.ad.a.b(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = cn.jpush.android.ad.c.c(r10, r12)
            r3.append(r12)
            r3.append(r0)
            java.lang.String r12 = r3.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Big picture notification resource path: "
            r0.append(r3)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.i(r2, r0)
            r7 = 5000(0x1388, double:2.4703E-320)
            r9 = 4
            java.lang.String r5 = "notify_img"
            r6 = 5
            r3 = r10
            r4 = r11
            byte[] r10 = cn.jpush.android.w.b.a(r3, r4, r5, r6, r7, r9)
            if (r10 == 0) goto L5f
            boolean r10 = cn.jpush.android.ad.c.a(r12, r10)
            if (r10 == 0) goto L5f
            return r12
        L5f:
            return r1
        L60:
            java.lang.String r10 = "The url is not a picture resources."
            cn.jpush.android.helper.Logger.i(r2, r10)
            return r1
    }

    public static void a(android.app.Notification r9, android.content.Context r10, java.lang.String r11, java.lang.String r12, android.app.PendingIntent r13) {
            java.lang.String r0 = "android.app.Notification"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = "setLatestEventInfo"
            r2 = 4
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L2e
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> L2e
            r7 = 2
            r3[r7] = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Class<android.app.PendingIntent> r4 = android.app.PendingIntent.class
            r8 = 3
            r3[r8] = r4     // Catch: java.lang.Exception -> L2e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L2e
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2e
            r1[r5] = r10     // Catch: java.lang.Exception -> L2e
            r1[r6] = r11     // Catch: java.lang.Exception -> L2e
            r1[r7] = r12     // Catch: java.lang.Exception -> L2e
            r1[r8] = r13     // Catch: java.lang.Exception -> L2e
            r0.invoke(r9, r1)     // Catch: java.lang.Exception -> L2e
        L2e:
            return
    }

    public static void a(android.app.Notification r0, cn.jpush.android.x.a.C0055a r1) {
            return
    }

    public static void a(android.content.Context r1) {
        L0:
            int r0 = cn.jpush.android.x.f.a()
            if (r0 == 0) goto La
            d(r1, r0)
            goto L0
        La:
            return
    }

    public static void a(android.content.Context r1, int r2, int r3, java.lang.String r4) {
            r0 = 0
            a(r1, r2, r3, r4, r0)
            return
    }

    public static void a(android.content.Context r9, int r10, int r11, java.lang.String r12, android.os.Bundle r13) {
            java.lang.String r0 = "NotificationHelper"
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r9)     // Catch: java.lang.Throwable -> L68
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L94
            r2 = -1
            r3 = 1
            if (r10 == r2) goto L12
            if (r10 != r3) goto L40
        L12:
            java.lang.Class<cn.jpush.android.service.JPushMessageReceiver> r2 = cn.jpush.android.service.JPushMessageReceiver.class
            java.lang.Class r4 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r5 = "onConnected"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L3f
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L3f
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3f
            r6[r3] = r7     // Catch: java.lang.Throwable -> L3f
            boolean r3 = a(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "method isImplemented: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L3f
            r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3f
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L3f
            goto L40
        L3f:
        L40:
            if (r3 == 0) goto L94
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L68
            r2.setClassName(r9, r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "cmd_msg"
            java.lang.String r1 = cn.jpush.android.ad.a.e(r9, r1)     // Catch: java.lang.Throwable -> L68
            r2.setAction(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "cmd"
            r2.putExtra(r1, r10)     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = "code"
            r2.putExtra(r10, r11)     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = "message"
            r2.putExtra(r10, r12)     // Catch: java.lang.Throwable -> L68
            if (r13 == 0) goto L6a
            r2.putExtras(r13)     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r9 = move-exception
            goto L7c
        L6a:
            cn.jpush.android.service.JPushMessageReceiver r10 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r9)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto L78
            cn.jpush.android.service.JPushMessageReceiver r10 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r9)     // Catch: java.lang.Throwable -> L68
            cn.jpush.android.helper.a.a(r10, r9, r2)     // Catch: java.lang.Throwable -> L68
            goto L94
        L78:
            cn.jpush.android.helper.a.a(r9, r2)     // Catch: java.lang.Throwable -> L68
            goto L94
        L7c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "sendCmdMsgToUser failed:"
            r10.append(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jpush.android.helper.Logger.w(r0, r9)
        L94:
            return
    }

    public static void a(android.content.Context r4, int r5, boolean r6) {
            java.lang.String r0 = "NotificationHelper"
            int r1 = d(r4)     // Catch: java.lang.Throwable -> L41
            r2 = 1
            if (r1 != r2) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "[checkNotificationSettings] new state:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L41
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = ",last state:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.Boolean r3 = cn.jpush.android.x.b.f2020b     // Catch: java.lang.Throwable -> L41
            r1.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = ",soucre:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L41
            r1.append(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = ",isFocre:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L41
            r1.append(r6)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L41
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L43
            java.lang.String r1 = "notification trigger is off, will not show notification"
            cn.jpush.android.helper.Logger.kd(r0, r1)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r4 = move-exception
            goto Lac
        L43:
            java.lang.Boolean r1 = cn.jpush.android.x.b.f2020b     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L55
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r2 != r1) goto L55
            if (r6 != 0) goto L55
            java.lang.String r4 = "[checkNotificationSettings] no change"
            cn.jpush.android.helper.Logger.d(r0, r4)     // Catch: java.lang.Throwable -> L41
            return
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L41
            cn.jpush.android.x.b.f2020b = r6     // Catch: java.lang.Throwable -> L41
            cn.jpush.android.service.JPushMessageReceiver r6 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r4)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L6b
            java.lang.Boolean r1 = cn.jpush.android.x.b.f2020b     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L41
            r6.onNotificationSettingsCheck(r4, r1, r5)     // Catch: java.lang.Throwable -> L41
            goto La2
        L6b:
            java.lang.String r6 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r4)     // Catch: java.lang.Throwable -> L8d
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L8d
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r4, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "on_noti_settings_check"
            r1.setAction(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "isOn"
            java.lang.Boolean r2 = cn.jpush.android.x.b.f2020b     // Catch: java.lang.Throwable -> L8d
            r1.putExtra(r6, r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "source"
            r1.putExtra(r6, r5)     // Catch: java.lang.Throwable -> L8d
            cn.jpush.android.helper.a.a(r4, r1)     // Catch: java.lang.Throwable -> L8d
            goto La2
        L8d:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r6.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "checkNotificationSettings send to user e:"
            r6.append(r1)     // Catch: java.lang.Throwable -> L41
            r6.append(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L41
            cn.jpush.android.helper.Logger.w(r0, r5)     // Catch: java.lang.Throwable -> L41
        La2:
            cn.jpush.android.aa.a r5 = cn.jpush.android.aa.a.a()     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "on_check"
            r5.a(r4, r6)     // Catch: java.lang.Throwable -> L41
            goto Lc0
        Lac:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkNotificationSettings e:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.w(r0, r4)
        Lc0:
            return
    }

    public static void a(android.content.Context r3, android.app.Notification.Builder r4, cn.jpush.android.x.a.C0055a r5) {
            if (r5 == 0) goto L3d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3d
            r1 = 26
            if (r0 < r1) goto L2e
            boolean r0 = r5.f2019i     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L2e
            java.lang.String r0 = "NotificationHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r1.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "setChannelId ="
            r1.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = r5.a     // Catch: java.lang.Throwable -> L3d
            r1.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3d
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = r5.a     // Catch: java.lang.Throwable -> L3d
            d(r3, r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = r5.a     // Catch: java.lang.Throwable -> L3d
            cn.jiguang.av.a0.a(r4, r3)     // Catch: java.lang.Throwable -> L3d
        L2e:
            int r3 = r5.f2013c     // Catch: java.lang.Throwable -> L3d
            r4.setPriority(r3)     // Catch: java.lang.Throwable -> L3d
            int r3 = r5.f2016f     // Catch: java.lang.Throwable -> L3d
            r4.setDefaults(r3)     // Catch: java.lang.Throwable -> L3d
            android.net.Uri r3 = r5.f2018h     // Catch: java.lang.Throwable -> L3d
            r4.setSound(r3)     // Catch: java.lang.Throwable -> L3d
        L3d:
            return
    }

    public static void a(android.content.Context r2, cn.jpush.android.d.d r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[processMessage] pushEntity:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NotificationHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            int r0 = r3.ae
            if (r0 == 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Unexpected: unknown show  mode - "
            r2.append(r0)
            int r3 = r3.ae
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.d(r1, r2)
            return
        L31:
            cn.jpush.android.x.b$a r0 = new cn.jpush.android.x.b$a
            r0.<init>(r2, r3)
            java.lang.String r3 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r2, r3, r0)
            return
    }

    public static void a(android.content.Context r4, java.lang.Integer r5, android.app.Notification r6) {
            if (r5 != 0) goto L3
            return
        L3:
            cn.jpush.android.cache.Key r0 = cn.jpush.android.cache.Key.BadgeCurNum()
            java.lang.Object r1 = cn.jpush.android.cache.Sp.get(r4, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 0
            if (r1 >= 0) goto L15
            r1 = 0
        L15:
            int r3 = r5.intValue()
            if (r3 == 0) goto L3c
            int r3 = r5.intValue()
            int r3 = r3 + r1
            if (r3 >= 0) goto L27
            int r5 = -r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L27:
            int r3 = r5.intValue()
            int r1 = r1 + r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            cn.jpush.android.cache.Key r0 = r0.set(r3)
            r3 = 1
            cn.jpush.android.cache.Key[] r3 = new cn.jpush.android.cache.Key[r3]
            r3[r2] = r0
            cn.jpush.android.cache.Sp.set(r4, r3)
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "curNum："
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ",addNum:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NotificationHelper"
            cn.jpush.android.helper.Logger.d(r2, r0)
            int r5 = r5.intValue()
            a(r4, r6, r5, r1)
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2, cn.jpush.android.d.d r3, android.content.Intent r4) {
            r0 = 0
            a(r1, r2, r3, r4, r0)
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4, cn.jpush.android.d.d r5, android.content.Intent r6, java.lang.String r7) {
            java.lang.String r0 = "NotificationHelper"
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r3)     // Catch: java.lang.Throwable -> L1b
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L1b
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L1e
            android.os.Bundle r6 = r6.getExtras()     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L1e
            r2.putExtras(r6)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r3 = move-exception
            goto L105
        L1e:
            r2.setAction(r4)     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L4d
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L1b
            if (r6 != 0) goto L2c
            r5.a(r7)     // Catch: java.lang.Throwable -> L1b
        L2c:
            java.lang.String r6 = "msg_data"
            java.lang.String r7 = r5.c()     // Catch: java.lang.Throwable -> L1b
            r2.putExtra(r6, r7)     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r6.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = "send broadcast pushEntry: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = r5.c()     // Catch: java.lang.Throwable -> L1b
            r6.append(r7)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.helper.Logger.d(r0, r6)     // Catch: java.lang.Throwable -> L1b
        L4d:
            cn.jpush.android.service.JPushMessageReceiver r6 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = "cn.jpush.android.intent.NOTIFICATION_DISMISS"
            if (r6 == 0) goto Le6
            java.lang.String r6 = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION_PROXY"
            boolean r6 = r4.equals(r6)     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L6b
            java.lang.String r6 = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION"
            r2.setAction(r6)     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.service.JPushMessageReceiver r6 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r3)     // Catch: java.lang.Throwable -> L1b
            r6.onMultiActionClicked(r3, r2)     // Catch: java.lang.Throwable -> L1b
            goto Lfb
        L6b:
            cn.jpush.android.api.NotificationMessage r6 = new cn.jpush.android.api.NotificationMessage     // Catch: java.lang.Throwable -> L1b
            r6.<init>()     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L76
            cn.jpush.android.api.NotificationMessage r6 = r5.b()     // Catch: java.lang.Throwable -> L1b
        L76:
            java.lang.String r1 = r6.appkey     // Catch: java.lang.Throwable -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L84
            java.lang.String r1 = cn.jpush.android.helper.JCoreHelper.getAppKey(r3)     // Catch: java.lang.Throwable -> L1b
            r6.appkey = r1     // Catch: java.lang.Throwable -> L1b
        L84:
            java.lang.String r1 = "cn.jpush.android.intent.NOTIFICATION_ARRIVED"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L94
            cn.jpush.android.service.JPushMessageReceiver r1 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r3)     // Catch: java.lang.Throwable -> L1b
            r1.onNotifyMessageArrived(r3, r6)     // Catch: java.lang.Throwable -> L1b
            goto Lfb
        L94:
            boolean r1 = r4.equals(r7)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto La2
            cn.jpush.android.service.JPushMessageReceiver r1 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r3)     // Catch: java.lang.Throwable -> L1b
            r1.onNotifyMessageDismiss(r3, r6)     // Catch: java.lang.Throwable -> L1b
            goto Lfb
        La2:
            java.lang.String r1 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Lb2
            cn.jpush.android.service.JPushMessageReceiver r1 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r3)     // Catch: java.lang.Throwable -> L1b
            r1.onNotifyMessageOpened(r3, r6)     // Catch: java.lang.Throwable -> L1b
            goto Lfb
        Lb2:
            java.lang.String r1 = "cn.jpush.android.intent.NOTIFICATION_UN_SHOW"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Lc2
            cn.jpush.android.service.JPushMessageReceiver r1 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r3)     // Catch: java.lang.Throwable -> L1b
            r1.onNotifyMessageUnShow(r3, r6)     // Catch: java.lang.Throwable -> L1b
            goto Lfb
        Lc2:
            java.lang.String r1 = "cn.jpush.android.intent.IN_APP_MSG_SHOW"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Ld2
            cn.jpush.android.service.JPushMessageReceiver r1 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r3)     // Catch: java.lang.Throwable -> L1b
            r1.onInAppMessageShow(r3, r6)     // Catch: java.lang.Throwable -> L1b
            goto Lfb
        Ld2:
            java.lang.String r1 = "cn.jpush.android.intent.IN_APP_MSG_CLICK"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Le2
            cn.jpush.android.service.JPushMessageReceiver r1 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r3)     // Catch: java.lang.Throwable -> L1b
            r1.onInAppMessageClick(r3, r6)     // Catch: java.lang.Throwable -> L1b
            goto Lfb
        Le2:
            cn.jpush.android.helper.a.a(r3, r2)     // Catch: java.lang.Throwable -> L1b
            goto Lfb
        Le6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r6.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "send intent: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L1b
            r6.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.helper.Logger.d(r0, r6)     // Catch: java.lang.Throwable -> L1b
            goto Le2
        Lfb:
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L104
            cn.jpush.android.k.a.b(r3, r5)     // Catch: java.lang.Throwable -> L1b
        L104:
            return
        L105:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sendToUserReceiver failed:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
            return
    }

    private static boolean a() {
            java.lang.String r0 = "NotificationHelper"
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L52
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = "ro.build.version.emui"
            r4[r1] = r5     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "get"
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r6, r3)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r3 = r3.invoke(r5, r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L52
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L67
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r4.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = "get EMUI version is:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L52
            r4.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L52
            cn.jpush.android.helper.Logger.i(r0, r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "emotionui_"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "8.0"
            int r0 = cn.jpush.android.ad.a.a(r3, r4)     // Catch: java.lang.Throwable -> L52
            if (r0 < 0) goto L51
            return r2
        L51:
            return r1
        L52:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " getEmuiVersion wrong error:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jpush.android.helper.Logger.e(r0, r2)
        L67:
            return r1
    }

    private static boolean a(android.app.Notification r6, int r7) {
            r0 = 0
            java.lang.Integer r1 = cn.jpush.android.x.b.a     // Catch: java.lang.Exception -> L54
            if (r1 != 0) goto L19
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = cn.jpush.android.ad.a.e(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L12
            cn.jpush.android.x.b.a = r1     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L54
            cn.jpush.android.x.b.a = r1     // Catch: java.lang.Exception -> L54
        L19:
            if (r6 != 0) goto L1c
            return r0
        L1c:
            java.lang.Integer r1 = cn.jpush.android.x.b.a     // Catch: java.lang.Exception -> L54
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L54
            r2 = 12
            if (r1 < r2) goto L29
            r6.number = r7     // Catch: java.lang.Exception -> L54
            goto L54
        L29:
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = "extraNotification"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L54
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Exception -> L54
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = "setMessageCount"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L54
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L54
            r4[r0] = r5     // Catch: java.lang.Exception -> L54
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L54
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L54
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L54
            r2[r0] = r7     // Catch: java.lang.Exception -> L54
            r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L54
            return r3
        L54:
            return r0
    }

    public static boolean a(android.content.Context r5, int r6) {
            java.lang.String r0 = "NotificationHelper"
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3b
            r3 = 23
            if (r2 < r3) goto L3d
            java.lang.String r2 = "notification"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch: java.lang.Throwable -> L3b
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5     // Catch: java.lang.Throwable -> L3b
            android.service.notification.StatusBarNotification[] r5 = cn.jpush.android.x.y.a(r5)     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "active size:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3b
            int r3 = r5.length     // Catch: java.lang.Throwable -> L3b
            r2.append(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L3b
            int r2 = r5.length     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L2c:
            if (r3 >= r2) goto L3d
            r4 = r5[r3]     // Catch: java.lang.Throwable -> L3b
            int r4 = r4.getId()     // Catch: java.lang.Throwable -> L3b
            if (r4 != r6) goto L38
            r1 = 1
            goto L3d
        L38:
            int r3 = r3 + 1
            goto L2c
        L3b:
            r5 = move-exception
            goto L63
        L3d:
            if (r1 == 0) goto L51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r5.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "show  notification success:"
            r5.append(r2)     // Catch: java.lang.Throwable -> L3b
            r5.append(r6)     // Catch: java.lang.Throwable -> L3b
            goto L5e
        L4d:
            cn.jpush.android.helper.Logger.dd(r0, r5)     // Catch: java.lang.Throwable -> L3b
            return r1
        L51:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r5.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "show  notification maybe failed:"
            r5.append(r2)     // Catch: java.lang.Throwable -> L3b
            r5.append(r6)     // Catch: java.lang.Throwable -> L3b
        L5e:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3b
            goto L4d
        L63:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "[checkNotficationShow] failed:"
            r6.append(r2)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jpush.android.helper.Logger.ww(r0, r5)
            return r1
    }

    @android.annotation.TargetApi(11)
    private static boolean a(android.content.Context r9, android.app.Notification.Builder r10, cn.jpush.android.x.c r11, cn.jpush.android.x.c r12) {
            int r0 = r11.a()
            r1 = 23
            r2 = 1
            r3 = 0
            r4 = 102(0x66, float:1.43E-43)
            if (r0 != r4) goto L1d
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r1) goto L1d
            java.lang.Object r5 = r11.b()
            android.graphics.drawable.Icon r5 = androidx.core.app.l.a(r5)
            cn.jpush.android.x.x.a(r10, r5)
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            r6 = 100
            if (r5 != 0) goto L34
            if (r0 != r6) goto L34
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r1) goto L34
            android.graphics.Bitmap r5 = r11.c()
            android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.d.a(r5)
            cn.jpush.android.x.x.a(r10, r5)
            r5 = 1
        L34:
            java.lang.String r7 = "NotificationHelper"
            if (r5 != 0) goto L6d
            r8 = 101(0x65, float:1.42E-43)
            if (r0 != r8) goto L6d
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> L68
            int r0 = r11.d()     // Catch: java.lang.Throwable -> L68
            r9.getDrawable(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "set small icon by local resId:"
            r9.append(r0)
            int r0 = r11.d()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            cn.jpush.android.helper.Logger.d(r7, r9)
            int r9 = r11.d()
            r10.setSmallIcon(r9)
            r5 = 1
            goto L6d
        L68:
            java.lang.String r9 = "resource not found with local app"
            cn.jpush.android.helper.Logger.w(r7, r9)
        L6d:
            if (r5 != 0) goto L70
            return r3
        L70:
            int r9 = r12.a()
            if (r9 != r4) goto L86
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r1) goto L95
            java.lang.Object r9 = r12.b()
            android.graphics.drawable.Icon r9 = androidx.core.app.l.a(r9)
            cn.jpush.android.api.a.a(r10, r9)
            goto L95
        L86:
            if (r9 != r6) goto L90
            android.graphics.Bitmap r9 = r12.c()
            r10.setLargeIcon(r9)
            goto L95
        L90:
            java.lang.String r9 = "not set large icon"
            cn.jpush.android.helper.Logger.d(r7, r9)
        L95:
            return r2
    }

    public static boolean a(android.content.Context r2, android.app.Notification r3, int r4, int r5) {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "xiaomi"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L10
            boolean r2 = a(r3, r4)
            return r2
        L10:
            boolean r3 = a()
            if (r3 == 0) goto L1f
            if (r5 == 0) goto L1a
            if (r4 == 0) goto L57
        L1a:
            boolean r2 = h(r2, r5)
            return r2
        L1f:
            boolean r3 = cn.jpush.android.ad.a.b()
            if (r3 == 0) goto L2e
            if (r5 == 0) goto L29
            if (r4 == 0) goto L57
        L29:
            boolean r2 = g(r2, r5)
            return r2
        L2e:
            java.lang.String r3 = "HONOR"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L3f
            if (r5 == 0) goto L3a
            if (r4 == 0) goto L57
        L3a:
            boolean r2 = f(r2, r5)
            return r2
        L3f:
            java.lang.String r3 = "NIO"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L50
            if (r5 == 0) goto L4b
            if (r4 == 0) goto L57
        L4b:
            boolean r2 = e(r2, r5)
            return r2
        L50:
            java.lang.String r2 = "NotificationHelper"
            java.lang.String r3 = "not support"
            cn.jpush.android.helper.Logger.d(r2, r3)
        L57:
            r2 = 0
            return r2
    }

    public static boolean a(android.content.Context r7, android.content.Intent r8) {
            java.lang.String r0 = "NotificationHelper"
            java.lang.String r1 = ""
            java.lang.String r2 = "msg_data"
            java.lang.String r8 = r8.getStringExtra(r2)     // Catch: java.lang.Throwable -> Lfd
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lfd
            r3 = 1
            if (r2 == 0) goto L12
            return r3
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfd
            r2.<init>()     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r4 = "handleOriginalMessage string="
            r2.append(r4)     // Catch: java.lang.Throwable -> Lfd
            r2.append(r8)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lfd
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> Lfd
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lfd
            r2.<init>(r8)     // Catch: java.lang.Throwable -> Lfd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfd
            r8.<init>()     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r4 = "handleOriginalMessage json="
            r8.append(r4)     // Catch: java.lang.Throwable -> Lfd
            r8.append(r2)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lfd
            cn.jpush.android.helper.Logger.d(r0, r8)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r8 = "messageId"
            java.lang.String r8 = r2.optString(r8)     // Catch: java.lang.Throwable -> Lfd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r4.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "handleOriginalMessage msgID="
            r4.append(r5)     // Catch: java.lang.Throwable -> L9a
            r4.append(r8)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L9a
            cn.jpush.android.helper.Logger.d(r0, r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = "originalMessage"
            java.lang.String r2 = r2.optString(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r4.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "handleOriginalMessage originalMessage="
            r4.append(r5)     // Catch: java.lang.Throwable -> L9a
            r4.append(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L9a
            cn.jpush.android.helper.Logger.d(r0, r4)     // Catch: java.lang.Throwable -> L9a
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r2.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "handleOriginalMessage jsonObject="
            r2.append(r5)     // Catch: java.lang.Throwable -> L9a
            r2.append(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9a
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = "notificaion_type"
            int r2 = r4.optInt(r2)     // Catch: java.lang.Throwable -> L9a
            if (r3 != r2) goto L9c
            java.lang.String r1 = "handleOriginalMessage local notification return true"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L9a
            return r3
        L9a:
            r1 = r8
            goto Lfd
        L9c:
            java.lang.String r2 = "n_ssl"
            java.lang.String r2 = r4.optString(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r4.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "handleOriginalMessage server ssl="
            r4.append(r5)     // Catch: java.lang.Throwable -> L9a
            r4.append(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L9a
            cn.jpush.android.helper.Logger.d(r0, r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r4.<init>()     // Catch: java.lang.Throwable -> L9a
            long r5 = cn.jpush.android.helper.JCoreHelper.getUid(r7)     // Catch: java.lang.Throwable -> L9a
            r4.append(r5)     // Catch: java.lang.Throwable -> L9a
            r4.append(r8)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = cn.jpush.android.ad.l.a(r4)     // Catch: java.lang.Throwable -> L9a
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L9a
            if (r5 != 0) goto Ldd
            java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = ":"
            java.lang.String r4 = r4.replace(r5, r1)     // Catch: java.lang.Throwable -> L9a
        Ldd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r1.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = "handleOriginalMessage local ssl="
            r1.append(r5)     // Catch: java.lang.Throwable -> L9a
            r1.append(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9a
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L9a
            boolean r1 = android.text.TextUtils.equals(r4, r2)     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto Lfe
            java.lang.String r1 = "handleOriginalMessage check success"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L9a
            return r3
        Lfd:
            r8 = r1
        Lfe:
            java.lang.String r1 = "handleOriginalMessage check fail drop it"
            cn.jpush.android.helper.Logger.d(r0, r1)
            r0 = 1107(0x453, double:5.47E-321)
            cn.jpush.android.helper.c.a(r8, r0, r7)
            r7 = 0
            return r7
    }

    public static boolean a(android.content.Context r7, java.lang.String r8, cn.jpush.android.d.d r9, cn.jpush.android.api.NotificationMessage r10) {
            java.lang.String r0 = "NotificationHelper"
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "onNotifyMessageUnShow"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L21
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L21
            java.lang.Class<cn.jpush.android.api.NotificationMessage> r5 = cn.jpush.android.api.NotificationMessage.class
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Throwable -> L21
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L23
            java.lang.String r7 = "not found onNotifyMessageUnShow method"
            cn.jpush.android.helper.Logger.dd(r0, r7)     // Catch: java.lang.Throwable -> L21
            return r1
        L21:
            r7 = move-exception
            goto L72
        L23:
            java.lang.String r2 = r9.J     // Catch: java.lang.Throwable -> L21
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L8a
            java.lang.String r2 = r9.J     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "0"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L21
            r3 = 0
            java.lang.String r4 = "cn.jpush.android.intent.NOTIFICATION_UN_SHOW"
            if (r2 == 0) goto L4e
            boolean r8 = cn.jpush.android.ad.a.j(r7)     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L8a
            java.lang.String r8 = "displayForeground..."
            cn.jpush.android.helper.Logger.dd(r0, r8)     // Catch: java.lang.Throwable -> L21
            a(r7, r4, r9, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r8 = r9.f1757d     // Catch: java.lang.Throwable -> L21
            r9 = 1060(0x424, double:5.237E-321)
            cn.jpush.android.helper.c.a(r8, r9, r7)     // Catch: java.lang.Throwable -> L21
            return r6
        L4e:
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r8 = r8.newInstance()     // Catch: java.lang.Throwable -> L21
            cn.jpush.android.service.JPushMessageReceiver r8 = (cn.jpush.android.service.JPushMessageReceiver) r8     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = cn.jpush.android.ad.a.d(r7)     // Catch: java.lang.Throwable -> L21
            boolean r8 = r8.isNeedShowNotification(r7, r10, r2)     // Catch: java.lang.Throwable -> L21
            if (r8 != 0) goto L8a
            java.lang.String r8 = "need not show notication by user"
            cn.jpush.android.helper.Logger.dd(r0, r8)     // Catch: java.lang.Throwable -> L21
            a(r7, r4, r9, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r8 = r9.f1757d     // Catch: java.lang.Throwable -> L21
            r9 = 1061(0x425, double:5.24E-321)
            cn.jpush.android.helper.c.a(r8, r9, r7)     // Catch: java.lang.Throwable -> L21
            return r6
        L72:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "check display foreground failed:"
            r8.append(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jpush.android.helper.Logger.ww(r0, r7)
        L8a:
            return r1
    }

    public static boolean a(java.lang.Class<?> r1, java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) {
            r0 = 1
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L18
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L18
            java.lang.Class r2 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L18
            java.lang.Class r1 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L18
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L18
            r1 = r1 ^ r0
            return r1
        L17:
            return r0
        L18:
            r1 = 0
            return r1
    }

    public static android.content.Intent b(android.content.Context r1, java.lang.String r2, cn.jpush.android.d.d r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            java.lang.Class<cn.jpush.android.ui.PopWinActivity> r2 = cn.jpush.android.ui.PopWinActivity.class
            r0.setClass(r1, r2)
            if (r3 == 0) goto L15
            java.lang.String r1 = "msg_data"
            java.lang.String r2 = r3.c()
            r0.putExtra(r1, r2)
        L15:
            return r0
    }

    public static cn.jpush.android.d.d b(android.content.Context r0, android.content.Intent r1) {
            java.lang.String r0 = "msg_data"
            java.lang.String r0 = r1.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            r0 = 0
            return r0
        Le:
            cn.jpush.android.d.d r0 = cn.jpush.android.d.d.b(r0)
            return r0
    }

    public static java.lang.Object b(android.content.Context r1, java.lang.String r2) {
            r0 = 307200(0x4b000, float:4.30479E-40)
            java.lang.Object r1 = b(r1, r2, r0)
            return r1
    }

    public static java.lang.Object b(android.content.Context r6, java.lang.String r7, int r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r1 = "NotificationHelper"
            r2 = 0
            if (r0 == 0) goto Lf
            java.lang.String r6 = "large icon is empty"
            cn.jpush.android.helper.Logger.d(r1, r6)
            return r2
        Lf:
            java.lang.String r0 = ""
            r3 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L52
            boolean r4 = cn.jpush.android.ad.a.c(r7)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L27
            android.content.Context r4 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = d(r4, r7, r8)     // Catch: java.lang.Throwable -> L25
            goto L52
        L25:
            r7 = move-exception
            goto L3a
        L27:
            android.content.Context r8 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L25
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "drawable"
            android.content.Context r5 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L25
            int r3 = r8.getIdentifier(r7, r4, r5)     // Catch: java.lang.Throwable -> L25
            goto L52
        L3a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r4 = "load large icon failed:"
            r8.append(r4)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jpush.android.helper.Logger.d(r1, r7)
        L52:
            if (r3 == 0) goto L74
            android.content.res.Resources r7 = r6.getResources()     // Catch: java.lang.Throwable -> L71
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r7, r3)     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r8.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "set large icon with res bitmap:"
            r8.append(r4)     // Catch: java.lang.Throwable -> L71
            r8.append(r3)     // Catch: java.lang.Throwable -> L71
        L69:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L71
            cn.jpush.android.helper.Logger.d(r1, r8)     // Catch: java.lang.Throwable -> L71
            goto L98
        L71:
            r6 = move-exception
            goto Le5
        L74:
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L71
            if (r7 != 0) goto L97
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L71
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L71
            boolean r7 = r7.exists()     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L97
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r8.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "set large icon with path bitmap:"
            r8.append(r4)     // Catch: java.lang.Throwable -> L71
            r8.append(r0)     // Catch: java.lang.Throwable -> L71
            goto L69
        L97:
            r7 = r2
        L98:
            if (r7 == 0) goto L9c
            r2 = r7
            goto Lfd
        L9c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L71
            r8 = 23
            if (r7 < r8) goto Le2
            if (r3 == 0) goto Lbd
            android.graphics.drawable.Icon r6 = cn.jpush.android.x.a0.a(r6, r3)     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r7.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = "set large icon with res:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L71
            r7.append(r3)     // Catch: java.lang.Throwable -> L71
        Lb5:
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L71
            cn.jpush.android.helper.Logger.d(r1, r7)     // Catch: java.lang.Throwable -> L71
            goto Ld8
        Lbd:
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L71
            if (r6 != 0) goto Ld7
            android.graphics.drawable.Icon r6 = a(r0)     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto Ld8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r7.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = "set large icon with path:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L71
            r7.append(r0)     // Catch: java.lang.Throwable -> L71
            goto Lb5
        Ld7:
            r6 = r2
        Ld8:
            if (r6 == 0) goto Ldc
            r2 = r6
            goto Lfd
        Ldc:
            java.lang.String r6 = "not set large icon"
        Lde:
            cn.jpush.android.helper.Logger.d(r1, r6)     // Catch: java.lang.Throwable -> L71
            goto Lfd
        Le2:
            java.lang.String r6 = "not set large icon by bitmap"
            goto Lde
        Le5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setLargeIcon failed:"
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jpush.android.helper.Logger.w(r1, r6)
        Lfd:
            return r2
    }

    public static void b(android.content.Context r2, int r3) {
            boolean r0 = cn.jpush.android.x.f.b(r3)
            if (r0 != 0) goto L9
            cn.jpush.android.x.f.a(r3)
        L9:
            int r3 = cn.jpush.android.cache.a.j(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "queueSize:"
            r0.append(r1)
            int r1 = cn.jpush.android.x.f.b()
            r0.append(r1)
            java.lang.String r1 = ", max num:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NotificationHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            int r0 = cn.jpush.android.x.f.b()
            if (r0 <= r3) goto L3e
            int r3 = cn.jpush.android.x.f.a()
            if (r3 == 0) goto L3e
            d(r2, r3)
        L3e:
            return
    }

    public static void b(android.content.Context r17, cn.jpush.android.d.d r18) {
            r1 = r17
            r2 = r18
            java.lang.String r0 = "showNotification start"
            java.lang.String r3 = "NotificationHelper"
            cn.jpush.android.helper.Logger.d(r3, r0)
            cn.jpush.android.helper.JCoreHelper.triggerSceneCheck(r1)
            r4 = 0
            java.lang.String r0 = r2.y     // Catch: java.lang.Throwable -> L23
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "cn.jpush.android.intent.NOTIFICATION_ARRIVED"
            r6 = 0
            if (r0 == 0) goto L27
            a(r1, r5, r2, r6)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "notificationContent is empty"
            cn.jpush.android.helper.Logger.w(r3, r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r0 = move-exception
            r11 = 0
            goto L20f
        L27:
            java.lang.String r0 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r1)     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.api.NotificationMessage r7 = r2.b()     // Catch: java.lang.Throwable -> L23
            boolean r8 = a(r1, r0, r2, r7)     // Catch: java.lang.Throwable -> L23
            if (r8 == 0) goto L37
            goto L239
        L37:
            java.lang.String r8 = ""
            java.lang.String r9 = r2.K     // Catch: java.lang.Throwable -> L23
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L23
            if (r9 != 0) goto L45
            java.lang.String r9 = r2.L     // Catch: java.lang.Throwable -> L23
        L43:
            r13 = r9
            goto L48
        L45:
            java.lang.String r9 = r2.N     // Catch: java.lang.Throwable -> L23
            goto L43
        L48:
            android.content.Context r10 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = r2.K     // Catch: java.lang.Throwable -> L23
            java.lang.String r12 = r2.R     // Catch: java.lang.Throwable -> L23
            java.lang.String r14 = r2.f1757d     // Catch: java.lang.Throwable -> L23
            java.lang.String r15 = r2.O     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.x.c r9 = a(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L23
            long r10 = r9.e()     // Catch: java.lang.Throwable -> L23
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L6f
            java.lang.String r0 = r2.f1757d     // Catch: java.lang.Throwable -> L23
            long r5 = r9.e()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.c.a(r0, r5, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "build small icon failed,will not notify this notification"
            cn.jpush.android.helper.Logger.ww(r3, r0)     // Catch: java.lang.Throwable -> L23
            return
        L6f:
            cn.jpush.android.x.c r10 = new cn.jpush.android.x.c     // Catch: java.lang.Throwable -> L23
            r10.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = r2.M     // Catch: java.lang.Throwable -> L23
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L23
            if (r11 != 0) goto L94
            android.content.Context r10 = cn.jpush.android.local.JPushConstants.mApplicationContext     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = r2.M     // Catch: java.lang.Throwable -> L23
            r14 = 307200(0x4b000, float:4.30479E-40)
            cn.jpush.android.x.c r10 = a(r10, r11, r14)     // Catch: java.lang.Throwable -> L23
            long r14 = r10.e()     // Catch: java.lang.Throwable -> L23
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 == 0) goto L94
            cn.jpush.android.x.c r10 = new cn.jpush.android.x.c     // Catch: java.lang.Throwable -> L23
            r10.<init>()     // Catch: java.lang.Throwable -> L23
        L94:
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La9
            if (r11 != 0) goto Lc2
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> La9
            cn.jpush.android.service.JPushMessageReceiver r0 = (cn.jpush.android.service.JPushMessageReceiver) r0     // Catch: java.lang.Throwable -> La9
            android.app.Notification r0 = r0.getNotification(r1, r7)     // Catch: java.lang.Throwable -> La9
            goto Lc3
        La9:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r11.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r12 = "get notification from JPushMessageReceiver failed:"
            r11.append(r12)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L23
            r11.append(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.Logger.ww(r3, r0)     // Catch: java.lang.Throwable -> L23
        Lc2:
            r0 = r6
        Lc3:
            r11 = 1
            if (r0 != 0) goto Ldf
            cn.jpush.android.api.PushNotificationBuilder r12 = a(r1, r7)     // Catch: java.lang.Throwable -> L23
            if (r12 == 0) goto Ld4
            android.app.Notification r0 = r12.buildNotification(r1, r7)     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = r12.getDeveloperArg0()     // Catch: java.lang.Throwable -> L23
        Ld4:
            if (r0 != 0) goto Ldf
            android.app.Notification r0 = a(r1, r2, r9, r10)     // Catch: java.lang.Throwable -> Ldc
            r7 = 1
            goto Le0
        Ldc:
            r0 = move-exception
            goto L20f
        Ldf:
            r7 = 0
        Le0:
            int r9 = a(r2)     // Catch: java.lang.Throwable -> Lf8
            r2.f1758e = r9     // Catch: java.lang.Throwable -> Lf8
            r2.at = r8     // Catch: java.lang.Throwable -> Lf8
            boolean r8 = r2.Y     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r10 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            if (r8 == 0) goto L101
            int r8 = r2.ad     // Catch: java.lang.Throwable -> Lf8
            r12 = 2
            if (r12 != r8) goto Lfc
            android.content.Intent r8 = b(r1, r10, r2)     // Catch: java.lang.Throwable -> Lf8
            goto L105
        Lf8:
            r0 = move-exception
            r11 = r7
            goto L20f
        Lfc:
            android.content.Intent r8 = a(r1, r10, r2)     // Catch: java.lang.Throwable -> Lf8
            goto L105
        L101:
            android.content.Intent r8 = c(r1, r10, r2)     // Catch: java.lang.Throwable -> Lf8
        L105:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lf8
            r12 = 34
            if (r10 < r12) goto L13c
            android.app.ActivityOptions r10 = cn.jpush.android.api.c.a()     // Catch: java.lang.Throwable -> L13c
            java.lang.Class<android.app.ActivityOptions> r12 = android.app.ActivityOptions.class
            java.lang.String r13 = "MODE_BACKGROUND_ACTIVITY_START_ALLOWED"
            java.lang.reflect.Field r13 = r12.getField(r13)     // Catch: java.lang.Throwable -> L13d
            int r13 = r13.getInt(r6)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r14 = "MODE_BACKGROUND_ACTIVITY_START_DENIED"
            java.lang.reflect.Field r14 = r12.getField(r14)     // Catch: java.lang.Throwable -> L13d
            r14.getInt(r6)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r14 = "setPendingIntentCreatorBackgroundActivityStartMode"
            java.lang.Class[] r15 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L13d
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L13d
            r15[r4] = r16     // Catch: java.lang.Throwable -> L13d
            java.lang.reflect.Method r12 = r12.getMethod(r14, r15)     // Catch: java.lang.Throwable -> L13d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L13d
            r14[r4] = r13     // Catch: java.lang.Throwable -> L13d
            r12.invoke(r10, r14)     // Catch: java.lang.Throwable -> L13d
            goto L13d
        L13c:
            r10 = r6
        L13d:
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf8
            int r13 = (int) r12     // Catch: java.lang.Throwable -> Lf8
            if (r10 != 0) goto L146
            r12 = r6
            goto L14a
        L146:
            android.os.Bundle r12 = r10.toBundle()     // Catch: java.lang.Throwable -> Lf8
        L14a:
            r14 = 1140850688(0x44000000, float:512.0)
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r1, r13, r8, r14, r12)     // Catch: java.lang.Throwable -> Lf8
            r0.contentIntent = r8     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r8 = "cn.jpush.android.intent.NOTIFICATION_DISMISS"
            android.content.Intent r8 = c(r1, r8, r2)     // Catch: java.lang.Throwable -> Lf8
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf8
            r15 = 1
            long r12 = r12 + r15
            int r13 = (int) r12     // Catch: java.lang.Throwable -> Lf8
            if (r10 != 0) goto L164
            r10 = r6
            goto L168
        L164:
            android.os.Bundle r10 = r10.toBundle()     // Catch: java.lang.Throwable -> Lf8
        L168:
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r1, r13, r8, r14, r10)     // Catch: java.lang.Throwable -> Lf8
            r0.deleteIntent = r8     // Catch: java.lang.Throwable -> Lf8
            int r8 = r2.m     // Catch: java.lang.Throwable -> Lf8
            if (r8 != r11) goto L174
            r2.t = r11     // Catch: java.lang.Throwable -> Lf8
        L174:
            int r8 = r2.t     // Catch: java.lang.Throwable -> Lf8
            int r8 = a(r8)     // Catch: java.lang.Throwable -> Lf8
            r8 = r8 | r11
            r0.flags = r8     // Catch: java.lang.Throwable -> Lf8
            boolean r8 = c(r1)     // Catch: java.lang.Throwable -> Lf8
            if (r8 == 0) goto L185
            r0.defaults = r4     // Catch: java.lang.Throwable -> Lf8
        L185:
            java.lang.String r8 = "notification"
            java.lang.Object r8 = r1.getSystemService(r8)     // Catch: java.lang.Throwable -> Lf8
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8     // Catch: java.lang.Throwable -> Lf8
            if (r8 == 0) goto L1c3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf8
            r10.<init>()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r12 = "notify: id="
            r10.append(r12)     // Catch: java.lang.Throwable -> Lf8
            r10.append(r9)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r12 = " messageId="
            r10.append(r12)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r12 = r2.f1757d     // Catch: java.lang.Throwable -> Lf8
            r10.append(r12)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r12 = " overmessageid="
            r10.append(r12)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r12 = r2.f1761h     // Catch: java.lang.Throwable -> Lf8
            r10.append(r12)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lf8
            cn.jpush.android.helper.Logger.dd(r3, r10)     // Catch: java.lang.Throwable -> Lf8
            java.lang.Integer r10 = r2.aj     // Catch: java.lang.Throwable -> Lf8
            a(r1, r10, r0)     // Catch: java.lang.Throwable -> Lf8
            r8.notify(r9, r0)     // Catch: java.lang.Throwable -> Lf8
            a(r1, r9)     // Catch: java.lang.Throwable -> Lf8
            goto L1c8
        L1c3:
            java.lang.String r0 = "NotificationManager is null"
            cn.jpush.android.helper.Logger.w(r3, r0)     // Catch: java.lang.Throwable -> Lf8
        L1c8:
            int r0 = r2.m     // Catch: java.lang.Throwable -> Lf8
            if (r0 != r11) goto L1d2
            java.lang.String r0 = "local notification not offer to notification queue"
        L1ce:
            cn.jpush.android.helper.Logger.d(r3, r0)     // Catch: java.lang.Throwable -> Lf8
            goto L207
        L1d2:
            byte r0 = r2.ai     // Catch: java.lang.Throwable -> Lf8
            if (r0 != 0) goto L1f3
            b(r1, r9)     // Catch: java.lang.Throwable -> Lf8
            int r0 = d(r1)     // Catch: java.lang.Throwable -> Lf8
            if (r0 != 0) goto L1eb
            java.lang.String r0 = "notification trigger is off, will not show notification"
            cn.jpush.android.helper.Logger.kd(r3, r0)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r0 = r2.f1757d     // Catch: java.lang.Throwable -> Lf8
            r8 = 1036(0x40c, double:5.12E-321)
            cn.jpush.android.helper.c.a(r0, r8, r1)     // Catch: java.lang.Throwable -> Lf8
        L1eb:
            java.lang.String r0 = r2.f1757d     // Catch: java.lang.Throwable -> Lf8
            r8 = 1018(0x3fa, double:5.03E-321)
            cn.jpush.android.helper.c.a(r0, r8, r1)     // Catch: java.lang.Throwable -> Lf8
            goto L207
        L1f3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf8
            r0.<init>()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r8 = "Third notification:"
            r0.append(r8)     // Catch: java.lang.Throwable -> Lf8
            byte r8 = r2.ai     // Catch: java.lang.Throwable -> Lf8
            r0.append(r8)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf8
            goto L1ce
        L207:
            byte r0 = r2.ai     // Catch: java.lang.Throwable -> Lf8
            if (r0 != 0) goto L239
            a(r1, r5, r2, r6)     // Catch: java.lang.Throwable -> Lf8
            goto L239
        L20f:
            if (r11 != 0) goto L21a
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r6 = r0.getMessage()
            a(r1, r5, r4, r6)
        L21a:
            java.lang.String r2 = r2.f1757d
            r4 = 1080(0x438, double:5.336E-321)
            cn.jpush.android.helper.c.a(r2, r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "showNotification failed:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jpush.android.helper.Logger.e(r3, r0)
        L239:
            return
    }

    public static boolean b(android.content.Context r11) {
            r0 = 1
            boolean r1 = cn.jpush.android.cache.a.g(r11)     // Catch: java.lang.Exception -> L9d
            java.lang.String r2 = "NotificationHelper"
            r3 = 0
            if (r1 != 0) goto L10
            java.lang.String r11 = "Notification was disabled by JPushInterface.setPushTime !"
            cn.jpush.android.helper.Logger.ii(r2, r11)     // Catch: java.lang.Exception -> L9d
            return r3
        L10:
            java.lang.String r11 = cn.jpush.android.cache.a.h(r11)     // Catch: java.lang.Exception -> L9d
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L9d
            if (r1 == 0) goto L20
            java.lang.String r11 = "no time limited"
            cn.jpush.android.helper.Logger.i(r2, r11)     // Catch: java.lang.Exception -> L9d
            return r0
        L20:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
            r1.<init>()     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = "push time is ："
            r1.append(r4)     // Catch: java.lang.Exception -> L9d
            r1.append(r11)     // Catch: java.lang.Exception -> L9d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L9d
            cn.jpush.android.helper.Logger.i(r2, r1)     // Catch: java.lang.Exception -> L9d
            java.lang.String r1 = "_"
            java.lang.String[] r1 = r11.split(r1)     // Catch: java.lang.Exception -> L9d
            r4 = r1[r3]     // Catch: java.lang.Exception -> L9d
            r1 = r1[r0]     // Catch: java.lang.Exception -> L9d
            char[] r4 = r4.toCharArray()     // Catch: java.lang.Exception -> L9d
            java.lang.String r5 = "\\^"
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Exception -> L9d
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L9d
            r6 = 7
            int r6 = r5.get(r6)     // Catch: java.lang.Exception -> L9d
            r7 = 11
            int r5 = r5.get(r7)     // Catch: java.lang.Exception -> L9d
            int r7 = r4.length     // Catch: java.lang.Exception -> L9d
            r8 = 0
        L59:
            if (r8 >= r7) goto L88
            char r9 = r4[r8]     // Catch: java.lang.Exception -> L9d
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> L9d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L9d
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L9d
            int r9 = r9 + r0
            if (r6 != r9) goto L85
            r9 = r1[r3]     // Catch: java.lang.Exception -> L9d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L9d
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L9d
            r10 = r1[r0]     // Catch: java.lang.Exception -> L9d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L9d
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> L9d
            if (r5 < r9) goto L85
            if (r5 > r10) goto L85
            return r0
        L85:
            int r8 = r8 + 1
            goto L59
        L88:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
            r1.<init>()     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = "Current time is out of the push time - "
            r1.append(r4)     // Catch: java.lang.Exception -> L9d
            r1.append(r11)     // Catch: java.lang.Exception -> L9d
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Exception -> L9d
            cn.jpush.android.helper.Logger.ii(r2, r11)     // Catch: java.lang.Exception -> L9d
            return r3
        L9d:
            return r0
    }

    private static android.content.Intent c(android.content.Context r1, java.lang.String r2, cn.jpush.android.d.d r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            java.lang.Class<cn.jpush.android.service.JNotifyActivity> r2 = cn.jpush.android.service.JNotifyActivity.class
            r0.setClass(r1, r2)
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r0.setFlags(r1)
            if (r3 == 0) goto L1a
            java.lang.String r1 = "msg_data"
            java.lang.String r2 = r3.c()
            r0.putExtra(r1, r2)
        L1a:
            return r0
    }

    public static synchronized android.graphics.Bitmap c(android.content.Context r5, java.lang.String r6) {
            java.lang.Class<cn.jpush.android.x.b> r0 = cn.jpush.android.x.b.class
            monitor-enter(r0)
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L50
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L50
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L50
            r1 = 0
            android.content.pm.ApplicationInfo r6 = r5.getApplicationInfo(r6, r1)     // Catch: java.lang.Throwable -> L50
            android.graphics.drawable.Drawable r5 = r5.getApplicationIcon(r6)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L74
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L50
            r2 = 26
            if (r6 < r2) goto L52
            boolean r6 = cn.jpush.android.x.z.a(r5)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L52
            int r6 = r5.getIntrinsicWidth()     // Catch: java.lang.Throwable -> L50
            int r2 = r5.getIntrinsicHeight()     // Catch: java.lang.Throwable -> L50
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L50
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r2, r3)     // Catch: java.lang.Throwable -> L50
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L50
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L50
            int r3 = r2.getWidth()     // Catch: java.lang.Throwable -> L50
            int r4 = r2.getHeight()     // Catch: java.lang.Throwable -> L50
            r5.setBounds(r1, r1, r3, r4)     // Catch: java.lang.Throwable -> L50
            r5.draw(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "NotificationHelper"
            java.lang.String r1 = "adaptive-icon to bitmap"
            cn.jpush.android.helper.Logger.d(r5, r1)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            return r6
        L50:
            r5 = move-exception
            goto L5a
        L52:
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5     // Catch: java.lang.Throwable -> L50
            android.graphics.Bitmap r5 = r5.getBitmap()     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            return r5
        L5a:
            java.lang.String r6 = "NotificationHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r1.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "getTargetAppBitmap failed:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L77
            r1.append(r5)     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L77
            cn.jpush.android.helper.Logger.w(r6, r5)     // Catch: java.lang.Throwable -> L77
        L74:
            monitor-exit(r0)
            r5 = 0
            return r5
        L77:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            throw r5
    }

    public static cn.jpush.android.api.NotificationMessage c(android.content.Context r1, android.content.Intent r2) {
            cn.jpush.android.d.d r2 = b(r1, r2)
            cn.jpush.android.api.NotificationMessage r0 = new cn.jpush.android.api.NotificationMessage
            r0.<init>()
            if (r2 == 0) goto Lf
            cn.jpush.android.api.NotificationMessage r0 = r2.b()
        Lf:
            java.lang.String r2 = r0.appkey
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L1d
            java.lang.String r1 = cn.jpush.android.helper.JCoreHelper.getAppKey(r1)
            r0.appkey = r1
        L1d:
            return r0
    }

    public static java.lang.String c(android.content.Context r5, java.lang.String r6, int r7) {
            r0 = 0
            boolean r0 = cn.jpush.android.ad.a.a(r6, r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "NotificationHelper"
            if (r0 == 0) goto L8f
            java.lang.String r0 = "The url is a picture resources."
            cn.jpush.android.helper.Logger.i(r2, r0)
            java.lang.String r0 = cn.jpush.android.ad.a.d(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L22
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
        L22:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = cn.jpush.android.ad.a.b(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "noti_res"
            java.lang.String r4 = cn.jpush.android.ad.c.c(r5, r4)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "picture notification resource path: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            cn.jpush.android.helper.Logger.i(r2, r3)
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L7e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "need not download again with same url:"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jpush.android.helper.Logger.d(r2, r5)
            return r0
        L7e:
            java.lang.String r2 = "notify_img"
            r3 = 2
            byte[] r5 = cn.jpush.android.w.b.a(r5, r6, r2, r3, r7)
            if (r5 == 0) goto L8e
            boolean r5 = cn.jpush.android.ad.c.a(r0, r5)
            if (r5 == 0) goto L8e
            return r0
        L8e:
            return r1
        L8f:
            java.lang.String r5 = "The url is not a picture resources."
            cn.jpush.android.helper.Logger.i(r2, r5)
            return r1
    }

    public static void c(android.content.Context r2, int r3) {
            if (r3 > 0) goto L3
            goto L12
        L3:
            r0 = 0
        L4:
            if (r0 >= r3) goto L12
            int r1 = cn.jpush.android.x.f.a()
            if (r1 == 0) goto Lf
            d(r2, r1)
        Lf:
            int r0 = r0 + 1
            goto L4
        L12:
            return
    }

    public static void c(android.content.Context r0, cn.jpush.android.d.d r1) {
            if (r1 == 0) goto L9
            int r1 = a(r1)
            d(r0, r1)
        L9:
            return
    }

    public static boolean c(android.content.Context r11) {
            java.lang.String r0 = ":"
            java.lang.String r1 = "NotificationHelper"
            java.lang.String r11 = cn.jpush.android.cache.a.i(r11)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lef
            r2.<init>(r11)     // Catch: org.json.JSONException -> Lef
            java.lang.String r11 = "startHour"
            r4 = -1
            int r11 = r2.optInt(r11, r4)     // Catch: org.json.JSONException -> Lef
            java.lang.String r5 = "startMins"
            int r5 = r2.optInt(r5, r4)     // Catch: org.json.JSONException -> Lef
            java.lang.String r6 = "endHour"
            int r6 = r2.optInt(r6, r4)     // Catch: org.json.JSONException -> Lef
            java.lang.String r7 = "endtMins"
            int r2 = r2.optInt(r7, r4)     // Catch: org.json.JSONException -> Lef
            if (r11 < 0) goto Lef
            if (r5 < 0) goto Lef
            if (r6 < 0) goto Lef
            if (r2 < 0) goto Lef
            r4 = 59
            if (r5 > r4) goto Lef
            if (r2 > r4) goto Lef
            r4 = 23
            if (r6 > r4) goto Lef
            if (r11 <= r4) goto L44
            goto Lef
        L44:
            java.util.Calendar r7 = java.util.Calendar.getInstance()     // Catch: org.json.JSONException -> Lef
            r8 = 11
            int r8 = r7.get(r8)     // Catch: org.json.JSONException -> Lef
            r9 = 12
            int r7 = r7.get(r9)     // Catch: org.json.JSONException -> Lef
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lef
            r9.<init>()     // Catch: org.json.JSONException -> Lef
            java.lang.String r10 = "nowHour:"
            r9.append(r10)     // Catch: org.json.JSONException -> Lef
            r9.append(r8)     // Catch: org.json.JSONException -> Lef
            java.lang.String r10 = ", nowMin:"
            r9.append(r10)     // Catch: org.json.JSONException -> Lef
            r9.append(r7)     // Catch: org.json.JSONException -> Lef
            java.lang.String r10 = ", startHour:"
            r9.append(r10)     // Catch: org.json.JSONException -> Lef
            r9.append(r11)     // Catch: org.json.JSONException -> Lef
            java.lang.String r10 = ", startMin:"
            r9.append(r10)     // Catch: org.json.JSONException -> Lef
            r9.append(r5)     // Catch: org.json.JSONException -> Lef
            java.lang.String r10 = ", endHour:"
            r9.append(r10)     // Catch: org.json.JSONException -> Lef
            r9.append(r6)     // Catch: org.json.JSONException -> Lef
            java.lang.String r10 = ", endMin:"
            r9.append(r10)     // Catch: org.json.JSONException -> Lef
            r9.append(r2)     // Catch: org.json.JSONException -> Lef
            java.lang.String r9 = r9.toString()     // Catch: org.json.JSONException -> Lef
            cn.jpush.android.helper.Logger.v(r1, r9)     // Catch: org.json.JSONException -> Lef
            if (r11 >= r6) goto La0
            if (r8 <= r11) goto L96
            if (r8 < r6) goto Lc5
        L96:
            if (r8 != r11) goto L9a
            if (r7 >= r5) goto Lc5
        L9a:
            if (r8 != r6) goto L9f
            if (r7 > r2) goto L9f
            goto Lc5
        L9f:
            return r3
        La0:
            if (r11 != r6) goto Lb3
            if (r5 < r2) goto Lab
            if (r8 != r11) goto Lc5
            if (r7 <= r2) goto Lc5
            if (r7 >= r5) goto Lc5
            return r3
        Lab:
            if (r8 != r11) goto Lb2
            if (r7 < r5) goto Lb2
            if (r7 > r2) goto Lb2
            goto Lc5
        Lb2:
            return r3
        Lb3:
            if (r11 <= r6) goto Lef
            if (r8 <= r11) goto Lb9
            if (r8 <= r4) goto Lc5
        Lb9:
            if (r8 < 0) goto Lbd
            if (r8 < r6) goto Lc5
        Lbd:
            if (r8 != r11) goto Lc1
            if (r7 >= r5) goto Lc5
        Lc1:
            if (r8 != r6) goto Lef
            if (r7 > r2) goto Lef
        Lc5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lef
            r4.<init>()     // Catch: org.json.JSONException -> Lef
            java.lang.String r7 = "Current time is in the range of silence time - "
            r4.append(r7)     // Catch: org.json.JSONException -> Lef
            r4.append(r11)     // Catch: org.json.JSONException -> Lef
            r4.append(r0)     // Catch: org.json.JSONException -> Lef
            r4.append(r5)     // Catch: org.json.JSONException -> Lef
            java.lang.String r11 = " ~ "
            r4.append(r11)     // Catch: org.json.JSONException -> Lef
            r4.append(r6)     // Catch: org.json.JSONException -> Lef
            r4.append(r0)     // Catch: org.json.JSONException -> Lef
            r4.append(r2)     // Catch: org.json.JSONException -> Lef
            java.lang.String r11 = r4.toString()     // Catch: org.json.JSONException -> Lef
            cn.jpush.android.helper.Logger.ii(r1, r11)     // Catch: org.json.JSONException -> Lef
            r11 = 1
            return r11
        Lef:
            return r3
    }

    public static int d(android.content.Context r12) {
            java.lang.Boolean r0 = cn.jpush.android.helper.JCoreHelper.checkSdkBanned(r12)
            boolean r0 = r0.booleanValue()
            r1 = 0
            java.lang.String r2 = "NotificationHelper"
            if (r0 == 0) goto L13
            java.lang.String r12 = "sdk is banned, call failed"
            cn.jpush.android.helper.Logger.ww(r2, r12)
            return r1
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r4 = -1
            if (r0 < r3) goto L55
            java.lang.String r0 = "notification"
            java.lang.Object r12 = r12.getSystemService(r0)     // Catch: java.lang.Throwable -> L3d
            android.app.NotificationManager r12 = (android.app.NotificationManager) r12     // Catch: java.lang.Throwable -> L3d
            if (r12 == 0) goto L3f
            boolean r12 = cn.jiguang.commons.L.f1.a(r12)     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "from NotificationManager enable="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            r0.append(r12)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3d
            cn.jpush.android.helper.Logger.d(r2, r0)     // Catch: java.lang.Throwable -> L3d
            return r12
        L3d:
            r12 = move-exception
            goto L40
        L3f:
            return r4
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isNotificationEnabled e:"
        L47:
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            cn.jpush.android.helper.Logger.w(r2, r12)
            return r4
        L55:
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r12.getSystemService(r0)     // Catch: java.lang.Throwable -> Lcd
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0     // Catch: java.lang.Throwable -> Lcd
            android.content.pm.ApplicationInfo r3 = r12.getApplicationInfo()     // Catch: java.lang.Throwable -> Lcd
            android.content.Context r12 = r12.getApplicationContext()     // Catch: java.lang.Throwable -> Lcd
            android.content.Context r12 = com.stub.StubApp.getOrigApplicationContext(r12)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = r12.getPackageName()     // Catch: java.lang.Throwable -> Lcd
            int r3 = r3.uid     // Catch: java.lang.Throwable -> Lcd
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> Lcd
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r6 = "checkOpNoThrow"
            r7 = 3
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lcd
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lcd
            r8[r1] = r9     // Catch: java.lang.Throwable -> Lcd
            r10 = 1
            r8[r10] = r9     // Catch: java.lang.Throwable -> Lcd
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r11 = 2
            r8[r11] = r9     // Catch: java.lang.Throwable -> Lcd
            java.lang.reflect.Method r6 = r5.getMethod(r6, r8)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r8 = "OP_POST_NOTIFICATION"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r8)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            java.lang.Object r5 = r5.get(r8)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> Lcd
            r5.intValue()     // Catch: java.lang.Throwable -> Lcd
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lcd
            r7[r1] = r5     // Catch: java.lang.Throwable -> Lcd
            r7[r10] = r3     // Catch: java.lang.Throwable -> Lcd
            r7[r11] = r12     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r12 = r6.invoke(r0, r7)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> Lcd
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> Lcd
            if (r12 != 0) goto Lb8
            r1 = 1
        Lb8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r12.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "from AppOpsManager enable="
            r12.append(r0)     // Catch: java.lang.Throwable -> Lcd
            r12.append(r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lcd
            cn.jpush.android.helper.Logger.d(r2, r12)     // Catch: java.lang.Throwable -> Lcd
            return r1
        Lcd:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "appOps check e:"
            goto L47
    }

    private static java.lang.String d(android.content.Context r1, java.lang.String r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L28
            java.lang.String r0 = "http://"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = "https://"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L28
        L16:
            java.lang.String r1 = c(r1, r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L21
            return r1
        L21:
            java.lang.String r1 = "NotificationHelper"
            java.lang.String r2 = "Get network picture failed."
            cn.jpush.android.helper.Logger.ww(r1, r2)
        L28:
            r1 = 0
            return r1
    }

    public static void d(android.content.Context r3, int r4) {
            java.lang.String r0 = "NotificationHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "action:cleanNotification - notificationId:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            r1.append(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "notification"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L22
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3     // Catch: java.lang.Throwable -> L22
            r3.cancel(r4)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "cancelNotification failed:"
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
            return
    }

    static /* synthetic */ void d(android.content.Context r0, cn.jpush.android.d.d r1) {
            g(r0, r1)
            return
    }

    private static boolean d(android.content.Context r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L52
            r1 = 26
            if (r0 < r1) goto L52
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L52
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L52
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L1b
            android.app.NotificationChannel r2 = cn.jiguang.av.y.a(r2, r3)     // Catch: java.lang.Throwable -> L52
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.String r0 = "NotificationHelper"
            if (r2 == 0) goto L3c
            int r2 = cn.jpush.android.x.o.a(r2)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L27
            goto L3c
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L52
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = " channel is opened,will use it"
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L52
            cn.jpush.android.helper.Logger.dd(r0, r2)     // Catch: java.lang.Throwable -> L52
            goto L52
        L3c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L52
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = " channel maybe closed,please check it"
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L52
            cn.jpush.android.helper.Logger.ww(r0, r2)     // Catch: java.lang.Throwable -> L52
            r2 = 0
            return r2
        L52:
            r2 = 1
            return r2
    }

    static /* synthetic */ void e(android.content.Context r0, cn.jpush.android.d.d r1) {
            f(r0, r1)
            return
    }

    public static boolean e(android.content.Context r4) {
            r0 = 0
            java.lang.Boolean r1 = cn.jpush.android.helper.JCoreHelper.checkSdkBanned(r4)     // Catch: java.lang.Throwable -> L52
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L13
            java.lang.String r4 = "NotificationHelper"
            java.lang.String r1 = "sdk is banned, call failed"
            cn.jpush.android.helper.Logger.ww(r4, r1)     // Catch: java.lang.Throwable -> L52
            return r0
        L13:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "android.settings.APP_NOTIFICATION_SETTINGS"
            r1.setAction(r2)     // Catch: java.lang.Throwable -> L52
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L52
            r3 = 26
            if (r2 < r3) goto L38
            java.lang.String r2 = "android.provider.extra.APP_PACKAGE"
            java.lang.String r3 = r4.getPackageName()     // Catch: java.lang.Throwable -> L52
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "android.provider.extra.CHANNEL_ID"
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L52
        L32:
            int r3 = r3.uid     // Catch: java.lang.Throwable -> L52
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L52
            goto L48
        L38:
            java.lang.String r2 = "app_package"
            java.lang.String r3 = r4.getPackageName()     // Catch: java.lang.Throwable -> L52
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "app_uid"
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L52
            goto L32
        L48:
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r2)     // Catch: java.lang.Throwable -> L52
            r4.startActivity(r1)     // Catch: java.lang.Throwable -> L52
            r4 = 1
            return r4
        L52:
            return r0
    }

    private static boolean e(android.content.Context r10, int r11) {
            r0 = 0
            java.lang.String r1 = "com.skyui.push.sdk.SkyPushAgent"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "getPushService"
            r3 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.invoke(r3, r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = "setAppBadgeCount"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> L3d
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3d
            r8 = 1
            r6[r8] = r7     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r9 = 2
            r6[r9] = r7     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r2 = r2.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L3d
            r4[r0] = r10     // Catch: java.lang.Throwable -> L3d
            r4[r8] = r11     // Catch: java.lang.Throwable -> L3d
            r4[r9] = r3     // Catch: java.lang.Throwable -> L3d
            r2.invoke(r1, r4)     // Catch: java.lang.Throwable -> L3d
            return r8
        L3d:
            return r0
    }

    private static void f(android.content.Context r11, cn.jpush.android.d.d r12) {
            java.lang.String r0 = r12.f1757d
            java.lang.String r2 = r12.Z
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r7 = 1
            java.lang.String r8 = "NotificationHelper"
            java.lang.String r9 = ""
            r10 = 0
            if (r1 != 0) goto L24
            r4 = 5
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r3 = "rich"
            r1 = r11
            java.lang.String r11 = cn.jpush.android.w.b.a(r1, r2, r3, r4, r5)
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L21
            r9 = r11
        L21:
            r11 = r3 ^ 1
            goto L2b
        L24:
            r1 = r11
            java.lang.String r11 = "Show url is Empty! Give up to download!"
            cn.jpush.android.helper.Logger.w(r8, r11)
            r11 = 0
        L2b:
            java.lang.String r3 = cn.jpush.android.ad.c.c(r1, r0)
            r4 = 1014(0x3f6, double:5.01E-321)
            if (r11 == 0) goto Lc5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r0)
            java.lang.String r6 = ".html"
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            java.lang.String r6 = "/"
            int r6 = r2.lastIndexOf(r6)
            int r6 = r6 + r7
            java.lang.String r2 = r2.substring(r10, r6)
            java.util.ArrayList<java.lang.String> r6 = r12.af
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto Lbd
            java.util.ArrayList<java.lang.String> r6 = r12.af
            boolean r6 = cn.jpush.android.x.h.a(r6, r1, r2, r0, r7)
            if (r6 != 0) goto L6e
            java.lang.String r11 = "Loads rich push resources failed, webView will open url!"
            cn.jpush.android.helper.Logger.d(r8, r11)
            cn.jpush.android.helper.c.a(r0, r4, r1)
            b(r1, r12)
            return
        L6e:
            java.lang.String r6 = "Loads rich push resources succeed, webView will open cache!"
            cn.jpush.android.helper.Logger.d(r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "img src=\""
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r2 = r9.replaceAll(r2, r3)
            boolean r2 = cn.jpush.android.ad.c.b(r11, r2)
            if (r2 == 0) goto Lb9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file://"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r12.ab = r11
            r2 = 995(0x3e3, double:4.916E-321)
            cn.jpush.android.helper.c.a(r0, r2, r1)
            b(r1, r12)
            return
        Lb9:
            cn.jpush.android.helper.c.a(r0, r4, r1)
            return
        Lbd:
            java.lang.String r11 = r12.Z
            r12.ab = r11
            b(r1, r12)
            return
        Lc5:
            java.lang.String r11 = "NOTE: failed to download html page. Give up this."
            cn.jpush.android.helper.Logger.w(r8, r11)
            cn.jpush.android.helper.c.a(r0, r4, r1)
            r11 = 1021(0x3fd, double:5.044E-321)
            r2 = 0
            cn.jpush.android.helper.c.a(r0, r11, r2, r1)
            return
    }

    public static boolean f(android.content.Context r4) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "package"
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L22
            r3 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r1, r2, r3)     // Catch: java.lang.Throwable -> L22
            r0.setData(r1)     // Catch: java.lang.Throwable -> L22
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)     // Catch: java.lang.Throwable -> L22
            r4.startActivity(r0)     // Catch: java.lang.Throwable -> L22
            r4 = 1
            return r4
        L22:
            r4 = 0
            return r4
    }

    private static boolean f(android.content.Context r7, int r8) {
            java.lang.String r0 = "NotificationHelper"
            r1 = 0
            java.lang.String r2 = "content://com.huawei.android.launcher.settings/badge/"
            java.lang.String r3 = "content://com.hihonor.android.launcher.settings/badge/"
            android.content.ContentResolver r4 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = r4.getType(r3)     // Catch: java.lang.Throwable -> L2d
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L2f
            android.net.Uri r3 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r4.getType(r3)     // Catch: java.lang.Throwable -> L2d
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            java.lang.String r7 = " setHonorBadge fail, uri is null"
            cn.jpush.android.helper.Logger.e(r0, r7)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r7 = move-exception
            goto L53
        L2f:
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "package"
            java.lang.String r6 = r7.getPackageName()     // Catch: java.lang.Throwable -> L2d
            r2.putString(r5, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "class"
            java.lang.String r7 = h(r7)     // Catch: java.lang.Throwable -> L2d
            r2.putString(r5, r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = "badgenumber"
            r2.putInt(r7, r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = "change_badge"
            r8 = 0
            r4.call(r3, r7, r8, r2)     // Catch: java.lang.Throwable -> L2d
            r7 = 1
            return r7
        L53:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = " setHonorBadge wrong error:"
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jpush.android.helper.Logger.e(r0, r7)
            return r1
    }

    private static java.lang.String g(android.content.Context r4) {
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L2c
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "android.intent.action.MAIN"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L2c
            r2.setPackage(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            r2.addCategory(r4)     // Catch: java.lang.Throwable -> L2c
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r4 = r1.resolveActivity(r2, r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L25
            r4 = 0
            android.content.pm.ResolveInfo r4 = r1.resolveActivity(r2, r4)     // Catch: java.lang.Throwable -> L2c
        L25:
            if (r4 == 0) goto L2c
            android.content.pm.ActivityInfo r4 = r4.activityInfo     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.name     // Catch: java.lang.Throwable -> L2c
            return r4
        L2c:
            return r0
    }

    private static void g(android.content.Context r3, cn.jpush.android.d.d r4) {
            java.lang.String r0 = r4.B
            java.lang.String r1 = ""
            r4.B = r1
            int r1 = r4.z
            r2 = 3
            if (r1 != r2) goto L49
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L49
            java.lang.String r1 = "http://"
            boolean r1 = r0.startsWith(r1)
            java.lang.String r2 = "NotificationHelper"
            if (r1 != 0) goto L37
            java.lang.String r1 = "https://"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L24
            goto L37
        L24:
            java.lang.String r3 = cn.jpush.android.ad.c.e(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L31
            r4.B = r3
            return
        L31:
            java.lang.String r3 = "Get developer picture failed, show basic notification only."
        L33:
            cn.jpush.android.helper.Logger.ww(r2, r3)
            return
        L37:
            java.lang.String r1 = r4.f1757d
            java.lang.String r3 = a(r3, r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L46
            r4.B = r3
            return
        L46:
            java.lang.String r3 = "Get network picture failed, show basic notification only."
            goto L33
        L49:
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    private static boolean g(android.content.Context r3, int r4) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "packageName"
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Throwable -> L2b
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "className"
            java.lang.String r2 = h(r3)     // Catch: java.lang.Throwable -> L2b
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "notificationNum"
            r0.putExtra(r1, r4)     // Catch: java.lang.Throwable -> L2b
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r0.addFlags(r4)     // Catch: java.lang.Throwable -> L2b
            r3.sendBroadcast(r0)     // Catch: java.lang.Throwable -> L2b
            r3 = 1
            return r3
        L2b:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = " setVivoBadge wrong error:"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "NotificationHelper"
            cn.jpush.android.helper.Logger.e(r4, r3)
            r3 = 0
            return r3
    }

    private static java.lang.String h(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r2.getPackageName()     // Catch: java.lang.Throwable -> L1d
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1d
            android.content.ComponentName r1 = r0.getComponent()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1d
            android.content.ComponentName r0 = r0.getComponent()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r0.getClassName()     // Catch: java.lang.Throwable -> L1d
            return r2
        L1d:
            java.lang.String r2 = g(r2)
            return r2
    }

    private static boolean h(android.content.Context r4, int r5) {
            java.lang.String r0 = "NotificationHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r1.<init>()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "【setEMUIBadge】number："
            r1.append(r2)     // Catch: java.lang.Exception -> L45
            r1.append(r5)     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L45
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Exception -> L45
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Exception -> L45
            r1.<init>()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "package"
            java.lang.String r3 = r4.getPackageName()     // Catch: java.lang.Exception -> L45
            r1.putString(r2, r3)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "class"
            java.lang.String r3 = h(r4)     // Catch: java.lang.Exception -> L45
            r1.putString(r2, r3)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "badgenumber"
            r1.putInt(r2, r5)     // Catch: java.lang.Exception -> L45
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Exception -> L45
            java.lang.String r5 = "content://com.huawei.android.launcher.settings/badge/"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "change_badge"
            r3 = 0
            r4.call(r5, r2, r3, r1)     // Catch: java.lang.Exception -> L45
            r4 = 1
            return r4
        L45:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "e: "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.e(r0, r4)
            r4 = 0
            return r4
    }
}
