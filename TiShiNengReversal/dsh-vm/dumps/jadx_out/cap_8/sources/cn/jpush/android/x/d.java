package cn.jpush.android.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static final java.lang.Object a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile java.util.Queue<java.lang.String> f2026b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.x.d.a = r0
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.json.JSONArray a(android.content.Context r3) {
            java.lang.String r0 = "NotificationRecords"
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.NotiCancel()
            java.lang.Object r3 = cn.jpush.android.cache.Sp.get(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "read="
            r1.append(r2)     // Catch: java.lang.Throwable -> L2c
            r1.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L2c
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            goto L42
        L2c:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "read NotiCancel e:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
        L41:
            r1 = 0
        L42:
            if (r1 == 0) goto L45
            goto L4a
        L45:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L4a:
            return r1
    }

    public static void a(android.content.Context r12, java.util.List<java.lang.String> r13, int r14) {
            java.lang.String r0 = "NotificationRecords"
            org.json.JSONArray r1 = a(r12)     // Catch: java.lang.Throwable -> L2f
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r6 = 0
        L11:
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "id"
            java.lang.String r9 = "time"
            if (r6 >= r7) goto L43
            org.json.JSONObject r7 = r1.getJSONObject(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L2f
            if (r13 == 0) goto L31
            boolean r8 = r13.remove(r8)     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L31
            r7.put(r9, r3)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r12 = move-exception
            goto L9a
        L31:
            long r8 = r7.getLong(r9)     // Catch: java.lang.Throwable -> L2f
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 + r10
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L40
            r2.put(r7)     // Catch: java.lang.Throwable -> L2f
        L40:
            int r6 = r6 + 1
            goto L11
        L43:
            if (r13 == 0) goto L69
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L2f
        L49:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L69
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2f
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
            r6.<init>()     // Catch: java.lang.Throwable -> L2f
            r6.put(r9, r3)     // Catch: java.lang.Throwable -> L2f
            r6.put(r8, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "type"
            r6.put(r1, r14)     // Catch: java.lang.Throwable -> L2f
            r2.put(r6)     // Catch: java.lang.Throwable -> L2f
            goto L49
        L69:
            int r13 = r2.length()     // Catch: java.lang.Throwable -> L2f
            if (r13 <= 0) goto L74
            java.lang.String r13 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            goto L75
        L74:
            r13 = 0
        L75:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r14.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "saveString="
            r14.append(r1)     // Catch: java.lang.Throwable -> L2f
            r14.append(r13)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.helper.Logger.d(r0, r14)     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.cache.Key r14 = cn.jpush.android.cache.Key.NotiCancel()     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.cache.Key r13 = r14.set(r13)     // Catch: java.lang.Throwable -> L2f
            r14 = 1
            cn.jpush.android.cache.Key[] r14 = new cn.jpush.android.cache.Key[r14]     // Catch: java.lang.Throwable -> L2f
            r14[r5] = r13     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.cache.Sp.set(r12, r14)     // Catch: java.lang.Throwable -> L2f
            return
        L9a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "save NotiCancel e:"
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            cn.jpush.android.helper.Logger.w(r0, r12)
            return
    }

    public static boolean a(android.content.Context r0, java.lang.String r1) {
            b(r0)
            java.util.Queue<java.lang.String> r0 = cn.jpush.android.x.d.f2026b
            boolean r0 = r0.contains(r1)
            return r0
    }

    public static boolean a(android.content.Context r19, java.lang.String r20, java.lang.String r21, int r22) {
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.String r3 = "NotificationRecords"
            org.json.JSONArray r5 = a(r0)     // Catch: java.lang.Throwable -> L89
            if (r5 == 0) goto L14
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L18
        L14:
            r16 = 0
            goto Lc9
        L18:
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L89
            r6.<init>()     // Catch: java.lang.Throwable -> L89
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L89
            r9 = 0
            r10 = 0
        L23:
            int r11 = r5.length()     // Catch: java.lang.Throwable -> L89
            r12 = 1
            if (r9 >= r11) goto L8d
            org.json.JSONObject r11 = r5.getJSONObject(r9)     // Catch: java.lang.Throwable -> L89
            java.lang.String r13 = "time"
            long r13 = r11.getLong(r13)     // Catch: java.lang.Throwable -> L89
            java.lang.String r15 = "type"
            r16 = 0
            r4 = -1
            int r15 = r11.optInt(r15, r4)     // Catch: java.lang.Throwable -> L6a
            r17 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r13 + r17
            int r17 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r17 >= 0) goto L84
            r6.put(r11)     // Catch: java.lang.Throwable -> L6a
            if (r10 != 0) goto L84
            java.lang.String r13 = "id"
            java.lang.String r11 = r11.getString(r13)     // Catch: java.lang.Throwable -> L6a
            boolean r13 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L6a
            if (r13 != 0) goto L6c
            boolean r13 = r1.equals(r11)     // Catch: java.lang.Throwable -> L6a
            if (r13 == 0) goto L6c
            if (r15 == r4) goto L61
            if (r2 != r15) goto L6c
        L61:
            r10 = 1032(0x408, double:5.1E-321)
            cn.jpush.android.helper.c.a(r1, r10, r0)     // Catch: java.lang.Throwable -> L6a
            r13 = r21
        L68:
            r10 = 1
            goto L86
        L6a:
            r0 = move-exception
            goto Lca
        L6c:
            boolean r13 = android.text.TextUtils.isEmpty(r21)     // Catch: java.lang.Throwable -> L6a
            if (r13 != 0) goto L84
            r13 = r21
            boolean r11 = r13.equals(r11)     // Catch: java.lang.Throwable -> L6a
            if (r11 == 0) goto L86
            if (r15 == r4) goto L7e
            if (r2 != r15) goto L86
        L7e:
            r10 = 1033(0x409, double:5.104E-321)
            cn.jpush.android.helper.c.a(r1, r10, r0)     // Catch: java.lang.Throwable -> L6a
            goto L68
        L84:
            r13 = r21
        L86:
            int r9 = r9 + 1
            goto L23
        L89:
            r0 = move-exception
            r16 = 0
            goto Lca
        L8d:
            r16 = 0
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L6a
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L6a
            if (r1 == r2) goto Lc8
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L6a
            if (r1 <= 0) goto La4
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6a
            goto La5
        La4:
            r1 = 0
        La5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "saveString when check="
            r2.append(r4)     // Catch: java.lang.Throwable -> L6a
            r2.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6a
            cn.jpush.android.helper.Logger.d(r3, r2)     // Catch: java.lang.Throwable -> L6a
            cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.NotiCancel()     // Catch: java.lang.Throwable -> L6a
            cn.jpush.android.cache.Key r1 = r2.set(r1)     // Catch: java.lang.Throwable -> L6a
            cn.jpush.android.cache.Key[] r2 = new cn.jpush.android.cache.Key[r12]     // Catch: java.lang.Throwable -> L6a
            r2[r16] = r1     // Catch: java.lang.Throwable -> L6a
            cn.jpush.android.cache.Sp.set(r0, r2)     // Catch: java.lang.Throwable -> L6a
        Lc8:
            return r10
        Lc9:
            return r16
        Lca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isAlreadyCancel e:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jpush.android.helper.Logger.w(r3, r0)
            return r16
    }

    private static void b(android.content.Context r5) {
            java.util.Queue<java.lang.String> r0 = cn.jpush.android.x.d.f2026b
            if (r0 != 0) goto L43
            java.lang.Class<cn.jpush.android.x.d> r0 = cn.jpush.android.x.d.class
            monitor-enter(r0)
            java.util.Queue<java.lang.String> r1 = cn.jpush.android.x.d.f2026b     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3f
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch: java.lang.Throwable -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            cn.jpush.android.x.d.f2026b = r1     // Catch: java.lang.Throwable -> L3a
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.NotiShow()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = cn.jpush.android.cache.Sp.get(r5, r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3a
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3f
            java.lang.String r1 = ","
            java.lang.String[] r5 = r5.split(r1)     // Catch: java.lang.Throwable -> L3a
            int r1 = r5.length     // Catch: java.lang.Throwable -> L3a
            r2 = 0
        L2a:
            if (r2 >= r1) goto L3f
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L3a
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3a
            if (r4 != 0) goto L3c
            java.util.Queue<java.lang.String> r4 = cn.jpush.android.x.d.f2026b     // Catch: java.lang.Throwable -> L3a
            r4.offer(r3)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r5 = move-exception
            goto L41
        L3c:
            int r2 = r2 + 1
            goto L2a
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r5
        L43:
            return
    }

    public static void b(android.content.Context r5, java.lang.String r6) {
            b(r5)     // Catch: java.lang.Throwable -> L69
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto La
            return
        La:
            java.lang.Object r0 = cn.jpush.android.x.d.a     // Catch: java.lang.Throwable -> L69
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L69
            java.util.Queue<java.lang.String> r1 = cn.jpush.android.x.d.f2026b     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1d
            r2 = 70
            if (r1 < r2) goto L1f
            java.util.Queue<java.lang.String> r1 = cn.jpush.android.x.d.f2026b     // Catch: java.lang.Throwable -> L1d
            r1.poll()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r5 = move-exception
            goto L67
        L1f:
            java.util.Queue<java.lang.String> r1 = cn.jpush.android.x.d.f2026b     // Catch: java.lang.Throwable -> L1d
            r1.offer(r6)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.util.Queue<java.lang.String> r2 = cn.jpush.android.x.d.f2026b     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1d
        L2f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r4.<init>()     // Catch: java.lang.Throwable -> L1d
            r4.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = ","
            r4.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L1d
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            goto L2f
        L50:
            cn.jpush.android.cache.Key r2 = cn.jpush.android.cache.Key.NotiShow()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            cn.jpush.android.cache.Key r1 = r2.set(r1)     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            cn.jpush.android.cache.Key[] r2 = new cn.jpush.android.cache.Key[r2]     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Throwable -> L1d
            cn.jpush.android.cache.Sp.set(r5, r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r5     // Catch: java.lang.Throwable -> L69
        L69:
            java.lang.String r5 = "NotificationRecords"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveNotiHistory failed,messageId = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jpush.android.helper.Logger.e(r5, r6)
            return
    }
}
