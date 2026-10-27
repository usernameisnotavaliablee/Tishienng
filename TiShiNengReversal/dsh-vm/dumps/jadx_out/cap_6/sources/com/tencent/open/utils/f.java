package com.tencent.open.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    private java.lang.String a;
    private java.lang.String b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.tencent.open.utils.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static com.tencent.open.utils.f a;

        static {
                com.tencent.open.utils.f r0 = new com.tencent.open.utils.f
                r1 = 0
                r0.<init>(r1)
                com.tencent.open.utils.f.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.tencent.open.utils.f a() {
                com.tencent.open.utils.f r0 = com.tencent.open.utils.f.a.a
                return r0
        }
    }

    private f() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.b = r0
            return
    }

    /* synthetic */ f(com.tencent.open.utils.f.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tencent.open.utils.f a() {
            com.tencent.open.utils.f r0 = com.tencent.open.utils.f.a.a()
            return r0
    }

    public void a(android.content.Context r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L49
        L3:
            java.lang.String r0 = "device_info_file"
            r1 = 4
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r0, r1)
            java.lang.String r0 = r4.b
            java.lang.String r1 = "openSDK_LOG.DeviceInfoUtils"
            java.lang.String r2 = ""
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3a
        L1c:
            java.lang.String r0 = "build_model"
            java.lang.String r0 = r5.getString(r0, r2)
            r4.b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "init, model = "
            r0.append(r3)
            java.lang.String r3 = r4.b
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.open.log.SLog.i(r1, r0)
        L3a:
            java.lang.String r0 = r4.a
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L49
            goto L4a
        L49:
            return
        L4a:
            java.lang.String r0 = "build_device"
            java.lang.String r5 = r5.getString(r0, r2)
            r4.a = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "init, device = "
            r5.append(r0)
            java.lang.String r0 = r4.a
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.open.log.SLog.i(r1, r5)
            return
    }

    public void a(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setBuildModel, model = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.DeviceInfoUtils"
            com.tencent.open.log.SLog.i(r1, r0)
            java.lang.String r0 = "build_model"
            r2 = 4
            java.lang.String r3 = "device_info_file"
            if (r7 == 0) goto L53
            java.lang.String r4 = r7.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L28
            goto L53
        L28:
            java.lang.String r4 = r5.b
            if (r4 == 0) goto L38
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L38
            java.lang.String r6 = "setBuildModel, needn't update sp."
            com.tencent.open.log.SLog.i(r1, r6)
            return
        L38:
            r5.b = r7
            if (r6 == 0) goto L68
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r7 = r5.b
            android.content.SharedPreferences$Editor r6 = r6.putString(r0, r7)
            r6.commit()
            java.lang.String r6 = "setBuildModel, update sp."
            com.tencent.open.log.SLog.i(r1, r6)
            return
        L53:
            java.lang.String r7 = ""
            r5.b = r7
            if (r6 == 0) goto L68
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r6 = r6.remove(r0)
            r6.commit()
        L68:
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String b(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = r0.a
            return r1
    }

    public java.lang.String c(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = r0.b
            return r1
    }
}
