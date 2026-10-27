package cn.jpush.android.d;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static java.util.Queue<cn.jpush.android.d.a> a;

    static {
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized void a(android.content.Context r2, java.lang.String r3) {
            java.lang.Class<cn.jpush.android.d.c> r0 = cn.jpush.android.d.c.class
            monitor-enter(r0)
            if (r2 != 0) goto L10
            java.lang.String r2 = "MsgQueueUtils"
            java.lang.String r3 = "unexcepted , context is null"
            cn.jpush.android.helper.Logger.w(r2, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r2 = move-exception
            goto L2f
        L10:
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L1f
            java.lang.String r2 = "MsgQueueUtils"
            java.lang.String r3 = "can't get files dir"
            cn.jpush.android.helper.Logger.w(r2, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L1f:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Le
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Le
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L2d
            r1.delete()     // Catch: java.lang.Throwable -> Le
        L2d:
            monitor-exit(r0)
            return
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    private static synchronized void a(android.content.Context r3, java.lang.String r4, java.util.ArrayList<cn.jpush.android.d.a> r5) {
            java.lang.Class<cn.jpush.android.d.c> r0 = cn.jpush.android.d.c.class
            monitor-enter(r0)
            java.lang.String r1 = "MsgQueueUtils"
            java.lang.String r2 = "Action - saveObjects"
            cn.jpush.android.helper.Logger.v(r1, r2)     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L17
            java.lang.String r3 = "MsgQueueUtils"
            java.lang.String r4 = "unexcepted , context is null"
            cn.jpush.android.helper.Logger.w(r3, r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L15:
            r3 = move-exception
            goto L71
        L17:
            if (r5 != 0) goto L22
            java.lang.String r3 = "MsgQueueUtils"
            java.lang.String r4 = "mObjectList is null"
            cn.jpush.android.helper.Logger.w(r3, r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L22:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L47
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L47
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L47
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            r4 = 0
        L31:
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L47
            if (r4 >= r2) goto L49
            java.lang.Object r2 = r5.get(r4)     // Catch: java.lang.Throwable -> L47
            cn.jpush.android.d.a r2 = (cn.jpush.android.d.a) r2     // Catch: java.lang.Throwable -> L47
            org.json.JSONObject r2 = r2.a()     // Catch: java.lang.Throwable -> L47
            r3.put(r2)     // Catch: java.lang.Throwable -> L47
            int r4 = r4 + 1
            goto L31
        L47:
            r3 = move-exception
            goto L55
        L49:
            java.lang.String r4 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L47
            cn.jpush.android.ad.c.a(r4, r3)     // Catch: java.lang.Throwable -> L47
            goto L6f
        L55:
            java.lang.String r4 = "MsgQueueUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r5.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "save Objects  error:"
            r5.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L15
            r5.append(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L15
            cn.jpush.android.helper.Logger.ww(r4, r3)     // Catch: java.lang.Throwable -> L15
        L6f:
            monitor-exit(r0)
            return
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public static boolean a(android.content.Context r6, cn.jpush.android.d.a r7) {
            java.util.Queue<cn.jpush.android.d.a> r0 = cn.jpush.android.d.c.a
            java.lang.String r1 = "msg_queue_v350"
            java.lang.String r2 = "MsgQueueUtils"
            if (r0 != 0) goto L4a
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            cn.jpush.android.d.c.a = r0
            java.util.ArrayList r0 = b(r6, r1)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L4a
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L4a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L31
        L1f:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> L31
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> L31
            cn.jpush.android.d.a r3 = (cn.jpush.android.d.a) r3     // Catch: java.lang.Exception -> L31
            java.util.Queue<cn.jpush.android.d.a> r4 = cn.jpush.android.d.c.a     // Catch: java.lang.Exception -> L31
            r4.offer(r3)     // Catch: java.lang.Exception -> L31
            goto L1f
        L31:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "init lastMsgQueue failed:"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jpush.android.helper.Logger.ww(r2, r0)
        L4a:
            r0 = 0
            if (r6 != 0) goto L53
            java.lang.String r6 = "#unexcepted - context was null"
            cn.jpush.android.helper.Logger.ww(r2, r6)
            return r0
        L53:
            if (r7 != 0) goto L5a
            java.lang.String r3 = "#unexcepted - entityKey was null"
            cn.jpush.android.helper.Logger.ww(r2, r3)
        L5a:
            java.util.Queue<cn.jpush.android.d.a> r3 = cn.jpush.android.d.c.a
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L78
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Duplicated msg. Give up processing - "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jpush.android.helper.Logger.e(r2, r6)
            r6 = 1
            return r6
        L78:
            java.util.Queue<cn.jpush.android.d.a> r3 = cn.jpush.android.d.c.a
            int r3 = r3.size()
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 < r4) goto L87
            java.util.Queue<cn.jpush.android.d.a> r3 = cn.jpush.android.d.c.a
            r3.poll()
        L87:
            java.util.Queue<cn.jpush.android.d.a> r3 = cn.jpush.android.d.c.a
            r3.offer(r7)
            java.util.ArrayList r3 = b(r6, r1)     // Catch: java.lang.Exception -> L98
            if (r3 != 0) goto L9a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L98
            r3.<init>()     // Catch: java.lang.Exception -> L98
            goto L9a
        L98:
            r6 = move-exception
            goto Lac
        L9a:
            int r4 = r3.size()     // Catch: java.lang.Exception -> L98
            r5 = 50
            if (r4 < r5) goto La5
            r3.remove(r0)     // Catch: java.lang.Exception -> L98
        La5:
            r3.add(r7)     // Catch: java.lang.Exception -> L98
            a(r6, r1, r3)     // Catch: java.lang.Exception -> L98
            goto Lc4
        Lac:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "msg save in sp failed:"
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jpush.android.helper.Logger.ww(r2, r6)
        Lc4:
            return r0
    }

    private static synchronized java.util.ArrayList<cn.jpush.android.d.a> b(android.content.Context r7, java.lang.String r8) {
            java.lang.Class<cn.jpush.android.d.c> r0 = cn.jpush.android.d.c.class
            monitor-enter(r0)
            r1 = 0
            if (r7 != 0) goto L11
            java.lang.String r7 = "MsgQueueUtils"
            java.lang.String r8 = "unexcepted , context is null"
            cn.jpush.android.helper.Logger.w(r7, r8)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        Lf:
            r7 = move-exception
            goto L74
        L11:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L49
            java.io.File r4 = r7.getFilesDir()     // Catch: java.lang.Throwable -> L49
            r3.<init>(r4, r8)     // Catch: java.lang.Throwable -> L49
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L4b
            java.lang.String r3 = cn.jpush.android.ad.c.c(r3)     // Catch: java.lang.Throwable -> L49
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L4b
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L49
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L49
            r3 = 0
        L35:
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L49
            if (r3 >= r5) goto L4b
            org.json.JSONObject r5 = r4.getJSONObject(r3)     // Catch: java.lang.Throwable -> L49
            cn.jpush.android.d.a r5 = cn.jpush.android.d.a.a(r5)     // Catch: java.lang.Throwable -> L49
            r2.add(r5)     // Catch: java.lang.Throwable -> L49
            int r3 = r3 + 1
            goto L35
        L49:
            r3 = move-exception
            goto L4f
        L4b:
            cn.jpush.android.ad.m.a(r1)     // Catch: java.lang.Throwable -> Lf
            goto L6d
        L4f:
            java.lang.String r4 = "MsgQueueUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r5.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = "load objects error:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L6f
            r5.append(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L6f
            cn.jpush.android.helper.Logger.w(r4, r3)     // Catch: java.lang.Throwable -> L6f
            a(r7, r8)     // Catch: java.lang.Throwable -> L6f
            goto L4b
        L6d:
            monitor-exit(r0)
            return r2
        L6f:
            r7 = move-exception
            cn.jpush.android.ad.m.a(r1)     // Catch: java.lang.Throwable -> Lf
            throw r7     // Catch: java.lang.Throwable -> Lf
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
    }
}
