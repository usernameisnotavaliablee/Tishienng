package com.bxkj.student.home;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static volatile com.bxkj.student.home.a b;
    private final java.lang.String a;

    private a() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "groupType"
            r1.a = r0
            return
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> a() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "理论考试"
            java.lang.String r3 = "name"
            r1.put(r3, r2)
            java.lang.String r2 = "icon_1_7"
            java.lang.String r4 = "icon"
            r1.put(r4, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "type"
            r1.put(r5, r2)
            r6 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "groupType"
            r1.put(r7, r6)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r8 = "查看点名"
            r1.put(r3, r8)
            java.lang.String r8 = "icon_1_3"
            r1.put(r4, r8)
            r1.put(r5, r2)
            r1.put(r7, r6)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "查看"
            r8.append(r9)
            com.bxkj.base.user.LoginUser r9 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r9 = r9.getViewAfterLabelName()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r1.put(r3, r8)
            java.lang.String r8 = "icon_1_1"
            r1.put(r4, r8)
            r1.put(r5, r2)
            r1.put(r7, r6)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r8 = "上课请假"
            r1.put(r3, r8)
            java.lang.String r8 = "icon_1_5"
            r1.put(r4, r8)
            r1.put(r5, r2)
            r1.put(r7, r6)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r8 = "App跑步"
            r1.put(r3, r8)
            java.lang.String r8 = "icon_4_1"
            r1.put(r4, r8)
            r1.put(r5, r2)
            r1.put(r7, r6)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r8 = "预约场馆"
            r1.put(r3, r8)
            java.lang.String r8 = "icon_5_1"
            r1.put(r4, r8)
            r1.put(r5, r2)
            r1.put(r7, r6)
            r0.add(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r8 = "体测计算器"
            r1.put(r3, r8)
            java.lang.String r3 = "icon_2_7"
            r1.put(r4, r3)
            r1.put(r5, r2)
            r1.put(r7, r6)
            r0.add(r1)
            return r0
    }

    public static com.bxkj.student.home.a b() {
            com.bxkj.student.home.a r0 = com.bxkj.student.home.a.b
            if (r0 != 0) goto L19
            java.lang.Class<com.bxkj.student.home.a> r0 = com.bxkj.student.home.a.class
            monitor-enter(r0)
            com.bxkj.student.home.a r1 = com.bxkj.student.home.a.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bxkj.student.home.a r1 = new com.bxkj.student.home.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bxkj.student.home.a.b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bxkj.student.home.a r0 = com.bxkj.student.home.a.b
            return r0
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> d() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.bluemobi.dylan.sqlitelibrary.c r1 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            java.lang.Class<com.bxkj.student.common.db.HomeMenuDB> r2 = com.bxkj.student.common.db.HomeMenuDB.class
            java.util.List r1 = r1.query(r2)
            if (r1 == 0) goto L7e
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()
            com.bxkj.student.common.db.HomeMenuDB r2 = (com.bxkj.student.common.db.HomeMenuDB) r2
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getIsOpenKeep()
            if (r3 != 0) goto L38
            java.lang.String r3 = r2.getMenuName()
            java.lang.String r4 = "绑定Keep账号"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L38
            goto L15
        L38:
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getIsOpenKeep()
            if (r3 != 0) goto L4f
            java.lang.String r3 = r2.getMenuName()
            java.lang.String r4 = "同步Keep数据"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            goto L15
        L4f:
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r5 = r2.getMenuName()
            r3.put(r4, r5)
            java.lang.String r4 = "icon"
            java.lang.String r2 = r2.getIconResName()
            r3.put(r4, r2)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "type"
            r3.put(r4, r2)
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "groupType"
            r3.put(r4, r2)
            r0.add(r3)
            goto L15
        L7e:
            return r0
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c() {
            r2 = this;
            java.util.List r0 = r2.d()
            int r1 = r0.size()
            if (r1 != 0) goto Le
            java.util.List r0 = r2.a()
        Le:
            return r0
    }
}
